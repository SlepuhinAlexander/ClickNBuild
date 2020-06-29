package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;
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
        setProduction(new ResourcePack[]{new ResourcePack(
                new ResourceChunk(ResType.ENERGY,1000),
                new ResourceChunk(ResType.STEEL, 120),
                new ResourceChunk(ResType.CONCRETE,400),
                new ResourceChunk(ResType.BRICK,300),
                new ResourceChunk(ResType.WOOD, 100),
                new ResourceChunk(ResType.GLASS, 200),
                new ResourceChunk(ResType.MONEY, 1000),
                new ResourceChunk(ResType.CITIZEN, 50)
        )});
        setHold(new ResourcePack[]{new ResourcePack(
                new ResourceChunk(ResType.POWER_CONSUMPTION, Integer.MAX_VALUE),
                new ResourceChunk(ResType.POWER_EXCESS, Integer.MAX_VALUE),
                new ResourceChunk(ResType.JOB, Integer.MAX_VALUE),
                new ResourceChunk(ResType.UNEMPLOYMENT, Integer.MAX_VALUE),
                new ResourceChunk(ResType.BENEFIT, Integer.MAX_VALUE),
                new ResourceChunk(ResType.CRIME, Integer.MAX_VALUE),
                new ResourceChunk(ResType.EMIGRATION, Integer.MAX_VALUE),
                new ResourceChunk(ResType.FIRE_HAZARD, Integer.MAX_VALUE)
        )});
        setStore(new ResourcePack[]{new ResourcePack(
                new ResourceChunk(ResType.ENERGY, 500),
                new ResourceChunk(ResType.STEEL, 3000),
                new ResourceChunk(ResType.CONCRETE, 10000),
                new ResourceChunk(ResType.BRICK, 7500),
                new ResourceChunk(ResType.WOOD, 2500),
                new ResourceChunk(ResType.GLASS, 5000),
                new ResourceChunk(ResType.MONEY, 200000),
                new ResourceChunk(ResType.CITIZEN, 5000)
        )});
    }
}
