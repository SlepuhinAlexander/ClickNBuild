package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;
import org.itworks.clicknbuild.engine.model.ResType;

public final class AirportStats extends BuildingStats {
    private static volatile AirportStats inst;

    private AirportStats() {
    }

    public static AirportStats inst() {
        AirportStats local = inst;
        if (local == null) {
            synchronized (AirportStats.class) {
                local = inst;
                if (local == null) {
                    inst = local = new AirportStats();
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
                        new ResourceChunk(ResType.CONSTRUCTION, 1000),
                        new ResourceChunk(ResType.STEEL, 92),
                        new ResourceChunk(ResType.CONCRETE, 1632),
                        new ResourceChunk(ResType.BRICK, 306),
                        new ResourceChunk(ResType.WOOD, 51),
                        new ResourceChunk(ResType.GLASS, 510),
                        new ResourceChunk(ResType.MONEY, 45900)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.CONSTRUCTION, 3000),
                        new ResourceChunk(ResType.STEEL, 279),
                        new ResourceChunk(ResType.CONCRETE, 4960),
                        new ResourceChunk(ResType.BRICK, 930),
                        new ResourceChunk(ResType.WOOD, 155),
                        new ResourceChunk(ResType.GLASS, 1550),
                        new ResourceChunk(ResType.MONEY, 139500)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.CONSTRUCTION, 6000),
                        new ResourceChunk(ResType.STEEL, 565),
                        new ResourceChunk(ResType.CONCRETE, 10048),
                        new ResourceChunk(ResType.BRICK, 1884),
                        new ResourceChunk(ResType.WOOD, 314),
                        new ResourceChunk(ResType.GLASS, 3140),
                        new ResourceChunk(ResType.MONEY, 282600)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.CONSTRUCTION, 10000),
                        new ResourceChunk(ResType.STEEL, 954),
                        new ResourceChunk(ResType.CONCRETE, 16960),
                        new ResourceChunk(ResType.BRICK, 3180),
                        new ResourceChunk(ResType.WOOD, 530),
                        new ResourceChunk(ResType.GLASS, 5300),
                        new ResourceChunk(ResType.MONEY, 477000)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.CONSTRUCTION, 15000),
                        new ResourceChunk(ResType.STEEL, 1449),
                        new ResourceChunk(ResType.CONCRETE, 25760),
                        new ResourceChunk(ResType.BRICK, 4830),
                        new ResourceChunk(ResType.WOOD, 805),
                        new ResourceChunk(ResType.GLASS, 8050),
                        new ResourceChunk(ResType.MONEY, 724500)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.CONSTRUCTION, 22000),
                        new ResourceChunk(ResType.STEEL, 2167),
                        new ResourceChunk(ResType.CONCRETE, 38528),
                        new ResourceChunk(ResType.BRICK, 7224),
                        new ResourceChunk(ResType.WOOD, 1204),
                        new ResourceChunk(ResType.GLASS, 12040),
                        new ResourceChunk(ResType.MONEY, 1083600)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.CONSTRUCTION, 31000),
                        new ResourceChunk(ResType.STEEL, 3123),
                        new ResourceChunk(ResType.CONCRETE, 55520),
                        new ResourceChunk(ResType.BRICK, 10410),
                        new ResourceChunk(ResType.WOOD, 1735),
                        new ResourceChunk(ResType.GLASS, 17350),
                        new ResourceChunk(ResType.MONEY, 1561500)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.CONSTRUCTION, 42000),
                        new ResourceChunk(ResType.STEEL, 4331),
                        new ResourceChunk(ResType.CONCRETE, 76992),
                        new ResourceChunk(ResType.BRICK, 14436),
                        new ResourceChunk(ResType.WOOD, 2406),
                        new ResourceChunk(ResType.GLASS, 24060),
                        new ResourceChunk(ResType.MONEY, 2165400)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.CONSTRUCTION, 55000),
                        new ResourceChunk(ResType.STEEL, 5805),
                        new ResourceChunk(ResType.CONCRETE, 103200),
                        new ResourceChunk(ResType.BRICK, 19350),
                        new ResourceChunk(ResType.WOOD, 3225),
                        new ResourceChunk(ResType.GLASS, 32250),
                        new ResourceChunk(ResType.MONEY, 2902500)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.CONSTRUCTION, 70000),
                        new ResourceChunk(ResType.STEEL, 7560),
                        new ResourceChunk(ResType.CONCRETE, 134400),
                        new ResourceChunk(ResType.BRICK, 25200),
                        new ResourceChunk(ResType.WOOD, 4200),
                        new ResourceChunk(ResType.GLASS, 42000),
                        new ResourceChunk(ResType.MONEY, 3780000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.CONSTRUCTION, 88000),
                        new ResourceChunk(ResType.STEEL, 9763),
                        new ResourceChunk(ResType.CONCRETE, 173568),
                        new ResourceChunk(ResType.BRICK, 32544),
                        new ResourceChunk(ResType.WOOD, 5424),
                        new ResourceChunk(ResType.GLASS, 54240),
                        new ResourceChunk(ResType.MONEY, 4881600)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.CONSTRUCTION, 109000),
                        new ResourceChunk(ResType.STEEL, 12447),
                        new ResourceChunk(ResType.CONCRETE, 221280),
                        new ResourceChunk(ResType.BRICK, 41490),
                        new ResourceChunk(ResType.WOOD, 6915),
                        new ResourceChunk(ResType.GLASS, 69150),
                        new ResourceChunk(ResType.MONEY, 6223500)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.CONSTRUCTION, 133000),
                        new ResourceChunk(ResType.STEEL, 15644),
                        new ResourceChunk(ResType.CONCRETE, 278112),
                        new ResourceChunk(ResType.BRICK, 52146),
                        new ResourceChunk(ResType.WOOD, 8691),
                        new ResourceChunk(ResType.GLASS, 86910),
                        new ResourceChunk(ResType.MONEY, 7821900)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.CONSTRUCTION, 160000),
                        new ResourceChunk(ResType.STEEL, 19386),
                        new ResourceChunk(ResType.CONCRETE, 344640),
                        new ResourceChunk(ResType.BRICK, 64620),
                        new ResourceChunk(ResType.WOOD, 10770),
                        new ResourceChunk(ResType.GLASS, 107700),
                        new ResourceChunk(ResType.MONEY, 9693000)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.CONSTRUCTION, 190000),
                        new ResourceChunk(ResType.STEEL, 23706),
                        new ResourceChunk(ResType.CONCRETE, 421440),
                        new ResourceChunk(ResType.BRICK, 79020),
                        new ResourceChunk(ResType.WOOD, 13170),
                        new ResourceChunk(ResType.GLASS, 131700),
                        new ResourceChunk(ResType.MONEY, 11853000)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.CONSTRUCTION, 224000),
                        new ResourceChunk(ResType.STEEL, 28847),
                        new ResourceChunk(ResType.CONCRETE, 512832),
                        new ResourceChunk(ResType.BRICK, 96156),
                        new ResourceChunk(ResType.WOOD, 16026),
                        new ResourceChunk(ResType.GLASS, 160260),
                        new ResourceChunk(ResType.MONEY, 14423400)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.CONSTRUCTION, 262000),
                        new ResourceChunk(ResType.STEEL, 34866),
                        new ResourceChunk(ResType.CONCRETE, 619840),
                        new ResourceChunk(ResType.BRICK, 116220),
                        new ResourceChunk(ResType.WOOD, 19370),
                        new ResourceChunk(ResType.GLASS, 193700),
                        new ResourceChunk(ResType.MONEY, 17433000)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.CONSTRUCTION, 304000),
                        new ResourceChunk(ResType.STEEL, 41821),
                        new ResourceChunk(ResType.CONCRETE, 743488),
                        new ResourceChunk(ResType.BRICK, 139404),
                        new ResourceChunk(ResType.WOOD, 23234),
                        new ResourceChunk(ResType.GLASS, 232340),
                        new ResourceChunk(ResType.MONEY, 20910600)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.CONSTRUCTION, 350000),
                        new ResourceChunk(ResType.STEEL, 49770),
                        new ResourceChunk(ResType.CONCRETE, 884800),
                        new ResourceChunk(ResType.BRICK, 165900),
                        new ResourceChunk(ResType.WOOD, 27650),
                        new ResourceChunk(ResType.GLASS, 276500),
                        new ResourceChunk(ResType.MONEY, 24885000)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.CONSTRUCTION, 400000),
                        new ResourceChunk(ResType.STEEL, 58770),
                        new ResourceChunk(ResType.CONCRETE, 1044800),
                        new ResourceChunk(ResType.BRICK, 195900),
                        new ResourceChunk(ResType.WOOD, 32650),
                        new ResourceChunk(ResType.GLASS, 326500),
                        new ResourceChunk(ResType.MONEY, 29385000)
                )
        });
        setProductionMultiplier(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.CITIZEN, 2)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.CITIZEN, 4)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.CITIZEN, 6)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.CITIZEN, 8)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.CITIZEN, 10)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.CITIZEN, 14)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.CITIZEN, 18)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.CITIZEN, 22)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.CITIZEN, 26)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.CITIZEN, 30)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.CITIZEN, 36)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.CITIZEN, 42)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.CITIZEN, 48)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.CITIZEN, 54)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.CITIZEN, 60)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.CITIZEN, 68)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.CITIZEN, 76)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.CITIZEN, 84)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.CITIZEN, 92)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.CITIZEN, 100)
                )
        });
        setJobRewardMultiplier(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.CITIZEN, 2)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.CITIZEN, 4)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.CITIZEN, 6)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.CITIZEN, 8)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.CITIZEN, 10)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.CITIZEN, 14)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.CITIZEN, 18)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.CITIZEN, 22)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.CITIZEN, 26)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.CITIZEN, 30)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.CITIZEN, 36)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.CITIZEN, 42)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.CITIZEN, 48)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.CITIZEN, 54)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.CITIZEN, 60)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.CITIZEN, 68)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.CITIZEN, 76)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.CITIZEN, 84)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.CITIZEN, 92)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.CITIZEN, 100)
                )
        });
        setDemand(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.UPKEEP, 300),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 4),
                        new ResourceChunk(ResType.JOB, 80),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.UPKEEP, 600),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 8),
                        new ResourceChunk(ResType.JOB, 160),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.UPKEEP, 900),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 12),
                        new ResourceChunk(ResType.JOB, 240),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.UPKEEP, 1200),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 16),
                        new ResourceChunk(ResType.JOB, 320),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.UPKEEP, 1500),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 20),
                        new ResourceChunk(ResType.JOB, 400),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.UPKEEP, 2100),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 28),
                        new ResourceChunk(ResType.JOB, 560),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.UPKEEP, 2700),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 36),
                        new ResourceChunk(ResType.JOB, 720),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.UPKEEP, 3300),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 44),
                        new ResourceChunk(ResType.JOB, 880),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.UPKEEP, 3900),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 52),
                        new ResourceChunk(ResType.JOB, 1040),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.UPKEEP, 4500),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 60),
                        new ResourceChunk(ResType.JOB, 1200),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.UPKEEP, 5400),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 72),
                        new ResourceChunk(ResType.JOB, 1440),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.UPKEEP, 6300),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 84),
                        new ResourceChunk(ResType.JOB, 1680),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.UPKEEP, 7200),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 96),
                        new ResourceChunk(ResType.JOB, 1920),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.UPKEEP, 8100),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 108),
                        new ResourceChunk(ResType.JOB, 2160),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.UPKEEP, 9000),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 120),
                        new ResourceChunk(ResType.JOB, 2400),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.UPKEEP, 10200),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 136),
                        new ResourceChunk(ResType.JOB, 2720),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.UPKEEP, 11400),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 152),
                        new ResourceChunk(ResType.JOB, 3040),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.UPKEEP, 12600),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 168),
                        new ResourceChunk(ResType.JOB, 3360),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.UPKEEP, 13800),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 184),
                        new ResourceChunk(ResType.JOB, 3680),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.UPKEEP, 15000),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 200),
                        new ResourceChunk(ResType.JOB, 4000),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                )
        });
        setHold(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.POWER, 4),
                        new ResourceChunk(ResType.WORKER, 80)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.POWER, 8),
                        new ResourceChunk(ResType.WORKER, 160)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.POWER, 12),
                        new ResourceChunk(ResType.WORKER, 240)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.POWER, 16),
                        new ResourceChunk(ResType.WORKER, 320)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.POWER, 20),
                        new ResourceChunk(ResType.WORKER, 400)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.POWER, 28),
                        new ResourceChunk(ResType.WORKER, 560)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.POWER, 36),
                        new ResourceChunk(ResType.WORKER, 720)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.POWER, 44),
                        new ResourceChunk(ResType.WORKER, 880)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.POWER, 52),
                        new ResourceChunk(ResType.WORKER, 1040)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.POWER, 60),
                        new ResourceChunk(ResType.WORKER, 1200)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.POWER, 72),
                        new ResourceChunk(ResType.WORKER, 1440)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.POWER, 84),
                        new ResourceChunk(ResType.WORKER, 1680)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.POWER, 96),
                        new ResourceChunk(ResType.WORKER, 1920)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.POWER, 108),
                        new ResourceChunk(ResType.WORKER, 2160)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.POWER, 120),
                        new ResourceChunk(ResType.WORKER, 2400)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.POWER, 136),
                        new ResourceChunk(ResType.WORKER, 2720)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.POWER, 152),
                        new ResourceChunk(ResType.WORKER, 3040)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.POWER, 168),
                        new ResourceChunk(ResType.WORKER, 3360)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.POWER, 184),
                        new ResourceChunk(ResType.WORKER, 3680)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.POWER, 200),
                        new ResourceChunk(ResType.WORKER, 4000)
                )
        });
    }
}
