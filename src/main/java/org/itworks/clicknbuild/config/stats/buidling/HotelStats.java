package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResStat;
import org.itworks.clicknbuild.engine.model.ResStatPack;
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
        setBuildCost(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.CONSTRUCTION, 320),
                        new ResStat(ResType.STEEL, 61),
                        new ResStat(ResType.CONCRETE, 82),
                        new ResStat(ResType.BRICK, 306),
                        new ResStat(ResType.WOOD, 61),
                        new ResStat(ResType.GLASS, 122),
                        new ResStat(ResType.MONEY, 24480)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.CONSTRUCTION, 960),
                        new ResStat(ResType.STEEL, 186),
                        new ResStat(ResType.CONCRETE, 248),
                        new ResStat(ResType.BRICK, 930),
                        new ResStat(ResType.WOOD, 186),
                        new ResStat(ResType.GLASS, 372),
                        new ResStat(ResType.MONEY, 74400)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.CONSTRUCTION, 1920),
                        new ResStat(ResType.STEEL, 377),
                        new ResStat(ResType.CONCRETE, 502),
                        new ResStat(ResType.BRICK, 1884),
                        new ResStat(ResType.WOOD, 377),
                        new ResStat(ResType.GLASS, 754),
                        new ResStat(ResType.MONEY, 150720)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.CONSTRUCTION, 3200),
                        new ResStat(ResType.STEEL, 636),
                        new ResStat(ResType.CONCRETE, 848),
                        new ResStat(ResType.BRICK, 3180),
                        new ResStat(ResType.WOOD, 636),
                        new ResStat(ResType.GLASS, 1272),
                        new ResStat(ResType.MONEY, 254400)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.CONSTRUCTION, 4800),
                        new ResStat(ResType.STEEL, 966),
                        new ResStat(ResType.CONCRETE, 1288),
                        new ResStat(ResType.BRICK, 4830),
                        new ResStat(ResType.WOOD, 966),
                        new ResStat(ResType.GLASS, 1932),
                        new ResStat(ResType.MONEY, 386400)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.CONSTRUCTION, 7040),
                        new ResStat(ResType.STEEL, 1445),
                        new ResStat(ResType.CONCRETE, 1926),
                        new ResStat(ResType.BRICK, 7224),
                        new ResStat(ResType.WOOD, 1445),
                        new ResStat(ResType.GLASS, 2890),
                        new ResStat(ResType.MONEY, 577920)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.CONSTRUCTION, 9920),
                        new ResStat(ResType.STEEL, 2082),
                        new ResStat(ResType.CONCRETE, 2776),
                        new ResStat(ResType.BRICK, 10410),
                        new ResStat(ResType.WOOD, 2082),
                        new ResStat(ResType.GLASS, 4164),
                        new ResStat(ResType.MONEY, 832800)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.CONSTRUCTION, 13440),
                        new ResStat(ResType.STEEL, 2887),
                        new ResStat(ResType.CONCRETE, 3850),
                        new ResStat(ResType.BRICK, 14436),
                        new ResStat(ResType.WOOD, 2887),
                        new ResStat(ResType.GLASS, 5774),
                        new ResStat(ResType.MONEY, 1154880)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.CONSTRUCTION, 17600),
                        new ResStat(ResType.STEEL, 3870),
                        new ResStat(ResType.CONCRETE, 5160),
                        new ResStat(ResType.BRICK, 19350),
                        new ResStat(ResType.WOOD, 3870),
                        new ResStat(ResType.GLASS, 7740),
                        new ResStat(ResType.MONEY, 1548000)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.CONSTRUCTION, 22400),
                        new ResStat(ResType.STEEL, 5040),
                        new ResStat(ResType.CONCRETE, 6720),
                        new ResStat(ResType.BRICK, 25200),
                        new ResStat(ResType.WOOD, 5040),
                        new ResStat(ResType.GLASS, 10080),
                        new ResStat(ResType.MONEY, 2016000)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.CONSTRUCTION, 28160),
                        new ResStat(ResType.STEEL, 6509),
                        new ResStat(ResType.CONCRETE, 8678),
                        new ResStat(ResType.BRICK, 32544),
                        new ResStat(ResType.WOOD, 6509),
                        new ResStat(ResType.GLASS, 13018),
                        new ResStat(ResType.MONEY, 2603520)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.CONSTRUCTION, 34880),
                        new ResStat(ResType.STEEL, 8298),
                        new ResStat(ResType.CONCRETE, 11064),
                        new ResStat(ResType.BRICK, 41490),
                        new ResStat(ResType.WOOD, 8298),
                        new ResStat(ResType.GLASS, 16596),
                        new ResStat(ResType.MONEY, 3319200)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.CONSTRUCTION, 42560),
                        new ResStat(ResType.STEEL, 10429),
                        new ResStat(ResType.CONCRETE, 13906),
                        new ResStat(ResType.BRICK, 52146),
                        new ResStat(ResType.WOOD, 10429),
                        new ResStat(ResType.GLASS, 20858),
                        new ResStat(ResType.MONEY, 4171680)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.CONSTRUCTION, 51200),
                        new ResStat(ResType.STEEL, 12924),
                        new ResStat(ResType.CONCRETE, 17232),
                        new ResStat(ResType.BRICK, 64620),
                        new ResStat(ResType.WOOD, 12924),
                        new ResStat(ResType.GLASS, 25848),
                        new ResStat(ResType.MONEY, 5169600)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.CONSTRUCTION, 60800),
                        new ResStat(ResType.STEEL, 15804),
                        new ResStat(ResType.CONCRETE, 21072),
                        new ResStat(ResType.BRICK, 79020),
                        new ResStat(ResType.WOOD, 15804),
                        new ResStat(ResType.GLASS, 31608),
                        new ResStat(ResType.MONEY, 6321600)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.CONSTRUCTION, 71680),
                        new ResStat(ResType.STEEL, 19231),
                        new ResStat(ResType.CONCRETE, 25642),
                        new ResStat(ResType.BRICK, 96156),
                        new ResStat(ResType.WOOD, 19231),
                        new ResStat(ResType.GLASS, 38462),
                        new ResStat(ResType.MONEY, 7692480)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.CONSTRUCTION, 83840),
                        new ResStat(ResType.STEEL, 23244),
                        new ResStat(ResType.CONCRETE, 30992),
                        new ResStat(ResType.BRICK, 116220),
                        new ResStat(ResType.WOOD, 23244),
                        new ResStat(ResType.GLASS, 46488),
                        new ResStat(ResType.MONEY, 9297600)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.CONSTRUCTION, 97280),
                        new ResStat(ResType.STEEL, 27881),
                        new ResStat(ResType.CONCRETE, 37174),
                        new ResStat(ResType.BRICK, 139404),
                        new ResStat(ResType.WOOD, 27881),
                        new ResStat(ResType.GLASS, 55762),
                        new ResStat(ResType.MONEY, 11152320)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.CONSTRUCTION, 112000),
                        new ResStat(ResType.STEEL, 33180),
                        new ResStat(ResType.CONCRETE, 44240),
                        new ResStat(ResType.BRICK, 165900),
                        new ResStat(ResType.WOOD, 33180),
                        new ResStat(ResType.GLASS, 66360),
                        new ResStat(ResType.MONEY, 13272000)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.CONSTRUCTION, 128000),
                        new ResStat(ResType.STEEL, 39180),
                        new ResStat(ResType.CONCRETE, 52240),
                        new ResStat(ResType.BRICK, 195900),
                        new ResStat(ResType.WOOD, 39180),
                        new ResStat(ResType.GLASS, 78360),
                        new ResStat(ResType.MONEY, 15672000)
                )
        });
        setProductionMultiplier(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.ENERGY, 2)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.ENERGY, 4)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.ENERGY, 6)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.ENERGY, 8)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.ENERGY, 10)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.ENERGY, 14)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.ENERGY, 18)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.ENERGY, 22)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.ENERGY, 26)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.ENERGY, 30)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.ENERGY, 36)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.ENERGY, 42)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.ENERGY, 48)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.ENERGY, 54)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.ENERGY, 60)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.ENERGY, 68)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.ENERGY, 76)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.ENERGY, 84)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.ENERGY, 92)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.ENERGY, 100)
                )
        });
        setJobRewardMultiplier(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.ENERGY, 2)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.ENERGY, 4)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.ENERGY, 6)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.ENERGY, 8)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.ENERGY, 10)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.ENERGY, 14)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.ENERGY, 18)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.ENERGY, 22)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.ENERGY, 26)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.ENERGY, 30)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.ENERGY, 36)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.ENERGY, 42)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.ENERGY, 48)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.ENERGY, 54)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.ENERGY, 60)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.ENERGY, 68)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.ENERGY, 76)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.ENERGY, 84)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.ENERGY, 92)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.ENERGY, 100)
                )
        });
        setDemand(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.POWER_CONSUMPTION, 5),
                        new ResStat(ResType.JOB, 100),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.POWER_CONSUMPTION, 10),
                        new ResStat(ResType.JOB, 200),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.POWER_CONSUMPTION, 15),
                        new ResStat(ResType.JOB, 300),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.POWER_CONSUMPTION, 20),
                        new ResStat(ResType.JOB, 400),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.POWER_CONSUMPTION, 25),
                        new ResStat(ResType.JOB, 500),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.POWER_CONSUMPTION, 35),
                        new ResStat(ResType.JOB, 700),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.POWER_CONSUMPTION, 45),
                        new ResStat(ResType.JOB, 900),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.POWER_CONSUMPTION, 55),
                        new ResStat(ResType.JOB, 1100),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.POWER_CONSUMPTION, 65),
                        new ResStat(ResType.JOB, 1300),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.POWER_CONSUMPTION, 75),
                        new ResStat(ResType.JOB, 1500),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.POWER_CONSUMPTION, 90),
                        new ResStat(ResType.JOB, 1800),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.POWER_CONSUMPTION, 105),
                        new ResStat(ResType.JOB, 2100),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.POWER_CONSUMPTION, 120),
                        new ResStat(ResType.JOB, 2400),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.POWER_CONSUMPTION, 135),
                        new ResStat(ResType.JOB, 2700),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.POWER_CONSUMPTION, 150),
                        new ResStat(ResType.JOB, 3000),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.POWER_CONSUMPTION, 170),
                        new ResStat(ResType.JOB, 3400),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.POWER_CONSUMPTION, 190),
                        new ResStat(ResType.JOB, 3800),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.POWER_CONSUMPTION, 210),
                        new ResStat(ResType.JOB, 4200),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.POWER_CONSUMPTION, 230),
                        new ResStat(ResType.JOB, 4600),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.POWER_CONSUMPTION, 250),
                        new ResStat(ResType.JOB, 5000),
                        new ResStat(ResType.IGNITABILITY, 1)
                )
        });
        setHold(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.POWER, 5),
                        new ResStat(ResType.WORKER, 100)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.POWER, 10),
                        new ResStat(ResType.WORKER, 200)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.POWER, 15),
                        new ResStat(ResType.WORKER, 300)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.POWER, 20),
                        new ResStat(ResType.WORKER, 400)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.POWER, 25),
                        new ResStat(ResType.WORKER, 500)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.POWER, 35),
                        new ResStat(ResType.WORKER, 700)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.POWER, 45),
                        new ResStat(ResType.WORKER, 900)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.POWER, 55),
                        new ResStat(ResType.WORKER, 1100)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.POWER, 65),
                        new ResStat(ResType.WORKER, 1300)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.POWER, 75),
                        new ResStat(ResType.WORKER, 1500)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.POWER, 90),
                        new ResStat(ResType.WORKER, 1800)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.POWER, 105),
                        new ResStat(ResType.WORKER, 2100)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.POWER, 120),
                        new ResStat(ResType.WORKER, 2400)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.POWER, 135),
                        new ResStat(ResType.WORKER, 2700)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.POWER, 150),
                        new ResStat(ResType.WORKER, 3000)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.POWER, 170),
                        new ResStat(ResType.WORKER, 3400)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.POWER, 190),
                        new ResStat(ResType.WORKER, 3800)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.POWER, 210),
                        new ResStat(ResType.WORKER, 4200)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.POWER, 230),
                        new ResStat(ResType.WORKER, 4600)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.POWER, 250),
                        new ResStat(ResType.WORKER, 5000)
                )
        });
        setCapacityMultiplier(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.ENERGY, 2)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.ENERGY, 4)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.ENERGY, 6)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.ENERGY, 8)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.ENERGY, 10)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.ENERGY, 14)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.ENERGY, 18)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.ENERGY, 22)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.ENERGY, 26)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.ENERGY, 30)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.ENERGY, 36)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.ENERGY, 42)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.ENERGY, 48)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.ENERGY, 54)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.ENERGY, 60)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.ENERGY, 68)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.ENERGY, 76)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.ENERGY, 84)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.ENERGY, 92)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.ENERGY, 100)
                )
        });
    }
}
