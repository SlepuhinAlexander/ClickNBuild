package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;
import org.itworks.clicknbuild.engine.model.ResourceType;

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
                        new ResourceChunk(ResourceType.CONSTRUCTION, 640),
                        new ResourceChunk(ResourceType.STEEL, 367),
                        new ResourceChunk(ResourceType.CONCRETE, 612),
                        new ResourceChunk(ResourceType.BRICK, 230),
                        new ResourceChunk(ResourceType.WOOD, 153),
                        new ResourceChunk(ResourceType.GLASS, 765),
                        new ResourceChunk(ResourceType.MONEY, 91800)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.CONSTRUCTION, 1920),
                        new ResourceChunk(ResourceType.STEEL, 1116),
                        new ResourceChunk(ResourceType.CONCRETE, 1860),
                        new ResourceChunk(ResourceType.BRICK, 698),
                        new ResourceChunk(ResourceType.WOOD, 465),
                        new ResourceChunk(ResourceType.GLASS, 2325),
                        new ResourceChunk(ResourceType.MONEY, 279000)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.CONSTRUCTION, 3840),
                        new ResourceChunk(ResourceType.STEEL, 2261),
                        new ResourceChunk(ResourceType.CONCRETE, 3768),
                        new ResourceChunk(ResourceType.BRICK, 1413),
                        new ResourceChunk(ResourceType.WOOD, 942),
                        new ResourceChunk(ResourceType.GLASS, 4710),
                        new ResourceChunk(ResourceType.MONEY, 565200)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.CONSTRUCTION, 6400),
                        new ResourceChunk(ResourceType.STEEL, 3816),
                        new ResourceChunk(ResourceType.CONCRETE, 6360),
                        new ResourceChunk(ResourceType.BRICK, 2385),
                        new ResourceChunk(ResourceType.WOOD, 1590),
                        new ResourceChunk(ResourceType.GLASS, 7950),
                        new ResourceChunk(ResourceType.MONEY, 954000)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.CONSTRUCTION, 9600),
                        new ResourceChunk(ResourceType.STEEL, 5796),
                        new ResourceChunk(ResourceType.CONCRETE, 9660),
                        new ResourceChunk(ResourceType.BRICK, 3623),
                        new ResourceChunk(ResourceType.WOOD, 2415),
                        new ResourceChunk(ResourceType.GLASS, 12075),
                        new ResourceChunk(ResourceType.MONEY, 1449000)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.CONSTRUCTION, 14080),
                        new ResourceChunk(ResourceType.STEEL, 8669),
                        new ResourceChunk(ResourceType.CONCRETE, 14448),
                        new ResourceChunk(ResourceType.BRICK, 5418),
                        new ResourceChunk(ResourceType.WOOD, 3612),
                        new ResourceChunk(ResourceType.GLASS, 18060),
                        new ResourceChunk(ResourceType.MONEY, 2167200)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.CONSTRUCTION, 19840),
                        new ResourceChunk(ResourceType.STEEL, 12492),
                        new ResourceChunk(ResourceType.CONCRETE, 20820),
                        new ResourceChunk(ResourceType.BRICK, 7808),
                        new ResourceChunk(ResourceType.WOOD, 5205),
                        new ResourceChunk(ResourceType.GLASS, 26025),
                        new ResourceChunk(ResourceType.MONEY, 3123000)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.CONSTRUCTION, 26880),
                        new ResourceChunk(ResourceType.STEEL, 17323),
                        new ResourceChunk(ResourceType.CONCRETE, 28872),
                        new ResourceChunk(ResourceType.BRICK, 10827),
                        new ResourceChunk(ResourceType.WOOD, 7218),
                        new ResourceChunk(ResourceType.GLASS, 36090),
                        new ResourceChunk(ResourceType.MONEY, 4330800)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.CONSTRUCTION, 35200),
                        new ResourceChunk(ResourceType.STEEL, 23220),
                        new ResourceChunk(ResourceType.CONCRETE, 38700),
                        new ResourceChunk(ResourceType.BRICK, 14513),
                        new ResourceChunk(ResourceType.WOOD, 9675),
                        new ResourceChunk(ResourceType.GLASS, 48375),
                        new ResourceChunk(ResourceType.MONEY, 5805000)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.CONSTRUCTION, 44800),
                        new ResourceChunk(ResourceType.STEEL, 30240),
                        new ResourceChunk(ResourceType.CONCRETE, 50400),
                        new ResourceChunk(ResourceType.BRICK, 18900),
                        new ResourceChunk(ResourceType.WOOD, 12600),
                        new ResourceChunk(ResourceType.GLASS, 63000),
                        new ResourceChunk(ResourceType.MONEY, 7560000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.CONSTRUCTION, 56320),
                        new ResourceChunk(ResourceType.STEEL, 39053),
                        new ResourceChunk(ResourceType.CONCRETE, 65088),
                        new ResourceChunk(ResourceType.BRICK, 24408),
                        new ResourceChunk(ResourceType.WOOD, 16272),
                        new ResourceChunk(ResourceType.GLASS, 81360),
                        new ResourceChunk(ResourceType.MONEY, 9763200)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.CONSTRUCTION, 69760),
                        new ResourceChunk(ResourceType.STEEL, 49788),
                        new ResourceChunk(ResourceType.CONCRETE, 82980),
                        new ResourceChunk(ResourceType.BRICK, 31118),
                        new ResourceChunk(ResourceType.WOOD, 20745),
                        new ResourceChunk(ResourceType.GLASS, 103725),
                        new ResourceChunk(ResourceType.MONEY, 12447000)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.CONSTRUCTION, 85120),
                        new ResourceChunk(ResourceType.STEEL, 62575),
                        new ResourceChunk(ResourceType.CONCRETE, 104292),
                        new ResourceChunk(ResourceType.BRICK, 39110),
                        new ResourceChunk(ResourceType.WOOD, 26073),
                        new ResourceChunk(ResourceType.GLASS, 130365),
                        new ResourceChunk(ResourceType.MONEY, 15643800)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.CONSTRUCTION, 102400),
                        new ResourceChunk(ResourceType.STEEL, 77544),
                        new ResourceChunk(ResourceType.CONCRETE, 129240),
                        new ResourceChunk(ResourceType.BRICK, 48465),
                        new ResourceChunk(ResourceType.WOOD, 32310),
                        new ResourceChunk(ResourceType.GLASS, 161550),
                        new ResourceChunk(ResourceType.MONEY, 19386000)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.CONSTRUCTION, 121600),
                        new ResourceChunk(ResourceType.STEEL, 94824),
                        new ResourceChunk(ResourceType.CONCRETE, 158040),
                        new ResourceChunk(ResourceType.BRICK, 59265),
                        new ResourceChunk(ResourceType.WOOD, 39510),
                        new ResourceChunk(ResourceType.GLASS, 197550),
                        new ResourceChunk(ResourceType.MONEY, 23706000)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.CONSTRUCTION, 143360),
                        new ResourceChunk(ResourceType.STEEL, 115387),
                        new ResourceChunk(ResourceType.CONCRETE, 192312),
                        new ResourceChunk(ResourceType.BRICK, 72117),
                        new ResourceChunk(ResourceType.WOOD, 48078),
                        new ResourceChunk(ResourceType.GLASS, 240390),
                        new ResourceChunk(ResourceType.MONEY, 28846800)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.CONSTRUCTION, 167680),
                        new ResourceChunk(ResourceType.STEEL, 139464),
                        new ResourceChunk(ResourceType.CONCRETE, 232440),
                        new ResourceChunk(ResourceType.BRICK, 87165),
                        new ResourceChunk(ResourceType.WOOD, 58110),
                        new ResourceChunk(ResourceType.GLASS, 290550),
                        new ResourceChunk(ResourceType.MONEY, 34866000)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.CONSTRUCTION, 194560),
                        new ResourceChunk(ResourceType.STEEL, 167285),
                        new ResourceChunk(ResourceType.CONCRETE, 278808),
                        new ResourceChunk(ResourceType.BRICK, 104553),
                        new ResourceChunk(ResourceType.WOOD, 69702),
                        new ResourceChunk(ResourceType.GLASS, 348510),
                        new ResourceChunk(ResourceType.MONEY, 41821200)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.CONSTRUCTION, 224000),
                        new ResourceChunk(ResourceType.STEEL, 199080),
                        new ResourceChunk(ResourceType.CONCRETE, 331800),
                        new ResourceChunk(ResourceType.BRICK, 124425),
                        new ResourceChunk(ResourceType.WOOD, 82950),
                        new ResourceChunk(ResourceType.GLASS, 414750),
                        new ResourceChunk(ResourceType.MONEY, 49770000)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.CONSTRUCTION, 256000),
                        new ResourceChunk(ResourceType.STEEL, 235080),
                        new ResourceChunk(ResourceType.CONCRETE, 391800),
                        new ResourceChunk(ResourceType.BRICK, 146925),
                        new ResourceChunk(ResourceType.WOOD, 97950),
                        new ResourceChunk(ResourceType.GLASS, 489750),
                        new ResourceChunk(ResourceType.MONEY, 58770000)
                )
        });
        setProductionMultiplier(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.MONEY, 2)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.MONEY, 4)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.MONEY, 6)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.MONEY, 8)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.MONEY, 10)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.MONEY, 14)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.MONEY, 18)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.MONEY, 22)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.MONEY, 26)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.MONEY, 30)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.MONEY, 36)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.MONEY, 42)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.MONEY, 48)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.MONEY, 54)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.MONEY, 60)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.MONEY, 68)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.MONEY, 76)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.MONEY, 84)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.MONEY, 92)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.MONEY, 100)
                )
        });
        setJobRewardMultiplier(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.MONEY, 2)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.MONEY, 4)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.MONEY, 6)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.MONEY, 8)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.MONEY, 10)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.MONEY, 14)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.MONEY, 18)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.MONEY, 22)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.MONEY, 26)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.MONEY, 30)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.MONEY, 36)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.MONEY, 42)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.MONEY, 48)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.MONEY, 54)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.MONEY, 60)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.MONEY, 68)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.MONEY, 76)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.MONEY, 84)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.MONEY, 92)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.MONEY, 100)
                )
        });
        setDemand(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 9),
                        new ResourceChunk(ResourceType.JOB, 180),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 18),
                        new ResourceChunk(ResourceType.JOB, 360),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 27),
                        new ResourceChunk(ResourceType.JOB, 540),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 36),
                        new ResourceChunk(ResourceType.JOB, 720),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 45),
                        new ResourceChunk(ResourceType.JOB, 900),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 63),
                        new ResourceChunk(ResourceType.JOB, 1260),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 81),
                        new ResourceChunk(ResourceType.JOB, 1620),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 99),
                        new ResourceChunk(ResourceType.JOB, 1980),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 117),
                        new ResourceChunk(ResourceType.JOB, 2340),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 135),
                        new ResourceChunk(ResourceType.JOB, 2700),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 162),
                        new ResourceChunk(ResourceType.JOB, 3240),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 189),
                        new ResourceChunk(ResourceType.JOB, 3780),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 216),
                        new ResourceChunk(ResourceType.JOB, 4320),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 243),
                        new ResourceChunk(ResourceType.JOB, 4860),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 270),
                        new ResourceChunk(ResourceType.JOB, 5400),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 306),
                        new ResourceChunk(ResourceType.JOB, 6120),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 342),
                        new ResourceChunk(ResourceType.JOB, 6840),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 378),
                        new ResourceChunk(ResourceType.JOB, 7560),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 414),
                        new ResourceChunk(ResourceType.JOB, 8280),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 450),
                        new ResourceChunk(ResourceType.JOB, 9000),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                )
        });
        setHold(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.POWER, 9),
                        new ResourceChunk(ResourceType.WORKER, 180)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.POWER, 18),
                        new ResourceChunk(ResourceType.WORKER, 360)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.POWER, 27),
                        new ResourceChunk(ResourceType.WORKER, 540)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.POWER, 36),
                        new ResourceChunk(ResourceType.WORKER, 720)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.POWER, 45),
                        new ResourceChunk(ResourceType.WORKER, 900)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.POWER, 63),
                        new ResourceChunk(ResourceType.WORKER, 1260)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.POWER, 81),
                        new ResourceChunk(ResourceType.WORKER, 1620)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.POWER, 99),
                        new ResourceChunk(ResourceType.WORKER, 1980)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.POWER, 117),
                        new ResourceChunk(ResourceType.WORKER, 2340)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.POWER, 135),
                        new ResourceChunk(ResourceType.WORKER, 2700)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.POWER, 162),
                        new ResourceChunk(ResourceType.WORKER, 3240)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.POWER, 189),
                        new ResourceChunk(ResourceType.WORKER, 3780)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.POWER, 216),
                        new ResourceChunk(ResourceType.WORKER, 4320)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.POWER, 243),
                        new ResourceChunk(ResourceType.WORKER, 4860)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.POWER, 270),
                        new ResourceChunk(ResourceType.WORKER, 5400)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.POWER, 306),
                        new ResourceChunk(ResourceType.WORKER, 6120)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.POWER, 342),
                        new ResourceChunk(ResourceType.WORKER, 6840)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.POWER, 378),
                        new ResourceChunk(ResourceType.WORKER, 7560)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.POWER, 414),
                        new ResourceChunk(ResourceType.WORKER, 8280)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.POWER, 450),
                        new ResourceChunk(ResourceType.WORKER, 9000)
                )
        });
        setStoreMultiplier(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.MONEY, 2)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.MONEY, 4)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.MONEY, 6)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.MONEY, 8)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.MONEY, 10)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.MONEY, 14)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.MONEY, 18)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.MONEY, 22)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.MONEY, 26)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.MONEY, 30)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.MONEY, 36)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.MONEY, 42)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.MONEY, 48)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.MONEY, 54)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.MONEY, 60)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.MONEY, 68)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.MONEY, 76)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.MONEY, 84)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.MONEY, 92)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.MONEY, 100)
                )
        });
    }
}
