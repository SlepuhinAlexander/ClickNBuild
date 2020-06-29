package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResChunk;
import org.itworks.clicknbuild.engine.model.ResPack;
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
        setProduction(new ResPack[]{new ResPack(
                new ResChunk(ResType.ENERGY,1000),
                new ResChunk(ResType.STEEL, 120),
                new ResChunk(ResType.CONCRETE,400),
                new ResChunk(ResType.BRICK,300),
                new ResChunk(ResType.WOOD, 100),
                new ResChunk(ResType.GLASS, 200),
                new ResChunk(ResType.MONEY, 1000),
                new ResChunk(ResType.CITIZEN, 50)
        )});
        setHold(new ResPack[]{new ResPack(
                new ResChunk(ResType.POWER_CONSUMPTION, Integer.MAX_VALUE),
                new ResChunk(ResType.POWER_EXCESS, Integer.MAX_VALUE),
                new ResChunk(ResType.JOB, Integer.MAX_VALUE),
                new ResChunk(ResType.UNEMPLOYMENT, Integer.MAX_VALUE),
                new ResChunk(ResType.BENEFIT, Integer.MAX_VALUE),
                new ResChunk(ResType.CRIME, Integer.MAX_VALUE),
                new ResChunk(ResType.EMIGRATION, Integer.MAX_VALUE),
                new ResChunk(ResType.FIRE_HAZARD, Integer.MAX_VALUE)
        )});
        setStore(new ResPack[]{new ResPack(
                new ResChunk(ResType.ENERGY, 500),
                new ResChunk(ResType.STEEL, 3000),
                new ResChunk(ResType.CONCRETE, 10000),
                new ResChunk(ResType.BRICK, 7500),
                new ResChunk(ResType.WOOD, 2500),
                new ResChunk(ResType.GLASS, 5000),
                new ResChunk(ResType.MONEY, 200000),
                new ResChunk(ResType.CITIZEN, 5000)
        )});
    }
}
