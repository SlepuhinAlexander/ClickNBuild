package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResStat;
import org.itworks.clicknbuild.engine.model.ResStatPack;
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
        setBuildCost(new ResStatPack[]{new ResStatPack(
                new ResStat(ResType.CONSTRUCTION, 9000),
                new ResStat(ResType.STEEL, 4500),
                new ResStat(ResType.CONCRETE, 15000),
                new ResStat(ResType.BRICK, 11250),
                new ResStat(ResType.WOOD, 3750),
                new ResStat(ResType.GLASS, 7500),
                new ResStat(ResType.MONEY, 450000)
        )});
        setDemand(new ResStatPack[]{new ResStatPack(
                new ResStat(ResType.POWER_CONSUMPTION, 100),
                new ResStat(ResType.JOB, 2000),
                new ResStat(ResType.IGNITABILITY, 1)
        )});
        setHold(new ResStatPack[]{new ResStatPack(
                new ResStat(ResType.POWER, 100),
                new ResStat(ResType.WORKER, 2000)
        )});
    }
}
