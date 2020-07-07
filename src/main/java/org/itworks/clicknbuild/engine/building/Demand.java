package org.itworks.clicknbuild.engine.building;

import org.itworks.clicknbuild.config.stats.ResStatPack;
import org.itworks.clicknbuild.engine.profile.ProfileManager;
import org.itworks.clicknbuild.engine.res.ResCalculator;
import org.itworks.clicknbuild.engine.res.ResChunk;
import org.itworks.clicknbuild.engine.res.ResPack;

public final class Demand extends BuildingAttribute {
    @Override
    protected void initValues(BuildingType type, int level) {
        pack.clear();
        ResStatPack stats = ResCalculator.mul(type.stats.getStats()[level - 1].get(BuildingAttrType.DEMAND),
                ProfileManager.inst().getProfile().getPreferences().getDifficulty().costsMultiplier);
        stats.getPack()
                .keySet()
                .forEach(resType -> pack.put(resType, new ResChunk(resType, stats.get(resType), stats.get(resType))));
    }

    @Override
    protected void applyMultipliers(ResPack multipliers) {

    }

    @Override
    protected void applyProductivity(double productivity) {

    }
}
