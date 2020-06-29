package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;
import org.itworks.clicknbuild.engine.model.ResType;

public final class HotelStats extends BuildingStats {
    private static volatile HotelStats inst;

    private HotelStats() {
    }

    public static HotelStats inst() {
        HotelStats local = inst;
        if (local == null) {
            synchronized (HotelStats.class) {
                local = inst;
                if (local == null) {
                    inst = local = new HotelStats();
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
                        new ResourceChunk(ResType.CONSTRUCTION, 320),
                        new ResourceChunk(ResType.STEEL, 61),
                        new ResourceChunk(ResType.CONCRETE, 82),
                        new ResourceChunk(ResType.BRICK, 306),
                        new ResourceChunk(ResType.WOOD, 61),
                        new ResourceChunk(ResType.GLASS, 122),
                        new ResourceChunk(ResType.MONEY, 24480)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.CONSTRUCTION, 960),
                        new ResourceChunk(ResType.STEEL, 186),
                        new ResourceChunk(ResType.CONCRETE, 248),
                        new ResourceChunk(ResType.BRICK, 930),
                        new ResourceChunk(ResType.WOOD, 186),
                        new ResourceChunk(ResType.GLASS, 372),
                        new ResourceChunk(ResType.MONEY, 74400)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.CONSTRUCTION, 1920),
                        new ResourceChunk(ResType.STEEL, 377),
                        new ResourceChunk(ResType.CONCRETE, 502),
                        new ResourceChunk(ResType.BRICK, 1884),
                        new ResourceChunk(ResType.WOOD, 377),
                        new ResourceChunk(ResType.GLASS, 754),
                        new ResourceChunk(ResType.MONEY, 150720)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.CONSTRUCTION, 3200),
                        new ResourceChunk(ResType.STEEL, 636),
                        new ResourceChunk(ResType.CONCRETE, 848),
                        new ResourceChunk(ResType.BRICK, 3180),
                        new ResourceChunk(ResType.WOOD, 636),
                        new ResourceChunk(ResType.GLASS, 1272),
                        new ResourceChunk(ResType.MONEY, 254400)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.CONSTRUCTION, 4800),
                        new ResourceChunk(ResType.STEEL, 966),
                        new ResourceChunk(ResType.CONCRETE, 1288),
                        new ResourceChunk(ResType.BRICK, 4830),
                        new ResourceChunk(ResType.WOOD, 966),
                        new ResourceChunk(ResType.GLASS, 1932),
                        new ResourceChunk(ResType.MONEY, 386400)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.CONSTRUCTION, 7040),
                        new ResourceChunk(ResType.STEEL, 1445),
                        new ResourceChunk(ResType.CONCRETE, 1926),
                        new ResourceChunk(ResType.BRICK, 7224),
                        new ResourceChunk(ResType.WOOD, 1445),
                        new ResourceChunk(ResType.GLASS, 2890),
                        new ResourceChunk(ResType.MONEY, 577920)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.CONSTRUCTION, 9920),
                        new ResourceChunk(ResType.STEEL, 2082),
                        new ResourceChunk(ResType.CONCRETE, 2776),
                        new ResourceChunk(ResType.BRICK, 10410),
                        new ResourceChunk(ResType.WOOD, 2082),
                        new ResourceChunk(ResType.GLASS, 4164),
                        new ResourceChunk(ResType.MONEY, 832800)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.CONSTRUCTION, 13440),
                        new ResourceChunk(ResType.STEEL, 2887),
                        new ResourceChunk(ResType.CONCRETE, 3850),
                        new ResourceChunk(ResType.BRICK, 14436),
                        new ResourceChunk(ResType.WOOD, 2887),
                        new ResourceChunk(ResType.GLASS, 5774),
                        new ResourceChunk(ResType.MONEY, 1154880)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.CONSTRUCTION, 17600),
                        new ResourceChunk(ResType.STEEL, 3870),
                        new ResourceChunk(ResType.CONCRETE, 5160),
                        new ResourceChunk(ResType.BRICK, 19350),
                        new ResourceChunk(ResType.WOOD, 3870),
                        new ResourceChunk(ResType.GLASS, 7740),
                        new ResourceChunk(ResType.MONEY, 1548000)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.CONSTRUCTION, 22400),
                        new ResourceChunk(ResType.STEEL, 5040),
                        new ResourceChunk(ResType.CONCRETE, 6720),
                        new ResourceChunk(ResType.BRICK, 25200),
                        new ResourceChunk(ResType.WOOD, 5040),
                        new ResourceChunk(ResType.GLASS, 10080),
                        new ResourceChunk(ResType.MONEY, 2016000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.CONSTRUCTION, 28160),
                        new ResourceChunk(ResType.STEEL, 6509),
                        new ResourceChunk(ResType.CONCRETE, 8678),
                        new ResourceChunk(ResType.BRICK, 32544),
                        new ResourceChunk(ResType.WOOD, 6509),
                        new ResourceChunk(ResType.GLASS, 13018),
                        new ResourceChunk(ResType.MONEY, 2603520)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.CONSTRUCTION, 34880),
                        new ResourceChunk(ResType.STEEL, 8298),
                        new ResourceChunk(ResType.CONCRETE, 11064),
                        new ResourceChunk(ResType.BRICK, 41490),
                        new ResourceChunk(ResType.WOOD, 8298),
                        new ResourceChunk(ResType.GLASS, 16596),
                        new ResourceChunk(ResType.MONEY, 3319200)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.CONSTRUCTION, 42560),
                        new ResourceChunk(ResType.STEEL, 10429),
                        new ResourceChunk(ResType.CONCRETE, 13906),
                        new ResourceChunk(ResType.BRICK, 52146),
                        new ResourceChunk(ResType.WOOD, 10429),
                        new ResourceChunk(ResType.GLASS, 20858),
                        new ResourceChunk(ResType.MONEY, 4171680)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.CONSTRUCTION, 51200),
                        new ResourceChunk(ResType.STEEL, 12924),
                        new ResourceChunk(ResType.CONCRETE, 17232),
                        new ResourceChunk(ResType.BRICK, 64620),
                        new ResourceChunk(ResType.WOOD, 12924),
                        new ResourceChunk(ResType.GLASS, 25848),
                        new ResourceChunk(ResType.MONEY, 5169600)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.CONSTRUCTION, 60800),
                        new ResourceChunk(ResType.STEEL, 15804),
                        new ResourceChunk(ResType.CONCRETE, 21072),
                        new ResourceChunk(ResType.BRICK, 79020),
                        new ResourceChunk(ResType.WOOD, 15804),
                        new ResourceChunk(ResType.GLASS, 31608),
                        new ResourceChunk(ResType.MONEY, 6321600)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.CONSTRUCTION, 71680),
                        new ResourceChunk(ResType.STEEL, 19231),
                        new ResourceChunk(ResType.CONCRETE, 25642),
                        new ResourceChunk(ResType.BRICK, 96156),
                        new ResourceChunk(ResType.WOOD, 19231),
                        new ResourceChunk(ResType.GLASS, 38462),
                        new ResourceChunk(ResType.MONEY, 7692480)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.CONSTRUCTION, 83840),
                        new ResourceChunk(ResType.STEEL, 23244),
                        new ResourceChunk(ResType.CONCRETE, 30992),
                        new ResourceChunk(ResType.BRICK, 116220),
                        new ResourceChunk(ResType.WOOD, 23244),
                        new ResourceChunk(ResType.GLASS, 46488),
                        new ResourceChunk(ResType.MONEY, 9297600)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.CONSTRUCTION, 97280),
                        new ResourceChunk(ResType.STEEL, 27881),
                        new ResourceChunk(ResType.CONCRETE, 37174),
                        new ResourceChunk(ResType.BRICK, 139404),
                        new ResourceChunk(ResType.WOOD, 27881),
                        new ResourceChunk(ResType.GLASS, 55762),
                        new ResourceChunk(ResType.MONEY, 11152320)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.CONSTRUCTION, 112000),
                        new ResourceChunk(ResType.STEEL, 33180),
                        new ResourceChunk(ResType.CONCRETE, 44240),
                        new ResourceChunk(ResType.BRICK, 165900),
                        new ResourceChunk(ResType.WOOD, 33180),
                        new ResourceChunk(ResType.GLASS, 66360),
                        new ResourceChunk(ResType.MONEY, 13272000)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.CONSTRUCTION, 128000),
                        new ResourceChunk(ResType.STEEL, 39180),
                        new ResourceChunk(ResType.CONCRETE, 52240),
                        new ResourceChunk(ResType.BRICK, 195900),
                        new ResourceChunk(ResType.WOOD, 39180),
                        new ResourceChunk(ResType.GLASS, 78360),
                        new ResourceChunk(ResType.MONEY, 15672000)
                )
        });
        setProductionMultiplier(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.ENERGY, 2)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.ENERGY, 4)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.ENERGY, 6)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.ENERGY, 8)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.ENERGY, 10)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.ENERGY, 14)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.ENERGY, 18)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.ENERGY, 22)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.ENERGY, 26)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.ENERGY, 30)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.ENERGY, 36)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.ENERGY, 42)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.ENERGY, 48)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.ENERGY, 54)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.ENERGY, 60)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.ENERGY, 68)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.ENERGY, 76)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.ENERGY, 84)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.ENERGY, 92)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.ENERGY, 100)
                )
        });
        setJobRewardMultiplier(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.ENERGY, 2)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.ENERGY, 4)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.ENERGY, 6)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.ENERGY, 8)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.ENERGY, 10)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.ENERGY, 14)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.ENERGY, 18)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.ENERGY, 22)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.ENERGY, 26)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.ENERGY, 30)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.ENERGY, 36)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.ENERGY, 42)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.ENERGY, 48)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.ENERGY, 54)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.ENERGY, 60)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.ENERGY, 68)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.ENERGY, 76)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.ENERGY, 84)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.ENERGY, 92)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.ENERGY, 100)
                )
        });
        setDemand(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 5),
                        new ResourceChunk(ResType.JOB, 100),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 10),
                        new ResourceChunk(ResType.JOB, 200),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 15),
                        new ResourceChunk(ResType.JOB, 300),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 20),
                        new ResourceChunk(ResType.JOB, 400),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 25),
                        new ResourceChunk(ResType.JOB, 500),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 35),
                        new ResourceChunk(ResType.JOB, 700),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 45),
                        new ResourceChunk(ResType.JOB, 900),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 55),
                        new ResourceChunk(ResType.JOB, 1100),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 65),
                        new ResourceChunk(ResType.JOB, 1300),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 75),
                        new ResourceChunk(ResType.JOB, 1500),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 90),
                        new ResourceChunk(ResType.JOB, 1800),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 105),
                        new ResourceChunk(ResType.JOB, 2100),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 120),
                        new ResourceChunk(ResType.JOB, 2400),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 135),
                        new ResourceChunk(ResType.JOB, 2700),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 150),
                        new ResourceChunk(ResType.JOB, 3000),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 170),
                        new ResourceChunk(ResType.JOB, 3400),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 190),
                        new ResourceChunk(ResType.JOB, 3800),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 210),
                        new ResourceChunk(ResType.JOB, 4200),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 230),
                        new ResourceChunk(ResType.JOB, 4600),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 250),
                        new ResourceChunk(ResType.JOB, 5000),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                )
        });
        setHold(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.POWER, 5),
                        new ResourceChunk(ResType.WORKER, 100)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.POWER, 10),
                        new ResourceChunk(ResType.WORKER, 200)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.POWER, 15),
                        new ResourceChunk(ResType.WORKER, 300)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.POWER, 20),
                        new ResourceChunk(ResType.WORKER, 400)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.POWER, 25),
                        new ResourceChunk(ResType.WORKER, 500)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.POWER, 35),
                        new ResourceChunk(ResType.WORKER, 700)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.POWER, 45),
                        new ResourceChunk(ResType.WORKER, 900)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.POWER, 55),
                        new ResourceChunk(ResType.WORKER, 1100)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.POWER, 65),
                        new ResourceChunk(ResType.WORKER, 1300)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.POWER, 75),
                        new ResourceChunk(ResType.WORKER, 1500)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.POWER, 90),
                        new ResourceChunk(ResType.WORKER, 1800)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.POWER, 105),
                        new ResourceChunk(ResType.WORKER, 2100)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.POWER, 120),
                        new ResourceChunk(ResType.WORKER, 2400)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.POWER, 135),
                        new ResourceChunk(ResType.WORKER, 2700)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.POWER, 150),
                        new ResourceChunk(ResType.WORKER, 3000)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.POWER, 170),
                        new ResourceChunk(ResType.WORKER, 3400)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.POWER, 190),
                        new ResourceChunk(ResType.WORKER, 3800)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.POWER, 210),
                        new ResourceChunk(ResType.WORKER, 4200)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.POWER, 230),
                        new ResourceChunk(ResType.WORKER, 4600)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.POWER, 250),
                        new ResourceChunk(ResType.WORKER, 5000)
                )
        });
        setStoreMultiplier(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.ENERGY, 2)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.ENERGY, 4)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.ENERGY, 6)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.ENERGY, 8)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.ENERGY, 10)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.ENERGY, 14)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.ENERGY, 18)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.ENERGY, 22)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.ENERGY, 26)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.ENERGY, 30)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.ENERGY, 36)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.ENERGY, 42)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.ENERGY, 48)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.ENERGY, 54)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.ENERGY, 60)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.ENERGY, 68)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.ENERGY, 76)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.ENERGY, 84)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.ENERGY, 92)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.ENERGY, 100)
                )
        });
    }
}
