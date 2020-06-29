package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;
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
        setBuildCost(new ResourcePack[]{new ResourcePack(
                new ResourceChunk(ResType.CONSTRUCTION, 10000),
                new ResourceChunk(ResType.STEEL, 4320),
                new ResourceChunk(ResType.CONCRETE, 14400),
                new ResourceChunk(ResType.MONEY, 540000)
        )});
        setDemand(new ResourcePack[]{new ResourcePack(
                new ResourceChunk(ResType.UPKEEP, 1800),
                new ResourceChunk(ResType.POWER_CONSUMPTION, 150),
                new ResourceChunk(ResType.JOB, 3000),
                new ResourceChunk(ResType.IGNITABILITY, 1)
        )});
        setHold(new ResourcePack[]{new ResourcePack(
                new ResourceChunk(ResType.POWER, 150),
                new ResourceChunk(ResType.WORKER, 3000)
        )});
    }
}
