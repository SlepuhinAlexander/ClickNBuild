package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResStat;
import org.itworks.clicknbuild.engine.model.ResStatPack;
import org.itworks.clicknbuild.engine.model.ResType;

public final class PowerPlantStats extends BuildingStats {
    private static volatile PowerPlantStats inst;

    private PowerPlantStats() {
    }

    public static PowerPlantStats inst() {
        PowerPlantStats local = inst;
        if (local == null) {
            synchronized (PowerPlantStats.class) {
                local = inst;
                if (local == null) {
                    inst = local = new PowerPlantStats();
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
        setPriceMultiplier(115);
        setStructure(new int[]{
                600, // 1
                1800, // 2
                3600, // 3
                6000, // 4
                9000, // 5
                13200, // 6
                18600, // 7
                25200, // 8
                33000, // 9
                42000, // 10
                52800, // 11
                65400, // 12
                79800, // 13
                96000, // 14
                114000, // 15
                134400, // 16
                157200, // 17
                182400, // 18
                210000, // 19
                240000 // 20
        });
        setBuildCost(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.CONSTRUCTION, 600),
                        new ResStat(ResType.STEEL, 204),
                        new ResStat(ResType.CONCRETE, 1020),
                        new ResStat(ResType.BRICK, 510),
                        new ResStat(ResType.GLASS, 102),
                        new ResStat(ResType.MONEY, 30600)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.CONSTRUCTION, 1800),
                        new ResStat(ResType.STEEL, 620),
                        new ResStat(ResType.CONCRETE, 3100),
                        new ResStat(ResType.BRICK, 1550),
                        new ResStat(ResType.GLASS, 310),
                        new ResStat(ResType.MONEY, 93000)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.CONSTRUCTION, 3600),
                        new ResStat(ResType.STEEL, 1256),
                        new ResStat(ResType.CONCRETE, 6280),
                        new ResStat(ResType.BRICK, 3140),
                        new ResStat(ResType.GLASS, 628),
                        new ResStat(ResType.MONEY, 188400)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.CONSTRUCTION, 6000),
                        new ResStat(ResType.STEEL, 2120),
                        new ResStat(ResType.CONCRETE, 10600),
                        new ResStat(ResType.BRICK, 5300),
                        new ResStat(ResType.GLASS, 1060),
                        new ResStat(ResType.MONEY, 318000)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.CONSTRUCTION, 9000),
                        new ResStat(ResType.STEEL, 3220),
                        new ResStat(ResType.CONCRETE, 16100),
                        new ResStat(ResType.BRICK, 8050),
                        new ResStat(ResType.GLASS, 1610),
                        new ResStat(ResType.MONEY, 483000)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.CONSTRUCTION, 13200),
                        new ResStat(ResType.STEEL, 4816),
                        new ResStat(ResType.CONCRETE, 24080),
                        new ResStat(ResType.BRICK, 12040),
                        new ResStat(ResType.GLASS, 2408),
                        new ResStat(ResType.MONEY, 722400)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.CONSTRUCTION, 18600),
                        new ResStat(ResType.STEEL, 6940),
                        new ResStat(ResType.CONCRETE, 34700),
                        new ResStat(ResType.BRICK, 17350),
                        new ResStat(ResType.GLASS, 3470),
                        new ResStat(ResType.MONEY, 1041000)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.CONSTRUCTION, 25200),
                        new ResStat(ResType.STEEL, 9624),
                        new ResStat(ResType.CONCRETE, 48120),
                        new ResStat(ResType.BRICK, 24060),
                        new ResStat(ResType.GLASS, 4812),
                        new ResStat(ResType.MONEY, 1443600)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.CONSTRUCTION, 33000),
                        new ResStat(ResType.STEEL, 12900),
                        new ResStat(ResType.CONCRETE, 64500),
                        new ResStat(ResType.BRICK, 32250),
                        new ResStat(ResType.GLASS, 6450),
                        new ResStat(ResType.MONEY, 1935000)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.CONSTRUCTION, 42000),
                        new ResStat(ResType.STEEL, 16800),
                        new ResStat(ResType.CONCRETE, 84000),
                        new ResStat(ResType.BRICK, 42000),
                        new ResStat(ResType.GLASS, 8400),
                        new ResStat(ResType.MONEY, 2520000)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.CONSTRUCTION, 52800),
                        new ResStat(ResType.STEEL, 21696),
                        new ResStat(ResType.CONCRETE, 108480),
                        new ResStat(ResType.BRICK, 54240),
                        new ResStat(ResType.GLASS, 10848),
                        new ResStat(ResType.MONEY, 3254400)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.CONSTRUCTION, 65400),
                        new ResStat(ResType.STEEL, 27660),
                        new ResStat(ResType.CONCRETE, 138300),
                        new ResStat(ResType.BRICK, 69150),
                        new ResStat(ResType.GLASS, 13830),
                        new ResStat(ResType.MONEY, 4149000)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.CONSTRUCTION, 79800),
                        new ResStat(ResType.STEEL, 34764),
                        new ResStat(ResType.CONCRETE, 173820),
                        new ResStat(ResType.BRICK, 86910),
                        new ResStat(ResType.GLASS, 17382),
                        new ResStat(ResType.MONEY, 5214600)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.CONSTRUCTION, 96000),
                        new ResStat(ResType.STEEL, 43080),
                        new ResStat(ResType.CONCRETE, 215400),
                        new ResStat(ResType.BRICK, 107700),
                        new ResStat(ResType.GLASS, 21540),
                        new ResStat(ResType.MONEY, 6462000)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.CONSTRUCTION, 114000),
                        new ResStat(ResType.STEEL, 52680),
                        new ResStat(ResType.CONCRETE, 263400),
                        new ResStat(ResType.BRICK, 131700),
                        new ResStat(ResType.GLASS, 26340),
                        new ResStat(ResType.MONEY, 7902000)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.CONSTRUCTION, 134400),
                        new ResStat(ResType.STEEL, 64104),
                        new ResStat(ResType.CONCRETE, 320520),
                        new ResStat(ResType.BRICK, 160260),
                        new ResStat(ResType.GLASS, 32052),
                        new ResStat(ResType.MONEY, 9615600)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.CONSTRUCTION, 157200),
                        new ResStat(ResType.STEEL, 77480),
                        new ResStat(ResType.CONCRETE, 387400),
                        new ResStat(ResType.BRICK, 193700),
                        new ResStat(ResType.GLASS, 38740),
                        new ResStat(ResType.MONEY, 11622000)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.CONSTRUCTION, 182400),
                        new ResStat(ResType.STEEL, 92936),
                        new ResStat(ResType.CONCRETE, 464680),
                        new ResStat(ResType.BRICK, 232340),
                        new ResStat(ResType.GLASS, 46468),
                        new ResStat(ResType.MONEY, 13940400)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.CONSTRUCTION, 210000),
                        new ResStat(ResType.STEEL, 110600),
                        new ResStat(ResType.CONCRETE, 553000),
                        new ResStat(ResType.BRICK, 276500),
                        new ResStat(ResType.GLASS, 55300),
                        new ResStat(ResType.MONEY, 16590000)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.CONSTRUCTION, 240000),
                        new ResStat(ResType.STEEL, 130600),
                        new ResStat(ResType.CONCRETE, 653000),
                        new ResStat(ResType.BRICK, 326500),
                        new ResStat(ResType.GLASS, 65300),
                        new ResStat(ResType.MONEY, 19590000)
                )
        });
        setSupply(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.POWER, 100)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.POWER, 200)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.POWER, 300)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.POWER, 400)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.POWER, 500)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.POWER, 700)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.POWER, 900)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.POWER, 1100)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.POWER, 1300)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.POWER, 1500)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.POWER, 1800)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.POWER, 2100)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.POWER, 2400)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.POWER, 2700)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.POWER, 3000)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.POWER, 3400)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.POWER, 3800)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.POWER, 4200)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.POWER, 4600)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.POWER, 5000)
                )
        });
        setDemand(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.UPKEEP, 120),
                        new ResStat(ResType.JOB, 240),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.UPKEEP, 240),
                        new ResStat(ResType.JOB, 480),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.UPKEEP, 360),
                        new ResStat(ResType.JOB, 720),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.UPKEEP, 480),
                        new ResStat(ResType.JOB, 960),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.UPKEEP, 600),
                        new ResStat(ResType.JOB, 1200),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.UPKEEP, 840),
                        new ResStat(ResType.JOB, 1680),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.UPKEEP, 1080),
                        new ResStat(ResType.JOB, 2160),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.UPKEEP, 1320),
                        new ResStat(ResType.JOB, 2640),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.UPKEEP, 1560),
                        new ResStat(ResType.JOB, 3120),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.UPKEEP, 1800),
                        new ResStat(ResType.JOB, 3600),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.UPKEEP, 2160),
                        new ResStat(ResType.JOB, 4320),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.UPKEEP, 2520),
                        new ResStat(ResType.JOB, 5040),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.UPKEEP, 2880),
                        new ResStat(ResType.JOB, 5760),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.UPKEEP, 3240),
                        new ResStat(ResType.JOB, 6480),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.UPKEEP, 3600),
                        new ResStat(ResType.JOB, 7200),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.UPKEEP, 4080),
                        new ResStat(ResType.JOB, 8160),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.UPKEEP, 4560),
                        new ResStat(ResType.JOB, 9120),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.UPKEEP, 5040),
                        new ResStat(ResType.JOB, 10080),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.UPKEEP, 5520),
                        new ResStat(ResType.JOB, 11040),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.UPKEEP, 6000),
                        new ResStat(ResType.JOB, 12000),
                        new ResStat(ResType.IGNITABILITY, 1)
                )
        });
        setHold(new ResStatPack[]{ // hold
                new ResStatPack( // 1
                        new ResStat(ResType.WORKER, 240)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.WORKER, 480)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.WORKER, 720)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.WORKER, 960)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.WORKER, 1200)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.WORKER, 1680)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.WORKER, 2160)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.WORKER, 2640)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.WORKER, 3120)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.WORKER, 3600)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.WORKER, 4320)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.WORKER, 5040)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.WORKER, 5760)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.WORKER, 6480)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.WORKER, 7200)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.WORKER, 8160)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.WORKER, 9120)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.WORKER, 10080)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.WORKER, 11040)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.WORKER, 12000)
                )
        });
    }
}
