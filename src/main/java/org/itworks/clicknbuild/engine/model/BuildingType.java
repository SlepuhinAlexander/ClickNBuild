package org.itworks.clicknbuild.engine.model;

import org.itworks.clicknbuild.sources.Images;
import org.itworks.clicknbuild.sources.Strings;
import org.itworks.clicknbuild.util.math.M;
import org.itworks.clicknbuild.util.string.Str;

import java.util.Objects;

public enum BuildingType {
    HEADQUARTER("headquarter",
            Strings.BLD_HEADQUARTER,
            Images.BLD_HEADQUARTER,
            1, // requiredPlayerLevel
            1, // maxLevel
            1, // buildLimit
            100, // priceMultiplier
            null, // structure
            null, // buildCost
            null, // jobPrice
            null, // jobReward
            null, // jobRewardMultiplier
            null, // production
            null, // productionMultiplier
            null, // supply
            null, // supplyMultiplier
            null, // demand
            null, // hold
            null, // store
            null), // storeMultiplier
    ROAD("road",
            Strings.BLD_ROAD,
            Images.BLD_ROAD,
            1, // requiredPlayerLevel
            1, // maxLevel
            1000, // buildLimit
            105, // priceMultiplier
            new int[]{ // structure
                    500 // 1
            },
            new ResourcePack[]{ // buildCost
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.CONSTRUCTION, 500),
                            new ResourceChunk(ResourceType.CONCRETE, 50),
                            new ResourceChunk(ResourceType.MONEY, 500)
                    )
            },
            null, // jobPrice
            null, // jobReward
            null, // jobRewardMultiplier
            null, // production
            null, // productionMultiplier
            null, // supply
            null, // supplyMultiplier
            null, // demand
            null, // hold
            null, // store
            null), // storeMultiplier
    POWER_PLANT("power_plant",
            Strings.BLD_POWER_PLANT,
            Images.BLD_POWER_PLANT,
            1, // requiredPlayerLevel
            1, // maxLevel
            1000, // buildLimit
            115, // priceMultiplier
            new int[]{ // structure
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
            },
            new ResourcePack[]{ // buildCost
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.CONSTRUCTION, 600),
                            new ResourceChunk(ResourceType.STEEL, 204),
                            new ResourceChunk(ResourceType.CONCRETE, 1020),
                            new ResourceChunk(ResourceType.GLASS, 102),
                            new ResourceChunk(ResourceType.MONEY, 30600)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.CONSTRUCTION, 1800),
                            new ResourceChunk(ResourceType.STEEL, 620),
                            new ResourceChunk(ResourceType.CONCRETE, 3100),
                            new ResourceChunk(ResourceType.GLASS, 310),
                            new ResourceChunk(ResourceType.MONEY, 93000)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.CONSTRUCTION, 3600),
                            new ResourceChunk(ResourceType.STEEL, 1256),
                            new ResourceChunk(ResourceType.CONCRETE, 6280),
                            new ResourceChunk(ResourceType.GLASS, 628),
                            new ResourceChunk(ResourceType.MONEY, 188400)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.CONSTRUCTION, 6000),
                            new ResourceChunk(ResourceType.STEEL, 2120),
                            new ResourceChunk(ResourceType.CONCRETE, 10600),
                            new ResourceChunk(ResourceType.GLASS, 1060),
                            new ResourceChunk(ResourceType.MONEY, 318000)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.CONSTRUCTION, 9000),
                            new ResourceChunk(ResourceType.STEEL, 3220),
                            new ResourceChunk(ResourceType.CONCRETE, 16100),
                            new ResourceChunk(ResourceType.GLASS, 1610),
                            new ResourceChunk(ResourceType.MONEY, 483000)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.CONSTRUCTION, 13200),
                            new ResourceChunk(ResourceType.STEEL, 4816),
                            new ResourceChunk(ResourceType.CONCRETE, 24080),
                            new ResourceChunk(ResourceType.GLASS, 2408),
                            new ResourceChunk(ResourceType.MONEY, 722400)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.CONSTRUCTION, 18600),
                            new ResourceChunk(ResourceType.STEEL, 6940),
                            new ResourceChunk(ResourceType.CONCRETE, 34700),
                            new ResourceChunk(ResourceType.GLASS, 3470),
                            new ResourceChunk(ResourceType.MONEY, 1041000)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.CONSTRUCTION, 25200),
                            new ResourceChunk(ResourceType.STEEL, 9624),
                            new ResourceChunk(ResourceType.CONCRETE, 48120),
                            new ResourceChunk(ResourceType.GLASS, 4812),
                            new ResourceChunk(ResourceType.MONEY, 1443600)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.CONSTRUCTION, 33000),
                            new ResourceChunk(ResourceType.STEEL, 12900),
                            new ResourceChunk(ResourceType.CONCRETE, 64500),
                            new ResourceChunk(ResourceType.GLASS, 6450),
                            new ResourceChunk(ResourceType.MONEY, 1935000)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.CONSTRUCTION, 42000),
                            new ResourceChunk(ResourceType.STEEL, 16800),
                            new ResourceChunk(ResourceType.CONCRETE, 84000),
                            new ResourceChunk(ResourceType.GLASS, 8400),
                            new ResourceChunk(ResourceType.MONEY, 2520000)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.CONSTRUCTION, 52800),
                            new ResourceChunk(ResourceType.STEEL, 21696),
                            new ResourceChunk(ResourceType.CONCRETE, 108480),
                            new ResourceChunk(ResourceType.GLASS, 10848),
                            new ResourceChunk(ResourceType.MONEY, 3254400)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.CONSTRUCTION, 65400),
                            new ResourceChunk(ResourceType.STEEL, 27660),
                            new ResourceChunk(ResourceType.CONCRETE, 138300),
                            new ResourceChunk(ResourceType.GLASS, 13830),
                            new ResourceChunk(ResourceType.MONEY, 4149000)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.CONSTRUCTION, 79800),
                            new ResourceChunk(ResourceType.STEEL, 34764),
                            new ResourceChunk(ResourceType.CONCRETE, 173820),
                            new ResourceChunk(ResourceType.GLASS, 17382),
                            new ResourceChunk(ResourceType.MONEY, 5214600)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.CONSTRUCTION, 96000),
                            new ResourceChunk(ResourceType.STEEL, 43080),
                            new ResourceChunk(ResourceType.CONCRETE, 215400),
                            new ResourceChunk(ResourceType.GLASS, 21540),
                            new ResourceChunk(ResourceType.MONEY, 6462000)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.CONSTRUCTION, 114000),
                            new ResourceChunk(ResourceType.STEEL, 52680),
                            new ResourceChunk(ResourceType.CONCRETE, 263400),
                            new ResourceChunk(ResourceType.GLASS, 26340),
                            new ResourceChunk(ResourceType.MONEY, 7902000)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.CONSTRUCTION, 134400),
                            new ResourceChunk(ResourceType.STEEL, 64104),
                            new ResourceChunk(ResourceType.CONCRETE, 320520),
                            new ResourceChunk(ResourceType.GLASS, 32052),
                            new ResourceChunk(ResourceType.MONEY, 9615600)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.CONSTRUCTION, 157200),
                            new ResourceChunk(ResourceType.STEEL, 77480),
                            new ResourceChunk(ResourceType.CONCRETE, 387400),
                            new ResourceChunk(ResourceType.GLASS, 38740),
                            new ResourceChunk(ResourceType.MONEY, 11622000)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.CONSTRUCTION, 182400),
                            new ResourceChunk(ResourceType.STEEL, 92936),
                            new ResourceChunk(ResourceType.CONCRETE, 464680),
                            new ResourceChunk(ResourceType.GLASS, 46468),
                            new ResourceChunk(ResourceType.MONEY, 13940400)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.CONSTRUCTION, 210000),
                            new ResourceChunk(ResourceType.STEEL, 110600),
                            new ResourceChunk(ResourceType.CONCRETE, 553000),
                            new ResourceChunk(ResourceType.GLASS, 55300),
                            new ResourceChunk(ResourceType.MONEY, 16590000)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.CONSTRUCTION, 240000),
                            new ResourceChunk(ResourceType.STEEL, 130600),
                            new ResourceChunk(ResourceType.CONCRETE, 653000),
                            new ResourceChunk(ResourceType.GLASS, 65300),
                            new ResourceChunk(ResourceType.MONEY, 19590000)
                    )
            },
            null, // jobPrice
            null, // jobReward
            null, // jobRewardMultiplier
            null, // production
            null, // productionMultiplier
            new ResourcePack[]{ // supply
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
            },
            null, // supplyMultiplier
            new ResourcePack[]{ // demand
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
            },
            new ResourcePack[]{ // hold
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.JOB, 240),
                            new ResourceChunk(ResourceType.WORKER, 240)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.JOB, 480),
                            new ResourceChunk(ResourceType.WORKER, 480)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.JOB, 720),
                            new ResourceChunk(ResourceType.WORKER, 720)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.JOB, 960),
                            new ResourceChunk(ResourceType.WORKER, 960)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.JOB, 1200),
                            new ResourceChunk(ResourceType.WORKER, 1200)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.JOB, 1680),
                            new ResourceChunk(ResourceType.WORKER, 1680)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.JOB, 2160),
                            new ResourceChunk(ResourceType.WORKER, 2160)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.JOB, 2640),
                            new ResourceChunk(ResourceType.WORKER, 2640)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.JOB, 3120),
                            new ResourceChunk(ResourceType.WORKER, 3120)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.JOB, 3600),
                            new ResourceChunk(ResourceType.WORKER, 3600)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.JOB, 4320),
                            new ResourceChunk(ResourceType.WORKER, 4320)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.JOB, 5040),
                            new ResourceChunk(ResourceType.WORKER, 5040)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.JOB, 5760),
                            new ResourceChunk(ResourceType.WORKER, 5760)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.JOB, 6480),
                            new ResourceChunk(ResourceType.WORKER, 6480)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.JOB, 7200),
                            new ResourceChunk(ResourceType.WORKER, 7200)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.JOB, 8160),
                            new ResourceChunk(ResourceType.WORKER, 8160)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.JOB, 9120),
                            new ResourceChunk(ResourceType.WORKER, 9120)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.JOB, 10080),
                            new ResourceChunk(ResourceType.WORKER, 10080)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.JOB, 11040),
                            new ResourceChunk(ResourceType.WORKER, 11040)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.JOB, 12000),
                            new ResourceChunk(ResourceType.WORKER, 12000)
                    )
            },
            null, // store
            null), // storeMultiplier
    FACTORY_STEEL("factory_steel",
            Strings.BLD_FACTORY_STEEL,
            Images.BLD_FACTORY_STEEL,
            1, // requiredPlayerLevel
            1, // maxLevel
            1000, // buildLimit
            132, // priceMultiplier
            new int[]{ // structure
                    800, // 1
                    2400, // 2
                    4800, // 3
                    8000, // 4
                    12000, // 5
                    17600, // 6
                    24800, // 7
                    33600, // 8
                    44000, // 9
                    56000, // 10
                    70400, // 11
                    87200, // 12
                    106400, // 13
                    128000, // 14
                    152000, // 15
                    179200, // 16
                    209600, // 17
                    243200, // 18
                    280000, // 19
                    320000, // 20
            },
            new ResourcePack[]{  // buildCost
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.CONSTRUCTION, 800),
                            new ResourceChunk(ResourceType.CONCRETE, 1275),
                            new ResourceChunk(ResourceType.BRICK, 1020),
                            new ResourceChunk(ResourceType.WOOD, 71),
                            new ResourceChunk(ResourceType.GLASS, 143),
                            new ResourceChunk(ResourceType.MONEY, 40800)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.CONSTRUCTION, 2400),
                            new ResourceChunk(ResourceType.CONCRETE, 3875),
                            new ResourceChunk(ResourceType.BRICK, 3100),
                            new ResourceChunk(ResourceType.WOOD, 217),
                            new ResourceChunk(ResourceType.GLASS, 434),
                            new ResourceChunk(ResourceType.MONEY, 124000)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.CONSTRUCTION, 4800),
                            new ResourceChunk(ResourceType.CONCRETE, 7850),
                            new ResourceChunk(ResourceType.BRICK, 6280),
                            new ResourceChunk(ResourceType.WOOD, 440),
                            new ResourceChunk(ResourceType.GLASS, 879),
                            new ResourceChunk(ResourceType.MONEY, 251200)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.CONSTRUCTION, 8000),
                            new ResourceChunk(ResourceType.CONCRETE, 13250),
                            new ResourceChunk(ResourceType.BRICK, 10600),
                            new ResourceChunk(ResourceType.WOOD, 742),
                            new ResourceChunk(ResourceType.GLASS, 1484),
                            new ResourceChunk(ResourceType.MONEY, 424000)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.CONSTRUCTION, 12000),
                            new ResourceChunk(ResourceType.CONCRETE, 20125),
                            new ResourceChunk(ResourceType.BRICK, 16100),
                            new ResourceChunk(ResourceType.WOOD, 1127),
                            new ResourceChunk(ResourceType.GLASS, 2254),
                            new ResourceChunk(ResourceType.MONEY, 644000)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.CONSTRUCTION, 17600),
                            new ResourceChunk(ResourceType.CONCRETE, 30100),
                            new ResourceChunk(ResourceType.BRICK, 24080),
                            new ResourceChunk(ResourceType.WOOD, 1686),
                            new ResourceChunk(ResourceType.GLASS, 3371),
                            new ResourceChunk(ResourceType.MONEY, 963200)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.CONSTRUCTION, 24800),
                            new ResourceChunk(ResourceType.CONCRETE, 43375),
                            new ResourceChunk(ResourceType.BRICK, 34700),
                            new ResourceChunk(ResourceType.WOOD, 2429),
                            new ResourceChunk(ResourceType.GLASS, 4858),
                            new ResourceChunk(ResourceType.MONEY, 1388000)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.CONSTRUCTION, 33600),
                            new ResourceChunk(ResourceType.CONCRETE, 60150),
                            new ResourceChunk(ResourceType.BRICK, 48120),
                            new ResourceChunk(ResourceType.WOOD, 3368),
                            new ResourceChunk(ResourceType.GLASS, 67737),
                            new ResourceChunk(ResourceType.MONEY, 1924800)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.CONSTRUCTION, 44000),
                            new ResourceChunk(ResourceType.CONCRETE, 80625),
                            new ResourceChunk(ResourceType.BRICK, 64500),
                            new ResourceChunk(ResourceType.WOOD, 4515),
                            new ResourceChunk(ResourceType.GLASS, 9030),
                            new ResourceChunk(ResourceType.MONEY, 2580000)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.CONSTRUCTION, 56000),
                            new ResourceChunk(ResourceType.CONCRETE, 105000),
                            new ResourceChunk(ResourceType.BRICK, 84000),
                            new ResourceChunk(ResourceType.WOOD, 5880),
                            new ResourceChunk(ResourceType.GLASS, 11760),
                            new ResourceChunk(ResourceType.MONEY, 3360000)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.CONSTRUCTION, 70400),
                            new ResourceChunk(ResourceType.CONCRETE, 135600),
                            new ResourceChunk(ResourceType.BRICK, 108480),
                            new ResourceChunk(ResourceType.WOOD, 7594),
                            new ResourceChunk(ResourceType.GLASS, 15187),
                            new ResourceChunk(ResourceType.MONEY, 4339200)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.CONSTRUCTION, 87200),
                            new ResourceChunk(ResourceType.CONCRETE, 172875),
                            new ResourceChunk(ResourceType.BRICK, 138300),
                            new ResourceChunk(ResourceType.WOOD, 9681),
                            new ResourceChunk(ResourceType.GLASS, 19362),
                            new ResourceChunk(ResourceType.MONEY, 5532000)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.CONSTRUCTION, 106400),
                            new ResourceChunk(ResourceType.CONCRETE, 217275),
                            new ResourceChunk(ResourceType.BRICK, 173820),
                            new ResourceChunk(ResourceType.WOOD, 12167),
                            new ResourceChunk(ResourceType.GLASS, 24335),
                            new ResourceChunk(ResourceType.MONEY, 6952800)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.CONSTRUCTION, 128000),
                            new ResourceChunk(ResourceType.CONCRETE, 269250),
                            new ResourceChunk(ResourceType.BRICK, 215400),
                            new ResourceChunk(ResourceType.WOOD, 15078),
                            new ResourceChunk(ResourceType.GLASS, 30156),
                            new ResourceChunk(ResourceType.MONEY, 8616000)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.CONSTRUCTION, 152000),
                            new ResourceChunk(ResourceType.CONCRETE, 329250),
                            new ResourceChunk(ResourceType.BRICK, 263400),
                            new ResourceChunk(ResourceType.WOOD, 18438),
                            new ResourceChunk(ResourceType.GLASS, 36876),
                            new ResourceChunk(ResourceType.MONEY, 10536000)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.CONSTRUCTION, 179200),
                            new ResourceChunk(ResourceType.CONCRETE, 400650),
                            new ResourceChunk(ResourceType.BRICK, 320520),
                            new ResourceChunk(ResourceType.WOOD, 22436),
                            new ResourceChunk(ResourceType.GLASS, 44873),
                            new ResourceChunk(ResourceType.MONEY, 12820800)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.CONSTRUCTION, 209600),
                            new ResourceChunk(ResourceType.CONCRETE, 484250),
                            new ResourceChunk(ResourceType.BRICK, 387400),
                            new ResourceChunk(ResourceType.WOOD, 27118),
                            new ResourceChunk(ResourceType.GLASS, 54236),
                            new ResourceChunk(ResourceType.MONEY, 15496000)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.CONSTRUCTION, 243200),
                            new ResourceChunk(ResourceType.CONCRETE, 580850),
                            new ResourceChunk(ResourceType.BRICK, 464680),
                            new ResourceChunk(ResourceType.WOOD, 32528),
                            new ResourceChunk(ResourceType.GLASS, 65055),
                            new ResourceChunk(ResourceType.MONEY, 18587200)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.CONSTRUCTION, 280000),
                            new ResourceChunk(ResourceType.CONCRETE, 691250),
                            new ResourceChunk(ResourceType.BRICK, 553000),
                            new ResourceChunk(ResourceType.WOOD, 38710),
                            new ResourceChunk(ResourceType.GLASS, 77420),
                            new ResourceChunk(ResourceType.MONEY, 22120000)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.CONSTRUCTION, 320000),
                            new ResourceChunk(ResourceType.CONCRETE, 816250),
                            new ResourceChunk(ResourceType.BRICK, 653000),
                            new ResourceChunk(ResourceType.WOOD, 45710),
                            new ResourceChunk(ResourceType.GLASS, 91420),
                            new ResourceChunk(ResourceType.MONEY, 26120000)
                    )
            },
            new ResourcePack[]{ // jobPrice
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.ACTION, 24),
                            new ResourceChunk(ResourceType.ENERGY, 24)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.ACTION, 28),
                            new ResourceChunk(ResourceType.ENERGY, 28)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.ACTION, 32),
                            new ResourceChunk(ResourceType.ENERGY, 32)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.ACTION, 36),
                            new ResourceChunk(ResourceType.ENERGY, 36)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.ACTION, 40),
                            new ResourceChunk(ResourceType.ENERGY, 40)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.ACTION, 44),
                            new ResourceChunk(ResourceType.ENERGY, 44)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.ACTION, 48),
                            new ResourceChunk(ResourceType.ENERGY, 48)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.ACTION, 52),
                            new ResourceChunk(ResourceType.ENERGY, 52)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.ACTION, 56),
                            new ResourceChunk(ResourceType.ENERGY, 56)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.ACTION, 60),
                            new ResourceChunk(ResourceType.ENERGY, 60)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.ACTION, 64),
                            new ResourceChunk(ResourceType.ENERGY, 64)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.ACTION, 68),
                            new ResourceChunk(ResourceType.ENERGY, 68)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.ACTION, 72),
                            new ResourceChunk(ResourceType.ENERGY, 72)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.ACTION, 76),
                            new ResourceChunk(ResourceType.ENERGY, 76)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.ACTION, 80),
                            new ResourceChunk(ResourceType.ENERGY, 80)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.ACTION, 84),
                            new ResourceChunk(ResourceType.ENERGY, 84)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.ACTION, 88),
                            new ResourceChunk(ResourceType.ENERGY, 88)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.ACTION, 92),
                            new ResourceChunk(ResourceType.ENERGY, 92)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.ACTION, 96),
                            new ResourceChunk(ResourceType.ENERGY, 96)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.ACTION, 100),
                            new ResourceChunk(ResourceType.ENERGY, 100)
                    )
            },
            new ResourcePack[]{  // jobReward
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.STEEL, 12)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.STEEL, 24)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.STEEL, 36)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.STEEL, 48)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.STEEL, 60)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.STEEL, 84)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.STEEL, 108)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.STEEL, 132)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.STEEL, 156)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.STEEL, 192)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.STEEL, 228)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.STEEL, 264)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.STEEL, 300)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.STEEL, 336)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.STEEL, 372)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.STEEL, 420)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.STEEL, 468)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.STEEL, 516)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.STEEL, 552)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.STEEL, 600)
                    )
            },
            null, // jobRewardMultiplier
            new ResourcePack[]{  // production
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.STEEL, 24)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.STEEL, 48)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.STEEL, 72)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.STEEL, 96)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.STEEL, 120)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.STEEL, 168)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.STEEL, 216)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.STEEL, 264)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.STEEL, 312)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.STEEL, 384)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.STEEL, 456)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.STEEL, 528)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.STEEL, 600)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.STEEL, 672)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.STEEL, 744)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.STEEL, 840)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.STEEL, 936)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.STEEL, 1032)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.STEEL, 1104)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.STEEL, 1200)
                    )
            },
            null, // productionMultiplier
            null, // supply
            null, // supplyMultiplier
            new ResourcePack[]{ // demand
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.UPKEEP, 100),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 16),
                            new ResourceChunk(ResourceType.JOB, 320),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.UPKEEP, 200),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 32),
                            new ResourceChunk(ResourceType.JOB, 640),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.UPKEEP, 300),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 48),
                            new ResourceChunk(ResourceType.JOB, 960),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.UPKEEP, 400),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 64),
                            new ResourceChunk(ResourceType.JOB, 1280),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.UPKEEP, 500),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 80),
                            new ResourceChunk(ResourceType.JOB, 1600),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.UPKEEP, 700),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 112),
                            new ResourceChunk(ResourceType.JOB, 2240),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.UPKEEP, 900),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 144),
                            new ResourceChunk(ResourceType.JOB, 2880),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.UPKEEP, 1100),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 176),
                            new ResourceChunk(ResourceType.JOB, 3520),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.UPKEEP, 1300),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 208),
                            new ResourceChunk(ResourceType.JOB, 4160),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.UPKEEP, 1500),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 240),
                            new ResourceChunk(ResourceType.JOB, 4800),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.UPKEEP, 1800),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 288),
                            new ResourceChunk(ResourceType.JOB, 5760),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.UPKEEP, 2100),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 336),
                            new ResourceChunk(ResourceType.JOB, 6720),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.UPKEEP, 2400),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 384),
                            new ResourceChunk(ResourceType.JOB, 7680),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.UPKEEP, 2700),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 432),
                            new ResourceChunk(ResourceType.JOB, 8640),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.UPKEEP, 3000),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 480),
                            new ResourceChunk(ResourceType.JOB, 9600),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.UPKEEP, 3400),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 544),
                            new ResourceChunk(ResourceType.JOB, 10880),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.UPKEEP, 3800),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 608),
                            new ResourceChunk(ResourceType.JOB, 12160),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.UPKEEP, 4200),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 672),
                            new ResourceChunk(ResourceType.JOB, 13440),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.UPKEEP, 4600),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 736),
                            new ResourceChunk(ResourceType.JOB, 14720),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.UPKEEP, 5000),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 800),
                            new ResourceChunk(ResourceType.JOB, 16000),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    )
            },
            new ResourcePack[]{ // hold
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.POWER, 16),
                            new ResourceChunk(ResourceType.JOB, 320),
                            new ResourceChunk(ResourceType.WORKER, 320)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.POWER, 32),
                            new ResourceChunk(ResourceType.JOB, 640),
                            new ResourceChunk(ResourceType.WORKER, 640)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.POWER, 48),
                            new ResourceChunk(ResourceType.JOB, 960),
                            new ResourceChunk(ResourceType.WORKER, 960)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.POWER, 64),
                            new ResourceChunk(ResourceType.JOB, 1280),
                            new ResourceChunk(ResourceType.WORKER, 1280)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.POWER, 80),
                            new ResourceChunk(ResourceType.JOB, 1600),
                            new ResourceChunk(ResourceType.WORKER, 1600)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.POWER, 112),
                            new ResourceChunk(ResourceType.JOB, 2240),
                            new ResourceChunk(ResourceType.WORKER, 2240)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.POWER, 144),
                            new ResourceChunk(ResourceType.JOB, 2880),
                            new ResourceChunk(ResourceType.WORKER, 2880)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.POWER, 176),
                            new ResourceChunk(ResourceType.JOB, 3520),
                            new ResourceChunk(ResourceType.WORKER, 3520)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.POWER, 208),
                            new ResourceChunk(ResourceType.JOB, 4160),
                            new ResourceChunk(ResourceType.WORKER, 4160)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.POWER, 240),
                            new ResourceChunk(ResourceType.JOB, 4800),
                            new ResourceChunk(ResourceType.WORKER, 4800)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.POWER, 288),
                            new ResourceChunk(ResourceType.JOB, 5760),
                            new ResourceChunk(ResourceType.WORKER, 5760)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.POWER, 336),
                            new ResourceChunk(ResourceType.JOB, 6720),
                            new ResourceChunk(ResourceType.WORKER, 6720)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.POWER, 384),
                            new ResourceChunk(ResourceType.JOB, 7680),
                            new ResourceChunk(ResourceType.WORKER, 7680)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.POWER, 432),
                            new ResourceChunk(ResourceType.JOB, 8640),
                            new ResourceChunk(ResourceType.WORKER, 8640)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.POWER, 480),
                            new ResourceChunk(ResourceType.JOB, 9600),
                            new ResourceChunk(ResourceType.WORKER, 9600)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.POWER, 544),
                            new ResourceChunk(ResourceType.JOB, 10880),
                            new ResourceChunk(ResourceType.WORKER, 10880)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.POWER, 608),
                            new ResourceChunk(ResourceType.JOB, 12160),
                            new ResourceChunk(ResourceType.WORKER, 12160)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.POWER, 672),
                            new ResourceChunk(ResourceType.JOB, 13440),
                            new ResourceChunk(ResourceType.WORKER, 13440)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.POWER, 736),
                            new ResourceChunk(ResourceType.JOB, 14720),
                            new ResourceChunk(ResourceType.WORKER, 14720)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.POWER, 800),
                            new ResourceChunk(ResourceType.JOB, 16000),
                            new ResourceChunk(ResourceType.WORKER, 16000)
                    )
            },
            null, // store
            null), // storeMultiplier
    FACTORY_CONCRETE("factory_concrete",
            Strings.BLD_FACTORY_CONCRETE,
            Images.BLD_FACTORY_CONCRETE,
            1, // requiredPlayerLevel
            1, // maxLevel
            1000, // buildLimit
            132, // priceMultiplier
            new int[]{ // structure
                    800, // 1
                    2400, // 2
                    4800, // 3
                    8000, // 4
                    12000, // 5
                    17600, // 6
                    24800, // 7
                    33600, // 8
                    44000, // 9
                    56000, // 10
                    70400, // 11
                    87200, // 12
                    106400, // 13
                    128000, // 14
                    152000, // 15
                    179200, // 16
                    209600, // 17
                    243200, // 18
                    280000, // 19
                    320000, // 20
            },
            new ResourcePack[]{  // buildCost
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.CONSTRUCTION, 800),
                            new ResourceChunk(ResourceType.STEEL, 408),
                            new ResourceChunk(ResourceType.BRICK, 1020),
                            new ResourceChunk(ResourceType.WOOD, 71),
                            new ResourceChunk(ResourceType.GLASS, 143),
                            new ResourceChunk(ResourceType.MONEY, 40800)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.CONSTRUCTION, 2400),
                            new ResourceChunk(ResourceType.STEEL, 1240),
                            new ResourceChunk(ResourceType.BRICK, 3100),
                            new ResourceChunk(ResourceType.WOOD, 217),
                            new ResourceChunk(ResourceType.GLASS, 434),
                            new ResourceChunk(ResourceType.MONEY, 124000)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.CONSTRUCTION, 4800),
                            new ResourceChunk(ResourceType.STEEL, 2512),
                            new ResourceChunk(ResourceType.BRICK, 6280),
                            new ResourceChunk(ResourceType.WOOD, 440),
                            new ResourceChunk(ResourceType.GLASS, 879),
                            new ResourceChunk(ResourceType.MONEY, 251200)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.CONSTRUCTION, 8000),
                            new ResourceChunk(ResourceType.STEEL, 4240),
                            new ResourceChunk(ResourceType.BRICK, 10600),
                            new ResourceChunk(ResourceType.WOOD, 742),
                            new ResourceChunk(ResourceType.GLASS, 1484),
                            new ResourceChunk(ResourceType.MONEY, 424000)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.CONSTRUCTION, 12000),
                            new ResourceChunk(ResourceType.STEEL, 6440),
                            new ResourceChunk(ResourceType.BRICK, 16100),
                            new ResourceChunk(ResourceType.WOOD, 1127),
                            new ResourceChunk(ResourceType.GLASS, 2254),
                            new ResourceChunk(ResourceType.MONEY, 644000)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.CONSTRUCTION, 17600),
                            new ResourceChunk(ResourceType.STEEL, 9632),
                            new ResourceChunk(ResourceType.BRICK, 24080),
                            new ResourceChunk(ResourceType.WOOD, 1686),
                            new ResourceChunk(ResourceType.GLASS, 3371),
                            new ResourceChunk(ResourceType.MONEY, 963200)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.CONSTRUCTION, 24800),
                            new ResourceChunk(ResourceType.STEEL, 13880),
                            new ResourceChunk(ResourceType.BRICK, 34700),
                            new ResourceChunk(ResourceType.WOOD, 2429),
                            new ResourceChunk(ResourceType.GLASS, 4858),
                            new ResourceChunk(ResourceType.MONEY, 1388000)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.CONSTRUCTION, 33600),
                            new ResourceChunk(ResourceType.STEEL, 19248),
                            new ResourceChunk(ResourceType.BRICK, 48120),
                            new ResourceChunk(ResourceType.WOOD, 3368),
                            new ResourceChunk(ResourceType.GLASS, 67737),
                            new ResourceChunk(ResourceType.MONEY, 1924800)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.CONSTRUCTION, 44000),
                            new ResourceChunk(ResourceType.STEEL, 25800),
                            new ResourceChunk(ResourceType.BRICK, 64500),
                            new ResourceChunk(ResourceType.WOOD, 4515),
                            new ResourceChunk(ResourceType.GLASS, 9030),
                            new ResourceChunk(ResourceType.MONEY, 2580000)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.CONSTRUCTION, 56000),
                            new ResourceChunk(ResourceType.STEEL, 33600),
                            new ResourceChunk(ResourceType.BRICK, 84000),
                            new ResourceChunk(ResourceType.WOOD, 5880),
                            new ResourceChunk(ResourceType.GLASS, 11760),
                            new ResourceChunk(ResourceType.MONEY, 3360000)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.CONSTRUCTION, 70400),
                            new ResourceChunk(ResourceType.STEEL, 43392),
                            new ResourceChunk(ResourceType.BRICK, 108480),
                            new ResourceChunk(ResourceType.WOOD, 7594),
                            new ResourceChunk(ResourceType.GLASS, 15187),
                            new ResourceChunk(ResourceType.MONEY, 4339200)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.CONSTRUCTION, 87200),
                            new ResourceChunk(ResourceType.STEEL, 55320),
                            new ResourceChunk(ResourceType.BRICK, 138300),
                            new ResourceChunk(ResourceType.WOOD, 9681),
                            new ResourceChunk(ResourceType.GLASS, 19362),
                            new ResourceChunk(ResourceType.MONEY, 5532000)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.CONSTRUCTION, 106400),
                            new ResourceChunk(ResourceType.STEEL, 69528),
                            new ResourceChunk(ResourceType.BRICK, 173820),
                            new ResourceChunk(ResourceType.WOOD, 12167),
                            new ResourceChunk(ResourceType.GLASS, 24335),
                            new ResourceChunk(ResourceType.MONEY, 6952800)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.CONSTRUCTION, 128000),
                            new ResourceChunk(ResourceType.STEEL, 86160),
                            new ResourceChunk(ResourceType.BRICK, 215400),
                            new ResourceChunk(ResourceType.WOOD, 15078),
                            new ResourceChunk(ResourceType.GLASS, 30156),
                            new ResourceChunk(ResourceType.MONEY, 8616000)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.CONSTRUCTION, 152000),
                            new ResourceChunk(ResourceType.STEEL, 105360),
                            new ResourceChunk(ResourceType.BRICK, 263400),
                            new ResourceChunk(ResourceType.WOOD, 18438),
                            new ResourceChunk(ResourceType.GLASS, 36876),
                            new ResourceChunk(ResourceType.MONEY, 10536000)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.CONSTRUCTION, 179200),
                            new ResourceChunk(ResourceType.STEEL, 128208),
                            new ResourceChunk(ResourceType.BRICK, 320520),
                            new ResourceChunk(ResourceType.WOOD, 22436),
                            new ResourceChunk(ResourceType.GLASS, 44873),
                            new ResourceChunk(ResourceType.MONEY, 12820800)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.CONSTRUCTION, 209600),
                            new ResourceChunk(ResourceType.STEEL, 154960),
                            new ResourceChunk(ResourceType.BRICK, 387400),
                            new ResourceChunk(ResourceType.WOOD, 27118),
                            new ResourceChunk(ResourceType.GLASS, 54236),
                            new ResourceChunk(ResourceType.MONEY, 15496000)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.CONSTRUCTION, 243200),
                            new ResourceChunk(ResourceType.STEEL, 185872),
                            new ResourceChunk(ResourceType.BRICK, 464680),
                            new ResourceChunk(ResourceType.WOOD, 32528),
                            new ResourceChunk(ResourceType.GLASS, 65055),
                            new ResourceChunk(ResourceType.MONEY, 18587200)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.CONSTRUCTION, 280000),
                            new ResourceChunk(ResourceType.STEEL, 221200),
                            new ResourceChunk(ResourceType.BRICK, 553000),
                            new ResourceChunk(ResourceType.WOOD, 38710),
                            new ResourceChunk(ResourceType.GLASS, 77420),
                            new ResourceChunk(ResourceType.MONEY, 22120000)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.CONSTRUCTION, 320000),
                            new ResourceChunk(ResourceType.STEEL, 261200),
                            new ResourceChunk(ResourceType.BRICK, 653000),
                            new ResourceChunk(ResourceType.WOOD, 45710),
                            new ResourceChunk(ResourceType.GLASS, 91420),
                            new ResourceChunk(ResourceType.MONEY, 26120000)
                    )
            },
            new ResourcePack[]{ // jobPrice
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.ACTION, 24),
                            new ResourceChunk(ResourceType.ENERGY, 24)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.ACTION, 28),
                            new ResourceChunk(ResourceType.ENERGY, 28)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.ACTION, 32),
                            new ResourceChunk(ResourceType.ENERGY, 32)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.ACTION, 36),
                            new ResourceChunk(ResourceType.ENERGY, 36)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.ACTION, 40),
                            new ResourceChunk(ResourceType.ENERGY, 40)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.ACTION, 44),
                            new ResourceChunk(ResourceType.ENERGY, 44)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.ACTION, 48),
                            new ResourceChunk(ResourceType.ENERGY, 48)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.ACTION, 52),
                            new ResourceChunk(ResourceType.ENERGY, 52)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.ACTION, 56),
                            new ResourceChunk(ResourceType.ENERGY, 56)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.ACTION, 60),
                            new ResourceChunk(ResourceType.ENERGY, 60)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.ACTION, 64),
                            new ResourceChunk(ResourceType.ENERGY, 64)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.ACTION, 68),
                            new ResourceChunk(ResourceType.ENERGY, 68)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.ACTION, 72),
                            new ResourceChunk(ResourceType.ENERGY, 72)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.ACTION, 76),
                            new ResourceChunk(ResourceType.ENERGY, 76)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.ACTION, 80),
                            new ResourceChunk(ResourceType.ENERGY, 80)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.ACTION, 84),
                            new ResourceChunk(ResourceType.ENERGY, 84)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.ACTION, 88),
                            new ResourceChunk(ResourceType.ENERGY, 88)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.ACTION, 92),
                            new ResourceChunk(ResourceType.ENERGY, 92)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.ACTION, 96),
                            new ResourceChunk(ResourceType.ENERGY, 96)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.ACTION, 100),
                            new ResourceChunk(ResourceType.ENERGY, 100)
                    )
            },
            new ResourcePack[]{  // jobReward
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.CONCRETE, 40)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.CONCRETE, 80)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.CONCRETE, 120)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.CONCRETE, 160)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.CONCRETE, 200)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.CONCRETE, 280)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.CONCRETE, 360)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.CONCRETE, 440)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.CONCRETE, 520)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.CONCRETE, 640)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.CONCRETE, 760)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.CONCRETE, 880)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.CONCRETE, 1000)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.CONCRETE, 1120)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.CONCRETE, 1240)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.CONCRETE, 1400)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.CONCRETE, 1560)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.CONCRETE, 1720)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.CONCRETE, 1840)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.CONCRETE, 2000)
                    )
            },
            null, // jobRewardMultiplier
            new ResourcePack[]{  // production
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.CONCRETE, 80)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.CONCRETE, 160)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.CONCRETE, 240)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.CONCRETE, 320)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.CONCRETE, 400)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.CONCRETE, 560)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.CONCRETE, 720)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.CONCRETE, 880)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.CONCRETE, 1040)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.CONCRETE, 1280)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.CONCRETE, 1520)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.CONCRETE, 1760)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.CONCRETE, 2000)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.CONCRETE, 2240)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.CONCRETE, 2480)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.CONCRETE, 2800)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.CONCRETE, 3120)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.CONCRETE, 3440)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.CONCRETE, 3680)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.CONCRETE, 4000)
                    )
            },
            null, // productionMultiplier
            null, // supply
            null, // supplyMultiplier
            new ResourcePack[]{ // demand
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.UPKEEP, 100),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 16),
                            new ResourceChunk(ResourceType.JOB, 320),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.UPKEEP, 200),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 32),
                            new ResourceChunk(ResourceType.JOB, 640),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.UPKEEP, 300),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 48),
                            new ResourceChunk(ResourceType.JOB, 960),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.UPKEEP, 400),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 64),
                            new ResourceChunk(ResourceType.JOB, 1280),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.UPKEEP, 500),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 80),
                            new ResourceChunk(ResourceType.JOB, 1600),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.UPKEEP, 700),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 112),
                            new ResourceChunk(ResourceType.JOB, 2240),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.UPKEEP, 900),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 144),
                            new ResourceChunk(ResourceType.JOB, 2880),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.UPKEEP, 1100),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 176),
                            new ResourceChunk(ResourceType.JOB, 3520),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.UPKEEP, 1300),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 208),
                            new ResourceChunk(ResourceType.JOB, 4160),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.UPKEEP, 1500),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 240),
                            new ResourceChunk(ResourceType.JOB, 4800),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.UPKEEP, 1800),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 288),
                            new ResourceChunk(ResourceType.JOB, 5760),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.UPKEEP, 2100),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 336),
                            new ResourceChunk(ResourceType.JOB, 6720),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.UPKEEP, 2400),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 384),
                            new ResourceChunk(ResourceType.JOB, 7680),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.UPKEEP, 2700),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 432),
                            new ResourceChunk(ResourceType.JOB, 8640),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.UPKEEP, 3000),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 480),
                            new ResourceChunk(ResourceType.JOB, 9600),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.UPKEEP, 3400),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 544),
                            new ResourceChunk(ResourceType.JOB, 10880),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.UPKEEP, 3800),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 608),
                            new ResourceChunk(ResourceType.JOB, 12160),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.UPKEEP, 4200),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 672),
                            new ResourceChunk(ResourceType.JOB, 13440),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.UPKEEP, 4600),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 736),
                            new ResourceChunk(ResourceType.JOB, 14720),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.UPKEEP, 5000),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 800),
                            new ResourceChunk(ResourceType.JOB, 16000),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    )
            },
            new ResourcePack[]{ // hold
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.POWER, 16),
                            new ResourceChunk(ResourceType.JOB, 320),
                            new ResourceChunk(ResourceType.WORKER, 320)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.POWER, 32),
                            new ResourceChunk(ResourceType.JOB, 640),
                            new ResourceChunk(ResourceType.WORKER, 640)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.POWER, 48),
                            new ResourceChunk(ResourceType.JOB, 960),
                            new ResourceChunk(ResourceType.WORKER, 960)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.POWER, 64),
                            new ResourceChunk(ResourceType.JOB, 1280),
                            new ResourceChunk(ResourceType.WORKER, 1280)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.POWER, 80),
                            new ResourceChunk(ResourceType.JOB, 1600),
                            new ResourceChunk(ResourceType.WORKER, 1600)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.POWER, 112),
                            new ResourceChunk(ResourceType.JOB, 2240),
                            new ResourceChunk(ResourceType.WORKER, 2240)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.POWER, 144),
                            new ResourceChunk(ResourceType.JOB, 2880),
                            new ResourceChunk(ResourceType.WORKER, 2880)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.POWER, 176),
                            new ResourceChunk(ResourceType.JOB, 3520),
                            new ResourceChunk(ResourceType.WORKER, 3520)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.POWER, 208),
                            new ResourceChunk(ResourceType.JOB, 4160),
                            new ResourceChunk(ResourceType.WORKER, 4160)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.POWER, 240),
                            new ResourceChunk(ResourceType.JOB, 4800),
                            new ResourceChunk(ResourceType.WORKER, 4800)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.POWER, 288),
                            new ResourceChunk(ResourceType.JOB, 5760),
                            new ResourceChunk(ResourceType.WORKER, 5760)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.POWER, 336),
                            new ResourceChunk(ResourceType.JOB, 6720),
                            new ResourceChunk(ResourceType.WORKER, 6720)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.POWER, 384),
                            new ResourceChunk(ResourceType.JOB, 7680),
                            new ResourceChunk(ResourceType.WORKER, 7680)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.POWER, 432),
                            new ResourceChunk(ResourceType.JOB, 8640),
                            new ResourceChunk(ResourceType.WORKER, 8640)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.POWER, 480),
                            new ResourceChunk(ResourceType.JOB, 9600),
                            new ResourceChunk(ResourceType.WORKER, 9600)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.POWER, 544),
                            new ResourceChunk(ResourceType.JOB, 10880),
                            new ResourceChunk(ResourceType.WORKER, 10880)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.POWER, 608),
                            new ResourceChunk(ResourceType.JOB, 12160),
                            new ResourceChunk(ResourceType.WORKER, 12160)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.POWER, 672),
                            new ResourceChunk(ResourceType.JOB, 13440),
                            new ResourceChunk(ResourceType.WORKER, 13440)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.POWER, 736),
                            new ResourceChunk(ResourceType.JOB, 14720),
                            new ResourceChunk(ResourceType.WORKER, 14720)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.POWER, 800),
                            new ResourceChunk(ResourceType.JOB, 16000),
                            new ResourceChunk(ResourceType.WORKER, 16000)
                    )
            },
            null, // store
            null), // storeMultiplier
    FACTORY_BRICK("factory_brick",
            Strings.BLD_FACTORY_BRICK,
            Images.BLD_FACTORY_BRICK,
            1, // requiredPlayerLevel
            1, // maxLevel
            1000, // buildLimit
            132, // priceMultiplier
            new int[]{ // structure
                    800, // 1
                    2400, // 2
                    4800, // 3
                    8000, // 4
                    12000, // 5
                    17600, // 6
                    24800, // 7
                    33600, // 8
                    44000, // 9
                    56000, // 10
                    70400, // 11
                    87200, // 12
                    106400, // 13
                    128000, // 14
                    152000, // 15
                    179200, // 16
                    209600, // 17
                    243200, // 18
                    280000, // 19
                    320000, // 20
            },
            new ResourcePack[]{  // buildCost
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.CONSTRUCTION, 800),
                            new ResourceChunk(ResourceType.STEEL, 408),
                            new ResourceChunk(ResourceType.CONCRETE, 1275),
                            new ResourceChunk(ResourceType.WOOD, 71),
                            new ResourceChunk(ResourceType.GLASS, 143),
                            new ResourceChunk(ResourceType.MONEY, 40800)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.CONSTRUCTION, 2400),
                            new ResourceChunk(ResourceType.STEEL, 1240),
                            new ResourceChunk(ResourceType.CONCRETE, 3875),
                            new ResourceChunk(ResourceType.WOOD, 217),
                            new ResourceChunk(ResourceType.GLASS, 434),
                            new ResourceChunk(ResourceType.MONEY, 124000)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.CONSTRUCTION, 4800),
                            new ResourceChunk(ResourceType.STEEL, 2512),
                            new ResourceChunk(ResourceType.CONCRETE, 7850),
                            new ResourceChunk(ResourceType.WOOD, 440),
                            new ResourceChunk(ResourceType.GLASS, 879),
                            new ResourceChunk(ResourceType.MONEY, 251200)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.CONSTRUCTION, 8000),
                            new ResourceChunk(ResourceType.STEEL, 4240),
                            new ResourceChunk(ResourceType.CONCRETE, 13250),
                            new ResourceChunk(ResourceType.WOOD, 742),
                            new ResourceChunk(ResourceType.GLASS, 1484),
                            new ResourceChunk(ResourceType.MONEY, 424000)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.CONSTRUCTION, 12000),
                            new ResourceChunk(ResourceType.STEEL, 6440),
                            new ResourceChunk(ResourceType.CONCRETE, 20125),
                            new ResourceChunk(ResourceType.WOOD, 1127),
                            new ResourceChunk(ResourceType.GLASS, 2254),
                            new ResourceChunk(ResourceType.MONEY, 644000)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.CONSTRUCTION, 17600),
                            new ResourceChunk(ResourceType.STEEL, 9632),
                            new ResourceChunk(ResourceType.CONCRETE, 30100),
                            new ResourceChunk(ResourceType.WOOD, 1686),
                            new ResourceChunk(ResourceType.GLASS, 3371),
                            new ResourceChunk(ResourceType.MONEY, 963200)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.CONSTRUCTION, 24800),
                            new ResourceChunk(ResourceType.STEEL, 13880),
                            new ResourceChunk(ResourceType.CONCRETE, 43375),
                            new ResourceChunk(ResourceType.WOOD, 2429),
                            new ResourceChunk(ResourceType.GLASS, 4858),
                            new ResourceChunk(ResourceType.MONEY, 1388000)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.CONSTRUCTION, 33600),
                            new ResourceChunk(ResourceType.STEEL, 19248),
                            new ResourceChunk(ResourceType.CONCRETE, 60150),
                            new ResourceChunk(ResourceType.WOOD, 3368),
                            new ResourceChunk(ResourceType.GLASS, 67737),
                            new ResourceChunk(ResourceType.MONEY, 1924800)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.CONSTRUCTION, 44000),
                            new ResourceChunk(ResourceType.STEEL, 25800),
                            new ResourceChunk(ResourceType.CONCRETE, 80625),
                            new ResourceChunk(ResourceType.WOOD, 4515),
                            new ResourceChunk(ResourceType.GLASS, 9030),
                            new ResourceChunk(ResourceType.MONEY, 2580000)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.CONSTRUCTION, 56000),
                            new ResourceChunk(ResourceType.STEEL, 33600),
                            new ResourceChunk(ResourceType.CONCRETE, 105000),
                            new ResourceChunk(ResourceType.WOOD, 5880),
                            new ResourceChunk(ResourceType.GLASS, 11760),
                            new ResourceChunk(ResourceType.MONEY, 3360000)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.CONSTRUCTION, 70400),
                            new ResourceChunk(ResourceType.STEEL, 43392),
                            new ResourceChunk(ResourceType.CONCRETE, 135600),
                            new ResourceChunk(ResourceType.WOOD, 7594),
                            new ResourceChunk(ResourceType.GLASS, 15187),
                            new ResourceChunk(ResourceType.MONEY, 4339200)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.CONSTRUCTION, 87200),
                            new ResourceChunk(ResourceType.STEEL, 55320),
                            new ResourceChunk(ResourceType.CONCRETE, 172875),
                            new ResourceChunk(ResourceType.WOOD, 9681),
                            new ResourceChunk(ResourceType.GLASS, 19362),
                            new ResourceChunk(ResourceType.MONEY, 5532000)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.CONSTRUCTION, 106400),
                            new ResourceChunk(ResourceType.STEEL, 69528),
                            new ResourceChunk(ResourceType.CONCRETE, 217275),
                            new ResourceChunk(ResourceType.WOOD, 12167),
                            new ResourceChunk(ResourceType.GLASS, 24335),
                            new ResourceChunk(ResourceType.MONEY, 6952800)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.CONSTRUCTION, 128000),
                            new ResourceChunk(ResourceType.STEEL, 86160),
                            new ResourceChunk(ResourceType.CONCRETE, 269250),
                            new ResourceChunk(ResourceType.WOOD, 15078),
                            new ResourceChunk(ResourceType.GLASS, 30156),
                            new ResourceChunk(ResourceType.MONEY, 8616000)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.CONSTRUCTION, 152000),
                            new ResourceChunk(ResourceType.STEEL, 105360),
                            new ResourceChunk(ResourceType.CONCRETE, 329250),
                            new ResourceChunk(ResourceType.WOOD, 18438),
                            new ResourceChunk(ResourceType.GLASS, 36876),
                            new ResourceChunk(ResourceType.MONEY, 10536000)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.CONSTRUCTION, 179200),
                            new ResourceChunk(ResourceType.STEEL, 128208),
                            new ResourceChunk(ResourceType.CONCRETE, 400650),
                            new ResourceChunk(ResourceType.WOOD, 22436),
                            new ResourceChunk(ResourceType.GLASS, 44873),
                            new ResourceChunk(ResourceType.MONEY, 12820800)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.CONSTRUCTION, 209600),
                            new ResourceChunk(ResourceType.STEEL, 154960),
                            new ResourceChunk(ResourceType.CONCRETE, 484250),
                            new ResourceChunk(ResourceType.WOOD, 27118),
                            new ResourceChunk(ResourceType.GLASS, 54236),
                            new ResourceChunk(ResourceType.MONEY, 15496000)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.CONSTRUCTION, 243200),
                            new ResourceChunk(ResourceType.STEEL, 185872),
                            new ResourceChunk(ResourceType.CONCRETE, 580850),
                            new ResourceChunk(ResourceType.WOOD, 32528),
                            new ResourceChunk(ResourceType.GLASS, 65055),
                            new ResourceChunk(ResourceType.MONEY, 18587200)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.CONSTRUCTION, 280000),
                            new ResourceChunk(ResourceType.STEEL, 221200),
                            new ResourceChunk(ResourceType.CONCRETE, 691250),
                            new ResourceChunk(ResourceType.WOOD, 38710),
                            new ResourceChunk(ResourceType.GLASS, 77420),
                            new ResourceChunk(ResourceType.MONEY, 22120000)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.CONSTRUCTION, 320000),
                            new ResourceChunk(ResourceType.STEEL, 261200),
                            new ResourceChunk(ResourceType.CONCRETE, 816250),
                            new ResourceChunk(ResourceType.WOOD, 45710),
                            new ResourceChunk(ResourceType.GLASS, 91420),
                            new ResourceChunk(ResourceType.MONEY, 26120000)
                    )
            },
            new ResourcePack[]{ // jobPrice
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.ACTION, 24),
                            new ResourceChunk(ResourceType.ENERGY, 24)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.ACTION, 28),
                            new ResourceChunk(ResourceType.ENERGY, 28)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.ACTION, 32),
                            new ResourceChunk(ResourceType.ENERGY, 32)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.ACTION, 36),
                            new ResourceChunk(ResourceType.ENERGY, 36)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.ACTION, 40),
                            new ResourceChunk(ResourceType.ENERGY, 40)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.ACTION, 44),
                            new ResourceChunk(ResourceType.ENERGY, 44)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.ACTION, 48),
                            new ResourceChunk(ResourceType.ENERGY, 48)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.ACTION, 52),
                            new ResourceChunk(ResourceType.ENERGY, 52)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.ACTION, 56),
                            new ResourceChunk(ResourceType.ENERGY, 56)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.ACTION, 60),
                            new ResourceChunk(ResourceType.ENERGY, 60)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.ACTION, 64),
                            new ResourceChunk(ResourceType.ENERGY, 64)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.ACTION, 68),
                            new ResourceChunk(ResourceType.ENERGY, 68)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.ACTION, 72),
                            new ResourceChunk(ResourceType.ENERGY, 72)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.ACTION, 76),
                            new ResourceChunk(ResourceType.ENERGY, 76)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.ACTION, 80),
                            new ResourceChunk(ResourceType.ENERGY, 80)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.ACTION, 84),
                            new ResourceChunk(ResourceType.ENERGY, 84)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.ACTION, 88),
                            new ResourceChunk(ResourceType.ENERGY, 88)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.ACTION, 92),
                            new ResourceChunk(ResourceType.ENERGY, 92)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.ACTION, 96),
                            new ResourceChunk(ResourceType.ENERGY, 96)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.ACTION, 100),
                            new ResourceChunk(ResourceType.ENERGY, 100)
                    )
            },
            new ResourcePack[]{  // jobReward
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.BRICK, 30)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.BRICK, 60)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.BRICK, 90)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.BRICK, 120)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.BRICK, 150)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.BRICK, 210)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.BRICK, 270)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.BRICK, 330)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.BRICK, 390)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.BRICK, 480)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.BRICK, 570)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.BRICK, 660)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.BRICK, 750)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.BRICK, 840)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.BRICK, 930)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.BRICK, 1050)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.BRICK, 1170)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.BRICK, 1290)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.BRICK, 1380)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.BRICK, 1500)
                    )
            },
            null, // jobRewardMultiplier
            new ResourcePack[]{  // production
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.BRICK, 60)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.BRICK, 120)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.BRICK, 180)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.BRICK, 240)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.BRICK, 300)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.BRICK, 420)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.BRICK, 540)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.BRICK, 660)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.BRICK, 780)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.BRICK, 960)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.BRICK, 1140)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.BRICK, 1320)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.BRICK, 1500)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.BRICK, 1680)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.BRICK, 1860)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.BRICK, 2100)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.BRICK, 2340)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.BRICK, 2580)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.BRICK, 2760)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.BRICK, 3000)
                    )
            },
            null, // productionMultiplier
            null, // supply
            null, // supplyMultiplier
            new ResourcePack[]{ // demand
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.UPKEEP, 100),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 16),
                            new ResourceChunk(ResourceType.JOB, 320),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.UPKEEP, 200),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 32),
                            new ResourceChunk(ResourceType.JOB, 640),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.UPKEEP, 300),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 48),
                            new ResourceChunk(ResourceType.JOB, 960),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.UPKEEP, 400),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 64),
                            new ResourceChunk(ResourceType.JOB, 1280),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.UPKEEP, 500),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 80),
                            new ResourceChunk(ResourceType.JOB, 1600),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.UPKEEP, 700),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 112),
                            new ResourceChunk(ResourceType.JOB, 2240),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.UPKEEP, 900),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 144),
                            new ResourceChunk(ResourceType.JOB, 2880),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.UPKEEP, 1100),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 176),
                            new ResourceChunk(ResourceType.JOB, 3520),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.UPKEEP, 1300),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 208),
                            new ResourceChunk(ResourceType.JOB, 4160),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.UPKEEP, 1500),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 240),
                            new ResourceChunk(ResourceType.JOB, 4800),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.UPKEEP, 1800),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 288),
                            new ResourceChunk(ResourceType.JOB, 5760),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.UPKEEP, 2100),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 336),
                            new ResourceChunk(ResourceType.JOB, 6720),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.UPKEEP, 2400),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 384),
                            new ResourceChunk(ResourceType.JOB, 7680),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.UPKEEP, 2700),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 432),
                            new ResourceChunk(ResourceType.JOB, 8640),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.UPKEEP, 3000),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 480),
                            new ResourceChunk(ResourceType.JOB, 9600),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.UPKEEP, 3400),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 544),
                            new ResourceChunk(ResourceType.JOB, 10880),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.UPKEEP, 3800),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 608),
                            new ResourceChunk(ResourceType.JOB, 12160),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.UPKEEP, 4200),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 672),
                            new ResourceChunk(ResourceType.JOB, 13440),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.UPKEEP, 4600),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 736),
                            new ResourceChunk(ResourceType.JOB, 14720),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.UPKEEP, 5000),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 800),
                            new ResourceChunk(ResourceType.JOB, 16000),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    )
            },
            new ResourcePack[]{ // hold
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.POWER, 16),
                            new ResourceChunk(ResourceType.JOB, 320),
                            new ResourceChunk(ResourceType.WORKER, 320)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.POWER, 32),
                            new ResourceChunk(ResourceType.JOB, 640),
                            new ResourceChunk(ResourceType.WORKER, 640)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.POWER, 48),
                            new ResourceChunk(ResourceType.JOB, 960),
                            new ResourceChunk(ResourceType.WORKER, 960)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.POWER, 64),
                            new ResourceChunk(ResourceType.JOB, 1280),
                            new ResourceChunk(ResourceType.WORKER, 1280)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.POWER, 80),
                            new ResourceChunk(ResourceType.JOB, 1600),
                            new ResourceChunk(ResourceType.WORKER, 1600)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.POWER, 112),
                            new ResourceChunk(ResourceType.JOB, 2240),
                            new ResourceChunk(ResourceType.WORKER, 2240)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.POWER, 144),
                            new ResourceChunk(ResourceType.JOB, 2880),
                            new ResourceChunk(ResourceType.WORKER, 2880)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.POWER, 176),
                            new ResourceChunk(ResourceType.JOB, 3520),
                            new ResourceChunk(ResourceType.WORKER, 3520)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.POWER, 208),
                            new ResourceChunk(ResourceType.JOB, 4160),
                            new ResourceChunk(ResourceType.WORKER, 4160)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.POWER, 240),
                            new ResourceChunk(ResourceType.JOB, 4800),
                            new ResourceChunk(ResourceType.WORKER, 4800)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.POWER, 288),
                            new ResourceChunk(ResourceType.JOB, 5760),
                            new ResourceChunk(ResourceType.WORKER, 5760)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.POWER, 336),
                            new ResourceChunk(ResourceType.JOB, 6720),
                            new ResourceChunk(ResourceType.WORKER, 6720)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.POWER, 384),
                            new ResourceChunk(ResourceType.JOB, 7680),
                            new ResourceChunk(ResourceType.WORKER, 7680)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.POWER, 432),
                            new ResourceChunk(ResourceType.JOB, 8640),
                            new ResourceChunk(ResourceType.WORKER, 8640)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.POWER, 480),
                            new ResourceChunk(ResourceType.JOB, 9600),
                            new ResourceChunk(ResourceType.WORKER, 9600)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.POWER, 544),
                            new ResourceChunk(ResourceType.JOB, 10880),
                            new ResourceChunk(ResourceType.WORKER, 10880)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.POWER, 608),
                            new ResourceChunk(ResourceType.JOB, 12160),
                            new ResourceChunk(ResourceType.WORKER, 12160)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.POWER, 672),
                            new ResourceChunk(ResourceType.JOB, 13440),
                            new ResourceChunk(ResourceType.WORKER, 13440)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.POWER, 736),
                            new ResourceChunk(ResourceType.JOB, 14720),
                            new ResourceChunk(ResourceType.WORKER, 14720)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.POWER, 800),
                            new ResourceChunk(ResourceType.JOB, 16000),
                            new ResourceChunk(ResourceType.WORKER, 16000)
                    )
            },
            null, // store
            null), // storeMultiplier
    FACTORY_WOOD("factory_wood",
            Strings.BLD_FACTORY_WOOD,
            Images.BLD_FACTORY_WOOD,
            1, // requiredPlayerLevel
            1, // maxLevel
            1000, // buildLimit
            132, // priceMultiplier
            new int[]{ // structure
                    800, // 1
                    2400, // 2
                    4800, // 3
                    8000, // 4
                    12000, // 5
                    17600, // 6
                    24800, // 7
                    33600, // 8
                    44000, // 9
                    56000, // 10
                    70400, // 11
                    87200, // 12
                    106400, // 13
                    128000, // 14
                    152000, // 15
                    179200, // 16
                    209600, // 17
                    243200, // 18
                    280000, // 19
                    320000, // 20
            },
            new ResourcePack[]{  // buildCost
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.CONSTRUCTION, 800),
                            new ResourceChunk(ResourceType.STEEL, 408),
                            new ResourceChunk(ResourceType.CONCRETE, 1275),
                            new ResourceChunk(ResourceType.BRICK, 1020),
                            new ResourceChunk(ResourceType.GLASS, 143),
                            new ResourceChunk(ResourceType.MONEY, 40800)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.CONSTRUCTION, 2400),
                            new ResourceChunk(ResourceType.STEEL, 1240),
                            new ResourceChunk(ResourceType.CONCRETE, 3875),
                            new ResourceChunk(ResourceType.BRICK, 3100),
                            new ResourceChunk(ResourceType.GLASS, 434),
                            new ResourceChunk(ResourceType.MONEY, 124000)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.CONSTRUCTION, 4800),
                            new ResourceChunk(ResourceType.STEEL, 2512),
                            new ResourceChunk(ResourceType.CONCRETE, 7850),
                            new ResourceChunk(ResourceType.BRICK, 6280),
                            new ResourceChunk(ResourceType.GLASS, 879),
                            new ResourceChunk(ResourceType.MONEY, 251200)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.CONSTRUCTION, 8000),
                            new ResourceChunk(ResourceType.STEEL, 4240),
                            new ResourceChunk(ResourceType.CONCRETE, 13250),
                            new ResourceChunk(ResourceType.BRICK, 10600),
                            new ResourceChunk(ResourceType.GLASS, 1484),
                            new ResourceChunk(ResourceType.MONEY, 424000)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.CONSTRUCTION, 12000),
                            new ResourceChunk(ResourceType.STEEL, 6440),
                            new ResourceChunk(ResourceType.CONCRETE, 20125),
                            new ResourceChunk(ResourceType.BRICK, 16100),
                            new ResourceChunk(ResourceType.GLASS, 2254),
                            new ResourceChunk(ResourceType.MONEY, 644000)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.CONSTRUCTION, 17600),
                            new ResourceChunk(ResourceType.STEEL, 9632),
                            new ResourceChunk(ResourceType.CONCRETE, 30100),
                            new ResourceChunk(ResourceType.BRICK, 24080),
                            new ResourceChunk(ResourceType.GLASS, 3371),
                            new ResourceChunk(ResourceType.MONEY, 963200)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.CONSTRUCTION, 24800),
                            new ResourceChunk(ResourceType.STEEL, 13880),
                            new ResourceChunk(ResourceType.CONCRETE, 43375),
                            new ResourceChunk(ResourceType.BRICK, 34700),
                            new ResourceChunk(ResourceType.GLASS, 4858),
                            new ResourceChunk(ResourceType.MONEY, 1388000)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.CONSTRUCTION, 33600),
                            new ResourceChunk(ResourceType.STEEL, 19248),
                            new ResourceChunk(ResourceType.CONCRETE, 60150),
                            new ResourceChunk(ResourceType.BRICK, 48120),
                            new ResourceChunk(ResourceType.GLASS, 67737),
                            new ResourceChunk(ResourceType.MONEY, 1924800)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.CONSTRUCTION, 44000),
                            new ResourceChunk(ResourceType.STEEL, 25800),
                            new ResourceChunk(ResourceType.CONCRETE, 80625),
                            new ResourceChunk(ResourceType.BRICK, 64500),
                            new ResourceChunk(ResourceType.GLASS, 9030),
                            new ResourceChunk(ResourceType.MONEY, 2580000)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.CONSTRUCTION, 56000),
                            new ResourceChunk(ResourceType.STEEL, 33600),
                            new ResourceChunk(ResourceType.CONCRETE, 105000),
                            new ResourceChunk(ResourceType.BRICK, 84000),
                            new ResourceChunk(ResourceType.GLASS, 11760),
                            new ResourceChunk(ResourceType.MONEY, 3360000)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.CONSTRUCTION, 70400),
                            new ResourceChunk(ResourceType.STEEL, 43392),
                            new ResourceChunk(ResourceType.CONCRETE, 135600),
                            new ResourceChunk(ResourceType.BRICK, 108480),
                            new ResourceChunk(ResourceType.GLASS, 15187),
                            new ResourceChunk(ResourceType.MONEY, 4339200)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.CONSTRUCTION, 87200),
                            new ResourceChunk(ResourceType.STEEL, 55320),
                            new ResourceChunk(ResourceType.CONCRETE, 172875),
                            new ResourceChunk(ResourceType.BRICK, 138300),
                            new ResourceChunk(ResourceType.GLASS, 19362),
                            new ResourceChunk(ResourceType.MONEY, 5532000)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.CONSTRUCTION, 106400),
                            new ResourceChunk(ResourceType.STEEL, 69528),
                            new ResourceChunk(ResourceType.CONCRETE, 217275),
                            new ResourceChunk(ResourceType.BRICK, 173820),
                            new ResourceChunk(ResourceType.GLASS, 24335),
                            new ResourceChunk(ResourceType.MONEY, 6952800)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.CONSTRUCTION, 128000),
                            new ResourceChunk(ResourceType.STEEL, 86160),
                            new ResourceChunk(ResourceType.CONCRETE, 269250),
                            new ResourceChunk(ResourceType.BRICK, 215400),
                            new ResourceChunk(ResourceType.GLASS, 30156),
                            new ResourceChunk(ResourceType.MONEY, 8616000)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.CONSTRUCTION, 152000),
                            new ResourceChunk(ResourceType.STEEL, 105360),
                            new ResourceChunk(ResourceType.CONCRETE, 329250),
                            new ResourceChunk(ResourceType.BRICK, 263400),
                            new ResourceChunk(ResourceType.GLASS, 36876),
                            new ResourceChunk(ResourceType.MONEY, 10536000)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.CONSTRUCTION, 179200),
                            new ResourceChunk(ResourceType.STEEL, 128208),
                            new ResourceChunk(ResourceType.CONCRETE, 400650),
                            new ResourceChunk(ResourceType.BRICK, 320520),
                            new ResourceChunk(ResourceType.GLASS, 44873),
                            new ResourceChunk(ResourceType.MONEY, 12820800)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.CONSTRUCTION, 209600),
                            new ResourceChunk(ResourceType.STEEL, 154960),
                            new ResourceChunk(ResourceType.CONCRETE, 484250),
                            new ResourceChunk(ResourceType.BRICK, 387400),
                            new ResourceChunk(ResourceType.GLASS, 54236),
                            new ResourceChunk(ResourceType.MONEY, 15496000)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.CONSTRUCTION, 243200),
                            new ResourceChunk(ResourceType.STEEL, 185872),
                            new ResourceChunk(ResourceType.CONCRETE, 580850),
                            new ResourceChunk(ResourceType.BRICK, 464680),
                            new ResourceChunk(ResourceType.GLASS, 65055),
                            new ResourceChunk(ResourceType.MONEY, 18587200)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.CONSTRUCTION, 280000),
                            new ResourceChunk(ResourceType.STEEL, 221200),
                            new ResourceChunk(ResourceType.CONCRETE, 691250),
                            new ResourceChunk(ResourceType.BRICK, 553000),
                            new ResourceChunk(ResourceType.GLASS, 77420),
                            new ResourceChunk(ResourceType.MONEY, 22120000)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.CONSTRUCTION, 320000),
                            new ResourceChunk(ResourceType.STEEL, 261200),
                            new ResourceChunk(ResourceType.CONCRETE, 816250),
                            new ResourceChunk(ResourceType.BRICK, 653000),
                            new ResourceChunk(ResourceType.GLASS, 91420),
                            new ResourceChunk(ResourceType.MONEY, 26120000)
                    )
            },
            new ResourcePack[]{ // jobPrice
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.ACTION, 24),
                            new ResourceChunk(ResourceType.ENERGY, 24)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.ACTION, 28),
                            new ResourceChunk(ResourceType.ENERGY, 28)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.ACTION, 32),
                            new ResourceChunk(ResourceType.ENERGY, 32)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.ACTION, 36),
                            new ResourceChunk(ResourceType.ENERGY, 36)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.ACTION, 40),
                            new ResourceChunk(ResourceType.ENERGY, 40)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.ACTION, 44),
                            new ResourceChunk(ResourceType.ENERGY, 44)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.ACTION, 48),
                            new ResourceChunk(ResourceType.ENERGY, 48)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.ACTION, 52),
                            new ResourceChunk(ResourceType.ENERGY, 52)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.ACTION, 56),
                            new ResourceChunk(ResourceType.ENERGY, 56)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.ACTION, 60),
                            new ResourceChunk(ResourceType.ENERGY, 60)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.ACTION, 64),
                            new ResourceChunk(ResourceType.ENERGY, 64)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.ACTION, 68),
                            new ResourceChunk(ResourceType.ENERGY, 68)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.ACTION, 72),
                            new ResourceChunk(ResourceType.ENERGY, 72)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.ACTION, 76),
                            new ResourceChunk(ResourceType.ENERGY, 76)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.ACTION, 80),
                            new ResourceChunk(ResourceType.ENERGY, 80)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.ACTION, 84),
                            new ResourceChunk(ResourceType.ENERGY, 84)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.ACTION, 88),
                            new ResourceChunk(ResourceType.ENERGY, 88)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.ACTION, 92),
                            new ResourceChunk(ResourceType.ENERGY, 92)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.ACTION, 96),
                            new ResourceChunk(ResourceType.ENERGY, 96)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.ACTION, 100),
                            new ResourceChunk(ResourceType.ENERGY, 100)
                    )
            },
            new ResourcePack[]{  // jobReward
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.WOOD, 10)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.WOOD, 20)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.WOOD, 30)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.WOOD, 40)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.WOOD, 50)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.WOOD, 70)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.WOOD, 90)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.WOOD, 110)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.WOOD, 130)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.WOOD, 160)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.WOOD, 190)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.WOOD, 220)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.WOOD, 250)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.WOOD, 280)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.WOOD, 310)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.WOOD, 350)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.WOOD, 390)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.WOOD, 430)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.WOOD, 460)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.WOOD, 500)
                    )
            },
            null, // jobRewardMultiplier
            new ResourcePack[]{  // production
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.WOOD, 20)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.WOOD, 40)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.WOOD, 60)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.WOOD, 80)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.WOOD, 100)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.WOOD, 140)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.WOOD, 180)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.WOOD, 220)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.WOOD, 260)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.WOOD, 320)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.WOOD, 380)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.WOOD, 440)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.WOOD, 500)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.WOOD, 560)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.WOOD, 620)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.WOOD, 700)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.WOOD, 780)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.WOOD, 860)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.WOOD, 920)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.WOOD, 1000)
                    )
            },
            null, // productionMultiplier
            null, // supply
            null, // supplyMultiplier
            new ResourcePack[]{ // demand
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.UPKEEP, 100),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 16),
                            new ResourceChunk(ResourceType.JOB, 320),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.UPKEEP, 200),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 32),
                            new ResourceChunk(ResourceType.JOB, 640),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.UPKEEP, 300),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 48),
                            new ResourceChunk(ResourceType.JOB, 960),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.UPKEEP, 400),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 64),
                            new ResourceChunk(ResourceType.JOB, 1280),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.UPKEEP, 500),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 80),
                            new ResourceChunk(ResourceType.JOB, 1600),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.UPKEEP, 700),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 112),
                            new ResourceChunk(ResourceType.JOB, 2240),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.UPKEEP, 900),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 144),
                            new ResourceChunk(ResourceType.JOB, 2880),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.UPKEEP, 1100),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 176),
                            new ResourceChunk(ResourceType.JOB, 3520),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.UPKEEP, 1300),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 208),
                            new ResourceChunk(ResourceType.JOB, 4160),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.UPKEEP, 1500),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 240),
                            new ResourceChunk(ResourceType.JOB, 4800),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.UPKEEP, 1800),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 288),
                            new ResourceChunk(ResourceType.JOB, 5760),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.UPKEEP, 2100),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 336),
                            new ResourceChunk(ResourceType.JOB, 6720),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.UPKEEP, 2400),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 384),
                            new ResourceChunk(ResourceType.JOB, 7680),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.UPKEEP, 2700),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 432),
                            new ResourceChunk(ResourceType.JOB, 8640),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.UPKEEP, 3000),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 480),
                            new ResourceChunk(ResourceType.JOB, 9600),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.UPKEEP, 3400),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 544),
                            new ResourceChunk(ResourceType.JOB, 10880),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.UPKEEP, 3800),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 608),
                            new ResourceChunk(ResourceType.JOB, 12160),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.UPKEEP, 4200),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 672),
                            new ResourceChunk(ResourceType.JOB, 13440),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.UPKEEP, 4600),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 736),
                            new ResourceChunk(ResourceType.JOB, 14720),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.UPKEEP, 5000),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 800),
                            new ResourceChunk(ResourceType.JOB, 16000),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    )
            },
            new ResourcePack[]{ // hold
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.POWER, 16),
                            new ResourceChunk(ResourceType.JOB, 320),
                            new ResourceChunk(ResourceType.WORKER, 320)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.POWER, 32),
                            new ResourceChunk(ResourceType.JOB, 640),
                            new ResourceChunk(ResourceType.WORKER, 640)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.POWER, 48),
                            new ResourceChunk(ResourceType.JOB, 960),
                            new ResourceChunk(ResourceType.WORKER, 960)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.POWER, 64),
                            new ResourceChunk(ResourceType.JOB, 1280),
                            new ResourceChunk(ResourceType.WORKER, 1280)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.POWER, 80),
                            new ResourceChunk(ResourceType.JOB, 1600),
                            new ResourceChunk(ResourceType.WORKER, 1600)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.POWER, 112),
                            new ResourceChunk(ResourceType.JOB, 2240),
                            new ResourceChunk(ResourceType.WORKER, 2240)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.POWER, 144),
                            new ResourceChunk(ResourceType.JOB, 2880),
                            new ResourceChunk(ResourceType.WORKER, 2880)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.POWER, 176),
                            new ResourceChunk(ResourceType.JOB, 3520),
                            new ResourceChunk(ResourceType.WORKER, 3520)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.POWER, 208),
                            new ResourceChunk(ResourceType.JOB, 4160),
                            new ResourceChunk(ResourceType.WORKER, 4160)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.POWER, 240),
                            new ResourceChunk(ResourceType.JOB, 4800),
                            new ResourceChunk(ResourceType.WORKER, 4800)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.POWER, 288),
                            new ResourceChunk(ResourceType.JOB, 5760),
                            new ResourceChunk(ResourceType.WORKER, 5760)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.POWER, 336),
                            new ResourceChunk(ResourceType.JOB, 6720),
                            new ResourceChunk(ResourceType.WORKER, 6720)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.POWER, 384),
                            new ResourceChunk(ResourceType.JOB, 7680),
                            new ResourceChunk(ResourceType.WORKER, 7680)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.POWER, 432),
                            new ResourceChunk(ResourceType.JOB, 8640),
                            new ResourceChunk(ResourceType.WORKER, 8640)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.POWER, 480),
                            new ResourceChunk(ResourceType.JOB, 9600),
                            new ResourceChunk(ResourceType.WORKER, 9600)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.POWER, 544),
                            new ResourceChunk(ResourceType.JOB, 10880),
                            new ResourceChunk(ResourceType.WORKER, 10880)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.POWER, 608),
                            new ResourceChunk(ResourceType.JOB, 12160),
                            new ResourceChunk(ResourceType.WORKER, 12160)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.POWER, 672),
                            new ResourceChunk(ResourceType.JOB, 13440),
                            new ResourceChunk(ResourceType.WORKER, 13440)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.POWER, 736),
                            new ResourceChunk(ResourceType.JOB, 14720),
                            new ResourceChunk(ResourceType.WORKER, 14720)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.POWER, 800),
                            new ResourceChunk(ResourceType.JOB, 16000),
                            new ResourceChunk(ResourceType.WORKER, 16000)
                    )
            },
            null, // store
            null), // storeMultiplier
    FACTORY_GLASS("factory_glass",
            Strings.BLD_FACTORY_GLASS,
            Images.BLD_FACTORY_GLASS,
            1, // requiredPlayerLevel
            1, // maxLevel
            1000, // buildLimit
            132, // priceMultiplier
            new int[]{ // structure
                    800, // 1
                    2400, // 2
                    4800, // 3
                    8000, // 4
                    12000, // 5
                    17600, // 6
                    24800, // 7
                    33600, // 8
                    44000, // 9
                    56000, // 10
                    70400, // 11
                    87200, // 12
                    106400, // 13
                    128000, // 14
                    152000, // 15
                    179200, // 16
                    209600, // 17
                    243200, // 18
                    280000, // 19
                    320000, // 20
            },
            new ResourcePack[]{  // buildCost
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.CONSTRUCTION, 800),
                            new ResourceChunk(ResourceType.STEEL, 408),
                            new ResourceChunk(ResourceType.CONCRETE, 1275),
                            new ResourceChunk(ResourceType.BRICK, 1020),
                            new ResourceChunk(ResourceType.WOOD, 71),
                            new ResourceChunk(ResourceType.MONEY, 40800)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.CONSTRUCTION, 2400),
                            new ResourceChunk(ResourceType.STEEL, 1240),
                            new ResourceChunk(ResourceType.CONCRETE, 3875),
                            new ResourceChunk(ResourceType.BRICK, 3100),
                            new ResourceChunk(ResourceType.WOOD, 217),
                            new ResourceChunk(ResourceType.MONEY, 124000)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.CONSTRUCTION, 4800),
                            new ResourceChunk(ResourceType.STEEL, 2512),
                            new ResourceChunk(ResourceType.CONCRETE, 7850),
                            new ResourceChunk(ResourceType.BRICK, 6280),
                            new ResourceChunk(ResourceType.WOOD, 440),
                            new ResourceChunk(ResourceType.MONEY, 251200)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.CONSTRUCTION, 8000),
                            new ResourceChunk(ResourceType.STEEL, 4240),
                            new ResourceChunk(ResourceType.CONCRETE, 13250),
                            new ResourceChunk(ResourceType.BRICK, 10600),
                            new ResourceChunk(ResourceType.WOOD, 742),
                            new ResourceChunk(ResourceType.MONEY, 424000)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.CONSTRUCTION, 12000),
                            new ResourceChunk(ResourceType.STEEL, 6440),
                            new ResourceChunk(ResourceType.CONCRETE, 20125),
                            new ResourceChunk(ResourceType.BRICK, 16100),
                            new ResourceChunk(ResourceType.WOOD, 1127),
                            new ResourceChunk(ResourceType.MONEY, 644000)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.CONSTRUCTION, 17600),
                            new ResourceChunk(ResourceType.STEEL, 9632),
                            new ResourceChunk(ResourceType.CONCRETE, 30100),
                            new ResourceChunk(ResourceType.BRICK, 24080),
                            new ResourceChunk(ResourceType.WOOD, 1686),
                            new ResourceChunk(ResourceType.MONEY, 963200)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.CONSTRUCTION, 24800),
                            new ResourceChunk(ResourceType.STEEL, 13880),
                            new ResourceChunk(ResourceType.CONCRETE, 43375),
                            new ResourceChunk(ResourceType.BRICK, 34700),
                            new ResourceChunk(ResourceType.WOOD, 2429),
                            new ResourceChunk(ResourceType.MONEY, 1388000)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.CONSTRUCTION, 33600),
                            new ResourceChunk(ResourceType.STEEL, 19248),
                            new ResourceChunk(ResourceType.CONCRETE, 60150),
                            new ResourceChunk(ResourceType.BRICK, 48120),
                            new ResourceChunk(ResourceType.WOOD, 3368),
                            new ResourceChunk(ResourceType.MONEY, 1924800)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.CONSTRUCTION, 44000),
                            new ResourceChunk(ResourceType.STEEL, 25800),
                            new ResourceChunk(ResourceType.CONCRETE, 80625),
                            new ResourceChunk(ResourceType.BRICK, 64500),
                            new ResourceChunk(ResourceType.WOOD, 4515),
                            new ResourceChunk(ResourceType.MONEY, 2580000)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.CONSTRUCTION, 56000),
                            new ResourceChunk(ResourceType.STEEL, 33600),
                            new ResourceChunk(ResourceType.CONCRETE, 105000),
                            new ResourceChunk(ResourceType.BRICK, 84000),
                            new ResourceChunk(ResourceType.WOOD, 5880),
                            new ResourceChunk(ResourceType.MONEY, 3360000)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.CONSTRUCTION, 70400),
                            new ResourceChunk(ResourceType.STEEL, 43392),
                            new ResourceChunk(ResourceType.CONCRETE, 135600),
                            new ResourceChunk(ResourceType.BRICK, 108480),
                            new ResourceChunk(ResourceType.WOOD, 7594),
                            new ResourceChunk(ResourceType.MONEY, 4339200)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.CONSTRUCTION, 87200),
                            new ResourceChunk(ResourceType.STEEL, 55320),
                            new ResourceChunk(ResourceType.CONCRETE, 172875),
                            new ResourceChunk(ResourceType.BRICK, 138300),
                            new ResourceChunk(ResourceType.WOOD, 9681),
                            new ResourceChunk(ResourceType.MONEY, 5532000)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.CONSTRUCTION, 106400),
                            new ResourceChunk(ResourceType.STEEL, 69528),
                            new ResourceChunk(ResourceType.CONCRETE, 217275),
                            new ResourceChunk(ResourceType.BRICK, 173820),
                            new ResourceChunk(ResourceType.WOOD, 12167),
                            new ResourceChunk(ResourceType.MONEY, 6952800)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.CONSTRUCTION, 128000),
                            new ResourceChunk(ResourceType.STEEL, 86160),
                            new ResourceChunk(ResourceType.CONCRETE, 269250),
                            new ResourceChunk(ResourceType.BRICK, 215400),
                            new ResourceChunk(ResourceType.WOOD, 15078),
                            new ResourceChunk(ResourceType.MONEY, 8616000)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.CONSTRUCTION, 152000),
                            new ResourceChunk(ResourceType.STEEL, 105360),
                            new ResourceChunk(ResourceType.CONCRETE, 329250),
                            new ResourceChunk(ResourceType.BRICK, 263400),
                            new ResourceChunk(ResourceType.WOOD, 18438),
                            new ResourceChunk(ResourceType.MONEY, 10536000)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.CONSTRUCTION, 179200),
                            new ResourceChunk(ResourceType.STEEL, 128208),
                            new ResourceChunk(ResourceType.CONCRETE, 400650),
                            new ResourceChunk(ResourceType.BRICK, 320520),
                            new ResourceChunk(ResourceType.WOOD, 22436),
                            new ResourceChunk(ResourceType.MONEY, 12820800)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.CONSTRUCTION, 209600),
                            new ResourceChunk(ResourceType.STEEL, 154960),
                            new ResourceChunk(ResourceType.CONCRETE, 484250),
                            new ResourceChunk(ResourceType.BRICK, 387400),
                            new ResourceChunk(ResourceType.WOOD, 27118),
                            new ResourceChunk(ResourceType.MONEY, 15496000)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.CONSTRUCTION, 243200),
                            new ResourceChunk(ResourceType.STEEL, 185872),
                            new ResourceChunk(ResourceType.CONCRETE, 580850),
                            new ResourceChunk(ResourceType.BRICK, 464680),
                            new ResourceChunk(ResourceType.WOOD, 32528),
                            new ResourceChunk(ResourceType.MONEY, 18587200)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.CONSTRUCTION, 280000),
                            new ResourceChunk(ResourceType.STEEL, 221200),
                            new ResourceChunk(ResourceType.CONCRETE, 691250),
                            new ResourceChunk(ResourceType.BRICK, 553000),
                            new ResourceChunk(ResourceType.WOOD, 38710),
                            new ResourceChunk(ResourceType.MONEY, 22120000)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.CONSTRUCTION, 320000),
                            new ResourceChunk(ResourceType.STEEL, 261200),
                            new ResourceChunk(ResourceType.CONCRETE, 816250),
                            new ResourceChunk(ResourceType.BRICK, 653000),
                            new ResourceChunk(ResourceType.WOOD, 45710),
                            new ResourceChunk(ResourceType.MONEY, 26120000)
                    )
            },
            new ResourcePack[]{ // jobPrice
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.ACTION, 24),
                            new ResourceChunk(ResourceType.ENERGY, 24)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.ACTION, 28),
                            new ResourceChunk(ResourceType.ENERGY, 28)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.ACTION, 32),
                            new ResourceChunk(ResourceType.ENERGY, 32)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.ACTION, 36),
                            new ResourceChunk(ResourceType.ENERGY, 36)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.ACTION, 40),
                            new ResourceChunk(ResourceType.ENERGY, 40)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.ACTION, 44),
                            new ResourceChunk(ResourceType.ENERGY, 44)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.ACTION, 48),
                            new ResourceChunk(ResourceType.ENERGY, 48)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.ACTION, 52),
                            new ResourceChunk(ResourceType.ENERGY, 52)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.ACTION, 56),
                            new ResourceChunk(ResourceType.ENERGY, 56)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.ACTION, 60),
                            new ResourceChunk(ResourceType.ENERGY, 60)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.ACTION, 64),
                            new ResourceChunk(ResourceType.ENERGY, 64)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.ACTION, 68),
                            new ResourceChunk(ResourceType.ENERGY, 68)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.ACTION, 72),
                            new ResourceChunk(ResourceType.ENERGY, 72)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.ACTION, 76),
                            new ResourceChunk(ResourceType.ENERGY, 76)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.ACTION, 80),
                            new ResourceChunk(ResourceType.ENERGY, 80)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.ACTION, 84),
                            new ResourceChunk(ResourceType.ENERGY, 84)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.ACTION, 88),
                            new ResourceChunk(ResourceType.ENERGY, 88)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.ACTION, 92),
                            new ResourceChunk(ResourceType.ENERGY, 92)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.ACTION, 96),
                            new ResourceChunk(ResourceType.ENERGY, 96)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.ACTION, 100),
                            new ResourceChunk(ResourceType.ENERGY, 100)
                    )
            },
            new ResourcePack[]{  // jobReward
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.GLASS, 20)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.GLASS, 40)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.GLASS, 60)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.GLASS, 80)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.GLASS, 100)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.GLASS, 140)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.GLASS, 180)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.GLASS, 220)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.GLASS, 260)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.GLASS, 300)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.GLASS, 360)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.GLASS, 420)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.GLASS, 480)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.GLASS, 540)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.GLASS, 600)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.GLASS, 680)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.GLASS, 760)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.GLASS, 840)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.GLASS, 920)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.GLASS, 1000)
                    )
            },
            null, // jobRewardMultiplier
            new ResourcePack[]{  // production
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.GLASS, 40)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.GLASS, 80)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.GLASS, 120)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.GLASS, 160)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.GLASS, 200)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.GLASS, 280)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.GLASS, 360)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.GLASS, 440)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.GLASS, 520)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.GLASS, 600)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.GLASS, 720)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.GLASS, 840)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.GLASS, 960)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.GLASS, 1080)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.GLASS, 1200)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.GLASS, 1360)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.GLASS, 1520)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.GLASS, 1680)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.GLASS, 1840)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.GLASS, 2000)
                    )
            },
            null, // productionMultiplier
            null, // supply
            null, // supplyMultiplier
            new ResourcePack[]{ // demand
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.UPKEEP, 100),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 16),
                            new ResourceChunk(ResourceType.JOB, 320),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.UPKEEP, 200),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 32),
                            new ResourceChunk(ResourceType.JOB, 640),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.UPKEEP, 300),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 48),
                            new ResourceChunk(ResourceType.JOB, 960),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.UPKEEP, 400),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 64),
                            new ResourceChunk(ResourceType.JOB, 1280),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.UPKEEP, 500),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 80),
                            new ResourceChunk(ResourceType.JOB, 1600),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.UPKEEP, 700),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 112),
                            new ResourceChunk(ResourceType.JOB, 2240),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.UPKEEP, 900),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 144),
                            new ResourceChunk(ResourceType.JOB, 2880),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.UPKEEP, 1100),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 176),
                            new ResourceChunk(ResourceType.JOB, 3520),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.UPKEEP, 1300),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 208),
                            new ResourceChunk(ResourceType.JOB, 4160),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.UPKEEP, 1500),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 240),
                            new ResourceChunk(ResourceType.JOB, 4800),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.UPKEEP, 1800),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 288),
                            new ResourceChunk(ResourceType.JOB, 5760),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.UPKEEP, 2100),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 336),
                            new ResourceChunk(ResourceType.JOB, 6720),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.UPKEEP, 2400),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 384),
                            new ResourceChunk(ResourceType.JOB, 7680),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.UPKEEP, 2700),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 432),
                            new ResourceChunk(ResourceType.JOB, 8640),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.UPKEEP, 3000),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 480),
                            new ResourceChunk(ResourceType.JOB, 9600),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.UPKEEP, 3400),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 544),
                            new ResourceChunk(ResourceType.JOB, 10880),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.UPKEEP, 3800),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 608),
                            new ResourceChunk(ResourceType.JOB, 12160),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.UPKEEP, 4200),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 672),
                            new ResourceChunk(ResourceType.JOB, 13440),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.UPKEEP, 4600),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 736),
                            new ResourceChunk(ResourceType.JOB, 14720),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.UPKEEP, 5000),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 800),
                            new ResourceChunk(ResourceType.JOB, 16000),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    )
            },
            new ResourcePack[]{ // hold
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.POWER, 16),
                            new ResourceChunk(ResourceType.JOB, 320),
                            new ResourceChunk(ResourceType.WORKER, 320)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.POWER, 32),
                            new ResourceChunk(ResourceType.JOB, 640),
                            new ResourceChunk(ResourceType.WORKER, 640)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.POWER, 48),
                            new ResourceChunk(ResourceType.JOB, 960),
                            new ResourceChunk(ResourceType.WORKER, 960)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.POWER, 64),
                            new ResourceChunk(ResourceType.JOB, 1280),
                            new ResourceChunk(ResourceType.WORKER, 1280)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.POWER, 80),
                            new ResourceChunk(ResourceType.JOB, 1600),
                            new ResourceChunk(ResourceType.WORKER, 1600)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.POWER, 112),
                            new ResourceChunk(ResourceType.JOB, 2240),
                            new ResourceChunk(ResourceType.WORKER, 2240)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.POWER, 144),
                            new ResourceChunk(ResourceType.JOB, 2880),
                            new ResourceChunk(ResourceType.WORKER, 2880)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.POWER, 176),
                            new ResourceChunk(ResourceType.JOB, 3520),
                            new ResourceChunk(ResourceType.WORKER, 3520)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.POWER, 208),
                            new ResourceChunk(ResourceType.JOB, 4160),
                            new ResourceChunk(ResourceType.WORKER, 4160)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.POWER, 240),
                            new ResourceChunk(ResourceType.JOB, 4800),
                            new ResourceChunk(ResourceType.WORKER, 4800)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.POWER, 288),
                            new ResourceChunk(ResourceType.JOB, 5760),
                            new ResourceChunk(ResourceType.WORKER, 5760)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.POWER, 336),
                            new ResourceChunk(ResourceType.JOB, 6720),
                            new ResourceChunk(ResourceType.WORKER, 6720)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.POWER, 384),
                            new ResourceChunk(ResourceType.JOB, 7680),
                            new ResourceChunk(ResourceType.WORKER, 7680)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.POWER, 432),
                            new ResourceChunk(ResourceType.JOB, 8640),
                            new ResourceChunk(ResourceType.WORKER, 8640)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.POWER, 480),
                            new ResourceChunk(ResourceType.JOB, 9600),
                            new ResourceChunk(ResourceType.WORKER, 9600)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.POWER, 544),
                            new ResourceChunk(ResourceType.JOB, 10880),
                            new ResourceChunk(ResourceType.WORKER, 10880)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.POWER, 608),
                            new ResourceChunk(ResourceType.JOB, 12160),
                            new ResourceChunk(ResourceType.WORKER, 12160)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.POWER, 672),
                            new ResourceChunk(ResourceType.JOB, 13440),
                            new ResourceChunk(ResourceType.WORKER, 13440)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.POWER, 736),
                            new ResourceChunk(ResourceType.JOB, 14720),
                            new ResourceChunk(ResourceType.WORKER, 14720)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.POWER, 800),
                            new ResourceChunk(ResourceType.JOB, 16000),
                            new ResourceChunk(ResourceType.WORKER, 16000)
                    )
            },
            null, // store
            null), // storeMultiplier
    OFFICE("office",
            Strings.BLD_OFFICE,
            Images.BLD_OFFICE,
            1, // requiredPlayerLevel
            1, // maxLevel
            1000, // buildLimit
            110, // priceMultiplier
            new int[]{ // structure
                    500, // 1
                    1500, // 2
                    3000, // 3
                    5000, // 4
                    7500, // 5
                    11000, // 6
                    15500, // 7
                    21000, // 8
                    27500, // 9
                    35000, // 10
                    44000, // 11
                    54500, // 12
                    66500, // 13
                    80000, // 14
                    95000, // 15
                    112000, // 16
                    131000, // 17
                    152000, // 18
                    175000, // 19
                    200000 // 20
            },
            new ResourcePack[]{  // buildCost
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.CONSTRUCTION, 500),
                            new ResourceChunk(ResourceType.STEEL, 163),
                            new ResourceChunk(ResourceType.CONCRETE, 245),
                            new ResourceChunk(ResourceType.WOOD, 61),
                            new ResourceChunk(ResourceType.GLASS, 1020),
                            new ResourceChunk(ResourceType.MONEY, 35700)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.CONSTRUCTION, 1500),
                            new ResourceChunk(ResourceType.STEEL, 496),
                            new ResourceChunk(ResourceType.CONCRETE, 744),
                            new ResourceChunk(ResourceType.WOOD, 186),
                            new ResourceChunk(ResourceType.GLASS, 3100),
                            new ResourceChunk(ResourceType.MONEY, 108500)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.CONSTRUCTION, 3000),
                            new ResourceChunk(ResourceType.STEEL, 1005),
                            new ResourceChunk(ResourceType.CONCRETE, 1507),
                            new ResourceChunk(ResourceType.WOOD, 377),
                            new ResourceChunk(ResourceType.GLASS, 6280),
                            new ResourceChunk(ResourceType.MONEY, 219800)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.CONSTRUCTION, 5000),
                            new ResourceChunk(ResourceType.STEEL, 1696),
                            new ResourceChunk(ResourceType.CONCRETE, 2544),
                            new ResourceChunk(ResourceType.WOOD, 636),
                            new ResourceChunk(ResourceType.GLASS, 10600),
                            new ResourceChunk(ResourceType.MONEY, 371000)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.CONSTRUCTION, 7500),
                            new ResourceChunk(ResourceType.STEEL, 2576),
                            new ResourceChunk(ResourceType.CONCRETE, 3864),
                            new ResourceChunk(ResourceType.WOOD, 966),
                            new ResourceChunk(ResourceType.GLASS, 16100),
                            new ResourceChunk(ResourceType.MONEY, 563500)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.CONSTRUCTION, 11000),
                            new ResourceChunk(ResourceType.STEEL, 3853),
                            new ResourceChunk(ResourceType.CONCRETE, 5779),
                            new ResourceChunk(ResourceType.WOOD, 1445),
                            new ResourceChunk(ResourceType.GLASS, 24080),
                            new ResourceChunk(ResourceType.MONEY, 842000)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.CONSTRUCTION, 15500),
                            new ResourceChunk(ResourceType.STEEL, 5552),
                            new ResourceChunk(ResourceType.CONCRETE, 8328),
                            new ResourceChunk(ResourceType.WOOD, 2082),
                            new ResourceChunk(ResourceType.GLASS, 34700),
                            new ResourceChunk(ResourceType.MONEY, 1214500)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.CONSTRUCTION, 21000),
                            new ResourceChunk(ResourceType.STEEL, 7699),
                            new ResourceChunk(ResourceType.CONCRETE, 11549),
                            new ResourceChunk(ResourceType.WOOD, 2887),
                            new ResourceChunk(ResourceType.GLASS, 48120),
                            new ResourceChunk(ResourceType.MONEY, 1684200)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.CONSTRUCTION, 27500),
                            new ResourceChunk(ResourceType.STEEL, 10320),
                            new ResourceChunk(ResourceType.CONCRETE, 15480),
                            new ResourceChunk(ResourceType.WOOD, 3870),
                            new ResourceChunk(ResourceType.GLASS, 64500),
                            new ResourceChunk(ResourceType.MONEY, 2257500)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.CONSTRUCTION, 35000),
                            new ResourceChunk(ResourceType.STEEL, 13440),
                            new ResourceChunk(ResourceType.CONCRETE, 20160),
                            new ResourceChunk(ResourceType.WOOD, 5040),
                            new ResourceChunk(ResourceType.GLASS, 84000),
                            new ResourceChunk(ResourceType.MONEY, 2940000)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.CONSTRUCTION, 44000),
                            new ResourceChunk(ResourceType.STEEL, 17357),
                            new ResourceChunk(ResourceType.CONCRETE, 26036),
                            new ResourceChunk(ResourceType.WOOD, 6509),
                            new ResourceChunk(ResourceType.GLASS, 108480),
                            new ResourceChunk(ResourceType.MONEY, 3796800)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.CONSTRUCTION, 54500),
                            new ResourceChunk(ResourceType.STEEL, 22128),
                            new ResourceChunk(ResourceType.CONCRETE, 33192),
                            new ResourceChunk(ResourceType.WOOD, 8298),
                            new ResourceChunk(ResourceType.GLASS, 138300),
                            new ResourceChunk(ResourceType.MONEY, 4840500)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.CONSTRUCTION, 66500),
                            new ResourceChunk(ResourceType.STEEL, 27811),
                            new ResourceChunk(ResourceType.CONCRETE, 41717),
                            new ResourceChunk(ResourceType.WOOD, 10249),
                            new ResourceChunk(ResourceType.GLASS, 173820),
                            new ResourceChunk(ResourceType.MONEY, 6083700)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.CONSTRUCTION, 80000),
                            new ResourceChunk(ResourceType.STEEL, 34464),
                            new ResourceChunk(ResourceType.CONCRETE, 51696),
                            new ResourceChunk(ResourceType.WOOD, 12924),
                            new ResourceChunk(ResourceType.GLASS, 215400),
                            new ResourceChunk(ResourceType.MONEY, 7539000)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.CONSTRUCTION, 95000),
                            new ResourceChunk(ResourceType.STEEL, 42144),
                            new ResourceChunk(ResourceType.CONCRETE, 63216),
                            new ResourceChunk(ResourceType.WOOD, 15804),
                            new ResourceChunk(ResourceType.GLASS, 263400),
                            new ResourceChunk(ResourceType.MONEY, 9219000)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.CONSTRUCTION, 112000),
                            new ResourceChunk(ResourceType.STEEL, 51283),
                            new ResourceChunk(ResourceType.CONCRETE, 76925),
                            new ResourceChunk(ResourceType.WOOD, 19231),
                            new ResourceChunk(ResourceType.GLASS, 320520),
                            new ResourceChunk(ResourceType.MONEY, 11218200)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.CONSTRUCTION, 131000),
                            new ResourceChunk(ResourceType.STEEL, 61984),
                            new ResourceChunk(ResourceType.CONCRETE, 92976),
                            new ResourceChunk(ResourceType.WOOD, 23244),
                            new ResourceChunk(ResourceType.GLASS, 387400),
                            new ResourceChunk(ResourceType.MONEY, 13559000)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.CONSTRUCTION, 152000),
                            new ResourceChunk(ResourceType.STEEL, 74349),
                            new ResourceChunk(ResourceType.CONCRETE, 111523),
                            new ResourceChunk(ResourceType.WOOD, 27881),
                            new ResourceChunk(ResourceType.GLASS, 464680),
                            new ResourceChunk(ResourceType.MONEY, 16263800)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.CONSTRUCTION, 175000),
                            new ResourceChunk(ResourceType.STEEL, 88480),
                            new ResourceChunk(ResourceType.CONCRETE, 132720),
                            new ResourceChunk(ResourceType.WOOD, 33180),
                            new ResourceChunk(ResourceType.GLASS, 553000),
                            new ResourceChunk(ResourceType.MONEY, 19355000)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.CONSTRUCTION, 20000),
                            new ResourceChunk(ResourceType.STEEL, 104480),
                            new ResourceChunk(ResourceType.CONCRETE, 156720),
                            new ResourceChunk(ResourceType.WOOD, 39180),
                            new ResourceChunk(ResourceType.GLASS, 653000),
                            new ResourceChunk(ResourceType.MONEY, 22855000)
                    )
            },
            new ResourcePack[]{ // jobPrice
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.ACTION, 24),
                            new ResourceChunk(ResourceType.ENERGY, 24)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.ACTION, 28),
                            new ResourceChunk(ResourceType.ENERGY, 28)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.ACTION, 32),
                            new ResourceChunk(ResourceType.ENERGY, 32)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.ACTION, 36),
                            new ResourceChunk(ResourceType.ENERGY, 36)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.ACTION, 40),
                            new ResourceChunk(ResourceType.ENERGY, 40)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.ACTION, 44),
                            new ResourceChunk(ResourceType.ENERGY, 44)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.ACTION, 48),
                            new ResourceChunk(ResourceType.ENERGY, 48)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.ACTION, 52),
                            new ResourceChunk(ResourceType.ENERGY, 52)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.ACTION, 56),
                            new ResourceChunk(ResourceType.ENERGY, 56)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.ACTION, 60),
                            new ResourceChunk(ResourceType.ENERGY, 60)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.ACTION, 64),
                            new ResourceChunk(ResourceType.ENERGY, 64)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.ACTION, 68),
                            new ResourceChunk(ResourceType.ENERGY, 68)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.ACTION, 72),
                            new ResourceChunk(ResourceType.ENERGY, 72)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.ACTION, 76),
                            new ResourceChunk(ResourceType.ENERGY, 76)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.ACTION, 80),
                            new ResourceChunk(ResourceType.ENERGY, 80)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.ACTION, 84),
                            new ResourceChunk(ResourceType.ENERGY, 84)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.ACTION, 88),
                            new ResourceChunk(ResourceType.ENERGY, 88)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.ACTION, 92),
                            new ResourceChunk(ResourceType.ENERGY, 92)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.ACTION, 96),
                            new ResourceChunk(ResourceType.ENERGY, 96)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.ACTION, 100),
                            new ResourceChunk(ResourceType.ENERGY, 100)
                    )
            },
            new ResourcePack[]{  // jobReward
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.MONEY, 200)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.MONEY, 400)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.MONEY, 600)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.MONEY, 800)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.MONEY, 1000)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.MONEY, 1400)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.MONEY, 1800)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.MONEY, 2200)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.MONEY, 2600)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.MONEY, 3000)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.MONEY, 3600)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.MONEY, 4200)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.MONEY, 4800)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.MONEY, 5400)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.MONEY, 6000)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.MONEY, 6800)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.MONEY, 7600)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.MONEY, 8400)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.MONEY, 9200)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.MONEY, 10000)
                    )
            },
            null, // jobRewardMultiplier
            new ResourcePack[]{  // production
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.MONEY, 200)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.MONEY, 400)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.MONEY, 600)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.MONEY, 800)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.MONEY, 1000)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.MONEY, 1400)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.MONEY, 1800)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.MONEY, 2200)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.MONEY, 2600)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.MONEY, 3000)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.MONEY, 3600)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.MONEY, 4200)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.MONEY, 4800)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.MONEY, 5400)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.MONEY, 6000)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.MONEY, 6800)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.MONEY, 7600)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.MONEY, 8400)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.MONEY, 9200)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.MONEY, 10000)
                    )
            },
            null, // productionMultiplier
            null, // supply
            null, // supplyMultiplier
            new ResourcePack[]{ // demand
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 9),
                            new ResourceChunk(ResourceType.JOB, 180),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 18),
                            new ResourceChunk(ResourceType.JOB, 360),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 27),
                            new ResourceChunk(ResourceType.JOB, 540),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 36),
                            new ResourceChunk(ResourceType.JOB, 720),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 45),
                            new ResourceChunk(ResourceType.JOB, 900),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 63),
                            new ResourceChunk(ResourceType.JOB, 1260),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 81),
                            new ResourceChunk(ResourceType.JOB, 1620),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 99),
                            new ResourceChunk(ResourceType.JOB, 1980),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 117),
                            new ResourceChunk(ResourceType.JOB, 2340),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 135),
                            new ResourceChunk(ResourceType.JOB, 2700),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 162),
                            new ResourceChunk(ResourceType.JOB, 3240),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 189),
                            new ResourceChunk(ResourceType.JOB, 3780),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 216),
                            new ResourceChunk(ResourceType.JOB, 4320),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 243),
                            new ResourceChunk(ResourceType.JOB, 4860),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 270),
                            new ResourceChunk(ResourceType.JOB, 5400),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 306),
                            new ResourceChunk(ResourceType.JOB, 6120),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 342),
                            new ResourceChunk(ResourceType.JOB, 6840),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 378),
                            new ResourceChunk(ResourceType.JOB, 7560),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 414),
                            new ResourceChunk(ResourceType.JOB, 8280),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 450),
                            new ResourceChunk(ResourceType.JOB, 9000),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    )
            },
            new ResourcePack[]{ // hold
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.POWER, 9),
                            new ResourceChunk(ResourceType.JOB, 180),
                            new ResourceChunk(ResourceType.WORKER, 180)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.POWER, 18),
                            new ResourceChunk(ResourceType.JOB, 360),
                            new ResourceChunk(ResourceType.WORKER, 360)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.POWER, 27),
                            new ResourceChunk(ResourceType.JOB, 540),
                            new ResourceChunk(ResourceType.WORKER, 540)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.POWER, 36),
                            new ResourceChunk(ResourceType.JOB, 720),
                            new ResourceChunk(ResourceType.WORKER, 720)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.POWER, 45),
                            new ResourceChunk(ResourceType.JOB, 900),
                            new ResourceChunk(ResourceType.WORKER, 900)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.POWER, 63),
                            new ResourceChunk(ResourceType.JOB, 1260),
                            new ResourceChunk(ResourceType.WORKER, 1260)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.POWER, 81),
                            new ResourceChunk(ResourceType.JOB, 1620),
                            new ResourceChunk(ResourceType.WORKER, 1620)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.POWER, 99),
                            new ResourceChunk(ResourceType.JOB, 1980),
                            new ResourceChunk(ResourceType.WORKER, 1980)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.POWER, 117),
                            new ResourceChunk(ResourceType.JOB, 2340),
                            new ResourceChunk(ResourceType.WORKER, 2340)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.POWER, 135),
                            new ResourceChunk(ResourceType.JOB, 2700),
                            new ResourceChunk(ResourceType.WORKER, 2700)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.POWER, 162),
                            new ResourceChunk(ResourceType.JOB, 3240),
                            new ResourceChunk(ResourceType.WORKER, 3240)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.POWER, 189),
                            new ResourceChunk(ResourceType.JOB, 3780),
                            new ResourceChunk(ResourceType.WORKER, 3780)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.POWER, 216),
                            new ResourceChunk(ResourceType.JOB, 4320),
                            new ResourceChunk(ResourceType.WORKER, 4320)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.POWER, 243),
                            new ResourceChunk(ResourceType.JOB, 4860),
                            new ResourceChunk(ResourceType.WORKER, 4860)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.POWER, 270),
                            new ResourceChunk(ResourceType.JOB, 5400),
                            new ResourceChunk(ResourceType.WORKER, 5400)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.POWER, 306),
                            new ResourceChunk(ResourceType.JOB, 6120),
                            new ResourceChunk(ResourceType.WORKER, 6120)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.POWER, 342),
                            new ResourceChunk(ResourceType.JOB, 6840),
                            new ResourceChunk(ResourceType.WORKER, 6840)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.POWER, 378),
                            new ResourceChunk(ResourceType.JOB, 7560),
                            new ResourceChunk(ResourceType.WORKER, 7560)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.POWER, 414),
                            new ResourceChunk(ResourceType.JOB, 8280),
                            new ResourceChunk(ResourceType.WORKER, 8280)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.POWER, 450),
                            new ResourceChunk(ResourceType.JOB, 9000),
                            new ResourceChunk(ResourceType.WORKER, 9000)
                    )
            },
            null, // store
            null), // storeMultiplier
    APARTMENT("apartment",
            Strings.BLD_APARTMENT,
            Images.BLD_APARTMENT,
            1, // requiredPlayerLevel
            1, // maxLevel
            1, // buildLimit
            100, // priceMultiplier
            null, // structure
            null, // buildCost
            null, // jobPrice
            null, // jobReward
            null, // jobRewardMultiplier
            null, // production
            null, // productionMultiplier
            null, // supply
            null, // supplyMultiplier
            null, // demand
            null, // hold
            null, // store
            null), // storeMultiplier
    WAREHOUSE("warehouse",
            Strings.BLD_WAREHOUSE,
            Images.BLD_WAREHOUSE,
            1, // requiredPlayerLevel
            1, // maxLevel
            1000, // buildLimit
            132, // priceMultiplier
            new int[]{ // structure
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
            },
            new ResourcePack[]{  // buildCost
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.CONSTRUCTION, 200),
                            new ResourceChunk(ResourceType.STEEL, 102),
                            new ResourceChunk(ResourceType.CONCRETE, 316),
                            new ResourceChunk(ResourceType.BRICK, 255),
                            new ResourceChunk(ResourceType.WOOD, 20),
                            new ResourceChunk(ResourceType.GLASS, 36),
                            new ResourceChunk(ResourceType.MONEY, 8160)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.CONSTRUCTION, 600),
                            new ResourceChunk(ResourceType.STEEL, 310),
                            new ResourceChunk(ResourceType.CONCRETE, 961),
                            new ResourceChunk(ResourceType.BRICK, 775),
                            new ResourceChunk(ResourceType.WOOD, 62),
                            new ResourceChunk(ResourceType.GLASS, 109),
                            new ResourceChunk(ResourceType.MONEY, 24800)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.CONSTRUCTION, 1200),
                            new ResourceChunk(ResourceType.STEEL, 628),
                            new ResourceChunk(ResourceType.CONCRETE, 1947),
                            new ResourceChunk(ResourceType.BRICK, 1570),
                            new ResourceChunk(ResourceType.WOOD, 126),
                            new ResourceChunk(ResourceType.GLASS, 220),
                            new ResourceChunk(ResourceType.MONEY, 50240)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.CONSTRUCTION, 2000),
                            new ResourceChunk(ResourceType.STEEL, 1060),
                            new ResourceChunk(ResourceType.CONCRETE, 3286),
                            new ResourceChunk(ResourceType.BRICK, 2650),
                            new ResourceChunk(ResourceType.WOOD, 212),
                            new ResourceChunk(ResourceType.GLASS, 371),
                            new ResourceChunk(ResourceType.MONEY, 84800)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.CONSTRUCTION, 3000),
                            new ResourceChunk(ResourceType.STEEL, 1610),
                            new ResourceChunk(ResourceType.CONCRETE, 4991),
                            new ResourceChunk(ResourceType.BRICK, 4025),
                            new ResourceChunk(ResourceType.WOOD, 322),
                            new ResourceChunk(ResourceType.GLASS, 564),
                            new ResourceChunk(ResourceType.MONEY, 128800)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.CONSTRUCTION, 4400),
                            new ResourceChunk(ResourceType.STEEL, 2408),
                            new ResourceChunk(ResourceType.CONCRETE, 7465),
                            new ResourceChunk(ResourceType.BRICK, 6020),
                            new ResourceChunk(ResourceType.WOOD, 482),
                            new ResourceChunk(ResourceType.GLASS, 843),
                            new ResourceChunk(ResourceType.MONEY, 192640)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.CONSTRUCTION, 6200),
                            new ResourceChunk(ResourceType.STEEL, 3470),
                            new ResourceChunk(ResourceType.CONCRETE, 10757),
                            new ResourceChunk(ResourceType.BRICK, 8675),
                            new ResourceChunk(ResourceType.WOOD, 694),
                            new ResourceChunk(ResourceType.GLASS, 1215),
                            new ResourceChunk(ResourceType.MONEY, 277600)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.CONSTRUCTION, 8400),
                            new ResourceChunk(ResourceType.STEEL, 4812),
                            new ResourceChunk(ResourceType.CONCRETE, 14917),
                            new ResourceChunk(ResourceType.BRICK, 12030),
                            new ResourceChunk(ResourceType.WOOD, 962),
                            new ResourceChunk(ResourceType.GLASS, 1684),
                            new ResourceChunk(ResourceType.MONEY, 384960)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.CONSTRUCTION, 11000),
                            new ResourceChunk(ResourceType.STEEL, 6450),
                            new ResourceChunk(ResourceType.CONCRETE, 19995),
                            new ResourceChunk(ResourceType.BRICK, 16125),
                            new ResourceChunk(ResourceType.WOOD, 1290),
                            new ResourceChunk(ResourceType.GLASS, 2258),
                            new ResourceChunk(ResourceType.MONEY, 516000)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.CONSTRUCTION, 14000),
                            new ResourceChunk(ResourceType.STEEL, 8400),
                            new ResourceChunk(ResourceType.CONCRETE, 26040),
                            new ResourceChunk(ResourceType.BRICK, 21000),
                            new ResourceChunk(ResourceType.WOOD, 1680),
                            new ResourceChunk(ResourceType.GLASS, 2940),
                            new ResourceChunk(ResourceType.MONEY, 672000)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.CONSTRUCTION, 17600),
                            new ResourceChunk(ResourceType.STEEL, 10848),
                            new ResourceChunk(ResourceType.CONCRETE, 33629),
                            new ResourceChunk(ResourceType.BRICK, 27120),
                            new ResourceChunk(ResourceType.WOOD, 2170),
                            new ResourceChunk(ResourceType.GLASS, 3797),
                            new ResourceChunk(ResourceType.MONEY, 867840)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.CONSTRUCTION, 21800),
                            new ResourceChunk(ResourceType.STEEL, 13830),
                            new ResourceChunk(ResourceType.CONCRETE, 42873),
                            new ResourceChunk(ResourceType.BRICK, 34575),
                            new ResourceChunk(ResourceType.WOOD, 2776),
                            new ResourceChunk(ResourceType.GLASS, 4841),
                            new ResourceChunk(ResourceType.MONEY, 1106400)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.CONSTRUCTION, 26600),
                            new ResourceChunk(ResourceType.STEEL, 17382),
                            new ResourceChunk(ResourceType.CONCRETE, 53884),
                            new ResourceChunk(ResourceType.BRICK, 53455),
                            new ResourceChunk(ResourceType.WOOD, 476),
                            new ResourceChunk(ResourceType.GLASS, 6084),
                            new ResourceChunk(ResourceType.MONEY, 139560)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.CONSTRUCTION, 32000),
                            new ResourceChunk(ResourceType.STEEL, 21540),
                            new ResourceChunk(ResourceType.CONCRETE, 66774),
                            new ResourceChunk(ResourceType.BRICK, 53850),
                            new ResourceChunk(ResourceType.WOOD, 4308),
                            new ResourceChunk(ResourceType.GLASS, 7539),
                            new ResourceChunk(ResourceType.MONEY, 1723200)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.CONSTRUCTION, 38000),
                            new ResourceChunk(ResourceType.STEEL, 26340),
                            new ResourceChunk(ResourceType.CONCRETE, 81654),
                            new ResourceChunk(ResourceType.BRICK, 65850),
                            new ResourceChunk(ResourceType.WOOD, 5268),
                            new ResourceChunk(ResourceType.GLASS, 9219),
                            new ResourceChunk(ResourceType.MONEY, 2107200)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.CONSTRUCTION, 44800),
                            new ResourceChunk(ResourceType.STEEL, 32052),
                            new ResourceChunk(ResourceType.CONCRETE, 99361),
                            new ResourceChunk(ResourceType.BRICK, 80130),
                            new ResourceChunk(ResourceType.WOOD, 6410),
                            new ResourceChunk(ResourceType.GLASS, 11218),
                            new ResourceChunk(ResourceType.MONEY, 2564160)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.CONSTRUCTION, 52400),
                            new ResourceChunk(ResourceType.STEEL, 38740),
                            new ResourceChunk(ResourceType.CONCRETE, 120094),
                            new ResourceChunk(ResourceType.BRICK, 96850),
                            new ResourceChunk(ResourceType.WOOD, 7748),
                            new ResourceChunk(ResourceType.GLASS, 13359),
                            new ResourceChunk(ResourceType.MONEY, 3099200)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.CONSTRUCTION, 60800),
                            new ResourceChunk(ResourceType.STEEL, 46468),
                            new ResourceChunk(ResourceType.CONCRETE, 144051),
                            new ResourceChunk(ResourceType.BRICK, 116170),
                            new ResourceChunk(ResourceType.WOOD, 9294),
                            new ResourceChunk(ResourceType.GLASS, 16264),
                            new ResourceChunk(ResourceType.MONEY, 3717440)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.CONSTRUCTION, 70000),
                            new ResourceChunk(ResourceType.STEEL, 55300),
                            new ResourceChunk(ResourceType.CONCRETE, 171430),
                            new ResourceChunk(ResourceType.BRICK, 138250),
                            new ResourceChunk(ResourceType.WOOD, 11060),
                            new ResourceChunk(ResourceType.GLASS, 19355),
                            new ResourceChunk(ResourceType.MONEY, 4424000)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.CONSTRUCTION, 80000),
                            new ResourceChunk(ResourceType.STEEL, 65300),
                            new ResourceChunk(ResourceType.CONCRETE, 202430),
                            new ResourceChunk(ResourceType.BRICK, 163250),
                            new ResourceChunk(ResourceType.WOOD, 13060),
                            new ResourceChunk(ResourceType.GLASS, 22855),
                            new ResourceChunk(ResourceType.MONEY, 5224000)
                    )
            },
            null, // jobPrice
            null, // jobReward
            null, // jobRewardMultiplier
            null, // production
            null, // productionMultiplier
            null, // supply
            null, // supplyMultiplier
            new ResourcePack[]{ // demand
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.UPKEEP, 100),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 4),
                            new ResourceChunk(ResourceType.JOB, 80),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.UPKEEP, 200),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 8),
                            new ResourceChunk(ResourceType.JOB, 160),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.UPKEEP, 300),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 12),
                            new ResourceChunk(ResourceType.JOB, 240),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.UPKEEP, 400),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 16),
                            new ResourceChunk(ResourceType.JOB, 320),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.UPKEEP, 500),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 20),
                            new ResourceChunk(ResourceType.JOB, 400),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.UPKEEP, 700),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 28),
                            new ResourceChunk(ResourceType.JOB, 560),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.UPKEEP, 900),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 36),
                            new ResourceChunk(ResourceType.JOB, 720),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.UPKEEP, 1100),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 44),
                            new ResourceChunk(ResourceType.JOB, 880),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.UPKEEP, 1300),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 52),
                            new ResourceChunk(ResourceType.JOB, 1040),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.UPKEEP, 1500),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 60),
                            new ResourceChunk(ResourceType.JOB, 1200),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.UPKEEP, 1800),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 72),
                            new ResourceChunk(ResourceType.JOB, 1440),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.UPKEEP, 2100),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 84),
                            new ResourceChunk(ResourceType.JOB, 1680),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.UPKEEP, 2400),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 96),
                            new ResourceChunk(ResourceType.JOB, 1920),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.UPKEEP, 2700),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 108),
                            new ResourceChunk(ResourceType.JOB, 2160),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.UPKEEP, 3000),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 120),
                            new ResourceChunk(ResourceType.JOB, 2400),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.UPKEEP, 3400),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 136),
                            new ResourceChunk(ResourceType.JOB, 2720),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.UPKEEP, 3800),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 152),
                            new ResourceChunk(ResourceType.JOB, 3040),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.UPKEEP, 4200),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 168),
                            new ResourceChunk(ResourceType.JOB, 3360),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.UPKEEP, 4600),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 184),
                            new ResourceChunk(ResourceType.JOB, 3600),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.UPKEEP, 5000),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 200),
                            new ResourceChunk(ResourceType.JOB, 4000),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    )
            },
            new ResourcePack[]{ // hold
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.POWER, 4),
                            new ResourceChunk(ResourceType.JOB, 80),
                            new ResourceChunk(ResourceType.WORKER, 80)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.POWER, 8),
                            new ResourceChunk(ResourceType.JOB, 160),
                            new ResourceChunk(ResourceType.WORKER, 160)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.POWER, 12),
                            new ResourceChunk(ResourceType.JOB, 240),
                            new ResourceChunk(ResourceType.WORKER, 240)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.POWER, 16),
                            new ResourceChunk(ResourceType.JOB, 320),
                            new ResourceChunk(ResourceType.WORKER, 320)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.POWER, 20),
                            new ResourceChunk(ResourceType.JOB, 400),
                            new ResourceChunk(ResourceType.WORKER, 400)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.POWER, 28),
                            new ResourceChunk(ResourceType.JOB, 560),
                            new ResourceChunk(ResourceType.WORKER, 560)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.POWER, 36),
                            new ResourceChunk(ResourceType.JOB, 720),
                            new ResourceChunk(ResourceType.WORKER, 720)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.POWER, 44),
                            new ResourceChunk(ResourceType.JOB, 880),
                            new ResourceChunk(ResourceType.WORKER, 880)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.POWER, 52),
                            new ResourceChunk(ResourceType.JOB, 1040),
                            new ResourceChunk(ResourceType.WORKER, 1040)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.POWER, 60),
                            new ResourceChunk(ResourceType.JOB, 1200),
                            new ResourceChunk(ResourceType.WORKER, 1200)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.POWER, 72),
                            new ResourceChunk(ResourceType.JOB, 1440),
                            new ResourceChunk(ResourceType.WORKER, 1440)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.POWER, 84),
                            new ResourceChunk(ResourceType.JOB, 1680),
                            new ResourceChunk(ResourceType.WORKER, 1680)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.POWER, 96),
                            new ResourceChunk(ResourceType.JOB, 1920),
                            new ResourceChunk(ResourceType.WORKER, 1920)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.POWER, 108),
                            new ResourceChunk(ResourceType.JOB, 2160),
                            new ResourceChunk(ResourceType.WORKER, 2160)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.POWER, 120),
                            new ResourceChunk(ResourceType.JOB, 2400),
                            new ResourceChunk(ResourceType.WORKER, 2400)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.POWER, 136),
                            new ResourceChunk(ResourceType.JOB, 2720),
                            new ResourceChunk(ResourceType.WORKER, 2720)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.POWER, 152),
                            new ResourceChunk(ResourceType.JOB, 3040),
                            new ResourceChunk(ResourceType.WORKER, 3040)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.POWER, 168),
                            new ResourceChunk(ResourceType.JOB, 3360),
                            new ResourceChunk(ResourceType.WORKER, 3360)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.POWER, 184),
                            new ResourceChunk(ResourceType.JOB, 3600),
                            new ResourceChunk(ResourceType.WORKER, 3600)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.POWER, 200),
                            new ResourceChunk(ResourceType.JOB, 4000),
                            new ResourceChunk(ResourceType.WORKER, 4000)
                    )
            },
            new ResourcePack[]{ // store
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.STEEL, 400),
                            new ResourceChunk(ResourceType.CONCRETE, 400),
                            new ResourceChunk(ResourceType.BRICK, 400),
                            new ResourceChunk(ResourceType.WOOD, 400),
                            new ResourceChunk(ResourceType.GLASS, 400)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.STEEL, 800),
                            new ResourceChunk(ResourceType.CONCRETE, 800),
                            new ResourceChunk(ResourceType.BRICK, 800),
                            new ResourceChunk(ResourceType.WOOD, 800),
                            new ResourceChunk(ResourceType.GLASS, 800)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.STEEL, 1200),
                            new ResourceChunk(ResourceType.CONCRETE, 1200),
                            new ResourceChunk(ResourceType.BRICK, 1200),
                            new ResourceChunk(ResourceType.WOOD, 1200),
                            new ResourceChunk(ResourceType.GLASS, 1200)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.STEEL, 1600),
                            new ResourceChunk(ResourceType.CONCRETE, 1600),
                            new ResourceChunk(ResourceType.BRICK, 1600),
                            new ResourceChunk(ResourceType.WOOD, 1600),
                            new ResourceChunk(ResourceType.GLASS, 1600)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.STEEL, 2000),
                            new ResourceChunk(ResourceType.CONCRETE, 2000),
                            new ResourceChunk(ResourceType.BRICK, 2000),
                            new ResourceChunk(ResourceType.WOOD, 2000),
                            new ResourceChunk(ResourceType.GLASS, 2000)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.STEEL, 2800),
                            new ResourceChunk(ResourceType.CONCRETE, 2800),
                            new ResourceChunk(ResourceType.BRICK, 2800),
                            new ResourceChunk(ResourceType.WOOD, 2800),
                            new ResourceChunk(ResourceType.GLASS, 2800)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.STEEL, 3600),
                            new ResourceChunk(ResourceType.CONCRETE, 3600),
                            new ResourceChunk(ResourceType.BRICK, 3600),
                            new ResourceChunk(ResourceType.WOOD, 3600),
                            new ResourceChunk(ResourceType.GLASS, 3600)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.STEEL, 4400),
                            new ResourceChunk(ResourceType.CONCRETE, 4400),
                            new ResourceChunk(ResourceType.BRICK, 4400),
                            new ResourceChunk(ResourceType.WOOD, 4400),
                            new ResourceChunk(ResourceType.GLASS, 4400)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.STEEL, 5200),
                            new ResourceChunk(ResourceType.CONCRETE, 5200),
                            new ResourceChunk(ResourceType.BRICK, 5200),
                            new ResourceChunk(ResourceType.WOOD, 5200),
                            new ResourceChunk(ResourceType.GLASS, 5200)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.STEEL, 6000),
                            new ResourceChunk(ResourceType.CONCRETE, 6000),
                            new ResourceChunk(ResourceType.BRICK, 6000),
                            new ResourceChunk(ResourceType.WOOD, 6000),
                            new ResourceChunk(ResourceType.GLASS, 6000)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.STEEL, 7200),
                            new ResourceChunk(ResourceType.CONCRETE, 7200),
                            new ResourceChunk(ResourceType.BRICK, 7200),
                            new ResourceChunk(ResourceType.WOOD, 7200),
                            new ResourceChunk(ResourceType.GLASS, 7200)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.STEEL, 8400),
                            new ResourceChunk(ResourceType.CONCRETE, 8400),
                            new ResourceChunk(ResourceType.BRICK, 8400),
                            new ResourceChunk(ResourceType.WOOD, 8400),
                            new ResourceChunk(ResourceType.GLASS, 8400)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.STEEL, 9600),
                            new ResourceChunk(ResourceType.CONCRETE, 9600),
                            new ResourceChunk(ResourceType.BRICK, 9600),
                            new ResourceChunk(ResourceType.WOOD, 9600),
                            new ResourceChunk(ResourceType.GLASS, 9600)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.STEEL, 10800),
                            new ResourceChunk(ResourceType.CONCRETE, 10800),
                            new ResourceChunk(ResourceType.BRICK, 10800),
                            new ResourceChunk(ResourceType.WOOD, 10800),
                            new ResourceChunk(ResourceType.GLASS, 10800)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.STEEL, 12000),
                            new ResourceChunk(ResourceType.CONCRETE, 12000),
                            new ResourceChunk(ResourceType.BRICK, 12000),
                            new ResourceChunk(ResourceType.WOOD, 12000),
                            new ResourceChunk(ResourceType.GLASS, 12000)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.STEEL, 13600),
                            new ResourceChunk(ResourceType.CONCRETE, 13600),
                            new ResourceChunk(ResourceType.BRICK, 13600),
                            new ResourceChunk(ResourceType.WOOD, 13600),
                            new ResourceChunk(ResourceType.GLASS, 13600)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.STEEL, 15200),
                            new ResourceChunk(ResourceType.CONCRETE, 15200),
                            new ResourceChunk(ResourceType.BRICK, 15200),
                            new ResourceChunk(ResourceType.WOOD, 15200),
                            new ResourceChunk(ResourceType.GLASS, 15200)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.STEEL, 16800),
                            new ResourceChunk(ResourceType.CONCRETE, 16800),
                            new ResourceChunk(ResourceType.BRICK, 16800),
                            new ResourceChunk(ResourceType.WOOD, 16800),
                            new ResourceChunk(ResourceType.GLASS, 16800)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.STEEL, 18400),
                            new ResourceChunk(ResourceType.CONCRETE, 18400),
                            new ResourceChunk(ResourceType.BRICK, 18400),
                            new ResourceChunk(ResourceType.WOOD, 18400),
                            new ResourceChunk(ResourceType.GLASS, 18400)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.STEEL, 20000),
                            new ResourceChunk(ResourceType.CONCRETE, 20000),
                            new ResourceChunk(ResourceType.BRICK, 20000),
                            new ResourceChunk(ResourceType.WOOD, 20000),
                            new ResourceChunk(ResourceType.GLASS, 20000)
                    )
            },
            null), // storeMultiplier
    WAREHOUSE_STEEL("warehouse_steel",
            Strings.BLD_WAREHOUSE_STEEL,
            Images.BLD_WAREHOUSE_STEEL,
            1, // requiredPlayerLevel
            1, // maxLevel
            1000, // buildLimit
            132, // priceMultiplier
            new int[]{ // structure
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
            },
            new ResourcePack[]{  // buildCost
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.CONSTRUCTION, 200),
                            new ResourceChunk(ResourceType.CONCRETE, 316),
                            new ResourceChunk(ResourceType.BRICK, 255),
                            new ResourceChunk(ResourceType.WOOD, 20),
                            new ResourceChunk(ResourceType.GLASS, 36),
                            new ResourceChunk(ResourceType.MONEY, 8160)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.CONSTRUCTION, 600),
                            new ResourceChunk(ResourceType.CONCRETE, 961),
                            new ResourceChunk(ResourceType.BRICK, 775),
                            new ResourceChunk(ResourceType.WOOD, 62),
                            new ResourceChunk(ResourceType.GLASS, 109),
                            new ResourceChunk(ResourceType.MONEY, 24800)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.CONSTRUCTION, 1200),
                            new ResourceChunk(ResourceType.CONCRETE, 1947),
                            new ResourceChunk(ResourceType.BRICK, 1570),
                            new ResourceChunk(ResourceType.WOOD, 126),
                            new ResourceChunk(ResourceType.GLASS, 220),
                            new ResourceChunk(ResourceType.MONEY, 50240)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.CONSTRUCTION, 2000),
                            new ResourceChunk(ResourceType.CONCRETE, 3286),
                            new ResourceChunk(ResourceType.BRICK, 2650),
                            new ResourceChunk(ResourceType.WOOD, 212),
                            new ResourceChunk(ResourceType.GLASS, 371),
                            new ResourceChunk(ResourceType.MONEY, 84800)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.CONSTRUCTION, 3000),
                            new ResourceChunk(ResourceType.CONCRETE, 4991),
                            new ResourceChunk(ResourceType.BRICK, 4025),
                            new ResourceChunk(ResourceType.WOOD, 322),
                            new ResourceChunk(ResourceType.GLASS, 564),
                            new ResourceChunk(ResourceType.MONEY, 128800)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.CONSTRUCTION, 4400),
                            new ResourceChunk(ResourceType.CONCRETE, 7465),
                            new ResourceChunk(ResourceType.BRICK, 6020),
                            new ResourceChunk(ResourceType.WOOD, 482),
                            new ResourceChunk(ResourceType.GLASS, 843),
                            new ResourceChunk(ResourceType.MONEY, 192640)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.CONSTRUCTION, 6200),
                            new ResourceChunk(ResourceType.CONCRETE, 10757),
                            new ResourceChunk(ResourceType.BRICK, 8675),
                            new ResourceChunk(ResourceType.WOOD, 694),
                            new ResourceChunk(ResourceType.GLASS, 1215),
                            new ResourceChunk(ResourceType.MONEY, 277600)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.CONSTRUCTION, 8400),
                            new ResourceChunk(ResourceType.CONCRETE, 14917),
                            new ResourceChunk(ResourceType.BRICK, 12030),
                            new ResourceChunk(ResourceType.WOOD, 962),
                            new ResourceChunk(ResourceType.GLASS, 1684),
                            new ResourceChunk(ResourceType.MONEY, 384960)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.CONSTRUCTION, 11000),
                            new ResourceChunk(ResourceType.CONCRETE, 19995),
                            new ResourceChunk(ResourceType.BRICK, 16125),
                            new ResourceChunk(ResourceType.WOOD, 1290),
                            new ResourceChunk(ResourceType.GLASS, 2258),
                            new ResourceChunk(ResourceType.MONEY, 516000)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.CONSTRUCTION, 14000),
                            new ResourceChunk(ResourceType.CONCRETE, 26040),
                            new ResourceChunk(ResourceType.BRICK, 21000),
                            new ResourceChunk(ResourceType.WOOD, 1680),
                            new ResourceChunk(ResourceType.GLASS, 2940),
                            new ResourceChunk(ResourceType.MONEY, 672000)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.CONSTRUCTION, 17600),
                            new ResourceChunk(ResourceType.CONCRETE, 33629),
                            new ResourceChunk(ResourceType.BRICK, 27120),
                            new ResourceChunk(ResourceType.WOOD, 2170),
                            new ResourceChunk(ResourceType.GLASS, 3797),
                            new ResourceChunk(ResourceType.MONEY, 867840)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.CONSTRUCTION, 21800),
                            new ResourceChunk(ResourceType.CONCRETE, 42873),
                            new ResourceChunk(ResourceType.BRICK, 34575),
                            new ResourceChunk(ResourceType.WOOD, 2776),
                            new ResourceChunk(ResourceType.GLASS, 4841),
                            new ResourceChunk(ResourceType.MONEY, 1106400)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.CONSTRUCTION, 26600),
                            new ResourceChunk(ResourceType.CONCRETE, 53884),
                            new ResourceChunk(ResourceType.BRICK, 53455),
                            new ResourceChunk(ResourceType.WOOD, 476),
                            new ResourceChunk(ResourceType.GLASS, 6084),
                            new ResourceChunk(ResourceType.MONEY, 139560)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.CONSTRUCTION, 32000),
                            new ResourceChunk(ResourceType.CONCRETE, 66774),
                            new ResourceChunk(ResourceType.BRICK, 53850),
                            new ResourceChunk(ResourceType.WOOD, 4308),
                            new ResourceChunk(ResourceType.GLASS, 7539),
                            new ResourceChunk(ResourceType.MONEY, 1723200)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.CONSTRUCTION, 38000),
                            new ResourceChunk(ResourceType.CONCRETE, 81654),
                            new ResourceChunk(ResourceType.BRICK, 65850),
                            new ResourceChunk(ResourceType.WOOD, 5268),
                            new ResourceChunk(ResourceType.GLASS, 9219),
                            new ResourceChunk(ResourceType.MONEY, 2107200)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.CONSTRUCTION, 44800),
                            new ResourceChunk(ResourceType.CONCRETE, 99361),
                            new ResourceChunk(ResourceType.BRICK, 80130),
                            new ResourceChunk(ResourceType.WOOD, 6410),
                            new ResourceChunk(ResourceType.GLASS, 11218),
                            new ResourceChunk(ResourceType.MONEY, 2564160)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.CONSTRUCTION, 52400),
                            new ResourceChunk(ResourceType.CONCRETE, 120094),
                            new ResourceChunk(ResourceType.BRICK, 96850),
                            new ResourceChunk(ResourceType.WOOD, 7748),
                            new ResourceChunk(ResourceType.GLASS, 13359),
                            new ResourceChunk(ResourceType.MONEY, 3099200)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.CONSTRUCTION, 60800),
                            new ResourceChunk(ResourceType.CONCRETE, 144051),
                            new ResourceChunk(ResourceType.BRICK, 116170),
                            new ResourceChunk(ResourceType.WOOD, 9294),
                            new ResourceChunk(ResourceType.GLASS, 16264),
                            new ResourceChunk(ResourceType.MONEY, 3717440)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.CONSTRUCTION, 70000),
                            new ResourceChunk(ResourceType.CONCRETE, 171430),
                            new ResourceChunk(ResourceType.BRICK, 138250),
                            new ResourceChunk(ResourceType.WOOD, 11060),
                            new ResourceChunk(ResourceType.GLASS, 19355),
                            new ResourceChunk(ResourceType.MONEY, 4424000)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.CONSTRUCTION, 80000),
                            new ResourceChunk(ResourceType.CONCRETE, 202430),
                            new ResourceChunk(ResourceType.BRICK, 163250),
                            new ResourceChunk(ResourceType.WOOD, 13060),
                            new ResourceChunk(ResourceType.GLASS, 22855),
                            new ResourceChunk(ResourceType.MONEY, 5224000)
                    )
            },
            null, // jobPrice
            null, // jobReward
            null, // jobRewardMultiplier
            null, // production
            null, // productionMultiplier
            null, // supply
            null, // supplyMultiplier
            new ResourcePack[]{ // demand
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.UPKEEP, 100),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 4),
                            new ResourceChunk(ResourceType.JOB, 80),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.UPKEEP, 200),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 8),
                            new ResourceChunk(ResourceType.JOB, 160),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.UPKEEP, 300),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 12),
                            new ResourceChunk(ResourceType.JOB, 240),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.UPKEEP, 400),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 16),
                            new ResourceChunk(ResourceType.JOB, 320),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.UPKEEP, 500),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 20),
                            new ResourceChunk(ResourceType.JOB, 400),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.UPKEEP, 700),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 28),
                            new ResourceChunk(ResourceType.JOB, 560),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.UPKEEP, 900),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 36),
                            new ResourceChunk(ResourceType.JOB, 720),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.UPKEEP, 1100),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 44),
                            new ResourceChunk(ResourceType.JOB, 880),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.UPKEEP, 1300),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 52),
                            new ResourceChunk(ResourceType.JOB, 1040),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.UPKEEP, 1500),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 60),
                            new ResourceChunk(ResourceType.JOB, 1200),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.UPKEEP, 1800),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 72),
                            new ResourceChunk(ResourceType.JOB, 1440),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.UPKEEP, 2100),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 84),
                            new ResourceChunk(ResourceType.JOB, 1680),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.UPKEEP, 2400),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 96),
                            new ResourceChunk(ResourceType.JOB, 1920),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.UPKEEP, 2700),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 108),
                            new ResourceChunk(ResourceType.JOB, 2160),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.UPKEEP, 3000),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 120),
                            new ResourceChunk(ResourceType.JOB, 2400),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.UPKEEP, 3400),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 136),
                            new ResourceChunk(ResourceType.JOB, 2720),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.UPKEEP, 3800),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 152),
                            new ResourceChunk(ResourceType.JOB, 3040),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.UPKEEP, 4200),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 168),
                            new ResourceChunk(ResourceType.JOB, 3360),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.UPKEEP, 4600),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 184),
                            new ResourceChunk(ResourceType.JOB, 3600),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.UPKEEP, 5000),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 200),
                            new ResourceChunk(ResourceType.JOB, 4000),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    )
            },
            new ResourcePack[]{ // hold
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.POWER, 4),
                            new ResourceChunk(ResourceType.JOB, 80),
                            new ResourceChunk(ResourceType.WORKER, 80)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.POWER, 8),
                            new ResourceChunk(ResourceType.JOB, 160),
                            new ResourceChunk(ResourceType.WORKER, 160)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.POWER, 12),
                            new ResourceChunk(ResourceType.JOB, 240),
                            new ResourceChunk(ResourceType.WORKER, 240)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.POWER, 16),
                            new ResourceChunk(ResourceType.JOB, 320),
                            new ResourceChunk(ResourceType.WORKER, 320)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.POWER, 20),
                            new ResourceChunk(ResourceType.JOB, 400),
                            new ResourceChunk(ResourceType.WORKER, 400)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.POWER, 28),
                            new ResourceChunk(ResourceType.JOB, 560),
                            new ResourceChunk(ResourceType.WORKER, 560)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.POWER, 36),
                            new ResourceChunk(ResourceType.JOB, 720),
                            new ResourceChunk(ResourceType.WORKER, 720)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.POWER, 44),
                            new ResourceChunk(ResourceType.JOB, 880),
                            new ResourceChunk(ResourceType.WORKER, 880)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.POWER, 52),
                            new ResourceChunk(ResourceType.JOB, 1040),
                            new ResourceChunk(ResourceType.WORKER, 1040)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.POWER, 60),
                            new ResourceChunk(ResourceType.JOB, 1200),
                            new ResourceChunk(ResourceType.WORKER, 1200)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.POWER, 72),
                            new ResourceChunk(ResourceType.JOB, 1440),
                            new ResourceChunk(ResourceType.WORKER, 1440)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.POWER, 84),
                            new ResourceChunk(ResourceType.JOB, 1680),
                            new ResourceChunk(ResourceType.WORKER, 1680)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.POWER, 96),
                            new ResourceChunk(ResourceType.JOB, 1920),
                            new ResourceChunk(ResourceType.WORKER, 1920)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.POWER, 108),
                            new ResourceChunk(ResourceType.JOB, 2160),
                            new ResourceChunk(ResourceType.WORKER, 2160)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.POWER, 120),
                            new ResourceChunk(ResourceType.JOB, 2400),
                            new ResourceChunk(ResourceType.WORKER, 2400)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.POWER, 136),
                            new ResourceChunk(ResourceType.JOB, 2720),
                            new ResourceChunk(ResourceType.WORKER, 2720)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.POWER, 152),
                            new ResourceChunk(ResourceType.JOB, 3040),
                            new ResourceChunk(ResourceType.WORKER, 3040)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.POWER, 168),
                            new ResourceChunk(ResourceType.JOB, 3360),
                            new ResourceChunk(ResourceType.WORKER, 3360)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.POWER, 184),
                            new ResourceChunk(ResourceType.JOB, 3600),
                            new ResourceChunk(ResourceType.WORKER, 3600)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.POWER, 200),
                            new ResourceChunk(ResourceType.JOB, 4000),
                            new ResourceChunk(ResourceType.WORKER, 4000)
                    )
            },
            new ResourcePack[]{ // store
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.STEEL, 1200)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.STEEL, 2400)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.STEEL, 3600)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.STEEL, 4800)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.STEEL, 6000)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.STEEL, 8400)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.STEEL, 10800)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.STEEL, 13200)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.STEEL, 15600)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.STEEL, 18000)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.STEEL, 21600)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.STEEL, 25200)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.STEEL, 28800)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.STEEL, 32400)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.STEEL, 36000)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.STEEL, 40800)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.STEEL, 45600)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.STEEL, 50400)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.STEEL, 55200)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.STEEL, 60000)
                    )
            },
            null), // storeMultiplier
    WAREHOUSE_CONCRETE("warehouse_concrete",
            Strings.BLD_WAREHOUSE_CONCRETE,
            Images.BLD_WAREHOUSE_CONCRETE,
            1, // requiredPlayerLevel
            1, // maxLevel
            1000, // buildLimit
            132, // priceMultiplier
            new int[]{ // structure
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
            },
            new ResourcePack[]{  // buildCost
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.CONSTRUCTION, 200),
                            new ResourceChunk(ResourceType.STEEL, 102),
                            new ResourceChunk(ResourceType.BRICK, 255),
                            new ResourceChunk(ResourceType.WOOD, 20),
                            new ResourceChunk(ResourceType.GLASS, 36),
                            new ResourceChunk(ResourceType.MONEY, 8160)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.CONSTRUCTION, 600),
                            new ResourceChunk(ResourceType.STEEL, 310),
                            new ResourceChunk(ResourceType.BRICK, 775),
                            new ResourceChunk(ResourceType.WOOD, 62),
                            new ResourceChunk(ResourceType.GLASS, 109),
                            new ResourceChunk(ResourceType.MONEY, 24800)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.CONSTRUCTION, 1200),
                            new ResourceChunk(ResourceType.STEEL, 628),
                            new ResourceChunk(ResourceType.BRICK, 1570),
                            new ResourceChunk(ResourceType.WOOD, 126),
                            new ResourceChunk(ResourceType.GLASS, 220),
                            new ResourceChunk(ResourceType.MONEY, 50240)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.CONSTRUCTION, 2000),
                            new ResourceChunk(ResourceType.STEEL, 1060),
                            new ResourceChunk(ResourceType.BRICK, 2650),
                            new ResourceChunk(ResourceType.WOOD, 212),
                            new ResourceChunk(ResourceType.GLASS, 371),
                            new ResourceChunk(ResourceType.MONEY, 84800)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.CONSTRUCTION, 3000),
                            new ResourceChunk(ResourceType.STEEL, 1610),
                            new ResourceChunk(ResourceType.BRICK, 4025),
                            new ResourceChunk(ResourceType.WOOD, 322),
                            new ResourceChunk(ResourceType.GLASS, 564),
                            new ResourceChunk(ResourceType.MONEY, 128800)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.CONSTRUCTION, 4400),
                            new ResourceChunk(ResourceType.STEEL, 2408),
                            new ResourceChunk(ResourceType.BRICK, 6020),
                            new ResourceChunk(ResourceType.WOOD, 482),
                            new ResourceChunk(ResourceType.GLASS, 843),
                            new ResourceChunk(ResourceType.MONEY, 192640)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.CONSTRUCTION, 6200),
                            new ResourceChunk(ResourceType.STEEL, 3470),
                            new ResourceChunk(ResourceType.BRICK, 8675),
                            new ResourceChunk(ResourceType.WOOD, 694),
                            new ResourceChunk(ResourceType.GLASS, 1215),
                            new ResourceChunk(ResourceType.MONEY, 277600)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.CONSTRUCTION, 8400),
                            new ResourceChunk(ResourceType.STEEL, 4812),
                            new ResourceChunk(ResourceType.BRICK, 12030),
                            new ResourceChunk(ResourceType.WOOD, 962),
                            new ResourceChunk(ResourceType.GLASS, 1684),
                            new ResourceChunk(ResourceType.MONEY, 384960)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.CONSTRUCTION, 11000),
                            new ResourceChunk(ResourceType.STEEL, 6450),
                            new ResourceChunk(ResourceType.BRICK, 16125),
                            new ResourceChunk(ResourceType.WOOD, 1290),
                            new ResourceChunk(ResourceType.GLASS, 2258),
                            new ResourceChunk(ResourceType.MONEY, 516000)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.CONSTRUCTION, 14000),
                            new ResourceChunk(ResourceType.STEEL, 8400),
                            new ResourceChunk(ResourceType.BRICK, 21000),
                            new ResourceChunk(ResourceType.WOOD, 1680),
                            new ResourceChunk(ResourceType.GLASS, 2940),
                            new ResourceChunk(ResourceType.MONEY, 672000)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.CONSTRUCTION, 17600),
                            new ResourceChunk(ResourceType.STEEL, 10848),
                            new ResourceChunk(ResourceType.BRICK, 27120),
                            new ResourceChunk(ResourceType.WOOD, 2170),
                            new ResourceChunk(ResourceType.GLASS, 3797),
                            new ResourceChunk(ResourceType.MONEY, 867840)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.CONSTRUCTION, 21800),
                            new ResourceChunk(ResourceType.STEEL, 13830),
                            new ResourceChunk(ResourceType.BRICK, 34575),
                            new ResourceChunk(ResourceType.WOOD, 2776),
                            new ResourceChunk(ResourceType.GLASS, 4841),
                            new ResourceChunk(ResourceType.MONEY, 1106400)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.CONSTRUCTION, 26600),
                            new ResourceChunk(ResourceType.STEEL, 17382),
                            new ResourceChunk(ResourceType.BRICK, 53455),
                            new ResourceChunk(ResourceType.WOOD, 476),
                            new ResourceChunk(ResourceType.GLASS, 6084),
                            new ResourceChunk(ResourceType.MONEY, 139560)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.CONSTRUCTION, 32000),
                            new ResourceChunk(ResourceType.STEEL, 21540),
                            new ResourceChunk(ResourceType.BRICK, 53850),
                            new ResourceChunk(ResourceType.WOOD, 4308),
                            new ResourceChunk(ResourceType.GLASS, 7539),
                            new ResourceChunk(ResourceType.MONEY, 1723200)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.CONSTRUCTION, 38000),
                            new ResourceChunk(ResourceType.STEEL, 26340),
                            new ResourceChunk(ResourceType.BRICK, 65850),
                            new ResourceChunk(ResourceType.WOOD, 5268),
                            new ResourceChunk(ResourceType.GLASS, 9219),
                            new ResourceChunk(ResourceType.MONEY, 2107200)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.CONSTRUCTION, 44800),
                            new ResourceChunk(ResourceType.STEEL, 32052),
                            new ResourceChunk(ResourceType.BRICK, 80130),
                            new ResourceChunk(ResourceType.WOOD, 6410),
                            new ResourceChunk(ResourceType.GLASS, 11218),
                            new ResourceChunk(ResourceType.MONEY, 2564160)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.CONSTRUCTION, 52400),
                            new ResourceChunk(ResourceType.STEEL, 38740),
                            new ResourceChunk(ResourceType.BRICK, 96850),
                            new ResourceChunk(ResourceType.WOOD, 7748),
                            new ResourceChunk(ResourceType.GLASS, 13359),
                            new ResourceChunk(ResourceType.MONEY, 3099200)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.CONSTRUCTION, 60800),
                            new ResourceChunk(ResourceType.STEEL, 46468),
                            new ResourceChunk(ResourceType.BRICK, 116170),
                            new ResourceChunk(ResourceType.WOOD, 9294),
                            new ResourceChunk(ResourceType.GLASS, 16264),
                            new ResourceChunk(ResourceType.MONEY, 3717440)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.CONSTRUCTION, 70000),
                            new ResourceChunk(ResourceType.STEEL, 55300),
                            new ResourceChunk(ResourceType.BRICK, 138250),
                            new ResourceChunk(ResourceType.WOOD, 11060),
                            new ResourceChunk(ResourceType.GLASS, 19355),
                            new ResourceChunk(ResourceType.MONEY, 4424000)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.CONSTRUCTION, 80000),
                            new ResourceChunk(ResourceType.STEEL, 65300),
                            new ResourceChunk(ResourceType.BRICK, 163250),
                            new ResourceChunk(ResourceType.WOOD, 13060),
                            new ResourceChunk(ResourceType.GLASS, 22855),
                            new ResourceChunk(ResourceType.MONEY, 5224000)
                    )
            },
            null, // jobPrice
            null, // jobReward
            null, // jobRewardMultiplier
            null, // production
            null, // productionMultiplier
            null, // supply
            null, // supplyMultiplier
            new ResourcePack[]{ // demand
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.UPKEEP, 100),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 4),
                            new ResourceChunk(ResourceType.JOB, 80),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.UPKEEP, 200),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 8),
                            new ResourceChunk(ResourceType.JOB, 160),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.UPKEEP, 300),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 12),
                            new ResourceChunk(ResourceType.JOB, 240),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.UPKEEP, 400),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 16),
                            new ResourceChunk(ResourceType.JOB, 320),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.UPKEEP, 500),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 20),
                            new ResourceChunk(ResourceType.JOB, 400),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.UPKEEP, 700),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 28),
                            new ResourceChunk(ResourceType.JOB, 560),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.UPKEEP, 900),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 36),
                            new ResourceChunk(ResourceType.JOB, 720),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.UPKEEP, 1100),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 44),
                            new ResourceChunk(ResourceType.JOB, 880),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.UPKEEP, 1300),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 52),
                            new ResourceChunk(ResourceType.JOB, 1040),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.UPKEEP, 1500),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 60),
                            new ResourceChunk(ResourceType.JOB, 1200),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.UPKEEP, 1800),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 72),
                            new ResourceChunk(ResourceType.JOB, 1440),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.UPKEEP, 2100),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 84),
                            new ResourceChunk(ResourceType.JOB, 1680),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.UPKEEP, 2400),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 96),
                            new ResourceChunk(ResourceType.JOB, 1920),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.UPKEEP, 2700),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 108),
                            new ResourceChunk(ResourceType.JOB, 2160),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.UPKEEP, 3000),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 120),
                            new ResourceChunk(ResourceType.JOB, 2400),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.UPKEEP, 3400),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 136),
                            new ResourceChunk(ResourceType.JOB, 2720),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.UPKEEP, 3800),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 152),
                            new ResourceChunk(ResourceType.JOB, 3040),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.UPKEEP, 4200),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 168),
                            new ResourceChunk(ResourceType.JOB, 3360),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.UPKEEP, 4600),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 184),
                            new ResourceChunk(ResourceType.JOB, 3600),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.UPKEEP, 5000),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 200),
                            new ResourceChunk(ResourceType.JOB, 4000),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    )
            },
            new ResourcePack[]{ // hold
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.POWER, 4),
                            new ResourceChunk(ResourceType.JOB, 80),
                            new ResourceChunk(ResourceType.WORKER, 80)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.POWER, 8),
                            new ResourceChunk(ResourceType.JOB, 160),
                            new ResourceChunk(ResourceType.WORKER, 160)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.POWER, 12),
                            new ResourceChunk(ResourceType.JOB, 240),
                            new ResourceChunk(ResourceType.WORKER, 240)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.POWER, 16),
                            new ResourceChunk(ResourceType.JOB, 320),
                            new ResourceChunk(ResourceType.WORKER, 320)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.POWER, 20),
                            new ResourceChunk(ResourceType.JOB, 400),
                            new ResourceChunk(ResourceType.WORKER, 400)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.POWER, 28),
                            new ResourceChunk(ResourceType.JOB, 560),
                            new ResourceChunk(ResourceType.WORKER, 560)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.POWER, 36),
                            new ResourceChunk(ResourceType.JOB, 720),
                            new ResourceChunk(ResourceType.WORKER, 720)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.POWER, 44),
                            new ResourceChunk(ResourceType.JOB, 880),
                            new ResourceChunk(ResourceType.WORKER, 880)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.POWER, 52),
                            new ResourceChunk(ResourceType.JOB, 1040),
                            new ResourceChunk(ResourceType.WORKER, 1040)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.POWER, 60),
                            new ResourceChunk(ResourceType.JOB, 1200),
                            new ResourceChunk(ResourceType.WORKER, 1200)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.POWER, 72),
                            new ResourceChunk(ResourceType.JOB, 1440),
                            new ResourceChunk(ResourceType.WORKER, 1440)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.POWER, 84),
                            new ResourceChunk(ResourceType.JOB, 1680),
                            new ResourceChunk(ResourceType.WORKER, 1680)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.POWER, 96),
                            new ResourceChunk(ResourceType.JOB, 1920),
                            new ResourceChunk(ResourceType.WORKER, 1920)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.POWER, 108),
                            new ResourceChunk(ResourceType.JOB, 2160),
                            new ResourceChunk(ResourceType.WORKER, 2160)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.POWER, 120),
                            new ResourceChunk(ResourceType.JOB, 2400),
                            new ResourceChunk(ResourceType.WORKER, 2400)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.POWER, 136),
                            new ResourceChunk(ResourceType.JOB, 2720),
                            new ResourceChunk(ResourceType.WORKER, 2720)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.POWER, 152),
                            new ResourceChunk(ResourceType.JOB, 3040),
                            new ResourceChunk(ResourceType.WORKER, 3040)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.POWER, 168),
                            new ResourceChunk(ResourceType.JOB, 3360),
                            new ResourceChunk(ResourceType.WORKER, 3360)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.POWER, 184),
                            new ResourceChunk(ResourceType.JOB, 3600),
                            new ResourceChunk(ResourceType.WORKER, 3600)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.POWER, 200),
                            new ResourceChunk(ResourceType.JOB, 4000),
                            new ResourceChunk(ResourceType.WORKER, 4000)
                    )
            },
            new ResourcePack[]{ // store
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.CONCRETE, 4000)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.CONCRETE, 8000)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.CONCRETE, 12000)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.CONCRETE, 16000)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.CONCRETE, 20000)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.CONCRETE, 28000)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.CONCRETE, 36000)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.CONCRETE, 44000)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.CONCRETE, 52000)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.CONCRETE, 60000)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.CONCRETE, 72000)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.CONCRETE, 84000)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.CONCRETE, 96000)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.CONCRETE, 108000)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.CONCRETE, 120000)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.CONCRETE, 136000)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.CONCRETE, 152000)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.CONCRETE, 168000)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.CONCRETE, 184000)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.CONCRETE, 200000)
                    )
            },
            null), // storeMultiplier
    WAREHOUSE_BRICK("warehouse_brick",
            Strings.BLD_WAREHOUSE_BRICK,
            Images.BLD_WAREHOUSE_BRICK,
            1, // requiredPlayerLevel
            1, // maxLevel
            1000, // buildLimit
            132, // priceMultiplier
            new int[]{ // structure
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
            },
            new ResourcePack[]{  // buildCost
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.CONSTRUCTION, 200),
                            new ResourceChunk(ResourceType.STEEL, 102),
                            new ResourceChunk(ResourceType.CONCRETE, 316),
                            new ResourceChunk(ResourceType.WOOD, 20),
                            new ResourceChunk(ResourceType.GLASS, 36),
                            new ResourceChunk(ResourceType.MONEY, 8160)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.CONSTRUCTION, 600),
                            new ResourceChunk(ResourceType.STEEL, 310),
                            new ResourceChunk(ResourceType.CONCRETE, 961),
                            new ResourceChunk(ResourceType.WOOD, 62),
                            new ResourceChunk(ResourceType.GLASS, 109),
                            new ResourceChunk(ResourceType.MONEY, 24800)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.CONSTRUCTION, 1200),
                            new ResourceChunk(ResourceType.STEEL, 628),
                            new ResourceChunk(ResourceType.CONCRETE, 1947),
                            new ResourceChunk(ResourceType.WOOD, 126),
                            new ResourceChunk(ResourceType.GLASS, 220),
                            new ResourceChunk(ResourceType.MONEY, 50240)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.CONSTRUCTION, 2000),
                            new ResourceChunk(ResourceType.STEEL, 1060),
                            new ResourceChunk(ResourceType.CONCRETE, 3286),
                            new ResourceChunk(ResourceType.WOOD, 212),
                            new ResourceChunk(ResourceType.GLASS, 371),
                            new ResourceChunk(ResourceType.MONEY, 84800)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.CONSTRUCTION, 3000),
                            new ResourceChunk(ResourceType.STEEL, 1610),
                            new ResourceChunk(ResourceType.CONCRETE, 4991),
                            new ResourceChunk(ResourceType.WOOD, 322),
                            new ResourceChunk(ResourceType.GLASS, 564),
                            new ResourceChunk(ResourceType.MONEY, 128800)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.CONSTRUCTION, 4400),
                            new ResourceChunk(ResourceType.STEEL, 2408),
                            new ResourceChunk(ResourceType.CONCRETE, 7465),
                            new ResourceChunk(ResourceType.WOOD, 482),
                            new ResourceChunk(ResourceType.GLASS, 843),
                            new ResourceChunk(ResourceType.MONEY, 192640)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.CONSTRUCTION, 6200),
                            new ResourceChunk(ResourceType.STEEL, 3470),
                            new ResourceChunk(ResourceType.CONCRETE, 10757),
                            new ResourceChunk(ResourceType.WOOD, 694),
                            new ResourceChunk(ResourceType.GLASS, 1215),
                            new ResourceChunk(ResourceType.MONEY, 277600)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.CONSTRUCTION, 8400),
                            new ResourceChunk(ResourceType.STEEL, 4812),
                            new ResourceChunk(ResourceType.CONCRETE, 14917),
                            new ResourceChunk(ResourceType.WOOD, 962),
                            new ResourceChunk(ResourceType.GLASS, 1684),
                            new ResourceChunk(ResourceType.MONEY, 384960)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.CONSTRUCTION, 11000),
                            new ResourceChunk(ResourceType.STEEL, 6450),
                            new ResourceChunk(ResourceType.CONCRETE, 19995),
                            new ResourceChunk(ResourceType.WOOD, 1290),
                            new ResourceChunk(ResourceType.GLASS, 2258),
                            new ResourceChunk(ResourceType.MONEY, 516000)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.CONSTRUCTION, 14000),
                            new ResourceChunk(ResourceType.STEEL, 8400),
                            new ResourceChunk(ResourceType.CONCRETE, 26040),
                            new ResourceChunk(ResourceType.WOOD, 1680),
                            new ResourceChunk(ResourceType.GLASS, 2940),
                            new ResourceChunk(ResourceType.MONEY, 672000)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.CONSTRUCTION, 17600),
                            new ResourceChunk(ResourceType.STEEL, 10848),
                            new ResourceChunk(ResourceType.CONCRETE, 33629),
                            new ResourceChunk(ResourceType.WOOD, 2170),
                            new ResourceChunk(ResourceType.GLASS, 3797),
                            new ResourceChunk(ResourceType.MONEY, 867840)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.CONSTRUCTION, 21800),
                            new ResourceChunk(ResourceType.STEEL, 13830),
                            new ResourceChunk(ResourceType.CONCRETE, 42873),
                            new ResourceChunk(ResourceType.WOOD, 2776),
                            new ResourceChunk(ResourceType.GLASS, 4841),
                            new ResourceChunk(ResourceType.MONEY, 1106400)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.CONSTRUCTION, 26600),
                            new ResourceChunk(ResourceType.STEEL, 17382),
                            new ResourceChunk(ResourceType.CONCRETE, 53884),
                            new ResourceChunk(ResourceType.WOOD, 476),
                            new ResourceChunk(ResourceType.GLASS, 6084),
                            new ResourceChunk(ResourceType.MONEY, 139560)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.CONSTRUCTION, 32000),
                            new ResourceChunk(ResourceType.STEEL, 21540),
                            new ResourceChunk(ResourceType.CONCRETE, 66774),
                            new ResourceChunk(ResourceType.WOOD, 4308),
                            new ResourceChunk(ResourceType.GLASS, 7539),
                            new ResourceChunk(ResourceType.MONEY, 1723200)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.CONSTRUCTION, 38000),
                            new ResourceChunk(ResourceType.STEEL, 26340),
                            new ResourceChunk(ResourceType.CONCRETE, 81654),
                            new ResourceChunk(ResourceType.WOOD, 5268),
                            new ResourceChunk(ResourceType.GLASS, 9219),
                            new ResourceChunk(ResourceType.MONEY, 2107200)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.CONSTRUCTION, 44800),
                            new ResourceChunk(ResourceType.STEEL, 32052),
                            new ResourceChunk(ResourceType.CONCRETE, 99361),
                            new ResourceChunk(ResourceType.WOOD, 6410),
                            new ResourceChunk(ResourceType.GLASS, 11218),
                            new ResourceChunk(ResourceType.MONEY, 2564160)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.CONSTRUCTION, 52400),
                            new ResourceChunk(ResourceType.STEEL, 38740),
                            new ResourceChunk(ResourceType.CONCRETE, 120094),
                            new ResourceChunk(ResourceType.WOOD, 7748),
                            new ResourceChunk(ResourceType.GLASS, 13359),
                            new ResourceChunk(ResourceType.MONEY, 3099200)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.CONSTRUCTION, 60800),
                            new ResourceChunk(ResourceType.STEEL, 46468),
                            new ResourceChunk(ResourceType.CONCRETE, 144051),
                            new ResourceChunk(ResourceType.WOOD, 9294),
                            new ResourceChunk(ResourceType.GLASS, 16264),
                            new ResourceChunk(ResourceType.MONEY, 3717440)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.CONSTRUCTION, 70000),
                            new ResourceChunk(ResourceType.STEEL, 55300),
                            new ResourceChunk(ResourceType.CONCRETE, 171430),
                            new ResourceChunk(ResourceType.WOOD, 11060),
                            new ResourceChunk(ResourceType.GLASS, 19355),
                            new ResourceChunk(ResourceType.MONEY, 4424000)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.CONSTRUCTION, 80000),
                            new ResourceChunk(ResourceType.STEEL, 65300),
                            new ResourceChunk(ResourceType.CONCRETE, 202430),
                            new ResourceChunk(ResourceType.WOOD, 13060),
                            new ResourceChunk(ResourceType.GLASS, 22855),
                            new ResourceChunk(ResourceType.MONEY, 5224000)
                    )
            },
            null, // jobPrice
            null, // jobReward
            null, // jobRewardMultiplier
            null, // production
            null, // productionMultiplier
            null, // supply
            null, // supplyMultiplier
            new ResourcePack[]{ // demand
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.UPKEEP, 100),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 4),
                            new ResourceChunk(ResourceType.JOB, 80),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.UPKEEP, 200),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 8),
                            new ResourceChunk(ResourceType.JOB, 160),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.UPKEEP, 300),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 12),
                            new ResourceChunk(ResourceType.JOB, 240),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.UPKEEP, 400),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 16),
                            new ResourceChunk(ResourceType.JOB, 320),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.UPKEEP, 500),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 20),
                            new ResourceChunk(ResourceType.JOB, 400),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.UPKEEP, 700),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 28),
                            new ResourceChunk(ResourceType.JOB, 560),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.UPKEEP, 900),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 36),
                            new ResourceChunk(ResourceType.JOB, 720),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.UPKEEP, 1100),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 44),
                            new ResourceChunk(ResourceType.JOB, 880),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.UPKEEP, 1300),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 52),
                            new ResourceChunk(ResourceType.JOB, 1040),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.UPKEEP, 1500),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 60),
                            new ResourceChunk(ResourceType.JOB, 1200),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.UPKEEP, 1800),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 72),
                            new ResourceChunk(ResourceType.JOB, 1440),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.UPKEEP, 2100),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 84),
                            new ResourceChunk(ResourceType.JOB, 1680),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.UPKEEP, 2400),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 96),
                            new ResourceChunk(ResourceType.JOB, 1920),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.UPKEEP, 2700),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 108),
                            new ResourceChunk(ResourceType.JOB, 2160),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.UPKEEP, 3000),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 120),
                            new ResourceChunk(ResourceType.JOB, 2400),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.UPKEEP, 3400),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 136),
                            new ResourceChunk(ResourceType.JOB, 2720),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.UPKEEP, 3800),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 152),
                            new ResourceChunk(ResourceType.JOB, 3040),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.UPKEEP, 4200),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 168),
                            new ResourceChunk(ResourceType.JOB, 3360),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.UPKEEP, 4600),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 184),
                            new ResourceChunk(ResourceType.JOB, 3600),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.UPKEEP, 5000),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 200),
                            new ResourceChunk(ResourceType.JOB, 4000),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    )
            },
            new ResourcePack[]{ // hold
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.POWER, 4),
                            new ResourceChunk(ResourceType.JOB, 80),
                            new ResourceChunk(ResourceType.WORKER, 80)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.POWER, 8),
                            new ResourceChunk(ResourceType.JOB, 160),
                            new ResourceChunk(ResourceType.WORKER, 160)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.POWER, 12),
                            new ResourceChunk(ResourceType.JOB, 240),
                            new ResourceChunk(ResourceType.WORKER, 240)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.POWER, 16),
                            new ResourceChunk(ResourceType.JOB, 320),
                            new ResourceChunk(ResourceType.WORKER, 320)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.POWER, 20),
                            new ResourceChunk(ResourceType.JOB, 400),
                            new ResourceChunk(ResourceType.WORKER, 400)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.POWER, 28),
                            new ResourceChunk(ResourceType.JOB, 560),
                            new ResourceChunk(ResourceType.WORKER, 560)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.POWER, 36),
                            new ResourceChunk(ResourceType.JOB, 720),
                            new ResourceChunk(ResourceType.WORKER, 720)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.POWER, 44),
                            new ResourceChunk(ResourceType.JOB, 880),
                            new ResourceChunk(ResourceType.WORKER, 880)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.POWER, 52),
                            new ResourceChunk(ResourceType.JOB, 1040),
                            new ResourceChunk(ResourceType.WORKER, 1040)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.POWER, 60),
                            new ResourceChunk(ResourceType.JOB, 1200),
                            new ResourceChunk(ResourceType.WORKER, 1200)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.POWER, 72),
                            new ResourceChunk(ResourceType.JOB, 1440),
                            new ResourceChunk(ResourceType.WORKER, 1440)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.POWER, 84),
                            new ResourceChunk(ResourceType.JOB, 1680),
                            new ResourceChunk(ResourceType.WORKER, 1680)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.POWER, 96),
                            new ResourceChunk(ResourceType.JOB, 1920),
                            new ResourceChunk(ResourceType.WORKER, 1920)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.POWER, 108),
                            new ResourceChunk(ResourceType.JOB, 2160),
                            new ResourceChunk(ResourceType.WORKER, 2160)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.POWER, 120),
                            new ResourceChunk(ResourceType.JOB, 2400),
                            new ResourceChunk(ResourceType.WORKER, 2400)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.POWER, 136),
                            new ResourceChunk(ResourceType.JOB, 2720),
                            new ResourceChunk(ResourceType.WORKER, 2720)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.POWER, 152),
                            new ResourceChunk(ResourceType.JOB, 3040),
                            new ResourceChunk(ResourceType.WORKER, 3040)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.POWER, 168),
                            new ResourceChunk(ResourceType.JOB, 3360),
                            new ResourceChunk(ResourceType.WORKER, 3360)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.POWER, 184),
                            new ResourceChunk(ResourceType.JOB, 3600),
                            new ResourceChunk(ResourceType.WORKER, 3600)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.POWER, 200),
                            new ResourceChunk(ResourceType.JOB, 4000),
                            new ResourceChunk(ResourceType.WORKER, 4000)
                    )
            },
            new ResourcePack[]{ // store
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.BRICK, 3000)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.BRICK, 6000)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.BRICK, 9000)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.BRICK, 12000)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.BRICK, 15000)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.BRICK, 21000)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.BRICK, 27000)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.BRICK, 33000)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.BRICK, 39000)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.BRICK, 45000)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.BRICK, 54000)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.BRICK, 63000)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.BRICK, 72000)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.BRICK, 81000)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.BRICK, 90000)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.BRICK, 102000)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.BRICK, 114000)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.BRICK, 126000)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.BRICK, 138000)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.BRICK, 150000)
                    )
            },
            null), // storeMultiplier
    WAREHOUSE_WOOD("warehouse_wood",
            Strings.BLD_WAREHOUSE_WOOD,
            Images.BLD_WAREHOUSE_WOOD,
            1, // requiredPlayerLevel
            1, // maxLevel
            1000, // buildLimit
            132, // priceMultiplier
            new int[]{ // structure
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
            },
            new ResourcePack[]{  // buildCost
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.CONSTRUCTION, 200),
                            new ResourceChunk(ResourceType.STEEL, 102),
                            new ResourceChunk(ResourceType.CONCRETE, 316),
                            new ResourceChunk(ResourceType.BRICK, 255),
                            new ResourceChunk(ResourceType.GLASS, 36),
                            new ResourceChunk(ResourceType.MONEY, 8160)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.CONSTRUCTION, 600),
                            new ResourceChunk(ResourceType.STEEL, 310),
                            new ResourceChunk(ResourceType.CONCRETE, 961),
                            new ResourceChunk(ResourceType.BRICK, 775),
                            new ResourceChunk(ResourceType.GLASS, 109),
                            new ResourceChunk(ResourceType.MONEY, 24800)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.CONSTRUCTION, 1200),
                            new ResourceChunk(ResourceType.STEEL, 628),
                            new ResourceChunk(ResourceType.CONCRETE, 1947),
                            new ResourceChunk(ResourceType.BRICK, 1570),
                            new ResourceChunk(ResourceType.GLASS, 220),
                            new ResourceChunk(ResourceType.MONEY, 50240)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.CONSTRUCTION, 2000),
                            new ResourceChunk(ResourceType.STEEL, 1060),
                            new ResourceChunk(ResourceType.CONCRETE, 3286),
                            new ResourceChunk(ResourceType.BRICK, 2650),
                            new ResourceChunk(ResourceType.GLASS, 371),
                            new ResourceChunk(ResourceType.MONEY, 84800)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.CONSTRUCTION, 3000),
                            new ResourceChunk(ResourceType.STEEL, 1610),
                            new ResourceChunk(ResourceType.CONCRETE, 4991),
                            new ResourceChunk(ResourceType.BRICK, 4025),
                            new ResourceChunk(ResourceType.GLASS, 564),
                            new ResourceChunk(ResourceType.MONEY, 128800)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.CONSTRUCTION, 4400),
                            new ResourceChunk(ResourceType.STEEL, 2408),
                            new ResourceChunk(ResourceType.CONCRETE, 7465),
                            new ResourceChunk(ResourceType.BRICK, 6020),
                            new ResourceChunk(ResourceType.GLASS, 843),
                            new ResourceChunk(ResourceType.MONEY, 192640)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.CONSTRUCTION, 6200),
                            new ResourceChunk(ResourceType.STEEL, 3470),
                            new ResourceChunk(ResourceType.CONCRETE, 10757),
                            new ResourceChunk(ResourceType.BRICK, 8675),
                            new ResourceChunk(ResourceType.GLASS, 1215),
                            new ResourceChunk(ResourceType.MONEY, 277600)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.CONSTRUCTION, 8400),
                            new ResourceChunk(ResourceType.STEEL, 4812),
                            new ResourceChunk(ResourceType.CONCRETE, 14917),
                            new ResourceChunk(ResourceType.BRICK, 12030),
                            new ResourceChunk(ResourceType.GLASS, 1684),
                            new ResourceChunk(ResourceType.MONEY, 384960)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.CONSTRUCTION, 11000),
                            new ResourceChunk(ResourceType.STEEL, 6450),
                            new ResourceChunk(ResourceType.CONCRETE, 19995),
                            new ResourceChunk(ResourceType.BRICK, 16125),
                            new ResourceChunk(ResourceType.GLASS, 2258),
                            new ResourceChunk(ResourceType.MONEY, 516000)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.CONSTRUCTION, 14000),
                            new ResourceChunk(ResourceType.STEEL, 8400),
                            new ResourceChunk(ResourceType.CONCRETE, 26040),
                            new ResourceChunk(ResourceType.BRICK, 21000),
                            new ResourceChunk(ResourceType.GLASS, 2940),
                            new ResourceChunk(ResourceType.MONEY, 672000)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.CONSTRUCTION, 17600),
                            new ResourceChunk(ResourceType.STEEL, 10848),
                            new ResourceChunk(ResourceType.CONCRETE, 33629),
                            new ResourceChunk(ResourceType.BRICK, 27120),
                            new ResourceChunk(ResourceType.GLASS, 3797),
                            new ResourceChunk(ResourceType.MONEY, 867840)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.CONSTRUCTION, 21800),
                            new ResourceChunk(ResourceType.STEEL, 13830),
                            new ResourceChunk(ResourceType.CONCRETE, 42873),
                            new ResourceChunk(ResourceType.BRICK, 34575),
                            new ResourceChunk(ResourceType.GLASS, 4841),
                            new ResourceChunk(ResourceType.MONEY, 1106400)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.CONSTRUCTION, 26600),
                            new ResourceChunk(ResourceType.STEEL, 17382),
                            new ResourceChunk(ResourceType.CONCRETE, 53884),
                            new ResourceChunk(ResourceType.BRICK, 53455),
                            new ResourceChunk(ResourceType.GLASS, 6084),
                            new ResourceChunk(ResourceType.MONEY, 139560)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.CONSTRUCTION, 32000),
                            new ResourceChunk(ResourceType.STEEL, 21540),
                            new ResourceChunk(ResourceType.CONCRETE, 66774),
                            new ResourceChunk(ResourceType.BRICK, 53850),
                            new ResourceChunk(ResourceType.GLASS, 7539),
                            new ResourceChunk(ResourceType.MONEY, 1723200)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.CONSTRUCTION, 38000),
                            new ResourceChunk(ResourceType.STEEL, 26340),
                            new ResourceChunk(ResourceType.CONCRETE, 81654),
                            new ResourceChunk(ResourceType.BRICK, 65850),
                            new ResourceChunk(ResourceType.GLASS, 9219),
                            new ResourceChunk(ResourceType.MONEY, 2107200)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.CONSTRUCTION, 44800),
                            new ResourceChunk(ResourceType.STEEL, 32052),
                            new ResourceChunk(ResourceType.CONCRETE, 99361),
                            new ResourceChunk(ResourceType.BRICK, 80130),
                            new ResourceChunk(ResourceType.GLASS, 11218),
                            new ResourceChunk(ResourceType.MONEY, 2564160)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.CONSTRUCTION, 52400),
                            new ResourceChunk(ResourceType.STEEL, 38740),
                            new ResourceChunk(ResourceType.CONCRETE, 120094),
                            new ResourceChunk(ResourceType.BRICK, 96850),
                            new ResourceChunk(ResourceType.GLASS, 13359),
                            new ResourceChunk(ResourceType.MONEY, 3099200)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.CONSTRUCTION, 60800),
                            new ResourceChunk(ResourceType.STEEL, 46468),
                            new ResourceChunk(ResourceType.CONCRETE, 144051),
                            new ResourceChunk(ResourceType.BRICK, 116170),
                            new ResourceChunk(ResourceType.GLASS, 16264),
                            new ResourceChunk(ResourceType.MONEY, 3717440)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.CONSTRUCTION, 70000),
                            new ResourceChunk(ResourceType.STEEL, 55300),
                            new ResourceChunk(ResourceType.CONCRETE, 171430),
                            new ResourceChunk(ResourceType.BRICK, 138250),
                            new ResourceChunk(ResourceType.GLASS, 19355),
                            new ResourceChunk(ResourceType.MONEY, 4424000)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.CONSTRUCTION, 80000),
                            new ResourceChunk(ResourceType.STEEL, 65300),
                            new ResourceChunk(ResourceType.CONCRETE, 202430),
                            new ResourceChunk(ResourceType.BRICK, 163250),
                            new ResourceChunk(ResourceType.GLASS, 22855),
                            new ResourceChunk(ResourceType.MONEY, 5224000)
                    )
            },
            null, // jobPrice
            null, // jobReward
            null, // jobRewardMultiplier
            null, // production
            null, // productionMultiplier
            null, // supply
            null, // supplyMultiplier
            new ResourcePack[]{ // demand
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.UPKEEP, 100),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 4),
                            new ResourceChunk(ResourceType.JOB, 80),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.UPKEEP, 200),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 8),
                            new ResourceChunk(ResourceType.JOB, 160),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.UPKEEP, 300),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 12),
                            new ResourceChunk(ResourceType.JOB, 240),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.UPKEEP, 400),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 16),
                            new ResourceChunk(ResourceType.JOB, 320),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.UPKEEP, 500),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 20),
                            new ResourceChunk(ResourceType.JOB, 400),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.UPKEEP, 700),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 28),
                            new ResourceChunk(ResourceType.JOB, 560),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.UPKEEP, 900),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 36),
                            new ResourceChunk(ResourceType.JOB, 720),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.UPKEEP, 1100),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 44),
                            new ResourceChunk(ResourceType.JOB, 880),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.UPKEEP, 1300),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 52),
                            new ResourceChunk(ResourceType.JOB, 1040),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.UPKEEP, 1500),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 60),
                            new ResourceChunk(ResourceType.JOB, 1200),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.UPKEEP, 1800),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 72),
                            new ResourceChunk(ResourceType.JOB, 1440),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.UPKEEP, 2100),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 84),
                            new ResourceChunk(ResourceType.JOB, 1680),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.UPKEEP, 2400),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 96),
                            new ResourceChunk(ResourceType.JOB, 1920),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.UPKEEP, 2700),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 108),
                            new ResourceChunk(ResourceType.JOB, 2160),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.UPKEEP, 3000),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 120),
                            new ResourceChunk(ResourceType.JOB, 2400),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.UPKEEP, 3400),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 136),
                            new ResourceChunk(ResourceType.JOB, 2720),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.UPKEEP, 3800),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 152),
                            new ResourceChunk(ResourceType.JOB, 3040),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.UPKEEP, 4200),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 168),
                            new ResourceChunk(ResourceType.JOB, 3360),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.UPKEEP, 4600),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 184),
                            new ResourceChunk(ResourceType.JOB, 3600),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.UPKEEP, 5000),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 200),
                            new ResourceChunk(ResourceType.JOB, 4000),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    )
            },
            new ResourcePack[]{ // hold
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.POWER, 4),
                            new ResourceChunk(ResourceType.JOB, 80),
                            new ResourceChunk(ResourceType.WORKER, 80)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.POWER, 8),
                            new ResourceChunk(ResourceType.JOB, 160),
                            new ResourceChunk(ResourceType.WORKER, 160)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.POWER, 12),
                            new ResourceChunk(ResourceType.JOB, 240),
                            new ResourceChunk(ResourceType.WORKER, 240)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.POWER, 16),
                            new ResourceChunk(ResourceType.JOB, 320),
                            new ResourceChunk(ResourceType.WORKER, 320)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.POWER, 20),
                            new ResourceChunk(ResourceType.JOB, 400),
                            new ResourceChunk(ResourceType.WORKER, 400)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.POWER, 28),
                            new ResourceChunk(ResourceType.JOB, 560),
                            new ResourceChunk(ResourceType.WORKER, 560)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.POWER, 36),
                            new ResourceChunk(ResourceType.JOB, 720),
                            new ResourceChunk(ResourceType.WORKER, 720)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.POWER, 44),
                            new ResourceChunk(ResourceType.JOB, 880),
                            new ResourceChunk(ResourceType.WORKER, 880)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.POWER, 52),
                            new ResourceChunk(ResourceType.JOB, 1040),
                            new ResourceChunk(ResourceType.WORKER, 1040)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.POWER, 60),
                            new ResourceChunk(ResourceType.JOB, 1200),
                            new ResourceChunk(ResourceType.WORKER, 1200)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.POWER, 72),
                            new ResourceChunk(ResourceType.JOB, 1440),
                            new ResourceChunk(ResourceType.WORKER, 1440)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.POWER, 84),
                            new ResourceChunk(ResourceType.JOB, 1680),
                            new ResourceChunk(ResourceType.WORKER, 1680)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.POWER, 96),
                            new ResourceChunk(ResourceType.JOB, 1920),
                            new ResourceChunk(ResourceType.WORKER, 1920)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.POWER, 108),
                            new ResourceChunk(ResourceType.JOB, 2160),
                            new ResourceChunk(ResourceType.WORKER, 2160)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.POWER, 120),
                            new ResourceChunk(ResourceType.JOB, 2400),
                            new ResourceChunk(ResourceType.WORKER, 2400)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.POWER, 136),
                            new ResourceChunk(ResourceType.JOB, 2720),
                            new ResourceChunk(ResourceType.WORKER, 2720)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.POWER, 152),
                            new ResourceChunk(ResourceType.JOB, 3040),
                            new ResourceChunk(ResourceType.WORKER, 3040)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.POWER, 168),
                            new ResourceChunk(ResourceType.JOB, 3360),
                            new ResourceChunk(ResourceType.WORKER, 3360)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.POWER, 184),
                            new ResourceChunk(ResourceType.JOB, 3600),
                            new ResourceChunk(ResourceType.WORKER, 3600)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.POWER, 200),
                            new ResourceChunk(ResourceType.JOB, 4000),
                            new ResourceChunk(ResourceType.WORKER, 4000)
                    )
            },
            new ResourcePack[]{ // store
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.WOOD, 1000)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.WOOD, 2000)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.WOOD, 3000)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.WOOD, 4000)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.WOOD, 5000)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.WOOD, 7000)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.WOOD, 9000)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.WOOD, 11000)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.WOOD, 13000)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.WOOD, 15000)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.WOOD, 18000)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.WOOD, 21000)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.WOOD, 24000)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.WOOD, 27000)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.WOOD, 30000)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.WOOD, 34000)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.WOOD, 38000)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.WOOD, 42000)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.WOOD, 46000)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.WOOD, 50000)
                    )
            },
            null), // storeMultiplier
    WAREHOUSE_GLASS("warehouse_glass",
            Strings.BLD_WAREHOUSE_GLASS,
            Images.BLD_WAREHOUSE_GLASS,
            1, // requiredPlayerLevel
            1, // maxLevel
            1000, // buildLimit
            132, // priceMultiplier
            new int[]{ // structure
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
            },
            new ResourcePack[]{  // buildCost
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.CONSTRUCTION, 200),
                            new ResourceChunk(ResourceType.STEEL, 102),
                            new ResourceChunk(ResourceType.CONCRETE, 316),
                            new ResourceChunk(ResourceType.BRICK, 255),
                            new ResourceChunk(ResourceType.WOOD, 20),
                            new ResourceChunk(ResourceType.MONEY, 8160)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.CONSTRUCTION, 600),
                            new ResourceChunk(ResourceType.STEEL, 310),
                            new ResourceChunk(ResourceType.CONCRETE, 961),
                            new ResourceChunk(ResourceType.BRICK, 775),
                            new ResourceChunk(ResourceType.WOOD, 62),
                            new ResourceChunk(ResourceType.MONEY, 24800)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.CONSTRUCTION, 1200),
                            new ResourceChunk(ResourceType.STEEL, 628),
                            new ResourceChunk(ResourceType.CONCRETE, 1947),
                            new ResourceChunk(ResourceType.BRICK, 1570),
                            new ResourceChunk(ResourceType.WOOD, 126),
                            new ResourceChunk(ResourceType.MONEY, 50240)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.CONSTRUCTION, 2000),
                            new ResourceChunk(ResourceType.STEEL, 1060),
                            new ResourceChunk(ResourceType.CONCRETE, 3286),
                            new ResourceChunk(ResourceType.BRICK, 2650),
                            new ResourceChunk(ResourceType.WOOD, 212),
                            new ResourceChunk(ResourceType.MONEY, 84800)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.CONSTRUCTION, 3000),
                            new ResourceChunk(ResourceType.STEEL, 1610),
                            new ResourceChunk(ResourceType.CONCRETE, 4991),
                            new ResourceChunk(ResourceType.BRICK, 4025),
                            new ResourceChunk(ResourceType.WOOD, 322),
                            new ResourceChunk(ResourceType.MONEY, 128800)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.CONSTRUCTION, 4400),
                            new ResourceChunk(ResourceType.STEEL, 2408),
                            new ResourceChunk(ResourceType.CONCRETE, 7465),
                            new ResourceChunk(ResourceType.BRICK, 6020),
                            new ResourceChunk(ResourceType.WOOD, 482),
                            new ResourceChunk(ResourceType.MONEY, 192640)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.CONSTRUCTION, 6200),
                            new ResourceChunk(ResourceType.STEEL, 3470),
                            new ResourceChunk(ResourceType.CONCRETE, 10757),
                            new ResourceChunk(ResourceType.BRICK, 8675),
                            new ResourceChunk(ResourceType.WOOD, 694),
                            new ResourceChunk(ResourceType.MONEY, 277600)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.CONSTRUCTION, 8400),
                            new ResourceChunk(ResourceType.STEEL, 4812),
                            new ResourceChunk(ResourceType.CONCRETE, 14917),
                            new ResourceChunk(ResourceType.BRICK, 12030),
                            new ResourceChunk(ResourceType.WOOD, 962),
                            new ResourceChunk(ResourceType.MONEY, 384960)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.CONSTRUCTION, 11000),
                            new ResourceChunk(ResourceType.STEEL, 6450),
                            new ResourceChunk(ResourceType.CONCRETE, 19995),
                            new ResourceChunk(ResourceType.BRICK, 16125),
                            new ResourceChunk(ResourceType.WOOD, 1290),
                            new ResourceChunk(ResourceType.MONEY, 516000)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.CONSTRUCTION, 14000),
                            new ResourceChunk(ResourceType.STEEL, 8400),
                            new ResourceChunk(ResourceType.CONCRETE, 26040),
                            new ResourceChunk(ResourceType.BRICK, 21000),
                            new ResourceChunk(ResourceType.WOOD, 1680),
                            new ResourceChunk(ResourceType.MONEY, 672000)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.CONSTRUCTION, 17600),
                            new ResourceChunk(ResourceType.STEEL, 10848),
                            new ResourceChunk(ResourceType.CONCRETE, 33629),
                            new ResourceChunk(ResourceType.BRICK, 27120),
                            new ResourceChunk(ResourceType.WOOD, 2170),
                            new ResourceChunk(ResourceType.MONEY, 867840)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.CONSTRUCTION, 21800),
                            new ResourceChunk(ResourceType.STEEL, 13830),
                            new ResourceChunk(ResourceType.CONCRETE, 42873),
                            new ResourceChunk(ResourceType.BRICK, 34575),
                            new ResourceChunk(ResourceType.WOOD, 2776),
                            new ResourceChunk(ResourceType.MONEY, 1106400)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.CONSTRUCTION, 26600),
                            new ResourceChunk(ResourceType.STEEL, 17382),
                            new ResourceChunk(ResourceType.CONCRETE, 53884),
                            new ResourceChunk(ResourceType.BRICK, 53455),
                            new ResourceChunk(ResourceType.WOOD, 476),
                            new ResourceChunk(ResourceType.MONEY, 139560)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.CONSTRUCTION, 32000),
                            new ResourceChunk(ResourceType.STEEL, 21540),
                            new ResourceChunk(ResourceType.CONCRETE, 66774),
                            new ResourceChunk(ResourceType.BRICK, 53850),
                            new ResourceChunk(ResourceType.WOOD, 4308),
                            new ResourceChunk(ResourceType.MONEY, 1723200)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.CONSTRUCTION, 38000),
                            new ResourceChunk(ResourceType.STEEL, 26340),
                            new ResourceChunk(ResourceType.CONCRETE, 81654),
                            new ResourceChunk(ResourceType.BRICK, 65850),
                            new ResourceChunk(ResourceType.WOOD, 5268),
                            new ResourceChunk(ResourceType.MONEY, 2107200)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.CONSTRUCTION, 44800),
                            new ResourceChunk(ResourceType.STEEL, 32052),
                            new ResourceChunk(ResourceType.CONCRETE, 99361),
                            new ResourceChunk(ResourceType.BRICK, 80130),
                            new ResourceChunk(ResourceType.WOOD, 6410),
                            new ResourceChunk(ResourceType.MONEY, 2564160)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.CONSTRUCTION, 52400),
                            new ResourceChunk(ResourceType.STEEL, 38740),
                            new ResourceChunk(ResourceType.CONCRETE, 120094),
                            new ResourceChunk(ResourceType.BRICK, 96850),
                            new ResourceChunk(ResourceType.WOOD, 7748),
                            new ResourceChunk(ResourceType.MONEY, 3099200)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.CONSTRUCTION, 60800),
                            new ResourceChunk(ResourceType.STEEL, 46468),
                            new ResourceChunk(ResourceType.CONCRETE, 144051),
                            new ResourceChunk(ResourceType.BRICK, 116170),
                            new ResourceChunk(ResourceType.WOOD, 9294),
                            new ResourceChunk(ResourceType.MONEY, 3717440)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.CONSTRUCTION, 70000),
                            new ResourceChunk(ResourceType.STEEL, 55300),
                            new ResourceChunk(ResourceType.CONCRETE, 171430),
                            new ResourceChunk(ResourceType.BRICK, 138250),
                            new ResourceChunk(ResourceType.WOOD, 11060),
                            new ResourceChunk(ResourceType.MONEY, 4424000)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.CONSTRUCTION, 80000),
                            new ResourceChunk(ResourceType.STEEL, 65300),
                            new ResourceChunk(ResourceType.CONCRETE, 202430),
                            new ResourceChunk(ResourceType.BRICK, 163250),
                            new ResourceChunk(ResourceType.WOOD, 13060),
                            new ResourceChunk(ResourceType.MONEY, 5224000)
                    )
            },
            null, // jobPrice
            null, // jobReward
            null, // jobRewardMultiplier
            null, // production
            null, // productionMultiplier
            null, // supply
            null, // supplyMultiplier
            new ResourcePack[]{ // demand
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.UPKEEP, 100),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 4),
                            new ResourceChunk(ResourceType.JOB, 80),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.UPKEEP, 200),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 8),
                            new ResourceChunk(ResourceType.JOB, 160),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.UPKEEP, 300),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 12),
                            new ResourceChunk(ResourceType.JOB, 240),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.UPKEEP, 400),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 16),
                            new ResourceChunk(ResourceType.JOB, 320),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.UPKEEP, 500),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 20),
                            new ResourceChunk(ResourceType.JOB, 400),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.UPKEEP, 700),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 28),
                            new ResourceChunk(ResourceType.JOB, 560),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.UPKEEP, 900),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 36),
                            new ResourceChunk(ResourceType.JOB, 720),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.UPKEEP, 1100),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 44),
                            new ResourceChunk(ResourceType.JOB, 880),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.UPKEEP, 1300),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 52),
                            new ResourceChunk(ResourceType.JOB, 1040),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.UPKEEP, 1500),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 60),
                            new ResourceChunk(ResourceType.JOB, 1200),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.UPKEEP, 1800),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 72),
                            new ResourceChunk(ResourceType.JOB, 1440),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.UPKEEP, 2100),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 84),
                            new ResourceChunk(ResourceType.JOB, 1680),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.UPKEEP, 2400),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 96),
                            new ResourceChunk(ResourceType.JOB, 1920),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.UPKEEP, 2700),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 108),
                            new ResourceChunk(ResourceType.JOB, 2160),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.UPKEEP, 3000),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 120),
                            new ResourceChunk(ResourceType.JOB, 2400),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.UPKEEP, 3400),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 136),
                            new ResourceChunk(ResourceType.JOB, 2720),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.UPKEEP, 3800),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 152),
                            new ResourceChunk(ResourceType.JOB, 3040),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.UPKEEP, 4200),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 168),
                            new ResourceChunk(ResourceType.JOB, 3360),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.UPKEEP, 4600),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 184),
                            new ResourceChunk(ResourceType.JOB, 3600),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.UPKEEP, 5000),
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 200),
                            new ResourceChunk(ResourceType.JOB, 4000),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    )
            },
            new ResourcePack[]{ // hold
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.POWER, 4),
                            new ResourceChunk(ResourceType.JOB, 80),
                            new ResourceChunk(ResourceType.WORKER, 80)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.POWER, 8),
                            new ResourceChunk(ResourceType.JOB, 160),
                            new ResourceChunk(ResourceType.WORKER, 160)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.POWER, 12),
                            new ResourceChunk(ResourceType.JOB, 240),
                            new ResourceChunk(ResourceType.WORKER, 240)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.POWER, 16),
                            new ResourceChunk(ResourceType.JOB, 320),
                            new ResourceChunk(ResourceType.WORKER, 320)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.POWER, 20),
                            new ResourceChunk(ResourceType.JOB, 400),
                            new ResourceChunk(ResourceType.WORKER, 400)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.POWER, 28),
                            new ResourceChunk(ResourceType.JOB, 560),
                            new ResourceChunk(ResourceType.WORKER, 560)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.POWER, 36),
                            new ResourceChunk(ResourceType.JOB, 720),
                            new ResourceChunk(ResourceType.WORKER, 720)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.POWER, 44),
                            new ResourceChunk(ResourceType.JOB, 880),
                            new ResourceChunk(ResourceType.WORKER, 880)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.POWER, 52),
                            new ResourceChunk(ResourceType.JOB, 1040),
                            new ResourceChunk(ResourceType.WORKER, 1040)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.POWER, 60),
                            new ResourceChunk(ResourceType.JOB, 1200),
                            new ResourceChunk(ResourceType.WORKER, 1200)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.POWER, 72),
                            new ResourceChunk(ResourceType.JOB, 1440),
                            new ResourceChunk(ResourceType.WORKER, 1440)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.POWER, 84),
                            new ResourceChunk(ResourceType.JOB, 1680),
                            new ResourceChunk(ResourceType.WORKER, 1680)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.POWER, 96),
                            new ResourceChunk(ResourceType.JOB, 1920),
                            new ResourceChunk(ResourceType.WORKER, 1920)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.POWER, 108),
                            new ResourceChunk(ResourceType.JOB, 2160),
                            new ResourceChunk(ResourceType.WORKER, 2160)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.POWER, 120),
                            new ResourceChunk(ResourceType.JOB, 2400),
                            new ResourceChunk(ResourceType.WORKER, 2400)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.POWER, 136),
                            new ResourceChunk(ResourceType.JOB, 2720),
                            new ResourceChunk(ResourceType.WORKER, 2720)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.POWER, 152),
                            new ResourceChunk(ResourceType.JOB, 3040),
                            new ResourceChunk(ResourceType.WORKER, 3040)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.POWER, 168),
                            new ResourceChunk(ResourceType.JOB, 3360),
                            new ResourceChunk(ResourceType.WORKER, 3360)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.POWER, 184),
                            new ResourceChunk(ResourceType.JOB, 3600),
                            new ResourceChunk(ResourceType.WORKER, 3600)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.POWER, 200),
                            new ResourceChunk(ResourceType.JOB, 4000),
                            new ResourceChunk(ResourceType.WORKER, 4000)
                    )
            },
            new ResourcePack[]{ // store
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.GLASS, 2000)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.GLASS, 4000)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.GLASS, 6000)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.GLASS, 8000)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.GLASS, 10000)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.GLASS, 14000)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.GLASS, 18000)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.GLASS, 22000)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.GLASS, 26000)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.GLASS, 30000)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.GLASS, 36000)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.GLASS, 42000)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.GLASS, 48000)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.GLASS, 54000)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.GLASS, 60000)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.GLASS, 68000)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.GLASS, 76000)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.GLASS, 84000)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.GLASS, 92000)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.GLASS, 100000)
                    )
            },
            null), // storeMultiplier
    MALL("mall",
            Strings.BLD_MALL,
            Images.BLD_MALL,
            1, // requiredPlayerLevel
            1, // maxLevel
            1000, // buildLimit
            115, // priceMultiplier
            new int[]{ // structure
                    300, // 1
                    900, // 2
                    1800, // 3
                    3000, // 4
                    4500, // 5
                    6600, // 6
                    9300, // 7
                    12600, // 8
                    16500, // 9
                    21000, // 10
                    26400, // 11
                    32700, // 12
                    39900, // 13
                    48000, // 14
                    57000, // 15
                    67200, // 16
                    78600, // 17
                    91200, // 18
                    105000, // 19
                    120000 // 20
            },
            new ResourcePack[]{  // buildCost
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.CONSTRUCTION, 300),
                            new ResourceChunk(ResourceType.STEEL, 92),
                            new ResourceChunk(ResourceType.CONCRETE, 153),
                            new ResourceChunk(ResourceType.GLASS, 306),
                            new ResourceChunk(ResourceType.MONEY, 21420)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.CONSTRUCTION, 900),
                            new ResourceChunk(ResourceType.STEEL, 279),
                            new ResourceChunk(ResourceType.CONCRETE, 465),
                            new ResourceChunk(ResourceType.GLASS, 930),
                            new ResourceChunk(ResourceType.MONEY, 65100)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.CONSTRUCTION, 1800),
                            new ResourceChunk(ResourceType.STEEL, 565),
                            new ResourceChunk(ResourceType.CONCRETE, 942),
                            new ResourceChunk(ResourceType.GLASS, 1884),
                            new ResourceChunk(ResourceType.MONEY, 131880)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.CONSTRUCTION, 3000),
                            new ResourceChunk(ResourceType.STEEL, 954),
                            new ResourceChunk(ResourceType.CONCRETE, 1590),
                            new ResourceChunk(ResourceType.GLASS, 3180),
                            new ResourceChunk(ResourceType.MONEY, 222600)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.CONSTRUCTION, 4500),
                            new ResourceChunk(ResourceType.STEEL, 1449),
                            new ResourceChunk(ResourceType.CONCRETE, 2415),
                            new ResourceChunk(ResourceType.GLASS, 4830),
                            new ResourceChunk(ResourceType.MONEY, 338100)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.CONSTRUCTION, 6600),
                            new ResourceChunk(ResourceType.STEEL, 2167),
                            new ResourceChunk(ResourceType.CONCRETE, 3612),
                            new ResourceChunk(ResourceType.GLASS, 7224),
                            new ResourceChunk(ResourceType.MONEY, 505680)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.CONSTRUCTION, 9300),
                            new ResourceChunk(ResourceType.STEEL, 3123),
                            new ResourceChunk(ResourceType.CONCRETE, 5205),
                            new ResourceChunk(ResourceType.GLASS, 10410),
                            new ResourceChunk(ResourceType.MONEY, 728700)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.CONSTRUCTION, 12600),
                            new ResourceChunk(ResourceType.STEEL, 4331),
                            new ResourceChunk(ResourceType.CONCRETE, 7218),
                            new ResourceChunk(ResourceType.GLASS, 14436),
                            new ResourceChunk(ResourceType.MONEY, 1010520)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.CONSTRUCTION, 16500),
                            new ResourceChunk(ResourceType.STEEL, 5805),
                            new ResourceChunk(ResourceType.CONCRETE, 9675),
                            new ResourceChunk(ResourceType.GLASS, 19350),
                            new ResourceChunk(ResourceType.MONEY, 1354500)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.CONSTRUCTION, 21000),
                            new ResourceChunk(ResourceType.STEEL, 7560),
                            new ResourceChunk(ResourceType.CONCRETE, 12600),
                            new ResourceChunk(ResourceType.GLASS, 25200),
                            new ResourceChunk(ResourceType.MONEY, 1764000)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.CONSTRUCTION, 26400),
                            new ResourceChunk(ResourceType.STEEL, 9763),
                            new ResourceChunk(ResourceType.CONCRETE, 16272),
                            new ResourceChunk(ResourceType.GLASS, 32544),
                            new ResourceChunk(ResourceType.MONEY, 2278080)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.CONSTRUCTION, 32700),
                            new ResourceChunk(ResourceType.STEEL, 12447),
                            new ResourceChunk(ResourceType.CONCRETE, 20745),
                            new ResourceChunk(ResourceType.GLASS, 41490),
                            new ResourceChunk(ResourceType.MONEY, 2904300)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.CONSTRUCTION, 39900),
                            new ResourceChunk(ResourceType.STEEL, 15644),
                            new ResourceChunk(ResourceType.CONCRETE, 26073),
                            new ResourceChunk(ResourceType.GLASS, 52146),
                            new ResourceChunk(ResourceType.MONEY, 3650220)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.CONSTRUCTION, 48000),
                            new ResourceChunk(ResourceType.STEEL, 19386),
                            new ResourceChunk(ResourceType.CONCRETE, 32310),
                            new ResourceChunk(ResourceType.GLASS, 64620),
                            new ResourceChunk(ResourceType.MONEY, 4523400)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.CONSTRUCTION, 57000),
                            new ResourceChunk(ResourceType.STEEL, 23706),
                            new ResourceChunk(ResourceType.CONCRETE, 39510),
                            new ResourceChunk(ResourceType.GLASS, 79020),
                            new ResourceChunk(ResourceType.MONEY, 5531400)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.CONSTRUCTION, 67200),
                            new ResourceChunk(ResourceType.STEEL, 28847),
                            new ResourceChunk(ResourceType.CONCRETE, 48079),
                            new ResourceChunk(ResourceType.GLASS, 96156),
                            new ResourceChunk(ResourceType.MONEY, 6730920)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.CONSTRUCTION, 78600),
                            new ResourceChunk(ResourceType.STEEL, 34866),
                            new ResourceChunk(ResourceType.CONCRETE, 58110),
                            new ResourceChunk(ResourceType.GLASS, 116220),
                            new ResourceChunk(ResourceType.MONEY, 8135400)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.CONSTRUCTION, 91200),
                            new ResourceChunk(ResourceType.STEEL, 41821),
                            new ResourceChunk(ResourceType.CONCRETE, 69702),
                            new ResourceChunk(ResourceType.GLASS, 139404),
                            new ResourceChunk(ResourceType.MONEY, 9758280)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.CONSTRUCTION, 105000),
                            new ResourceChunk(ResourceType.STEEL, 49770),
                            new ResourceChunk(ResourceType.CONCRETE, 82950),
                            new ResourceChunk(ResourceType.GLASS, 165900),
                            new ResourceChunk(ResourceType.MONEY, 11613000)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.CONSTRUCTION, 120000),
                            new ResourceChunk(ResourceType.STEEL, 58770),
                            new ResourceChunk(ResourceType.CONCRETE, 97950),
                            new ResourceChunk(ResourceType.GLASS, 195900),
                            new ResourceChunk(ResourceType.MONEY, 13713000)
                    )
            },
            null, // jobPrice
            null, // jobReward
            null, // jobRewardMultiplier
            new ResourcePack[]{  // production
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.MONEY, 120)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.MONEY, 240)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.MONEY, 360)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.MONEY, 480)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.MONEY, 600)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.MONEY, 840)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.MONEY, 1080)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.MONEY, 1320)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.MONEY, 1560)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.MONEY, 1800)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.MONEY, 2160)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.MONEY, 2520)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.MONEY, 2880)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.MONEY, 3240)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.MONEY, 3600)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.MONEY, 4080)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.MONEY, 4560)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.MONEY, 5040)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.MONEY, 5520)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.MONEY, 6000)
                    )
            },
            null, // productionMultiplier
            null, // supply
            null, // supplyMultiplier
            new ResourcePack[]{ // demand
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 5),
                            new ResourceChunk(ResourceType.JOB, 100),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 10),
                            new ResourceChunk(ResourceType.JOB, 200),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 15),
                            new ResourceChunk(ResourceType.JOB, 300),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 20),
                            new ResourceChunk(ResourceType.JOB, 400),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 25),
                            new ResourceChunk(ResourceType.JOB, 500),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 35),
                            new ResourceChunk(ResourceType.JOB, 700),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 45),
                            new ResourceChunk(ResourceType.JOB, 900),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 55),
                            new ResourceChunk(ResourceType.JOB, 1100),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 65),
                            new ResourceChunk(ResourceType.JOB, 1300),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 75),
                            new ResourceChunk(ResourceType.JOB, 1500),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 90),
                            new ResourceChunk(ResourceType.JOB, 1800),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 105),
                            new ResourceChunk(ResourceType.JOB, 2100),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 120),
                            new ResourceChunk(ResourceType.JOB, 2400),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 135),
                            new ResourceChunk(ResourceType.JOB, 2700),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 150),
                            new ResourceChunk(ResourceType.JOB, 3000),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 170),
                            new ResourceChunk(ResourceType.JOB, 3400),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 190),
                            new ResourceChunk(ResourceType.JOB, 3800),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 210),
                            new ResourceChunk(ResourceType.JOB, 4200),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 230),
                            new ResourceChunk(ResourceType.JOB, 4600),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.POWER_CONSUMPTION, 250),
                            new ResourceChunk(ResourceType.JOB, 5000),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    )
            },
            new ResourcePack[]{ // hold
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.POWER, 5),
                            new ResourceChunk(ResourceType.JOB, 100),
                            new ResourceChunk(ResourceType.WORKER, 100)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.POWER, 10),
                            new ResourceChunk(ResourceType.JOB, 200),
                            new ResourceChunk(ResourceType.WORKER, 200)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.POWER, 15),
                            new ResourceChunk(ResourceType.JOB, 300),
                            new ResourceChunk(ResourceType.WORKER, 300)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.POWER, 20),
                            new ResourceChunk(ResourceType.JOB, 400),
                            new ResourceChunk(ResourceType.WORKER, 400)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.POWER, 25),
                            new ResourceChunk(ResourceType.JOB, 500),
                            new ResourceChunk(ResourceType.WORKER, 500)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.POWER, 35),
                            new ResourceChunk(ResourceType.JOB, 700),
                            new ResourceChunk(ResourceType.WORKER, 700)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.POWER, 45),
                            new ResourceChunk(ResourceType.JOB, 900),
                            new ResourceChunk(ResourceType.WORKER, 900)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.POWER, 55),
                            new ResourceChunk(ResourceType.JOB, 1100),
                            new ResourceChunk(ResourceType.WORKER, 1100)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.POWER, 65),
                            new ResourceChunk(ResourceType.JOB, 1300),
                            new ResourceChunk(ResourceType.WORKER, 1300)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.POWER, 75),
                            new ResourceChunk(ResourceType.JOB, 1500),
                            new ResourceChunk(ResourceType.WORKER, 1500)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.POWER, 90),
                            new ResourceChunk(ResourceType.JOB, 1800),
                            new ResourceChunk(ResourceType.WORKER, 1800)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.POWER, 105),
                            new ResourceChunk(ResourceType.JOB, 2100),
                            new ResourceChunk(ResourceType.WORKER, 2100)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.POWER, 120),
                            new ResourceChunk(ResourceType.JOB, 2400),
                            new ResourceChunk(ResourceType.WORKER, 2400)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.POWER, 135),
                            new ResourceChunk(ResourceType.JOB, 2700),
                            new ResourceChunk(ResourceType.WORKER, 2700)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.POWER, 150),
                            new ResourceChunk(ResourceType.JOB, 3000),
                            new ResourceChunk(ResourceType.WORKER, 3000)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.POWER, 170),
                            new ResourceChunk(ResourceType.JOB, 3400),
                            new ResourceChunk(ResourceType.WORKER, 3400)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.POWER, 190),
                            new ResourceChunk(ResourceType.JOB, 3800),
                            new ResourceChunk(ResourceType.WORKER, 3800)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.POWER, 210),
                            new ResourceChunk(ResourceType.JOB, 4200),
                            new ResourceChunk(ResourceType.WORKER, 4200)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.POWER, 230),
                            new ResourceChunk(ResourceType.JOB, 4600),
                            new ResourceChunk(ResourceType.WORKER, 4600)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.POWER, 250),
                            new ResourceChunk(ResourceType.JOB, 5000),
                            new ResourceChunk(ResourceType.WORKER, 5000)
                    )
            },
            new ResourcePack[]{ // store
                    new ResourcePack( // 1
                            new ResourceChunk(ResourceType.MONEY, 15000)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.MONEY, 30000)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.MONEY, 45000)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.MONEY, 60000)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.MONEY, 75000)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.MONEY, 105000)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.MONEY, 135000)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.MONEY, 165000)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.MONEY, 195000)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.MONEY, 225000)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.MONEY, 270000)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.MONEY, 315000)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.MONEY, 360000)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.MONEY, 405000)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.MONEY, 450000)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.MONEY, 510000)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.MONEY, 570000)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.MONEY, 630000)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.MONEY, 690000)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.MONEY, 750000)
                    )
            },
            null), // storeMultiplier
    POLICE("police",
            Strings.BLD_POLICE,
            Images.BLD_POLICE,
            1, // requiredPlayerLevel
            1, // maxLevel
            1, // buildLimit
            100, // priceMultiplier
            null, // structure
            null, // buildCost
            null, // jobPrice
            null, // jobReward
            null, // jobRewardMultiplier
            null, // production
            null, // productionMultiplier
            null, // supply
            null, // supplyMultiplier
            null, // demand
            null, // hold
            null, // store
            null), // storeMultiplier
    FIRE_STATION("fire_station",
            Strings.BLD_FIRE_STATION,
            Images.BLD_FIRE_STATION,
            1, // requiredPlayerLevel
            1, // maxLevel
            1, // buildLimit
            100, // priceMultiplier
            null, // structure
            null, // buildCost
            null, // jobPrice
            null, // jobReward
            null, // jobRewardMultiplier
            null, // production
            null, // productionMultiplier
            null, // supply
            null, // supplyMultiplier
            null, // demand
            null, // hold
            null, // store
            null), // storeMultiplier
    GYM("gym",
            Strings.BLD_GYM,
            Images.BLD_GYM,
            1, // requiredPlayerLevel
            1, // maxLevel
            1, // buildLimit
            100, // priceMultiplier
            null, // structure
            null, // buildCost
            null, // jobPrice
            null, // jobReward
            null, // jobRewardMultiplier
            null, // production
            null, // productionMultiplier
            null, // supply
            null, // supplyMultiplier
            null, // demand
            null, // hold
            null, // store
            null), // storeMultiplier
    CITY_PLANNING("city_planning",
            Strings.BLD_CITY_PLANNING,
            Images.BLD_CITY_PLANNING,
            1, // requiredPlayerLevel
            1, // maxLevel
            1, // buildLimit
            100, // priceMultiplier
            null, // structure
            null, // buildCost
            null, // jobPrice
            null, // jobReward
            null, // jobRewardMultiplier
            null, // production
            null, // productionMultiplier
            null, // supply
            null, // supplyMultiplier
            null, // demand
            null, // hold
            null, // store
            null), // storeMultiplier
    HOTEL("hotel",
            Strings.BLD_HOTEL,
            Images.BLD_HOTEL,
            1, // requiredPlayerLevel
            1, // maxLevel
            1, // buildLimit
            100, // priceMultiplier
            null, // structure
            null, // buildCost
            null, // jobPrice
            null, // jobReward
            null, // jobRewardMultiplier
            null, // production
            null, // productionMultiplier
            null, // supply
            null, // supplyMultiplier
            null, // demand
            null, // hold
            null, // store
            null), // storeMultiplier
    CONSTRUCTION_SITE("construction_site",
            Strings.BLD_CONSTRUCTION_SITE,
            Images.BLD_CONSTRUCTION_SITE,
            1, // requiredPlayerLevel
            1, // maxLevel
            1, // buildLimit
            100, // priceMultiplier
            null, // structure
            null, // buildCost
            null, // jobPrice
            null, // jobReward
            null, // jobRewardMultiplier
            null, // production
            null, // productionMultiplier
            null, // supply
            null, // supplyMultiplier
            null, // demand
            null, // hold
            null, // store
            null), // storeMultiplier
    BANK("bank",
            Strings.BLD_BANK,
            Images.BLD_BANK,
            1, // requiredPlayerLevel
            1, // maxLevel
            1, // buildLimit
            100, // priceMultiplier
            null, // structure
            null, // buildCost
            null, // jobPrice
            null, // jobReward
            null, // jobRewardMultiplier
            null, // production
            null, // productionMultiplier
            null, // supply
            null, // supplyMultiplier
            null, // demand
            null, // hold
            null, // store
            null), // storeMultiplier
    ENGINEERING_CENTER("engineering_center",
            Strings.BLD_ENGINEERING_CENTER,
            Images.BLD_ENGINEERING_CENTER,
            1, // requiredPlayerLevel
            1, // maxLevel
            1, // buildLimit
            100, // priceMultiplier
            null, // structure
            null, // buildCost
            null, // jobPrice
            null, // jobReward
            null, // jobRewardMultiplier
            null, // production
            null, // productionMultiplier
            null, // supply
            null, // supplyMultiplier
            null, // demand
            null, // hold
            null, // store
            null), // storeMultiplier
    EXCHANGE("exchange",
            Strings.BLD_EXCHANGE,
            Images.BLD_EXCHANGE,
            1, // requiredPlayerLevel
            1, // maxLevel
            1, // buildLimit
            100, // priceMultiplier
            null, // structure
            null, // buildCost
            null, // jobPrice
            null, // jobReward
            null, // jobRewardMultiplier
            null, // production
            null, // productionMultiplier
            null, // supply
            null, // supplyMultiplier
            null, // demand
            null, // hold
            null, // store
            null), // storeMultiplier
    PORT("port",
            Strings.BLD_PORT,
            Images.BLD_PORT,
            1, // requiredPlayerLevel
            1, // maxLevel
            1, // buildLimit
            100, // priceMultiplier
            null, // structure
            null, // buildCost
            null, // jobPrice
            null, // jobReward
            null, // jobRewardMultiplier
            null, // production
            null, // productionMultiplier
            null, // supply
            null, // supplyMultiplier
            null, // demand
            null, // hold
            null, // store
            null), // storeMultiplier
    AIRPORT("airport",
            Strings.BLD_AIRPORT,
            Images.BLD_AIRPORT,
            1, // requiredPlayerLevel
            1, // maxLevel
            1, // buildLimit
            100, // priceMultiplier
            null, // structure
            null, // buildCost
            null, // jobPrice
            null, // jobReward
            null, // jobRewardMultiplier
            null, // production
            null, // productionMultiplier
            null, // supply
            null, // supplyMultiplier
            null, // demand
            null, // hold
            null, // store
            null), // storeMultiplier
    NUCLEAR_PLANT("nuclear_plant",
            Strings.BLD_NUCLEAR_PLANT,
            Images.BLD_NUCLEAR_PLANT,
            1, // requiredPlayerLevel
            1, // maxLevel
            1, // buildLimit
            100, // priceMultiplier
            null, // structure
            null, // buildCost
            null, // jobPrice
            null, // jobReward
            null, // jobRewardMultiplier
            null, // production
            null, // productionMultiplier
            null, // supply
            null, // supplyMultiplier
            null, // demand
            null, // hold
            null, // store
            null) // storeMultiplier
    ;

    /**
     * Upper limit for <code>requiredPlayerLevel</code> param.
     */
    private static final int MAX_REQUIRED_PLAYER_LEVEL = 100;

    /**
     * Upper limit for <code>maxLevel</code> param.
     */
    private static final int MAX_ALLOWED_BUILDING_LEVEL = 100;

    /**
     * Upper limit for <code>buildLimit</code> param.
     */
    private static final int MAX_BUILD_LIMIT = 1000;

    /**
     * Upper limit for <code>priceMultiplier</code> param.
     */
    private static final int MAX_PRICE_MULTIPLIER = 1000;

    /**
     * String identity equivalent for the enum itself.
     */
    public final String type;

    /**
     * Link to the key holder to retrieve localized building type name from the Source Handler.
     */
    public final Strings l10nKey;

    /**
     * Link to the key holder to retrieve the corresonding building Image object from the Source Handler.
     */
    public final Images imgKey;

    /**
     * Player must have at least this experience level to be able to construct buildings of this type.
     */
    private int requiredPlayerLevel;

    /**
     * Amount of levels (upgrades) this type of building can have.
     * Building levels are counted form 1
     */
    private int maxLevel;

    /**
     * How many buildings of this type are allowed to construct
     */
    private int buildLimit;

    /**
     * Each subsequent building of this type costs this much higher to construct and upgrade.
     * </p>
     * E.g. the <code>priceMultiplier</code> equals 115:
     * First building of this type would cost exactly the values taken from the <code>buildCost</code> property.
     * The second building of this type would proportionally cost x1.15 times more.
     * The third one would be x1.3225 (= 1.15 ^ 2) times more expensive.
     * And so on.
     */
    private int priceMultiplier;

    /**
     * Amount of hitPoints the building has at each its level.
     * Affects the amount of Experience points that player acquires when construction is done.
     */
    private int[] structure;

    /**
     * Cumulative prices to construct such building of such level.
     * </p>
     * Suppose the building has <code>maxLevel = 3</code>.
     * This property must have the same amount of values (array length = 3).
     * The initial construction of such building (1st level) would cost the amount of resources at index 0 in this
     * array.
     * The upgrade from level 1 to level 2 would cost resources at index 1 <b>minus</b> resources at index 0.
     * The upgrade from level 2 to level 3 would cost resources at index 2 <b>minus</b> resources at index 1.
     * </p>
     * In other worlds, the value at index n shows how much resources needed to construct and upgrade a building of
     * this type from a scratch to the level n + 1.
     * </p>
     * Consider also that <code>priceMultiplier</code> property multiplies these costs for subsequent buildings of the
     * same type.
     */
    private ResourcePack[] buildCost;

    /**
     * Amount of resources taken from the player to get the corresponding <code>jobReward</code> for completing a
     * "production intensification" job.
     * Ranged by building level correspondingly.
     * Not affected by the building's productivity.
     */
    private ResourcePack[] jobPrice;

    /**
     * Amount of resources granted to the player for completing a "production intensification" job.
     * Ranged by building level correspondingly.
     * Directly affected by the building's productivity: these values correspond to 100% productivity.
     */
    private ResourcePack[] jobReward;

    /**
     * Some buildings could provide global effects on job rewards.
     * These values mean that the additional percent of given resource type would be provided as a "production
     * intensification" job reward in any building having reward of such resource type.
     * Ranged by building level correspondingly.
     * Directly affected by the building's productivity: these values correspond to 100% productivity.
     */
    private ResourcePack[] jobRewardMultiplier;

    /**
     * Amount of resources produced by a building of this type in an hour. Steady idle production.
     * Ranged by building level correspondingly.
     * Directly affected by the building's productivity: these values correspond to 100% productivity.
     */
    private ResourcePack[] production;

    /**
     * Some buildings could provide global effects on production amounts.
     * These values mean that the production of resources of this resource type would be increased by given percent in
     * all buildings producing this resource type.
     * Values are ranged by building level correspondingly.
     * Directly affected by the building's productivity: these values correspond to 100% productivity.
     */
    private ResourcePack[] productionMultiplier;

    /**
     * Amount of supplement resources constantly provided by this building. Those resources are not collected or stored
     * in some kind of warehouse. Neither they are spent for some construction.
     * Values are ranged by building level correspondingly.
     * Directly affected by the building's productivity: these values correspond to 100% productivity.
     */
    private ResourcePack[] supply;

    /**
     * Some buildings could provide global effects on supply amounts.
     * These values mean that the supply of resources of this resource type would be increased by given percent in all
     * buildings supplying this resource type.
     * Values are ranged by building level correspondingly.
     * Directly affected by the building's productivity: these values correspond to 100% productivity.
     */
    private ResourcePack[] supplyMultiplier;

    /**
     * Amount of supplement resources required for this building to operate.
     * Constant value, depends only on building level: values are ranged by building level correspondingly.
     * Regardless of condition, the building would always demand these resources and consume what is provided to it.
     */
    private ResourcePack[] demand;

    /**
     * Amount of supplement resources consumed by this building if any provided.
     * Constant value, depends only on building level: values are ranged by building level correspondingly.
     * Regardless of condition, the building would always demand these resources and consume what is provided to it.
     */
    private ResourcePack[] hold;

    /**
     * Amount of resources that could be stored in this building for future use.
     * Values are ranged by building level correspondingly.
     * Directly affected by the building's productivity: these values correspond to 100% productivity.
     */
    private ResourcePack[] store;

    /**
     * Some buildings could provide global effect on storage ammount.
     * These values mean that the store of resources of this resource type would be increase by given percent in all
     * buildings storig this resource type.
     * Values are ranged by the building's productivity: these values correspond to 100% productivity.
     */
    private ResourcePack[] storeMultiplier;

    BuildingType(String type,
                 Strings l10nKey,
                 Images imgKey,
                 int requiredPlayerLevel,
                 int maxLevel,
                 int buildLimit,
                 int priceMultiplier,
                 int[] structure,
                 ResourcePack[] buildCost,
                 ResourcePack[] jobPrice,
                 ResourcePack[] jobReward,
                 ResourcePack[] jobRewardMultiplier,
                 ResourcePack[] production,
                 ResourcePack[] productionMultiplier,
                 ResourcePack[] supply,
                 ResourcePack[] supplyMultiplier,
                 ResourcePack[] demand,
                 ResourcePack[] hold,
                 ResourcePack[] store,
                 ResourcePack[] storeMultiplier) {
        this.type = Str.nonNull(type);
        this.l10nKey = Objects.requireNonNull(l10nKey);
        this.imgKey = Objects.requireNonNull(imgKey);
        setRequiredPlayerLevel(requiredPlayerLevel);
        setMaxLevel(maxLevel);
        setBuildLimit(buildLimit);
        setPriceMultiplier(priceMultiplier);
        setStructure(structure);
        setBuildCost(buildCost);
        setJobPrice(jobPrice);
        setJobReward(jobReward);
        setJobRewardMultiplier(jobRewardMultiplier);
        setProduction(production);
        setProductionMultiplier(productionMultiplier);
        setSupply(supply);
        setSupplyMultiplier(supplyMultiplier);
        setDemand(demand);
        setStore(store);
        setStoreMultiplier(storeMultiplier);
    }

    public static BuildingType get(String type) {
        for (BuildingType building : BuildingType.values()) {
            if (building.type.equalsIgnoreCase(Str.nonNull(type))) return building;
        }
        return null;
    }

    public static BuildingType get(int ordinal) {
        for (BuildingType building : BuildingType.values()) if (building.ordinal() == ordinal) return building;
        return null;
    }

    public int getRequiredPlayerLevel() {
        return requiredPlayerLevel;
    }

    public void setRequiredPlayerLevel(int requiredPlayerLevel) {
        this.requiredPlayerLevel = M.clamp(1, MAX_REQUIRED_PLAYER_LEVEL);
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(int maxLevel) {
        this.maxLevel = M.clamp(1, MAX_ALLOWED_BUILDING_LEVEL);
    }

    public int getBuildLimit() {
        return buildLimit;
    }

    public void setBuildLimit(int buildLimit) {
        this.buildLimit = M.clamp(1, MAX_BUILD_LIMIT);
    }

    public int getPriceMultiplier() {
        return priceMultiplier;
    }

    public void setPriceMultiplier(int priceMultiplier) {
        this.priceMultiplier = M.clamp(1, MAX_PRICE_MULTIPLIER);
    }

    public int[] getStructure() {
        return structure;
    }

    public void setStructure(int[] structure) {
        if (structure == null) {
            this.structure = new int[maxLevel];
            return;
        }
        if (structure.length != maxLevel) return;
        this.structure = structure;
    }

    public ResourcePack[] getBuildCost() {
        return buildCost;
    }

    public void setBuildCost(ResourcePack[] buildCost) {
        if (buildCost == null) {
            this.buildCost = new ResourcePack[maxLevel];
            return;
        }
        if (buildCost.length != maxLevel)
            this.buildCost = buildCost;
    }

    public ResourcePack[] getJobPrice() {
        return jobPrice;
    }

    public void setJobPrice(ResourcePack[] jobPrice) {
        if (buildCost == null) {
            this.jobPrice = new ResourcePack[maxLevel];
            return;
        }
        if (jobPrice.length != maxLevel) return;
        this.jobPrice = jobPrice;
    }

    public ResourcePack[] getJobReward() {
        return jobReward;
    }

    public void setJobReward(ResourcePack[] jobReward) {
        if (jobReward == null) {
            this.jobReward = new ResourcePack[maxLevel];
            return;
        }
        if (jobReward.length != maxLevel) return;
        this.jobReward = jobReward;
    }

    public ResourcePack[] getJobRewardMultiplier() {
        return jobRewardMultiplier;
    }

    public void setJobRewardMultiplier(ResourcePack[] jobRewardMultiplier) {
        if (jobRewardMultiplier == null) {
            this.jobRewardMultiplier = new ResourcePack[maxLevel];
            return;
        }
        if (jobRewardMultiplier.length != maxLevel) return;
        this.jobRewardMultiplier = jobRewardMultiplier;
    }

    public ResourcePack[] getProduction() {
        return production;
    }

    public void setProduction(ResourcePack[] production) {
        if (production == null) {
            this.production = new ResourcePack[maxLevel];
            return;
        }
        if (production.length != maxLevel) return;
        this.production = production;
    }

    public ResourcePack[] getProductionMultiplier() {
        return productionMultiplier;
    }

    public void setProductionMultiplier(ResourcePack[] productionMultiplier) {
        if (productionMultiplier == null) {
            this.productionMultiplier = new ResourcePack[maxLevel];
            return;
        }
        if (productionMultiplier.length != maxLevel) return;
        this.productionMultiplier = productionMultiplier;
    }

    public ResourcePack[] getSupply() {
        return supply;
    }

    public void setSupply(ResourcePack[] supply) {
        if (supply == null) {
            this.supply = new ResourcePack[maxLevel];
            return;
        }
        if (supply.length != maxLevel) return;
        this.supply = supply;
    }

    public ResourcePack[] getSupplyMultiplier() {
        return supplyMultiplier;
    }

    public void setSupplyMultiplier(ResourcePack[] supplyMultiplier) {
        if (supplyMultiplier == null) {
            this.supplyMultiplier = new ResourcePack[maxLevel];
            return;
        }
        if (supplyMultiplier.length != maxLevel) return;
        this.supplyMultiplier = supplyMultiplier;
    }

    public ResourcePack[] getDemand() {
        return demand;
    }

    public void setDemand(ResourcePack[] demand) {
        if (demand == null) {
            this.demand = new ResourcePack[maxLevel];
            return;
        }
        if (demand.length != maxLevel) return;
        this.demand = demand;
    }

    public ResourcePack[] getHold() {
        return hold;
    }

    public void setHold(ResourcePack[] hold) {
        if (hold == null) {
            this.hold = new ResourcePack[maxLevel];
            return;
        }
        if (hold.length != maxLevel) return;
        this.hold = hold;
    }

    public ResourcePack[] getStore() {
        return store;
    }

    public void setStore(ResourcePack[] store) {
        if (store == null) {
            this.store = new ResourcePack[maxLevel];
            return;
        }
        if (store.length != maxLevel) return;
        this.store = store;
    }

    public ResourcePack[] getStoreMultiplier() {
        return storeMultiplier;
    }

    public void setStoreMultiplier(ResourcePack[] storeMultiplier) {
        if (storeMultiplier == null) {
            this.storeMultiplier = new ResourcePack[maxLevel];
            return;
        }
        if (storeMultiplier.length != maxLevel) return;
        this.storeMultiplier = storeMultiplier;
    }
}
