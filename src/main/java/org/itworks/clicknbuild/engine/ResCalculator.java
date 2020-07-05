package org.itworks.clicknbuild.engine;

import org.itworks.clicknbuild.engine.model.ResChunk;
import org.itworks.clicknbuild.engine.model.ResPack;
import org.itworks.clicknbuild.engine.model.ResStatPack;
import org.itworks.clicknbuild.util.math.MathHelper;

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

    public static ResPack toResPack(ResStatPack stats, double percent) {
        if (stats == null) return new ResPack();
        ResPack result = new ResPack();
        final double fraction = MathHelper.clamp(percent, 0d, 100d);
        stats.pack.forEach((type, resStat) -> result
                .put(new ResChunk(type, resStat.getAmount() * fraction, resStat.getAmount())));
        return result;
    }

    public static ResPack toResPack(ResStatPack stats) {
        if (stats == null) return new ResPack();
        ResPack result = new ResPack();
        stats.pack.forEach((type, resStat) -> result.put(new ResChunk(type, resStat.getAmount())));
        return result;
    }

    public static ResPack resPackMaxedBy(ResPack limiter) {
        if (limiter == null) return new ResPack();
        ResPack result = new ResPack();
        limiter.pack.forEach((type, resChunk) -> result.put(new ResChunk(type, 0, resChunk.getCurrent())));
        return result;
    }
}
