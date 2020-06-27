package org.itworks.clicknbuild.config.stats.buidling;

public final class BankStats extends BuildingStats {
    private static final BankStats INST = new BankStats();

    private BankStats() {
    }

    public static BankStats inst() {
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
