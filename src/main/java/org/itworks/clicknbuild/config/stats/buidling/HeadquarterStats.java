package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResStat;
import org.itworks.clicknbuild.engine.model.ResStatPack;
import org.itworks.clicknbuild.engine.model.ResType;

public class HeadquarterStats extends BuildingStats {
    private static volatile HeadquarterStats inst;

    private HeadquarterStats() {
    }

    public static HeadquarterStats inst() {
        HeadquarterStats local = inst;
        if (local == null) {
            synchronized (HeadquarterStats.class) {
                local = inst;
                if (local == null) {
                    inst = local = new HeadquarterStats();
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
        setBuildCost(null);
        setProduction(new ResStatPack[]{new ResStatPack(
                new ResStat(ResType.ENERGY,1000),
                new ResStat(ResType.STEEL, 120),
                new ResStat(ResType.CONCRETE,400),
                new ResStat(ResType.BRICK,300),
                new ResStat(ResType.WOOD, 100),
                new ResStat(ResType.GLASS, 200),
                new ResStat(ResType.MONEY, 1000),
                new ResStat(ResType.CITIZEN, 50)
        )});
        setHold(new ResStatPack[]{new ResStatPack(
                new ResStat(ResType.POWER_CONSUMPTION, Integer.MAX_VALUE),
                new ResStat(ResType.POWER_EXCESS, Integer.MAX_VALUE),
                new ResStat(ResType.JOB, Integer.MAX_VALUE),
                new ResStat(ResType.UNEMPLOYMENT, Integer.MAX_VALUE),
                new ResStat(ResType.BENEFIT, Integer.MAX_VALUE),
                new ResStat(ResType.CRIME, Integer.MAX_VALUE),
                new ResStat(ResType.EMIGRATION, Integer.MAX_VALUE),
                new ResStat(ResType.FIRE_HAZARD, Integer.MAX_VALUE)
        )});
        setStore(new ResStatPack[]{new ResStatPack(
                new ResStat(ResType.ENERGY, 500),
                new ResStat(ResType.STEEL, 3000),
                new ResStat(ResType.CONCRETE, 10000),
                new ResStat(ResType.BRICK, 7500),
                new ResStat(ResType.WOOD, 2500),
                new ResStat(ResType.GLASS, 5000),
                new ResStat(ResType.MONEY, 200000),
                new ResStat(ResType.CITIZEN, 5000)
        )});
    }
}
