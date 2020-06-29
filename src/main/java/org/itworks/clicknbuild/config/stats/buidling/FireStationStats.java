package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;
import org.itworks.clicknbuild.engine.model.ResourceType;

public final class FireStationStats extends BuildingStats {
    private static volatile FireStationStats inst;

    private FireStationStats() {
    }

    public static FireStationStats inst() {
        FireStationStats local = inst;
        if (local == null) {
            synchronized (FireStationStats.class) {
                local = inst;
                if (local == null) {
                    inst = local = new FireStationStats();
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
        setPriceMultiplier(115);
        setStructure(new int[]{
                360, // 1
                1080, // 2
                2160, // 3
                3600, // 4
                5400, // 5
                7920, // 6
                11160, // 7
                15120, // 8
                19800, // 9
                25200, // 10
                31680, // 11
                39240, // 12
                47880, // 13
                57600, // 14
                68400, // 15
                80640, // 16
                94320, // 17
                109440, // 18
                126000, // 19
                144000 // 20
        });
        setBuildCost(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.CONSTRUCTION, 360),
                        new ResourceChunk(ResourceType.STEEL, 73),
                        new ResourceChunk(ResourceType.CONCRETE, 734),
                        new ResourceChunk(ResourceType.BRICK, 367),
                        new ResourceChunk(ResourceType.MONEY, 18360)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.CONSTRUCTION, 1080),
                        new ResourceChunk(ResourceType.STEEL, 223),
                        new ResourceChunk(ResourceType.CONCRETE, 2232),
                        new ResourceChunk(ResourceType.BRICK, 1116),
                        new ResourceChunk(ResourceType.MONEY, 55800)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.CONSTRUCTION, 2160),
                        new ResourceChunk(ResourceType.STEEL, 452),
                        new ResourceChunk(ResourceType.CONCRETE, 4522),
                        new ResourceChunk(ResourceType.BRICK, 2261),
                        new ResourceChunk(ResourceType.MONEY, 113040)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.CONSTRUCTION, 3600),
                        new ResourceChunk(ResourceType.STEEL, 763),
                        new ResourceChunk(ResourceType.CONCRETE, 7632),
                        new ResourceChunk(ResourceType.BRICK, 3816),
                        new ResourceChunk(ResourceType.MONEY, 190800)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.CONSTRUCTION, 5400),
                        new ResourceChunk(ResourceType.STEEL, 1159),
                        new ResourceChunk(ResourceType.CONCRETE, 11592),
                        new ResourceChunk(ResourceType.BRICK, 5796),
                        new ResourceChunk(ResourceType.MONEY, 289800)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.CONSTRUCTION, 7920),
                        new ResourceChunk(ResourceType.STEEL, 1734),
                        new ResourceChunk(ResourceType.CONCRETE, 17338),
                        new ResourceChunk(ResourceType.BRICK, 8669),
                        new ResourceChunk(ResourceType.MONEY, 433440)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.CONSTRUCTION, 11160),
                        new ResourceChunk(ResourceType.STEEL, 2498),
                        new ResourceChunk(ResourceType.CONCRETE, 24984),
                        new ResourceChunk(ResourceType.BRICK, 12492),
                        new ResourceChunk(ResourceType.MONEY, 624600)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.CONSTRUCTION, 15120),
                        new ResourceChunk(ResourceType.STEEL, 3465),
                        new ResourceChunk(ResourceType.CONCRETE, 34646),
                        new ResourceChunk(ResourceType.BRICK, 17323),
                        new ResourceChunk(ResourceType.MONEY, 866160)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.CONSTRUCTION, 19800),
                        new ResourceChunk(ResourceType.STEEL, 4644),
                        new ResourceChunk(ResourceType.CONCRETE, 46440),
                        new ResourceChunk(ResourceType.BRICK, 23220),
                        new ResourceChunk(ResourceType.MONEY, 1161000)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.CONSTRUCTION, 25200),
                        new ResourceChunk(ResourceType.STEEL, 6048),
                        new ResourceChunk(ResourceType.CONCRETE, 60480),
                        new ResourceChunk(ResourceType.BRICK, 30240),
                        new ResourceChunk(ResourceType.MONEY, 1512000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.CONSTRUCTION, 31680),
                        new ResourceChunk(ResourceType.STEEL, 7811),
                        new ResourceChunk(ResourceType.CONCRETE, 78106),
                        new ResourceChunk(ResourceType.BRICK, 39053),
                        new ResourceChunk(ResourceType.MONEY, 1952640)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.CONSTRUCTION, 39240),
                        new ResourceChunk(ResourceType.STEEL, 9958),
                        new ResourceChunk(ResourceType.CONCRETE, 99576),
                        new ResourceChunk(ResourceType.BRICK, 49788),
                        new ResourceChunk(ResourceType.MONEY, 2489400)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.CONSTRUCTION, 47880),
                        new ResourceChunk(ResourceType.STEEL, 12515),
                        new ResourceChunk(ResourceType.CONCRETE, 125150),
                        new ResourceChunk(ResourceType.BRICK, 62575),
                        new ResourceChunk(ResourceType.MONEY, 3128760)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.CONSTRUCTION, 57600),
                        new ResourceChunk(ResourceType.STEEL, 15509),
                        new ResourceChunk(ResourceType.CONCRETE, 155088),
                        new ResourceChunk(ResourceType.BRICK, 77544),
                        new ResourceChunk(ResourceType.MONEY, 3877200)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.CONSTRUCTION, 68400),
                        new ResourceChunk(ResourceType.STEEL, 18965),
                        new ResourceChunk(ResourceType.CONCRETE, 189648),
                        new ResourceChunk(ResourceType.BRICK, 94824),
                        new ResourceChunk(ResourceType.MONEY, 4741200)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.CONSTRUCTION, 80640),
                        new ResourceChunk(ResourceType.STEEL, 23077),
                        new ResourceChunk(ResourceType.CONCRETE, 230774),
                        new ResourceChunk(ResourceType.BRICK, 115387),
                        new ResourceChunk(ResourceType.MONEY, 5769360)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.CONSTRUCTION, 94320),
                        new ResourceChunk(ResourceType.STEEL, 27893),
                        new ResourceChunk(ResourceType.CONCRETE, 278928),
                        new ResourceChunk(ResourceType.BRICK, 139464),
                        new ResourceChunk(ResourceType.MONEY, 6973200)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.CONSTRUCTION, 109440),
                        new ResourceChunk(ResourceType.STEEL, 33457),
                        new ResourceChunk(ResourceType.CONCRETE, 334570),
                        new ResourceChunk(ResourceType.BRICK, 167285),
                        new ResourceChunk(ResourceType.MONEY, 8364240)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.CONSTRUCTION, 126000),
                        new ResourceChunk(ResourceType.STEEL, 39816),
                        new ResourceChunk(ResourceType.CONCRETE, 398160),
                        new ResourceChunk(ResourceType.BRICK, 199080),
                        new ResourceChunk(ResourceType.MONEY, 9954000)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.CONSTRUCTION, 144000),
                        new ResourceChunk(ResourceType.STEEL, 47016),
                        new ResourceChunk(ResourceType.CONCRETE, 470160),
                        new ResourceChunk(ResourceType.BRICK, 235080),
                        new ResourceChunk(ResourceType.MONEY, 11754000)
                )
        });
        setDemand(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.UPKEEP, 100),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 6),
                        new ResourceChunk(ResourceType.JOB, 120)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.UPKEEP, 200),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 12),
                        new ResourceChunk(ResourceType.JOB, 240)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.UPKEEP, 300),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 18),
                        new ResourceChunk(ResourceType.JOB, 360)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.UPKEEP, 400),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 24),
                        new ResourceChunk(ResourceType.JOB, 480)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.UPKEEP, 500),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 30),
                        new ResourceChunk(ResourceType.JOB, 600)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.UPKEEP, 700),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 42),
                        new ResourceChunk(ResourceType.JOB, 840)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.UPKEEP, 900),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 54),
                        new ResourceChunk(ResourceType.JOB, 1080)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.UPKEEP, 1100),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 66),
                        new ResourceChunk(ResourceType.JOB, 1320)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.UPKEEP, 1300),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 78),
                        new ResourceChunk(ResourceType.JOB, 1560)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.UPKEEP, 1500),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 90),
                        new ResourceChunk(ResourceType.JOB, 1800)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.UPKEEP, 1800),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 108),
                        new ResourceChunk(ResourceType.JOB, 2160)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.UPKEEP, 2100),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 126),
                        new ResourceChunk(ResourceType.JOB, 2520)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.UPKEEP, 2400),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 144),
                        new ResourceChunk(ResourceType.JOB, 2880)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.UPKEEP, 2700),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 162),
                        new ResourceChunk(ResourceType.JOB, 3240)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.UPKEEP, 3000),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 180),
                        new ResourceChunk(ResourceType.JOB, 3600)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.UPKEEP, 3400),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 204),
                        new ResourceChunk(ResourceType.JOB, 4080)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.UPKEEP, 3800),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 228),
                        new ResourceChunk(ResourceType.JOB, 4560)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.UPKEEP, 4200),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 252),
                        new ResourceChunk(ResourceType.JOB, 5040)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.UPKEEP, 4600),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 276),
                        new ResourceChunk(ResourceType.JOB, 5520)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.UPKEEP, 5000),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 300),
                        new ResourceChunk(ResourceType.JOB, 6000)
                )
        });
        setHold(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.POWER, 6),
                        new ResourceChunk(ResourceType.WORKER, 120)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.POWER, 12),
                        new ResourceChunk(ResourceType.WORKER, 240)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.POWER, 18),
                        new ResourceChunk(ResourceType.WORKER, 360)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.POWER, 24),
                        new ResourceChunk(ResourceType.WORKER, 480)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.POWER, 30),
                        new ResourceChunk(ResourceType.WORKER, 600)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.POWER, 42),
                        new ResourceChunk(ResourceType.WORKER, 840)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.POWER, 54),
                        new ResourceChunk(ResourceType.WORKER, 1080)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.POWER, 66),
                        new ResourceChunk(ResourceType.WORKER, 1320)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.POWER, 78),
                        new ResourceChunk(ResourceType.WORKER, 1560)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.POWER, 90),
                        new ResourceChunk(ResourceType.WORKER, 1800)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.POWER, 108),
                        new ResourceChunk(ResourceType.WORKER, 2160)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.POWER, 126),
                        new ResourceChunk(ResourceType.WORKER, 2520)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.POWER, 144),
                        new ResourceChunk(ResourceType.WORKER, 2880)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.POWER, 162),
                        new ResourceChunk(ResourceType.WORKER, 3240)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.POWER, 180),
                        new ResourceChunk(ResourceType.WORKER, 3600)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.POWER, 204),
                        new ResourceChunk(ResourceType.WORKER, 4080)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.POWER, 228),
                        new ResourceChunk(ResourceType.WORKER, 4560)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.POWER, 252),
                        new ResourceChunk(ResourceType.WORKER, 5040)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.POWER, 276),
                        new ResourceChunk(ResourceType.WORKER, 5520)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.POWER, 300),
                        new ResourceChunk(ResourceType.WORKER, 6000)
                )
        });
        setStore(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.IGNITABILITY, 2)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.IGNITABILITY, 3)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.IGNITABILITY, 4)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.IGNITABILITY, 5)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.IGNITABILITY, 7)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.IGNITABILITY, 9)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.IGNITABILITY, 11)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.IGNITABILITY, 13)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.IGNITABILITY, 15)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.IGNITABILITY, 18)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.IGNITABILITY, 21)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.IGNITABILITY, 24)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.IGNITABILITY, 27)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.IGNITABILITY, 30)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.IGNITABILITY, 34)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.IGNITABILITY, 38)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.IGNITABILITY, 42)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.IGNITABILITY, 46)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.IGNITABILITY, 50)
                )
        });
    }
}
