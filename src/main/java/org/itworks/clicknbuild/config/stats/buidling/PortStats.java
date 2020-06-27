package org.itworks.clicknbuild.config.stats.buidling;

public final class PortStats extends BuildingStats {
    private static final PortStats INST = new PortStats();

    private PortStats() {
    }

    public static PortStats inst() {
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
