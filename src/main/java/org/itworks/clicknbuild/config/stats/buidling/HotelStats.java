package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;
import org.itworks.clicknbuild.engine.model.ResourceType;

public final class HotelStats extends BuildingStats {
    private static final HotelStats INST = new HotelStats();

    private HotelStats() {
    }

    public static HotelStats inst() {
        return INST;
    }

    @Override
    protected void initValues() {
        setRequiredPlayerLevel(1);
        setMaxLevel(20);
        setBuildLimit(1);
        setPriceMultiplier(100);
        setStructure(new int[]{
                320, // 1
                960, // 2
                1920, // 3
                3200, // 4
                4800, // 5
                7040, // 6
                9920, // 7
                13440, // 8
                17600, // 9
                22400, // 10
                28160, // 11
                34880, // 12
                42560, // 13
                51200, // 14
                60800, // 15
                71680, // 16
                83840, // 17
                97280, // 18
                112000, // 19
                128000 // 20
        });
        setBuildCost(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.CONSTRUCTION, 320),
                        new ResourceChunk(ResourceType.STEEL, 61),
                        new ResourceChunk(ResourceType.CONCRETE, 82),
                        new ResourceChunk(ResourceType.BRICK, 306),
                        new ResourceChunk(ResourceType.WOOD, 61),
                        new ResourceChunk(ResourceType.GLASS, 122),
                        new ResourceChunk(ResourceType.MONEY, 24480)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.CONSTRUCTION, 960),
                        new ResourceChunk(ResourceType.STEEL, 186),
                        new ResourceChunk(ResourceType.CONCRETE, 248),
                        new ResourceChunk(ResourceType.BRICK, 930),
                        new ResourceChunk(ResourceType.WOOD, 186),
                        new ResourceChunk(ResourceType.GLASS, 372),
                        new ResourceChunk(ResourceType.MONEY, 74400)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.CONSTRUCTION, 1920),
                        new ResourceChunk(ResourceType.STEEL, 377),
                        new ResourceChunk(ResourceType.CONCRETE, 502),
                        new ResourceChunk(ResourceType.BRICK, 1884),
                        new ResourceChunk(ResourceType.WOOD, 377),
                        new ResourceChunk(ResourceType.GLASS, 754),
                        new ResourceChunk(ResourceType.MONEY, 150720)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.CONSTRUCTION, 3200),
                        new ResourceChunk(ResourceType.STEEL, 636),
                        new ResourceChunk(ResourceType.CONCRETE, 848),
                        new ResourceChunk(ResourceType.BRICK, 3180),
                        new ResourceChunk(ResourceType.WOOD, 636),
                        new ResourceChunk(ResourceType.GLASS, 1272),
                        new ResourceChunk(ResourceType.MONEY, 254400)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.CONSTRUCTION, 4800),
                        new ResourceChunk(ResourceType.STEEL, 966),
                        new ResourceChunk(ResourceType.CONCRETE, 1288),
                        new ResourceChunk(ResourceType.BRICK, 4830),
                        new ResourceChunk(ResourceType.WOOD, 966),
                        new ResourceChunk(ResourceType.GLASS, 1932),
                        new ResourceChunk(ResourceType.MONEY, 386400)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.CONSTRUCTION, 7040),
                        new ResourceChunk(ResourceType.STEEL, 1445),
                        new ResourceChunk(ResourceType.CONCRETE, 1926),
                        new ResourceChunk(ResourceType.BRICK, 7224),
                        new ResourceChunk(ResourceType.WOOD, 1445),
                        new ResourceChunk(ResourceType.GLASS, 2890),
                        new ResourceChunk(ResourceType.MONEY, 577920)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.CONSTRUCTION, 9920),
                        new ResourceChunk(ResourceType.STEEL, 2082),
                        new ResourceChunk(ResourceType.CONCRETE, 2776),
                        new ResourceChunk(ResourceType.BRICK, 10410),
                        new ResourceChunk(ResourceType.WOOD, 2082),
                        new ResourceChunk(ResourceType.GLASS, 4164),
                        new ResourceChunk(ResourceType.MONEY, 832800)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.CONSTRUCTION, 13440),
                        new ResourceChunk(ResourceType.STEEL, 2887),
                        new ResourceChunk(ResourceType.CONCRETE, 3850),
                        new ResourceChunk(ResourceType.BRICK, 14436),
                        new ResourceChunk(ResourceType.WOOD, 2887),
                        new ResourceChunk(ResourceType.GLASS, 5774),
                        new ResourceChunk(ResourceType.MONEY, 1154880)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.CONSTRUCTION, 17600),
                        new ResourceChunk(ResourceType.STEEL, 3870),
                        new ResourceChunk(ResourceType.CONCRETE, 5160),
                        new ResourceChunk(ResourceType.BRICK, 19350),
                        new ResourceChunk(ResourceType.WOOD, 3870),
                        new ResourceChunk(ResourceType.GLASS, 7740),
                        new ResourceChunk(ResourceType.MONEY, 1548000)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.CONSTRUCTION, 22400),
                        new ResourceChunk(ResourceType.STEEL, 5040),
                        new ResourceChunk(ResourceType.CONCRETE, 6720),
                        new ResourceChunk(ResourceType.BRICK, 25200),
                        new ResourceChunk(ResourceType.WOOD, 5040),
                        new ResourceChunk(ResourceType.GLASS, 10080),
                        new ResourceChunk(ResourceType.MONEY, 2016000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.CONSTRUCTION, 28160),
                        new ResourceChunk(ResourceType.STEEL, 6509),
                        new ResourceChunk(ResourceType.CONCRETE, 8678),
                        new ResourceChunk(ResourceType.BRICK, 32544),
                        new ResourceChunk(ResourceType.WOOD, 6509),
                        new ResourceChunk(ResourceType.GLASS, 13018),
                        new ResourceChunk(ResourceType.MONEY, 2603520)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.CONSTRUCTION, 34880),
                        new ResourceChunk(ResourceType.STEEL, 8298),
                        new ResourceChunk(ResourceType.CONCRETE, 11064),
                        new ResourceChunk(ResourceType.BRICK, 41490),
                        new ResourceChunk(ResourceType.WOOD, 8298),
                        new ResourceChunk(ResourceType.GLASS, 16596),
                        new ResourceChunk(ResourceType.MONEY, 3319200)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.CONSTRUCTION, 42560),
                        new ResourceChunk(ResourceType.STEEL, 10429),
                        new ResourceChunk(ResourceType.CONCRETE, 13906),
                        new ResourceChunk(ResourceType.BRICK, 52146),
                        new ResourceChunk(ResourceType.WOOD, 10429),
                        new ResourceChunk(ResourceType.GLASS, 20858),
                        new ResourceChunk(ResourceType.MONEY, 4171680)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.CONSTRUCTION, 51200),
                        new ResourceChunk(ResourceType.STEEL, 12924),
                        new ResourceChunk(ResourceType.CONCRETE, 17232),
                        new ResourceChunk(ResourceType.BRICK, 64620),
                        new ResourceChunk(ResourceType.WOOD, 12924),
                        new ResourceChunk(ResourceType.GLASS, 25848),
                        new ResourceChunk(ResourceType.MONEY, 5169600)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.CONSTRUCTION, 60800),
                        new ResourceChunk(ResourceType.STEEL, 15804),
                        new ResourceChunk(ResourceType.CONCRETE, 21072),
                        new ResourceChunk(ResourceType.BRICK, 79020),
                        new ResourceChunk(ResourceType.WOOD, 15804),
                        new ResourceChunk(ResourceType.GLASS, 31608),
                        new ResourceChunk(ResourceType.MONEY, 6321600)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.CONSTRUCTION, 71680),
                        new ResourceChunk(ResourceType.STEEL, 19231),
                        new ResourceChunk(ResourceType.CONCRETE, 25642),
                        new ResourceChunk(ResourceType.BRICK, 96156),
                        new ResourceChunk(ResourceType.WOOD, 19231),
                        new ResourceChunk(ResourceType.GLASS, 38462),
                        new ResourceChunk(ResourceType.MONEY, 7692480)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.CONSTRUCTION, 83840),
                        new ResourceChunk(ResourceType.STEEL, 23244),
                        new ResourceChunk(ResourceType.CONCRETE, 30992),
                        new ResourceChunk(ResourceType.BRICK, 116220),
                        new ResourceChunk(ResourceType.WOOD, 23244),
                        new ResourceChunk(ResourceType.GLASS, 46488),
                        new ResourceChunk(ResourceType.MONEY, 9297600)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.CONSTRUCTION, 97280),
                        new ResourceChunk(ResourceType.STEEL, 27881),
                        new ResourceChunk(ResourceType.CONCRETE, 37174),
                        new ResourceChunk(ResourceType.BRICK, 139404),
                        new ResourceChunk(ResourceType.WOOD, 27881),
                        new ResourceChunk(ResourceType.GLASS, 55762),
                        new ResourceChunk(ResourceType.MONEY, 11152320)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.CONSTRUCTION, 112000),
                        new ResourceChunk(ResourceType.STEEL, 33180),
                        new ResourceChunk(ResourceType.CONCRETE, 44240),
                        new ResourceChunk(ResourceType.BRICK, 165900),
                        new ResourceChunk(ResourceType.WOOD, 33180),
                        new ResourceChunk(ResourceType.GLASS, 66360),
                        new ResourceChunk(ResourceType.MONEY, 13272000)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.CONSTRUCTION, 128000),
                        new ResourceChunk(ResourceType.STEEL, 39180),
                        new ResourceChunk(ResourceType.CONCRETE, 52240),
                        new ResourceChunk(ResourceType.BRICK, 195900),
                        new ResourceChunk(ResourceType.WOOD, 39180),
                        new ResourceChunk(ResourceType.GLASS, 78360),
                        new ResourceChunk(ResourceType.MONEY, 15672000)
                )
        });
        setProductionMultiplier(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.ENERGY, 2)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.ENERGY, 4)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.ENERGY, 6)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.ENERGY, 8)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.ENERGY, 10)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.ENERGY, 14)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.ENERGY, 18)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.ENERGY, 22)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.ENERGY, 26)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.ENERGY, 30)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.ENERGY, 36)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.ENERGY, 42)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.ENERGY, 48)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.ENERGY, 54)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.ENERGY, 60)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.ENERGY, 68)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.ENERGY, 76)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.ENERGY, 84)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.ENERGY, 92)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.ENERGY, 100)
                )
        });
        setJobRewardMultiplier(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.ENERGY, 2)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.ENERGY, 4)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.ENERGY, 6)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.ENERGY, 8)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.ENERGY, 10)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.ENERGY, 14)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.ENERGY, 18)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.ENERGY, 22)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.ENERGY, 26)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.ENERGY, 30)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.ENERGY, 36)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.ENERGY, 42)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.ENERGY, 48)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.ENERGY, 54)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.ENERGY, 60)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.ENERGY, 68)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.ENERGY, 76)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.ENERGY, 84)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.ENERGY, 92)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.ENERGY, 100)
                )
        });
        setDemand(new ResourcePack[]{
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
        });
        setHold(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.POWER, 5),
                        new ResourceChunk(ResourceType.WORKER, 100)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.POWER, 10),
                        new ResourceChunk(ResourceType.WORKER, 200)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.POWER, 15),
                        new ResourceChunk(ResourceType.WORKER, 300)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.POWER, 20),
                        new ResourceChunk(ResourceType.WORKER, 400)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.POWER, 25),
                        new ResourceChunk(ResourceType.WORKER, 500)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.POWER, 35),
                        new ResourceChunk(ResourceType.WORKER, 700)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.POWER, 45),
                        new ResourceChunk(ResourceType.WORKER, 900)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.POWER, 55),
                        new ResourceChunk(ResourceType.WORKER, 1100)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.POWER, 65),
                        new ResourceChunk(ResourceType.WORKER, 1300)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.POWER, 75),
                        new ResourceChunk(ResourceType.WORKER, 1500)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.POWER, 90),
                        new ResourceChunk(ResourceType.WORKER, 1800)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.POWER, 105),
                        new ResourceChunk(ResourceType.WORKER, 2100)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.POWER, 120),
                        new ResourceChunk(ResourceType.WORKER, 2400)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.POWER, 135),
                        new ResourceChunk(ResourceType.WORKER, 2700)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.POWER, 150),
                        new ResourceChunk(ResourceType.WORKER, 3000)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.POWER, 170),
                        new ResourceChunk(ResourceType.WORKER, 3400)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.POWER, 190),
                        new ResourceChunk(ResourceType.WORKER, 3800)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.POWER, 210),
                        new ResourceChunk(ResourceType.WORKER, 4200)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.POWER, 230),
                        new ResourceChunk(ResourceType.WORKER, 4600)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.POWER, 250),
                        new ResourceChunk(ResourceType.WORKER, 5000)
                )
        });
        setStoreMultiplier(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.ENERGY, 2)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.ENERGY, 4)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.ENERGY, 6)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.ENERGY, 8)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.ENERGY, 10)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.ENERGY, 14)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.ENERGY, 18)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.ENERGY, 22)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.ENERGY, 26)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.ENERGY, 30)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.ENERGY, 36)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.ENERGY, 42)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.ENERGY, 48)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.ENERGY, 54)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.ENERGY, 60)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.ENERGY, 68)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.ENERGY, 76)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.ENERGY, 84)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.ENERGY, 92)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.ENERGY, 100)
                )
        });
    }
}
