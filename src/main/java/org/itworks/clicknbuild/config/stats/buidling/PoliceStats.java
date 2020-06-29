package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;
import org.itworks.clicknbuild.engine.model.ResType;

public final class PoliceStats extends BuildingStats {
    private static volatile PoliceStats inst;

    private PoliceStats() {
    }

    public static PoliceStats inst() {
        PoliceStats local = inst;
        if (local == null) {
            synchronized (PoliceStats.class) {
                local = inst;
                if (local == null) {
                    inst = local = new PoliceStats();
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
                        new ResourceChunk(ResType.CONSTRUCTION, 360),
                        new ResourceChunk(ResType.STEEL, 73),
                        new ResourceChunk(ResType.CONCRETE, 734),
                        new ResourceChunk(ResType.BRICK, 367),
                        new ResourceChunk(ResType.MONEY, 18360)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.CONSTRUCTION, 1080),
                        new ResourceChunk(ResType.STEEL, 223),
                        new ResourceChunk(ResType.CONCRETE, 2232),
                        new ResourceChunk(ResType.BRICK, 1116),
                        new ResourceChunk(ResType.MONEY, 55800)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.CONSTRUCTION, 2160),
                        new ResourceChunk(ResType.STEEL, 452),
                        new ResourceChunk(ResType.CONCRETE, 4522),
                        new ResourceChunk(ResType.BRICK, 2261),
                        new ResourceChunk(ResType.MONEY, 113040)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.CONSTRUCTION, 3600),
                        new ResourceChunk(ResType.STEEL, 763),
                        new ResourceChunk(ResType.CONCRETE, 7632),
                        new ResourceChunk(ResType.BRICK, 3816),
                        new ResourceChunk(ResType.MONEY, 190800)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.CONSTRUCTION, 5400),
                        new ResourceChunk(ResType.STEEL, 1159),
                        new ResourceChunk(ResType.CONCRETE, 11592),
                        new ResourceChunk(ResType.BRICK, 5796),
                        new ResourceChunk(ResType.MONEY, 289800)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.CONSTRUCTION, 7920),
                        new ResourceChunk(ResType.STEEL, 1734),
                        new ResourceChunk(ResType.CONCRETE, 17338),
                        new ResourceChunk(ResType.BRICK, 8669),
                        new ResourceChunk(ResType.MONEY, 433440)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.CONSTRUCTION, 11160),
                        new ResourceChunk(ResType.STEEL, 2498),
                        new ResourceChunk(ResType.CONCRETE, 24984),
                        new ResourceChunk(ResType.BRICK, 12492),
                        new ResourceChunk(ResType.MONEY, 624600)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.CONSTRUCTION, 15120),
                        new ResourceChunk(ResType.STEEL, 3465),
                        new ResourceChunk(ResType.CONCRETE, 34646),
                        new ResourceChunk(ResType.BRICK, 17323),
                        new ResourceChunk(ResType.MONEY, 866160)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.CONSTRUCTION, 19800),
                        new ResourceChunk(ResType.STEEL, 4644),
                        new ResourceChunk(ResType.CONCRETE, 46440),
                        new ResourceChunk(ResType.BRICK, 23220),
                        new ResourceChunk(ResType.MONEY, 1161000)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.CONSTRUCTION, 25200),
                        new ResourceChunk(ResType.STEEL, 6048),
                        new ResourceChunk(ResType.CONCRETE, 60480),
                        new ResourceChunk(ResType.BRICK, 30240),
                        new ResourceChunk(ResType.MONEY, 1512000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.CONSTRUCTION, 31680),
                        new ResourceChunk(ResType.STEEL, 7811),
                        new ResourceChunk(ResType.CONCRETE, 78106),
                        new ResourceChunk(ResType.BRICK, 39053),
                        new ResourceChunk(ResType.MONEY, 1952640)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.CONSTRUCTION, 39240),
                        new ResourceChunk(ResType.STEEL, 9958),
                        new ResourceChunk(ResType.CONCRETE, 99576),
                        new ResourceChunk(ResType.BRICK, 49788),
                        new ResourceChunk(ResType.MONEY, 2489400)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.CONSTRUCTION, 47880),
                        new ResourceChunk(ResType.STEEL, 12515),
                        new ResourceChunk(ResType.CONCRETE, 125150),
                        new ResourceChunk(ResType.BRICK, 62575),
                        new ResourceChunk(ResType.MONEY, 3128760)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.CONSTRUCTION, 57600),
                        new ResourceChunk(ResType.STEEL, 15509),
                        new ResourceChunk(ResType.CONCRETE, 155088),
                        new ResourceChunk(ResType.BRICK, 77544),
                        new ResourceChunk(ResType.MONEY, 3877200)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.CONSTRUCTION, 68400),
                        new ResourceChunk(ResType.STEEL, 18965),
                        new ResourceChunk(ResType.CONCRETE, 189648),
                        new ResourceChunk(ResType.BRICK, 94824),
                        new ResourceChunk(ResType.MONEY, 4741200)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.CONSTRUCTION, 80640),
                        new ResourceChunk(ResType.STEEL, 23077),
                        new ResourceChunk(ResType.CONCRETE, 230774),
                        new ResourceChunk(ResType.BRICK, 115387),
                        new ResourceChunk(ResType.MONEY, 5769360)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.CONSTRUCTION, 94320),
                        new ResourceChunk(ResType.STEEL, 27893),
                        new ResourceChunk(ResType.CONCRETE, 278928),
                        new ResourceChunk(ResType.BRICK, 139464),
                        new ResourceChunk(ResType.MONEY, 6973200)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.CONSTRUCTION, 109440),
                        new ResourceChunk(ResType.STEEL, 33457),
                        new ResourceChunk(ResType.CONCRETE, 334570),
                        new ResourceChunk(ResType.BRICK, 167285),
                        new ResourceChunk(ResType.MONEY, 8364240)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.CONSTRUCTION, 126000),
                        new ResourceChunk(ResType.STEEL, 39816),
                        new ResourceChunk(ResType.CONCRETE, 398160),
                        new ResourceChunk(ResType.BRICK, 199080),
                        new ResourceChunk(ResType.MONEY, 9954000)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.CONSTRUCTION, 144000),
                        new ResourceChunk(ResType.STEEL, 47016),
                        new ResourceChunk(ResType.CONCRETE, 470160),
                        new ResourceChunk(ResType.BRICK, 235080),
                        new ResourceChunk(ResType.MONEY, 11754000)
                )
        });
        setDemand(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.UPKEEP, 200),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 6),
                        new ResourceChunk(ResType.JOB, 120),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.UPKEEP, 400),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 12),
                        new ResourceChunk(ResType.JOB, 240),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.UPKEEP, 600),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 18),
                        new ResourceChunk(ResType.JOB, 360),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.UPKEEP, 800),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 24),
                        new ResourceChunk(ResType.JOB, 480),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.UPKEEP, 1000),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 30),
                        new ResourceChunk(ResType.JOB, 600),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.UPKEEP, 1400),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 42),
                        new ResourceChunk(ResType.JOB, 840),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.UPKEEP, 1800),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 54),
                        new ResourceChunk(ResType.JOB, 1080),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.UPKEEP, 2200),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 66),
                        new ResourceChunk(ResType.JOB, 1320),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.UPKEEP, 2600),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 78),
                        new ResourceChunk(ResType.JOB, 1560),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.UPKEEP, 3000),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 90),
                        new ResourceChunk(ResType.JOB, 1800),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.UPKEEP, 3600),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 108),
                        new ResourceChunk(ResType.JOB, 2160),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.UPKEEP, 4200),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 126),
                        new ResourceChunk(ResType.JOB, 2520),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.UPKEEP, 4800),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 144),
                        new ResourceChunk(ResType.JOB, 2880),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.UPKEEP, 5400),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 162),
                        new ResourceChunk(ResType.JOB, 3240),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.UPKEEP, 6000),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 180),
                        new ResourceChunk(ResType.JOB, 3600),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.UPKEEP, 6800),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 204),
                        new ResourceChunk(ResType.JOB, 4080),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.UPKEEP, 7600),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 228),
                        new ResourceChunk(ResType.JOB, 4560),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.UPKEEP, 8400),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 252),
                        new ResourceChunk(ResType.JOB, 5040),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.UPKEEP, 9200),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 276),
                        new ResourceChunk(ResType.JOB, 5520),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.UPKEEP, 10000),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 300),
                        new ResourceChunk(ResType.JOB, 6000),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                )
        });
        setHold(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.POWER, 6),
                        new ResourceChunk(ResType.WORKER, 120)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.POWER, 12),
                        new ResourceChunk(ResType.WORKER, 240)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.POWER, 18),
                        new ResourceChunk(ResType.WORKER, 360)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.POWER, 24),
                        new ResourceChunk(ResType.WORKER, 480)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.POWER, 30),
                        new ResourceChunk(ResType.WORKER, 600)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.POWER, 42),
                        new ResourceChunk(ResType.WORKER, 840)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.POWER, 54),
                        new ResourceChunk(ResType.WORKER, 1080)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.POWER, 66),
                        new ResourceChunk(ResType.WORKER, 1320)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.POWER, 78),
                        new ResourceChunk(ResType.WORKER, 1560)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.POWER, 90),
                        new ResourceChunk(ResType.WORKER, 1800)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.POWER, 108),
                        new ResourceChunk(ResType.WORKER, 2160)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.POWER, 126),
                        new ResourceChunk(ResType.WORKER, 2520)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.POWER, 144),
                        new ResourceChunk(ResType.WORKER, 2880)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.POWER, 162),
                        new ResourceChunk(ResType.WORKER, 3240)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.POWER, 180),
                        new ResourceChunk(ResType.WORKER, 3600)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.POWER, 204),
                        new ResourceChunk(ResType.WORKER, 4080)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.POWER, 228),
                        new ResourceChunk(ResType.WORKER, 4560)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.POWER, 252),
                        new ResourceChunk(ResType.WORKER, 5040)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.POWER, 276),
                        new ResourceChunk(ResType.WORKER, 5520)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.POWER, 300),
                        new ResourceChunk(ResType.WORKER, 6000)
                )
        });
        setStore(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.OBEDIENCE, 2000)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.OBEDIENCE, 4000)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.OBEDIENCE, 6000)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.OBEDIENCE, 8000)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.OBEDIENCE, 10000)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.OBEDIENCE, 14000)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.OBEDIENCE, 18000)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.OBEDIENCE, 22000)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.OBEDIENCE, 26000)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.OBEDIENCE, 30000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.OBEDIENCE, 36000)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.OBEDIENCE, 42000)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.OBEDIENCE, 48000)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.OBEDIENCE, 54000)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.OBEDIENCE, 60000)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.OBEDIENCE, 68000)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.OBEDIENCE, 76000)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.OBEDIENCE, 84000)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.OBEDIENCE, 92000)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.OBEDIENCE, 100000)
                )
        });
    }
}
