package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResStat;
import org.itworks.clicknbuild.engine.model.ResStatPack;
import org.itworks.clicknbuild.engine.model.ResType;

public final class ApartmentStats extends BuildingStats {
    private static volatile ApartmentStats inst;

    private ApartmentStats() {
    }

    public static ApartmentStats inst() {
        ApartmentStats local = inst;
        if (local == null) {
            synchronized (ApartmentStats.class) {
                local = inst;
                if (local == null) {
                    inst = local = new ApartmentStats();
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
        setBuildLimit(1000);
        setPriceMultiplier(103);
        setStructure(new int[]{
                400, // 1
                1200, // 2
                2400, // 3
                4000, // 4
                6000, // 5
                8800, // 6
                12400, // 7
                16800, // 8
                22000, // 9
                28000, // 10
                35200, // 11
                43600, // 12
                53200, // 13
                64000, // 14
                76000, // 15
                89600, // 16
                104800, // 17
                121600, // 18
                140000, // 19
                160000 // 20
        });
        setBuildCost(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.CONSTRUCTION, 400),
                        new ResStat(ResType.CONCRETE, 163),
                        new ResStat(ResType.BRICK, 979),
                        new ResStat(ResType.WOOD, 163),
                        new ResStat(ResType.GLASS, 122),
                        new ResStat(ResType.MONEY, 12240)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.CONSTRUCTION, 1200),
                        new ResStat(ResType.CONCRETE, 496),
                        new ResStat(ResType.BRICK, 2976),
                        new ResStat(ResType.WOOD, 496),
                        new ResStat(ResType.GLASS, 372),
                        new ResStat(ResType.MONEY, 37200)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.CONSTRUCTION, 2400),
                        new ResStat(ResType.CONCRETE, 1005),
                        new ResStat(ResType.BRICK, 6029),
                        new ResStat(ResType.WOOD, 1005),
                        new ResStat(ResType.GLASS, 754),
                        new ResStat(ResType.MONEY, 75360)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.CONSTRUCTION, 4000),
                        new ResStat(ResType.CONCRETE, 1696),
                        new ResStat(ResType.BRICK, 10176),
                        new ResStat(ResType.WOOD, 1696),
                        new ResStat(ResType.GLASS, 1272),
                        new ResStat(ResType.MONEY, 127200)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.CONSTRUCTION, 6000),
                        new ResStat(ResType.CONCRETE, 2576),
                        new ResStat(ResType.BRICK, 15456),
                        new ResStat(ResType.WOOD, 2576),
                        new ResStat(ResType.GLASS, 1932),
                        new ResStat(ResType.MONEY, 193200)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.CONSTRUCTION, 8800),
                        new ResStat(ResType.CONCRETE, 3853),
                        new ResStat(ResType.BRICK, 23117),
                        new ResStat(ResType.WOOD, 3853),
                        new ResStat(ResType.GLASS, 2890),
                        new ResStat(ResType.MONEY, 288960)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.CONSTRUCTION, 12400),
                        new ResStat(ResType.CONCRETE, 5552),
                        new ResStat(ResType.BRICK, 33312),
                        new ResStat(ResType.WOOD, 5552),
                        new ResStat(ResType.GLASS, 4164),
                        new ResStat(ResType.MONEY, 416400)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.CONSTRUCTION, 16800),
                        new ResStat(ResType.CONCRETE, 7699),
                        new ResStat(ResType.BRICK, 46195),
                        new ResStat(ResType.WOOD, 7699),
                        new ResStat(ResType.GLASS, 5774),
                        new ResStat(ResType.MONEY, 577440)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.CONSTRUCTION, 22000),
                        new ResStat(ResType.CONCRETE, 10320),
                        new ResStat(ResType.BRICK, 61920),
                        new ResStat(ResType.WOOD, 10320),
                        new ResStat(ResType.GLASS, 7740),
                        new ResStat(ResType.MONEY, 774000)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.CONSTRUCTION, 28000),
                        new ResStat(ResType.CONCRETE, 13440),
                        new ResStat(ResType.BRICK, 80640),
                        new ResStat(ResType.WOOD, 13440),
                        new ResStat(ResType.GLASS, 10080),
                        new ResStat(ResType.MONEY, 1008000)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.CONSTRUCTION, 35200),
                        new ResStat(ResType.CONCRETE, 17357),
                        new ResStat(ResType.BRICK, 104141),
                        new ResStat(ResType.WOOD, 17357),
                        new ResStat(ResType.GLASS, 13018),
                        new ResStat(ResType.MONEY, 1301760)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.CONSTRUCTION, 43600),
                        new ResStat(ResType.CONCRETE, 22128),
                        new ResStat(ResType.BRICK, 132768),
                        new ResStat(ResType.WOOD, 22128),
                        new ResStat(ResType.GLASS, 16596),
                        new ResStat(ResType.MONEY, 1659600)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.CONSTRUCTION, 53200),
                        new ResStat(ResType.CONCRETE, 27811),
                        new ResStat(ResType.BRICK, 166867),
                        new ResStat(ResType.WOOD, 27811),
                        new ResStat(ResType.GLASS, 20858),
                        new ResStat(ResType.MONEY, 2085840)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.CONSTRUCTION, 64000),
                        new ResStat(ResType.CONCRETE, 34464),
                        new ResStat(ResType.BRICK, 206784),
                        new ResStat(ResType.WOOD, 34464),
                        new ResStat(ResType.GLASS, 25848),
                        new ResStat(ResType.MONEY, 2584800)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.CONSTRUCTION, 76000),
                        new ResStat(ResType.CONCRETE, 42144),
                        new ResStat(ResType.BRICK, 252864),
                        new ResStat(ResType.WOOD, 42144),
                        new ResStat(ResType.GLASS, 31608),
                        new ResStat(ResType.MONEY, 3160800)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.CONSTRUCTION, 89600),
                        new ResStat(ResType.CONCRETE, 51283),
                        new ResStat(ResType.BRICK, 307699),
                        new ResStat(ResType.WOOD, 51283),
                        new ResStat(ResType.GLASS, 38462),
                        new ResStat(ResType.MONEY, 3846240)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.CONSTRUCTION, 104800),
                        new ResStat(ResType.CONCRETE, 61984),
                        new ResStat(ResType.BRICK, 371904),
                        new ResStat(ResType.WOOD, 61984),
                        new ResStat(ResType.GLASS, 46488),
                        new ResStat(ResType.MONEY, 4648800)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.CONSTRUCTION, 121600),
                        new ResStat(ResType.CONCRETE, 74349),
                        new ResStat(ResType.BRICK, 446093),
                        new ResStat(ResType.WOOD, 74349),
                        new ResStat(ResType.GLASS, 55762),
                        new ResStat(ResType.MONEY, 5576160)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.CONSTRUCTION, 140000),
                        new ResStat(ResType.CONCRETE, 88480),
                        new ResStat(ResType.BRICK, 530880),
                        new ResStat(ResType.WOOD, 88480),
                        new ResStat(ResType.GLASS, 66360),
                        new ResStat(ResType.MONEY, 6636000)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.CONSTRUCTION, 160000),
                        new ResStat(ResType.CONCRETE, 104480),
                        new ResStat(ResType.BRICK, 626880),
                        new ResStat(ResType.WOOD, 104480),
                        new ResStat(ResType.GLASS, 78360),
                        new ResStat(ResType.MONEY, 7836000)
                ),
        });
        setProduction(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.MONEY, 40),
                        new ResStat(ResType.CITIZEN, 1)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.MONEY, 80),
                        new ResStat(ResType.CITIZEN, 2)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.MONEY, 120),
                        new ResStat(ResType.CITIZEN, 3)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.MONEY, 160),
                        new ResStat(ResType.CITIZEN, 4)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.MONEY, 200),
                        new ResStat(ResType.CITIZEN, 5)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.MONEY, 280),
                        new ResStat(ResType.CITIZEN, 7)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.MONEY, 360),
                        new ResStat(ResType.CITIZEN, 9)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.MONEY, 440),
                        new ResStat(ResType.CITIZEN, 11)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.MONEY, 520),
                        new ResStat(ResType.CITIZEN, 13)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.MONEY, 600),
                        new ResStat(ResType.CITIZEN, 15)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.MONEY, 720),
                        new ResStat(ResType.CITIZEN, 18)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.MONEY, 840),
                        new ResStat(ResType.CITIZEN, 21)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.MONEY, 960),
                        new ResStat(ResType.CITIZEN, 24)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.MONEY, 1080),
                        new ResStat(ResType.CITIZEN, 27)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.MONEY, 1200),
                        new ResStat(ResType.CITIZEN, 30)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.MONEY, 1360),
                        new ResStat(ResType.CITIZEN, 34)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.MONEY, 1520),
                        new ResStat(ResType.CITIZEN, 38)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.MONEY, 1680),
                        new ResStat(ResType.CITIZEN, 42)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.MONEY, 1840),
                        new ResStat(ResType.CITIZEN, 46)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.MONEY, 2000),
                        new ResStat(ResType.CITIZEN, 50)
                )
        });
        setJobPrice(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.ACTION, 24),
                        new ResStat(ResType.ENERGY, 60)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.ACTION, 28),
                        new ResStat(ResType.ENERGY, 70)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.ACTION, 32),
                        new ResStat(ResType.ENERGY, 80)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.ACTION, 36),
                        new ResStat(ResType.ENERGY, 90)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.ACTION, 40),
                        new ResStat(ResType.ENERGY, 100)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.ACTION, 44),
                        new ResStat(ResType.ENERGY, 110)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.ACTION, 48),
                        new ResStat(ResType.ENERGY, 120)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.ACTION, 52),
                        new ResStat(ResType.ENERGY, 130)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.ACTION, 56),
                        new ResStat(ResType.ENERGY, 140)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.ACTION, 60),
                        new ResStat(ResType.ENERGY, 150)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.ACTION, 64),
                        new ResStat(ResType.ENERGY, 160)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.ACTION, 68),
                        new ResStat(ResType.ENERGY, 170)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.ACTION, 72),
                        new ResStat(ResType.ENERGY, 180)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.ACTION, 76),
                        new ResStat(ResType.ENERGY, 190)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.ACTION, 80),
                        new ResStat(ResType.ENERGY, 200)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.ACTION, 84),
                        new ResStat(ResType.ENERGY, 210)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.ACTION, 88),
                        new ResStat(ResType.ENERGY, 220)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.ACTION, 92),
                        new ResStat(ResType.ENERGY, 230)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.ACTION, 96),
                        new ResStat(ResType.ENERGY, 240)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.ACTION, 100),
                        new ResStat(ResType.ENERGY, 250)
                )
        });
        setJobReward(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.CITIZEN, 1)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.CITIZEN, 2)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.CITIZEN, 3)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.CITIZEN, 4)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.CITIZEN, 5)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.CITIZEN, 7)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.CITIZEN, 9)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.CITIZEN, 11)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.CITIZEN, 13)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.CITIZEN, 15)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.CITIZEN, 18)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.CITIZEN, 21)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.CITIZEN, 24)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.CITIZEN, 27)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.CITIZEN, 30)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.CITIZEN, 34)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.CITIZEN, 38)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.CITIZEN, 42)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.CITIZEN, 46)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.CITIZEN, 50)
                )
        });
        setDemand(new ResStatPack[]{ // demand
                new ResStatPack( // 1
                        new ResStat(ResType.POWER_CONSUMPTION, 4),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.POWER_CONSUMPTION, 8),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.POWER_CONSUMPTION, 12),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.POWER_CONSUMPTION, 16),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.POWER_CONSUMPTION, 20),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.POWER_CONSUMPTION, 28),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.POWER_CONSUMPTION, 36),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.POWER_CONSUMPTION, 44),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.POWER_CONSUMPTION, 52),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.POWER_CONSUMPTION, 60),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.POWER_CONSUMPTION, 72),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.POWER_CONSUMPTION, 84),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.POWER_CONSUMPTION, 96),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.POWER_CONSUMPTION, 108),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.POWER_CONSUMPTION, 120),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.POWER_CONSUMPTION, 136),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.POWER_CONSUMPTION, 152),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.POWER_CONSUMPTION, 168),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.POWER_CONSUMPTION, 184),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.POWER_CONSUMPTION, 200),
                        new ResStat(ResType.IGNITABILITY, 1)
                )
        });
        setHold(new ResStatPack[]{ // hold
                new ResStatPack( // 1
                        new ResStat(ResType.POWER, 4)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.POWER, 8)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.POWER, 12)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.POWER, 16)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.POWER, 20)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.POWER, 28)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.POWER, 36)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.POWER, 44)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.POWER, 52)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.POWER, 60)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.POWER, 72)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.POWER, 84)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.POWER, 96)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.POWER, 108)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.POWER, 120)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.POWER, 136)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.POWER, 152)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.POWER, 168)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.POWER, 184)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.POWER, 200)
                )
        });
        setCapacity(new ResStatPack[]{ // store
                new ResStatPack( // 1
                        new ResStat(ResType.CITIZEN, 400)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.CITIZEN, 800)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.CITIZEN, 1200)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.CITIZEN, 1600)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.CITIZEN, 2000)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.CITIZEN, 2800)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.CITIZEN, 3600)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.CITIZEN, 4400)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.CITIZEN, 5200)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.CITIZEN, 6000)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.CITIZEN, 7200)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.CITIZEN, 8400)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.CITIZEN, 9600)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.CITIZEN, 10800)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.CITIZEN, 12000)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.CITIZEN, 13600)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.CITIZEN, 15200)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.CITIZEN, 16800)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.CITIZEN, 18400)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.CITIZEN, 20000)
                )
        });
    }
}

