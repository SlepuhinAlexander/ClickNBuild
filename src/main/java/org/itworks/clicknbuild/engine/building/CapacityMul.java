package org.itworks.clicknbuild.engine.building;

import org.itworks.clicknbuild.config.stats.ResStatPack;
import org.itworks.clicknbuild.engine.profile.ProfileManager;
import org.itworks.clicknbuild.engine.res.ResCalculator;
import org.itworks.clicknbuild.engine.res.ResChunk;
import org.itworks.clicknbuild.engine.res.ResPack;
import org.itworks.clicknbuild.util.math.MathHelper;

public final class CapacityMul extends BuildingAttribute {
    @Override
    protected void initValues(BuildingType type, int level) {
        pack.clear();
        ResStatPack stats = ResCalculator.mul(type.stats.getStats()[level - 1].get(BuildingAttrType.CAPACITY_MUL),
                ProfileManager.inst().getProfile().getPreferences().getDifficulty().gainsMultiplier);
        stats.getPack()
                .keySet()
                .forEach(resType -> pack.put(resType, new ResChunk(resType, stats.get(resType))));

    }

    @Override
    protected void applyMultipliers(ResPack multipliers) {

    }

    @Override
    protected void applyProductivity(double productivity) {
        final double clamped = MathHelper.clamp(productivity, 100d);
        pack.forEach((resType, resChunk) -> resChunk.setCurrent(resChunk.getMax() * clamped / 100d));
    }
}
