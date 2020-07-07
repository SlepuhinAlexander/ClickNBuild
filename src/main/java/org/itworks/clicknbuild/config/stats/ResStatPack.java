package org.itworks.clicknbuild.config.stats;

import org.itworks.clicknbuild.engine.res.ResType;

import java.util.Collection;
import java.util.Objects;
import java.util.TreeMap;

/**
 * A collection of {@link ResStat}-s with useful aggregation and retrieval methods.
 * Represents some price, cost, reward, need, ets, that an in-game building may provide or require.
 * Any {@link ResType} might present here only once.
 * {@link ResType}-s with zero amounts are automatically cleared out from the collection.
 * If a {@link ResType} is not found in this collection, the returned value is 0, not null.
 * Among else, used as a {@link BuildingDefAttr}. In this role is nullable meaning that a building does not use such
 * attribute at all.
 */
@SuppressWarnings("UnusedReturnValue")
public class ResStatPack {
    private TreeMap<ResType, ResStat> pack = new TreeMap<>();

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

    public TreeMap<ResType, ResStat> getPack() {
        return pack;
    }

    public void setPack(TreeMap<ResType, ResStat> pack) {
        this.pack = Objects.requireNonNull(pack);
    }

    public ResStatPack add(ResType type, double amount) {
        if (type == null) return this;
        return add(new ResStat(type, amount));
    }

    public ResStatPack add(ResStat res) {
        if (res == null) return this;
        ResStat stat = pack.get(res.getType());
        if (stat == null) {
            pack.put(res.getType(), res);
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
        ResStat stat = pack.get(res.getType());
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
