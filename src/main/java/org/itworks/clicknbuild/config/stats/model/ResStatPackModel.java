package org.itworks.clicknbuild.config.stats.model;

import org.itworks.clicknbuild.engine.model.ResStat;
import org.itworks.clicknbuild.engine.model.ResStatPack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class ResStatPackModel {
    private List<ResStatModel> pack = new ArrayList<>();

    public static ResStatPackModel valueOf(ResStatPack value) {
        if (value == null) return null;
        ResStatPackModel result = new ResStatPackModel();
        Collection<ResStat> resources = value.pack.values();
        for (ResStat res : resources) result.pack.add(ResStatModel.valueOf(res));
        return result;
    }

    public static ResStatPackModel[] valueOf(ResStatPack... values) {
        if (values == null) return null;
        ResStatPackModel[] result = new ResStatPackModel[values.length];
        for (int i = 0; i < values.length; i++) {
            result[i] = valueOf(values[i]);
        }
        return result;
    }

    public List<ResStatModel> getPack() {
        return pack;
    }

    public void setPack(List<ResStatModel> pack) {
        this.pack = pack;
    }
}
