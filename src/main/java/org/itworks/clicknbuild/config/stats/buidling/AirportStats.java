package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResStat;
import org.itworks.clicknbuild.engine.model.ResStatPack;
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
        setBuildCost(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.CONSTRUCTION, 1000),
                        new ResStat(ResType.STEEL, 92),
                        new ResStat(ResType.CONCRETE, 1632),
                        new ResStat(ResType.BRICK, 306),
                        new ResStat(ResType.WOOD, 51),
                        new ResStat(ResType.GLASS, 510),
                        new ResStat(ResType.MONEY, 45900)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.CONSTRUCTION, 3000),
                        new ResStat(ResType.STEEL, 279),
                        new ResStat(ResType.CONCRETE, 4960),
                        new ResStat(ResType.BRICK, 930),
                        new ResStat(ResType.WOOD, 155),
                        new ResStat(ResType.GLASS, 1550),
                        new ResStat(ResType.MONEY, 139500)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.CONSTRUCTION, 6000),
                        new ResStat(ResType.STEEL, 565),
                        new ResStat(ResType.CONCRETE, 10048),
                        new ResStat(ResType.BRICK, 1884),
                        new ResStat(ResType.WOOD, 314),
                        new ResStat(ResType.GLASS, 3140),
                        new ResStat(ResType.MONEY, 282600)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.CONSTRUCTION, 10000),
                        new ResStat(ResType.STEEL, 954),
                        new ResStat(ResType.CONCRETE, 16960),
                        new ResStat(ResType.BRICK, 3180),
                        new ResStat(ResType.WOOD, 530),
                        new ResStat(ResType.GLASS, 5300),
                        new ResStat(ResType.MONEY, 477000)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.CONSTRUCTION, 15000),
                        new ResStat(ResType.STEEL, 1449),
                        new ResStat(ResType.CONCRETE, 25760),
                        new ResStat(ResType.BRICK, 4830),
                        new ResStat(ResType.WOOD, 805),
                        new ResStat(ResType.GLASS, 8050),
                        new ResStat(ResType.MONEY, 724500)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.CONSTRUCTION, 22000),
                        new ResStat(ResType.STEEL, 2167),
                        new ResStat(ResType.CONCRETE, 38528),
                        new ResStat(ResType.BRICK, 7224),
                        new ResStat(ResType.WOOD, 1204),
                        new ResStat(ResType.GLASS, 12040),
                        new ResStat(ResType.MONEY, 1083600)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.CONSTRUCTION, 31000),
                        new ResStat(ResType.STEEL, 3123),
                        new ResStat(ResType.CONCRETE, 55520),
                        new ResStat(ResType.BRICK, 10410),
                        new ResStat(ResType.WOOD, 1735),
                        new ResStat(ResType.GLASS, 17350),
                        new ResStat(ResType.MONEY, 1561500)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.CONSTRUCTION, 42000),
                        new ResStat(ResType.STEEL, 4331),
                        new ResStat(ResType.CONCRETE, 76992),
                        new ResStat(ResType.BRICK, 14436),
                        new ResStat(ResType.WOOD, 2406),
                        new ResStat(ResType.GLASS, 24060),
                        new ResStat(ResType.MONEY, 2165400)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.CONSTRUCTION, 55000),
                        new ResStat(ResType.STEEL, 5805),
                        new ResStat(ResType.CONCRETE, 103200),
                        new ResStat(ResType.BRICK, 19350),
                        new ResStat(ResType.WOOD, 3225),
                        new ResStat(ResType.GLASS, 32250),
                        new ResStat(ResType.MONEY, 2902500)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.CONSTRUCTION, 70000),
                        new ResStat(ResType.STEEL, 7560),
                        new ResStat(ResType.CONCRETE, 134400),
                        new ResStat(ResType.BRICK, 25200),
                        new ResStat(ResType.WOOD, 4200),
                        new ResStat(ResType.GLASS, 42000),
                        new ResStat(ResType.MONEY, 3780000)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.CONSTRUCTION, 88000),
                        new ResStat(ResType.STEEL, 9763),
                        new ResStat(ResType.CONCRETE, 173568),
                        new ResStat(ResType.BRICK, 32544),
                        new ResStat(ResType.WOOD, 5424),
                        new ResStat(ResType.GLASS, 54240),
                        new ResStat(ResType.MONEY, 4881600)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.CONSTRUCTION, 109000),
                        new ResStat(ResType.STEEL, 12447),
                        new ResStat(ResType.CONCRETE, 221280),
                        new ResStat(ResType.BRICK, 41490),
                        new ResStat(ResType.WOOD, 6915),
                        new ResStat(ResType.GLASS, 69150),
                        new ResStat(ResType.MONEY, 6223500)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.CONSTRUCTION, 133000),
                        new ResStat(ResType.STEEL, 15644),
                        new ResStat(ResType.CONCRETE, 278112),
                        new ResStat(ResType.BRICK, 52146),
                        new ResStat(ResType.WOOD, 8691),
                        new ResStat(ResType.GLASS, 86910),
                        new ResStat(ResType.MONEY, 7821900)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.CONSTRUCTION, 160000),
                        new ResStat(ResType.STEEL, 19386),
                        new ResStat(ResType.CONCRETE, 344640),
                        new ResStat(ResType.BRICK, 64620),
                        new ResStat(ResType.WOOD, 10770),
                        new ResStat(ResType.GLASS, 107700),
                        new ResStat(ResType.MONEY, 9693000)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.CONSTRUCTION, 190000),
                        new ResStat(ResType.STEEL, 23706),
                        new ResStat(ResType.CONCRETE, 421440),
                        new ResStat(ResType.BRICK, 79020),
                        new ResStat(ResType.WOOD, 13170),
                        new ResStat(ResType.GLASS, 131700),
                        new ResStat(ResType.MONEY, 11853000)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.CONSTRUCTION, 224000),
                        new ResStat(ResType.STEEL, 28847),
                        new ResStat(ResType.CONCRETE, 512832),
                        new ResStat(ResType.BRICK, 96156),
                        new ResStat(ResType.WOOD, 16026),
                        new ResStat(ResType.GLASS, 160260),
                        new ResStat(ResType.MONEY, 14423400)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.CONSTRUCTION, 262000),
                        new ResStat(ResType.STEEL, 34866),
                        new ResStat(ResType.CONCRETE, 619840),
                        new ResStat(ResType.BRICK, 116220),
                        new ResStat(ResType.WOOD, 19370),
                        new ResStat(ResType.GLASS, 193700),
                        new ResStat(ResType.MONEY, 17433000)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.CONSTRUCTION, 304000),
                        new ResStat(ResType.STEEL, 41821),
                        new ResStat(ResType.CONCRETE, 743488),
                        new ResStat(ResType.BRICK, 139404),
                        new ResStat(ResType.WOOD, 23234),
                        new ResStat(ResType.GLASS, 232340),
                        new ResStat(ResType.MONEY, 20910600)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.CONSTRUCTION, 350000),
                        new ResStat(ResType.STEEL, 49770),
                        new ResStat(ResType.CONCRETE, 884800),
                        new ResStat(ResType.BRICK, 165900),
                        new ResStat(ResType.WOOD, 27650),
                        new ResStat(ResType.GLASS, 276500),
                        new ResStat(ResType.MONEY, 24885000)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.CONSTRUCTION, 400000),
                        new ResStat(ResType.STEEL, 58770),
                        new ResStat(ResType.CONCRETE, 1044800),
                        new ResStat(ResType.BRICK, 195900),
                        new ResStat(ResType.WOOD, 32650),
                        new ResStat(ResType.GLASS, 326500),
                        new ResStat(ResType.MONEY, 29385000)
                )
        });
        setProductionMultiplier(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.CITIZEN, 2)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.CITIZEN, 4)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.CITIZEN, 6)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.CITIZEN, 8)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.CITIZEN, 10)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.CITIZEN, 14)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.CITIZEN, 18)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.CITIZEN, 22)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.CITIZEN, 26)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.CITIZEN, 30)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.CITIZEN, 36)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.CITIZEN, 42)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.CITIZEN, 48)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.CITIZEN, 54)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.CITIZEN, 60)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.CITIZEN, 68)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.CITIZEN, 76)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.CITIZEN, 84)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.CITIZEN, 92)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.CITIZEN, 100)
                )
        });
        setJobRewardMultiplier(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.CITIZEN, 2)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.CITIZEN, 4)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.CITIZEN, 6)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.CITIZEN, 8)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.CITIZEN, 10)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.CITIZEN, 14)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.CITIZEN, 18)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.CITIZEN, 22)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.CITIZEN, 26)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.CITIZEN, 30)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.CITIZEN, 36)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.CITIZEN, 42)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.CITIZEN, 48)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.CITIZEN, 54)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.CITIZEN, 60)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.CITIZEN, 68)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.CITIZEN, 76)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.CITIZEN, 84)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.CITIZEN, 92)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.CITIZEN, 100)
                )
        });
        setDemand(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.UPKEEP, 300),
                        new ResStat(ResType.POWER_CONSUMPTION, 4),
                        new ResStat(ResType.JOB, 80),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.UPKEEP, 600),
                        new ResStat(ResType.POWER_CONSUMPTION, 8),
                        new ResStat(ResType.JOB, 160),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.UPKEEP, 900),
                        new ResStat(ResType.POWER_CONSUMPTION, 12),
                        new ResStat(ResType.JOB, 240),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.UPKEEP, 1200),
                        new ResStat(ResType.POWER_CONSUMPTION, 16),
                        new ResStat(ResType.JOB, 320),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.UPKEEP, 1500),
                        new ResStat(ResType.POWER_CONSUMPTION, 20),
                        new ResStat(ResType.JOB, 400),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.UPKEEP, 2100),
                        new ResStat(ResType.POWER_CONSUMPTION, 28),
                        new ResStat(ResType.JOB, 560),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.UPKEEP, 2700),
                        new ResStat(ResType.POWER_CONSUMPTION, 36),
                        new ResStat(ResType.JOB, 720),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.UPKEEP, 3300),
                        new ResStat(ResType.POWER_CONSUMPTION, 44),
                        new ResStat(ResType.JOB, 880),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.UPKEEP, 3900),
                        new ResStat(ResType.POWER_CONSUMPTION, 52),
                        new ResStat(ResType.JOB, 1040),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.UPKEEP, 4500),
                        new ResStat(ResType.POWER_CONSUMPTION, 60),
                        new ResStat(ResType.JOB, 1200),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.UPKEEP, 5400),
                        new ResStat(ResType.POWER_CONSUMPTION, 72),
                        new ResStat(ResType.JOB, 1440),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.UPKEEP, 6300),
                        new ResStat(ResType.POWER_CONSUMPTION, 84),
                        new ResStat(ResType.JOB, 1680),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.UPKEEP, 7200),
                        new ResStat(ResType.POWER_CONSUMPTION, 96),
                        new ResStat(ResType.JOB, 1920),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.UPKEEP, 8100),
                        new ResStat(ResType.POWER_CONSUMPTION, 108),
                        new ResStat(ResType.JOB, 2160),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.UPKEEP, 9000),
                        new ResStat(ResType.POWER_CONSUMPTION, 120),
                        new ResStat(ResType.JOB, 2400),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.UPKEEP, 10200),
                        new ResStat(ResType.POWER_CONSUMPTION, 136),
                        new ResStat(ResType.JOB, 2720),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.UPKEEP, 11400),
                        new ResStat(ResType.POWER_CONSUMPTION, 152),
                        new ResStat(ResType.JOB, 3040),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.UPKEEP, 12600),
                        new ResStat(ResType.POWER_CONSUMPTION, 168),
                        new ResStat(ResType.JOB, 3360),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.UPKEEP, 13800),
                        new ResStat(ResType.POWER_CONSUMPTION, 184),
                        new ResStat(ResType.JOB, 3680),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.UPKEEP, 15000),
                        new ResStat(ResType.POWER_CONSUMPTION, 200),
                        new ResStat(ResType.JOB, 4000),
                        new ResStat(ResType.IGNITABILITY, 1)
                )
        });
        setHold(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.POWER, 4),
                        new ResStat(ResType.WORKER, 80)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.POWER, 8),
                        new ResStat(ResType.WORKER, 160)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.POWER, 12),
                        new ResStat(ResType.WORKER, 240)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.POWER, 16),
                        new ResStat(ResType.WORKER, 320)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.POWER, 20),
                        new ResStat(ResType.WORKER, 400)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.POWER, 28),
                        new ResStat(ResType.WORKER, 560)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.POWER, 36),
                        new ResStat(ResType.WORKER, 720)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.POWER, 44),
                        new ResStat(ResType.WORKER, 880)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.POWER, 52),
                        new ResStat(ResType.WORKER, 1040)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.POWER, 60),
                        new ResStat(ResType.WORKER, 1200)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.POWER, 72),
                        new ResStat(ResType.WORKER, 1440)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.POWER, 84),
                        new ResStat(ResType.WORKER, 1680)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.POWER, 96),
                        new ResStat(ResType.WORKER, 1920)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.POWER, 108),
                        new ResStat(ResType.WORKER, 2160)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.POWER, 120),
                        new ResStat(ResType.WORKER, 2400)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.POWER, 136),
                        new ResStat(ResType.WORKER, 2720)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.POWER, 152),
                        new ResStat(ResType.WORKER, 3040)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.POWER, 168),
                        new ResStat(ResType.WORKER, 3360)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.POWER, 184),
                        new ResStat(ResType.WORKER, 3680)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.POWER, 200),
                        new ResStat(ResType.WORKER, 4000)
                )
        });
    }
}
