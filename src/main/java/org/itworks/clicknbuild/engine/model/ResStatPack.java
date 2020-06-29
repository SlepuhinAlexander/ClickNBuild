package org.itworks.clicknbuild.engine.model;

import org.itworks.clicknbuild.config.stats.model.ResStatModel;
import org.itworks.clicknbuild.config.stats.model.ResStatPackModel;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public final class ResStatPack {
    public final Map<ResType, ResStat> pack = new TreeMap<>();

    public ResStatPack() {
    }

    public ResStatPack(ResStat... resources) {
        if (resources == null) return;
        for (ResStat res : resources) add(res);
    }

    public ResStatPack(Collection<ResStat> resources) {
        if (resources == null) return;
        for (ResStat res : resources) add(res);
    }

    public static ResStatPack valueOf(ResStatPackModel value) {
        if (value == null) return null;
        ResStatPack result = new ResStatPack();
        for (ResStatModel chunkModel : value.getPack()) result.add(ResStat.valueOf(chunkModel));
        return result;
    }

    public static ResStatPack[] valueOf(ResStatPackModel... values) {
        if (values == null) return null;
        ResStatPack[] result = new ResStatPack[values.length];
        for (int i = 0; i < values.length; i++) {
            result[i] = valueOf(values[i]);
        }
        return result;
    }

    public void add(ResType type, double amount) {
        if (type == null) return;
        add(new ResStat(type, amount));
    }

    public void add(ResStat res) {
        if (res == null) return;
        ResStat chunk = pack.get(res.type);
        if (chunk == null) {
            pack.put(res.type, res);
        } else {
            chunk.add(res.getAmount());
        }
        cleanup();
    }

    public void add(ResStat... resources) {
        if (resources == null) return;
        for (ResStat res : resources) add(res);
    }

    public void add(Collection<ResStat> resources) {
        if (resources == null) return;
        for (ResStat res : resources) add(res);
    }

    public void add(ResStatPack pack) {
        if (pack == null) return;
        Collection<ResStat> resources = pack.pack.values();
        for (ResStat res : resources) add(res);
    }

    public void sub(ResType type, double amount) {
        if (type == null) return;
        sub(new ResStat(type, amount));
    }

    public void sub(ResStat res) {
        if (res == null) return;
        ResStat chunk = pack.get(res.type);
        if (chunk != null) chunk.sub(res.getAmount());
        cleanup();
    }

    public void sub(ResStat... resources) {
        if (resources == null) return;
        for (ResStat res : resources) sub(res);
    }

    public void sub(Collection<ResStat> resources) {
        if (resources == null) return;
        for (ResStat res : resources) sub(res);
    }

    public void sub(ResStatPack pack) {
        if (pack == null) return;
        Collection<ResStat> resources = pack.pack.values();
        for (ResStat res : resources) sub(res);
    }

    public void mul(double multiplier) {
        Collection<ResStat> resources = pack.values();
        for (ResStat res : resources) res.mul(multiplier);
        cleanup();
    }

    private void cleanup() {
        pack.entrySet().removeIf(res -> res.getValue().getAmount() <= 0);
    }

    public ResStatPack copy() {
        ResStatPack result = new ResStatPack();
        result.add(pack.values());
        return result;
    }

    public double get(ResType type) {
        if (type == null) return 0;
        ResStat res = pack.get(type);
        return res == null ? 0 : res.getAmount();
    }

    public double get(String type) {
        return get(ResType.get(type));
    }
}
