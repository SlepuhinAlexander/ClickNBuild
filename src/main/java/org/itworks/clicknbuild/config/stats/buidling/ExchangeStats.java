package org.itworks.clicknbuild.config.stats.buidling;

public final class ExchangeStats extends BuildingStats {
    private static final ExchangeStats INST = new ExchangeStats();

    private ExchangeStats() {
    }

    public static ExchangeStats inst() {
        return INST;
    }

    @Override
    protected void initValues() {
        setRequiredPlayerLevel(1);
        setMaxLevel(1);
        setBuildLimit(1);
        setPriceMultiplier(100);
    }
}
