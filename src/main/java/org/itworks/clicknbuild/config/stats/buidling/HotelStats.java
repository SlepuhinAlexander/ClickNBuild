package org.itworks.clicknbuild.config.stats.buidling;

public final class HotelStats extends BuildingStats {
    private static final HotelStats INST = new HotelStats();

    private HotelStats() {
    }

    public static HotelStats inst() {
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
