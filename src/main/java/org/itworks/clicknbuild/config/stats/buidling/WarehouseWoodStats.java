package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;
import org.itworks.clicknbuild.engine.model.ResType;

public final class WarehouseWoodStats extends BuildingStats {
    private static volatile WarehouseWoodStats inst;

    private WarehouseWoodStats() {
    }

    public static WarehouseWoodStats inst() {
        WarehouseWoodStats local = inst;
        if (local == null) {
            synchronized (WarehouseWoodStats.class) {
                local = inst;
                if (local == null) {
                    inst = local = new WarehouseWoodStats();
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
        setMaxLevel(20);
        setBuildLimit(1000);
        setPriceMultiplier(132);
        setStructure(new int[]{
                200, // 1
                600, // 2
                1200, // 3
                2000, // 4
                3000, // 5
                4400, // 6
                6200, // 7
                8400, // 8
                11000, // 9
                14000, // 10
                17600, // 11
                21800, // 12
                26600, // 13
                32000, // 14
                38000, // 15
                44800, // 16
                52400, // 17
                60800, // 18
                70000, // 19
                80000 // 20
        });
        setBuildCost(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.CONSTRUCTION, 200),
                        new ResourceChunk(ResType.STEEL, 102),
                        new ResourceChunk(ResType.CONCRETE, 316),
                        new ResourceChunk(ResType.BRICK, 255),
                        new ResourceChunk(ResType.GLASS, 36),
                        new ResourceChunk(ResType.MONEY, 8160)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.CONSTRUCTION, 600),
                        new ResourceChunk(ResType.STEEL, 310),
                        new ResourceChunk(ResType.CONCRETE, 961),
                        new ResourceChunk(ResType.BRICK, 775),
                        new ResourceChunk(ResType.GLASS, 109),
                        new ResourceChunk(ResType.MONEY, 24800)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.CONSTRUCTION, 1200),
                        new ResourceChunk(ResType.STEEL, 628),
                        new ResourceChunk(ResType.CONCRETE, 1947),
                        new ResourceChunk(ResType.BRICK, 1570),
                        new ResourceChunk(ResType.GLASS, 220),
                        new ResourceChunk(ResType.MONEY, 50240)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.CONSTRUCTION, 2000),
                        new ResourceChunk(ResType.STEEL, 1060),
                        new ResourceChunk(ResType.CONCRETE, 3286),
                        new ResourceChunk(ResType.BRICK, 2650),
                        new ResourceChunk(ResType.GLASS, 371),
                        new ResourceChunk(ResType.MONEY, 84800)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.CONSTRUCTION, 3000),
                        new ResourceChunk(ResType.STEEL, 1610),
                        new ResourceChunk(ResType.CONCRETE, 4991),
                        new ResourceChunk(ResType.BRICK, 4025),
                        new ResourceChunk(ResType.GLASS, 564),
                        new ResourceChunk(ResType.MONEY, 128800)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.CONSTRUCTION, 4400),
                        new ResourceChunk(ResType.STEEL, 2408),
                        new ResourceChunk(ResType.CONCRETE, 7465),
                        new ResourceChunk(ResType.BRICK, 6020),
                        new ResourceChunk(ResType.GLASS, 843),
                        new ResourceChunk(ResType.MONEY, 192640)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.CONSTRUCTION, 6200),
                        new ResourceChunk(ResType.STEEL, 3470),
                        new ResourceChunk(ResType.CONCRETE, 10757),
                        new ResourceChunk(ResType.BRICK, 8675),
                        new ResourceChunk(ResType.GLASS, 1215),
                        new ResourceChunk(ResType.MONEY, 277600)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.CONSTRUCTION, 8400),
                        new ResourceChunk(ResType.STEEL, 4812),
                        new ResourceChunk(ResType.CONCRETE, 14917),
                        new ResourceChunk(ResType.BRICK, 12030),
                        new ResourceChunk(ResType.GLASS, 1684),
                        new ResourceChunk(ResType.MONEY, 384960)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.CONSTRUCTION, 11000),
                        new ResourceChunk(ResType.STEEL, 6450),
                        new ResourceChunk(ResType.CONCRETE, 19995),
                        new ResourceChunk(ResType.BRICK, 16125),
                        new ResourceChunk(ResType.GLASS, 2258),
                        new ResourceChunk(ResType.MONEY, 516000)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.CONSTRUCTION, 14000),
                        new ResourceChunk(ResType.STEEL, 8400),
                        new ResourceChunk(ResType.CONCRETE, 26040),
                        new ResourceChunk(ResType.BRICK, 21000),
                        new ResourceChunk(ResType.GLASS, 2940),
                        new ResourceChunk(ResType.MONEY, 672000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.CONSTRUCTION, 17600),
                        new ResourceChunk(ResType.STEEL, 10848),
                        new ResourceChunk(ResType.CONCRETE, 33629),
                        new ResourceChunk(ResType.BRICK, 27120),
                        new ResourceChunk(ResType.GLASS, 3797),
                        new ResourceChunk(ResType.MONEY, 867840)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.CONSTRUCTION, 21800),
                        new ResourceChunk(ResType.STEEL, 13830),
                        new ResourceChunk(ResType.CONCRETE, 42873),
                        new ResourceChunk(ResType.BRICK, 34575),
                        new ResourceChunk(ResType.GLASS, 4841),
                        new ResourceChunk(ResType.MONEY, 1106400)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.CONSTRUCTION, 26600),
                        new ResourceChunk(ResType.STEEL, 17382),
                        new ResourceChunk(ResType.CONCRETE, 53884),
                        new ResourceChunk(ResType.BRICK, 53455),
                        new ResourceChunk(ResType.GLASS, 6084),
                        new ResourceChunk(ResType.MONEY, 139560)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.CONSTRUCTION, 32000),
                        new ResourceChunk(ResType.STEEL, 21540),
                        new ResourceChunk(ResType.CONCRETE, 66774),
                        new ResourceChunk(ResType.BRICK, 53850),
                        new ResourceChunk(ResType.GLASS, 7539),
                        new ResourceChunk(ResType.MONEY, 1723200)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.CONSTRUCTION, 38000),
                        new ResourceChunk(ResType.STEEL, 26340),
                        new ResourceChunk(ResType.CONCRETE, 81654),
                        new ResourceChunk(ResType.BRICK, 65850),
                        new ResourceChunk(ResType.GLASS, 9219),
                        new ResourceChunk(ResType.MONEY, 2107200)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.CONSTRUCTION, 44800),
                        new ResourceChunk(ResType.STEEL, 32052),
                        new ResourceChunk(ResType.CONCRETE, 99361),
                        new ResourceChunk(ResType.BRICK, 80130),
                        new ResourceChunk(ResType.GLASS, 11218),
                        new ResourceChunk(ResType.MONEY, 2564160)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.CONSTRUCTION, 52400),
                        new ResourceChunk(ResType.STEEL, 38740),
                        new ResourceChunk(ResType.CONCRETE, 120094),
                        new ResourceChunk(ResType.BRICK, 96850),
                        new ResourceChunk(ResType.GLASS, 13359),
                        new ResourceChunk(ResType.MONEY, 3099200)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.CONSTRUCTION, 60800),
                        new ResourceChunk(ResType.STEEL, 46468),
                        new ResourceChunk(ResType.CONCRETE, 144051),
                        new ResourceChunk(ResType.BRICK, 116170),
                        new ResourceChunk(ResType.GLASS, 16264),
                        new ResourceChunk(ResType.MONEY, 3717440)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.CONSTRUCTION, 70000),
                        new ResourceChunk(ResType.STEEL, 55300),
                        new ResourceChunk(ResType.CONCRETE, 171430),
                        new ResourceChunk(ResType.BRICK, 138250),
                        new ResourceChunk(ResType.GLASS, 19355),
                        new ResourceChunk(ResType.MONEY, 4424000)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.CONSTRUCTION, 80000),
                        new ResourceChunk(ResType.STEEL, 65300),
                        new ResourceChunk(ResType.CONCRETE, 202430),
                        new ResourceChunk(ResType.BRICK, 163250),
                        new ResourceChunk(ResType.GLASS, 22855),
                        new ResourceChunk(ResType.MONEY, 5224000)
                )
        });
        setDemand(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.UPKEEP, 100),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 4),
                        new ResourceChunk(ResType.JOB, 80),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.UPKEEP, 200),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 8),
                        new ResourceChunk(ResType.JOB, 160),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.UPKEEP, 300),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 12),
                        new ResourceChunk(ResType.JOB, 240),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.UPKEEP, 400),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 16),
                        new ResourceChunk(ResType.JOB, 320),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.UPKEEP, 500),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 20),
                        new ResourceChunk(ResType.JOB, 400),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.UPKEEP, 700),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 28),
                        new ResourceChunk(ResType.JOB, 560),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.UPKEEP, 900),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 36),
                        new ResourceChunk(ResType.JOB, 720),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.UPKEEP, 1100),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 44),
                        new ResourceChunk(ResType.JOB, 880),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.UPKEEP, 1300),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 52),
                        new ResourceChunk(ResType.JOB, 1040),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.UPKEEP, 1500),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 60),
                        new ResourceChunk(ResType.JOB, 1200),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.UPKEEP, 1800),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 72),
                        new ResourceChunk(ResType.JOB, 1440),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.UPKEEP, 2100),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 84),
                        new ResourceChunk(ResType.JOB, 1680),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.UPKEEP, 2400),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 96),
                        new ResourceChunk(ResType.JOB, 1920),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.UPKEEP, 2700),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 108),
                        new ResourceChunk(ResType.JOB, 2160),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.UPKEEP, 3000),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 120),
                        new ResourceChunk(ResType.JOB, 2400),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.UPKEEP, 3400),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 136),
                        new ResourceChunk(ResType.JOB, 2720),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.UPKEEP, 3800),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 152),
                        new ResourceChunk(ResType.JOB, 3040),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.UPKEEP, 4200),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 168),
                        new ResourceChunk(ResType.JOB, 3360),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.UPKEEP, 4600),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 184),
                        new ResourceChunk(ResType.JOB, 3600),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.UPKEEP, 5000),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 200),
                        new ResourceChunk(ResType.JOB, 4000),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                )
        });
        setHold(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.POWER, 4),
                        new ResourceChunk(ResType.WORKER, 80)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.POWER, 8),
                        new ResourceChunk(ResType.WORKER, 160)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.POWER, 12),
                        new ResourceChunk(ResType.WORKER, 240)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.POWER, 16),
                        new ResourceChunk(ResType.WORKER, 320)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.POWER, 20),
                        new ResourceChunk(ResType.WORKER, 400)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.POWER, 28),
                        new ResourceChunk(ResType.WORKER, 560)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.POWER, 36),
                        new ResourceChunk(ResType.WORKER, 720)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.POWER, 44),
                        new ResourceChunk(ResType.WORKER, 880)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.POWER, 52),
                        new ResourceChunk(ResType.WORKER, 1040)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.POWER, 60),
                        new ResourceChunk(ResType.WORKER, 1200)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.POWER, 72),
                        new ResourceChunk(ResType.WORKER, 1440)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.POWER, 84),
                        new ResourceChunk(ResType.WORKER, 1680)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.POWER, 96),
                        new ResourceChunk(ResType.WORKER, 1920)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.POWER, 108),
                        new ResourceChunk(ResType.WORKER, 2160)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.POWER, 120),
                        new ResourceChunk(ResType.WORKER, 2400)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.POWER, 136),
                        new ResourceChunk(ResType.WORKER, 2720)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.POWER, 152),
                        new ResourceChunk(ResType.WORKER, 3040)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.POWER, 168),
                        new ResourceChunk(ResType.WORKER, 3360)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.POWER, 184),
                        new ResourceChunk(ResType.WORKER, 3600)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.POWER, 200),
                        new ResourceChunk(ResType.WORKER, 4000)
                )
        });
        setStore(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.WOOD, 1000)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.WOOD, 2000)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.WOOD, 3000)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.WOOD, 4000)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.WOOD, 5000)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.WOOD, 7000)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.WOOD, 9000)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.WOOD, 11000)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.WOOD, 13000)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.WOOD, 15000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.WOOD, 18000)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.WOOD, 21000)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.WOOD, 24000)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.WOOD, 27000)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.WOOD, 30000)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.WOOD, 34000)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.WOOD, 38000)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.WOOD, 42000)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.WOOD, 46000)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.WOOD, 50000)
                )
        });
    }
}
