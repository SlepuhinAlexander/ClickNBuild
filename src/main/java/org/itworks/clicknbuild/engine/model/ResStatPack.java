package org.itworks.clicknbuild.engine.model;

import org.itworks.clicknbuild.config.stats.model.ResStatModel;
import org.itworks.clicknbuild.config.stats.model.ResStatPackModel;

import java.util.Collection;
import java.util.TreeMap;

@SuppressWarnings("UnusedReturnValue")
public final class ResStatPack {
    public final TreeMap<ResType, ResStat> pack = new TreeMap<>();

    public ResStatPack() {
    }

    public ResStatPack(ResStat... resources) {
        if (resources == null) return;
        add(resources);
    }

    public ResStatPack(Collection<ResStat> resources) {
        if (resources == null) return;
        add(resources);
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

    public ResStatPack add(ResType type, double amount) {
        if (type == null) return this;
        return add(new ResStat(type, amount));
    }

    public ResStatPack add(ResStat res) {
        if (res == null) return this;
        ResStat stat = pack.get(res.type);
        if (stat == null) {
            pack.put(res.type, res);
        } else {
            stat.add(res.getAmount());
        }
        cleanup();
        return this;
    }

    public ResStatPack add(ResStat... resources) {
        if (resources == null) return this;
        for (ResStat res : resources) add(res);
        return this;
    }

    public ResStatPack add(Collection<ResStat> resources) {
        if (resources == null) return this;
        for (ResStat res : resources) add(res);
        return this;
    }

    public ResStatPack add(ResStatPack pack) {
        if (pack == null) return this;
        return add(pack.pack.values());
    }

    public ResStatPack sub(ResType type, double amount) {
        if (type == null) return this;
        return sub(new ResStat(type, amount));
    }

    public ResStatPack sub(ResStat res) {
        if (res == null) return this;
        ResStat stat = pack.get(res.type);
        if (stat != null) stat.sub(res.getAmount());
        cleanup();
        return this;
    }

    public ResStatPack sub(ResStat... resources) {
        if (resources == null) return this;
        for (ResStat res : resources) sub(res);
        return this;
    }

    public ResStatPack sub(Collection<ResStat> resources) {
        if (resources == null) return this;
        for (ResStat res : resources) sub(res);
        return this;
    }

    public ResStatPack sub(ResStatPack pack) {
        if (pack == null) return this;
        return sub(pack.pack.values());
    }

    public ResStatPack mul(double multiplier) {
        Collection<ResStat> resources = pack.values();
        for (ResStat res : resources) res.mul(multiplier);
        cleanup();
        return this;
    }

    private void cleanup() {
        pack.entrySet().removeIf(res -> res.getValue().getAmount() <= 0);
    }

    public ResStatPack copy() {
        ResStatPack result = new ResStatPack();
        pack.values().forEach(res -> result.add(res.copy()));
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
