package org.itworks.clicknbuild.engine.model;

import org.itworks.clicknbuild.config.stats.model.ResChunkModel;
import org.itworks.clicknbuild.config.stats.model.ResPackModel;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public final class ResPack {
    public final Map<ResType, ResChunk> pack = new TreeMap<>();

    public ResPack() {
    }

    public ResPack(ResChunk... resources) {
        if (resources == null) return;
        for (ResChunk res : resources) add(res);
    }

    public ResPack(Collection<ResChunk> resources) {
        if (resources == null) return;
        for (ResChunk res : resources) add(res);
    }

    public static ResPack valueOf(ResPackModel value) {
        if (value == null) return null;
        ResPack result = new ResPack();
        for (ResChunkModel chunkModel : value.getPack()) result.add(ResChunk.valueOf(chunkModel));
        return result;
    }

    public static ResPack[] valueOf(ResPackModel... values) {
        if (values == null) return null;
        ResPack[] result = new ResPack[values.length];
        for (int i = 0; i < values.length; i++) {
            result[i] = valueOf(values[i]);
        }
        return result;
    }

    public void add(ResType type, double amount) {
        if (type == null) return;
        add(new ResChunk(type, amount));
    }

    public void add(ResChunk res) {
        if (res == null) return;
        ResChunk chunk = pack.get(res.type);
        if (chunk == null) {
            pack.put(res.type, res);
        } else {
            chunk.add(res.getAmount());
        }
        cleanup();
    }

    public void add(ResChunk... resources) {
        if (resources == null) return;
        for (ResChunk res : resources) add(res);
    }

    public void add(Collection<ResChunk> resources) {
        if (resources == null) return;
        for (ResChunk res : resources) add(res);
    }

    public void add(ResPack pack) {
        if (pack == null) return;
        Collection<ResChunk> resources = pack.pack.values();
        for (ResChunk res : resources) add(res);
    }

    public void sub(ResType type, double amount) {
        if (type == null) return;
        sub(new ResChunk(type, amount));
    }

    public void sub(ResChunk res) {
        if (res == null) return;
        ResChunk chunk = pack.get(res.type);
        if (chunk != null) chunk.sub(res.getAmount());
        cleanup();
    }

    public void sub(ResChunk... resources) {
        if (resources == null) return;
        for (ResChunk res : resources) sub(res);
    }

    public void sub(Collection<ResChunk> resources) {
        if (resources == null) return;
        for (ResChunk res : resources) sub(res);
    }

    public void sub(ResPack pack) {
        if (pack == null) return;
        Collection<ResChunk> resources = pack.pack.values();
        for (ResChunk res : resources) sub(res);
    }

    public void mul(double multiplier) {
        Collection<ResChunk> resources = pack.values();
        for (ResChunk res : resources) sub(res);
    }

    private void cleanup() {
        pack.entrySet().removeIf(res -> res.getValue().getAmount() <= 0);
    }

    public ResPack copy() {
        ResPack result = new ResPack();
        result.add(pack.values());
        return result;
    }

    public double get(ResType type) {
        if (type == null) return 0;
        ResChunk res = pack.get(type);
        return res == null ? 0 : res.getAmount();
    }

    public double get(String type) {
        return get(ResType.get(type));
    }
}
