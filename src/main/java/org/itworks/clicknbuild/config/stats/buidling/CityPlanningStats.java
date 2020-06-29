package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResStat;
import org.itworks.clicknbuild.engine.model.ResStatPack;
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
        setBuildCost(new ResStatPack[]{new ResStatPack(
                new ResStat(ResType.CONSTRUCTION, 10000),
                new ResStat(ResType.STEEL, 4320),
                new ResStat(ResType.CONCRETE, 14400),
                new ResStat(ResType.MONEY, 540000)
        )});
        setDemand(new ResStatPack[]{new ResStatPack(
                new ResStat(ResType.UPKEEP, 1800),
                new ResStat(ResType.POWER_CONSUMPTION, 150),
                new ResStat(ResType.JOB, 3000),
                new ResStat(ResType.IGNITABILITY, 1)
        )});
        setHold(new ResStatPack[]{new ResStatPack(
                new ResStat(ResType.POWER, 150),
                new ResStat(ResType.WORKER, 3000)
        )});
    }
}
