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
            null,  // supplyMultiplier
            null, // demand
            null, // hold
            null), // holdMultiplier
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
            null,  // supplyMultiplier
            null, // demand
            null, // hold
            null), // holdMultiplier
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
                    42600, // 10
                    54000, // 11
                    67200, // 12
                    82200, // 13
                    99000, // 14
                    117600, // 15
                    138600, // 16
                    162000, // 17
                    187800, // 18
                    215400, // 19
                    245400 // 20
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
                            new ResourceChunk(ResourceType.CONSTRUCTION, 42600),
                            new ResourceChunk(ResourceType.STEEL, 17124),
                            new ResourceChunk(ResourceType.CONCRETE, 85620),
                            new ResourceChunk(ResourceType.GLASS, 8562),
                            new ResourceChunk(ResourceType.MONEY, 2568600)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.CONSTRUCTION, 54000),
                            new ResourceChunk(ResourceType.STEEL, 22368),
                            new ResourceChunk(ResourceType.CONCRETE, 111840),
                            new ResourceChunk(ResourceType.GLASS, 11184),
                            new ResourceChunk(ResourceType.MONEY, 3355200)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.CONSTRUCTION, 67200),
                            new ResourceChunk(ResourceType.STEEL, 28704),
                            new ResourceChunk(ResourceType.CONCRETE, 143520),
                            new ResourceChunk(ResourceType.GLASS, 14352),
                            new ResourceChunk(ResourceType.MONEY, 4305600)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.CONSTRUCTION, 82200),
                            new ResourceChunk(ResourceType.STEEL, 36204),
                            new ResourceChunk(ResourceType.CONCRETE, 181020),
                            new ResourceChunk(ResourceType.GLASS, 18102),
                            new ResourceChunk(ResourceType.MONEY, 5430600)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.CONSTRUCTION, 99000),
                            new ResourceChunk(ResourceType.STEEL, 44940),
                            new ResourceChunk(ResourceType.CONCRETE, 224700),
                            new ResourceChunk(ResourceType.GLASS, 22470),
                            new ResourceChunk(ResourceType.MONEY, 6741000)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.CONSTRUCTION, 117600),
                            new ResourceChunk(ResourceType.STEEL, 54984),
                            new ResourceChunk(ResourceType.CONCRETE, 274920),
                            new ResourceChunk(ResourceType.GLASS, 27492),
                            new ResourceChunk(ResourceType.MONEY, 8247600)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.CONSTRUCTION, 138600),
                            new ResourceChunk(ResourceType.STEEL, 66884),
                            new ResourceChunk(ResourceType.CONCRETE, 334420),
                            new ResourceChunk(ResourceType.GLASS, 33442),
                            new ResourceChunk(ResourceType.MONEY, 10032600)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.CONSTRUCTION, 162000),
                            new ResourceChunk(ResourceType.STEEL, 80768),
                            new ResourceChunk(ResourceType.CONCRETE, 403840),
                            new ResourceChunk(ResourceType.GLASS, 40384),
                            new ResourceChunk(ResourceType.MONEY, 12115200)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.CONSTRUCTION, 187800),
                            new ResourceChunk(ResourceType.STEEL, 96764),
                            new ResourceChunk(ResourceType.CONCRETE, 48382),
                            new ResourceChunk(ResourceType.GLASS, 48382),
                            new ResourceChunk(ResourceType.MONEY, 14514600)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.CONSTRUCTION, 215400),
                            new ResourceChunk(ResourceType.STEEL, 114428),
                            new ResourceChunk(ResourceType.CONCRETE, 571240),
                            new ResourceChunk(ResourceType.GLASS, 57214),
                            new ResourceChunk(ResourceType.MONEY, 17164200)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.CONSTRUCTION, 245400),
                            new ResourceChunk(ResourceType.STEEL, 134428),
                            new ResourceChunk(ResourceType.CONCRETE, 672140),
                            new ResourceChunk(ResourceType.GLASS, 67214),
                            new ResourceChunk(ResourceType.MONEY, 20164200)
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
                            new ResourceChunk(ResourceType.POWER, 1600)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.POWER, 1900)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.POWER, 2200)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.POWER, 2500)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.POWER, 2800)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.POWER, 3100)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.POWER, 3500)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.POWER, 3900)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.POWER, 4300)
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
                            new ResourceChunk(ResourceType.WORKER, 240),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 2
                            new ResourceChunk(ResourceType.UPKEEP, 240),
                            new ResourceChunk(ResourceType.JOB, 480),
                            new ResourceChunk(ResourceType.WORKER, 480),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 3
                            new ResourceChunk(ResourceType.UPKEEP, 360),
                            new ResourceChunk(ResourceType.JOB, 720),
                            new ResourceChunk(ResourceType.WORKER, 720),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 4
                            new ResourceChunk(ResourceType.UPKEEP, 480),
                            new ResourceChunk(ResourceType.JOB, 960),
                            new ResourceChunk(ResourceType.WORKER, 960),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 5
                            new ResourceChunk(ResourceType.UPKEEP, 600),
                            new ResourceChunk(ResourceType.JOB, 1200),
                            new ResourceChunk(ResourceType.WORKER, 1200),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 6
                            new ResourceChunk(ResourceType.UPKEEP, 840),
                            new ResourceChunk(ResourceType.JOB, 1680),
                            new ResourceChunk(ResourceType.WORKER, 1680),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 7
                            new ResourceChunk(ResourceType.UPKEEP, 1080),
                            new ResourceChunk(ResourceType.JOB, 2160),
                            new ResourceChunk(ResourceType.WORKER, 2160),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 8
                            new ResourceChunk(ResourceType.UPKEEP, 1320),
                            new ResourceChunk(ResourceType.JOB, 2640),
                            new ResourceChunk(ResourceType.WORKER, 2640),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 9
                            new ResourceChunk(ResourceType.UPKEEP, 1560),
                            new ResourceChunk(ResourceType.JOB, 3120),
                            new ResourceChunk(ResourceType.WORKER, 3120),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 10
                            new ResourceChunk(ResourceType.UPKEEP, 1920),
                            new ResourceChunk(ResourceType.JOB, 3840),
                            new ResourceChunk(ResourceType.WORKER, 3840),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.UPKEEP, 2280),
                            new ResourceChunk(ResourceType.JOB, 4560),
                            new ResourceChunk(ResourceType.WORKER, 4560),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.UPKEEP, 2640),
                            new ResourceChunk(ResourceType.JOB, 5280),
                            new ResourceChunk(ResourceType.WORKER, 5280),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.UPKEEP, 3000),
                            new ResourceChunk(ResourceType.JOB, 6000),
                            new ResourceChunk(ResourceType.WORKER, 6000),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.UPKEEP, 3360),
                            new ResourceChunk(ResourceType.JOB, 6720),
                            new ResourceChunk(ResourceType.WORKER, 6720),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.UPKEEP, 3720),
                            new ResourceChunk(ResourceType.JOB, 7440),
                            new ResourceChunk(ResourceType.WORKER, 7440),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.UPKEEP, 4200),
                            new ResourceChunk(ResourceType.JOB, 8400),
                            new ResourceChunk(ResourceType.WORKER, 8400),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.UPKEEP, 4680),
                            new ResourceChunk(ResourceType.JOB, 9360),
                            new ResourceChunk(ResourceType.WORKER, 9360),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.UPKEEP, 5160),
                            new ResourceChunk(ResourceType.JOB, 10320),
                            new ResourceChunk(ResourceType.WORKER, 10320),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 19
                            new ResourceChunk(ResourceType.UPKEEP, 5520),
                            new ResourceChunk(ResourceType.JOB, 11040),
                            new ResourceChunk(ResourceType.WORKER, 11040),
                            new ResourceChunk(ResourceType.IGNITABILITY, 1)
                    ),
                    new ResourcePack( // 20
                            new ResourceChunk(ResourceType.UPKEEP, 6000),
                            new ResourceChunk(ResourceType.JOB, 12000),
                            new ResourceChunk(ResourceType.WORKER, 12000),
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
                            new ResourceChunk(ResourceType.JOB, 3840),
                            new ResourceChunk(ResourceType.WORKER, 3840)
                    ),
                    new ResourcePack( // 11
                            new ResourceChunk(ResourceType.JOB, 4560),
                            new ResourceChunk(ResourceType.WORKER, 4560)
                    ),
                    new ResourcePack( // 12
                            new ResourceChunk(ResourceType.JOB, 5280),
                            new ResourceChunk(ResourceType.WORKER, 5280)
                    ),
                    new ResourcePack( // 13
                            new ResourceChunk(ResourceType.JOB, 6000),
                            new ResourceChunk(ResourceType.WORKER, 6000)
                    ),
                    new ResourcePack( // 14
                            new ResourceChunk(ResourceType.JOB, 6720),
                            new ResourceChunk(ResourceType.WORKER, 6720)
                    ),
                    new ResourcePack( // 15
                            new ResourceChunk(ResourceType.JOB, 7440),
                            new ResourceChunk(ResourceType.WORKER, 7440)
                    ),
                    new ResourcePack( // 16
                            new ResourceChunk(ResourceType.JOB, 8400),
                            new ResourceChunk(ResourceType.WORKER, 8400)
                    ),
                    new ResourcePack( // 17
                            new ResourceChunk(ResourceType.JOB, 9360),
                            new ResourceChunk(ResourceType.WORKER, 9360)
                    ),
                    new ResourcePack( // 18
                            new ResourceChunk(ResourceType.JOB, 10320),
                            new ResourceChunk(ResourceType.WORKER, 10320)
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
            null), // holdMultiplier
    FACTORY_STEEL("factory_steel",
            Strings.BLD_FACTORY_STEEL,
            Images.BLD_FACTORY_STEEL,
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
            null,  // supplyMultiplier
            null, // demand
            null, // hold
            null), // holdMultiplier
    FACTORY_CONCRETE("factory_concrete",
            Strings.BLD_FACTORY_CONCRETE,
            Images.BLD_FACTORY_CONCRETE,
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
            null,  // supplyMultiplier
            null, // demand
            null, // hold
            null), // holdMultiplier
    FACTORY_BRICK("factory_brick",
            Strings.BLD_FACTORY_BRICK,
            Images.BLD_FACTORY_BRICK,
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
            null,  // supplyMultiplier
            null, // demand
            null, // hold
            null), // holdMultiplier
    FACTORY_WOOD("factory_wood",
            Strings.BLD_FACTORY_WOOD,
            Images.BLD_FACTORY_WOOD,
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
            null,  // supplyMultiplier
            null, // demand
            null, // hold
            null), // holdMultiplier
    FACTORY_GLASS("factory_glass",
            Strings.BLD_FACTORY_GLASS,
            Images.BLD_FACTORY_GLASS,
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
            null,  // supplyMultiplier
            null, // demand
            null, // hold
            null), // holdMultiplier
    OFFICE("office",
            Strings.BLD_OFFICE,
            Images.BLD_OFFICE,
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
            null,  // supplyMultiplier
            null, // demand
            null, // hold
            null), // holdMultiplier
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
            null,  // supplyMultiplier
            null, // demand
            null, // hold
            null), // holdMultiplier
    WAREHOUSE("warehouse",
            Strings.BLD_WAREHOUSE,
            Images.BLD_WAREHOUSE,
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
            null,  // supplyMultiplier
            null, // demand
            null, // hold
            null), // holdMultiplier
    WAREHOUSE_STEEL("warehouse_steel",
            Strings.BLD_WAREHOUSE_STEEL,
            Images.BLD_WAREHOUSE_STEEL,
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
            null,  // supplyMultiplier
            null, // demand
            null, // hold
            null), // holdMultiplier
    WAREHOUSE_CONCRETE("warehouse_concrete",
            Strings.BLD_WAREHOUSE_CONCRETE,
            Images.BLD_WAREHOUSE_CONCRETE,
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
            null,  // supplyMultiplier
            null, // demand
            null, // hold
            null), // holdMultiplier
    WAREHOUSE_BRICK("warehouse_brick",
            Strings.BLD_WAREHOUSE_BRICK,
            Images.BLD_WAREHOUSE_BRICK,
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
            null,  // supplyMultiplier
            null, // demand
            null, // hold
            null), // holdMultiplier
    WAREHOUSE_WOOD("warehouse_wood",
            Strings.BLD_WAREHOUSE_WOOD,
            Images.BLD_WAREHOUSE_WOOD,
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
            null,  // supplyMultiplier
            null, // demand
            null, // hold
            null), // holdMultiplier
    WAREHOUSE_GLASS("warehouse_glass",
            Strings.BLD_WAREHOUSE_GLASS,
            Images.BLD_WAREHOUSE_GLASS,
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
            null,  // supplyMultiplier
            null, // demand
            null, // hold
            null), // holdMultiplier
    MALL("mall",
            Strings.BLD_MALL,
            Images.BLD_MALL,
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
            null,  // supplyMultiplier
            null, // demand
            null, // hold
            null), // holdMultiplier
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
            null,  // supplyMultiplier
            null, // demand
            null, // hold
            null), // holdMultiplier
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
            null,  // supplyMultiplier
            null, // demand
            null, // hold
            null), // holdMultiplier
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
            null,  // supplyMultiplier
            null, // demand
            null, // hold
            null), // holdMultiplier
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
            null,  // supplyMultiplier
            null, // demand
            null, // hold
            null), // holdMultiplier
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
            null,  // supplyMultiplier
            null, // demand
            null, // hold
            null), // holdMultiplier
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
            null,  // supplyMultiplier
            null, // demand
            null, // hold
            null), // holdMultiplier
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
            null,  // supplyMultiplier
            null, // demand
            null, // hold
            null), // holdMultiplier
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
            null,  // supplyMultiplier
            null, // demand
            null, // hold
            null), // holdMultiplier
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
            null,  // supplyMultiplier
            null, // demand
            null, // hold
            null), // holdMultiplier
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
            null,  // supplyMultiplier
            null, // demand
            null, // hold
            null), // holdMultiplier
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
            null,  // supplyMultiplier
            null, // demand
            null, // hold
            null), // holdMultiplier
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
            null,  // supplyMultiplier
            null, // demand
            null, // hold
            null) // holdMultiplier
    ;

    private static final int MAX_REQUIRED_PLAYER_LEVEL = 100;

    private static final int MAX_ALLOWED_BUILDING_LEVEL = 100;

    private static final int MAX_BUILD_LIMIT = 1000;

    private static final int MAX_PRICE_MULTIPLIER = 1000;

    public final String type;

    public final Strings l10nKey;

    public final Images imgKey;

    private int requiredPlayerLevel;

    private int maxLevel;

    private int buildLimit;

    private int priceMultiplier;

    private int[] structure;

    private ResourcePack[] buildCost;

    private ResourcePack[] jobPrice;

    private ResourcePack[] jobReward;

    private ResourcePack[] jobRewardMultiplier;

    private ResourcePack[] production;

    private ResourcePack[] productionMultiplier;

    private ResourcePack[] supply;

    private ResourcePack[] supplyMultiplier;

    private ResourcePack[] demand;

    private ResourcePack[] hold;

    private ResourcePack[] holdMultiplier;

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
                 ResourcePack[] holdMultiplier) {
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
        setHold(hold);
        setHoldMultiplier(holdMultiplier);
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

    public ResourcePack[] getHoldMultiplier() {
        return holdMultiplier;
    }

    public void setHoldMultiplier(ResourcePack[] holdMultiplier) {
        if (holdMultiplier == null) {
            this.holdMultiplier = new ResourcePack[maxLevel];
            return;
        }
        if (holdMultiplier.length != maxLevel) return;
        this.holdMultiplier = holdMultiplier;
    }
}
