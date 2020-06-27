package org.itworks.clicknbuild.config.stats.buidling;

public final class AirportStats extends BuildingStats {
    private static final AirportStats INST = new AirportStats();

    private AirportStats() {
    }

    public static AirportStats inst() {
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
