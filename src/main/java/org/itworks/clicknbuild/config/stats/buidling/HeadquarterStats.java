package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;
import org.itworks.clicknbuild.engine.model.ResourceType;

public class HeadquarterStats extends BuildingStats {
    private static final HeadquarterStats INST = new HeadquarterStats();

    private HeadquarterStats() {
    }

    public static HeadquarterStats inst() {
        return INST;
    }

    @Override
    protected void initValues() {
        setRequiredPlayerLevel(1);
        setMaxLevel(1);
        setBuildLimit(1);
        setPriceMultiplier(100);
        setBuildCost(null);
        setProduction(new ResourcePack[]{new ResourcePack(
                new ResourceChunk(ResourceType.ENERGY,1000),
                new ResourceChunk(ResourceType.STEEL, 120),
                new ResourceChunk(ResourceType.CONCRETE,400),
                new ResourceChunk(ResourceType.BRICK,300),
                new ResourceChunk(ResourceType.WOOD, 100),
                new ResourceChunk(ResourceType.GLASS, 200),
                new ResourceChunk(ResourceType.MONEY, 1000),
                new ResourceChunk(ResourceType.CITIZEN, 50)
        )});
        setHold(new ResourcePack[]{new ResourcePack(
                new ResourceChunk(ResourceType.POWER_CONSUMPTION, Integer.MAX_VALUE),
                new ResourceChunk(ResourceType.POWER_EXCESS, Integer.MAX_VALUE),
                new ResourceChunk(ResourceType.JOB, Integer.MAX_VALUE),
                new ResourceChunk(ResourceType.UNEMPLOYMENT, Integer.MAX_VALUE),
                new ResourceChunk(ResourceType.BENEFIT, Integer.MAX_VALUE),
                new ResourceChunk(ResourceType.CRIME, Integer.MAX_VALUE),
                new ResourceChunk(ResourceType.EMIGRATION, Integer.MAX_VALUE),
                new ResourceChunk(ResourceType.FIRE_HAZARD, Integer.MAX_VALUE)
        )});
        setStore(new ResourcePack[]{new ResourcePack(
                new ResourceChunk(ResourceType.ENERGY, 500),
                new ResourceChunk(ResourceType.STEEL, 3000),
                new ResourceChunk(ResourceType.CONCRETE, 10000),
                new ResourceChunk(ResourceType.BRICK, 7500),
                new ResourceChunk(ResourceType.WOOD, 2500),
                new ResourceChunk(ResourceType.GLASS, 5000),
                new ResourceChunk(ResourceType.MONEY, 200000),
                new ResourceChunk(ResourceType.CITIZEN, 5000)
        )});
    }
}
