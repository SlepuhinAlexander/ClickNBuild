package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;
import org.itworks.clicknbuild.engine.model.ResType;

public final class WarehouseBrickStats extends BuildingStats {
    private static volatile WarehouseBrickStats inst;

    private WarehouseBrickStats() {
    }

    public static WarehouseBrickStats inst() {
        WarehouseBrickStats local = inst;
        if (local == null) {
            synchronized (WarehouseBrickStats.class) {
                local = inst;
                if (local == null) {
                    inst = local = new WarehouseBrickStats();
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
                        new ResourceChunk(ResType.WOOD, 20),
                        new ResourceChunk(ResType.GLASS, 36),
                        new ResourceChunk(ResType.MONEY, 8160)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.CONSTRUCTION, 600),
                        new ResourceChunk(ResType.STEEL, 310),
                        new ResourceChunk(ResType.CONCRETE, 961),
                        new ResourceChunk(ResType.WOOD, 62),
                        new ResourceChunk(ResType.GLASS, 109),
                        new ResourceChunk(ResType.MONEY, 24800)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.CONSTRUCTION, 1200),
                        new ResourceChunk(ResType.STEEL, 628),
                        new ResourceChunk(ResType.CONCRETE, 1947),
                        new ResourceChunk(ResType.WOOD, 126),
                        new ResourceChunk(ResType.GLASS, 220),
                        new ResourceChunk(ResType.MONEY, 50240)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.CONSTRUCTION, 2000),
                        new ResourceChunk(ResType.STEEL, 1060),
                        new ResourceChunk(ResType.CONCRETE, 3286),
                        new ResourceChunk(ResType.WOOD, 212),
                        new ResourceChunk(ResType.GLASS, 371),
                        new ResourceChunk(ResType.MONEY, 84800)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.CONSTRUCTION, 3000),
                        new ResourceChunk(ResType.STEEL, 1610),
                        new ResourceChunk(ResType.CONCRETE, 4991),
                        new ResourceChunk(ResType.WOOD, 322),
                        new ResourceChunk(ResType.GLASS, 564),
                        new ResourceChunk(ResType.MONEY, 128800)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.CONSTRUCTION, 4400),
                        new ResourceChunk(ResType.STEEL, 2408),
                        new ResourceChunk(ResType.CONCRETE, 7465),
                        new ResourceChunk(ResType.WOOD, 482),
                        new ResourceChunk(ResType.GLASS, 843),
                        new ResourceChunk(ResType.MONEY, 192640)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.CONSTRUCTION, 6200),
                        new ResourceChunk(ResType.STEEL, 3470),
                        new ResourceChunk(ResType.CONCRETE, 10757),
                        new ResourceChunk(ResType.WOOD, 694),
                        new ResourceChunk(ResType.GLASS, 1215),
                        new ResourceChunk(ResType.MONEY, 277600)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.CONSTRUCTION, 8400),
                        new ResourceChunk(ResType.STEEL, 4812),
                        new ResourceChunk(ResType.CONCRETE, 14917),
                        new ResourceChunk(ResType.WOOD, 962),
                        new ResourceChunk(ResType.GLASS, 1684),
                        new ResourceChunk(ResType.MONEY, 384960)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.CONSTRUCTION, 11000),
                        new ResourceChunk(ResType.STEEL, 6450),
                        new ResourceChunk(ResType.CONCRETE, 19995),
                        new ResourceChunk(ResType.WOOD, 1290),
                        new ResourceChunk(ResType.GLASS, 2258),
                        new ResourceChunk(ResType.MONEY, 516000)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.CONSTRUCTION, 14000),
                        new ResourceChunk(ResType.STEEL, 8400),
                        new ResourceChunk(ResType.CONCRETE, 26040),
                        new ResourceChunk(ResType.WOOD, 1680),
                        new ResourceChunk(ResType.GLASS, 2940),
                        new ResourceChunk(ResType.MONEY, 672000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.CONSTRUCTION, 17600),
                        new ResourceChunk(ResType.STEEL, 10848),
                        new ResourceChunk(ResType.CONCRETE, 33629),
                        new ResourceChunk(ResType.WOOD, 2170),
                        new ResourceChunk(ResType.GLASS, 3797),
                        new ResourceChunk(ResType.MONEY, 867840)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.CONSTRUCTION, 21800),
                        new ResourceChunk(ResType.STEEL, 13830),
                        new ResourceChunk(ResType.CONCRETE, 42873),
                        new ResourceChunk(ResType.WOOD, 2776),
                        new ResourceChunk(ResType.GLASS, 4841),
                        new ResourceChunk(ResType.MONEY, 1106400)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.CONSTRUCTION, 26600),
                        new ResourceChunk(ResType.STEEL, 17382),
                        new ResourceChunk(ResType.CONCRETE, 53884),
                        new ResourceChunk(ResType.WOOD, 476),
                        new ResourceChunk(ResType.GLASS, 6084),
                        new ResourceChunk(ResType.MONEY, 139560)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.CONSTRUCTION, 32000),
                        new ResourceChunk(ResType.STEEL, 21540),
                        new ResourceChunk(ResType.CONCRETE, 66774),
                        new ResourceChunk(ResType.WOOD, 4308),
                        new ResourceChunk(ResType.GLASS, 7539),
                        new ResourceChunk(ResType.MONEY, 1723200)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.CONSTRUCTION, 38000),
                        new ResourceChunk(ResType.STEEL, 26340),
                        new ResourceChunk(ResType.CONCRETE, 81654),
                        new ResourceChunk(ResType.WOOD, 5268),
                        new ResourceChunk(ResType.GLASS, 9219),
                        new ResourceChunk(ResType.MONEY, 2107200)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.CONSTRUCTION, 44800),
                        new ResourceChunk(ResType.STEEL, 32052),
                        new ResourceChunk(ResType.CONCRETE, 99361),
                        new ResourceChunk(ResType.WOOD, 6410),
                        new ResourceChunk(ResType.GLASS, 11218),
                        new ResourceChunk(ResType.MONEY, 2564160)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.CONSTRUCTION, 52400),
                        new ResourceChunk(ResType.STEEL, 38740),
                        new ResourceChunk(ResType.CONCRETE, 120094),
                        new ResourceChunk(ResType.WOOD, 7748),
                        new ResourceChunk(ResType.GLASS, 13359),
                        new ResourceChunk(ResType.MONEY, 3099200)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.CONSTRUCTION, 60800),
                        new ResourceChunk(ResType.STEEL, 46468),
                        new ResourceChunk(ResType.CONCRETE, 144051),
                        new ResourceChunk(ResType.WOOD, 9294),
                        new ResourceChunk(ResType.GLASS, 16264),
                        new ResourceChunk(ResType.MONEY, 3717440)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.CONSTRUCTION, 70000),
                        new ResourceChunk(ResType.STEEL, 55300),
                        new ResourceChunk(ResType.CONCRETE, 171430),
                        new ResourceChunk(ResType.WOOD, 11060),
                        new ResourceChunk(ResType.GLASS, 19355),
                        new ResourceChunk(ResType.MONEY, 4424000)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.CONSTRUCTION, 80000),
                        new ResourceChunk(ResType.STEEL, 65300),
                        new ResourceChunk(ResType.CONCRETE, 202430),
                        new ResourceChunk(ResType.WOOD, 13060),
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
                        new ResourceChunk(ResType.BRICK, 3000)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.BRICK, 6000)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.BRICK, 9000)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.BRICK, 12000)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.BRICK, 15000)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.BRICK, 21000)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.BRICK, 27000)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.BRICK, 33000)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.BRICK, 39000)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.BRICK, 45000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.BRICK, 54000)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.BRICK, 63000)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.BRICK, 72000)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.BRICK, 81000)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.BRICK, 90000)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.BRICK, 102000)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.BRICK, 114000)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.BRICK, 126000)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.BRICK, 138000)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.BRICK, 150000)
                )
        });
    }
}
