package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;
import org.itworks.clicknbuild.engine.model.ResourceType;

public final class WarehouseSteelStats extends BuildingStats {
    private static volatile WarehouseSteelStats inst;

    private WarehouseSteelStats() {
    }

    public static WarehouseSteelStats inst() {
        WarehouseSteelStats local = inst;
        if (local == null) {
            synchronized (WarehouseSteelStats.class) {
                local = inst;
                if (local == null) {
                    inst = local = new WarehouseSteelStats();
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
                        new ResourceChunk(ResourceType.CONSTRUCTION, 200),
                        new ResourceChunk(ResourceType.CONCRETE, 316),
                        new ResourceChunk(ResourceType.BRICK, 255),
                        new ResourceChunk(ResourceType.WOOD, 20),
                        new ResourceChunk(ResourceType.GLASS, 36),
                        new ResourceChunk(ResourceType.MONEY, 8160)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.CONSTRUCTION, 600),
                        new ResourceChunk(ResourceType.CONCRETE, 961),
                        new ResourceChunk(ResourceType.BRICK, 775),
                        new ResourceChunk(ResourceType.WOOD, 62),
                        new ResourceChunk(ResourceType.GLASS, 109),
                        new ResourceChunk(ResourceType.MONEY, 24800)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.CONSTRUCTION, 1200),
                        new ResourceChunk(ResourceType.CONCRETE, 1947),
                        new ResourceChunk(ResourceType.BRICK, 1570),
                        new ResourceChunk(ResourceType.WOOD, 126),
                        new ResourceChunk(ResourceType.GLASS, 220),
                        new ResourceChunk(ResourceType.MONEY, 50240)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.CONSTRUCTION, 2000),
                        new ResourceChunk(ResourceType.CONCRETE, 3286),
                        new ResourceChunk(ResourceType.BRICK, 2650),
                        new ResourceChunk(ResourceType.WOOD, 212),
                        new ResourceChunk(ResourceType.GLASS, 371),
                        new ResourceChunk(ResourceType.MONEY, 84800)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.CONSTRUCTION, 3000),
                        new ResourceChunk(ResourceType.CONCRETE, 4991),
                        new ResourceChunk(ResourceType.BRICK, 4025),
                        new ResourceChunk(ResourceType.WOOD, 322),
                        new ResourceChunk(ResourceType.GLASS, 564),
                        new ResourceChunk(ResourceType.MONEY, 128800)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.CONSTRUCTION, 4400),
                        new ResourceChunk(ResourceType.CONCRETE, 7465),
                        new ResourceChunk(ResourceType.BRICK, 6020),
                        new ResourceChunk(ResourceType.WOOD, 482),
                        new ResourceChunk(ResourceType.GLASS, 843),
                        new ResourceChunk(ResourceType.MONEY, 192640)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.CONSTRUCTION, 6200),
                        new ResourceChunk(ResourceType.CONCRETE, 10757),
                        new ResourceChunk(ResourceType.BRICK, 8675),
                        new ResourceChunk(ResourceType.WOOD, 694),
                        new ResourceChunk(ResourceType.GLASS, 1215),
                        new ResourceChunk(ResourceType.MONEY, 277600)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.CONSTRUCTION, 8400),
                        new ResourceChunk(ResourceType.CONCRETE, 14917),
                        new ResourceChunk(ResourceType.BRICK, 12030),
                        new ResourceChunk(ResourceType.WOOD, 962),
                        new ResourceChunk(ResourceType.GLASS, 1684),
                        new ResourceChunk(ResourceType.MONEY, 384960)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.CONSTRUCTION, 11000),
                        new ResourceChunk(ResourceType.CONCRETE, 19995),
                        new ResourceChunk(ResourceType.BRICK, 16125),
                        new ResourceChunk(ResourceType.WOOD, 1290),
                        new ResourceChunk(ResourceType.GLASS, 2258),
                        new ResourceChunk(ResourceType.MONEY, 516000)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.CONSTRUCTION, 14000),
                        new ResourceChunk(ResourceType.CONCRETE, 26040),
                        new ResourceChunk(ResourceType.BRICK, 21000),
                        new ResourceChunk(ResourceType.WOOD, 1680),
                        new ResourceChunk(ResourceType.GLASS, 2940),
                        new ResourceChunk(ResourceType.MONEY, 672000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.CONSTRUCTION, 17600),
                        new ResourceChunk(ResourceType.CONCRETE, 33629),
                        new ResourceChunk(ResourceType.BRICK, 27120),
                        new ResourceChunk(ResourceType.WOOD, 2170),
                        new ResourceChunk(ResourceType.GLASS, 3797),
                        new ResourceChunk(ResourceType.MONEY, 867840)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.CONSTRUCTION, 21800),
                        new ResourceChunk(ResourceType.CONCRETE, 42873),
                        new ResourceChunk(ResourceType.BRICK, 34575),
                        new ResourceChunk(ResourceType.WOOD, 2776),
                        new ResourceChunk(ResourceType.GLASS, 4841),
                        new ResourceChunk(ResourceType.MONEY, 1106400)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.CONSTRUCTION, 26600),
                        new ResourceChunk(ResourceType.CONCRETE, 53884),
                        new ResourceChunk(ResourceType.BRICK, 53455),
                        new ResourceChunk(ResourceType.WOOD, 476),
                        new ResourceChunk(ResourceType.GLASS, 6084),
                        new ResourceChunk(ResourceType.MONEY, 139560)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.CONSTRUCTION, 32000),
                        new ResourceChunk(ResourceType.CONCRETE, 66774),
                        new ResourceChunk(ResourceType.BRICK, 53850),
                        new ResourceChunk(ResourceType.WOOD, 4308),
                        new ResourceChunk(ResourceType.GLASS, 7539),
                        new ResourceChunk(ResourceType.MONEY, 1723200)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.CONSTRUCTION, 38000),
                        new ResourceChunk(ResourceType.CONCRETE, 81654),
                        new ResourceChunk(ResourceType.BRICK, 65850),
                        new ResourceChunk(ResourceType.WOOD, 5268),
                        new ResourceChunk(ResourceType.GLASS, 9219),
                        new ResourceChunk(ResourceType.MONEY, 2107200)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.CONSTRUCTION, 44800),
                        new ResourceChunk(ResourceType.CONCRETE, 99361),
                        new ResourceChunk(ResourceType.BRICK, 80130),
                        new ResourceChunk(ResourceType.WOOD, 6410),
                        new ResourceChunk(ResourceType.GLASS, 11218),
                        new ResourceChunk(ResourceType.MONEY, 2564160)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.CONSTRUCTION, 52400),
                        new ResourceChunk(ResourceType.CONCRETE, 120094),
                        new ResourceChunk(ResourceType.BRICK, 96850),
                        new ResourceChunk(ResourceType.WOOD, 7748),
                        new ResourceChunk(ResourceType.GLASS, 13359),
                        new ResourceChunk(ResourceType.MONEY, 3099200)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.CONSTRUCTION, 60800),
                        new ResourceChunk(ResourceType.CONCRETE, 144051),
                        new ResourceChunk(ResourceType.BRICK, 116170),
                        new ResourceChunk(ResourceType.WOOD, 9294),
                        new ResourceChunk(ResourceType.GLASS, 16264),
                        new ResourceChunk(ResourceType.MONEY, 3717440)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.CONSTRUCTION, 70000),
                        new ResourceChunk(ResourceType.CONCRETE, 171430),
                        new ResourceChunk(ResourceType.BRICK, 138250),
                        new ResourceChunk(ResourceType.WOOD, 11060),
                        new ResourceChunk(ResourceType.GLASS, 19355),
                        new ResourceChunk(ResourceType.MONEY, 4424000)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.CONSTRUCTION, 80000),
                        new ResourceChunk(ResourceType.CONCRETE, 202430),
                        new ResourceChunk(ResourceType.BRICK, 163250),
                        new ResourceChunk(ResourceType.WOOD, 13060),
                        new ResourceChunk(ResourceType.GLASS, 22855),
                        new ResourceChunk(ResourceType.MONEY, 5224000)
                )
        });
        setDemand(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.UPKEEP, 100),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 4),
                        new ResourceChunk(ResourceType.JOB, 80),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.UPKEEP, 200),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 8),
                        new ResourceChunk(ResourceType.JOB, 160),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.UPKEEP, 300),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 12),
                        new ResourceChunk(ResourceType.JOB, 240),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.UPKEEP, 400),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 16),
                        new ResourceChunk(ResourceType.JOB, 320),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.UPKEEP, 500),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 20),
                        new ResourceChunk(ResourceType.JOB, 400),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.UPKEEP, 700),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 28),
                        new ResourceChunk(ResourceType.JOB, 560),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.UPKEEP, 900),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 36),
                        new ResourceChunk(ResourceType.JOB, 720),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.UPKEEP, 1100),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 44),
                        new ResourceChunk(ResourceType.JOB, 880),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.UPKEEP, 1300),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 52),
                        new ResourceChunk(ResourceType.JOB, 1040),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.UPKEEP, 1500),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 60),
                        new ResourceChunk(ResourceType.JOB, 1200),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.UPKEEP, 1800),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 72),
                        new ResourceChunk(ResourceType.JOB, 1440),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.UPKEEP, 2100),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 84),
                        new ResourceChunk(ResourceType.JOB, 1680),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.UPKEEP, 2400),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 96),
                        new ResourceChunk(ResourceType.JOB, 1920),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.UPKEEP, 2700),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 108),
                        new ResourceChunk(ResourceType.JOB, 2160),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.UPKEEP, 3000),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 120),
                        new ResourceChunk(ResourceType.JOB, 2400),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.UPKEEP, 3400),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 136),
                        new ResourceChunk(ResourceType.JOB, 2720),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.UPKEEP, 3800),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 152),
                        new ResourceChunk(ResourceType.JOB, 3040),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.UPKEEP, 4200),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 168),
                        new ResourceChunk(ResourceType.JOB, 3360),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.UPKEEP, 4600),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 184),
                        new ResourceChunk(ResourceType.JOB, 3600),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.UPKEEP, 5000),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 200),
                        new ResourceChunk(ResourceType.JOB, 4000),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                )
        });
        setHold(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.POWER, 4),
                        new ResourceChunk(ResourceType.WORKER, 80)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.POWER, 8),
                        new ResourceChunk(ResourceType.WORKER, 160)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.POWER, 12),
                        new ResourceChunk(ResourceType.WORKER, 240)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.POWER, 16),
                        new ResourceChunk(ResourceType.WORKER, 320)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.POWER, 20),
                        new ResourceChunk(ResourceType.WORKER, 400)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.POWER, 28),
                        new ResourceChunk(ResourceType.WORKER, 560)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.POWER, 36),
                        new ResourceChunk(ResourceType.WORKER, 720)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.POWER, 44),
                        new ResourceChunk(ResourceType.WORKER, 880)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.POWER, 52),
                        new ResourceChunk(ResourceType.WORKER, 1040)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.POWER, 60),
                        new ResourceChunk(ResourceType.WORKER, 1200)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.POWER, 72),
                        new ResourceChunk(ResourceType.WORKER, 1440)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.POWER, 84),
                        new ResourceChunk(ResourceType.WORKER, 1680)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.POWER, 96),
                        new ResourceChunk(ResourceType.WORKER, 1920)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.POWER, 108),
                        new ResourceChunk(ResourceType.WORKER, 2160)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.POWER, 120),
                        new ResourceChunk(ResourceType.WORKER, 2400)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.POWER, 136),
                        new ResourceChunk(ResourceType.WORKER, 2720)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.POWER, 152),
                        new ResourceChunk(ResourceType.WORKER, 3040)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.POWER, 168),
                        new ResourceChunk(ResourceType.WORKER, 3360)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.POWER, 184),
                        new ResourceChunk(ResourceType.WORKER, 3600)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.POWER, 200),
                        new ResourceChunk(ResourceType.WORKER, 4000)
                )
        });
        setStore(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.STEEL, 1200)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.STEEL, 2400)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.STEEL, 3600)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.STEEL, 4800)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.STEEL, 6000)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.STEEL, 8400)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.STEEL, 10800)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.STEEL, 13200)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.STEEL, 15600)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.STEEL, 18000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.STEEL, 21600)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.STEEL, 25200)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.STEEL, 28800)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.STEEL, 32400)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.STEEL, 36000)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.STEEL, 40800)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.STEEL, 45600)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.STEEL, 50400)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.STEEL, 55200)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.STEEL, 60000)
                )
        });
    }
}
