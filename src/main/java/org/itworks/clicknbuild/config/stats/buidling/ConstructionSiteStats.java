package org.itworks.clicknbuild.config.stats.buidling;

public final class ConstructionSiteStats extends BuildingStats {
    private static final ConstructionSiteStats INST = new ConstructionSiteStats();

    private ConstructionSiteStats() {
    }

    public static ConstructionSiteStats inst() {
        return INST;
    }

    @Override
    protected void initValues() {
        setRequiredPlayerLevel(1);
        setMaxLevel(20);
        setBuildLimit(1);
        setPriceMultiplier(100);
    }
}
