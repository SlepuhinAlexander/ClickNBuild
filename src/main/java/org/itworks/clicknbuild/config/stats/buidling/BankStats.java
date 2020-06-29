package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResChunk;
import org.itworks.clicknbuild.engine.model.ResPack;
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
        setBuildCost(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.CONSTRUCTION, 640),
                        new ResChunk(ResType.STEEL, 367),
                        new ResChunk(ResType.CONCRETE, 612),
                        new ResChunk(ResType.BRICK, 230),
                        new ResChunk(ResType.WOOD, 153),
                        new ResChunk(ResType.GLASS, 765),
                        new ResChunk(ResType.MONEY, 91800)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.CONSTRUCTION, 1920),
                        new ResChunk(ResType.STEEL, 1116),
                        new ResChunk(ResType.CONCRETE, 1860),
                        new ResChunk(ResType.BRICK, 698),
                        new ResChunk(ResType.WOOD, 465),
                        new ResChunk(ResType.GLASS, 2325),
                        new ResChunk(ResType.MONEY, 279000)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.CONSTRUCTION, 3840),
                        new ResChunk(ResType.STEEL, 2261),
                        new ResChunk(ResType.CONCRETE, 3768),
                        new ResChunk(ResType.BRICK, 1413),
                        new ResChunk(ResType.WOOD, 942),
                        new ResChunk(ResType.GLASS, 4710),
                        new ResChunk(ResType.MONEY, 565200)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.CONSTRUCTION, 6400),
                        new ResChunk(ResType.STEEL, 3816),
                        new ResChunk(ResType.CONCRETE, 6360),
                        new ResChunk(ResType.BRICK, 2385),
                        new ResChunk(ResType.WOOD, 1590),
                        new ResChunk(ResType.GLASS, 7950),
                        new ResChunk(ResType.MONEY, 954000)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.CONSTRUCTION, 9600),
                        new ResChunk(ResType.STEEL, 5796),
                        new ResChunk(ResType.CONCRETE, 9660),
                        new ResChunk(ResType.BRICK, 3623),
                        new ResChunk(ResType.WOOD, 2415),
                        new ResChunk(ResType.GLASS, 12075),
                        new ResChunk(ResType.MONEY, 1449000)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.CONSTRUCTION, 14080),
                        new ResChunk(ResType.STEEL, 8669),
                        new ResChunk(ResType.CONCRETE, 14448),
                        new ResChunk(ResType.BRICK, 5418),
                        new ResChunk(ResType.WOOD, 3612),
                        new ResChunk(ResType.GLASS, 18060),
                        new ResChunk(ResType.MONEY, 2167200)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.CONSTRUCTION, 19840),
                        new ResChunk(ResType.STEEL, 12492),
                        new ResChunk(ResType.CONCRETE, 20820),
                        new ResChunk(ResType.BRICK, 7808),
                        new ResChunk(ResType.WOOD, 5205),
                        new ResChunk(ResType.GLASS, 26025),
                        new ResChunk(ResType.MONEY, 3123000)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.CONSTRUCTION, 26880),
                        new ResChunk(ResType.STEEL, 17323),
                        new ResChunk(ResType.CONCRETE, 28872),
                        new ResChunk(ResType.BRICK, 10827),
                        new ResChunk(ResType.WOOD, 7218),
                        new ResChunk(ResType.GLASS, 36090),
                        new ResChunk(ResType.MONEY, 4330800)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.CONSTRUCTION, 35200),
                        new ResChunk(ResType.STEEL, 23220),
                        new ResChunk(ResType.CONCRETE, 38700),
                        new ResChunk(ResType.BRICK, 14513),
                        new ResChunk(ResType.WOOD, 9675),
                        new ResChunk(ResType.GLASS, 48375),
                        new ResChunk(ResType.MONEY, 5805000)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.CONSTRUCTION, 44800),
                        new ResChunk(ResType.STEEL, 30240),
                        new ResChunk(ResType.CONCRETE, 50400),
                        new ResChunk(ResType.BRICK, 18900),
                        new ResChunk(ResType.WOOD, 12600),
                        new ResChunk(ResType.GLASS, 63000),
                        new ResChunk(ResType.MONEY, 7560000)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.CONSTRUCTION, 56320),
                        new ResChunk(ResType.STEEL, 39053),
                        new ResChunk(ResType.CONCRETE, 65088),
                        new ResChunk(ResType.BRICK, 24408),
                        new ResChunk(ResType.WOOD, 16272),
                        new ResChunk(ResType.GLASS, 81360),
                        new ResChunk(ResType.MONEY, 9763200)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.CONSTRUCTION, 69760),
                        new ResChunk(ResType.STEEL, 49788),
                        new ResChunk(ResType.CONCRETE, 82980),
                        new ResChunk(ResType.BRICK, 31118),
                        new ResChunk(ResType.WOOD, 20745),
                        new ResChunk(ResType.GLASS, 103725),
                        new ResChunk(ResType.MONEY, 12447000)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.CONSTRUCTION, 85120),
                        new ResChunk(ResType.STEEL, 62575),
                        new ResChunk(ResType.CONCRETE, 104292),
                        new ResChunk(ResType.BRICK, 39110),
                        new ResChunk(ResType.WOOD, 26073),
                        new ResChunk(ResType.GLASS, 130365),
                        new ResChunk(ResType.MONEY, 15643800)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.CONSTRUCTION, 102400),
                        new ResChunk(ResType.STEEL, 77544),
                        new ResChunk(ResType.CONCRETE, 129240),
                        new ResChunk(ResType.BRICK, 48465),
                        new ResChunk(ResType.WOOD, 32310),
                        new ResChunk(ResType.GLASS, 161550),
                        new ResChunk(ResType.MONEY, 19386000)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.CONSTRUCTION, 121600),
                        new ResChunk(ResType.STEEL, 94824),
                        new ResChunk(ResType.CONCRETE, 158040),
                        new ResChunk(ResType.BRICK, 59265),
                        new ResChunk(ResType.WOOD, 39510),
                        new ResChunk(ResType.GLASS, 197550),
                        new ResChunk(ResType.MONEY, 23706000)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.CONSTRUCTION, 143360),
                        new ResChunk(ResType.STEEL, 115387),
                        new ResChunk(ResType.CONCRETE, 192312),
                        new ResChunk(ResType.BRICK, 72117),
                        new ResChunk(ResType.WOOD, 48078),
                        new ResChunk(ResType.GLASS, 240390),
                        new ResChunk(ResType.MONEY, 28846800)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.CONSTRUCTION, 167680),
                        new ResChunk(ResType.STEEL, 139464),
                        new ResChunk(ResType.CONCRETE, 232440),
                        new ResChunk(ResType.BRICK, 87165),
                        new ResChunk(ResType.WOOD, 58110),
                        new ResChunk(ResType.GLASS, 290550),
                        new ResChunk(ResType.MONEY, 34866000)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.CONSTRUCTION, 194560),
                        new ResChunk(ResType.STEEL, 167285),
                        new ResChunk(ResType.CONCRETE, 278808),
                        new ResChunk(ResType.BRICK, 104553),
                        new ResChunk(ResType.WOOD, 69702),
                        new ResChunk(ResType.GLASS, 348510),
                        new ResChunk(ResType.MONEY, 41821200)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.CONSTRUCTION, 224000),
                        new ResChunk(ResType.STEEL, 199080),
                        new ResChunk(ResType.CONCRETE, 331800),
                        new ResChunk(ResType.BRICK, 124425),
                        new ResChunk(ResType.WOOD, 82950),
                        new ResChunk(ResType.GLASS, 414750),
                        new ResChunk(ResType.MONEY, 49770000)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.CONSTRUCTION, 256000),
                        new ResChunk(ResType.STEEL, 235080),
                        new ResChunk(ResType.CONCRETE, 391800),
                        new ResChunk(ResType.BRICK, 146925),
                        new ResChunk(ResType.WOOD, 97950),
                        new ResChunk(ResType.GLASS, 489750),
                        new ResChunk(ResType.MONEY, 58770000)
                )
        });
        setProductionMultiplier(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.MONEY, 2)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.MONEY, 4)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.MONEY, 6)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.MONEY, 8)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.MONEY, 10)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.MONEY, 14)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.MONEY, 18)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.MONEY, 22)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.MONEY, 26)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.MONEY, 30)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.MONEY, 36)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.MONEY, 42)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.MONEY, 48)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.MONEY, 54)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.MONEY, 60)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.MONEY, 68)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.MONEY, 76)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.MONEY, 84)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.MONEY, 92)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.MONEY, 100)
                )
        });
        setJobRewardMultiplier(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.MONEY, 2)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.MONEY, 4)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.MONEY, 6)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.MONEY, 8)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.MONEY, 10)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.MONEY, 14)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.MONEY, 18)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.MONEY, 22)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.MONEY, 26)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.MONEY, 30)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.MONEY, 36)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.MONEY, 42)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.MONEY, 48)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.MONEY, 54)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.MONEY, 60)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.MONEY, 68)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.MONEY, 76)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.MONEY, 84)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.MONEY, 92)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.MONEY, 100)
                )
        });
        setDemand(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.POWER_CONSUMPTION, 9),
                        new ResChunk(ResType.JOB, 180),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.POWER_CONSUMPTION, 18),
                        new ResChunk(ResType.JOB, 360),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.POWER_CONSUMPTION, 27),
                        new ResChunk(ResType.JOB, 540),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.POWER_CONSUMPTION, 36),
                        new ResChunk(ResType.JOB, 720),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.POWER_CONSUMPTION, 45),
                        new ResChunk(ResType.JOB, 900),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.POWER_CONSUMPTION, 63),
                        new ResChunk(ResType.JOB, 1260),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.POWER_CONSUMPTION, 81),
                        new ResChunk(ResType.JOB, 1620),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.POWER_CONSUMPTION, 99),
                        new ResChunk(ResType.JOB, 1980),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.POWER_CONSUMPTION, 117),
                        new ResChunk(ResType.JOB, 2340),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.POWER_CONSUMPTION, 135),
                        new ResChunk(ResType.JOB, 2700),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.POWER_CONSUMPTION, 162),
                        new ResChunk(ResType.JOB, 3240),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.POWER_CONSUMPTION, 189),
                        new ResChunk(ResType.JOB, 3780),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.POWER_CONSUMPTION, 216),
                        new ResChunk(ResType.JOB, 4320),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.POWER_CONSUMPTION, 243),
                        new ResChunk(ResType.JOB, 4860),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.POWER_CONSUMPTION, 270),
                        new ResChunk(ResType.JOB, 5400),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.POWER_CONSUMPTION, 306),
                        new ResChunk(ResType.JOB, 6120),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.POWER_CONSUMPTION, 342),
                        new ResChunk(ResType.JOB, 6840),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.POWER_CONSUMPTION, 378),
                        new ResChunk(ResType.JOB, 7560),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.POWER_CONSUMPTION, 414),
                        new ResChunk(ResType.JOB, 8280),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.POWER_CONSUMPTION, 450),
                        new ResChunk(ResType.JOB, 9000),
                        new ResChunk(ResType.IGNITABILITY, 1)
                )
        });
        setHold(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.POWER, 9),
                        new ResChunk(ResType.WORKER, 180)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.POWER, 18),
                        new ResChunk(ResType.WORKER, 360)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.POWER, 27),
                        new ResChunk(ResType.WORKER, 540)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.POWER, 36),
                        new ResChunk(ResType.WORKER, 720)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.POWER, 45),
                        new ResChunk(ResType.WORKER, 900)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.POWER, 63),
                        new ResChunk(ResType.WORKER, 1260)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.POWER, 81),
                        new ResChunk(ResType.WORKER, 1620)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.POWER, 99),
                        new ResChunk(ResType.WORKER, 1980)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.POWER, 117),
                        new ResChunk(ResType.WORKER, 2340)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.POWER, 135),
                        new ResChunk(ResType.WORKER, 2700)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.POWER, 162),
                        new ResChunk(ResType.WORKER, 3240)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.POWER, 189),
                        new ResChunk(ResType.WORKER, 3780)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.POWER, 216),
                        new ResChunk(ResType.WORKER, 4320)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.POWER, 243),
                        new ResChunk(ResType.WORKER, 4860)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.POWER, 270),
                        new ResChunk(ResType.WORKER, 5400)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.POWER, 306),
                        new ResChunk(ResType.WORKER, 6120)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.POWER, 342),
                        new ResChunk(ResType.WORKER, 6840)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.POWER, 378),
                        new ResChunk(ResType.WORKER, 7560)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.POWER, 414),
                        new ResChunk(ResType.WORKER, 8280)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.POWER, 450),
                        new ResChunk(ResType.WORKER, 9000)
                )
        });
        setStoreMultiplier(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.MONEY, 2)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.MONEY, 4)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.MONEY, 6)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.MONEY, 8)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.MONEY, 10)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.MONEY, 14)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.MONEY, 18)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.MONEY, 22)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.MONEY, 26)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.MONEY, 30)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.MONEY, 36)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.MONEY, 42)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.MONEY, 48)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.MONEY, 54)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.MONEY, 60)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.MONEY, 68)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.MONEY, 76)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.MONEY, 84)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.MONEY, 92)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.MONEY, 100)
                )
        });
    }
}
