package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;
import org.itworks.clicknbuild.engine.model.ResType;

public final class ExchangeStats extends BuildingStats {
    private static volatile ExchangeStats inst;

    private ExchangeStats() {
    }

    public static ExchangeStats inst() {
        ExchangeStats local = inst;
        if (local == null) {
            synchronized (ExchangeStats.class) {
                local = inst;
                if (local == null) {
                    inst = local = new ExchangeStats();
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
        setStructure(new int[]{9000});
        setBuildCost(new ResourcePack[]{new ResourcePack(
                new ResourceChunk(ResType.CONSTRUCTION, 9000),
                new ResourceChunk(ResType.STEEL, 4500),
                new ResourceChunk(ResType.CONCRETE, 15000),
                new ResourceChunk(ResType.BRICK, 11250),
                new ResourceChunk(ResType.WOOD, 3750),
                new ResourceChunk(ResType.GLASS, 7500),
                new ResourceChunk(ResType.MONEY, 450000)
        )});
        setDemand(new ResourcePack[]{new ResourcePack(
                new ResourceChunk(ResType.POWER_CONSUMPTION, 100),
                new ResourceChunk(ResType.JOB, 2000),
                new ResourceChunk(ResType.IGNITABILITY, 1)
        )});
        setHold(new ResourcePack[]{new ResourcePack(
                new ResourceChunk(ResType.POWER, 100),
                new ResourceChunk(ResType.WORKER, 2000)
        )});
    }
}
