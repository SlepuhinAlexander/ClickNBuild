package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResChunk;
import org.itworks.clicknbuild.engine.model.ResPack;
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
        setBuildCost(new ResPack[]{new ResPack(
                new ResChunk(ResType.CONSTRUCTION, 9000),
                new ResChunk(ResType.STEEL, 4500),
                new ResChunk(ResType.CONCRETE, 15000),
                new ResChunk(ResType.BRICK, 11250),
                new ResChunk(ResType.WOOD, 3750),
                new ResChunk(ResType.GLASS, 7500),
                new ResChunk(ResType.MONEY, 450000)
        )});
        setDemand(new ResPack[]{new ResPack(
                new ResChunk(ResType.POWER_CONSUMPTION, 100),
                new ResChunk(ResType.JOB, 2000),
                new ResChunk(ResType.IGNITABILITY, 1)
        )});
        setHold(new ResPack[]{new ResPack(
                new ResChunk(ResType.POWER, 100),
                new ResChunk(ResType.WORKER, 2000)
        )});
    }
}
