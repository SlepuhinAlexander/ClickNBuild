package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;
import org.itworks.clicknbuild.engine.model.ResourceType;

public final class ConstructionSiteStats extends BuildingStats {
    private static final ConstructionSiteStats INST = new ConstructionSiteStats();

    private ConstructionSiteStats() {
    }

    public static ConstructionSiteStats inst() {
        return INST;
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
                        new ResourceChunk(ResourceType.CONSTRUCTION, 240),
                        new ResourceChunk(ResourceType.STEEL, 171),
                        new ResourceChunk(ResourceType.CONCRETE, 326),
                        new ResourceChunk(ResourceType.BRICK, 122),
                        new ResourceChunk(ResourceType.MONEY, 30600)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.CONSTRUCTION, 720),
                        new ResourceChunk(ResourceType.STEEL, 521),
                        new ResourceChunk(ResourceType.CONCRETE, 992),
                        new ResourceChunk(ResourceType.BRICK, 372),
                        new ResourceChunk(ResourceType.MONEY, 93000)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.CONSTRUCTION, 1440),
                        new ResourceChunk(ResourceType.STEEL, 1055),
                        new ResourceChunk(ResourceType.CONCRETE, 2010),
                        new ResourceChunk(ResourceType.BRICK, 754),
                        new ResourceChunk(ResourceType.MONEY, 188400)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.CONSTRUCTION, 2400),
                        new ResourceChunk(ResourceType.STEEL, 1781),
                        new ResourceChunk(ResourceType.CONCRETE, 3392),
                        new ResourceChunk(ResourceType.BRICK, 1272),
                        new ResourceChunk(ResourceType.MONEY, 318000)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.CONSTRUCTION, 3600),
                        new ResourceChunk(ResourceType.STEEL, 2705),
                        new ResourceChunk(ResourceType.CONCRETE, 5152),
                        new ResourceChunk(ResourceType.BRICK, 1932),
                        new ResourceChunk(ResourceType.MONEY, 483000)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.CONSTRUCTION, 5280),
                        new ResourceChunk(ResourceType.STEEL, 4045),
                        new ResourceChunk(ResourceType.CONCRETE, 7706),
                        new ResourceChunk(ResourceType.BRICK, 2890),
                        new ResourceChunk(ResourceType.MONEY, 722400)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.CONSTRUCTION, 7440),
                        new ResourceChunk(ResourceType.STEEL, 5830),
                        new ResourceChunk(ResourceType.CONCRETE, 11104),
                        new ResourceChunk(ResourceType.BRICK, 4164),
                        new ResourceChunk(ResourceType.MONEY, 1041000)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.CONSTRUCTION, 10080),
                        new ResourceChunk(ResourceType.STEEL, 8084),
                        new ResourceChunk(ResourceType.CONCRETE, 15398),
                        new ResourceChunk(ResourceType.BRICK, 5774),
                        new ResourceChunk(ResourceType.MONEY, 1443600)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.CONSTRUCTION, 13200),
                        new ResourceChunk(ResourceType.STEEL, 10836),
                        new ResourceChunk(ResourceType.CONCRETE, 20640),
                        new ResourceChunk(ResourceType.BRICK, 7740),
                        new ResourceChunk(ResourceType.MONEY, 1935000)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.CONSTRUCTION, 16800),
                        new ResourceChunk(ResourceType.STEEL, 14112),
                        new ResourceChunk(ResourceType.CONCRETE, 26880),
                        new ResourceChunk(ResourceType.BRICK, 10080),
                        new ResourceChunk(ResourceType.MONEY, 2520000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.CONSTRUCTION, 21120),
                        new ResourceChunk(ResourceType.STEEL, 18225),
                        new ResourceChunk(ResourceType.CONCRETE, 34714),
                        new ResourceChunk(ResourceType.BRICK, 13018),
                        new ResourceChunk(ResourceType.MONEY, 3254400)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.CONSTRUCTION, 26160),
                        new ResourceChunk(ResourceType.STEEL, 23234),
                        new ResourceChunk(ResourceType.CONCRETE, 44256),
                        new ResourceChunk(ResourceType.BRICK, 16596),
                        new ResourceChunk(ResourceType.MONEY, 4149000)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.CONSTRUCTION, 31920),
                        new ResourceChunk(ResourceType.STEEL, 29202),
                        new ResourceChunk(ResourceType.CONCRETE, 55622),
                        new ResourceChunk(ResourceType.BRICK, 20858),
                        new ResourceChunk(ResourceType.MONEY, 5214600)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.CONSTRUCTION, 38400),
                        new ResourceChunk(ResourceType.STEEL, 36187),
                        new ResourceChunk(ResourceType.CONCRETE, 68928),
                        new ResourceChunk(ResourceType.BRICK, 25848),
                        new ResourceChunk(ResourceType.MONEY, 6462000)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.CONSTRUCTION, 45600),
                        new ResourceChunk(ResourceType.STEEL, 44251),
                        new ResourceChunk(ResourceType.CONCRETE, 84288),
                        new ResourceChunk(ResourceType.BRICK, 31608),
                        new ResourceChunk(ResourceType.MONEY, 7902000)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.CONSTRUCTION, 53760),
                        new ResourceChunk(ResourceType.STEEL, 53847),
                        new ResourceChunk(ResourceType.CONCRETE, 102566),
                        new ResourceChunk(ResourceType.BRICK, 38462),
                        new ResourceChunk(ResourceType.MONEY, 9615600)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.CONSTRUCTION, 62880),
                        new ResourceChunk(ResourceType.STEEL, 65083),
                        new ResourceChunk(ResourceType.CONCRETE, 123968),
                        new ResourceChunk(ResourceType.BRICK, 46488),
                        new ResourceChunk(ResourceType.MONEY, 11622000)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.CONSTRUCTION, 72960),
                        new ResourceChunk(ResourceType.STEEL, 78066),
                        new ResourceChunk(ResourceType.CONCRETE, 148698),
                        new ResourceChunk(ResourceType.BRICK, 55762),
                        new ResourceChunk(ResourceType.MONEY, 13940400)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.CONSTRUCTION, 84000),
                        new ResourceChunk(ResourceType.STEEL, 92904),
                        new ResourceChunk(ResourceType.CONCRETE, 176960),
                        new ResourceChunk(ResourceType.BRICK, 66360),
                        new ResourceChunk(ResourceType.MONEY, 16590000)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.CONSTRUCTION, 96000),
                        new ResourceChunk(ResourceType.STEEL, 109704),
                        new ResourceChunk(ResourceType.CONCRETE, 208960),
                        new ResourceChunk(ResourceType.BRICK, 78360),
                        new ResourceChunk(ResourceType.MONEY, 19590000)
                )
        });
        setProduction(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.CONSTRUCTION, 1800)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.CONSTRUCTION, 3600)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.CONSTRUCTION, 5400)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.CONSTRUCTION, 7200)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.CONSTRUCTION, 9000)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.CONSTRUCTION, 12600)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.CONSTRUCTION, 16200)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.CONSTRUCTION, 19800)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.CONSTRUCTION, 23400)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.CONSTRUCTION, 27000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.CONSTRUCTION, 32400)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.CONSTRUCTION, 37800)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.CONSTRUCTION, 43200)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.CONSTRUCTION, 48600)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.CONSTRUCTION, 54000)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.CONSTRUCTION, 61200)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.CONSTRUCTION, 68400)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.CONSTRUCTION, 75600)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.CONSTRUCTION, 82800)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.CONSTRUCTION, 90000)
                )
        });
        setDemand(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.UPKEEP, 80),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 14),
                        new ResourceChunk(ResourceType.JOB, 280),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.UPKEEP, 160),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 28),
                        new ResourceChunk(ResourceType.JOB, 560),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.UPKEEP, 240),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 42),
                        new ResourceChunk(ResourceType.JOB, 840),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.UPKEEP, 320),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 56),
                        new ResourceChunk(ResourceType.JOB, 1120),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.UPKEEP, 400),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 70),
                        new ResourceChunk(ResourceType.JOB, 1400),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.UPKEEP, 560),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 98),
                        new ResourceChunk(ResourceType.JOB, 1960),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.UPKEEP, 720),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 126),
                        new ResourceChunk(ResourceType.JOB, 2520),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.UPKEEP, 880),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 154),
                        new ResourceChunk(ResourceType.JOB, 3080),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.UPKEEP, 1040),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 182),
                        new ResourceChunk(ResourceType.JOB, 3640),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.UPKEEP, 1200),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 210),
                        new ResourceChunk(ResourceType.JOB, 4200),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.UPKEEP, 1440),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 252),
                        new ResourceChunk(ResourceType.JOB, 5040),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.UPKEEP, 1680),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 294),
                        new ResourceChunk(ResourceType.JOB, 5880),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.UPKEEP, 1920),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 336),
                        new ResourceChunk(ResourceType.JOB, 6720),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.UPKEEP, 2160),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 378),
                        new ResourceChunk(ResourceType.JOB, 7560),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.UPKEEP, 2400),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 420),
                        new ResourceChunk(ResourceType.JOB, 8400),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.UPKEEP, 2720),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 476),
                        new ResourceChunk(ResourceType.JOB, 9520),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.UPKEEP, 3040),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 532),
                        new ResourceChunk(ResourceType.JOB, 10640),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.UPKEEP, 3360),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 588),
                        new ResourceChunk(ResourceType.JOB, 11760),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.UPKEEP, 3680),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 644),
                        new ResourceChunk(ResourceType.JOB, 12880),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.UPKEEP, 4000),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 700),
                        new ResourceChunk(ResourceType.JOB, 14000),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                )
        });
        setHold(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.POWER, 14),
                        new ResourceChunk(ResourceType.WORKER, 280)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.POWER, 28),
                        new ResourceChunk(ResourceType.WORKER, 560)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.POWER, 42),
                        new ResourceChunk(ResourceType.WORKER, 840)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.POWER, 56),
                        new ResourceChunk(ResourceType.WORKER, 1120)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.POWER, 70),
                        new ResourceChunk(ResourceType.WORKER, 1400)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.POWER, 98),
                        new ResourceChunk(ResourceType.WORKER, 1960)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.POWER, 126),
                        new ResourceChunk(ResourceType.WORKER, 2520)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.POWER, 154),
                        new ResourceChunk(ResourceType.WORKER, 3080)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.POWER, 182),
                        new ResourceChunk(ResourceType.WORKER, 3640)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.POWER, 210),
                        new ResourceChunk(ResourceType.WORKER, 4200)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.POWER, 252),
                        new ResourceChunk(ResourceType.WORKER, 5040)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.POWER, 294),
                        new ResourceChunk(ResourceType.WORKER, 5880)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.POWER, 336),
                        new ResourceChunk(ResourceType.WORKER, 6720)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.POWER, 378),
                        new ResourceChunk(ResourceType.WORKER, 7560)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.POWER, 420),
                        new ResourceChunk(ResourceType.WORKER, 8400)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.POWER, 476),
                        new ResourceChunk(ResourceType.WORKER, 9520)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.POWER, 532),
                        new ResourceChunk(ResourceType.WORKER, 10640)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.POWER, 588),
                        new ResourceChunk(ResourceType.WORKER, 11760)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.POWER, 644),
                        new ResourceChunk(ResourceType.WORKER, 12880)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.POWER, 700),
                        new ResourceChunk(ResourceType.WORKER, 14000)
                )
        });
    }
}
