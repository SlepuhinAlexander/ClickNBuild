package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResChunk;
import org.itworks.clicknbuild.engine.model.ResPack;
import org.itworks.clicknbuild.engine.model.ResType;

public final class CityPlanningStats extends BuildingStats {
    private static volatile CityPlanningStats inst;

    private CityPlanningStats() {
    }

    public static CityPlanningStats inst() {
        CityPlanningStats local = inst;
        if (local == null) {
            synchronized (CityPlanningStats.class) {
                local = inst;
                if (local == null) {
                    inst = local = new CityPlanningStats();
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
        setBuildLimit(1);
        setPriceMultiplier(100);
        setStructure(new int[]{10000});
        setBuildCost(new ResPack[]{new ResPack(
                new ResChunk(ResType.CONSTRUCTION, 10000),
                new ResChunk(ResType.STEEL, 4320),
                new ResChunk(ResType.CONCRETE, 14400),
                new ResChunk(ResType.MONEY, 540000)
        )});
        setDemand(new ResPack[]{new ResPack(
                new ResChunk(ResType.UPKEEP, 1800),
                new ResChunk(ResType.POWER_CONSUMPTION, 150),
                new ResChunk(ResType.JOB, 3000),
                new ResChunk(ResType.IGNITABILITY, 1)
        )});
        setHold(new ResPack[]{new ResPack(
                new ResChunk(ResType.POWER, 150),
                new ResChunk(ResType.WORKER, 3000)
        )});
    }
}
