package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResStat;
import org.itworks.clicknbuild.engine.model.ResStatPack;
import org.itworks.clicknbuild.engine.model.ResType;

public final class RoadStats extends BuildingStats {
    private static volatile RoadStats inst;

    private RoadStats() {
    }

    public static RoadStats inst() {
        RoadStats local = inst;
        if (local == null) {
            synchronized (RoadStats.class) {
                local = inst;
                if (local == null) {
                    inst = local = new RoadStats();
                    local.initArrays();
                    local.initValues();
                }
            }
        }
        return local;
    }

    @Override
    protected void initValues() {
        setRequiredPlayerLevel(1);
        setMaxLevel(1);
        setBuildLimit(1000);
        setPriceMultiplier(105);
        setStructure(new int[]{500});
        setBuildCost(new ResStatPack[]{new ResStatPack(
                new ResStat(ResType.CONSTRUCTION, 500),
                new ResStat(ResType.CONCRETE, 50),
                new ResStat(ResType.MONEY, 500))});
    }
}
