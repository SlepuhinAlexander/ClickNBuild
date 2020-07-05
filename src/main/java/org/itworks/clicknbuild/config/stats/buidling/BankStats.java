package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResStat;
import org.itworks.clicknbuild.engine.model.ResStatPack;
import org.itworks.clicknbuild.engine.model.ResType;

public final class BankStats extends BuildingStats {
    private static volatile BankStats inst;

    private BankStats() {
    }

    public static BankStats inst() {
        BankStats local = inst;
        if (local == null) {
            synchronized (BankStats.class) {
                local = inst;
                if (local == null) {
                    inst = local = new BankStats();
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
                640, // 1
                1920, // 2
                3840, // 3
                6400, // 4
                9600, // 5
                14080, // 6
                19840, // 7
                26880, // 8
                35200, // 9
                44800, // 10
                56320, // 11
                69760, // 12
                85120, // 13
                102400, // 14
                121600, // 15
                143360, // 16
                167680, // 17
                194560, // 18
                224000, // 19
                256000 // 20
        });
        setBuildCost(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.CONSTRUCTION, 640),
                        new ResStat(ResType.STEEL, 367),
                        new ResStat(ResType.CONCRETE, 612),
                        new ResStat(ResType.BRICK, 230),
                        new ResStat(ResType.WOOD, 153),
                        new ResStat(ResType.GLASS, 765),
                        new ResStat(ResType.MONEY, 91800)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.CONSTRUCTION, 1920),
                        new ResStat(ResType.STEEL, 1116),
                        new ResStat(ResType.CONCRETE, 1860),
                        new ResStat(ResType.BRICK, 698),
                        new ResStat(ResType.WOOD, 465),
                        new ResStat(ResType.GLASS, 2325),
                        new ResStat(ResType.MONEY, 279000)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.CONSTRUCTION, 3840),
                        new ResStat(ResType.STEEL, 2261),
                        new ResStat(ResType.CONCRETE, 3768),
                        new ResStat(ResType.BRICK, 1413),
                        new ResStat(ResType.WOOD, 942),
                        new ResStat(ResType.GLASS, 4710),
                        new ResStat(ResType.MONEY, 565200)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.CONSTRUCTION, 6400),
                        new ResStat(ResType.STEEL, 3816),
                        new ResStat(ResType.CONCRETE, 6360),
                        new ResStat(ResType.BRICK, 2385),
                        new ResStat(ResType.WOOD, 1590),
                        new ResStat(ResType.GLASS, 7950),
                        new ResStat(ResType.MONEY, 954000)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.CONSTRUCTION, 9600),
                        new ResStat(ResType.STEEL, 5796),
                        new ResStat(ResType.CONCRETE, 9660),
                        new ResStat(ResType.BRICK, 3623),
                        new ResStat(ResType.WOOD, 2415),
                        new ResStat(ResType.GLASS, 12075),
                        new ResStat(ResType.MONEY, 1449000)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.CONSTRUCTION, 14080),
                        new ResStat(ResType.STEEL, 8669),
                        new ResStat(ResType.CONCRETE, 14448),
                        new ResStat(ResType.BRICK, 5418),
                        new ResStat(ResType.WOOD, 3612),
                        new ResStat(ResType.GLASS, 18060),
                        new ResStat(ResType.MONEY, 2167200)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.CONSTRUCTION, 19840),
                        new ResStat(ResType.STEEL, 12492),
                        new ResStat(ResType.CONCRETE, 20820),
                        new ResStat(ResType.BRICK, 7808),
                        new ResStat(ResType.WOOD, 5205),
                        new ResStat(ResType.GLASS, 26025),
                        new ResStat(ResType.MONEY, 3123000)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.CONSTRUCTION, 26880),
                        new ResStat(ResType.STEEL, 17323),
                        new ResStat(ResType.CONCRETE, 28872),
                        new ResStat(ResType.BRICK, 10827),
                        new ResStat(ResType.WOOD, 7218),
                        new ResStat(ResType.GLASS, 36090),
                        new ResStat(ResType.MONEY, 4330800)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.CONSTRUCTION, 35200),
                        new ResStat(ResType.STEEL, 23220),
                        new ResStat(ResType.CONCRETE, 38700),
                        new ResStat(ResType.BRICK, 14513),
                        new ResStat(ResType.WOOD, 9675),
                        new ResStat(ResType.GLASS, 48375),
                        new ResStat(ResType.MONEY, 5805000)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.CONSTRUCTION, 44800),
                        new ResStat(ResType.STEEL, 30240),
                        new ResStat(ResType.CONCRETE, 50400),
                        new ResStat(ResType.BRICK, 18900),
                        new ResStat(ResType.WOOD, 12600),
                        new ResStat(ResType.GLASS, 63000),
                        new ResStat(ResType.MONEY, 7560000)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.CONSTRUCTION, 56320),
                        new ResStat(ResType.STEEL, 39053),
                        new ResStat(ResType.CONCRETE, 65088),
                        new ResStat(ResType.BRICK, 24408),
                        new ResStat(ResType.WOOD, 16272),
                        new ResStat(ResType.GLASS, 81360),
                        new ResStat(ResType.MONEY, 9763200)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.CONSTRUCTION, 69760),
                        new ResStat(ResType.STEEL, 49788),
                        new ResStat(ResType.CONCRETE, 82980),
                        new ResStat(ResType.BRICK, 31118),
                        new ResStat(ResType.WOOD, 20745),
                        new ResStat(ResType.GLASS, 103725),
                        new ResStat(ResType.MONEY, 12447000)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.CONSTRUCTION, 85120),
                        new ResStat(ResType.STEEL, 62575),
                        new ResStat(ResType.CONCRETE, 104292),
                        new ResStat(ResType.BRICK, 39110),
                        new ResStat(ResType.WOOD, 26073),
                        new ResStat(ResType.GLASS, 130365),
                        new ResStat(ResType.MONEY, 15643800)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.CONSTRUCTION, 102400),
                        new ResStat(ResType.STEEL, 77544),
                        new ResStat(ResType.CONCRETE, 129240),
                        new ResStat(ResType.BRICK, 48465),
                        new ResStat(ResType.WOOD, 32310),
                        new ResStat(ResType.GLASS, 161550),
                        new ResStat(ResType.MONEY, 19386000)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.CONSTRUCTION, 121600),
                        new ResStat(ResType.STEEL, 94824),
                        new ResStat(ResType.CONCRETE, 158040),
                        new ResStat(ResType.BRICK, 59265),
                        new ResStat(ResType.WOOD, 39510),
                        new ResStat(ResType.GLASS, 197550),
                        new ResStat(ResType.MONEY, 23706000)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.CONSTRUCTION, 143360),
                        new ResStat(ResType.STEEL, 115387),
                        new ResStat(ResType.CONCRETE, 192312),
                        new ResStat(ResType.BRICK, 72117),
                        new ResStat(ResType.WOOD, 48078),
                        new ResStat(ResType.GLASS, 240390),
                        new ResStat(ResType.MONEY, 28846800)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.CONSTRUCTION, 167680),
                        new ResStat(ResType.STEEL, 139464),
                        new ResStat(ResType.CONCRETE, 232440),
                        new ResStat(ResType.BRICK, 87165),
                        new ResStat(ResType.WOOD, 58110),
                        new ResStat(ResType.GLASS, 290550),
                        new ResStat(ResType.MONEY, 34866000)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.CONSTRUCTION, 194560),
                        new ResStat(ResType.STEEL, 167285),
                        new ResStat(ResType.CONCRETE, 278808),
                        new ResStat(ResType.BRICK, 104553),
                        new ResStat(ResType.WOOD, 69702),
                        new ResStat(ResType.GLASS, 348510),
                        new ResStat(ResType.MONEY, 41821200)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.CONSTRUCTION, 224000),
                        new ResStat(ResType.STEEL, 199080),
                        new ResStat(ResType.CONCRETE, 331800),
                        new ResStat(ResType.BRICK, 124425),
                        new ResStat(ResType.WOOD, 82950),
                        new ResStat(ResType.GLASS, 414750),
                        new ResStat(ResType.MONEY, 49770000)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.CONSTRUCTION, 256000),
                        new ResStat(ResType.STEEL, 235080),
                        new ResStat(ResType.CONCRETE, 391800),
                        new ResStat(ResType.BRICK, 146925),
                        new ResStat(ResType.WOOD, 97950),
                        new ResStat(ResType.GLASS, 489750),
                        new ResStat(ResType.MONEY, 58770000)
                )
        });
        setProductionMultiplier(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.MONEY, 2)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.MONEY, 4)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.MONEY, 6)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.MONEY, 8)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.MONEY, 10)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.MONEY, 14)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.MONEY, 18)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.MONEY, 22)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.MONEY, 26)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.MONEY, 30)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.MONEY, 36)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.MONEY, 42)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.MONEY, 48)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.MONEY, 54)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.MONEY, 60)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.MONEY, 68)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.MONEY, 76)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.MONEY, 84)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.MONEY, 92)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.MONEY, 100)
                )
        });
        setJobRewardMultiplier(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.MONEY, 2)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.MONEY, 4)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.MONEY, 6)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.MONEY, 8)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.MONEY, 10)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.MONEY, 14)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.MONEY, 18)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.MONEY, 22)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.MONEY, 26)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.MONEY, 30)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.MONEY, 36)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.MONEY, 42)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.MONEY, 48)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.MONEY, 54)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.MONEY, 60)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.MONEY, 68)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.MONEY, 76)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.MONEY, 84)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.MONEY, 92)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.MONEY, 100)
                )
        });
        setDemand(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.POWER_CONSUMPTION, 9),
                        new ResStat(ResType.JOB, 180),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.POWER_CONSUMPTION, 18),
                        new ResStat(ResType.JOB, 360),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.POWER_CONSUMPTION, 27),
                        new ResStat(ResType.JOB, 540),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.POWER_CONSUMPTION, 36),
                        new ResStat(ResType.JOB, 720),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.POWER_CONSUMPTION, 45),
                        new ResStat(ResType.JOB, 900),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.POWER_CONSUMPTION, 63),
                        new ResStat(ResType.JOB, 1260),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.POWER_CONSUMPTION, 81),
                        new ResStat(ResType.JOB, 1620),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.POWER_CONSUMPTION, 99),
                        new ResStat(ResType.JOB, 1980),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.POWER_CONSUMPTION, 117),
                        new ResStat(ResType.JOB, 2340),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.POWER_CONSUMPTION, 135),
                        new ResStat(ResType.JOB, 2700),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.POWER_CONSUMPTION, 162),
                        new ResStat(ResType.JOB, 3240),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.POWER_CONSUMPTION, 189),
                        new ResStat(ResType.JOB, 3780),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.POWER_CONSUMPTION, 216),
                        new ResStat(ResType.JOB, 4320),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.POWER_CONSUMPTION, 243),
                        new ResStat(ResType.JOB, 4860),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.POWER_CONSUMPTION, 270),
                        new ResStat(ResType.JOB, 5400),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.POWER_CONSUMPTION, 306),
                        new ResStat(ResType.JOB, 6120),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.POWER_CONSUMPTION, 342),
                        new ResStat(ResType.JOB, 6840),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.POWER_CONSUMPTION, 378),
                        new ResStat(ResType.JOB, 7560),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.POWER_CONSUMPTION, 414),
                        new ResStat(ResType.JOB, 8280),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.POWER_CONSUMPTION, 450),
                        new ResStat(ResType.JOB, 9000),
                        new ResStat(ResType.IGNITABILITY, 1)
                )
        });
        setHold(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.POWER, 9),
                        new ResStat(ResType.WORKER, 180)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.POWER, 18),
                        new ResStat(ResType.WORKER, 360)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.POWER, 27),
                        new ResStat(ResType.WORKER, 540)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.POWER, 36),
                        new ResStat(ResType.WORKER, 720)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.POWER, 45),
                        new ResStat(ResType.WORKER, 900)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.POWER, 63),
                        new ResStat(ResType.WORKER, 1260)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.POWER, 81),
                        new ResStat(ResType.WORKER, 1620)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.POWER, 99),
                        new ResStat(ResType.WORKER, 1980)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.POWER, 117),
                        new ResStat(ResType.WORKER, 2340)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.POWER, 135),
                        new ResStat(ResType.WORKER, 2700)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.POWER, 162),
                        new ResStat(ResType.WORKER, 3240)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.POWER, 189),
                        new ResStat(ResType.WORKER, 3780)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.POWER, 216),
                        new ResStat(ResType.WORKER, 4320)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.POWER, 243),
                        new ResStat(ResType.WORKER, 4860)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.POWER, 270),
                        new ResStat(ResType.WORKER, 5400)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.POWER, 306),
                        new ResStat(ResType.WORKER, 6120)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.POWER, 342),
                        new ResStat(ResType.WORKER, 6840)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.POWER, 378),
                        new ResStat(ResType.WORKER, 7560)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.POWER, 414),
                        new ResStat(ResType.WORKER, 8280)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.POWER, 450),
                        new ResStat(ResType.WORKER, 9000)
                )
        });
        setCapacityMultiplier(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.MONEY, 2)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.MONEY, 4)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.MONEY, 6)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.MONEY, 8)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.MONEY, 10)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.MONEY, 14)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.MONEY, 18)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.MONEY, 22)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.MONEY, 26)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.MONEY, 30)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.MONEY, 36)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.MONEY, 42)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.MONEY, 48)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.MONEY, 54)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.MONEY, 60)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.MONEY, 68)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.MONEY, 76)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.MONEY, 84)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.MONEY, 92)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.MONEY, 100)
                )
        });
    }
}
