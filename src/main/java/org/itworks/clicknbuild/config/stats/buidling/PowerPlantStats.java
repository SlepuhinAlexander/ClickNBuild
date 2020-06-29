package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;
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
        setBuildCost(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.CONSTRUCTION, 600),
                        new ResourceChunk(ResType.STEEL, 204),
                        new ResourceChunk(ResType.CONCRETE, 1020),
                        new ResourceChunk(ResType.BRICK, 510),
                        new ResourceChunk(ResType.GLASS, 102),
                        new ResourceChunk(ResType.MONEY, 30600)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.CONSTRUCTION, 1800),
                        new ResourceChunk(ResType.STEEL, 620),
                        new ResourceChunk(ResType.CONCRETE, 3100),
                        new ResourceChunk(ResType.BRICK, 1550),
                        new ResourceChunk(ResType.GLASS, 310),
                        new ResourceChunk(ResType.MONEY, 93000)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.CONSTRUCTION, 3600),
                        new ResourceChunk(ResType.STEEL, 1256),
                        new ResourceChunk(ResType.CONCRETE, 6280),
                        new ResourceChunk(ResType.BRICK, 3140),
                        new ResourceChunk(ResType.GLASS, 628),
                        new ResourceChunk(ResType.MONEY, 188400)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.CONSTRUCTION, 6000),
                        new ResourceChunk(ResType.STEEL, 2120),
                        new ResourceChunk(ResType.CONCRETE, 10600),
                        new ResourceChunk(ResType.BRICK, 5300),
                        new ResourceChunk(ResType.GLASS, 1060),
                        new ResourceChunk(ResType.MONEY, 318000)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.CONSTRUCTION, 9000),
                        new ResourceChunk(ResType.STEEL, 3220),
                        new ResourceChunk(ResType.CONCRETE, 16100),
                        new ResourceChunk(ResType.BRICK, 8050),
                        new ResourceChunk(ResType.GLASS, 1610),
                        new ResourceChunk(ResType.MONEY, 483000)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.CONSTRUCTION, 13200),
                        new ResourceChunk(ResType.STEEL, 4816),
                        new ResourceChunk(ResType.CONCRETE, 24080),
                        new ResourceChunk(ResType.BRICK, 12040),
                        new ResourceChunk(ResType.GLASS, 2408),
                        new ResourceChunk(ResType.MONEY, 722400)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.CONSTRUCTION, 18600),
                        new ResourceChunk(ResType.STEEL, 6940),
                        new ResourceChunk(ResType.CONCRETE, 34700),
                        new ResourceChunk(ResType.BRICK, 17350),
                        new ResourceChunk(ResType.GLASS, 3470),
                        new ResourceChunk(ResType.MONEY, 1041000)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.CONSTRUCTION, 25200),
                        new ResourceChunk(ResType.STEEL, 9624),
                        new ResourceChunk(ResType.CONCRETE, 48120),
                        new ResourceChunk(ResType.BRICK, 24060),
                        new ResourceChunk(ResType.GLASS, 4812),
                        new ResourceChunk(ResType.MONEY, 1443600)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.CONSTRUCTION, 33000),
                        new ResourceChunk(ResType.STEEL, 12900),
                        new ResourceChunk(ResType.CONCRETE, 64500),
                        new ResourceChunk(ResType.BRICK, 32250),
                        new ResourceChunk(ResType.GLASS, 6450),
                        new ResourceChunk(ResType.MONEY, 1935000)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.CONSTRUCTION, 42000),
                        new ResourceChunk(ResType.STEEL, 16800),
                        new ResourceChunk(ResType.CONCRETE, 84000),
                        new ResourceChunk(ResType.BRICK, 42000),
                        new ResourceChunk(ResType.GLASS, 8400),
                        new ResourceChunk(ResType.MONEY, 2520000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.CONSTRUCTION, 52800),
                        new ResourceChunk(ResType.STEEL, 21696),
                        new ResourceChunk(ResType.CONCRETE, 108480),
                        new ResourceChunk(ResType.BRICK, 54240),
                        new ResourceChunk(ResType.GLASS, 10848),
                        new ResourceChunk(ResType.MONEY, 3254400)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.CONSTRUCTION, 65400),
                        new ResourceChunk(ResType.STEEL, 27660),
                        new ResourceChunk(ResType.CONCRETE, 138300),
                        new ResourceChunk(ResType.BRICK, 69150),
                        new ResourceChunk(ResType.GLASS, 13830),
                        new ResourceChunk(ResType.MONEY, 4149000)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.CONSTRUCTION, 79800),
                        new ResourceChunk(ResType.STEEL, 34764),
                        new ResourceChunk(ResType.CONCRETE, 173820),
                        new ResourceChunk(ResType.BRICK, 86910),
                        new ResourceChunk(ResType.GLASS, 17382),
                        new ResourceChunk(ResType.MONEY, 5214600)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.CONSTRUCTION, 96000),
                        new ResourceChunk(ResType.STEEL, 43080),
                        new ResourceChunk(ResType.CONCRETE, 215400),
                        new ResourceChunk(ResType.BRICK, 107700),
                        new ResourceChunk(ResType.GLASS, 21540),
                        new ResourceChunk(ResType.MONEY, 6462000)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.CONSTRUCTION, 114000),
                        new ResourceChunk(ResType.STEEL, 52680),
                        new ResourceChunk(ResType.CONCRETE, 263400),
                        new ResourceChunk(ResType.BRICK, 131700),
                        new ResourceChunk(ResType.GLASS, 26340),
                        new ResourceChunk(ResType.MONEY, 7902000)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.CONSTRUCTION, 134400),
                        new ResourceChunk(ResType.STEEL, 64104),
                        new ResourceChunk(ResType.CONCRETE, 320520),
                        new ResourceChunk(ResType.BRICK, 160260),
                        new ResourceChunk(ResType.GLASS, 32052),
                        new ResourceChunk(ResType.MONEY, 9615600)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.CONSTRUCTION, 157200),
                        new ResourceChunk(ResType.STEEL, 77480),
                        new ResourceChunk(ResType.CONCRETE, 387400),
                        new ResourceChunk(ResType.BRICK, 193700),
                        new ResourceChunk(ResType.GLASS, 38740),
                        new ResourceChunk(ResType.MONEY, 11622000)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.CONSTRUCTION, 182400),
                        new ResourceChunk(ResType.STEEL, 92936),
                        new ResourceChunk(ResType.CONCRETE, 464680),
                        new ResourceChunk(ResType.BRICK, 232340),
                        new ResourceChunk(ResType.GLASS, 46468),
                        new ResourceChunk(ResType.MONEY, 13940400)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.CONSTRUCTION, 210000),
                        new ResourceChunk(ResType.STEEL, 110600),
                        new ResourceChunk(ResType.CONCRETE, 553000),
                        new ResourceChunk(ResType.BRICK, 276500),
                        new ResourceChunk(ResType.GLASS, 55300),
                        new ResourceChunk(ResType.MONEY, 16590000)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.CONSTRUCTION, 240000),
                        new ResourceChunk(ResType.STEEL, 130600),
                        new ResourceChunk(ResType.CONCRETE, 653000),
                        new ResourceChunk(ResType.BRICK, 326500),
                        new ResourceChunk(ResType.GLASS, 65300),
                        new ResourceChunk(ResType.MONEY, 19590000)
                )
        });
        setSupply(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.POWER, 100)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.POWER, 200)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.POWER, 300)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.POWER, 400)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.POWER, 500)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.POWER, 700)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.POWER, 900)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.POWER, 1100)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.POWER, 1300)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.POWER, 1500)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.POWER, 1800)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.POWER, 2100)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.POWER, 2400)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.POWER, 2700)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.POWER, 3000)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.POWER, 3400)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.POWER, 3800)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.POWER, 4200)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.POWER, 4600)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.POWER, 5000)
                )
        });
        setDemand(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.UPKEEP, 120),
                        new ResourceChunk(ResType.JOB, 240),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.UPKEEP, 240),
                        new ResourceChunk(ResType.JOB, 480),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.UPKEEP, 360),
                        new ResourceChunk(ResType.JOB, 720),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.UPKEEP, 480),
                        new ResourceChunk(ResType.JOB, 960),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.UPKEEP, 600),
                        new ResourceChunk(ResType.JOB, 1200),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.UPKEEP, 840),
                        new ResourceChunk(ResType.JOB, 1680),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.UPKEEP, 1080),
                        new ResourceChunk(ResType.JOB, 2160),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.UPKEEP, 1320),
                        new ResourceChunk(ResType.JOB, 2640),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.UPKEEP, 1560),
                        new ResourceChunk(ResType.JOB, 3120),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.UPKEEP, 1800),
                        new ResourceChunk(ResType.JOB, 3600),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.UPKEEP, 2160),
                        new ResourceChunk(ResType.JOB, 4320),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.UPKEEP, 2520),
                        new ResourceChunk(ResType.JOB, 5040),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.UPKEEP, 2880),
                        new ResourceChunk(ResType.JOB, 5760),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.UPKEEP, 3240),
                        new ResourceChunk(ResType.JOB, 6480),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.UPKEEP, 3600),
                        new ResourceChunk(ResType.JOB, 7200),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.UPKEEP, 4080),
                        new ResourceChunk(ResType.JOB, 8160),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.UPKEEP, 4560),
                        new ResourceChunk(ResType.JOB, 9120),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.UPKEEP, 5040),
                        new ResourceChunk(ResType.JOB, 10080),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.UPKEEP, 5520),
                        new ResourceChunk(ResType.JOB, 11040),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.UPKEEP, 6000),
                        new ResourceChunk(ResType.JOB, 12000),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                )
        });
        setHold(new ResourcePack[]{ // hold
                new ResourcePack( // 1
                        new ResourceChunk(ResType.WORKER, 240)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.WORKER, 480)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.WORKER, 720)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.WORKER, 960)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.WORKER, 1200)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.WORKER, 1680)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.WORKER, 2160)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.WORKER, 2640)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.WORKER, 3120)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.WORKER, 3600)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.WORKER, 4320)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.WORKER, 5040)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.WORKER, 5760)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.WORKER, 6480)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.WORKER, 7200)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.WORKER, 8160)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.WORKER, 9120)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.WORKER, 10080)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.WORKER, 11040)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.WORKER, 12000)
                )
        });
    }
}
