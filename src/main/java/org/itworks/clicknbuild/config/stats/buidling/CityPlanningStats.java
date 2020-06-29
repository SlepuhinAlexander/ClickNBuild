package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;
import org.itworks.clicknbuild.engine.model.ResourceType;

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
                new ResourceChunk(ResourceType.CONSTRUCTION, 10000),
                new ResourceChunk(ResourceType.STEEL, 4320),
                new ResourceChunk(ResourceType.CONCRETE, 14400),
                new ResourceChunk(ResourceType.MONEY, 540000)
        )});
        setDemand(new ResourcePack[]{new ResourcePack(
                new ResourceChunk(ResourceType.UPKEEP, 1800),
                new ResourceChunk(ResourceType.POWER_CONSUMPTION, 150),
                new ResourceChunk(ResourceType.JOB, 3000),
                new ResourceChunk(ResourceType.IGNITABILITY, 1)
        )});
        setHold(new ResourcePack[]{new ResourcePack(
                new ResourceChunk(ResourceType.POWER, 150),
                new ResourceChunk(ResourceType.WORKER, 3000)
        )});
    }
}
