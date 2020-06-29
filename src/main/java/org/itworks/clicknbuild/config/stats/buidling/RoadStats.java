package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResChunk;
import org.itworks.clicknbuild.engine.model.ResPack;
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
        setBuildCost(new ResPack[]{new ResPack(
                new ResChunk(ResType.CONSTRUCTION, 500),
                new ResChunk(ResType.CONCRETE, 50),
                new ResChunk(ResType.MONEY, 500))});
    }
}
