package org.itworks.clicknbuild.config.stats.buidling;

public class HeadquarterStats extends BuildingStats {
    private static final HeadquarterStats INST = new HeadquarterStats();

    private HeadquarterStats() {
    }

    public static HeadquarterStats inst() {
        return INST;
    }
}
