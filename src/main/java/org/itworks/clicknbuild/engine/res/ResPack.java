package org.itworks.clicknbuild.engine.res;

import org.itworks.clicknbuild.config.stats.ResStat;
import org.itworks.clicknbuild.config.stats.ResStatPack;

import java.util.Collection;
import java.util.concurrent.ConcurrentSkipListMap;

@SuppressWarnings("UnusedReturnValue")
public class ResPack {
    public final ConcurrentSkipListMap<ResType, ResChunk> pack = new ConcurrentSkipListMap<>();


    public ResPack() {
    }

    public ResPack(ResChunk... resources) {
        if (resources == null) return;
        putAll(resources);
    }

    public ResPack(Collection<ResChunk> resources) {
        if (resources == null) return;
        putAll(resources);
    }

    public ResPack put(ResChunk res) {
        if (res == null) return this;
        pack.putIfAbsent(res.type, res);
        return this;
    }

    public ResPack putAll(ResChunk... resources) {
        if (resources == null) return this;
        for (ResChunk res : resources) put(res);
        return this;
    }

    public ResPack putAll(Collection<ResChunk> resources) {
        if (resources == null) return this;
        for (ResChunk res : resources) put(res);
        return this;
    }

    public ResPack remove(ResChunk res) {
        if (res == null) return this;
        pack.remove(res.type);
        return this;
    }

    public ResChunk get(ResType type) {
        return type == null ? null : pack.get(type);
    }

    public double getCurrent(ResType type) {
        ResChunk res = get(type);
        return res == null ? 0 : res.getCurrent();
    }

    public double getMax(ResType type) {
        ResChunk res = get(type);
        return res == null ? 0 : res.getMax();
    }

    public ResPack setCurrent(ResType type, double value) {
        ResChunk res = get(type);
        if (res == null) return this;
        res.setCurrent(value);
        return this;
    }

    public ResPack setMax(ResType type, double value) {
        ResChunk res = get(type);
        if (res == null) return this;
        res.setMax(value);
        return this;
    }

    public ResPack add(ResType type, double delta) {
        ResChunk res = get(type);
        if (res == null) return this;
        res.add(delta);
        return this;
    }

    public ResPack add(ResStat resStat) {
        if (resStat == null) return this;
        return add(resStat.getType(), resStat.getAmount());
    }

    public ResPack add(ResStat... resources) {
        if (resources == null) return this;
        for (ResStat res : resources) add(res);
        return this;
    }

    public ResPack add(Collection<ResStat> resources) {
        if (resources == null) return this;
        for (ResStat res : resources) add(res);
        return this;
    }

    public ResPack add(ResStatPack pack) {
        if (pack == null) return this;
        return add(pack.getPack().values());
    }

    public ResPack add(ResChunk resChunk) {
        if (resChunk == null) return this;
        return add(resChunk.type, resChunk.getCurrent());
    }

    public ResPack add(ResChunk... resources) {
        if (resources == null) return this;
        for (ResChunk res : resources) add(res);
        return this;
    }

    public ResPack addAll(Collection<ResChunk> resources) {
        if (resources == null) return this;
        for (ResChunk res : resources) add(res);
        return this;
    }

    public ResPack add(ResPack pack) {
        if (pack == null) return this;
        return addAll(pack.pack.values());
    }

    public ResPack sub(ResType type, double delta) {
        ResChunk res = get(type);
        if (res == null) return this;
        res.sub(delta);
        return this;
    }

    public ResPack sub(ResStat resStat) {
        if (resStat == null) return this;
        return sub(resStat.getType(), resStat.getAmount());
    }

    public ResPack sub(ResStat... resources) {
        if (resources == null) return this;
        for (ResStat res : resources) sub(res);
        return this;
    }

    public ResPack sub(Collection<ResStat> resources) {
        if (resources == null) return this;
        for (ResStat res : resources) sub(res);
        return this;
    }

    public ResPack sub(ResStatPack pack) {
        if (pack == null) return this;
        return sub(pack.getPack().values());
    }

    public ResPack sub(ResChunk resChunk) {
        if (resChunk == null) return this;
        return sub(resChunk.type, resChunk.getCurrent());
    }

    public ResPack sub(ResChunk... resources) {
        if (resources == null) return this;
        for (ResChunk res : resources) sub(res);
        return this;
    }

    public ResPack subAll(Collection<ResChunk> resources) {
        if (resources == null) return this;
        for (ResChunk res : resources) sub(res);
        return this;
    }

    public ResPack sub(ResPack pack) {
        if (pack == null) return this;
        return subAll(pack.pack.values());
    }

    public ResPack mul(double multiplier) {
        if (multiplier < 0) return this;
        pack.values().forEach(resChunk -> mul(multiplier));
        return this;
    }

    public ResPack copy() {
        ResPack result = new ResPack();
        pack.values().forEach(res -> result.add(res.copy()));
        return result;
    }
}
