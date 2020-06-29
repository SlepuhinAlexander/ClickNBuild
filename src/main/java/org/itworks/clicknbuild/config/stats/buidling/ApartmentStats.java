package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;
import org.itworks.clicknbuild.engine.model.ResourceType;

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
                        new ResourceChunk(ResourceType.CONSTRUCTION, 400),
                        new ResourceChunk(ResourceType.CONCRETE, 163),
                        new ResourceChunk(ResourceType.BRICK, 979),
                        new ResourceChunk(ResourceType.WOOD, 163),
                        new ResourceChunk(ResourceType.GLASS, 122),
                        new ResourceChunk(ResourceType.MONEY, 12240)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.CONSTRUCTION, 1200),
                        new ResourceChunk(ResourceType.CONCRETE, 496),
                        new ResourceChunk(ResourceType.BRICK, 2976),
                        new ResourceChunk(ResourceType.WOOD, 496),
                        new ResourceChunk(ResourceType.GLASS, 372),
                        new ResourceChunk(ResourceType.MONEY, 37200)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.CONSTRUCTION, 2400),
                        new ResourceChunk(ResourceType.CONCRETE, 1005),
                        new ResourceChunk(ResourceType.BRICK, 6029),
                        new ResourceChunk(ResourceType.WOOD, 1005),
                        new ResourceChunk(ResourceType.GLASS, 754),
                        new ResourceChunk(ResourceType.MONEY, 75360)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.CONSTRUCTION, 4000),
                        new ResourceChunk(ResourceType.CONCRETE, 1696),
                        new ResourceChunk(ResourceType.BRICK, 10176),
                        new ResourceChunk(ResourceType.WOOD, 1696),
                        new ResourceChunk(ResourceType.GLASS, 1272),
                        new ResourceChunk(ResourceType.MONEY, 127200)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.CONSTRUCTION, 6000),
                        new ResourceChunk(ResourceType.CONCRETE, 2576),
                        new ResourceChunk(ResourceType.BRICK, 15456),
                        new ResourceChunk(ResourceType.WOOD, 2576),
                        new ResourceChunk(ResourceType.GLASS, 1932),
                        new ResourceChunk(ResourceType.MONEY, 193200)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.CONSTRUCTION, 8800),
                        new ResourceChunk(ResourceType.CONCRETE, 3853),
                        new ResourceChunk(ResourceType.BRICK, 23117),
                        new ResourceChunk(ResourceType.WOOD, 3853),
                        new ResourceChunk(ResourceType.GLASS, 2890),
                        new ResourceChunk(ResourceType.MONEY, 288960)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.CONSTRUCTION, 12400),
                        new ResourceChunk(ResourceType.CONCRETE, 5552),
                        new ResourceChunk(ResourceType.BRICK, 33312),
                        new ResourceChunk(ResourceType.WOOD, 5552),
                        new ResourceChunk(ResourceType.GLASS, 4164),
                        new ResourceChunk(ResourceType.MONEY, 416400)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.CONSTRUCTION, 16800),
                        new ResourceChunk(ResourceType.CONCRETE, 7699),
                        new ResourceChunk(ResourceType.BRICK, 46195),
                        new ResourceChunk(ResourceType.WOOD, 7699),
                        new ResourceChunk(ResourceType.GLASS, 5774),
                        new ResourceChunk(ResourceType.MONEY, 577440)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.CONSTRUCTION, 22000),
                        new ResourceChunk(ResourceType.CONCRETE, 10320),
                        new ResourceChunk(ResourceType.BRICK, 61920),
                        new ResourceChunk(ResourceType.WOOD, 10320),
                        new ResourceChunk(ResourceType.GLASS, 7740),
                        new ResourceChunk(ResourceType.MONEY, 774000)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.CONSTRUCTION, 28000),
                        new ResourceChunk(ResourceType.CONCRETE, 13440),
                        new ResourceChunk(ResourceType.BRICK, 80640),
                        new ResourceChunk(ResourceType.WOOD, 13440),
                        new ResourceChunk(ResourceType.GLASS, 10080),
                        new ResourceChunk(ResourceType.MONEY, 1008000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.CONSTRUCTION, 35200),
                        new ResourceChunk(ResourceType.CONCRETE, 17357),
                        new ResourceChunk(ResourceType.BRICK, 104141),
                        new ResourceChunk(ResourceType.WOOD, 17357),
                        new ResourceChunk(ResourceType.GLASS, 13018),
                        new ResourceChunk(ResourceType.MONEY, 1301760)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.CONSTRUCTION, 43600),
                        new ResourceChunk(ResourceType.CONCRETE, 22128),
                        new ResourceChunk(ResourceType.BRICK, 132768),
                        new ResourceChunk(ResourceType.WOOD, 22128),
                        new ResourceChunk(ResourceType.GLASS, 16596),
                        new ResourceChunk(ResourceType.MONEY, 1659600)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.CONSTRUCTION, 53200),
                        new ResourceChunk(ResourceType.CONCRETE, 27811),
                        new ResourceChunk(ResourceType.BRICK, 166867),
                        new ResourceChunk(ResourceType.WOOD, 27811),
                        new ResourceChunk(ResourceType.GLASS, 20858),
                        new ResourceChunk(ResourceType.MONEY, 2085840)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.CONSTRUCTION, 64000),
                        new ResourceChunk(ResourceType.CONCRETE, 34464),
                        new ResourceChunk(ResourceType.BRICK, 206784),
                        new ResourceChunk(ResourceType.WOOD, 34464),
                        new ResourceChunk(ResourceType.GLASS, 25848),
                        new ResourceChunk(ResourceType.MONEY, 2584800)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.CONSTRUCTION, 76000),
                        new ResourceChunk(ResourceType.CONCRETE, 42144),
                        new ResourceChunk(ResourceType.BRICK, 252864),
                        new ResourceChunk(ResourceType.WOOD, 42144),
                        new ResourceChunk(ResourceType.GLASS, 31608),
                        new ResourceChunk(ResourceType.MONEY, 3160800)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.CONSTRUCTION, 89600),
                        new ResourceChunk(ResourceType.CONCRETE, 51283),
                        new ResourceChunk(ResourceType.BRICK, 307699),
                        new ResourceChunk(ResourceType.WOOD, 51283),
                        new ResourceChunk(ResourceType.GLASS, 38462),
                        new ResourceChunk(ResourceType.MONEY, 3846240)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.CONSTRUCTION, 104800),
                        new ResourceChunk(ResourceType.CONCRETE, 61984),
                        new ResourceChunk(ResourceType.BRICK, 371904),
                        new ResourceChunk(ResourceType.WOOD, 61984),
                        new ResourceChunk(ResourceType.GLASS, 46488),
                        new ResourceChunk(ResourceType.MONEY, 4648800)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.CONSTRUCTION, 121600),
                        new ResourceChunk(ResourceType.CONCRETE, 74349),
                        new ResourceChunk(ResourceType.BRICK, 446093),
                        new ResourceChunk(ResourceType.WOOD, 74349),
                        new ResourceChunk(ResourceType.GLASS, 55762),
                        new ResourceChunk(ResourceType.MONEY, 5576160)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.CONSTRUCTION, 140000),
                        new ResourceChunk(ResourceType.CONCRETE, 88480),
                        new ResourceChunk(ResourceType.BRICK, 530880),
                        new ResourceChunk(ResourceType.WOOD, 88480),
                        new ResourceChunk(ResourceType.GLASS, 66360),
                        new ResourceChunk(ResourceType.MONEY, 6636000)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.CONSTRUCTION, 160000),
                        new ResourceChunk(ResourceType.CONCRETE, 104480),
                        new ResourceChunk(ResourceType.BRICK, 626880),
                        new ResourceChunk(ResourceType.WOOD, 104480),
                        new ResourceChunk(ResourceType.GLASS, 78360),
                        new ResourceChunk(ResourceType.MONEY, 7836000)
                ),
        });
        setProduction(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.MONEY, 40),
                        new ResourceChunk(ResourceType.CITIZEN, 1)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.MONEY, 80),
                        new ResourceChunk(ResourceType.CITIZEN, 2)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.MONEY, 120),
                        new ResourceChunk(ResourceType.CITIZEN, 3)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.MONEY, 160),
                        new ResourceChunk(ResourceType.CITIZEN, 4)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.MONEY, 200),
                        new ResourceChunk(ResourceType.CITIZEN, 5)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.MONEY, 280),
                        new ResourceChunk(ResourceType.CITIZEN, 7)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.MONEY, 360),
                        new ResourceChunk(ResourceType.CITIZEN, 9)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.MONEY, 440),
                        new ResourceChunk(ResourceType.CITIZEN, 11)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.MONEY, 520),
                        new ResourceChunk(ResourceType.CITIZEN, 13)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.MONEY, 600),
                        new ResourceChunk(ResourceType.CITIZEN, 15)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.MONEY, 720),
                        new ResourceChunk(ResourceType.CITIZEN, 18)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.MONEY, 840),
                        new ResourceChunk(ResourceType.CITIZEN, 21)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.MONEY, 960),
                        new ResourceChunk(ResourceType.CITIZEN, 24)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.MONEY, 1080),
                        new ResourceChunk(ResourceType.CITIZEN, 27)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.MONEY, 1200),
                        new ResourceChunk(ResourceType.CITIZEN, 30)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.MONEY, 1360),
                        new ResourceChunk(ResourceType.CITIZEN, 34)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.MONEY, 1520),
                        new ResourceChunk(ResourceType.CITIZEN, 38)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.MONEY, 1680),
                        new ResourceChunk(ResourceType.CITIZEN, 42)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.MONEY, 1840),
                        new ResourceChunk(ResourceType.CITIZEN, 46)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.MONEY, 2000),
                        new ResourceChunk(ResourceType.CITIZEN, 50)
                )
        });
        setJobPrice(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.ACTION, 24),
                        new ResourceChunk(ResourceType.ENERGY, 60)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.ACTION, 28),
                        new ResourceChunk(ResourceType.ENERGY, 70)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.ACTION, 32),
                        new ResourceChunk(ResourceType.ENERGY, 80)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.ACTION, 36),
                        new ResourceChunk(ResourceType.ENERGY, 90)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.ACTION, 40),
                        new ResourceChunk(ResourceType.ENERGY, 100)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.ACTION, 44),
                        new ResourceChunk(ResourceType.ENERGY, 110)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.ACTION, 48),
                        new ResourceChunk(ResourceType.ENERGY, 120)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.ACTION, 52),
                        new ResourceChunk(ResourceType.ENERGY, 130)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.ACTION, 56),
                        new ResourceChunk(ResourceType.ENERGY, 140)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.ACTION, 60),
                        new ResourceChunk(ResourceType.ENERGY, 150)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.ACTION, 64),
                        new ResourceChunk(ResourceType.ENERGY, 160)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.ACTION, 68),
                        new ResourceChunk(ResourceType.ENERGY, 170)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.ACTION, 72),
                        new ResourceChunk(ResourceType.ENERGY, 180)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.ACTION, 76),
                        new ResourceChunk(ResourceType.ENERGY, 190)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.ACTION, 80),
                        new ResourceChunk(ResourceType.ENERGY, 200)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.ACTION, 84),
                        new ResourceChunk(ResourceType.ENERGY, 210)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.ACTION, 88),
                        new ResourceChunk(ResourceType.ENERGY, 220)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.ACTION, 92),
                        new ResourceChunk(ResourceType.ENERGY, 230)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.ACTION, 96),
                        new ResourceChunk(ResourceType.ENERGY, 240)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.ACTION, 100),
                        new ResourceChunk(ResourceType.ENERGY, 250)
                )
        });
        setJobReward(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.CITIZEN, 1)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.CITIZEN, 2)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.CITIZEN, 3)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.CITIZEN, 4)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.CITIZEN, 5)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.CITIZEN, 7)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.CITIZEN, 9)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.CITIZEN, 11)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.CITIZEN, 13)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.CITIZEN, 15)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.CITIZEN, 18)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.CITIZEN, 21)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.CITIZEN, 24)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.CITIZEN, 27)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.CITIZEN, 30)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.CITIZEN, 34)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.CITIZEN, 38)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.CITIZEN, 42)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.CITIZEN, 46)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.CITIZEN, 50)
                )
        });
        setDemand(new ResourcePack[]{ // demand
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 4),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 8),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 12),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 16),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 20),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 28),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 36),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 44),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 52),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 60),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 72),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 84),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 96),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 108),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 120),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 136),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 152),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 168),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 184),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 200),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                )
        });
        setHold(new ResourcePack[]{ // hold
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.POWER, 4)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.POWER, 8)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.POWER, 12)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.POWER, 16)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.POWER, 20)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.POWER, 28)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.POWER, 36)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.POWER, 44)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.POWER, 52)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.POWER, 60)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.POWER, 72)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.POWER, 84)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.POWER, 96)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.POWER, 108)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.POWER, 120)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.POWER, 136)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.POWER, 152)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.POWER, 168)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.POWER, 184)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.POWER, 200)
                )
        });
        setStore(new ResourcePack[]{ // store
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.CITIZEN, 400)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.CITIZEN, 800)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.CITIZEN, 1200)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.CITIZEN, 1600)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.CITIZEN, 2000)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.CITIZEN, 2800)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.CITIZEN, 3600)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.CITIZEN, 4400)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.CITIZEN, 5200)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.CITIZEN, 6000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.CITIZEN, 7200)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.CITIZEN, 8400)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.CITIZEN, 9600)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.CITIZEN, 10800)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.CITIZEN, 12000)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.CITIZEN, 13600)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.CITIZEN, 15200)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.CITIZEN, 16800)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.CITIZEN, 18400)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.CITIZEN, 20000)
                )
        });
    }
}

