package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResChunk;
import org.itworks.clicknbuild.engine.model.ResPack;
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
        setBuildCost(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.CONSTRUCTION, 1000),
                        new ResChunk(ResType.STEEL, 92),
                        new ResChunk(ResType.CONCRETE, 1632),
                        new ResChunk(ResType.BRICK, 306),
                        new ResChunk(ResType.WOOD, 51),
                        new ResChunk(ResType.GLASS, 510),
                        new ResChunk(ResType.MONEY, 45900)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.CONSTRUCTION, 3000),
                        new ResChunk(ResType.STEEL, 279),
                        new ResChunk(ResType.CONCRETE, 4960),
                        new ResChunk(ResType.BRICK, 930),
                        new ResChunk(ResType.WOOD, 155),
                        new ResChunk(ResType.GLASS, 1550),
                        new ResChunk(ResType.MONEY, 139500)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.CONSTRUCTION, 6000),
                        new ResChunk(ResType.STEEL, 565),
                        new ResChunk(ResType.CONCRETE, 10048),
                        new ResChunk(ResType.BRICK, 1884),
                        new ResChunk(ResType.WOOD, 314),
                        new ResChunk(ResType.GLASS, 3140),
                        new ResChunk(ResType.MONEY, 282600)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.CONSTRUCTION, 10000),
                        new ResChunk(ResType.STEEL, 954),
                        new ResChunk(ResType.CONCRETE, 16960),
                        new ResChunk(ResType.BRICK, 3180),
                        new ResChunk(ResType.WOOD, 530),
                        new ResChunk(ResType.GLASS, 5300),
                        new ResChunk(ResType.MONEY, 477000)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.CONSTRUCTION, 15000),
                        new ResChunk(ResType.STEEL, 1449),
                        new ResChunk(ResType.CONCRETE, 25760),
                        new ResChunk(ResType.BRICK, 4830),
                        new ResChunk(ResType.WOOD, 805),
                        new ResChunk(ResType.GLASS, 8050),
                        new ResChunk(ResType.MONEY, 724500)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.CONSTRUCTION, 22000),
                        new ResChunk(ResType.STEEL, 2167),
                        new ResChunk(ResType.CONCRETE, 38528),
                        new ResChunk(ResType.BRICK, 7224),
                        new ResChunk(ResType.WOOD, 1204),
                        new ResChunk(ResType.GLASS, 12040),
                        new ResChunk(ResType.MONEY, 1083600)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.CONSTRUCTION, 31000),
                        new ResChunk(ResType.STEEL, 3123),
                        new ResChunk(ResType.CONCRETE, 55520),
                        new ResChunk(ResType.BRICK, 10410),
                        new ResChunk(ResType.WOOD, 1735),
                        new ResChunk(ResType.GLASS, 17350),
                        new ResChunk(ResType.MONEY, 1561500)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.CONSTRUCTION, 42000),
                        new ResChunk(ResType.STEEL, 4331),
                        new ResChunk(ResType.CONCRETE, 76992),
                        new ResChunk(ResType.BRICK, 14436),
                        new ResChunk(ResType.WOOD, 2406),
                        new ResChunk(ResType.GLASS, 24060),
                        new ResChunk(ResType.MONEY, 2165400)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.CONSTRUCTION, 55000),
                        new ResChunk(ResType.STEEL, 5805),
                        new ResChunk(ResType.CONCRETE, 103200),
                        new ResChunk(ResType.BRICK, 19350),
                        new ResChunk(ResType.WOOD, 3225),
                        new ResChunk(ResType.GLASS, 32250),
                        new ResChunk(ResType.MONEY, 2902500)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.CONSTRUCTION, 70000),
                        new ResChunk(ResType.STEEL, 7560),
                        new ResChunk(ResType.CONCRETE, 134400),
                        new ResChunk(ResType.BRICK, 25200),
                        new ResChunk(ResType.WOOD, 4200),
                        new ResChunk(ResType.GLASS, 42000),
                        new ResChunk(ResType.MONEY, 3780000)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.CONSTRUCTION, 88000),
                        new ResChunk(ResType.STEEL, 9763),
                        new ResChunk(ResType.CONCRETE, 173568),
                        new ResChunk(ResType.BRICK, 32544),
                        new ResChunk(ResType.WOOD, 5424),
                        new ResChunk(ResType.GLASS, 54240),
                        new ResChunk(ResType.MONEY, 4881600)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.CONSTRUCTION, 109000),
                        new ResChunk(ResType.STEEL, 12447),
                        new ResChunk(ResType.CONCRETE, 221280),
                        new ResChunk(ResType.BRICK, 41490),
                        new ResChunk(ResType.WOOD, 6915),
                        new ResChunk(ResType.GLASS, 69150),
                        new ResChunk(ResType.MONEY, 6223500)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.CONSTRUCTION, 133000),
                        new ResChunk(ResType.STEEL, 15644),
                        new ResChunk(ResType.CONCRETE, 278112),
                        new ResChunk(ResType.BRICK, 52146),
                        new ResChunk(ResType.WOOD, 8691),
                        new ResChunk(ResType.GLASS, 86910),
                        new ResChunk(ResType.MONEY, 7821900)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.CONSTRUCTION, 160000),
                        new ResChunk(ResType.STEEL, 19386),
                        new ResChunk(ResType.CONCRETE, 344640),
                        new ResChunk(ResType.BRICK, 64620),
                        new ResChunk(ResType.WOOD, 10770),
                        new ResChunk(ResType.GLASS, 107700),
                        new ResChunk(ResType.MONEY, 9693000)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.CONSTRUCTION, 190000),
                        new ResChunk(ResType.STEEL, 23706),
                        new ResChunk(ResType.CONCRETE, 421440),
                        new ResChunk(ResType.BRICK, 79020),
                        new ResChunk(ResType.WOOD, 13170),
                        new ResChunk(ResType.GLASS, 131700),
                        new ResChunk(ResType.MONEY, 11853000)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.CONSTRUCTION, 224000),
                        new ResChunk(ResType.STEEL, 28847),
                        new ResChunk(ResType.CONCRETE, 512832),
                        new ResChunk(ResType.BRICK, 96156),
                        new ResChunk(ResType.WOOD, 16026),
                        new ResChunk(ResType.GLASS, 160260),
                        new ResChunk(ResType.MONEY, 14423400)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.CONSTRUCTION, 262000),
                        new ResChunk(ResType.STEEL, 34866),
                        new ResChunk(ResType.CONCRETE, 619840),
                        new ResChunk(ResType.BRICK, 116220),
                        new ResChunk(ResType.WOOD, 19370),
                        new ResChunk(ResType.GLASS, 193700),
                        new ResChunk(ResType.MONEY, 17433000)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.CONSTRUCTION, 304000),
                        new ResChunk(ResType.STEEL, 41821),
                        new ResChunk(ResType.CONCRETE, 743488),
                        new ResChunk(ResType.BRICK, 139404),
                        new ResChunk(ResType.WOOD, 23234),
                        new ResChunk(ResType.GLASS, 232340),
                        new ResChunk(ResType.MONEY, 20910600)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.CONSTRUCTION, 350000),
                        new ResChunk(ResType.STEEL, 49770),
                        new ResChunk(ResType.CONCRETE, 884800),
                        new ResChunk(ResType.BRICK, 165900),
                        new ResChunk(ResType.WOOD, 27650),
                        new ResChunk(ResType.GLASS, 276500),
                        new ResChunk(ResType.MONEY, 24885000)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.CONSTRUCTION, 400000),
                        new ResChunk(ResType.STEEL, 58770),
                        new ResChunk(ResType.CONCRETE, 1044800),
                        new ResChunk(ResType.BRICK, 195900),
                        new ResChunk(ResType.WOOD, 32650),
                        new ResChunk(ResType.GLASS, 326500),
                        new ResChunk(ResType.MONEY, 29385000)
                )
        });
        setProductionMultiplier(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.CITIZEN, 2)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.CITIZEN, 4)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.CITIZEN, 6)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.CITIZEN, 8)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.CITIZEN, 10)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.CITIZEN, 14)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.CITIZEN, 18)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.CITIZEN, 22)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.CITIZEN, 26)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.CITIZEN, 30)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.CITIZEN, 36)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.CITIZEN, 42)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.CITIZEN, 48)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.CITIZEN, 54)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.CITIZEN, 60)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.CITIZEN, 68)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.CITIZEN, 76)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.CITIZEN, 84)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.CITIZEN, 92)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.CITIZEN, 100)
                )
        });
        setJobRewardMultiplier(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.CITIZEN, 2)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.CITIZEN, 4)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.CITIZEN, 6)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.CITIZEN, 8)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.CITIZEN, 10)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.CITIZEN, 14)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.CITIZEN, 18)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.CITIZEN, 22)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.CITIZEN, 26)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.CITIZEN, 30)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.CITIZEN, 36)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.CITIZEN, 42)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.CITIZEN, 48)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.CITIZEN, 54)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.CITIZEN, 60)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.CITIZEN, 68)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.CITIZEN, 76)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.CITIZEN, 84)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.CITIZEN, 92)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.CITIZEN, 100)
                )
        });
        setDemand(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.UPKEEP, 300),
                        new ResChunk(ResType.POWER_CONSUMPTION, 4),
                        new ResChunk(ResType.JOB, 80),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.UPKEEP, 600),
                        new ResChunk(ResType.POWER_CONSUMPTION, 8),
                        new ResChunk(ResType.JOB, 160),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.UPKEEP, 900),
                        new ResChunk(ResType.POWER_CONSUMPTION, 12),
                        new ResChunk(ResType.JOB, 240),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.UPKEEP, 1200),
                        new ResChunk(ResType.POWER_CONSUMPTION, 16),
                        new ResChunk(ResType.JOB, 320),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.UPKEEP, 1500),
                        new ResChunk(ResType.POWER_CONSUMPTION, 20),
                        new ResChunk(ResType.JOB, 400),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.UPKEEP, 2100),
                        new ResChunk(ResType.POWER_CONSUMPTION, 28),
                        new ResChunk(ResType.JOB, 560),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.UPKEEP, 2700),
                        new ResChunk(ResType.POWER_CONSUMPTION, 36),
                        new ResChunk(ResType.JOB, 720),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.UPKEEP, 3300),
                        new ResChunk(ResType.POWER_CONSUMPTION, 44),
                        new ResChunk(ResType.JOB, 880),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.UPKEEP, 3900),
                        new ResChunk(ResType.POWER_CONSUMPTION, 52),
                        new ResChunk(ResType.JOB, 1040),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.UPKEEP, 4500),
                        new ResChunk(ResType.POWER_CONSUMPTION, 60),
                        new ResChunk(ResType.JOB, 1200),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.UPKEEP, 5400),
                        new ResChunk(ResType.POWER_CONSUMPTION, 72),
                        new ResChunk(ResType.JOB, 1440),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.UPKEEP, 6300),
                        new ResChunk(ResType.POWER_CONSUMPTION, 84),
                        new ResChunk(ResType.JOB, 1680),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.UPKEEP, 7200),
                        new ResChunk(ResType.POWER_CONSUMPTION, 96),
                        new ResChunk(ResType.JOB, 1920),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.UPKEEP, 8100),
                        new ResChunk(ResType.POWER_CONSUMPTION, 108),
                        new ResChunk(ResType.JOB, 2160),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.UPKEEP, 9000),
                        new ResChunk(ResType.POWER_CONSUMPTION, 120),
                        new ResChunk(ResType.JOB, 2400),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.UPKEEP, 10200),
                        new ResChunk(ResType.POWER_CONSUMPTION, 136),
                        new ResChunk(ResType.JOB, 2720),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.UPKEEP, 11400),
                        new ResChunk(ResType.POWER_CONSUMPTION, 152),
                        new ResChunk(ResType.JOB, 3040),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.UPKEEP, 12600),
                        new ResChunk(ResType.POWER_CONSUMPTION, 168),
                        new ResChunk(ResType.JOB, 3360),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.UPKEEP, 13800),
                        new ResChunk(ResType.POWER_CONSUMPTION, 184),
                        new ResChunk(ResType.JOB, 3680),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.UPKEEP, 15000),
                        new ResChunk(ResType.POWER_CONSUMPTION, 200),
                        new ResChunk(ResType.JOB, 4000),
                        new ResChunk(ResType.IGNITABILITY, 1)
                )
        });
        setHold(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.POWER, 4),
                        new ResChunk(ResType.WORKER, 80)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.POWER, 8),
                        new ResChunk(ResType.WORKER, 160)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.POWER, 12),
                        new ResChunk(ResType.WORKER, 240)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.POWER, 16),
                        new ResChunk(ResType.WORKER, 320)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.POWER, 20),
                        new ResChunk(ResType.WORKER, 400)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.POWER, 28),
                        new ResChunk(ResType.WORKER, 560)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.POWER, 36),
                        new ResChunk(ResType.WORKER, 720)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.POWER, 44),
                        new ResChunk(ResType.WORKER, 880)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.POWER, 52),
                        new ResChunk(ResType.WORKER, 1040)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.POWER, 60),
                        new ResChunk(ResType.WORKER, 1200)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.POWER, 72),
                        new ResChunk(ResType.WORKER, 1440)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.POWER, 84),
                        new ResChunk(ResType.WORKER, 1680)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.POWER, 96),
                        new ResChunk(ResType.WORKER, 1920)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.POWER, 108),
                        new ResChunk(ResType.WORKER, 2160)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.POWER, 120),
                        new ResChunk(ResType.WORKER, 2400)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.POWER, 136),
                        new ResChunk(ResType.WORKER, 2720)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.POWER, 152),
                        new ResChunk(ResType.WORKER, 3040)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.POWER, 168),
                        new ResChunk(ResType.WORKER, 3360)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.POWER, 184),
                        new ResChunk(ResType.WORKER, 3680)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.POWER, 200),
                        new ResChunk(ResType.WORKER, 4000)
                )
        });
    }
}
