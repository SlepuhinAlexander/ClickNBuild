package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;
import org.itworks.clicknbuild.engine.model.ResType;

public final class ConstructionSiteStats extends BuildingStats {
    private static volatile ConstructionSiteStats inst;

    private ConstructionSiteStats() {
    }

    public static ConstructionSiteStats inst() {
        ConstructionSiteStats local = inst;
        if (local == null) {
            synchronized (ConstructionSiteStats.class) {
                local = inst;
                if (local == null) {
                    inst = local = new ConstructionSiteStats();
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
        setPriceMultiplier(100);
        setStructure(new int[]{
                240, // 1
                720, // 2
                1440, // 3
                2400, // 4
                3600, // 5
                5280, // 6
                7440, // 7
                10080, // 8
                13200, // 9
                16800, // 10
                21120, // 11
                26160, // 12
                31920, // 13
                38400, // 14
                45600, // 15
                53760, // 16
                62880, // 17
                72960, // 18
                84000, // 19
                96000 // 20
        });
        setBuildCost(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.CONSTRUCTION, 240),
                        new ResourceChunk(ResType.STEEL, 171),
                        new ResourceChunk(ResType.CONCRETE, 326),
                        new ResourceChunk(ResType.BRICK, 122),
                        new ResourceChunk(ResType.MONEY, 30600)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.CONSTRUCTION, 720),
                        new ResourceChunk(ResType.STEEL, 521),
                        new ResourceChunk(ResType.CONCRETE, 992),
                        new ResourceChunk(ResType.BRICK, 372),
                        new ResourceChunk(ResType.MONEY, 93000)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.CONSTRUCTION, 1440),
                        new ResourceChunk(ResType.STEEL, 1055),
                        new ResourceChunk(ResType.CONCRETE, 2010),
                        new ResourceChunk(ResType.BRICK, 754),
                        new ResourceChunk(ResType.MONEY, 188400)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.CONSTRUCTION, 2400),
                        new ResourceChunk(ResType.STEEL, 1781),
                        new ResourceChunk(ResType.CONCRETE, 3392),
                        new ResourceChunk(ResType.BRICK, 1272),
                        new ResourceChunk(ResType.MONEY, 318000)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.CONSTRUCTION, 3600),
                        new ResourceChunk(ResType.STEEL, 2705),
                        new ResourceChunk(ResType.CONCRETE, 5152),
                        new ResourceChunk(ResType.BRICK, 1932),
                        new ResourceChunk(ResType.MONEY, 483000)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.CONSTRUCTION, 5280),
                        new ResourceChunk(ResType.STEEL, 4045),
                        new ResourceChunk(ResType.CONCRETE, 7706),
                        new ResourceChunk(ResType.BRICK, 2890),
                        new ResourceChunk(ResType.MONEY, 722400)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.CONSTRUCTION, 7440),
                        new ResourceChunk(ResType.STEEL, 5830),
                        new ResourceChunk(ResType.CONCRETE, 11104),
                        new ResourceChunk(ResType.BRICK, 4164),
                        new ResourceChunk(ResType.MONEY, 1041000)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.CONSTRUCTION, 10080),
                        new ResourceChunk(ResType.STEEL, 8084),
                        new ResourceChunk(ResType.CONCRETE, 15398),
                        new ResourceChunk(ResType.BRICK, 5774),
                        new ResourceChunk(ResType.MONEY, 1443600)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.CONSTRUCTION, 13200),
                        new ResourceChunk(ResType.STEEL, 10836),
                        new ResourceChunk(ResType.CONCRETE, 20640),
                        new ResourceChunk(ResType.BRICK, 7740),
                        new ResourceChunk(ResType.MONEY, 1935000)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.CONSTRUCTION, 16800),
                        new ResourceChunk(ResType.STEEL, 14112),
                        new ResourceChunk(ResType.CONCRETE, 26880),
                        new ResourceChunk(ResType.BRICK, 10080),
                        new ResourceChunk(ResType.MONEY, 2520000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.CONSTRUCTION, 21120),
                        new ResourceChunk(ResType.STEEL, 18225),
                        new ResourceChunk(ResType.CONCRETE, 34714),
                        new ResourceChunk(ResType.BRICK, 13018),
                        new ResourceChunk(ResType.MONEY, 3254400)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.CONSTRUCTION, 26160),
                        new ResourceChunk(ResType.STEEL, 23234),
                        new ResourceChunk(ResType.CONCRETE, 44256),
                        new ResourceChunk(ResType.BRICK, 16596),
                        new ResourceChunk(ResType.MONEY, 4149000)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.CONSTRUCTION, 31920),
                        new ResourceChunk(ResType.STEEL, 29202),
                        new ResourceChunk(ResType.CONCRETE, 55622),
                        new ResourceChunk(ResType.BRICK, 20858),
                        new ResourceChunk(ResType.MONEY, 5214600)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.CONSTRUCTION, 38400),
                        new ResourceChunk(ResType.STEEL, 36187),
                        new ResourceChunk(ResType.CONCRETE, 68928),
                        new ResourceChunk(ResType.BRICK, 25848),
                        new ResourceChunk(ResType.MONEY, 6462000)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.CONSTRUCTION, 45600),
                        new ResourceChunk(ResType.STEEL, 44251),
                        new ResourceChunk(ResType.CONCRETE, 84288),
                        new ResourceChunk(ResType.BRICK, 31608),
                        new ResourceChunk(ResType.MONEY, 7902000)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.CONSTRUCTION, 53760),
                        new ResourceChunk(ResType.STEEL, 53847),
                        new ResourceChunk(ResType.CONCRETE, 102566),
                        new ResourceChunk(ResType.BRICK, 38462),
                        new ResourceChunk(ResType.MONEY, 9615600)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.CONSTRUCTION, 62880),
                        new ResourceChunk(ResType.STEEL, 65083),
                        new ResourceChunk(ResType.CONCRETE, 123968),
                        new ResourceChunk(ResType.BRICK, 46488),
                        new ResourceChunk(ResType.MONEY, 11622000)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.CONSTRUCTION, 72960),
                        new ResourceChunk(ResType.STEEL, 78066),
                        new ResourceChunk(ResType.CONCRETE, 148698),
                        new ResourceChunk(ResType.BRICK, 55762),
                        new ResourceChunk(ResType.MONEY, 13940400)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.CONSTRUCTION, 84000),
                        new ResourceChunk(ResType.STEEL, 92904),
                        new ResourceChunk(ResType.CONCRETE, 176960),
                        new ResourceChunk(ResType.BRICK, 66360),
                        new ResourceChunk(ResType.MONEY, 16590000)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.CONSTRUCTION, 96000),
                        new ResourceChunk(ResType.STEEL, 109704),
                        new ResourceChunk(ResType.CONCRETE, 208960),
                        new ResourceChunk(ResType.BRICK, 78360),
                        new ResourceChunk(ResType.MONEY, 19590000)
                )
        });
        setProduction(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.CONSTRUCTION, 1800)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.CONSTRUCTION, 3600)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.CONSTRUCTION, 5400)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.CONSTRUCTION, 7200)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.CONSTRUCTION, 9000)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.CONSTRUCTION, 12600)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.CONSTRUCTION, 16200)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.CONSTRUCTION, 19800)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.CONSTRUCTION, 23400)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.CONSTRUCTION, 27000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.CONSTRUCTION, 32400)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.CONSTRUCTION, 37800)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.CONSTRUCTION, 43200)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.CONSTRUCTION, 48600)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.CONSTRUCTION, 54000)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.CONSTRUCTION, 61200)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.CONSTRUCTION, 68400)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.CONSTRUCTION, 75600)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.CONSTRUCTION, 82800)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.CONSTRUCTION, 90000)
                )
        });
        setDemand(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.UPKEEP, 80),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 14),
                        new ResourceChunk(ResType.JOB, 280),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.UPKEEP, 160),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 28),
                        new ResourceChunk(ResType.JOB, 560),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.UPKEEP, 240),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 42),
                        new ResourceChunk(ResType.JOB, 840),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.UPKEEP, 320),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 56),
                        new ResourceChunk(ResType.JOB, 1120),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.UPKEEP, 400),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 70),
                        new ResourceChunk(ResType.JOB, 1400),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.UPKEEP, 560),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 98),
                        new ResourceChunk(ResType.JOB, 1960),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.UPKEEP, 720),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 126),
                        new ResourceChunk(ResType.JOB, 2520),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.UPKEEP, 880),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 154),
                        new ResourceChunk(ResType.JOB, 3080),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.UPKEEP, 1040),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 182),
                        new ResourceChunk(ResType.JOB, 3640),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.UPKEEP, 1200),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 210),
                        new ResourceChunk(ResType.JOB, 4200),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.UPKEEP, 1440),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 252),
                        new ResourceChunk(ResType.JOB, 5040),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.UPKEEP, 1680),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 294),
                        new ResourceChunk(ResType.JOB, 5880),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.UPKEEP, 1920),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 336),
                        new ResourceChunk(ResType.JOB, 6720),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.UPKEEP, 2160),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 378),
                        new ResourceChunk(ResType.JOB, 7560),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.UPKEEP, 2400),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 420),
                        new ResourceChunk(ResType.JOB, 8400),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.UPKEEP, 2720),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 476),
                        new ResourceChunk(ResType.JOB, 9520),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.UPKEEP, 3040),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 532),
                        new ResourceChunk(ResType.JOB, 10640),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.UPKEEP, 3360),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 588),
                        new ResourceChunk(ResType.JOB, 11760),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.UPKEEP, 3680),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 644),
                        new ResourceChunk(ResType.JOB, 12880),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.UPKEEP, 4000),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 700),
                        new ResourceChunk(ResType.JOB, 14000),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                )
        });
        setHold(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.POWER, 14),
                        new ResourceChunk(ResType.WORKER, 280)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.POWER, 28),
                        new ResourceChunk(ResType.WORKER, 560)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.POWER, 42),
                        new ResourceChunk(ResType.WORKER, 840)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.POWER, 56),
                        new ResourceChunk(ResType.WORKER, 1120)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.POWER, 70),
                        new ResourceChunk(ResType.WORKER, 1400)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.POWER, 98),
                        new ResourceChunk(ResType.WORKER, 1960)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.POWER, 126),
                        new ResourceChunk(ResType.WORKER, 2520)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.POWER, 154),
                        new ResourceChunk(ResType.WORKER, 3080)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.POWER, 182),
                        new ResourceChunk(ResType.WORKER, 3640)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.POWER, 210),
                        new ResourceChunk(ResType.WORKER, 4200)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.POWER, 252),
                        new ResourceChunk(ResType.WORKER, 5040)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.POWER, 294),
                        new ResourceChunk(ResType.WORKER, 5880)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.POWER, 336),
                        new ResourceChunk(ResType.WORKER, 6720)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.POWER, 378),
                        new ResourceChunk(ResType.WORKER, 7560)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.POWER, 420),
                        new ResourceChunk(ResType.WORKER, 8400)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.POWER, 476),
                        new ResourceChunk(ResType.WORKER, 9520)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.POWER, 532),
                        new ResourceChunk(ResType.WORKER, 10640)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.POWER, 588),
                        new ResourceChunk(ResType.WORKER, 11760)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.POWER, 644),
                        new ResourceChunk(ResType.WORKER, 12880)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.POWER, 700),
                        new ResourceChunk(ResType.WORKER, 14000)
                )
        });
    }
}
