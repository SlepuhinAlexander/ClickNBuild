package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;
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
        setBuildCost(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.CONSTRUCTION, 640),
                        new ResourceChunk(ResType.STEEL, 367),
                        new ResourceChunk(ResType.CONCRETE, 612),
                        new ResourceChunk(ResType.BRICK, 230),
                        new ResourceChunk(ResType.WOOD, 153),
                        new ResourceChunk(ResType.GLASS, 765),
                        new ResourceChunk(ResType.MONEY, 91800)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.CONSTRUCTION, 1920),
                        new ResourceChunk(ResType.STEEL, 1116),
                        new ResourceChunk(ResType.CONCRETE, 1860),
                        new ResourceChunk(ResType.BRICK, 698),
                        new ResourceChunk(ResType.WOOD, 465),
                        new ResourceChunk(ResType.GLASS, 2325),
                        new ResourceChunk(ResType.MONEY, 279000)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.CONSTRUCTION, 3840),
                        new ResourceChunk(ResType.STEEL, 2261),
                        new ResourceChunk(ResType.CONCRETE, 3768),
                        new ResourceChunk(ResType.BRICK, 1413),
                        new ResourceChunk(ResType.WOOD, 942),
                        new ResourceChunk(ResType.GLASS, 4710),
                        new ResourceChunk(ResType.MONEY, 565200)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.CONSTRUCTION, 6400),
                        new ResourceChunk(ResType.STEEL, 3816),
                        new ResourceChunk(ResType.CONCRETE, 6360),
                        new ResourceChunk(ResType.BRICK, 2385),
                        new ResourceChunk(ResType.WOOD, 1590),
                        new ResourceChunk(ResType.GLASS, 7950),
                        new ResourceChunk(ResType.MONEY, 954000)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.CONSTRUCTION, 9600),
                        new ResourceChunk(ResType.STEEL, 5796),
                        new ResourceChunk(ResType.CONCRETE, 9660),
                        new ResourceChunk(ResType.BRICK, 3623),
                        new ResourceChunk(ResType.WOOD, 2415),
                        new ResourceChunk(ResType.GLASS, 12075),
                        new ResourceChunk(ResType.MONEY, 1449000)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.CONSTRUCTION, 14080),
                        new ResourceChunk(ResType.STEEL, 8669),
                        new ResourceChunk(ResType.CONCRETE, 14448),
                        new ResourceChunk(ResType.BRICK, 5418),
                        new ResourceChunk(ResType.WOOD, 3612),
                        new ResourceChunk(ResType.GLASS, 18060),
                        new ResourceChunk(ResType.MONEY, 2167200)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.CONSTRUCTION, 19840),
                        new ResourceChunk(ResType.STEEL, 12492),
                        new ResourceChunk(ResType.CONCRETE, 20820),
                        new ResourceChunk(ResType.BRICK, 7808),
                        new ResourceChunk(ResType.WOOD, 5205),
                        new ResourceChunk(ResType.GLASS, 26025),
                        new ResourceChunk(ResType.MONEY, 3123000)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.CONSTRUCTION, 26880),
                        new ResourceChunk(ResType.STEEL, 17323),
                        new ResourceChunk(ResType.CONCRETE, 28872),
                        new ResourceChunk(ResType.BRICK, 10827),
                        new ResourceChunk(ResType.WOOD, 7218),
                        new ResourceChunk(ResType.GLASS, 36090),
                        new ResourceChunk(ResType.MONEY, 4330800)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.CONSTRUCTION, 35200),
                        new ResourceChunk(ResType.STEEL, 23220),
                        new ResourceChunk(ResType.CONCRETE, 38700),
                        new ResourceChunk(ResType.BRICK, 14513),
                        new ResourceChunk(ResType.WOOD, 9675),
                        new ResourceChunk(ResType.GLASS, 48375),
                        new ResourceChunk(ResType.MONEY, 5805000)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.CONSTRUCTION, 44800),
                        new ResourceChunk(ResType.STEEL, 30240),
                        new ResourceChunk(ResType.CONCRETE, 50400),
                        new ResourceChunk(ResType.BRICK, 18900),
                        new ResourceChunk(ResType.WOOD, 12600),
                        new ResourceChunk(ResType.GLASS, 63000),
                        new ResourceChunk(ResType.MONEY, 7560000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.CONSTRUCTION, 56320),
                        new ResourceChunk(ResType.STEEL, 39053),
                        new ResourceChunk(ResType.CONCRETE, 65088),
                        new ResourceChunk(ResType.BRICK, 24408),
                        new ResourceChunk(ResType.WOOD, 16272),
                        new ResourceChunk(ResType.GLASS, 81360),
                        new ResourceChunk(ResType.MONEY, 9763200)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.CONSTRUCTION, 69760),
                        new ResourceChunk(ResType.STEEL, 49788),
                        new ResourceChunk(ResType.CONCRETE, 82980),
                        new ResourceChunk(ResType.BRICK, 31118),
                        new ResourceChunk(ResType.WOOD, 20745),
                        new ResourceChunk(ResType.GLASS, 103725),
                        new ResourceChunk(ResType.MONEY, 12447000)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.CONSTRUCTION, 85120),
                        new ResourceChunk(ResType.STEEL, 62575),
                        new ResourceChunk(ResType.CONCRETE, 104292),
                        new ResourceChunk(ResType.BRICK, 39110),
                        new ResourceChunk(ResType.WOOD, 26073),
                        new ResourceChunk(ResType.GLASS, 130365),
                        new ResourceChunk(ResType.MONEY, 15643800)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.CONSTRUCTION, 102400),
                        new ResourceChunk(ResType.STEEL, 77544),
                        new ResourceChunk(ResType.CONCRETE, 129240),
                        new ResourceChunk(ResType.BRICK, 48465),
                        new ResourceChunk(ResType.WOOD, 32310),
                        new ResourceChunk(ResType.GLASS, 161550),
                        new ResourceChunk(ResType.MONEY, 19386000)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.CONSTRUCTION, 121600),
                        new ResourceChunk(ResType.STEEL, 94824),
                        new ResourceChunk(ResType.CONCRETE, 158040),
                        new ResourceChunk(ResType.BRICK, 59265),
                        new ResourceChunk(ResType.WOOD, 39510),
                        new ResourceChunk(ResType.GLASS, 197550),
                        new ResourceChunk(ResType.MONEY, 23706000)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.CONSTRUCTION, 143360),
                        new ResourceChunk(ResType.STEEL, 115387),
                        new ResourceChunk(ResType.CONCRETE, 192312),
                        new ResourceChunk(ResType.BRICK, 72117),
                        new ResourceChunk(ResType.WOOD, 48078),
                        new ResourceChunk(ResType.GLASS, 240390),
                        new ResourceChunk(ResType.MONEY, 28846800)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.CONSTRUCTION, 167680),
                        new ResourceChunk(ResType.STEEL, 139464),
                        new ResourceChunk(ResType.CONCRETE, 232440),
                        new ResourceChunk(ResType.BRICK, 87165),
                        new ResourceChunk(ResType.WOOD, 58110),
                        new ResourceChunk(ResType.GLASS, 290550),
                        new ResourceChunk(ResType.MONEY, 34866000)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.CONSTRUCTION, 194560),
                        new ResourceChunk(ResType.STEEL, 167285),
                        new ResourceChunk(ResType.CONCRETE, 278808),
                        new ResourceChunk(ResType.BRICK, 104553),
                        new ResourceChunk(ResType.WOOD, 69702),
                        new ResourceChunk(ResType.GLASS, 348510),
                        new ResourceChunk(ResType.MONEY, 41821200)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.CONSTRUCTION, 224000),
                        new ResourceChunk(ResType.STEEL, 199080),
                        new ResourceChunk(ResType.CONCRETE, 331800),
                        new ResourceChunk(ResType.BRICK, 124425),
                        new ResourceChunk(ResType.WOOD, 82950),
                        new ResourceChunk(ResType.GLASS, 414750),
                        new ResourceChunk(ResType.MONEY, 49770000)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.CONSTRUCTION, 256000),
                        new ResourceChunk(ResType.STEEL, 235080),
                        new ResourceChunk(ResType.CONCRETE, 391800),
                        new ResourceChunk(ResType.BRICK, 146925),
                        new ResourceChunk(ResType.WOOD, 97950),
                        new ResourceChunk(ResType.GLASS, 489750),
                        new ResourceChunk(ResType.MONEY, 58770000)
                )
        });
        setProductionMultiplier(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.MONEY, 2)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.MONEY, 4)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.MONEY, 6)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.MONEY, 8)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.MONEY, 10)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.MONEY, 14)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.MONEY, 18)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.MONEY, 22)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.MONEY, 26)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.MONEY, 30)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.MONEY, 36)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.MONEY, 42)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.MONEY, 48)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.MONEY, 54)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.MONEY, 60)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.MONEY, 68)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.MONEY, 76)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.MONEY, 84)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.MONEY, 92)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.MONEY, 100)
                )
        });
        setJobRewardMultiplier(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.MONEY, 2)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.MONEY, 4)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.MONEY, 6)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.MONEY, 8)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.MONEY, 10)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.MONEY, 14)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.MONEY, 18)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.MONEY, 22)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.MONEY, 26)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.MONEY, 30)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.MONEY, 36)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.MONEY, 42)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.MONEY, 48)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.MONEY, 54)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.MONEY, 60)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.MONEY, 68)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.MONEY, 76)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.MONEY, 84)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.MONEY, 92)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.MONEY, 100)
                )
        });
        setDemand(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 9),
                        new ResourceChunk(ResType.JOB, 180),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 18),
                        new ResourceChunk(ResType.JOB, 360),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 27),
                        new ResourceChunk(ResType.JOB, 540),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 36),
                        new ResourceChunk(ResType.JOB, 720),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 45),
                        new ResourceChunk(ResType.JOB, 900),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 63),
                        new ResourceChunk(ResType.JOB, 1260),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 81),
                        new ResourceChunk(ResType.JOB, 1620),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 99),
                        new ResourceChunk(ResType.JOB, 1980),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 117),
                        new ResourceChunk(ResType.JOB, 2340),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 135),
                        new ResourceChunk(ResType.JOB, 2700),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 162),
                        new ResourceChunk(ResType.JOB, 3240),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 189),
                        new ResourceChunk(ResType.JOB, 3780),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 216),
                        new ResourceChunk(ResType.JOB, 4320),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 243),
                        new ResourceChunk(ResType.JOB, 4860),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 270),
                        new ResourceChunk(ResType.JOB, 5400),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 306),
                        new ResourceChunk(ResType.JOB, 6120),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 342),
                        new ResourceChunk(ResType.JOB, 6840),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 378),
                        new ResourceChunk(ResType.JOB, 7560),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 414),
                        new ResourceChunk(ResType.JOB, 8280),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 450),
                        new ResourceChunk(ResType.JOB, 9000),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                )
        });
        setHold(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.POWER, 9),
                        new ResourceChunk(ResType.WORKER, 180)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.POWER, 18),
                        new ResourceChunk(ResType.WORKER, 360)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.POWER, 27),
                        new ResourceChunk(ResType.WORKER, 540)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.POWER, 36),
                        new ResourceChunk(ResType.WORKER, 720)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.POWER, 45),
                        new ResourceChunk(ResType.WORKER, 900)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.POWER, 63),
                        new ResourceChunk(ResType.WORKER, 1260)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.POWER, 81),
                        new ResourceChunk(ResType.WORKER, 1620)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.POWER, 99),
                        new ResourceChunk(ResType.WORKER, 1980)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.POWER, 117),
                        new ResourceChunk(ResType.WORKER, 2340)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.POWER, 135),
                        new ResourceChunk(ResType.WORKER, 2700)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.POWER, 162),
                        new ResourceChunk(ResType.WORKER, 3240)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.POWER, 189),
                        new ResourceChunk(ResType.WORKER, 3780)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.POWER, 216),
                        new ResourceChunk(ResType.WORKER, 4320)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.POWER, 243),
                        new ResourceChunk(ResType.WORKER, 4860)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.POWER, 270),
                        new ResourceChunk(ResType.WORKER, 5400)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.POWER, 306),
                        new ResourceChunk(ResType.WORKER, 6120)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.POWER, 342),
                        new ResourceChunk(ResType.WORKER, 6840)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.POWER, 378),
                        new ResourceChunk(ResType.WORKER, 7560)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.POWER, 414),
                        new ResourceChunk(ResType.WORKER, 8280)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.POWER, 450),
                        new ResourceChunk(ResType.WORKER, 9000)
                )
        });
        setStoreMultiplier(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.MONEY, 2)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.MONEY, 4)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.MONEY, 6)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.MONEY, 8)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.MONEY, 10)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.MONEY, 14)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.MONEY, 18)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.MONEY, 22)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.MONEY, 26)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.MONEY, 30)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.MONEY, 36)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.MONEY, 42)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.MONEY, 48)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.MONEY, 54)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.MONEY, 60)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.MONEY, 68)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.MONEY, 76)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.MONEY, 84)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.MONEY, 92)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.MONEY, 100)
                )
        });
    }
}
