package org.itworks.clicknbuild.config.stats.model;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;

import java.util.ArrayList;
import java.util.List;

public class ResourcePackModel {
    private List<ResourceChunkModel> pack = new ArrayList<>();

    public static ResourcePackModel valueOf(ResourcePack value) {
        if (value == null) return null;
        ResourcePackModel result = new ResourcePackModel();
        for (ResourceChunk res : value.pack) result.pack.add(ResourceChunkModel.valueOf(res));
        return result;
    }

    public static ResourcePackModel[] valueOf(ResourcePack... values) {
        if (values == null) return null;
        ResourcePackModel[] result = new ResourcePackModel[values.length];
        for (int i = 0; i < values.length; i++) {
            result[i] = valueOf(values[i]);
        }
        return result;
    }

    public List<ResourceChunkModel> getPack() {
        return pack;
    }

    public void setPack(List<ResourceChunkModel> pack) {
        this.pack = pack;
    }
}
