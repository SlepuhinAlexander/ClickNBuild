package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;
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
        setBuildCost(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.CONSTRUCTION, 400),
                        new ResourceChunk(ResType.CONCRETE, 163),
                        new ResourceChunk(ResType.BRICK, 979),
                        new ResourceChunk(ResType.WOOD, 163),
                        new ResourceChunk(ResType.GLASS, 122),
                        new ResourceChunk(ResType.MONEY, 12240)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.CONSTRUCTION, 1200),
                        new ResourceChunk(ResType.CONCRETE, 496),
                        new ResourceChunk(ResType.BRICK, 2976),
                        new ResourceChunk(ResType.WOOD, 496),
                        new ResourceChunk(ResType.GLASS, 372),
                        new ResourceChunk(ResType.MONEY, 37200)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.CONSTRUCTION, 2400),
                        new ResourceChunk(ResType.CONCRETE, 1005),
                        new ResourceChunk(ResType.BRICK, 6029),
                        new ResourceChunk(ResType.WOOD, 1005),
                        new ResourceChunk(ResType.GLASS, 754),
                        new ResourceChunk(ResType.MONEY, 75360)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.CONSTRUCTION, 4000),
                        new ResourceChunk(ResType.CONCRETE, 1696),
                        new ResourceChunk(ResType.BRICK, 10176),
                        new ResourceChunk(ResType.WOOD, 1696),
                        new ResourceChunk(ResType.GLASS, 1272),
                        new ResourceChunk(ResType.MONEY, 127200)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.CONSTRUCTION, 6000),
                        new ResourceChunk(ResType.CONCRETE, 2576),
                        new ResourceChunk(ResType.BRICK, 15456),
                        new ResourceChunk(ResType.WOOD, 2576),
                        new ResourceChunk(ResType.GLASS, 1932),
                        new ResourceChunk(ResType.MONEY, 193200)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.CONSTRUCTION, 8800),
                        new ResourceChunk(ResType.CONCRETE, 3853),
                        new ResourceChunk(ResType.BRICK, 23117),
                        new ResourceChunk(ResType.WOOD, 3853),
                        new ResourceChunk(ResType.GLASS, 2890),
                        new ResourceChunk(ResType.MONEY, 288960)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.CONSTRUCTION, 12400),
                        new ResourceChunk(ResType.CONCRETE, 5552),
                        new ResourceChunk(ResType.BRICK, 33312),
                        new ResourceChunk(ResType.WOOD, 5552),
                        new ResourceChunk(ResType.GLASS, 4164),
                        new ResourceChunk(ResType.MONEY, 416400)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.CONSTRUCTION, 16800),
                        new ResourceChunk(ResType.CONCRETE, 7699),
                        new ResourceChunk(ResType.BRICK, 46195),
                        new ResourceChunk(ResType.WOOD, 7699),
                        new ResourceChunk(ResType.GLASS, 5774),
                        new ResourceChunk(ResType.MONEY, 577440)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.CONSTRUCTION, 22000),
                        new ResourceChunk(ResType.CONCRETE, 10320),
                        new ResourceChunk(ResType.BRICK, 61920),
                        new ResourceChunk(ResType.WOOD, 10320),
                        new ResourceChunk(ResType.GLASS, 7740),
                        new ResourceChunk(ResType.MONEY, 774000)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.CONSTRUCTION, 28000),
                        new ResourceChunk(ResType.CONCRETE, 13440),
                        new ResourceChunk(ResType.BRICK, 80640),
                        new ResourceChunk(ResType.WOOD, 13440),
                        new ResourceChunk(ResType.GLASS, 10080),
                        new ResourceChunk(ResType.MONEY, 1008000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.CONSTRUCTION, 35200),
                        new ResourceChunk(ResType.CONCRETE, 17357),
                        new ResourceChunk(ResType.BRICK, 104141),
                        new ResourceChunk(ResType.WOOD, 17357),
                        new ResourceChunk(ResType.GLASS, 13018),
                        new ResourceChunk(ResType.MONEY, 1301760)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.CONSTRUCTION, 43600),
                        new ResourceChunk(ResType.CONCRETE, 22128),
                        new ResourceChunk(ResType.BRICK, 132768),
                        new ResourceChunk(ResType.WOOD, 22128),
                        new ResourceChunk(ResType.GLASS, 16596),
                        new ResourceChunk(ResType.MONEY, 1659600)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.CONSTRUCTION, 53200),
                        new ResourceChunk(ResType.CONCRETE, 27811),
                        new ResourceChunk(ResType.BRICK, 166867),
                        new ResourceChunk(ResType.WOOD, 27811),
                        new ResourceChunk(ResType.GLASS, 20858),
                        new ResourceChunk(ResType.MONEY, 2085840)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.CONSTRUCTION, 64000),
                        new ResourceChunk(ResType.CONCRETE, 34464),
                        new ResourceChunk(ResType.BRICK, 206784),
                        new ResourceChunk(ResType.WOOD, 34464),
                        new ResourceChunk(ResType.GLASS, 25848),
                        new ResourceChunk(ResType.MONEY, 2584800)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.CONSTRUCTION, 76000),
                        new ResourceChunk(ResType.CONCRETE, 42144),
                        new ResourceChunk(ResType.BRICK, 252864),
                        new ResourceChunk(ResType.WOOD, 42144),
                        new ResourceChunk(ResType.GLASS, 31608),
                        new ResourceChunk(ResType.MONEY, 3160800)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.CONSTRUCTION, 89600),
                        new ResourceChunk(ResType.CONCRETE, 51283),
                        new ResourceChunk(ResType.BRICK, 307699),
                        new ResourceChunk(ResType.WOOD, 51283),
                        new ResourceChunk(ResType.GLASS, 38462),
                        new ResourceChunk(ResType.MONEY, 3846240)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.CONSTRUCTION, 104800),
                        new ResourceChunk(ResType.CONCRETE, 61984),
                        new ResourceChunk(ResType.BRICK, 371904),
                        new ResourceChunk(ResType.WOOD, 61984),
                        new ResourceChunk(ResType.GLASS, 46488),
                        new ResourceChunk(ResType.MONEY, 4648800)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.CONSTRUCTION, 121600),
                        new ResourceChunk(ResType.CONCRETE, 74349),
                        new ResourceChunk(ResType.BRICK, 446093),
                        new ResourceChunk(ResType.WOOD, 74349),
                        new ResourceChunk(ResType.GLASS, 55762),
                        new ResourceChunk(ResType.MONEY, 5576160)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.CONSTRUCTION, 140000),
                        new ResourceChunk(ResType.CONCRETE, 88480),
                        new ResourceChunk(ResType.BRICK, 530880),
                        new ResourceChunk(ResType.WOOD, 88480),
                        new ResourceChunk(ResType.GLASS, 66360),
                        new ResourceChunk(ResType.MONEY, 6636000)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.CONSTRUCTION, 160000),
                        new ResourceChunk(ResType.CONCRETE, 104480),
                        new ResourceChunk(ResType.BRICK, 626880),
                        new ResourceChunk(ResType.WOOD, 104480),
                        new ResourceChunk(ResType.GLASS, 78360),
                        new ResourceChunk(ResType.MONEY, 7836000)
                ),
        });
        setProduction(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.MONEY, 40),
                        new ResourceChunk(ResType.CITIZEN, 1)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.MONEY, 80),
                        new ResourceChunk(ResType.CITIZEN, 2)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.MONEY, 120),
                        new ResourceChunk(ResType.CITIZEN, 3)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.MONEY, 160),
                        new ResourceChunk(ResType.CITIZEN, 4)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.MONEY, 200),
                        new ResourceChunk(ResType.CITIZEN, 5)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.MONEY, 280),
                        new ResourceChunk(ResType.CITIZEN, 7)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.MONEY, 360),
                        new ResourceChunk(ResType.CITIZEN, 9)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.MONEY, 440),
                        new ResourceChunk(ResType.CITIZEN, 11)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.MONEY, 520),
                        new ResourceChunk(ResType.CITIZEN, 13)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.MONEY, 600),
                        new ResourceChunk(ResType.CITIZEN, 15)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.MONEY, 720),
                        new ResourceChunk(ResType.CITIZEN, 18)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.MONEY, 840),
                        new ResourceChunk(ResType.CITIZEN, 21)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.MONEY, 960),
                        new ResourceChunk(ResType.CITIZEN, 24)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.MONEY, 1080),
                        new ResourceChunk(ResType.CITIZEN, 27)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.MONEY, 1200),
                        new ResourceChunk(ResType.CITIZEN, 30)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.MONEY, 1360),
                        new ResourceChunk(ResType.CITIZEN, 34)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.MONEY, 1520),
                        new ResourceChunk(ResType.CITIZEN, 38)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.MONEY, 1680),
                        new ResourceChunk(ResType.CITIZEN, 42)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.MONEY, 1840),
                        new ResourceChunk(ResType.CITIZEN, 46)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.MONEY, 2000),
                        new ResourceChunk(ResType.CITIZEN, 50)
                )
        });
        setJobPrice(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.ACTION, 24),
                        new ResourceChunk(ResType.ENERGY, 60)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.ACTION, 28),
                        new ResourceChunk(ResType.ENERGY, 70)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.ACTION, 32),
                        new ResourceChunk(ResType.ENERGY, 80)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.ACTION, 36),
                        new ResourceChunk(ResType.ENERGY, 90)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.ACTION, 40),
                        new ResourceChunk(ResType.ENERGY, 100)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.ACTION, 44),
                        new ResourceChunk(ResType.ENERGY, 110)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.ACTION, 48),
                        new ResourceChunk(ResType.ENERGY, 120)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.ACTION, 52),
                        new ResourceChunk(ResType.ENERGY, 130)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.ACTION, 56),
                        new ResourceChunk(ResType.ENERGY, 140)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.ACTION, 60),
                        new ResourceChunk(ResType.ENERGY, 150)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.ACTION, 64),
                        new ResourceChunk(ResType.ENERGY, 160)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.ACTION, 68),
                        new ResourceChunk(ResType.ENERGY, 170)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.ACTION, 72),
                        new ResourceChunk(ResType.ENERGY, 180)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.ACTION, 76),
                        new ResourceChunk(ResType.ENERGY, 190)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.ACTION, 80),
                        new ResourceChunk(ResType.ENERGY, 200)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.ACTION, 84),
                        new ResourceChunk(ResType.ENERGY, 210)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.ACTION, 88),
                        new ResourceChunk(ResType.ENERGY, 220)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.ACTION, 92),
                        new ResourceChunk(ResType.ENERGY, 230)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.ACTION, 96),
                        new ResourceChunk(ResType.ENERGY, 240)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.ACTION, 100),
                        new ResourceChunk(ResType.ENERGY, 250)
                )
        });
        setJobReward(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.CITIZEN, 1)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.CITIZEN, 2)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.CITIZEN, 3)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.CITIZEN, 4)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.CITIZEN, 5)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.CITIZEN, 7)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.CITIZEN, 9)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.CITIZEN, 11)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.CITIZEN, 13)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.CITIZEN, 15)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.CITIZEN, 18)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.CITIZEN, 21)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.CITIZEN, 24)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.CITIZEN, 27)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.CITIZEN, 30)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.CITIZEN, 34)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.CITIZEN, 38)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.CITIZEN, 42)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.CITIZEN, 46)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.CITIZEN, 50)
                )
        });
        setDemand(new ResourcePack[]{ // demand
                new ResourcePack( // 1
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 4),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 8),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 12),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 16),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 20),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 28),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 36),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 44),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 52),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 60),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 72),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 84),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 96),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 108),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 120),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 136),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 152),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 168),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 184),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 200),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                )
        });
        setHold(new ResourcePack[]{ // hold
                new ResourcePack( // 1
                        new ResourceChunk(ResType.POWER, 4)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.POWER, 8)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.POWER, 12)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.POWER, 16)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.POWER, 20)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.POWER, 28)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.POWER, 36)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.POWER, 44)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.POWER, 52)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.POWER, 60)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.POWER, 72)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.POWER, 84)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.POWER, 96)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.POWER, 108)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.POWER, 120)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.POWER, 136)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.POWER, 152)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.POWER, 168)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.POWER, 184)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.POWER, 200)
                )
        });
        setStore(new ResourcePack[]{ // store
                new ResourcePack( // 1
                        new ResourceChunk(ResType.CITIZEN, 400)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.CITIZEN, 800)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.CITIZEN, 1200)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.CITIZEN, 1600)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.CITIZEN, 2000)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.CITIZEN, 2800)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.CITIZEN, 3600)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.CITIZEN, 4400)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.CITIZEN, 5200)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.CITIZEN, 6000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.CITIZEN, 7200)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.CITIZEN, 8400)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.CITIZEN, 9600)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.CITIZEN, 10800)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.CITIZEN, 12000)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.CITIZEN, 13600)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.CITIZEN, 15200)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.CITIZEN, 16800)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.CITIZEN, 18400)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.CITIZEN, 20000)
                )
        });
    }
}

