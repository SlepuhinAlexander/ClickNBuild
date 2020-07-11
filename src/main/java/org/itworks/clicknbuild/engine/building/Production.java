package org.itworks.clicknbuild.engine.building;

import org.itworks.clicknbuild.config.stats.ResStatPack;
import org.itworks.clicknbuild.engine.profile.ProfileManager;
import org.itworks.clicknbuild.engine.res.ResCalculator;
import org.itworks.clicknbuild.engine.res.ResChunk;
import org.itworks.clicknbuild.engine.res.ResPack;
import org.itworks.clicknbuild.util.math.MathHelper;

public final class Production extends BuildingAttribute {
    private BuildingType usedType;
    private int usedLevel;

    @Override
    protected void initValues(BuildingType type, int level) {
        pack.clear();
        ResStatPack stats = ResCalculator.mul(type.stats.getStats()[level - 1].get(BuildingAttrType.PRODUCTION),
                ProfileManager.inst().getProfile().getPreferences().getDifficulty().gainsMultiplier);
        stats.getPack()
                .keySet()
                .forEach(resType -> pack.put(resType, new ResChunk(resType, stats.get(resType))));
        usedType = type;
        usedLevel = level;
    }

    @Override
    protected void applyMultipliers(ResPack multipliers) {
        if (multipliers == null) return;
        initValues(usedType, usedLevel);
        multipliers.pack.forEach((type, resChunk) -> {
            if (resChunk == null) return;
            ResChunk local = pack.get(type);
            if (local == null) return;
            local.setMax(local.getMax() * (1 + resChunk.getCurrent() / 100d));
        });
    }

    @Override
    protected void applyProductivity(double productivity) {
        final double clamped = MathHelper.clamp(productivity, 100d);
        pack.forEach((resType, resChunk) -> resChunk.setCurrent(resChunk.getMax() * clamped / 100d));
    }
}
