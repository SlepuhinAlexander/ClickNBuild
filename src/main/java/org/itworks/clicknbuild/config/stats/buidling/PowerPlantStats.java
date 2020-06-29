package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;
import org.itworks.clicknbuild.engine.model.ResourceType;

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
                        new ResourceChunk(ResourceType.CONSTRUCTION, 600),
                        new ResourceChunk(ResourceType.STEEL, 204),
                        new ResourceChunk(ResourceType.CONCRETE, 1020),
                        new ResourceChunk(ResourceType.BRICK, 510),
                        new ResourceChunk(ResourceType.GLASS, 102),
                        new ResourceChunk(ResourceType.MONEY, 30600)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.CONSTRUCTION, 1800),
                        new ResourceChunk(ResourceType.STEEL, 620),
                        new ResourceChunk(ResourceType.CONCRETE, 3100),
                        new ResourceChunk(ResourceType.BRICK, 1550),
                        new ResourceChunk(ResourceType.GLASS, 310),
                        new ResourceChunk(ResourceType.MONEY, 93000)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.CONSTRUCTION, 3600),
                        new ResourceChunk(ResourceType.STEEL, 1256),
                        new ResourceChunk(ResourceType.CONCRETE, 6280),
                        new ResourceChunk(ResourceType.BRICK, 3140),
                        new ResourceChunk(ResourceType.GLASS, 628),
                        new ResourceChunk(ResourceType.MONEY, 188400)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.CONSTRUCTION, 6000),
                        new ResourceChunk(ResourceType.STEEL, 2120),
                        new ResourceChunk(ResourceType.CONCRETE, 10600),
                        new ResourceChunk(ResourceType.BRICK, 5300),
                        new ResourceChunk(ResourceType.GLASS, 1060),
                        new ResourceChunk(ResourceType.MONEY, 318000)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.CONSTRUCTION, 9000),
                        new ResourceChunk(ResourceType.STEEL, 3220),
                        new ResourceChunk(ResourceType.CONCRETE, 16100),
                        new ResourceChunk(ResourceType.BRICK, 8050),
                        new ResourceChunk(ResourceType.GLASS, 1610),
                        new ResourceChunk(ResourceType.MONEY, 483000)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.CONSTRUCTION, 13200),
                        new ResourceChunk(ResourceType.STEEL, 4816),
                        new ResourceChunk(ResourceType.CONCRETE, 24080),
                        new ResourceChunk(ResourceType.BRICK, 12040),
                        new ResourceChunk(ResourceType.GLASS, 2408),
                        new ResourceChunk(ResourceType.MONEY, 722400)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.CONSTRUCTION, 18600),
                        new ResourceChunk(ResourceType.STEEL, 6940),
                        new ResourceChunk(ResourceType.CONCRETE, 34700),
                        new ResourceChunk(ResourceType.BRICK, 17350),
                        new ResourceChunk(ResourceType.GLASS, 3470),
                        new ResourceChunk(ResourceType.MONEY, 1041000)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.CONSTRUCTION, 25200),
                        new ResourceChunk(ResourceType.STEEL, 9624),
                        new ResourceChunk(ResourceType.CONCRETE, 48120),
                        new ResourceChunk(ResourceType.BRICK, 24060),
                        new ResourceChunk(ResourceType.GLASS, 4812),
                        new ResourceChunk(ResourceType.MONEY, 1443600)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.CONSTRUCTION, 33000),
                        new ResourceChunk(ResourceType.STEEL, 12900),
                        new ResourceChunk(ResourceType.CONCRETE, 64500),
                        new ResourceChunk(ResourceType.BRICK, 32250),
                        new ResourceChunk(ResourceType.GLASS, 6450),
                        new ResourceChunk(ResourceType.MONEY, 1935000)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.CONSTRUCTION, 42000),
                        new ResourceChunk(ResourceType.STEEL, 16800),
                        new ResourceChunk(ResourceType.CONCRETE, 84000),
                        new ResourceChunk(ResourceType.BRICK, 42000),
                        new ResourceChunk(ResourceType.GLASS, 8400),
                        new ResourceChunk(ResourceType.MONEY, 2520000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.CONSTRUCTION, 52800),
                        new ResourceChunk(ResourceType.STEEL, 21696),
                        new ResourceChunk(ResourceType.CONCRETE, 108480),
                        new ResourceChunk(ResourceType.BRICK, 54240),
                        new ResourceChunk(ResourceType.GLASS, 10848),
                        new ResourceChunk(ResourceType.MONEY, 3254400)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.CONSTRUCTION, 65400),
                        new ResourceChunk(ResourceType.STEEL, 27660),
                        new ResourceChunk(ResourceType.CONCRETE, 138300),
                        new ResourceChunk(ResourceType.BRICK, 69150),
                        new ResourceChunk(ResourceType.GLASS, 13830),
                        new ResourceChunk(ResourceType.MONEY, 4149000)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.CONSTRUCTION, 79800),
                        new ResourceChunk(ResourceType.STEEL, 34764),
                        new ResourceChunk(ResourceType.CONCRETE, 173820),
                        new ResourceChunk(ResourceType.BRICK, 86910),
                        new ResourceChunk(ResourceType.GLASS, 17382),
                        new ResourceChunk(ResourceType.MONEY, 5214600)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.CONSTRUCTION, 96000),
                        new ResourceChunk(ResourceType.STEEL, 43080),
                        new ResourceChunk(ResourceType.CONCRETE, 215400),
                        new ResourceChunk(ResourceType.BRICK, 107700),
                        new ResourceChunk(ResourceType.GLASS, 21540),
                        new ResourceChunk(ResourceType.MONEY, 6462000)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.CONSTRUCTION, 114000),
                        new ResourceChunk(ResourceType.STEEL, 52680),
                        new ResourceChunk(ResourceType.CONCRETE, 263400),
                        new ResourceChunk(ResourceType.BRICK, 131700),
                        new ResourceChunk(ResourceType.GLASS, 26340),
                        new ResourceChunk(ResourceType.MONEY, 7902000)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.CONSTRUCTION, 134400),
                        new ResourceChunk(ResourceType.STEEL, 64104),
                        new ResourceChunk(ResourceType.CONCRETE, 320520),
                        new ResourceChunk(ResourceType.BRICK, 160260),
                        new ResourceChunk(ResourceType.GLASS, 32052),
                        new ResourceChunk(ResourceType.MONEY, 9615600)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.CONSTRUCTION, 157200),
                        new ResourceChunk(ResourceType.STEEL, 77480),
                        new ResourceChunk(ResourceType.CONCRETE, 387400),
                        new ResourceChunk(ResourceType.BRICK, 193700),
                        new ResourceChunk(ResourceType.GLASS, 38740),
                        new ResourceChunk(ResourceType.MONEY, 11622000)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.CONSTRUCTION, 182400),
                        new ResourceChunk(ResourceType.STEEL, 92936),
                        new ResourceChunk(ResourceType.CONCRETE, 464680),
                        new ResourceChunk(ResourceType.BRICK, 232340),
                        new ResourceChunk(ResourceType.GLASS, 46468),
                        new ResourceChunk(ResourceType.MONEY, 13940400)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.CONSTRUCTION, 210000),
                        new ResourceChunk(ResourceType.STEEL, 110600),
                        new ResourceChunk(ResourceType.CONCRETE, 553000),
                        new ResourceChunk(ResourceType.BRICK, 276500),
                        new ResourceChunk(ResourceType.GLASS, 55300),
                        new ResourceChunk(ResourceType.MONEY, 16590000)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.CONSTRUCTION, 240000),
                        new ResourceChunk(ResourceType.STEEL, 130600),
                        new ResourceChunk(ResourceType.CONCRETE, 653000),
                        new ResourceChunk(ResourceType.BRICK, 326500),
                        new ResourceChunk(ResourceType.GLASS, 65300),
                        new ResourceChunk(ResourceType.MONEY, 19590000)
                )
        });
        setSupply(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.POWER, 100)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.POWER, 200)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.POWER, 300)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.POWER, 400)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.POWER, 500)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.POWER, 700)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.POWER, 900)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.POWER, 1100)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.POWER, 1300)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.POWER, 1500)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.POWER, 1800)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.POWER, 2100)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.POWER, 2400)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.POWER, 2700)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.POWER, 3000)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.POWER, 3400)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.POWER, 3800)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.POWER, 4200)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.POWER, 4600)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.POWER, 5000)
                )
        });
        setDemand(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.UPKEEP, 120),
                        new ResourceChunk(ResourceType.JOB, 240),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.UPKEEP, 240),
                        new ResourceChunk(ResourceType.JOB, 480),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.UPKEEP, 360),
                        new ResourceChunk(ResourceType.JOB, 720),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.UPKEEP, 480),
                        new ResourceChunk(ResourceType.JOB, 960),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.UPKEEP, 600),
                        new ResourceChunk(ResourceType.JOB, 1200),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.UPKEEP, 840),
                        new ResourceChunk(ResourceType.JOB, 1680),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.UPKEEP, 1080),
                        new ResourceChunk(ResourceType.JOB, 2160),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.UPKEEP, 1320),
                        new ResourceChunk(ResourceType.JOB, 2640),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.UPKEEP, 1560),
                        new ResourceChunk(ResourceType.JOB, 3120),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.UPKEEP, 1800),
                        new ResourceChunk(ResourceType.JOB, 3600),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.UPKEEP, 2160),
                        new ResourceChunk(ResourceType.JOB, 4320),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.UPKEEP, 2520),
                        new ResourceChunk(ResourceType.JOB, 5040),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.UPKEEP, 2880),
                        new ResourceChunk(ResourceType.JOB, 5760),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.UPKEEP, 3240),
                        new ResourceChunk(ResourceType.JOB, 6480),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.UPKEEP, 3600),
                        new ResourceChunk(ResourceType.JOB, 7200),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.UPKEEP, 4080),
                        new ResourceChunk(ResourceType.JOB, 8160),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.UPKEEP, 4560),
                        new ResourceChunk(ResourceType.JOB, 9120),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.UPKEEP, 5040),
                        new ResourceChunk(ResourceType.JOB, 10080),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.UPKEEP, 5520),
                        new ResourceChunk(ResourceType.JOB, 11040),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.UPKEEP, 6000),
                        new ResourceChunk(ResourceType.JOB, 12000),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                )
        });
        setHold(new ResourcePack[]{ // hold
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.WORKER, 240)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.WORKER, 480)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.WORKER, 720)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.WORKER, 960)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.WORKER, 1200)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.WORKER, 1680)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.WORKER, 2160)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.WORKER, 2640)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.WORKER, 3120)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.WORKER, 3600)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.WORKER, 4320)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.WORKER, 5040)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.WORKER, 5760)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.WORKER, 6480)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.WORKER, 7200)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.WORKER, 8160)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.WORKER, 9120)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.WORKER, 10080)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.WORKER, 11040)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.WORKER, 12000)
                )
        });
    }
}
