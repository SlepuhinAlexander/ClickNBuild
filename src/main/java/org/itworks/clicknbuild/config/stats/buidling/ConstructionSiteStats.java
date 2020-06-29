package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResChunk;
import org.itworks.clicknbuild.engine.model.ResPack;
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
        setBuildCost(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.CONSTRUCTION, 240),
                        new ResChunk(ResType.STEEL, 171),
                        new ResChunk(ResType.CONCRETE, 326),
                        new ResChunk(ResType.BRICK, 122),
                        new ResChunk(ResType.MONEY, 30600)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.CONSTRUCTION, 720),
                        new ResChunk(ResType.STEEL, 521),
                        new ResChunk(ResType.CONCRETE, 992),
                        new ResChunk(ResType.BRICK, 372),
                        new ResChunk(ResType.MONEY, 93000)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.CONSTRUCTION, 1440),
                        new ResChunk(ResType.STEEL, 1055),
                        new ResChunk(ResType.CONCRETE, 2010),
                        new ResChunk(ResType.BRICK, 754),
                        new ResChunk(ResType.MONEY, 188400)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.CONSTRUCTION, 2400),
                        new ResChunk(ResType.STEEL, 1781),
                        new ResChunk(ResType.CONCRETE, 3392),
                        new ResChunk(ResType.BRICK, 1272),
                        new ResChunk(ResType.MONEY, 318000)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.CONSTRUCTION, 3600),
                        new ResChunk(ResType.STEEL, 2705),
                        new ResChunk(ResType.CONCRETE, 5152),
                        new ResChunk(ResType.BRICK, 1932),
                        new ResChunk(ResType.MONEY, 483000)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.CONSTRUCTION, 5280),
                        new ResChunk(ResType.STEEL, 4045),
                        new ResChunk(ResType.CONCRETE, 7706),
                        new ResChunk(ResType.BRICK, 2890),
                        new ResChunk(ResType.MONEY, 722400)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.CONSTRUCTION, 7440),
                        new ResChunk(ResType.STEEL, 5830),
                        new ResChunk(ResType.CONCRETE, 11104),
                        new ResChunk(ResType.BRICK, 4164),
                        new ResChunk(ResType.MONEY, 1041000)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.CONSTRUCTION, 10080),
                        new ResChunk(ResType.STEEL, 8084),
                        new ResChunk(ResType.CONCRETE, 15398),
                        new ResChunk(ResType.BRICK, 5774),
                        new ResChunk(ResType.MONEY, 1443600)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.CONSTRUCTION, 13200),
                        new ResChunk(ResType.STEEL, 10836),
                        new ResChunk(ResType.CONCRETE, 20640),
                        new ResChunk(ResType.BRICK, 7740),
                        new ResChunk(ResType.MONEY, 1935000)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.CONSTRUCTION, 16800),
                        new ResChunk(ResType.STEEL, 14112),
                        new ResChunk(ResType.CONCRETE, 26880),
                        new ResChunk(ResType.BRICK, 10080),
                        new ResChunk(ResType.MONEY, 2520000)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.CONSTRUCTION, 21120),
                        new ResChunk(ResType.STEEL, 18225),
                        new ResChunk(ResType.CONCRETE, 34714),
                        new ResChunk(ResType.BRICK, 13018),
                        new ResChunk(ResType.MONEY, 3254400)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.CONSTRUCTION, 26160),
                        new ResChunk(ResType.STEEL, 23234),
                        new ResChunk(ResType.CONCRETE, 44256),
                        new ResChunk(ResType.BRICK, 16596),
                        new ResChunk(ResType.MONEY, 4149000)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.CONSTRUCTION, 31920),
                        new ResChunk(ResType.STEEL, 29202),
                        new ResChunk(ResType.CONCRETE, 55622),
                        new ResChunk(ResType.BRICK, 20858),
                        new ResChunk(ResType.MONEY, 5214600)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.CONSTRUCTION, 38400),
                        new ResChunk(ResType.STEEL, 36187),
                        new ResChunk(ResType.CONCRETE, 68928),
                        new ResChunk(ResType.BRICK, 25848),
                        new ResChunk(ResType.MONEY, 6462000)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.CONSTRUCTION, 45600),
                        new ResChunk(ResType.STEEL, 44251),
                        new ResChunk(ResType.CONCRETE, 84288),
                        new ResChunk(ResType.BRICK, 31608),
                        new ResChunk(ResType.MONEY, 7902000)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.CONSTRUCTION, 53760),
                        new ResChunk(ResType.STEEL, 53847),
                        new ResChunk(ResType.CONCRETE, 102566),
                        new ResChunk(ResType.BRICK, 38462),
                        new ResChunk(ResType.MONEY, 9615600)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.CONSTRUCTION, 62880),
                        new ResChunk(ResType.STEEL, 65083),
                        new ResChunk(ResType.CONCRETE, 123968),
                        new ResChunk(ResType.BRICK, 46488),
                        new ResChunk(ResType.MONEY, 11622000)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.CONSTRUCTION, 72960),
                        new ResChunk(ResType.STEEL, 78066),
                        new ResChunk(ResType.CONCRETE, 148698),
                        new ResChunk(ResType.BRICK, 55762),
                        new ResChunk(ResType.MONEY, 13940400)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.CONSTRUCTION, 84000),
                        new ResChunk(ResType.STEEL, 92904),
                        new ResChunk(ResType.CONCRETE, 176960),
                        new ResChunk(ResType.BRICK, 66360),
                        new ResChunk(ResType.MONEY, 16590000)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.CONSTRUCTION, 96000),
                        new ResChunk(ResType.STEEL, 109704),
                        new ResChunk(ResType.CONCRETE, 208960),
                        new ResChunk(ResType.BRICK, 78360),
                        new ResChunk(ResType.MONEY, 19590000)
                )
        });
        setProduction(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.CONSTRUCTION, 1800)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.CONSTRUCTION, 3600)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.CONSTRUCTION, 5400)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.CONSTRUCTION, 7200)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.CONSTRUCTION, 9000)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.CONSTRUCTION, 12600)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.CONSTRUCTION, 16200)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.CONSTRUCTION, 19800)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.CONSTRUCTION, 23400)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.CONSTRUCTION, 27000)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.CONSTRUCTION, 32400)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.CONSTRUCTION, 37800)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.CONSTRUCTION, 43200)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.CONSTRUCTION, 48600)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.CONSTRUCTION, 54000)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.CONSTRUCTION, 61200)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.CONSTRUCTION, 68400)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.CONSTRUCTION, 75600)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.CONSTRUCTION, 82800)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.CONSTRUCTION, 90000)
                )
        });
        setDemand(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.UPKEEP, 80),
                        new ResChunk(ResType.POWER_CONSUMPTION, 14),
                        new ResChunk(ResType.JOB, 280),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.UPKEEP, 160),
                        new ResChunk(ResType.POWER_CONSUMPTION, 28),
                        new ResChunk(ResType.JOB, 560),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.UPKEEP, 240),
                        new ResChunk(ResType.POWER_CONSUMPTION, 42),
                        new ResChunk(ResType.JOB, 840),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.UPKEEP, 320),
                        new ResChunk(ResType.POWER_CONSUMPTION, 56),
                        new ResChunk(ResType.JOB, 1120),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.UPKEEP, 400),
                        new ResChunk(ResType.POWER_CONSUMPTION, 70),
                        new ResChunk(ResType.JOB, 1400),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.UPKEEP, 560),
                        new ResChunk(ResType.POWER_CONSUMPTION, 98),
                        new ResChunk(ResType.JOB, 1960),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.UPKEEP, 720),
                        new ResChunk(ResType.POWER_CONSUMPTION, 126),
                        new ResChunk(ResType.JOB, 2520),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.UPKEEP, 880),
                        new ResChunk(ResType.POWER_CONSUMPTION, 154),
                        new ResChunk(ResType.JOB, 3080),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.UPKEEP, 1040),
                        new ResChunk(ResType.POWER_CONSUMPTION, 182),
                        new ResChunk(ResType.JOB, 3640),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.UPKEEP, 1200),
                        new ResChunk(ResType.POWER_CONSUMPTION, 210),
                        new ResChunk(ResType.JOB, 4200),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.UPKEEP, 1440),
                        new ResChunk(ResType.POWER_CONSUMPTION, 252),
                        new ResChunk(ResType.JOB, 5040),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.UPKEEP, 1680),
                        new ResChunk(ResType.POWER_CONSUMPTION, 294),
                        new ResChunk(ResType.JOB, 5880),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.UPKEEP, 1920),
                        new ResChunk(ResType.POWER_CONSUMPTION, 336),
                        new ResChunk(ResType.JOB, 6720),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.UPKEEP, 2160),
                        new ResChunk(ResType.POWER_CONSUMPTION, 378),
                        new ResChunk(ResType.JOB, 7560),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.UPKEEP, 2400),
                        new ResChunk(ResType.POWER_CONSUMPTION, 420),
                        new ResChunk(ResType.JOB, 8400),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.UPKEEP, 2720),
                        new ResChunk(ResType.POWER_CONSUMPTION, 476),
                        new ResChunk(ResType.JOB, 9520),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.UPKEEP, 3040),
                        new ResChunk(ResType.POWER_CONSUMPTION, 532),
                        new ResChunk(ResType.JOB, 10640),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.UPKEEP, 3360),
                        new ResChunk(ResType.POWER_CONSUMPTION, 588),
                        new ResChunk(ResType.JOB, 11760),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.UPKEEP, 3680),
                        new ResChunk(ResType.POWER_CONSUMPTION, 644),
                        new ResChunk(ResType.JOB, 12880),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.UPKEEP, 4000),
                        new ResChunk(ResType.POWER_CONSUMPTION, 700),
                        new ResChunk(ResType.JOB, 14000),
                        new ResChunk(ResType.IGNITABILITY, 1)
                )
        });
        setHold(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.POWER, 14),
                        new ResChunk(ResType.WORKER, 280)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.POWER, 28),
                        new ResChunk(ResType.WORKER, 560)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.POWER, 42),
                        new ResChunk(ResType.WORKER, 840)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.POWER, 56),
                        new ResChunk(ResType.WORKER, 1120)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.POWER, 70),
                        new ResChunk(ResType.WORKER, 1400)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.POWER, 98),
                        new ResChunk(ResType.WORKER, 1960)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.POWER, 126),
                        new ResChunk(ResType.WORKER, 2520)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.POWER, 154),
                        new ResChunk(ResType.WORKER, 3080)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.POWER, 182),
                        new ResChunk(ResType.WORKER, 3640)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.POWER, 210),
                        new ResChunk(ResType.WORKER, 4200)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.POWER, 252),
                        new ResChunk(ResType.WORKER, 5040)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.POWER, 294),
                        new ResChunk(ResType.WORKER, 5880)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.POWER, 336),
                        new ResChunk(ResType.WORKER, 6720)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.POWER, 378),
                        new ResChunk(ResType.WORKER, 7560)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.POWER, 420),
                        new ResChunk(ResType.WORKER, 8400)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.POWER, 476),
                        new ResChunk(ResType.WORKER, 9520)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.POWER, 532),
                        new ResChunk(ResType.WORKER, 10640)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.POWER, 588),
                        new ResChunk(ResType.WORKER, 11760)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.POWER, 644),
                        new ResChunk(ResType.WORKER, 12880)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.POWER, 700),
                        new ResChunk(ResType.WORKER, 14000)
                )
        });
    }
}
