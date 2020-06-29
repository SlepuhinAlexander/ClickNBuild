package org.itworks.clicknbuild.engine;

import org.itworks.clicknbuild.engine.model.ResChunk;
import org.itworks.clicknbuild.engine.model.ResPack;

public final class ResourcePackCalculator {
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
        ResPack result = new ResPack();
        result.mul(multiplier);
        return result;
    }
}
