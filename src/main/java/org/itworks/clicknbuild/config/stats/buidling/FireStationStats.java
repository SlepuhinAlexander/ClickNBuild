package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResStat;
import org.itworks.clicknbuild.engine.model.ResStatPack;
import org.itworks.clicknbuild.engine.model.ResType;

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
        setBuildCost(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.CONSTRUCTION, 360),
                        new ResStat(ResType.STEEL, 73),
                        new ResStat(ResType.CONCRETE, 734),
                        new ResStat(ResType.BRICK, 367),
                        new ResStat(ResType.MONEY, 18360)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.CONSTRUCTION, 1080),
                        new ResStat(ResType.STEEL, 223),
                        new ResStat(ResType.CONCRETE, 2232),
                        new ResStat(ResType.BRICK, 1116),
                        new ResStat(ResType.MONEY, 55800)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.CONSTRUCTION, 2160),
                        new ResStat(ResType.STEEL, 452),
                        new ResStat(ResType.CONCRETE, 4522),
                        new ResStat(ResType.BRICK, 2261),
                        new ResStat(ResType.MONEY, 113040)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.CONSTRUCTION, 3600),
                        new ResStat(ResType.STEEL, 763),
                        new ResStat(ResType.CONCRETE, 7632),
                        new ResStat(ResType.BRICK, 3816),
                        new ResStat(ResType.MONEY, 190800)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.CONSTRUCTION, 5400),
                        new ResStat(ResType.STEEL, 1159),
                        new ResStat(ResType.CONCRETE, 11592),
                        new ResStat(ResType.BRICK, 5796),
                        new ResStat(ResType.MONEY, 289800)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.CONSTRUCTION, 7920),
                        new ResStat(ResType.STEEL, 1734),
                        new ResStat(ResType.CONCRETE, 17338),
                        new ResStat(ResType.BRICK, 8669),
                        new ResStat(ResType.MONEY, 433440)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.CONSTRUCTION, 11160),
                        new ResStat(ResType.STEEL, 2498),
                        new ResStat(ResType.CONCRETE, 24984),
                        new ResStat(ResType.BRICK, 12492),
                        new ResStat(ResType.MONEY, 624600)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.CONSTRUCTION, 15120),
                        new ResStat(ResType.STEEL, 3465),
                        new ResStat(ResType.CONCRETE, 34646),
                        new ResStat(ResType.BRICK, 17323),
                        new ResStat(ResType.MONEY, 866160)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.CONSTRUCTION, 19800),
                        new ResStat(ResType.STEEL, 4644),
                        new ResStat(ResType.CONCRETE, 46440),
                        new ResStat(ResType.BRICK, 23220),
                        new ResStat(ResType.MONEY, 1161000)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.CONSTRUCTION, 25200),
                        new ResStat(ResType.STEEL, 6048),
                        new ResStat(ResType.CONCRETE, 60480),
                        new ResStat(ResType.BRICK, 30240),
                        new ResStat(ResType.MONEY, 1512000)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.CONSTRUCTION, 31680),
                        new ResStat(ResType.STEEL, 7811),
                        new ResStat(ResType.CONCRETE, 78106),
                        new ResStat(ResType.BRICK, 39053),
                        new ResStat(ResType.MONEY, 1952640)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.CONSTRUCTION, 39240),
                        new ResStat(ResType.STEEL, 9958),
                        new ResStat(ResType.CONCRETE, 99576),
                        new ResStat(ResType.BRICK, 49788),
                        new ResStat(ResType.MONEY, 2489400)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.CONSTRUCTION, 47880),
                        new ResStat(ResType.STEEL, 12515),
                        new ResStat(ResType.CONCRETE, 125150),
                        new ResStat(ResType.BRICK, 62575),
                        new ResStat(ResType.MONEY, 3128760)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.CONSTRUCTION, 57600),
                        new ResStat(ResType.STEEL, 15509),
                        new ResStat(ResType.CONCRETE, 155088),
                        new ResStat(ResType.BRICK, 77544),
                        new ResStat(ResType.MONEY, 3877200)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.CONSTRUCTION, 68400),
                        new ResStat(ResType.STEEL, 18965),
                        new ResStat(ResType.CONCRETE, 189648),
                        new ResStat(ResType.BRICK, 94824),
                        new ResStat(ResType.MONEY, 4741200)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.CONSTRUCTION, 80640),
                        new ResStat(ResType.STEEL, 23077),
                        new ResStat(ResType.CONCRETE, 230774),
                        new ResStat(ResType.BRICK, 115387),
                        new ResStat(ResType.MONEY, 5769360)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.CONSTRUCTION, 94320),
                        new ResStat(ResType.STEEL, 27893),
                        new ResStat(ResType.CONCRETE, 278928),
                        new ResStat(ResType.BRICK, 139464),
                        new ResStat(ResType.MONEY, 6973200)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.CONSTRUCTION, 109440),
                        new ResStat(ResType.STEEL, 33457),
                        new ResStat(ResType.CONCRETE, 334570),
                        new ResStat(ResType.BRICK, 167285),
                        new ResStat(ResType.MONEY, 8364240)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.CONSTRUCTION, 126000),
                        new ResStat(ResType.STEEL, 39816),
                        new ResStat(ResType.CONCRETE, 398160),
                        new ResStat(ResType.BRICK, 199080),
                        new ResStat(ResType.MONEY, 9954000)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.CONSTRUCTION, 144000),
                        new ResStat(ResType.STEEL, 47016),
                        new ResStat(ResType.CONCRETE, 470160),
                        new ResStat(ResType.BRICK, 235080),
                        new ResStat(ResType.MONEY, 11754000)
                )
        });
        setDemand(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.UPKEEP, 100),
                        new ResStat(ResType.POWER_CONSUMPTION, 6),
                        new ResStat(ResType.JOB, 120)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.UPKEEP, 200),
                        new ResStat(ResType.POWER_CONSUMPTION, 12),
                        new ResStat(ResType.JOB, 240)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.UPKEEP, 300),
                        new ResStat(ResType.POWER_CONSUMPTION, 18),
                        new ResStat(ResType.JOB, 360)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.UPKEEP, 400),
                        new ResStat(ResType.POWER_CONSUMPTION, 24),
                        new ResStat(ResType.JOB, 480)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.UPKEEP, 500),
                        new ResStat(ResType.POWER_CONSUMPTION, 30),
                        new ResStat(ResType.JOB, 600)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.UPKEEP, 700),
                        new ResStat(ResType.POWER_CONSUMPTION, 42),
                        new ResStat(ResType.JOB, 840)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.UPKEEP, 900),
                        new ResStat(ResType.POWER_CONSUMPTION, 54),
                        new ResStat(ResType.JOB, 1080)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.UPKEEP, 1100),
                        new ResStat(ResType.POWER_CONSUMPTION, 66),
                        new ResStat(ResType.JOB, 1320)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.UPKEEP, 1300),
                        new ResStat(ResType.POWER_CONSUMPTION, 78),
                        new ResStat(ResType.JOB, 1560)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.UPKEEP, 1500),
                        new ResStat(ResType.POWER_CONSUMPTION, 90),
                        new ResStat(ResType.JOB, 1800)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.UPKEEP, 1800),
                        new ResStat(ResType.POWER_CONSUMPTION, 108),
                        new ResStat(ResType.JOB, 2160)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.UPKEEP, 2100),
                        new ResStat(ResType.POWER_CONSUMPTION, 126),
                        new ResStat(ResType.JOB, 2520)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.UPKEEP, 2400),
                        new ResStat(ResType.POWER_CONSUMPTION, 144),
                        new ResStat(ResType.JOB, 2880)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.UPKEEP, 2700),
                        new ResStat(ResType.POWER_CONSUMPTION, 162),
                        new ResStat(ResType.JOB, 3240)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.UPKEEP, 3000),
                        new ResStat(ResType.POWER_CONSUMPTION, 180),
                        new ResStat(ResType.JOB, 3600)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.UPKEEP, 3400),
                        new ResStat(ResType.POWER_CONSUMPTION, 204),
                        new ResStat(ResType.JOB, 4080)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.UPKEEP, 3800),
                        new ResStat(ResType.POWER_CONSUMPTION, 228),
                        new ResStat(ResType.JOB, 4560)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.UPKEEP, 4200),
                        new ResStat(ResType.POWER_CONSUMPTION, 252),
                        new ResStat(ResType.JOB, 5040)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.UPKEEP, 4600),
                        new ResStat(ResType.POWER_CONSUMPTION, 276),
                        new ResStat(ResType.JOB, 5520)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.UPKEEP, 5000),
                        new ResStat(ResType.POWER_CONSUMPTION, 300),
                        new ResStat(ResType.JOB, 6000)
                )
        });
        setHold(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.POWER, 6),
                        new ResStat(ResType.WORKER, 120)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.POWER, 12),
                        new ResStat(ResType.WORKER, 240)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.POWER, 18),
                        new ResStat(ResType.WORKER, 360)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.POWER, 24),
                        new ResStat(ResType.WORKER, 480)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.POWER, 30),
                        new ResStat(ResType.WORKER, 600)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.POWER, 42),
                        new ResStat(ResType.WORKER, 840)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.POWER, 54),
                        new ResStat(ResType.WORKER, 1080)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.POWER, 66),
                        new ResStat(ResType.WORKER, 1320)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.POWER, 78),
                        new ResStat(ResType.WORKER, 1560)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.POWER, 90),
                        new ResStat(ResType.WORKER, 1800)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.POWER, 108),
                        new ResStat(ResType.WORKER, 2160)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.POWER, 126),
                        new ResStat(ResType.WORKER, 2520)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.POWER, 144),
                        new ResStat(ResType.WORKER, 2880)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.POWER, 162),
                        new ResStat(ResType.WORKER, 3240)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.POWER, 180),
                        new ResStat(ResType.WORKER, 3600)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.POWER, 204),
                        new ResStat(ResType.WORKER, 4080)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.POWER, 228),
                        new ResStat(ResType.WORKER, 4560)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.POWER, 252),
                        new ResStat(ResType.WORKER, 5040)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.POWER, 276),
                        new ResStat(ResType.WORKER, 5520)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.POWER, 300),
                        new ResStat(ResType.WORKER, 6000)
                )
        });
        setStore(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.IGNITABILITY, 2)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.IGNITABILITY, 3)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.IGNITABILITY, 4)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.IGNITABILITY, 5)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.IGNITABILITY, 7)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.IGNITABILITY, 9)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.IGNITABILITY, 11)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.IGNITABILITY, 13)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.IGNITABILITY, 15)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.IGNITABILITY, 18)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.IGNITABILITY, 21)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.IGNITABILITY, 24)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.IGNITABILITY, 27)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.IGNITABILITY, 30)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.IGNITABILITY, 34)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.IGNITABILITY, 38)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.IGNITABILITY, 42)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.IGNITABILITY, 46)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.IGNITABILITY, 50)
                )
        });
    }
}
