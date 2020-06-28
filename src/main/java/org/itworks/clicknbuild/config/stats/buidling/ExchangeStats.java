package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;
import org.itworks.clicknbuild.engine.model.ResourceType;

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
        setStructure(new int[]{9000});
        setBuildCost(new ResourcePack[]{new ResourcePack(
                new ResourceChunk(ResourceType.CONSTRUCTION, 9000),
                new ResourceChunk(ResourceType.STEEL, 4500),
                new ResourceChunk(ResourceType.CONCRETE, 15000),
                new ResourceChunk(ResourceType.BRICK, 11250),
                new ResourceChunk(ResourceType.WOOD, 3750),
                new ResourceChunk(ResourceType.GLASS, 7500),
                new ResourceChunk(ResourceType.MONEY, 450000)
        )});
        setDemand(new ResourcePack[]{new ResourcePack(
                new ResourceChunk(ResourceType.POWER_CONSUMPTION, 100),
                new ResourceChunk(ResourceType.JOB, 2000),
                new ResourceChunk(ResourceType.IGNITABILITY, 1)
        )});
        setHold(new ResourcePack[]{new ResourcePack(
                new ResourceChunk(ResourceType.POWER, 100),
                new ResourceChunk(ResourceType.WORKER, 2000)
        )});
    }
}
