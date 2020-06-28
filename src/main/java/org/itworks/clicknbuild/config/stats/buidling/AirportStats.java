package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;
import org.itworks.clicknbuild.engine.model.ResourceType;

public final class AirportStats extends BuildingStats {
    private static final AirportStats INST = new AirportStats();

    private AirportStats() {
    }

    public static AirportStats inst() {
        return INST;
    }

    @Override
    protected void initValues() {
        setRequiredPlayerLevel(1);
        setMaxLevel(20);
        setBuildLimit(1);
        setPriceMultiplier(100);
        setStructure(new int[]{
                1000, // 1
                3000, // 2
                6000, // 3
                10000, // 4
                15000, // 5
                22000, // 6
                31000, // 7
                42000, // 8
                55000, // 9
                70000, // 10
                88000, // 11
                109000, // 12
                133000, // 13
                160000, // 14
                190000, // 15
                224000, // 16
                262000, // 17
                304000, // 18
                350000, // 19
                400000 // 20
        });
        setBuildCost(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.CONSTRUCTION, 1000),
                        new ResourceChunk(ResourceType.STEEL, 92),
                        new ResourceChunk(ResourceType.CONCRETE, 1632),
                        new ResourceChunk(ResourceType.BRICK, 306),
                        new ResourceChunk(ResourceType.WOOD, 51),
                        new ResourceChunk(ResourceType.GLASS, 510),
                        new ResourceChunk(ResourceType.MONEY, 45900)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.CONSTRUCTION, 3000),
                        new ResourceChunk(ResourceType.STEEL, 279),
                        new ResourceChunk(ResourceType.CONCRETE, 4960),
                        new ResourceChunk(ResourceType.BRICK, 930),
                        new ResourceChunk(ResourceType.WOOD, 155),
                        new ResourceChunk(ResourceType.GLASS, 1550),
                        new ResourceChunk(ResourceType.MONEY, 139500)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.CONSTRUCTION, 6000),
                        new ResourceChunk(ResourceType.STEEL, 565),
                        new ResourceChunk(ResourceType.CONCRETE, 10048),
                        new ResourceChunk(ResourceType.BRICK, 1884),
                        new ResourceChunk(ResourceType.WOOD, 314),
                        new ResourceChunk(ResourceType.GLASS, 3140),
                        new ResourceChunk(ResourceType.MONEY, 282600)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.CONSTRUCTION, 10000),
                        new ResourceChunk(ResourceType.STEEL, 954),
                        new ResourceChunk(ResourceType.CONCRETE, 16960),
                        new ResourceChunk(ResourceType.BRICK, 3180),
                        new ResourceChunk(ResourceType.WOOD, 530),
                        new ResourceChunk(ResourceType.GLASS, 5300),
                        new ResourceChunk(ResourceType.MONEY, 477000)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.CONSTRUCTION, 15000),
                        new ResourceChunk(ResourceType.STEEL, 1449),
                        new ResourceChunk(ResourceType.CONCRETE, 25760),
                        new ResourceChunk(ResourceType.BRICK, 4830),
                        new ResourceChunk(ResourceType.WOOD, 805),
                        new ResourceChunk(ResourceType.GLASS, 8050),
                        new ResourceChunk(ResourceType.MONEY, 724500)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.CONSTRUCTION, 22000),
                        new ResourceChunk(ResourceType.STEEL, 2167),
                        new ResourceChunk(ResourceType.CONCRETE, 38528),
                        new ResourceChunk(ResourceType.BRICK, 7224),
                        new ResourceChunk(ResourceType.WOOD, 1204),
                        new ResourceChunk(ResourceType.GLASS, 12040),
                        new ResourceChunk(ResourceType.MONEY, 1083600)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.CONSTRUCTION, 31000),
                        new ResourceChunk(ResourceType.STEEL, 3123),
                        new ResourceChunk(ResourceType.CONCRETE, 55520),
                        new ResourceChunk(ResourceType.BRICK, 10410),
                        new ResourceChunk(ResourceType.WOOD, 1735),
                        new ResourceChunk(ResourceType.GLASS, 17350),
                        new ResourceChunk(ResourceType.MONEY, 1561500)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.CONSTRUCTION, 42000),
                        new ResourceChunk(ResourceType.STEEL, 4331),
                        new ResourceChunk(ResourceType.CONCRETE, 76992),
                        new ResourceChunk(ResourceType.BRICK, 14436),
                        new ResourceChunk(ResourceType.WOOD, 2406),
                        new ResourceChunk(ResourceType.GLASS, 24060),
                        new ResourceChunk(ResourceType.MONEY, 2165400)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.CONSTRUCTION, 55000),
                        new ResourceChunk(ResourceType.STEEL, 5805),
                        new ResourceChunk(ResourceType.CONCRETE, 103200),
                        new ResourceChunk(ResourceType.BRICK, 19350),
                        new ResourceChunk(ResourceType.WOOD, 3225),
                        new ResourceChunk(ResourceType.GLASS, 32250),
                        new ResourceChunk(ResourceType.MONEY, 2902500)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.CONSTRUCTION, 70000),
                        new ResourceChunk(ResourceType.STEEL, 7560),
                        new ResourceChunk(ResourceType.CONCRETE, 134400),
                        new ResourceChunk(ResourceType.BRICK, 25200),
                        new ResourceChunk(ResourceType.WOOD, 4200),
                        new ResourceChunk(ResourceType.GLASS, 42000),
                        new ResourceChunk(ResourceType.MONEY, 3780000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.CONSTRUCTION, 88000),
                        new ResourceChunk(ResourceType.STEEL, 9763),
                        new ResourceChunk(ResourceType.CONCRETE, 173568),
                        new ResourceChunk(ResourceType.BRICK, 32544),
                        new ResourceChunk(ResourceType.WOOD, 5424),
                        new ResourceChunk(ResourceType.GLASS, 54240),
                        new ResourceChunk(ResourceType.MONEY, 4881600)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.CONSTRUCTION, 109000),
                        new ResourceChunk(ResourceType.STEEL, 12447),
                        new ResourceChunk(ResourceType.CONCRETE, 221280),
                        new ResourceChunk(ResourceType.BRICK, 41490),
                        new ResourceChunk(ResourceType.WOOD, 6915),
                        new ResourceChunk(ResourceType.GLASS, 69150),
                        new ResourceChunk(ResourceType.MONEY, 6223500)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.CONSTRUCTION, 133000),
                        new ResourceChunk(ResourceType.STEEL, 15644),
                        new ResourceChunk(ResourceType.CONCRETE, 278112),
                        new ResourceChunk(ResourceType.BRICK, 52146),
                        new ResourceChunk(ResourceType.WOOD, 8691),
                        new ResourceChunk(ResourceType.GLASS, 86910),
                        new ResourceChunk(ResourceType.MONEY, 7821900)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.CONSTRUCTION, 160000),
                        new ResourceChunk(ResourceType.STEEL, 19386),
                        new ResourceChunk(ResourceType.CONCRETE, 344640),
                        new ResourceChunk(ResourceType.BRICK, 64620),
                        new ResourceChunk(ResourceType.WOOD, 10770),
                        new ResourceChunk(ResourceType.GLASS, 107700),
                        new ResourceChunk(ResourceType.MONEY, 9693000)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.CONSTRUCTION, 190000),
                        new ResourceChunk(ResourceType.STEEL, 23706),
                        new ResourceChunk(ResourceType.CONCRETE, 421440),
                        new ResourceChunk(ResourceType.BRICK, 79020),
                        new ResourceChunk(ResourceType.WOOD, 13170),
                        new ResourceChunk(ResourceType.GLASS, 131700),
                        new ResourceChunk(ResourceType.MONEY, 11853000)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.CONSTRUCTION, 224000),
                        new ResourceChunk(ResourceType.STEEL, 28847),
                        new ResourceChunk(ResourceType.CONCRETE, 512832),
                        new ResourceChunk(ResourceType.BRICK, 96156),
                        new ResourceChunk(ResourceType.WOOD, 16026),
                        new ResourceChunk(ResourceType.GLASS, 160260),
                        new ResourceChunk(ResourceType.MONEY, 14423400)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.CONSTRUCTION, 262000),
                        new ResourceChunk(ResourceType.STEEL, 34866),
                        new ResourceChunk(ResourceType.CONCRETE, 619840),
                        new ResourceChunk(ResourceType.BRICK, 116220),
                        new ResourceChunk(ResourceType.WOOD, 19370),
                        new ResourceChunk(ResourceType.GLASS, 193700),
                        new ResourceChunk(ResourceType.MONEY, 17433000)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.CONSTRUCTION, 304000),
                        new ResourceChunk(ResourceType.STEEL, 41821),
                        new ResourceChunk(ResourceType.CONCRETE, 743488),
                        new ResourceChunk(ResourceType.BRICK, 139404),
                        new ResourceChunk(ResourceType.WOOD, 23234),
                        new ResourceChunk(ResourceType.GLASS, 232340),
                        new ResourceChunk(ResourceType.MONEY, 20910600)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.CONSTRUCTION, 350000),
                        new ResourceChunk(ResourceType.STEEL, 49770),
                        new ResourceChunk(ResourceType.CONCRETE, 884800),
                        new ResourceChunk(ResourceType.BRICK, 165900),
                        new ResourceChunk(ResourceType.WOOD, 27650),
                        new ResourceChunk(ResourceType.GLASS, 276500),
                        new ResourceChunk(ResourceType.MONEY, 24885000)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.CONSTRUCTION, 400000),
                        new ResourceChunk(ResourceType.STEEL, 58770),
                        new ResourceChunk(ResourceType.CONCRETE, 1044800),
                        new ResourceChunk(ResourceType.BRICK, 195900),
                        new ResourceChunk(ResourceType.WOOD, 32650),
                        new ResourceChunk(ResourceType.GLASS, 326500),
                        new ResourceChunk(ResourceType.MONEY, 29385000)
                )
        });
        setProductionMultiplier(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.CITIZEN, 2)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.CITIZEN, 4)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.CITIZEN, 6)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.CITIZEN, 8)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.CITIZEN, 10)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.CITIZEN, 14)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.CITIZEN, 18)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.CITIZEN, 22)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.CITIZEN, 26)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.CITIZEN, 30)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.CITIZEN, 36)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.CITIZEN, 42)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.CITIZEN, 48)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.CITIZEN, 54)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.CITIZEN, 60)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.CITIZEN, 68)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.CITIZEN, 76)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.CITIZEN, 84)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.CITIZEN, 92)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.CITIZEN, 100)
                )
        });
        setJobRewardMultiplier(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.CITIZEN, 2)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.CITIZEN, 4)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.CITIZEN, 6)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.CITIZEN, 8)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.CITIZEN, 10)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.CITIZEN, 14)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.CITIZEN, 18)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.CITIZEN, 22)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.CITIZEN, 26)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.CITIZEN, 30)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.CITIZEN, 36)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.CITIZEN, 42)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.CITIZEN, 48)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.CITIZEN, 54)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.CITIZEN, 60)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.CITIZEN, 68)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.CITIZEN, 76)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.CITIZEN, 84)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.CITIZEN, 92)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.CITIZEN, 100)
                )
        });
        setDemand(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.UPKEEP, 300),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 4),
                        new ResourceChunk(ResourceType.JOB, 80),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.UPKEEP, 600),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 8),
                        new ResourceChunk(ResourceType.JOB, 160),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.UPKEEP, 900),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 12),
                        new ResourceChunk(ResourceType.JOB, 240),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.UPKEEP, 1200),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 16),
                        new ResourceChunk(ResourceType.JOB, 320),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.UPKEEP, 1500),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 20),
                        new ResourceChunk(ResourceType.JOB, 400),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.UPKEEP, 2100),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 28),
                        new ResourceChunk(ResourceType.JOB, 560),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.UPKEEP, 2700),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 36),
                        new ResourceChunk(ResourceType.JOB, 720),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.UPKEEP, 3300),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 44),
                        new ResourceChunk(ResourceType.JOB, 880),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.UPKEEP, 3900),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 52),
                        new ResourceChunk(ResourceType.JOB, 1040),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.UPKEEP, 4500),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 60),
                        new ResourceChunk(ResourceType.JOB, 1200),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.UPKEEP, 5400),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 72),
                        new ResourceChunk(ResourceType.JOB, 1440),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.UPKEEP, 6300),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 84),
                        new ResourceChunk(ResourceType.JOB, 1680),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.UPKEEP, 7200),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 96),
                        new ResourceChunk(ResourceType.JOB, 1920),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.UPKEEP, 8100),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 108),
                        new ResourceChunk(ResourceType.JOB, 2160),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.UPKEEP, 9000),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 120),
                        new ResourceChunk(ResourceType.JOB, 2400),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.UPKEEP, 10200),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 136),
                        new ResourceChunk(ResourceType.JOB, 2720),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.UPKEEP, 11400),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 152),
                        new ResourceChunk(ResourceType.JOB, 3040),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.UPKEEP, 12600),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 168),
                        new ResourceChunk(ResourceType.JOB, 3360),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.UPKEEP, 13800),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 184),
                        new ResourceChunk(ResourceType.JOB, 3680),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.UPKEEP, 15000),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 200),
                        new ResourceChunk(ResourceType.JOB, 4000),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                )
        });
        setHold(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.POWER, 4),
                        new ResourceChunk(ResourceType.WORKER, 80)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.POWER, 8),
                        new ResourceChunk(ResourceType.WORKER, 160)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.POWER, 12),
                        new ResourceChunk(ResourceType.WORKER, 240)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.POWER, 16),
                        new ResourceChunk(ResourceType.WORKER, 320)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.POWER, 20),
                        new ResourceChunk(ResourceType.WORKER, 400)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.POWER, 28),
                        new ResourceChunk(ResourceType.WORKER, 560)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.POWER, 36),
                        new ResourceChunk(ResourceType.WORKER, 720)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.POWER, 44),
                        new ResourceChunk(ResourceType.WORKER, 880)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.POWER, 52),
                        new ResourceChunk(ResourceType.WORKER, 1040)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.POWER, 60),
                        new ResourceChunk(ResourceType.WORKER, 1200)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.POWER, 72),
                        new ResourceChunk(ResourceType.WORKER, 1440)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.POWER, 84),
                        new ResourceChunk(ResourceType.WORKER, 1680)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.POWER, 96),
                        new ResourceChunk(ResourceType.WORKER, 1920)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.POWER, 108),
                        new ResourceChunk(ResourceType.WORKER, 2160)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.POWER, 120),
                        new ResourceChunk(ResourceType.WORKER, 2400)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.POWER, 136),
                        new ResourceChunk(ResourceType.WORKER, 2720)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.POWER, 152),
                        new ResourceChunk(ResourceType.WORKER, 3040)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.POWER, 168),
                        new ResourceChunk(ResourceType.WORKER, 3360)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.POWER, 184),
                        new ResourceChunk(ResourceType.WORKER, 3680)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.POWER, 200),
                        new ResourceChunk(ResourceType.WORKER, 4000)
                )
        });
    }
}
