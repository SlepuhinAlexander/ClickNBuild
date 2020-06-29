package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResStat;
import org.itworks.clicknbuild.engine.model.ResStatPack;
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
        setBuildCost(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.CONSTRUCTION, 240),
                        new ResStat(ResType.STEEL, 171),
                        new ResStat(ResType.CONCRETE, 326),
                        new ResStat(ResType.BRICK, 122),
                        new ResStat(ResType.MONEY, 30600)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.CONSTRUCTION, 720),
                        new ResStat(ResType.STEEL, 521),
                        new ResStat(ResType.CONCRETE, 992),
                        new ResStat(ResType.BRICK, 372),
                        new ResStat(ResType.MONEY, 93000)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.CONSTRUCTION, 1440),
                        new ResStat(ResType.STEEL, 1055),
                        new ResStat(ResType.CONCRETE, 2010),
                        new ResStat(ResType.BRICK, 754),
                        new ResStat(ResType.MONEY, 188400)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.CONSTRUCTION, 2400),
                        new ResStat(ResType.STEEL, 1781),
                        new ResStat(ResType.CONCRETE, 3392),
                        new ResStat(ResType.BRICK, 1272),
                        new ResStat(ResType.MONEY, 318000)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.CONSTRUCTION, 3600),
                        new ResStat(ResType.STEEL, 2705),
                        new ResStat(ResType.CONCRETE, 5152),
                        new ResStat(ResType.BRICK, 1932),
                        new ResStat(ResType.MONEY, 483000)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.CONSTRUCTION, 5280),
                        new ResStat(ResType.STEEL, 4045),
                        new ResStat(ResType.CONCRETE, 7706),
                        new ResStat(ResType.BRICK, 2890),
                        new ResStat(ResType.MONEY, 722400)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.CONSTRUCTION, 7440),
                        new ResStat(ResType.STEEL, 5830),
                        new ResStat(ResType.CONCRETE, 11104),
                        new ResStat(ResType.BRICK, 4164),
                        new ResStat(ResType.MONEY, 1041000)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.CONSTRUCTION, 10080),
                        new ResStat(ResType.STEEL, 8084),
                        new ResStat(ResType.CONCRETE, 15398),
                        new ResStat(ResType.BRICK, 5774),
                        new ResStat(ResType.MONEY, 1443600)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.CONSTRUCTION, 13200),
                        new ResStat(ResType.STEEL, 10836),
                        new ResStat(ResType.CONCRETE, 20640),
                        new ResStat(ResType.BRICK, 7740),
                        new ResStat(ResType.MONEY, 1935000)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.CONSTRUCTION, 16800),
                        new ResStat(ResType.STEEL, 14112),
                        new ResStat(ResType.CONCRETE, 26880),
                        new ResStat(ResType.BRICK, 10080),
                        new ResStat(ResType.MONEY, 2520000)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.CONSTRUCTION, 21120),
                        new ResStat(ResType.STEEL, 18225),
                        new ResStat(ResType.CONCRETE, 34714),
                        new ResStat(ResType.BRICK, 13018),
                        new ResStat(ResType.MONEY, 3254400)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.CONSTRUCTION, 26160),
                        new ResStat(ResType.STEEL, 23234),
                        new ResStat(ResType.CONCRETE, 44256),
                        new ResStat(ResType.BRICK, 16596),
                        new ResStat(ResType.MONEY, 4149000)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.CONSTRUCTION, 31920),
                        new ResStat(ResType.STEEL, 29202),
                        new ResStat(ResType.CONCRETE, 55622),
                        new ResStat(ResType.BRICK, 20858),
                        new ResStat(ResType.MONEY, 5214600)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.CONSTRUCTION, 38400),
                        new ResStat(ResType.STEEL, 36187),
                        new ResStat(ResType.CONCRETE, 68928),
                        new ResStat(ResType.BRICK, 25848),
                        new ResStat(ResType.MONEY, 6462000)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.CONSTRUCTION, 45600),
                        new ResStat(ResType.STEEL, 44251),
                        new ResStat(ResType.CONCRETE, 84288),
                        new ResStat(ResType.BRICK, 31608),
                        new ResStat(ResType.MONEY, 7902000)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.CONSTRUCTION, 53760),
                        new ResStat(ResType.STEEL, 53847),
                        new ResStat(ResType.CONCRETE, 102566),
                        new ResStat(ResType.BRICK, 38462),
                        new ResStat(ResType.MONEY, 9615600)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.CONSTRUCTION, 62880),
                        new ResStat(ResType.STEEL, 65083),
                        new ResStat(ResType.CONCRETE, 123968),
                        new ResStat(ResType.BRICK, 46488),
                        new ResStat(ResType.MONEY, 11622000)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.CONSTRUCTION, 72960),
                        new ResStat(ResType.STEEL, 78066),
                        new ResStat(ResType.CONCRETE, 148698),
                        new ResStat(ResType.BRICK, 55762),
                        new ResStat(ResType.MONEY, 13940400)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.CONSTRUCTION, 84000),
                        new ResStat(ResType.STEEL, 92904),
                        new ResStat(ResType.CONCRETE, 176960),
                        new ResStat(ResType.BRICK, 66360),
                        new ResStat(ResType.MONEY, 16590000)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.CONSTRUCTION, 96000),
                        new ResStat(ResType.STEEL, 109704),
                        new ResStat(ResType.CONCRETE, 208960),
                        new ResStat(ResType.BRICK, 78360),
                        new ResStat(ResType.MONEY, 19590000)
                )
        });
        setProduction(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.CONSTRUCTION, 1800)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.CONSTRUCTION, 3600)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.CONSTRUCTION, 5400)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.CONSTRUCTION, 7200)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.CONSTRUCTION, 9000)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.CONSTRUCTION, 12600)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.CONSTRUCTION, 16200)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.CONSTRUCTION, 19800)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.CONSTRUCTION, 23400)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.CONSTRUCTION, 27000)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.CONSTRUCTION, 32400)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.CONSTRUCTION, 37800)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.CONSTRUCTION, 43200)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.CONSTRUCTION, 48600)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.CONSTRUCTION, 54000)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.CONSTRUCTION, 61200)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.CONSTRUCTION, 68400)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.CONSTRUCTION, 75600)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.CONSTRUCTION, 82800)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.CONSTRUCTION, 90000)
                )
        });
        setDemand(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.UPKEEP, 80),
                        new ResStat(ResType.POWER_CONSUMPTION, 14),
                        new ResStat(ResType.JOB, 280),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.UPKEEP, 160),
                        new ResStat(ResType.POWER_CONSUMPTION, 28),
                        new ResStat(ResType.JOB, 560),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.UPKEEP, 240),
                        new ResStat(ResType.POWER_CONSUMPTION, 42),
                        new ResStat(ResType.JOB, 840),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.UPKEEP, 320),
                        new ResStat(ResType.POWER_CONSUMPTION, 56),
                        new ResStat(ResType.JOB, 1120),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.UPKEEP, 400),
                        new ResStat(ResType.POWER_CONSUMPTION, 70),
                        new ResStat(ResType.JOB, 1400),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.UPKEEP, 560),
                        new ResStat(ResType.POWER_CONSUMPTION, 98),
                        new ResStat(ResType.JOB, 1960),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.UPKEEP, 720),
                        new ResStat(ResType.POWER_CONSUMPTION, 126),
                        new ResStat(ResType.JOB, 2520),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.UPKEEP, 880),
                        new ResStat(ResType.POWER_CONSUMPTION, 154),
                        new ResStat(ResType.JOB, 3080),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.UPKEEP, 1040),
                        new ResStat(ResType.POWER_CONSUMPTION, 182),
                        new ResStat(ResType.JOB, 3640),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.UPKEEP, 1200),
                        new ResStat(ResType.POWER_CONSUMPTION, 210),
                        new ResStat(ResType.JOB, 4200),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.UPKEEP, 1440),
                        new ResStat(ResType.POWER_CONSUMPTION, 252),
                        new ResStat(ResType.JOB, 5040),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.UPKEEP, 1680),
                        new ResStat(ResType.POWER_CONSUMPTION, 294),
                        new ResStat(ResType.JOB, 5880),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.UPKEEP, 1920),
                        new ResStat(ResType.POWER_CONSUMPTION, 336),
                        new ResStat(ResType.JOB, 6720),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.UPKEEP, 2160),
                        new ResStat(ResType.POWER_CONSUMPTION, 378),
                        new ResStat(ResType.JOB, 7560),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.UPKEEP, 2400),
                        new ResStat(ResType.POWER_CONSUMPTION, 420),
                        new ResStat(ResType.JOB, 8400),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.UPKEEP, 2720),
                        new ResStat(ResType.POWER_CONSUMPTION, 476),
                        new ResStat(ResType.JOB, 9520),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.UPKEEP, 3040),
                        new ResStat(ResType.POWER_CONSUMPTION, 532),
                        new ResStat(ResType.JOB, 10640),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.UPKEEP, 3360),
                        new ResStat(ResType.POWER_CONSUMPTION, 588),
                        new ResStat(ResType.JOB, 11760),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.UPKEEP, 3680),
                        new ResStat(ResType.POWER_CONSUMPTION, 644),
                        new ResStat(ResType.JOB, 12880),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.UPKEEP, 4000),
                        new ResStat(ResType.POWER_CONSUMPTION, 700),
                        new ResStat(ResType.JOB, 14000),
                        new ResStat(ResType.IGNITABILITY, 1)
                )
        });
        setHold(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.POWER, 14),
                        new ResStat(ResType.WORKER, 280)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.POWER, 28),
                        new ResStat(ResType.WORKER, 560)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.POWER, 42),
                        new ResStat(ResType.WORKER, 840)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.POWER, 56),
                        new ResStat(ResType.WORKER, 1120)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.POWER, 70),
                        new ResStat(ResType.WORKER, 1400)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.POWER, 98),
                        new ResStat(ResType.WORKER, 1960)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.POWER, 126),
                        new ResStat(ResType.WORKER, 2520)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.POWER, 154),
                        new ResStat(ResType.WORKER, 3080)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.POWER, 182),
                        new ResStat(ResType.WORKER, 3640)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.POWER, 210),
                        new ResStat(ResType.WORKER, 4200)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.POWER, 252),
                        new ResStat(ResType.WORKER, 5040)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.POWER, 294),
                        new ResStat(ResType.WORKER, 5880)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.POWER, 336),
                        new ResStat(ResType.WORKER, 6720)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.POWER, 378),
                        new ResStat(ResType.WORKER, 7560)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.POWER, 420),
                        new ResStat(ResType.WORKER, 8400)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.POWER, 476),
                        new ResStat(ResType.WORKER, 9520)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.POWER, 532),
                        new ResStat(ResType.WORKER, 10640)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.POWER, 588),
                        new ResStat(ResType.WORKER, 11760)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.POWER, 644),
                        new ResStat(ResType.WORKER, 12880)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.POWER, 700),
                        new ResStat(ResType.WORKER, 14000)
                )
        });
    }
}
