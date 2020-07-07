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
}
