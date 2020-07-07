package org.itworks.clicknbuild.engine.building;

import org.itworks.clicknbuild.engine.res.ResChunk;
import org.itworks.clicknbuild.engine.res.ResPack;

public final class Store extends BuildingAttribute {
    @Override
    protected void initValues(BuildingType type, int level) {
        pack.clear();
    }

    protected void initValues(BuildingAttribute limiter) {
        if (limiter == null) return;
        limiter.pack.keySet().forEach(resType -> pack.put(resType, new ResChunk(resType, 0,
                limiter.pack.get(resType).getCurrent())));
    }

    @Override
    protected void applyMultipliers(ResPack multipliers) {

    }

    @Override
    protected void applyProductivity(double productivity) {

    }

    protected void updateCapacity(BuildingAttribute limiter) {
        if (limiter == null) return;
        limiter.pack.forEach((resType, resChunk) -> pack.get(resType).setMax(resChunk.getCurrent()));
    }
}
