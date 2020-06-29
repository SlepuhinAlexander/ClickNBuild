package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResChunk;
import org.itworks.clicknbuild.engine.model.ResPack;
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
        setBuildCost(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.CONSTRUCTION, 600),
                        new ResChunk(ResType.STEEL, 204),
                        new ResChunk(ResType.CONCRETE, 1020),
                        new ResChunk(ResType.BRICK, 510),
                        new ResChunk(ResType.GLASS, 102),
                        new ResChunk(ResType.MONEY, 30600)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.CONSTRUCTION, 1800),
                        new ResChunk(ResType.STEEL, 620),
                        new ResChunk(ResType.CONCRETE, 3100),
                        new ResChunk(ResType.BRICK, 1550),
                        new ResChunk(ResType.GLASS, 310),
                        new ResChunk(ResType.MONEY, 93000)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.CONSTRUCTION, 3600),
                        new ResChunk(ResType.STEEL, 1256),
                        new ResChunk(ResType.CONCRETE, 6280),
                        new ResChunk(ResType.BRICK, 3140),
                        new ResChunk(ResType.GLASS, 628),
                        new ResChunk(ResType.MONEY, 188400)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.CONSTRUCTION, 6000),
                        new ResChunk(ResType.STEEL, 2120),
                        new ResChunk(ResType.CONCRETE, 10600),
                        new ResChunk(ResType.BRICK, 5300),
                        new ResChunk(ResType.GLASS, 1060),
                        new ResChunk(ResType.MONEY, 318000)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.CONSTRUCTION, 9000),
                        new ResChunk(ResType.STEEL, 3220),
                        new ResChunk(ResType.CONCRETE, 16100),
                        new ResChunk(ResType.BRICK, 8050),
                        new ResChunk(ResType.GLASS, 1610),
                        new ResChunk(ResType.MONEY, 483000)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.CONSTRUCTION, 13200),
                        new ResChunk(ResType.STEEL, 4816),
                        new ResChunk(ResType.CONCRETE, 24080),
                        new ResChunk(ResType.BRICK, 12040),
                        new ResChunk(ResType.GLASS, 2408),
                        new ResChunk(ResType.MONEY, 722400)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.CONSTRUCTION, 18600),
                        new ResChunk(ResType.STEEL, 6940),
                        new ResChunk(ResType.CONCRETE, 34700),
                        new ResChunk(ResType.BRICK, 17350),
                        new ResChunk(ResType.GLASS, 3470),
                        new ResChunk(ResType.MONEY, 1041000)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.CONSTRUCTION, 25200),
                        new ResChunk(ResType.STEEL, 9624),
                        new ResChunk(ResType.CONCRETE, 48120),
                        new ResChunk(ResType.BRICK, 24060),
                        new ResChunk(ResType.GLASS, 4812),
                        new ResChunk(ResType.MONEY, 1443600)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.CONSTRUCTION, 33000),
                        new ResChunk(ResType.STEEL, 12900),
                        new ResChunk(ResType.CONCRETE, 64500),
                        new ResChunk(ResType.BRICK, 32250),
                        new ResChunk(ResType.GLASS, 6450),
                        new ResChunk(ResType.MONEY, 1935000)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.CONSTRUCTION, 42000),
                        new ResChunk(ResType.STEEL, 16800),
                        new ResChunk(ResType.CONCRETE, 84000),
                        new ResChunk(ResType.BRICK, 42000),
                        new ResChunk(ResType.GLASS, 8400),
                        new ResChunk(ResType.MONEY, 2520000)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.CONSTRUCTION, 52800),
                        new ResChunk(ResType.STEEL, 21696),
                        new ResChunk(ResType.CONCRETE, 108480),
                        new ResChunk(ResType.BRICK, 54240),
                        new ResChunk(ResType.GLASS, 10848),
                        new ResChunk(ResType.MONEY, 3254400)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.CONSTRUCTION, 65400),
                        new ResChunk(ResType.STEEL, 27660),
                        new ResChunk(ResType.CONCRETE, 138300),
                        new ResChunk(ResType.BRICK, 69150),
                        new ResChunk(ResType.GLASS, 13830),
                        new ResChunk(ResType.MONEY, 4149000)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.CONSTRUCTION, 79800),
                        new ResChunk(ResType.STEEL, 34764),
                        new ResChunk(ResType.CONCRETE, 173820),
                        new ResChunk(ResType.BRICK, 86910),
                        new ResChunk(ResType.GLASS, 17382),
                        new ResChunk(ResType.MONEY, 5214600)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.CONSTRUCTION, 96000),
                        new ResChunk(ResType.STEEL, 43080),
                        new ResChunk(ResType.CONCRETE, 215400),
                        new ResChunk(ResType.BRICK, 107700),
                        new ResChunk(ResType.GLASS, 21540),
                        new ResChunk(ResType.MONEY, 6462000)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.CONSTRUCTION, 114000),
                        new ResChunk(ResType.STEEL, 52680),
                        new ResChunk(ResType.CONCRETE, 263400),
                        new ResChunk(ResType.BRICK, 131700),
                        new ResChunk(ResType.GLASS, 26340),
                        new ResChunk(ResType.MONEY, 7902000)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.CONSTRUCTION, 134400),
                        new ResChunk(ResType.STEEL, 64104),
                        new ResChunk(ResType.CONCRETE, 320520),
                        new ResChunk(ResType.BRICK, 160260),
                        new ResChunk(ResType.GLASS, 32052),
                        new ResChunk(ResType.MONEY, 9615600)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.CONSTRUCTION, 157200),
                        new ResChunk(ResType.STEEL, 77480),
                        new ResChunk(ResType.CONCRETE, 387400),
                        new ResChunk(ResType.BRICK, 193700),
                        new ResChunk(ResType.GLASS, 38740),
                        new ResChunk(ResType.MONEY, 11622000)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.CONSTRUCTION, 182400),
                        new ResChunk(ResType.STEEL, 92936),
                        new ResChunk(ResType.CONCRETE, 464680),
                        new ResChunk(ResType.BRICK, 232340),
                        new ResChunk(ResType.GLASS, 46468),
                        new ResChunk(ResType.MONEY, 13940400)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.CONSTRUCTION, 210000),
                        new ResChunk(ResType.STEEL, 110600),
                        new ResChunk(ResType.CONCRETE, 553000),
                        new ResChunk(ResType.BRICK, 276500),
                        new ResChunk(ResType.GLASS, 55300),
                        new ResChunk(ResType.MONEY, 16590000)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.CONSTRUCTION, 240000),
                        new ResChunk(ResType.STEEL, 130600),
                        new ResChunk(ResType.CONCRETE, 653000),
                        new ResChunk(ResType.BRICK, 326500),
                        new ResChunk(ResType.GLASS, 65300),
                        new ResChunk(ResType.MONEY, 19590000)
                )
        });
        setSupply(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.POWER, 100)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.POWER, 200)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.POWER, 300)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.POWER, 400)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.POWER, 500)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.POWER, 700)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.POWER, 900)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.POWER, 1100)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.POWER, 1300)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.POWER, 1500)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.POWER, 1800)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.POWER, 2100)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.POWER, 2400)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.POWER, 2700)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.POWER, 3000)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.POWER, 3400)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.POWER, 3800)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.POWER, 4200)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.POWER, 4600)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.POWER, 5000)
                )
        });
        setDemand(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.UPKEEP, 120),
                        new ResChunk(ResType.JOB, 240),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.UPKEEP, 240),
                        new ResChunk(ResType.JOB, 480),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.UPKEEP, 360),
                        new ResChunk(ResType.JOB, 720),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.UPKEEP, 480),
                        new ResChunk(ResType.JOB, 960),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.UPKEEP, 600),
                        new ResChunk(ResType.JOB, 1200),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.UPKEEP, 840),
                        new ResChunk(ResType.JOB, 1680),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.UPKEEP, 1080),
                        new ResChunk(ResType.JOB, 2160),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.UPKEEP, 1320),
                        new ResChunk(ResType.JOB, 2640),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.UPKEEP, 1560),
                        new ResChunk(ResType.JOB, 3120),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.UPKEEP, 1800),
                        new ResChunk(ResType.JOB, 3600),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.UPKEEP, 2160),
                        new ResChunk(ResType.JOB, 4320),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.UPKEEP, 2520),
                        new ResChunk(ResType.JOB, 5040),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.UPKEEP, 2880),
                        new ResChunk(ResType.JOB, 5760),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.UPKEEP, 3240),
                        new ResChunk(ResType.JOB, 6480),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.UPKEEP, 3600),
                        new ResChunk(ResType.JOB, 7200),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.UPKEEP, 4080),
                        new ResChunk(ResType.JOB, 8160),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.UPKEEP, 4560),
                        new ResChunk(ResType.JOB, 9120),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.UPKEEP, 5040),
                        new ResChunk(ResType.JOB, 10080),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.UPKEEP, 5520),
                        new ResChunk(ResType.JOB, 11040),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.UPKEEP, 6000),
                        new ResChunk(ResType.JOB, 12000),
                        new ResChunk(ResType.IGNITABILITY, 1)
                )
        });
        setHold(new ResPack[]{ // hold
                new ResPack( // 1
                        new ResChunk(ResType.WORKER, 240)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.WORKER, 480)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.WORKER, 720)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.WORKER, 960)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.WORKER, 1200)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.WORKER, 1680)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.WORKER, 2160)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.WORKER, 2640)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.WORKER, 3120)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.WORKER, 3600)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.WORKER, 4320)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.WORKER, 5040)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.WORKER, 5760)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.WORKER, 6480)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.WORKER, 7200)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.WORKER, 8160)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.WORKER, 9120)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.WORKER, 10080)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.WORKER, 11040)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.WORKER, 12000)
                )
        });
    }
}
