package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResChunk;
import org.itworks.clicknbuild.engine.model.ResPack;
import org.itworks.clicknbuild.engine.model.ResType;

public final class WarehouseStats extends BuildingStats {
    private static volatile WarehouseStats inst;

    private WarehouseStats() {
    }

    public static WarehouseStats inst() {
        WarehouseStats local = inst;
        if (local == null) {
            synchronized (WarehouseStats.class) {
                local = inst;
                if (local == null) {
                    inst = local = new WarehouseStats();
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
        setBuildLimit(1);
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
        setBuildCost(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.CONSTRUCTION, 200),
                        new ResChunk(ResType.STEEL, 102),
                        new ResChunk(ResType.CONCRETE, 316),
                        new ResChunk(ResType.BRICK, 255),
                        new ResChunk(ResType.WOOD, 20),
                        new ResChunk(ResType.GLASS, 36),
                        new ResChunk(ResType.MONEY, 8160)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.CONSTRUCTION, 600),
                        new ResChunk(ResType.STEEL, 310),
                        new ResChunk(ResType.CONCRETE, 961),
                        new ResChunk(ResType.BRICK, 775),
                        new ResChunk(ResType.WOOD, 62),
                        new ResChunk(ResType.GLASS, 109),
                        new ResChunk(ResType.MONEY, 24800)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.CONSTRUCTION, 1200),
                        new ResChunk(ResType.STEEL, 628),
                        new ResChunk(ResType.CONCRETE, 1947),
                        new ResChunk(ResType.BRICK, 1570),
                        new ResChunk(ResType.WOOD, 126),
                        new ResChunk(ResType.GLASS, 220),
                        new ResChunk(ResType.MONEY, 50240)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.CONSTRUCTION, 2000),
                        new ResChunk(ResType.STEEL, 1060),
                        new ResChunk(ResType.CONCRETE, 3286),
                        new ResChunk(ResType.BRICK, 2650),
                        new ResChunk(ResType.WOOD, 212),
                        new ResChunk(ResType.GLASS, 371),
                        new ResChunk(ResType.MONEY, 84800)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.CONSTRUCTION, 3000),
                        new ResChunk(ResType.STEEL, 1610),
                        new ResChunk(ResType.CONCRETE, 4991),
                        new ResChunk(ResType.BRICK, 4025),
                        new ResChunk(ResType.WOOD, 322),
                        new ResChunk(ResType.GLASS, 564),
                        new ResChunk(ResType.MONEY, 128800)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.CONSTRUCTION, 4400),
                        new ResChunk(ResType.STEEL, 2408),
                        new ResChunk(ResType.CONCRETE, 7465),
                        new ResChunk(ResType.BRICK, 6020),
                        new ResChunk(ResType.WOOD, 482),
                        new ResChunk(ResType.GLASS, 843),
                        new ResChunk(ResType.MONEY, 192640)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.CONSTRUCTION, 6200),
                        new ResChunk(ResType.STEEL, 3470),
                        new ResChunk(ResType.CONCRETE, 10757),
                        new ResChunk(ResType.BRICK, 8675),
                        new ResChunk(ResType.WOOD, 694),
                        new ResChunk(ResType.GLASS, 1215),
                        new ResChunk(ResType.MONEY, 277600)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.CONSTRUCTION, 8400),
                        new ResChunk(ResType.STEEL, 4812),
                        new ResChunk(ResType.CONCRETE, 14917),
                        new ResChunk(ResType.BRICK, 12030),
                        new ResChunk(ResType.WOOD, 962),
                        new ResChunk(ResType.GLASS, 1684),
                        new ResChunk(ResType.MONEY, 384960)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.CONSTRUCTION, 11000),
                        new ResChunk(ResType.STEEL, 6450),
                        new ResChunk(ResType.CONCRETE, 19995),
                        new ResChunk(ResType.BRICK, 16125),
                        new ResChunk(ResType.WOOD, 1290),
                        new ResChunk(ResType.GLASS, 2258),
                        new ResChunk(ResType.MONEY, 516000)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.CONSTRUCTION, 14000),
                        new ResChunk(ResType.STEEL, 8400),
                        new ResChunk(ResType.CONCRETE, 26040),
                        new ResChunk(ResType.BRICK, 21000),
                        new ResChunk(ResType.WOOD, 1680),
                        new ResChunk(ResType.GLASS, 2940),
                        new ResChunk(ResType.MONEY, 672000)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.CONSTRUCTION, 17600),
                        new ResChunk(ResType.STEEL, 10848),
                        new ResChunk(ResType.CONCRETE, 33629),
                        new ResChunk(ResType.BRICK, 27120),
                        new ResChunk(ResType.WOOD, 2170),
                        new ResChunk(ResType.GLASS, 3797),
                        new ResChunk(ResType.MONEY, 867840)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.CONSTRUCTION, 21800),
                        new ResChunk(ResType.STEEL, 13830),
                        new ResChunk(ResType.CONCRETE, 42873),
                        new ResChunk(ResType.BRICK, 34575),
                        new ResChunk(ResType.WOOD, 2776),
                        new ResChunk(ResType.GLASS, 4841),
                        new ResChunk(ResType.MONEY, 1106400)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.CONSTRUCTION, 26600),
                        new ResChunk(ResType.STEEL, 17382),
                        new ResChunk(ResType.CONCRETE, 53884),
                        new ResChunk(ResType.BRICK, 53455),
                        new ResChunk(ResType.WOOD, 476),
                        new ResChunk(ResType.GLASS, 6084),
                        new ResChunk(ResType.MONEY, 139560)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.CONSTRUCTION, 32000),
                        new ResChunk(ResType.STEEL, 21540),
                        new ResChunk(ResType.CONCRETE, 66774),
                        new ResChunk(ResType.BRICK, 53850),
                        new ResChunk(ResType.WOOD, 4308),
                        new ResChunk(ResType.GLASS, 7539),
                        new ResChunk(ResType.MONEY, 1723200)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.CONSTRUCTION, 38000),
                        new ResChunk(ResType.STEEL, 26340),
                        new ResChunk(ResType.CONCRETE, 81654),
                        new ResChunk(ResType.BRICK, 65850),
                        new ResChunk(ResType.WOOD, 5268),
                        new ResChunk(ResType.GLASS, 9219),
                        new ResChunk(ResType.MONEY, 2107200)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.CONSTRUCTION, 44800),
                        new ResChunk(ResType.STEEL, 32052),
                        new ResChunk(ResType.CONCRETE, 99361),
                        new ResChunk(ResType.BRICK, 80130),
                        new ResChunk(ResType.WOOD, 6410),
                        new ResChunk(ResType.GLASS, 11218),
                        new ResChunk(ResType.MONEY, 2564160)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.CONSTRUCTION, 52400),
                        new ResChunk(ResType.STEEL, 38740),
                        new ResChunk(ResType.CONCRETE, 120094),
                        new ResChunk(ResType.BRICK, 96850),
                        new ResChunk(ResType.WOOD, 7748),
                        new ResChunk(ResType.GLASS, 13359),
                        new ResChunk(ResType.MONEY, 3099200)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.CONSTRUCTION, 60800),
                        new ResChunk(ResType.STEEL, 46468),
                        new ResChunk(ResType.CONCRETE, 144051),
                        new ResChunk(ResType.BRICK, 116170),
                        new ResChunk(ResType.WOOD, 9294),
                        new ResChunk(ResType.GLASS, 16264),
                        new ResChunk(ResType.MONEY, 3717440)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.CONSTRUCTION, 70000),
                        new ResChunk(ResType.STEEL, 55300),
                        new ResChunk(ResType.CONCRETE, 171430),
                        new ResChunk(ResType.BRICK, 138250),
                        new ResChunk(ResType.WOOD, 11060),
                        new ResChunk(ResType.GLASS, 19355),
                        new ResChunk(ResType.MONEY, 4424000)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.CONSTRUCTION, 80000),
                        new ResChunk(ResType.STEEL, 65300),
                        new ResChunk(ResType.CONCRETE, 202430),
                        new ResChunk(ResType.BRICK, 163250),
                        new ResChunk(ResType.WOOD, 13060),
                        new ResChunk(ResType.GLASS, 22855),
                        new ResChunk(ResType.MONEY, 5224000)
                )
        });
        setDemand(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.UPKEEP, 100),
                        new ResChunk(ResType.POWER_CONSUMPTION, 4),
                        new ResChunk(ResType.JOB, 80),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.UPKEEP, 200),
                        new ResChunk(ResType.POWER_CONSUMPTION, 8),
                        new ResChunk(ResType.JOB, 160),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.UPKEEP, 300),
                        new ResChunk(ResType.POWER_CONSUMPTION, 12),
                        new ResChunk(ResType.JOB, 240),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.UPKEEP, 400),
                        new ResChunk(ResType.POWER_CONSUMPTION, 16),
                        new ResChunk(ResType.JOB, 320),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.UPKEEP, 500),
                        new ResChunk(ResType.POWER_CONSUMPTION, 20),
                        new ResChunk(ResType.JOB, 400),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.UPKEEP, 700),
                        new ResChunk(ResType.POWER_CONSUMPTION, 28),
                        new ResChunk(ResType.JOB, 560),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.UPKEEP, 900),
                        new ResChunk(ResType.POWER_CONSUMPTION, 36),
                        new ResChunk(ResType.JOB, 720),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.UPKEEP, 1100),
                        new ResChunk(ResType.POWER_CONSUMPTION, 44),
                        new ResChunk(ResType.JOB, 880),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.UPKEEP, 1300),
                        new ResChunk(ResType.POWER_CONSUMPTION, 52),
                        new ResChunk(ResType.JOB, 1040),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.UPKEEP, 1500),
                        new ResChunk(ResType.POWER_CONSUMPTION, 60),
                        new ResChunk(ResType.JOB, 1200),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.UPKEEP, 1800),
                        new ResChunk(ResType.POWER_CONSUMPTION, 72),
                        new ResChunk(ResType.JOB, 1440),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.UPKEEP, 2100),
                        new ResChunk(ResType.POWER_CONSUMPTION, 84),
                        new ResChunk(ResType.JOB, 1680),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.UPKEEP, 2400),
                        new ResChunk(ResType.POWER_CONSUMPTION, 96),
                        new ResChunk(ResType.JOB, 1920),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.UPKEEP, 2700),
                        new ResChunk(ResType.POWER_CONSUMPTION, 108),
                        new ResChunk(ResType.JOB, 2160),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.UPKEEP, 3000),
                        new ResChunk(ResType.POWER_CONSUMPTION, 120),
                        new ResChunk(ResType.JOB, 2400),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.UPKEEP, 3400),
                        new ResChunk(ResType.POWER_CONSUMPTION, 136),
                        new ResChunk(ResType.JOB, 2720),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.UPKEEP, 3800),
                        new ResChunk(ResType.POWER_CONSUMPTION, 152),
                        new ResChunk(ResType.JOB, 3040),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.UPKEEP, 4200),
                        new ResChunk(ResType.POWER_CONSUMPTION, 168),
                        new ResChunk(ResType.JOB, 3360),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.UPKEEP, 4600),
                        new ResChunk(ResType.POWER_CONSUMPTION, 184),
                        new ResChunk(ResType.JOB, 3600),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.UPKEEP, 5000),
                        new ResChunk(ResType.POWER_CONSUMPTION, 200),
                        new ResChunk(ResType.JOB, 4000),
                        new ResChunk(ResType.IGNITABILITY, 1)
                )
        });
        setHold(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.POWER, 4),
                        new ResChunk(ResType.WORKER, 80)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.POWER, 8),
                        new ResChunk(ResType.WORKER, 160)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.POWER, 12),
                        new ResChunk(ResType.WORKER, 240)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.POWER, 16),
                        new ResChunk(ResType.WORKER, 320)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.POWER, 20),
                        new ResChunk(ResType.WORKER, 400)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.POWER, 28),
                        new ResChunk(ResType.WORKER, 560)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.POWER, 36),
                        new ResChunk(ResType.WORKER, 720)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.POWER, 44),
                        new ResChunk(ResType.WORKER, 880)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.POWER, 52),
                        new ResChunk(ResType.WORKER, 1040)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.POWER, 60),
                        new ResChunk(ResType.WORKER, 1200)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.POWER, 72),
                        new ResChunk(ResType.WORKER, 1440)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.POWER, 84),
                        new ResChunk(ResType.WORKER, 1680)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.POWER, 96),
                        new ResChunk(ResType.WORKER, 1920)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.POWER, 108),
                        new ResChunk(ResType.WORKER, 2160)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.POWER, 120),
                        new ResChunk(ResType.WORKER, 2400)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.POWER, 136),
                        new ResChunk(ResType.WORKER, 2720)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.POWER, 152),
                        new ResChunk(ResType.WORKER, 3040)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.POWER, 168),
                        new ResChunk(ResType.WORKER, 3360)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.POWER, 184),
                        new ResChunk(ResType.WORKER, 3600)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.POWER, 200),
                        new ResChunk(ResType.WORKER, 4000)
                )
        });
        setStore(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.STEEL, 400),
                        new ResChunk(ResType.CONCRETE, 400),
                        new ResChunk(ResType.BRICK, 400),
                        new ResChunk(ResType.WOOD, 400),
                        new ResChunk(ResType.GLASS, 400)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.STEEL, 800),
                        new ResChunk(ResType.CONCRETE, 800),
                        new ResChunk(ResType.BRICK, 800),
                        new ResChunk(ResType.WOOD, 800),
                        new ResChunk(ResType.GLASS, 800)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.STEEL, 1200),
                        new ResChunk(ResType.CONCRETE, 1200),
                        new ResChunk(ResType.BRICK, 1200),
                        new ResChunk(ResType.WOOD, 1200),
                        new ResChunk(ResType.GLASS, 1200)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.STEEL, 1600),
                        new ResChunk(ResType.CONCRETE, 1600),
                        new ResChunk(ResType.BRICK, 1600),
                        new ResChunk(ResType.WOOD, 1600),
                        new ResChunk(ResType.GLASS, 1600)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.STEEL, 2000),
                        new ResChunk(ResType.CONCRETE, 2000),
                        new ResChunk(ResType.BRICK, 2000),
                        new ResChunk(ResType.WOOD, 2000),
                        new ResChunk(ResType.GLASS, 2000)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.STEEL, 2800),
                        new ResChunk(ResType.CONCRETE, 2800),
                        new ResChunk(ResType.BRICK, 2800),
                        new ResChunk(ResType.WOOD, 2800),
                        new ResChunk(ResType.GLASS, 2800)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.STEEL, 3600),
                        new ResChunk(ResType.CONCRETE, 3600),
                        new ResChunk(ResType.BRICK, 3600),
                        new ResChunk(ResType.WOOD, 3600),
                        new ResChunk(ResType.GLASS, 3600)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.STEEL, 4400),
                        new ResChunk(ResType.CONCRETE, 4400),
                        new ResChunk(ResType.BRICK, 4400),
                        new ResChunk(ResType.WOOD, 4400),
                        new ResChunk(ResType.GLASS, 4400)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.STEEL, 5200),
                        new ResChunk(ResType.CONCRETE, 5200),
                        new ResChunk(ResType.BRICK, 5200),
                        new ResChunk(ResType.WOOD, 5200),
                        new ResChunk(ResType.GLASS, 5200)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.STEEL, 6000),
                        new ResChunk(ResType.CONCRETE, 6000),
                        new ResChunk(ResType.BRICK, 6000),
                        new ResChunk(ResType.WOOD, 6000),
                        new ResChunk(ResType.GLASS, 6000)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.STEEL, 7200),
                        new ResChunk(ResType.CONCRETE, 7200),
                        new ResChunk(ResType.BRICK, 7200),
                        new ResChunk(ResType.WOOD, 7200),
                        new ResChunk(ResType.GLASS, 7200)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.STEEL, 8400),
                        new ResChunk(ResType.CONCRETE, 8400),
                        new ResChunk(ResType.BRICK, 8400),
                        new ResChunk(ResType.WOOD, 8400),
                        new ResChunk(ResType.GLASS, 8400)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.STEEL, 9600),
                        new ResChunk(ResType.CONCRETE, 9600),
                        new ResChunk(ResType.BRICK, 9600),
                        new ResChunk(ResType.WOOD, 9600),
                        new ResChunk(ResType.GLASS, 9600)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.STEEL, 10800),
                        new ResChunk(ResType.CONCRETE, 10800),
                        new ResChunk(ResType.BRICK, 10800),
                        new ResChunk(ResType.WOOD, 10800),
                        new ResChunk(ResType.GLASS, 10800)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.STEEL, 12000),
                        new ResChunk(ResType.CONCRETE, 12000),
                        new ResChunk(ResType.BRICK, 12000),
                        new ResChunk(ResType.WOOD, 12000),
                        new ResChunk(ResType.GLASS, 12000)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.STEEL, 13600),
                        new ResChunk(ResType.CONCRETE, 13600),
                        new ResChunk(ResType.BRICK, 13600),
                        new ResChunk(ResType.WOOD, 13600),
                        new ResChunk(ResType.GLASS, 13600)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.STEEL, 15200),
                        new ResChunk(ResType.CONCRETE, 15200),
                        new ResChunk(ResType.BRICK, 15200),
                        new ResChunk(ResType.WOOD, 15200),
                        new ResChunk(ResType.GLASS, 15200)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.STEEL, 16800),
                        new ResChunk(ResType.CONCRETE, 16800),
                        new ResChunk(ResType.BRICK, 16800),
                        new ResChunk(ResType.WOOD, 16800),
                        new ResChunk(ResType.GLASS, 16800)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.STEEL, 18400),
                        new ResChunk(ResType.CONCRETE, 18400),
                        new ResChunk(ResType.BRICK, 18400),
                        new ResChunk(ResType.WOOD, 18400),
                        new ResChunk(ResType.GLASS, 18400)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.STEEL, 20000),
                        new ResChunk(ResType.CONCRETE, 20000),
                        new ResChunk(ResType.BRICK, 20000),
                        new ResChunk(ResType.WOOD, 20000),
                        new ResChunk(ResType.GLASS, 20000)
                )
        });
    }
}
