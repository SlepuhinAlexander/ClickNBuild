package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResChunk;
import org.itworks.clicknbuild.engine.model.ResPack;
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
        setBuildCost(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.CONSTRUCTION, 400),
                        new ResChunk(ResType.CONCRETE, 163),
                        new ResChunk(ResType.BRICK, 979),
                        new ResChunk(ResType.WOOD, 163),
                        new ResChunk(ResType.GLASS, 122),
                        new ResChunk(ResType.MONEY, 12240)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.CONSTRUCTION, 1200),
                        new ResChunk(ResType.CONCRETE, 496),
                        new ResChunk(ResType.BRICK, 2976),
                        new ResChunk(ResType.WOOD, 496),
                        new ResChunk(ResType.GLASS, 372),
                        new ResChunk(ResType.MONEY, 37200)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.CONSTRUCTION, 2400),
                        new ResChunk(ResType.CONCRETE, 1005),
                        new ResChunk(ResType.BRICK, 6029),
                        new ResChunk(ResType.WOOD, 1005),
                        new ResChunk(ResType.GLASS, 754),
                        new ResChunk(ResType.MONEY, 75360)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.CONSTRUCTION, 4000),
                        new ResChunk(ResType.CONCRETE, 1696),
                        new ResChunk(ResType.BRICK, 10176),
                        new ResChunk(ResType.WOOD, 1696),
                        new ResChunk(ResType.GLASS, 1272),
                        new ResChunk(ResType.MONEY, 127200)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.CONSTRUCTION, 6000),
                        new ResChunk(ResType.CONCRETE, 2576),
                        new ResChunk(ResType.BRICK, 15456),
                        new ResChunk(ResType.WOOD, 2576),
                        new ResChunk(ResType.GLASS, 1932),
                        new ResChunk(ResType.MONEY, 193200)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.CONSTRUCTION, 8800),
                        new ResChunk(ResType.CONCRETE, 3853),
                        new ResChunk(ResType.BRICK, 23117),
                        new ResChunk(ResType.WOOD, 3853),
                        new ResChunk(ResType.GLASS, 2890),
                        new ResChunk(ResType.MONEY, 288960)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.CONSTRUCTION, 12400),
                        new ResChunk(ResType.CONCRETE, 5552),
                        new ResChunk(ResType.BRICK, 33312),
                        new ResChunk(ResType.WOOD, 5552),
                        new ResChunk(ResType.GLASS, 4164),
                        new ResChunk(ResType.MONEY, 416400)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.CONSTRUCTION, 16800),
                        new ResChunk(ResType.CONCRETE, 7699),
                        new ResChunk(ResType.BRICK, 46195),
                        new ResChunk(ResType.WOOD, 7699),
                        new ResChunk(ResType.GLASS, 5774),
                        new ResChunk(ResType.MONEY, 577440)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.CONSTRUCTION, 22000),
                        new ResChunk(ResType.CONCRETE, 10320),
                        new ResChunk(ResType.BRICK, 61920),
                        new ResChunk(ResType.WOOD, 10320),
                        new ResChunk(ResType.GLASS, 7740),
                        new ResChunk(ResType.MONEY, 774000)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.CONSTRUCTION, 28000),
                        new ResChunk(ResType.CONCRETE, 13440),
                        new ResChunk(ResType.BRICK, 80640),
                        new ResChunk(ResType.WOOD, 13440),
                        new ResChunk(ResType.GLASS, 10080),
                        new ResChunk(ResType.MONEY, 1008000)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.CONSTRUCTION, 35200),
                        new ResChunk(ResType.CONCRETE, 17357),
                        new ResChunk(ResType.BRICK, 104141),
                        new ResChunk(ResType.WOOD, 17357),
                        new ResChunk(ResType.GLASS, 13018),
                        new ResChunk(ResType.MONEY, 1301760)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.CONSTRUCTION, 43600),
                        new ResChunk(ResType.CONCRETE, 22128),
                        new ResChunk(ResType.BRICK, 132768),
                        new ResChunk(ResType.WOOD, 22128),
                        new ResChunk(ResType.GLASS, 16596),
                        new ResChunk(ResType.MONEY, 1659600)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.CONSTRUCTION, 53200),
                        new ResChunk(ResType.CONCRETE, 27811),
                        new ResChunk(ResType.BRICK, 166867),
                        new ResChunk(ResType.WOOD, 27811),
                        new ResChunk(ResType.GLASS, 20858),
                        new ResChunk(ResType.MONEY, 2085840)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.CONSTRUCTION, 64000),
                        new ResChunk(ResType.CONCRETE, 34464),
                        new ResChunk(ResType.BRICK, 206784),
                        new ResChunk(ResType.WOOD, 34464),
                        new ResChunk(ResType.GLASS, 25848),
                        new ResChunk(ResType.MONEY, 2584800)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.CONSTRUCTION, 76000),
                        new ResChunk(ResType.CONCRETE, 42144),
                        new ResChunk(ResType.BRICK, 252864),
                        new ResChunk(ResType.WOOD, 42144),
                        new ResChunk(ResType.GLASS, 31608),
                        new ResChunk(ResType.MONEY, 3160800)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.CONSTRUCTION, 89600),
                        new ResChunk(ResType.CONCRETE, 51283),
                        new ResChunk(ResType.BRICK, 307699),
                        new ResChunk(ResType.WOOD, 51283),
                        new ResChunk(ResType.GLASS, 38462),
                        new ResChunk(ResType.MONEY, 3846240)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.CONSTRUCTION, 104800),
                        new ResChunk(ResType.CONCRETE, 61984),
                        new ResChunk(ResType.BRICK, 371904),
                        new ResChunk(ResType.WOOD, 61984),
                        new ResChunk(ResType.GLASS, 46488),
                        new ResChunk(ResType.MONEY, 4648800)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.CONSTRUCTION, 121600),
                        new ResChunk(ResType.CONCRETE, 74349),
                        new ResChunk(ResType.BRICK, 446093),
                        new ResChunk(ResType.WOOD, 74349),
                        new ResChunk(ResType.GLASS, 55762),
                        new ResChunk(ResType.MONEY, 5576160)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.CONSTRUCTION, 140000),
                        new ResChunk(ResType.CONCRETE, 88480),
                        new ResChunk(ResType.BRICK, 530880),
                        new ResChunk(ResType.WOOD, 88480),
                        new ResChunk(ResType.GLASS, 66360),
                        new ResChunk(ResType.MONEY, 6636000)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.CONSTRUCTION, 160000),
                        new ResChunk(ResType.CONCRETE, 104480),
                        new ResChunk(ResType.BRICK, 626880),
                        new ResChunk(ResType.WOOD, 104480),
                        new ResChunk(ResType.GLASS, 78360),
                        new ResChunk(ResType.MONEY, 7836000)
                ),
        });
        setProduction(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.MONEY, 40),
                        new ResChunk(ResType.CITIZEN, 1)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.MONEY, 80),
                        new ResChunk(ResType.CITIZEN, 2)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.MONEY, 120),
                        new ResChunk(ResType.CITIZEN, 3)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.MONEY, 160),
                        new ResChunk(ResType.CITIZEN, 4)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.MONEY, 200),
                        new ResChunk(ResType.CITIZEN, 5)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.MONEY, 280),
                        new ResChunk(ResType.CITIZEN, 7)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.MONEY, 360),
                        new ResChunk(ResType.CITIZEN, 9)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.MONEY, 440),
                        new ResChunk(ResType.CITIZEN, 11)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.MONEY, 520),
                        new ResChunk(ResType.CITIZEN, 13)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.MONEY, 600),
                        new ResChunk(ResType.CITIZEN, 15)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.MONEY, 720),
                        new ResChunk(ResType.CITIZEN, 18)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.MONEY, 840),
                        new ResChunk(ResType.CITIZEN, 21)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.MONEY, 960),
                        new ResChunk(ResType.CITIZEN, 24)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.MONEY, 1080),
                        new ResChunk(ResType.CITIZEN, 27)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.MONEY, 1200),
                        new ResChunk(ResType.CITIZEN, 30)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.MONEY, 1360),
                        new ResChunk(ResType.CITIZEN, 34)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.MONEY, 1520),
                        new ResChunk(ResType.CITIZEN, 38)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.MONEY, 1680),
                        new ResChunk(ResType.CITIZEN, 42)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.MONEY, 1840),
                        new ResChunk(ResType.CITIZEN, 46)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.MONEY, 2000),
                        new ResChunk(ResType.CITIZEN, 50)
                )
        });
        setJobPrice(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.ACTION, 24),
                        new ResChunk(ResType.ENERGY, 60)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.ACTION, 28),
                        new ResChunk(ResType.ENERGY, 70)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.ACTION, 32),
                        new ResChunk(ResType.ENERGY, 80)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.ACTION, 36),
                        new ResChunk(ResType.ENERGY, 90)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.ACTION, 40),
                        new ResChunk(ResType.ENERGY, 100)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.ACTION, 44),
                        new ResChunk(ResType.ENERGY, 110)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.ACTION, 48),
                        new ResChunk(ResType.ENERGY, 120)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.ACTION, 52),
                        new ResChunk(ResType.ENERGY, 130)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.ACTION, 56),
                        new ResChunk(ResType.ENERGY, 140)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.ACTION, 60),
                        new ResChunk(ResType.ENERGY, 150)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.ACTION, 64),
                        new ResChunk(ResType.ENERGY, 160)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.ACTION, 68),
                        new ResChunk(ResType.ENERGY, 170)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.ACTION, 72),
                        new ResChunk(ResType.ENERGY, 180)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.ACTION, 76),
                        new ResChunk(ResType.ENERGY, 190)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.ACTION, 80),
                        new ResChunk(ResType.ENERGY, 200)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.ACTION, 84),
                        new ResChunk(ResType.ENERGY, 210)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.ACTION, 88),
                        new ResChunk(ResType.ENERGY, 220)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.ACTION, 92),
                        new ResChunk(ResType.ENERGY, 230)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.ACTION, 96),
                        new ResChunk(ResType.ENERGY, 240)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.ACTION, 100),
                        new ResChunk(ResType.ENERGY, 250)
                )
        });
        setJobReward(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.CITIZEN, 1)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.CITIZEN, 2)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.CITIZEN, 3)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.CITIZEN, 4)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.CITIZEN, 5)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.CITIZEN, 7)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.CITIZEN, 9)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.CITIZEN, 11)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.CITIZEN, 13)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.CITIZEN, 15)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.CITIZEN, 18)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.CITIZEN, 21)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.CITIZEN, 24)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.CITIZEN, 27)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.CITIZEN, 30)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.CITIZEN, 34)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.CITIZEN, 38)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.CITIZEN, 42)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.CITIZEN, 46)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.CITIZEN, 50)
                )
        });
        setDemand(new ResPack[]{ // demand
                new ResPack( // 1
                        new ResChunk(ResType.POWER_CONSUMPTION, 4),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.POWER_CONSUMPTION, 8),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.POWER_CONSUMPTION, 12),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.POWER_CONSUMPTION, 16),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.POWER_CONSUMPTION, 20),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.POWER_CONSUMPTION, 28),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.POWER_CONSUMPTION, 36),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.POWER_CONSUMPTION, 44),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.POWER_CONSUMPTION, 52),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.POWER_CONSUMPTION, 60),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.POWER_CONSUMPTION, 72),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.POWER_CONSUMPTION, 84),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.POWER_CONSUMPTION, 96),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.POWER_CONSUMPTION, 108),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.POWER_CONSUMPTION, 120),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.POWER_CONSUMPTION, 136),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.POWER_CONSUMPTION, 152),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.POWER_CONSUMPTION, 168),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.POWER_CONSUMPTION, 184),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.POWER_CONSUMPTION, 200),
                        new ResChunk(ResType.IGNITABILITY, 1)
                )
        });
        setHold(new ResPack[]{ // hold
                new ResPack( // 1
                        new ResChunk(ResType.POWER, 4)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.POWER, 8)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.POWER, 12)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.POWER, 16)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.POWER, 20)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.POWER, 28)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.POWER, 36)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.POWER, 44)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.POWER, 52)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.POWER, 60)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.POWER, 72)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.POWER, 84)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.POWER, 96)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.POWER, 108)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.POWER, 120)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.POWER, 136)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.POWER, 152)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.POWER, 168)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.POWER, 184)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.POWER, 200)
                )
        });
        setStore(new ResPack[]{ // store
                new ResPack( // 1
                        new ResChunk(ResType.CITIZEN, 400)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.CITIZEN, 800)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.CITIZEN, 1200)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.CITIZEN, 1600)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.CITIZEN, 2000)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.CITIZEN, 2800)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.CITIZEN, 3600)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.CITIZEN, 4400)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.CITIZEN, 5200)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.CITIZEN, 6000)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.CITIZEN, 7200)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.CITIZEN, 8400)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.CITIZEN, 9600)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.CITIZEN, 10800)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.CITIZEN, 12000)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.CITIZEN, 13600)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.CITIZEN, 15200)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.CITIZEN, 16800)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.CITIZEN, 18400)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.CITIZEN, 20000)
                )
        });
    }
}

