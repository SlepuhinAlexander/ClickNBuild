package org.itworks.clicknbuild.config.stats.buidling;

public final class NuclearPlantStats extends BuildingStats {
    private static final NuclearPlantStats INST = new NuclearPlantStats();

    private NuclearPlantStats() {
    }

    public static NuclearPlantStats inst() {
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
