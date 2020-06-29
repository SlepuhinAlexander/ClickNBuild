package org.itworks.clicknbuild.config.stats.model;

import org.itworks.clicknbuild.engine.model.ResChunk;
import org.itworks.clicknbuild.engine.model.ResPack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ResPackModel {
    private List<ResChunkModel> pack = new ArrayList<>();

    public static ResPackModel valueOf(ResPack value) {
        if (value == null) return null;
        ResPackModel result = new ResPackModel();
        Collection<ResChunk> resources = value.pack.values();
        for (ResChunk res : resources) result.pack.add(ResChunkModel.valueOf(res));
        return result;
    }

    public static ResPackModel[] valueOf(ResPack... values) {
        if (values == null) return null;
        ResPackModel[] result = new ResPackModel[values.length];
        for (int i = 0; i < values.length; i++) {
            result[i] = valueOf(values[i]);
        }
        return result;
    }

    public List<ResChunkModel> getPack() {
        return pack;
    }

    public void setPack(List<ResChunkModel> pack) {
        this.pack = pack;
    }
}
