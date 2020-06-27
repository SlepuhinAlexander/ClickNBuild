package org.itworks.clicknbuild.config.stats.buidling;

public final class EngineeringCenterStats extends BuildingStats {
    private static final EngineeringCenterStats INST = new EngineeringCenterStats();

    private EngineeringCenterStats() {
    }

    public static EngineeringCenterStats inst() {
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
