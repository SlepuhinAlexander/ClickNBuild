package org.itworks.clicknbuild.engine;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;

public class ResourcePackCalculator {
    public static ResourcePack sum(ResourcePack first, ResourcePack second) {
        ResourcePack result = first == null ? new ResourcePack() : first.copy();
        if (second != null) result.add(second.pack);
        return result;
    }

    public static ResourcePack diff(ResourcePack first, ResourcePack second) {
        ResourcePack result = first == null ? new ResourcePack() : first.copy();
        if (second != null) result.sub(second.pack);
        return result;
    }

    public static ResourcePack mul(ResourcePack pack, double multiplier) {
        if (pack == null) return null;
        ResourcePack result = new ResourcePack();
        for (ResourceChunk res : pack.pack) result.add(res.copy());
        return result;
    }
}
