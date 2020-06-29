package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;
import org.itworks.clicknbuild.engine.model.ResourceType;

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
        setBuildCost(new ResourcePack[]{new ResourcePack(
                new ResourceChunk(ResourceType.CONSTRUCTION, 500),
                new ResourceChunk(ResourceType.CONCRETE, 50),
                new ResourceChunk(ResourceType.MONEY, 500))});
    }
}
