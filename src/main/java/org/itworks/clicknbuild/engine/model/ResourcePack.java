package org.itworks.clicknbuild.engine.model;

import org.itworks.clicknbuild.config.stats.model.ResourceChunkModel;
import org.itworks.clicknbuild.config.stats.model.ResourcePackModel;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public final class ResourcePack {
    public final Set<ResourceChunk> pack = new TreeSet<>();

    public ResourcePack() {
    }

    public ResourcePack(ResourceChunk... resources) {
        if (resources == null) return;
        for (ResourceChunk res : resources) add(res);
    }

    public ResourcePack(Collection<ResourceChunk> resources) {
        if (resources == null) return;
        for (ResourceChunk res : resources) add(res);
    }

    public static ResourcePack valueOf(ResourcePackModel value) {
        if (value == null) return null;
        ResourcePack result = new ResourcePack();
        for (ResourceChunkModel chunkModel : value.getPack()) result.add(ResourceChunk.valueOf(chunkModel));
        return result;
    }

    public static ResourcePack[] valueOf(ResourcePackModel... values) {
        if (values == null) return null;
        ResourcePack[] result = new ResourcePack[values.length];
        for (int i = 0; i < values.length; i++) {
            result[i] = valueOf(values[i]);
        }
        return result;
    }

    public void add(ResType type, double amount) {
        if (type == null) return;
        add(new ResourceChunk(type, amount));
    }

    public void add(ResourceChunk res) {
        if (res == null) return;
        for (ResourceChunk chunk : pack) {
            if (chunk.type.equals(res.type)) {
                chunk.add(res.getAmount());
                cleanup();
                return;
            }
        }
        pack.add(new ResourceChunk(res.type, res.getAmount()));
        cleanup();
    }

    public void add(ResourceChunk... resources) {
        if (resources == null) return;
        for (ResourceChunk res : resources) add(res);
    }

    public void add(Collection<ResourceChunk> resources) {
        if (resources == null) return;
        for (ResourceChunk res : resources) add(res);
    }

    public void add(ResourcePack pack) {
        if (pack == null) return;
        for (ResourceChunk res : pack.pack) add(res);
    }

    public void sub(ResType type, double amount) {
        if (type == null) return;
        sub(new ResourceChunk(type, amount));
    }

    public void sub(ResourceChunk res) {
        if (res == null) return;
        for (ResourceChunk chunk : pack) {
            if (chunk.type.equals(res.type)) {
                chunk.sub(res.getAmount());
                cleanup();
                return;
            }
        }
    }

    public void sub(ResourceChunk... resources) {
        if (resources == null) return;
        for (ResourceChunk res : resources) sub(res);
    }

    public void sub(Collection<ResourceChunk> resources) {
        if (resources == null) return;
        for (ResourceChunk res : resources) sub(res);
    }

    public void sub(ResourcePack pack) {
        if (pack == null) return;
        for (ResourceChunk res : pack.pack) sub(res);
    }

    private void cleanup() {
        pack.removeIf(resource -> resource.getAmount() <= 0);
    }

    public ResourcePack copy() {
        ResourcePack result = new ResourcePack();
        result.add(pack);
        return result;
    }

    public double get(ResType type) {
        if (type == null) return 0;
        for (ResourceChunk res : pack) if (res.type.equals(type)) return res.getAmount();
        return 0;
    }

    public double get(String type) {
        return get(ResType.get(type));
    }
}
