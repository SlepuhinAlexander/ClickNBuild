package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResChunk;
import org.itworks.clicknbuild.engine.model.ResPack;
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
        setBuildCost(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.CONSTRUCTION, 360),
                        new ResChunk(ResType.STEEL, 73),
                        new ResChunk(ResType.CONCRETE, 734),
                        new ResChunk(ResType.BRICK, 367),
                        new ResChunk(ResType.MONEY, 18360)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.CONSTRUCTION, 1080),
                        new ResChunk(ResType.STEEL, 223),
                        new ResChunk(ResType.CONCRETE, 2232),
                        new ResChunk(ResType.BRICK, 1116),
                        new ResChunk(ResType.MONEY, 55800)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.CONSTRUCTION, 2160),
                        new ResChunk(ResType.STEEL, 452),
                        new ResChunk(ResType.CONCRETE, 4522),
                        new ResChunk(ResType.BRICK, 2261),
                        new ResChunk(ResType.MONEY, 113040)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.CONSTRUCTION, 3600),
                        new ResChunk(ResType.STEEL, 763),
                        new ResChunk(ResType.CONCRETE, 7632),
                        new ResChunk(ResType.BRICK, 3816),
                        new ResChunk(ResType.MONEY, 190800)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.CONSTRUCTION, 5400),
                        new ResChunk(ResType.STEEL, 1159),
                        new ResChunk(ResType.CONCRETE, 11592),
                        new ResChunk(ResType.BRICK, 5796),
                        new ResChunk(ResType.MONEY, 289800)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.CONSTRUCTION, 7920),
                        new ResChunk(ResType.STEEL, 1734),
                        new ResChunk(ResType.CONCRETE, 17338),
                        new ResChunk(ResType.BRICK, 8669),
                        new ResChunk(ResType.MONEY, 433440)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.CONSTRUCTION, 11160),
                        new ResChunk(ResType.STEEL, 2498),
                        new ResChunk(ResType.CONCRETE, 24984),
                        new ResChunk(ResType.BRICK, 12492),
                        new ResChunk(ResType.MONEY, 624600)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.CONSTRUCTION, 15120),
                        new ResChunk(ResType.STEEL, 3465),
                        new ResChunk(ResType.CONCRETE, 34646),
                        new ResChunk(ResType.BRICK, 17323),
                        new ResChunk(ResType.MONEY, 866160)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.CONSTRUCTION, 19800),
                        new ResChunk(ResType.STEEL, 4644),
                        new ResChunk(ResType.CONCRETE, 46440),
                        new ResChunk(ResType.BRICK, 23220),
                        new ResChunk(ResType.MONEY, 1161000)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.CONSTRUCTION, 25200),
                        new ResChunk(ResType.STEEL, 6048),
                        new ResChunk(ResType.CONCRETE, 60480),
                        new ResChunk(ResType.BRICK, 30240),
                        new ResChunk(ResType.MONEY, 1512000)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.CONSTRUCTION, 31680),
                        new ResChunk(ResType.STEEL, 7811),
                        new ResChunk(ResType.CONCRETE, 78106),
                        new ResChunk(ResType.BRICK, 39053),
                        new ResChunk(ResType.MONEY, 1952640)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.CONSTRUCTION, 39240),
                        new ResChunk(ResType.STEEL, 9958),
                        new ResChunk(ResType.CONCRETE, 99576),
                        new ResChunk(ResType.BRICK, 49788),
                        new ResChunk(ResType.MONEY, 2489400)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.CONSTRUCTION, 47880),
                        new ResChunk(ResType.STEEL, 12515),
                        new ResChunk(ResType.CONCRETE, 125150),
                        new ResChunk(ResType.BRICK, 62575),
                        new ResChunk(ResType.MONEY, 3128760)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.CONSTRUCTION, 57600),
                        new ResChunk(ResType.STEEL, 15509),
                        new ResChunk(ResType.CONCRETE, 155088),
                        new ResChunk(ResType.BRICK, 77544),
                        new ResChunk(ResType.MONEY, 3877200)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.CONSTRUCTION, 68400),
                        new ResChunk(ResType.STEEL, 18965),
                        new ResChunk(ResType.CONCRETE, 189648),
                        new ResChunk(ResType.BRICK, 94824),
                        new ResChunk(ResType.MONEY, 4741200)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.CONSTRUCTION, 80640),
                        new ResChunk(ResType.STEEL, 23077),
                        new ResChunk(ResType.CONCRETE, 230774),
                        new ResChunk(ResType.BRICK, 115387),
                        new ResChunk(ResType.MONEY, 5769360)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.CONSTRUCTION, 94320),
                        new ResChunk(ResType.STEEL, 27893),
                        new ResChunk(ResType.CONCRETE, 278928),
                        new ResChunk(ResType.BRICK, 139464),
                        new ResChunk(ResType.MONEY, 6973200)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.CONSTRUCTION, 109440),
                        new ResChunk(ResType.STEEL, 33457),
                        new ResChunk(ResType.CONCRETE, 334570),
                        new ResChunk(ResType.BRICK, 167285),
                        new ResChunk(ResType.MONEY, 8364240)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.CONSTRUCTION, 126000),
                        new ResChunk(ResType.STEEL, 39816),
                        new ResChunk(ResType.CONCRETE, 398160),
                        new ResChunk(ResType.BRICK, 199080),
                        new ResChunk(ResType.MONEY, 9954000)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.CONSTRUCTION, 144000),
                        new ResChunk(ResType.STEEL, 47016),
                        new ResChunk(ResType.CONCRETE, 470160),
                        new ResChunk(ResType.BRICK, 235080),
                        new ResChunk(ResType.MONEY, 11754000)
                )
        });
        setDemand(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.UPKEEP, 200),
                        new ResChunk(ResType.POWER_CONSUMPTION, 6),
                        new ResChunk(ResType.JOB, 120),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.UPKEEP, 400),
                        new ResChunk(ResType.POWER_CONSUMPTION, 12),
                        new ResChunk(ResType.JOB, 240),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.UPKEEP, 600),
                        new ResChunk(ResType.POWER_CONSUMPTION, 18),
                        new ResChunk(ResType.JOB, 360),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.UPKEEP, 800),
                        new ResChunk(ResType.POWER_CONSUMPTION, 24),
                        new ResChunk(ResType.JOB, 480),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.UPKEEP, 1000),
                        new ResChunk(ResType.POWER_CONSUMPTION, 30),
                        new ResChunk(ResType.JOB, 600),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.UPKEEP, 1400),
                        new ResChunk(ResType.POWER_CONSUMPTION, 42),
                        new ResChunk(ResType.JOB, 840),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.UPKEEP, 1800),
                        new ResChunk(ResType.POWER_CONSUMPTION, 54),
                        new ResChunk(ResType.JOB, 1080),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.UPKEEP, 2200),
                        new ResChunk(ResType.POWER_CONSUMPTION, 66),
                        new ResChunk(ResType.JOB, 1320),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.UPKEEP, 2600),
                        new ResChunk(ResType.POWER_CONSUMPTION, 78),
                        new ResChunk(ResType.JOB, 1560),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.UPKEEP, 3000),
                        new ResChunk(ResType.POWER_CONSUMPTION, 90),
                        new ResChunk(ResType.JOB, 1800),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.UPKEEP, 3600),
                        new ResChunk(ResType.POWER_CONSUMPTION, 108),
                        new ResChunk(ResType.JOB, 2160),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.UPKEEP, 4200),
                        new ResChunk(ResType.POWER_CONSUMPTION, 126),
                        new ResChunk(ResType.JOB, 2520),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.UPKEEP, 4800),
                        new ResChunk(ResType.POWER_CONSUMPTION, 144),
                        new ResChunk(ResType.JOB, 2880),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.UPKEEP, 5400),
                        new ResChunk(ResType.POWER_CONSUMPTION, 162),
                        new ResChunk(ResType.JOB, 3240),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.UPKEEP, 6000),
                        new ResChunk(ResType.POWER_CONSUMPTION, 180),
                        new ResChunk(ResType.JOB, 3600),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.UPKEEP, 6800),
                        new ResChunk(ResType.POWER_CONSUMPTION, 204),
                        new ResChunk(ResType.JOB, 4080),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.UPKEEP, 7600),
                        new ResChunk(ResType.POWER_CONSUMPTION, 228),
                        new ResChunk(ResType.JOB, 4560),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.UPKEEP, 8400),
                        new ResChunk(ResType.POWER_CONSUMPTION, 252),
                        new ResChunk(ResType.JOB, 5040),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.UPKEEP, 9200),
                        new ResChunk(ResType.POWER_CONSUMPTION, 276),
                        new ResChunk(ResType.JOB, 5520),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.UPKEEP, 10000),
                        new ResChunk(ResType.POWER_CONSUMPTION, 300),
                        new ResChunk(ResType.JOB, 6000),
                        new ResChunk(ResType.IGNITABILITY, 1)
                )
        });
        setHold(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.POWER, 6),
                        new ResChunk(ResType.WORKER, 120)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.POWER, 12),
                        new ResChunk(ResType.WORKER, 240)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.POWER, 18),
                        new ResChunk(ResType.WORKER, 360)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.POWER, 24),
                        new ResChunk(ResType.WORKER, 480)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.POWER, 30),
                        new ResChunk(ResType.WORKER, 600)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.POWER, 42),
                        new ResChunk(ResType.WORKER, 840)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.POWER, 54),
                        new ResChunk(ResType.WORKER, 1080)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.POWER, 66),
                        new ResChunk(ResType.WORKER, 1320)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.POWER, 78),
                        new ResChunk(ResType.WORKER, 1560)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.POWER, 90),
                        new ResChunk(ResType.WORKER, 1800)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.POWER, 108),
                        new ResChunk(ResType.WORKER, 2160)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.POWER, 126),
                        new ResChunk(ResType.WORKER, 2520)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.POWER, 144),
                        new ResChunk(ResType.WORKER, 2880)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.POWER, 162),
                        new ResChunk(ResType.WORKER, 3240)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.POWER, 180),
                        new ResChunk(ResType.WORKER, 3600)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.POWER, 204),
                        new ResChunk(ResType.WORKER, 4080)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.POWER, 228),
                        new ResChunk(ResType.WORKER, 4560)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.POWER, 252),
                        new ResChunk(ResType.WORKER, 5040)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.POWER, 276),
                        new ResChunk(ResType.WORKER, 5520)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.POWER, 300),
                        new ResChunk(ResType.WORKER, 6000)
                )
        });
        setStore(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.OBEDIENCE, 2000)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.OBEDIENCE, 4000)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.OBEDIENCE, 6000)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.OBEDIENCE, 8000)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.OBEDIENCE, 10000)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.OBEDIENCE, 14000)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.OBEDIENCE, 18000)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.OBEDIENCE, 22000)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.OBEDIENCE, 26000)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.OBEDIENCE, 30000)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.OBEDIENCE, 36000)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.OBEDIENCE, 42000)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.OBEDIENCE, 48000)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.OBEDIENCE, 54000)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.OBEDIENCE, 60000)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.OBEDIENCE, 68000)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.OBEDIENCE, 76000)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.OBEDIENCE, 84000)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.OBEDIENCE, 92000)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.OBEDIENCE, 100000)
                )
        });
    }
}
