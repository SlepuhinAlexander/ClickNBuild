package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResChunk;
import org.itworks.clicknbuild.engine.model.ResPack;
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
        setBuildCost(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.CONSTRUCTION, 320),
                        new ResChunk(ResType.STEEL, 61),
                        new ResChunk(ResType.CONCRETE, 82),
                        new ResChunk(ResType.BRICK, 306),
                        new ResChunk(ResType.WOOD, 61),
                        new ResChunk(ResType.GLASS, 122),
                        new ResChunk(ResType.MONEY, 24480)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.CONSTRUCTION, 960),
                        new ResChunk(ResType.STEEL, 186),
                        new ResChunk(ResType.CONCRETE, 248),
                        new ResChunk(ResType.BRICK, 930),
                        new ResChunk(ResType.WOOD, 186),
                        new ResChunk(ResType.GLASS, 372),
                        new ResChunk(ResType.MONEY, 74400)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.CONSTRUCTION, 1920),
                        new ResChunk(ResType.STEEL, 377),
                        new ResChunk(ResType.CONCRETE, 502),
                        new ResChunk(ResType.BRICK, 1884),
                        new ResChunk(ResType.WOOD, 377),
                        new ResChunk(ResType.GLASS, 754),
                        new ResChunk(ResType.MONEY, 150720)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.CONSTRUCTION, 3200),
                        new ResChunk(ResType.STEEL, 636),
                        new ResChunk(ResType.CONCRETE, 848),
                        new ResChunk(ResType.BRICK, 3180),
                        new ResChunk(ResType.WOOD, 636),
                        new ResChunk(ResType.GLASS, 1272),
                        new ResChunk(ResType.MONEY, 254400)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.CONSTRUCTION, 4800),
                        new ResChunk(ResType.STEEL, 966),
                        new ResChunk(ResType.CONCRETE, 1288),
                        new ResChunk(ResType.BRICK, 4830),
                        new ResChunk(ResType.WOOD, 966),
                        new ResChunk(ResType.GLASS, 1932),
                        new ResChunk(ResType.MONEY, 386400)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.CONSTRUCTION, 7040),
                        new ResChunk(ResType.STEEL, 1445),
                        new ResChunk(ResType.CONCRETE, 1926),
                        new ResChunk(ResType.BRICK, 7224),
                        new ResChunk(ResType.WOOD, 1445),
                        new ResChunk(ResType.GLASS, 2890),
                        new ResChunk(ResType.MONEY, 577920)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.CONSTRUCTION, 9920),
                        new ResChunk(ResType.STEEL, 2082),
                        new ResChunk(ResType.CONCRETE, 2776),
                        new ResChunk(ResType.BRICK, 10410),
                        new ResChunk(ResType.WOOD, 2082),
                        new ResChunk(ResType.GLASS, 4164),
                        new ResChunk(ResType.MONEY, 832800)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.CONSTRUCTION, 13440),
                        new ResChunk(ResType.STEEL, 2887),
                        new ResChunk(ResType.CONCRETE, 3850),
                        new ResChunk(ResType.BRICK, 14436),
                        new ResChunk(ResType.WOOD, 2887),
                        new ResChunk(ResType.GLASS, 5774),
                        new ResChunk(ResType.MONEY, 1154880)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.CONSTRUCTION, 17600),
                        new ResChunk(ResType.STEEL, 3870),
                        new ResChunk(ResType.CONCRETE, 5160),
                        new ResChunk(ResType.BRICK, 19350),
                        new ResChunk(ResType.WOOD, 3870),
                        new ResChunk(ResType.GLASS, 7740),
                        new ResChunk(ResType.MONEY, 1548000)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.CONSTRUCTION, 22400),
                        new ResChunk(ResType.STEEL, 5040),
                        new ResChunk(ResType.CONCRETE, 6720),
                        new ResChunk(ResType.BRICK, 25200),
                        new ResChunk(ResType.WOOD, 5040),
                        new ResChunk(ResType.GLASS, 10080),
                        new ResChunk(ResType.MONEY, 2016000)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.CONSTRUCTION, 28160),
                        new ResChunk(ResType.STEEL, 6509),
                        new ResChunk(ResType.CONCRETE, 8678),
                        new ResChunk(ResType.BRICK, 32544),
                        new ResChunk(ResType.WOOD, 6509),
                        new ResChunk(ResType.GLASS, 13018),
                        new ResChunk(ResType.MONEY, 2603520)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.CONSTRUCTION, 34880),
                        new ResChunk(ResType.STEEL, 8298),
                        new ResChunk(ResType.CONCRETE, 11064),
                        new ResChunk(ResType.BRICK, 41490),
                        new ResChunk(ResType.WOOD, 8298),
                        new ResChunk(ResType.GLASS, 16596),
                        new ResChunk(ResType.MONEY, 3319200)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.CONSTRUCTION, 42560),
                        new ResChunk(ResType.STEEL, 10429),
                        new ResChunk(ResType.CONCRETE, 13906),
                        new ResChunk(ResType.BRICK, 52146),
                        new ResChunk(ResType.WOOD, 10429),
                        new ResChunk(ResType.GLASS, 20858),
                        new ResChunk(ResType.MONEY, 4171680)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.CONSTRUCTION, 51200),
                        new ResChunk(ResType.STEEL, 12924),
                        new ResChunk(ResType.CONCRETE, 17232),
                        new ResChunk(ResType.BRICK, 64620),
                        new ResChunk(ResType.WOOD, 12924),
                        new ResChunk(ResType.GLASS, 25848),
                        new ResChunk(ResType.MONEY, 5169600)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.CONSTRUCTION, 60800),
                        new ResChunk(ResType.STEEL, 15804),
                        new ResChunk(ResType.CONCRETE, 21072),
                        new ResChunk(ResType.BRICK, 79020),
                        new ResChunk(ResType.WOOD, 15804),
                        new ResChunk(ResType.GLASS, 31608),
                        new ResChunk(ResType.MONEY, 6321600)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.CONSTRUCTION, 71680),
                        new ResChunk(ResType.STEEL, 19231),
                        new ResChunk(ResType.CONCRETE, 25642),
                        new ResChunk(ResType.BRICK, 96156),
                        new ResChunk(ResType.WOOD, 19231),
                        new ResChunk(ResType.GLASS, 38462),
                        new ResChunk(ResType.MONEY, 7692480)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.CONSTRUCTION, 83840),
                        new ResChunk(ResType.STEEL, 23244),
                        new ResChunk(ResType.CONCRETE, 30992),
                        new ResChunk(ResType.BRICK, 116220),
                        new ResChunk(ResType.WOOD, 23244),
                        new ResChunk(ResType.GLASS, 46488),
                        new ResChunk(ResType.MONEY, 9297600)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.CONSTRUCTION, 97280),
                        new ResChunk(ResType.STEEL, 27881),
                        new ResChunk(ResType.CONCRETE, 37174),
                        new ResChunk(ResType.BRICK, 139404),
                        new ResChunk(ResType.WOOD, 27881),
                        new ResChunk(ResType.GLASS, 55762),
                        new ResChunk(ResType.MONEY, 11152320)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.CONSTRUCTION, 112000),
                        new ResChunk(ResType.STEEL, 33180),
                        new ResChunk(ResType.CONCRETE, 44240),
                        new ResChunk(ResType.BRICK, 165900),
                        new ResChunk(ResType.WOOD, 33180),
                        new ResChunk(ResType.GLASS, 66360),
                        new ResChunk(ResType.MONEY, 13272000)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.CONSTRUCTION, 128000),
                        new ResChunk(ResType.STEEL, 39180),
                        new ResChunk(ResType.CONCRETE, 52240),
                        new ResChunk(ResType.BRICK, 195900),
                        new ResChunk(ResType.WOOD, 39180),
                        new ResChunk(ResType.GLASS, 78360),
                        new ResChunk(ResType.MONEY, 15672000)
                )
        });
        setProductionMultiplier(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.ENERGY, 2)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.ENERGY, 4)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.ENERGY, 6)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.ENERGY, 8)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.ENERGY, 10)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.ENERGY, 14)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.ENERGY, 18)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.ENERGY, 22)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.ENERGY, 26)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.ENERGY, 30)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.ENERGY, 36)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.ENERGY, 42)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.ENERGY, 48)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.ENERGY, 54)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.ENERGY, 60)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.ENERGY, 68)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.ENERGY, 76)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.ENERGY, 84)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.ENERGY, 92)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.ENERGY, 100)
                )
        });
        setJobRewardMultiplier(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.ENERGY, 2)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.ENERGY, 4)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.ENERGY, 6)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.ENERGY, 8)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.ENERGY, 10)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.ENERGY, 14)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.ENERGY, 18)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.ENERGY, 22)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.ENERGY, 26)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.ENERGY, 30)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.ENERGY, 36)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.ENERGY, 42)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.ENERGY, 48)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.ENERGY, 54)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.ENERGY, 60)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.ENERGY, 68)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.ENERGY, 76)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.ENERGY, 84)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.ENERGY, 92)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.ENERGY, 100)
                )
        });
        setDemand(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.POWER_CONSUMPTION, 5),
                        new ResChunk(ResType.JOB, 100),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.POWER_CONSUMPTION, 10),
                        new ResChunk(ResType.JOB, 200),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.POWER_CONSUMPTION, 15),
                        new ResChunk(ResType.JOB, 300),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.POWER_CONSUMPTION, 20),
                        new ResChunk(ResType.JOB, 400),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.POWER_CONSUMPTION, 25),
                        new ResChunk(ResType.JOB, 500),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.POWER_CONSUMPTION, 35),
                        new ResChunk(ResType.JOB, 700),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.POWER_CONSUMPTION, 45),
                        new ResChunk(ResType.JOB, 900),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.POWER_CONSUMPTION, 55),
                        new ResChunk(ResType.JOB, 1100),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.POWER_CONSUMPTION, 65),
                        new ResChunk(ResType.JOB, 1300),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.POWER_CONSUMPTION, 75),
                        new ResChunk(ResType.JOB, 1500),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.POWER_CONSUMPTION, 90),
                        new ResChunk(ResType.JOB, 1800),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.POWER_CONSUMPTION, 105),
                        new ResChunk(ResType.JOB, 2100),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.POWER_CONSUMPTION, 120),
                        new ResChunk(ResType.JOB, 2400),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.POWER_CONSUMPTION, 135),
                        new ResChunk(ResType.JOB, 2700),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.POWER_CONSUMPTION, 150),
                        new ResChunk(ResType.JOB, 3000),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.POWER_CONSUMPTION, 170),
                        new ResChunk(ResType.JOB, 3400),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.POWER_CONSUMPTION, 190),
                        new ResChunk(ResType.JOB, 3800),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.POWER_CONSUMPTION, 210),
                        new ResChunk(ResType.JOB, 4200),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.POWER_CONSUMPTION, 230),
                        new ResChunk(ResType.JOB, 4600),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.POWER_CONSUMPTION, 250),
                        new ResChunk(ResType.JOB, 5000),
                        new ResChunk(ResType.IGNITABILITY, 1)
                )
        });
        setHold(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.POWER, 5),
                        new ResChunk(ResType.WORKER, 100)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.POWER, 10),
                        new ResChunk(ResType.WORKER, 200)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.POWER, 15),
                        new ResChunk(ResType.WORKER, 300)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.POWER, 20),
                        new ResChunk(ResType.WORKER, 400)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.POWER, 25),
                        new ResChunk(ResType.WORKER, 500)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.POWER, 35),
                        new ResChunk(ResType.WORKER, 700)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.POWER, 45),
                        new ResChunk(ResType.WORKER, 900)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.POWER, 55),
                        new ResChunk(ResType.WORKER, 1100)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.POWER, 65),
                        new ResChunk(ResType.WORKER, 1300)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.POWER, 75),
                        new ResChunk(ResType.WORKER, 1500)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.POWER, 90),
                        new ResChunk(ResType.WORKER, 1800)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.POWER, 105),
                        new ResChunk(ResType.WORKER, 2100)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.POWER, 120),
                        new ResChunk(ResType.WORKER, 2400)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.POWER, 135),
                        new ResChunk(ResType.WORKER, 2700)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.POWER, 150),
                        new ResChunk(ResType.WORKER, 3000)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.POWER, 170),
                        new ResChunk(ResType.WORKER, 3400)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.POWER, 190),
                        new ResChunk(ResType.WORKER, 3800)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.POWER, 210),
                        new ResChunk(ResType.WORKER, 4200)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.POWER, 230),
                        new ResChunk(ResType.WORKER, 4600)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.POWER, 250),
                        new ResChunk(ResType.WORKER, 5000)
                )
        });
        setStoreMultiplier(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.ENERGY, 2)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.ENERGY, 4)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.ENERGY, 6)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.ENERGY, 8)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.ENERGY, 10)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.ENERGY, 14)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.ENERGY, 18)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.ENERGY, 22)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.ENERGY, 26)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.ENERGY, 30)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.ENERGY, 36)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.ENERGY, 42)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.ENERGY, 48)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.ENERGY, 54)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.ENERGY, 60)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.ENERGY, 68)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.ENERGY, 76)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.ENERGY, 84)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.ENERGY, 92)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.ENERGY, 100)
                )
        });
    }
}
