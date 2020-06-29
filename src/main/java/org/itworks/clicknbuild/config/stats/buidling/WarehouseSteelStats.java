package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResStat;
import org.itworks.clicknbuild.engine.model.ResStatPack;
import org.itworks.clicknbuild.engine.model.ResType;

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
        setBuildCost(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.CONSTRUCTION, 200),
                        new ResStat(ResType.CONCRETE, 316),
                        new ResStat(ResType.BRICK, 255),
                        new ResStat(ResType.WOOD, 20),
                        new ResStat(ResType.GLASS, 36),
                        new ResStat(ResType.MONEY, 8160)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.CONSTRUCTION, 600),
                        new ResStat(ResType.CONCRETE, 961),
                        new ResStat(ResType.BRICK, 775),
                        new ResStat(ResType.WOOD, 62),
                        new ResStat(ResType.GLASS, 109),
                        new ResStat(ResType.MONEY, 24800)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.CONSTRUCTION, 1200),
                        new ResStat(ResType.CONCRETE, 1947),
                        new ResStat(ResType.BRICK, 1570),
                        new ResStat(ResType.WOOD, 126),
                        new ResStat(ResType.GLASS, 220),
                        new ResStat(ResType.MONEY, 50240)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.CONSTRUCTION, 2000),
                        new ResStat(ResType.CONCRETE, 3286),
                        new ResStat(ResType.BRICK, 2650),
                        new ResStat(ResType.WOOD, 212),
                        new ResStat(ResType.GLASS, 371),
                        new ResStat(ResType.MONEY, 84800)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.CONSTRUCTION, 3000),
                        new ResStat(ResType.CONCRETE, 4991),
                        new ResStat(ResType.BRICK, 4025),
                        new ResStat(ResType.WOOD, 322),
                        new ResStat(ResType.GLASS, 564),
                        new ResStat(ResType.MONEY, 128800)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.CONSTRUCTION, 4400),
                        new ResStat(ResType.CONCRETE, 7465),
                        new ResStat(ResType.BRICK, 6020),
                        new ResStat(ResType.WOOD, 482),
                        new ResStat(ResType.GLASS, 843),
                        new ResStat(ResType.MONEY, 192640)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.CONSTRUCTION, 6200),
                        new ResStat(ResType.CONCRETE, 10757),
                        new ResStat(ResType.BRICK, 8675),
                        new ResStat(ResType.WOOD, 694),
                        new ResStat(ResType.GLASS, 1215),
                        new ResStat(ResType.MONEY, 277600)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.CONSTRUCTION, 8400),
                        new ResStat(ResType.CONCRETE, 14917),
                        new ResStat(ResType.BRICK, 12030),
                        new ResStat(ResType.WOOD, 962),
                        new ResStat(ResType.GLASS, 1684),
                        new ResStat(ResType.MONEY, 384960)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.CONSTRUCTION, 11000),
                        new ResStat(ResType.CONCRETE, 19995),
                        new ResStat(ResType.BRICK, 16125),
                        new ResStat(ResType.WOOD, 1290),
                        new ResStat(ResType.GLASS, 2258),
                        new ResStat(ResType.MONEY, 516000)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.CONSTRUCTION, 14000),
                        new ResStat(ResType.CONCRETE, 26040),
                        new ResStat(ResType.BRICK, 21000),
                        new ResStat(ResType.WOOD, 1680),
                        new ResStat(ResType.GLASS, 2940),
                        new ResStat(ResType.MONEY, 672000)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.CONSTRUCTION, 17600),
                        new ResStat(ResType.CONCRETE, 33629),
                        new ResStat(ResType.BRICK, 27120),
                        new ResStat(ResType.WOOD, 2170),
                        new ResStat(ResType.GLASS, 3797),
                        new ResStat(ResType.MONEY, 867840)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.CONSTRUCTION, 21800),
                        new ResStat(ResType.CONCRETE, 42873),
                        new ResStat(ResType.BRICK, 34575),
                        new ResStat(ResType.WOOD, 2776),
                        new ResStat(ResType.GLASS, 4841),
                        new ResStat(ResType.MONEY, 1106400)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.CONSTRUCTION, 26600),
                        new ResStat(ResType.CONCRETE, 53884),
                        new ResStat(ResType.BRICK, 53455),
                        new ResStat(ResType.WOOD, 476),
                        new ResStat(ResType.GLASS, 6084),
                        new ResStat(ResType.MONEY, 139560)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.CONSTRUCTION, 32000),
                        new ResStat(ResType.CONCRETE, 66774),
                        new ResStat(ResType.BRICK, 53850),
                        new ResStat(ResType.WOOD, 4308),
                        new ResStat(ResType.GLASS, 7539),
                        new ResStat(ResType.MONEY, 1723200)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.CONSTRUCTION, 38000),
                        new ResStat(ResType.CONCRETE, 81654),
                        new ResStat(ResType.BRICK, 65850),
                        new ResStat(ResType.WOOD, 5268),
                        new ResStat(ResType.GLASS, 9219),
                        new ResStat(ResType.MONEY, 2107200)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.CONSTRUCTION, 44800),
                        new ResStat(ResType.CONCRETE, 99361),
                        new ResStat(ResType.BRICK, 80130),
                        new ResStat(ResType.WOOD, 6410),
                        new ResStat(ResType.GLASS, 11218),
                        new ResStat(ResType.MONEY, 2564160)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.CONSTRUCTION, 52400),
                        new ResStat(ResType.CONCRETE, 120094),
                        new ResStat(ResType.BRICK, 96850),
                        new ResStat(ResType.WOOD, 7748),
                        new ResStat(ResType.GLASS, 13359),
                        new ResStat(ResType.MONEY, 3099200)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.CONSTRUCTION, 60800),
                        new ResStat(ResType.CONCRETE, 144051),
                        new ResStat(ResType.BRICK, 116170),
                        new ResStat(ResType.WOOD, 9294),
                        new ResStat(ResType.GLASS, 16264),
                        new ResStat(ResType.MONEY, 3717440)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.CONSTRUCTION, 70000),
                        new ResStat(ResType.CONCRETE, 171430),
                        new ResStat(ResType.BRICK, 138250),
                        new ResStat(ResType.WOOD, 11060),
                        new ResStat(ResType.GLASS, 19355),
                        new ResStat(ResType.MONEY, 4424000)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.CONSTRUCTION, 80000),
                        new ResStat(ResType.CONCRETE, 202430),
                        new ResStat(ResType.BRICK, 163250),
                        new ResStat(ResType.WOOD, 13060),
                        new ResStat(ResType.GLASS, 22855),
                        new ResStat(ResType.MONEY, 5224000)
                )
        });
        setDemand(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.UPKEEP, 100),
                        new ResStat(ResType.POWER_CONSUMPTION, 4),
                        new ResStat(ResType.JOB, 80),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.UPKEEP, 200),
                        new ResStat(ResType.POWER_CONSUMPTION, 8),
                        new ResStat(ResType.JOB, 160),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.UPKEEP, 300),
                        new ResStat(ResType.POWER_CONSUMPTION, 12),
                        new ResStat(ResType.JOB, 240),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.UPKEEP, 400),
                        new ResStat(ResType.POWER_CONSUMPTION, 16),
                        new ResStat(ResType.JOB, 320),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.UPKEEP, 500),
                        new ResStat(ResType.POWER_CONSUMPTION, 20),
                        new ResStat(ResType.JOB, 400),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.UPKEEP, 700),
                        new ResStat(ResType.POWER_CONSUMPTION, 28),
                        new ResStat(ResType.JOB, 560),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.UPKEEP, 900),
                        new ResStat(ResType.POWER_CONSUMPTION, 36),
                        new ResStat(ResType.JOB, 720),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.UPKEEP, 1100),
                        new ResStat(ResType.POWER_CONSUMPTION, 44),
                        new ResStat(ResType.JOB, 880),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.UPKEEP, 1300),
                        new ResStat(ResType.POWER_CONSUMPTION, 52),
                        new ResStat(ResType.JOB, 1040),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.UPKEEP, 1500),
                        new ResStat(ResType.POWER_CONSUMPTION, 60),
                        new ResStat(ResType.JOB, 1200),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.UPKEEP, 1800),
                        new ResStat(ResType.POWER_CONSUMPTION, 72),
                        new ResStat(ResType.JOB, 1440),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.UPKEEP, 2100),
                        new ResStat(ResType.POWER_CONSUMPTION, 84),
                        new ResStat(ResType.JOB, 1680),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.UPKEEP, 2400),
                        new ResStat(ResType.POWER_CONSUMPTION, 96),
                        new ResStat(ResType.JOB, 1920),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.UPKEEP, 2700),
                        new ResStat(ResType.POWER_CONSUMPTION, 108),
                        new ResStat(ResType.JOB, 2160),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.UPKEEP, 3000),
                        new ResStat(ResType.POWER_CONSUMPTION, 120),
                        new ResStat(ResType.JOB, 2400),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.UPKEEP, 3400),
                        new ResStat(ResType.POWER_CONSUMPTION, 136),
                        new ResStat(ResType.JOB, 2720),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.UPKEEP, 3800),
                        new ResStat(ResType.POWER_CONSUMPTION, 152),
                        new ResStat(ResType.JOB, 3040),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.UPKEEP, 4200),
                        new ResStat(ResType.POWER_CONSUMPTION, 168),
                        new ResStat(ResType.JOB, 3360),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.UPKEEP, 4600),
                        new ResStat(ResType.POWER_CONSUMPTION, 184),
                        new ResStat(ResType.JOB, 3600),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.UPKEEP, 5000),
                        new ResStat(ResType.POWER_CONSUMPTION, 200),
                        new ResStat(ResType.JOB, 4000),
                        new ResStat(ResType.IGNITABILITY, 1)
                )
        });
        setHold(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.POWER, 4),
                        new ResStat(ResType.WORKER, 80)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.POWER, 8),
                        new ResStat(ResType.WORKER, 160)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.POWER, 12),
                        new ResStat(ResType.WORKER, 240)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.POWER, 16),
                        new ResStat(ResType.WORKER, 320)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.POWER, 20),
                        new ResStat(ResType.WORKER, 400)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.POWER, 28),
                        new ResStat(ResType.WORKER, 560)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.POWER, 36),
                        new ResStat(ResType.WORKER, 720)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.POWER, 44),
                        new ResStat(ResType.WORKER, 880)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.POWER, 52),
                        new ResStat(ResType.WORKER, 1040)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.POWER, 60),
                        new ResStat(ResType.WORKER, 1200)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.POWER, 72),
                        new ResStat(ResType.WORKER, 1440)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.POWER, 84),
                        new ResStat(ResType.WORKER, 1680)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.POWER, 96),
                        new ResStat(ResType.WORKER, 1920)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.POWER, 108),
                        new ResStat(ResType.WORKER, 2160)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.POWER, 120),
                        new ResStat(ResType.WORKER, 2400)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.POWER, 136),
                        new ResStat(ResType.WORKER, 2720)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.POWER, 152),
                        new ResStat(ResType.WORKER, 3040)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.POWER, 168),
                        new ResStat(ResType.WORKER, 3360)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.POWER, 184),
                        new ResStat(ResType.WORKER, 3600)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.POWER, 200),
                        new ResStat(ResType.WORKER, 4000)
                )
        });
        setStore(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.STEEL, 1200)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.STEEL, 2400)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.STEEL, 3600)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.STEEL, 4800)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.STEEL, 6000)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.STEEL, 8400)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.STEEL, 10800)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.STEEL, 13200)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.STEEL, 15600)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.STEEL, 18000)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.STEEL, 21600)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.STEEL, 25200)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.STEEL, 28800)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.STEEL, 32400)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.STEEL, 36000)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.STEEL, 40800)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.STEEL, 45600)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.STEEL, 50400)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.STEEL, 55200)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.STEEL, 60000)
                )
        });
    }
}
