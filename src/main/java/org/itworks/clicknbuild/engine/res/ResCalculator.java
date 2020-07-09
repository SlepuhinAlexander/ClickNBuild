package org.itworks.clicknbuild.engine.res;

import org.itworks.clicknbuild.config.stats.ResStatPack;

public final class ResCalculator {
    public static ResStatPack sum(ResStatPack first, ResStatPack second) {
        ResStatPack result = first == null ? new ResStatPack() : first.copy();
        result.add(second);
        return result;
    }

    public static ResStatPack diff(ResStatPack first, ResStatPack second) {
        ResStatPack result = first == null ? new ResStatPack() : first.copy();
        result.sub(second);
        return result;
    }

    public static ResStatPack mul(ResStatPack pack, double multiplier) {
        if (pack == null) return new ResStatPack();
        ResStatPack result = pack.copy();
        result.mul(multiplier);
        return result;
    }

    public static ResPack sum(ResPack first, ResPack second) {
        ResPack result = first == null ? new ResPack() : first.copy();
        result.add(second);
        return result;
    }

    public static ResPack diff(ResPack first, ResPack second) {
        ResPack result = first == null ? new ResPack() : first.copy();
        result.sub(second);
        return result;
    }

    public static ResPack mul(ResPack pack, double multiplier) {
        if (pack == null) return new ResPack();
        ResPack result = pack.copy();
        result.mul(multiplier);
        return result;
    }
}
