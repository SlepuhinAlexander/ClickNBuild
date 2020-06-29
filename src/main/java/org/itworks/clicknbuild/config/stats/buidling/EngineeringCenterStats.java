package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResChunk;
import org.itworks.clicknbuild.engine.model.ResPack;
import org.itworks.clicknbuild.engine.model.ResType;

public final class EngineeringCenterStats extends BuildingStats {
    private static volatile EngineeringCenterStats inst;

    private EngineeringCenterStats() {
    }

    public static EngineeringCenterStats inst() {
        EngineeringCenterStats local = inst;
        if (local == null) {
            synchronized (EngineeringCenterStats.class) {
                local = inst;
                if (local == null) {
                    inst = local = new EngineeringCenterStats();
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
        setStructure(new int[]{
                560, // 1
                1680, // 2
                3360, // 3
                5600, // 4
                8400, // 5
                12320, // 6
                17360, // 7
                23520, // 8
                30800, // 9
                39200, // 10
                49280, // 11
                61040, // 12
                74480, // 13
                89600, // 14
                106400, // 15
                125440, // 16
                146720, // 17
                170240, // 18
                196000, // 19
                224000, // 20
        });
        setBuildCost(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.CONSTRUCTION, 560),
                        new ResChunk(ResType.STEEL, 367),
                        new ResChunk(ResType.CONCRETE, 1224),
                        new ResChunk(ResType.BRICK, 918),
                        new ResChunk(ResType.WOOD, 77),
                        new ResChunk(ResType.GLASS, 102),
                        new ResChunk(ResType.MONEY, 61200)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.CONSTRUCTION, 1680),
                        new ResChunk(ResType.STEEL, 1116),
                        new ResChunk(ResType.CONCRETE, 3720),
                        new ResChunk(ResType.BRICK, 2790),
                        new ResChunk(ResType.WOOD, 233),
                        new ResChunk(ResType.GLASS, 310),
                        new ResChunk(ResType.MONEY, 186000)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.CONSTRUCTION, 3360),
                        new ResChunk(ResType.STEEL, 2261),
                        new ResChunk(ResType.CONCRETE, 7536),
                        new ResChunk(ResType.BRICK, 5652),
                        new ResChunk(ResType.WOOD, 471),
                        new ResChunk(ResType.GLASS, 628),
                        new ResChunk(ResType.MONEY, 376800)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.CONSTRUCTION, 5600),
                        new ResChunk(ResType.STEEL, 3816),
                        new ResChunk(ResType.CONCRETE, 12720),
                        new ResChunk(ResType.BRICK, 9540),
                        new ResChunk(ResType.WOOD, 795),
                        new ResChunk(ResType.GLASS, 1060),
                        new ResChunk(ResType.MONEY, 636000)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.CONSTRUCTION, 8400),
                        new ResChunk(ResType.STEEL, 5796),
                        new ResChunk(ResType.CONCRETE, 19320),
                        new ResChunk(ResType.BRICK, 14490),
                        new ResChunk(ResType.WOOD, 1208),
                        new ResChunk(ResType.GLASS, 1610),
                        new ResChunk(ResType.MONEY, 966000)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.CONSTRUCTION, 12320),
                        new ResChunk(ResType.STEEL, 8669),
                        new ResChunk(ResType.CONCRETE, 28896),
                        new ResChunk(ResType.BRICK, 21672),
                        new ResChunk(ResType.WOOD, 1806),
                        new ResChunk(ResType.GLASS, 2408),
                        new ResChunk(ResType.MONEY, 1444800)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.CONSTRUCTION, 17360),
                        new ResChunk(ResType.STEEL, 12492),
                        new ResChunk(ResType.CONCRETE, 41640),
                        new ResChunk(ResType.BRICK, 31230),
                        new ResChunk(ResType.WOOD, 2603),
                        new ResChunk(ResType.GLASS, 3470),
                        new ResChunk(ResType.MONEY, 2082000)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.CONSTRUCTION, 23520),
                        new ResChunk(ResType.STEEL, 17323),
                        new ResChunk(ResType.CONCRETE, 57744),
                        new ResChunk(ResType.BRICK, 43308),
                        new ResChunk(ResType.WOOD, 3609),
                        new ResChunk(ResType.GLASS, 4812),
                        new ResChunk(ResType.MONEY, 2887200)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.CONSTRUCTION, 30800),
                        new ResChunk(ResType.STEEL, 23220),
                        new ResChunk(ResType.CONCRETE, 77400),
                        new ResChunk(ResType.BRICK, 58050),
                        new ResChunk(ResType.WOOD, 4838),
                        new ResChunk(ResType.GLASS, 6450),
                        new ResChunk(ResType.MONEY, 3870000)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.CONSTRUCTION, 39200),
                        new ResChunk(ResType.STEEL, 30240),
                        new ResChunk(ResType.CONCRETE, 100800),
                        new ResChunk(ResType.BRICK, 75600),
                        new ResChunk(ResType.WOOD, 6300),
                        new ResChunk(ResType.GLASS, 8400),
                        new ResChunk(ResType.MONEY, 5040000)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.CONSTRUCTION, 49280),
                        new ResChunk(ResType.STEEL, 39053),
                        new ResChunk(ResType.CONCRETE, 130176),
                        new ResChunk(ResType.BRICK, 97632),
                        new ResChunk(ResType.WOOD, 8136),
                        new ResChunk(ResType.GLASS, 10848),
                        new ResChunk(ResType.MONEY, 6508800)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.CONSTRUCTION, 61040),
                        new ResChunk(ResType.STEEL, 49788),
                        new ResChunk(ResType.CONCRETE, 165960),
                        new ResChunk(ResType.BRICK, 124470),
                        new ResChunk(ResType.WOOD, 10373),
                        new ResChunk(ResType.GLASS, 13830),
                        new ResChunk(ResType.MONEY, 8298000)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.CONSTRUCTION, 74480),
                        new ResChunk(ResType.STEEL, 62575),
                        new ResChunk(ResType.CONCRETE, 208584),
                        new ResChunk(ResType.BRICK, 156438),
                        new ResChunk(ResType.WOOD, 13037),
                        new ResChunk(ResType.GLASS, 17382),
                        new ResChunk(ResType.MONEY, 10429200)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.CONSTRUCTION, 89600),
                        new ResChunk(ResType.STEEL, 77544),
                        new ResChunk(ResType.CONCRETE, 258480),
                        new ResChunk(ResType.BRICK, 193860),
                        new ResChunk(ResType.WOOD, 16155),
                        new ResChunk(ResType.GLASS, 21540),
                        new ResChunk(ResType.MONEY, 12924000)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.CONSTRUCTION, 106400),
                        new ResChunk(ResType.STEEL, 94824),
                        new ResChunk(ResType.CONCRETE, 316080),
                        new ResChunk(ResType.BRICK, 237060),
                        new ResChunk(ResType.WOOD, 19755),
                        new ResChunk(ResType.GLASS, 26340),
                        new ResChunk(ResType.MONEY, 15804000)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.CONSTRUCTION, 125440),
                        new ResChunk(ResType.STEEL, 115387),
                        new ResChunk(ResType.CONCRETE, 384624),
                        new ResChunk(ResType.BRICK, 288468),
                        new ResChunk(ResType.WOOD, 24039),
                        new ResChunk(ResType.GLASS, 32052),
                        new ResChunk(ResType.MONEY, 19231200)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.CONSTRUCTION, 146720),
                        new ResChunk(ResType.STEEL, 139464),
                        new ResChunk(ResType.CONCRETE, 464880),
                        new ResChunk(ResType.BRICK, 348660),
                        new ResChunk(ResType.WOOD, 29055),
                        new ResChunk(ResType.GLASS, 38740),
                        new ResChunk(ResType.MONEY, 23244000)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.CONSTRUCTION, 170240),
                        new ResChunk(ResType.STEEL, 167285),
                        new ResChunk(ResType.CONCRETE, 557616),
                        new ResChunk(ResType.BRICK, 418212),
                        new ResChunk(ResType.WOOD, 34851),
                        new ResChunk(ResType.GLASS, 46468),
                        new ResChunk(ResType.MONEY, 27880800)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.CONSTRUCTION, 196000),
                        new ResChunk(ResType.STEEL, 199080),
                        new ResChunk(ResType.CONCRETE, 663600),
                        new ResChunk(ResType.BRICK, 497700),
                        new ResChunk(ResType.WOOD, 41475),
                        new ResChunk(ResType.GLASS, 55300),
                        new ResChunk(ResType.MONEY, 33180000)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.CONSTRUCTION, 224000),
                        new ResChunk(ResType.STEEL, 235080),
                        new ResChunk(ResType.CONCRETE, 783600),
                        new ResChunk(ResType.BRICK, 587700),
                        new ResChunk(ResType.WOOD, 48975),
                        new ResChunk(ResType.GLASS, 65300),
                        new ResChunk(ResType.MONEY, 39180000)
                )
        });
        setProductionMultiplier(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.STEEL, 2),
                        new ResChunk(ResType.CONCRETE, 2),
                        new ResChunk(ResType.BRICK, 2),
                        new ResChunk(ResType.WOOD, 2),
                        new ResChunk(ResType.GLASS, 2)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.STEEL, 4),
                        new ResChunk(ResType.CONCRETE, 4),
                        new ResChunk(ResType.BRICK, 4),
                        new ResChunk(ResType.WOOD, 4),
                        new ResChunk(ResType.GLASS, 4)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.STEEL, 6),
                        new ResChunk(ResType.CONCRETE, 6),
                        new ResChunk(ResType.BRICK, 6),
                        new ResChunk(ResType.WOOD, 6),
                        new ResChunk(ResType.GLASS, 6)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.STEEL, 8),
                        new ResChunk(ResType.CONCRETE, 8),
                        new ResChunk(ResType.BRICK, 8),
                        new ResChunk(ResType.WOOD, 8),
                        new ResChunk(ResType.GLASS, 8)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.STEEL, 10),
                        new ResChunk(ResType.CONCRETE, 10),
                        new ResChunk(ResType.BRICK, 10),
                        new ResChunk(ResType.WOOD, 10),
                        new ResChunk(ResType.GLASS, 10)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.STEEL, 14),
                        new ResChunk(ResType.CONCRETE, 14),
                        new ResChunk(ResType.BRICK, 14),
                        new ResChunk(ResType.WOOD, 14),
                        new ResChunk(ResType.GLASS, 14)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.STEEL, 18),
                        new ResChunk(ResType.CONCRETE, 18),
                        new ResChunk(ResType.BRICK, 18),
                        new ResChunk(ResType.WOOD, 18),
                        new ResChunk(ResType.GLASS, 18)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.STEEL, 22),
                        new ResChunk(ResType.CONCRETE, 22),
                        new ResChunk(ResType.BRICK, 22),
                        new ResChunk(ResType.WOOD, 22),
                        new ResChunk(ResType.GLASS, 22)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.STEEL, 26),
                        new ResChunk(ResType.CONCRETE, 26),
                        new ResChunk(ResType.BRICK, 26),
                        new ResChunk(ResType.WOOD, 26),
                        new ResChunk(ResType.GLASS, 26)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.STEEL, 30),
                        new ResChunk(ResType.CONCRETE, 30),
                        new ResChunk(ResType.BRICK, 30),
                        new ResChunk(ResType.WOOD, 30),
                        new ResChunk(ResType.GLASS, 30)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.STEEL, 36),
                        new ResChunk(ResType.CONCRETE, 36),
                        new ResChunk(ResType.BRICK, 36),
                        new ResChunk(ResType.WOOD, 36),
                        new ResChunk(ResType.GLASS, 36)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.STEEL, 42),
                        new ResChunk(ResType.CONCRETE, 42),
                        new ResChunk(ResType.BRICK, 42),
                        new ResChunk(ResType.WOOD, 42),
                        new ResChunk(ResType.GLASS, 42)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.STEEL, 48),
                        new ResChunk(ResType.CONCRETE, 48),
                        new ResChunk(ResType.BRICK, 48),
                        new ResChunk(ResType.WOOD, 48),
                        new ResChunk(ResType.GLASS, 48)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.STEEL, 54),
                        new ResChunk(ResType.CONCRETE, 54),
                        new ResChunk(ResType.BRICK, 54),
                        new ResChunk(ResType.WOOD, 54),
                        new ResChunk(ResType.GLASS, 54)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.STEEL, 60),
                        new ResChunk(ResType.CONCRETE, 60),
                        new ResChunk(ResType.BRICK, 60),
                        new ResChunk(ResType.WOOD, 60),
                        new ResChunk(ResType.GLASS, 60)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.STEEL, 68),
                        new ResChunk(ResType.CONCRETE, 68),
                        new ResChunk(ResType.BRICK, 68),
                        new ResChunk(ResType.WOOD, 68),
                        new ResChunk(ResType.GLASS, 68)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.STEEL, 76),
                        new ResChunk(ResType.CONCRETE, 76),
                        new ResChunk(ResType.BRICK, 76),
                        new ResChunk(ResType.WOOD, 76),
                        new ResChunk(ResType.GLASS, 76)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.STEEL, 84),
                        new ResChunk(ResType.CONCRETE, 84),
                        new ResChunk(ResType.BRICK, 84),
                        new ResChunk(ResType.WOOD, 84),
                        new ResChunk(ResType.GLASS, 84)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.STEEL, 92),
                        new ResChunk(ResType.CONCRETE, 92),
                        new ResChunk(ResType.BRICK, 92),
                        new ResChunk(ResType.WOOD, 92),
                        new ResChunk(ResType.GLASS, 92)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.STEEL, 100),
                        new ResChunk(ResType.CONCRETE, 100),
                        new ResChunk(ResType.BRICK, 100),
                        new ResChunk(ResType.WOOD, 100),
                        new ResChunk(ResType.GLASS, 100)
                )
        });
        setJobRewardMultiplier(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.STEEL, 2),
                        new ResChunk(ResType.CONCRETE, 2),
                        new ResChunk(ResType.BRICK, 2),
                        new ResChunk(ResType.WOOD, 2),
                        new ResChunk(ResType.GLASS, 2)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.STEEL, 4),
                        new ResChunk(ResType.CONCRETE, 4),
                        new ResChunk(ResType.BRICK, 4),
                        new ResChunk(ResType.WOOD, 4),
                        new ResChunk(ResType.GLASS, 4)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.STEEL, 6),
                        new ResChunk(ResType.CONCRETE, 6),
                        new ResChunk(ResType.BRICK, 6),
                        new ResChunk(ResType.WOOD, 6),
                        new ResChunk(ResType.GLASS, 6)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.STEEL, 8),
                        new ResChunk(ResType.CONCRETE, 8),
                        new ResChunk(ResType.BRICK, 8),
                        new ResChunk(ResType.WOOD, 8),
                        new ResChunk(ResType.GLASS, 8)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.STEEL, 10),
                        new ResChunk(ResType.CONCRETE, 10),
                        new ResChunk(ResType.BRICK, 10),
                        new ResChunk(ResType.WOOD, 10),
                        new ResChunk(ResType.GLASS, 10)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.STEEL, 14),
                        new ResChunk(ResType.CONCRETE, 14),
                        new ResChunk(ResType.BRICK, 14),
                        new ResChunk(ResType.WOOD, 14),
                        new ResChunk(ResType.GLASS, 14)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.STEEL, 18),
                        new ResChunk(ResType.CONCRETE, 18),
                        new ResChunk(ResType.BRICK, 18),
                        new ResChunk(ResType.WOOD, 18),
                        new ResChunk(ResType.GLASS, 18)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.STEEL, 22),
                        new ResChunk(ResType.CONCRETE, 22),
                        new ResChunk(ResType.BRICK, 22),
                        new ResChunk(ResType.WOOD, 22),
                        new ResChunk(ResType.GLASS, 22)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.STEEL, 26),
                        new ResChunk(ResType.CONCRETE, 26),
                        new ResChunk(ResType.BRICK, 26),
                        new ResChunk(ResType.WOOD, 26),
                        new ResChunk(ResType.GLASS, 26)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.STEEL, 30),
                        new ResChunk(ResType.CONCRETE, 30),
                        new ResChunk(ResType.BRICK, 30),
                        new ResChunk(ResType.WOOD, 30),
                        new ResChunk(ResType.GLASS, 30)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.STEEL, 36),
                        new ResChunk(ResType.CONCRETE, 36),
                        new ResChunk(ResType.BRICK, 36),
                        new ResChunk(ResType.WOOD, 36),
                        new ResChunk(ResType.GLASS, 36)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.STEEL, 42),
                        new ResChunk(ResType.CONCRETE, 42),
                        new ResChunk(ResType.BRICK, 42),
                        new ResChunk(ResType.WOOD, 42),
                        new ResChunk(ResType.GLASS, 42)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.STEEL, 48),
                        new ResChunk(ResType.CONCRETE, 48),
                        new ResChunk(ResType.BRICK, 48),
                        new ResChunk(ResType.WOOD, 48),
                        new ResChunk(ResType.GLASS, 48)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.STEEL, 54),
                        new ResChunk(ResType.CONCRETE, 54),
                        new ResChunk(ResType.BRICK, 54),
                        new ResChunk(ResType.WOOD, 54),
                        new ResChunk(ResType.GLASS, 54)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.STEEL, 60),
                        new ResChunk(ResType.CONCRETE, 60),
                        new ResChunk(ResType.BRICK, 60),
                        new ResChunk(ResType.WOOD, 60),
                        new ResChunk(ResType.GLASS, 60)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.STEEL, 68),
                        new ResChunk(ResType.CONCRETE, 68),
                        new ResChunk(ResType.BRICK, 68),
                        new ResChunk(ResType.WOOD, 68),
                        new ResChunk(ResType.GLASS, 68)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.STEEL, 76),
                        new ResChunk(ResType.CONCRETE, 76),
                        new ResChunk(ResType.BRICK, 76),
                        new ResChunk(ResType.WOOD, 76),
                        new ResChunk(ResType.GLASS, 76)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.STEEL, 84),
                        new ResChunk(ResType.CONCRETE, 84),
                        new ResChunk(ResType.BRICK, 84),
                        new ResChunk(ResType.WOOD, 84),
                        new ResChunk(ResType.GLASS, 84)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.STEEL, 92),
                        new ResChunk(ResType.CONCRETE, 92),
                        new ResChunk(ResType.BRICK, 92),
                        new ResChunk(ResType.WOOD, 92),
                        new ResChunk(ResType.GLASS, 92)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.STEEL, 100),
                        new ResChunk(ResType.CONCRETE, 100),
                        new ResChunk(ResType.BRICK, 100),
                        new ResChunk(ResType.WOOD, 100),
                        new ResChunk(ResType.GLASS, 100)
                )
        });
        setDemand(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.UPKEEP, 240),
                        new ResChunk(ResType.POWER_CONSUMPTION, 9),
                        new ResChunk(ResType.JOB, 180),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.UPKEEP, 480),
                        new ResChunk(ResType.POWER_CONSUMPTION, 18),
                        new ResChunk(ResType.JOB, 360),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.UPKEEP, 720),
                        new ResChunk(ResType.POWER_CONSUMPTION, 27),
                        new ResChunk(ResType.JOB, 540),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.UPKEEP, 960),
                        new ResChunk(ResType.POWER_CONSUMPTION, 36),
                        new ResChunk(ResType.JOB, 720),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.UPKEEP, 1200),
                        new ResChunk(ResType.POWER_CONSUMPTION, 45),
                        new ResChunk(ResType.JOB, 900),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.UPKEEP, 1680),
                        new ResChunk(ResType.POWER_CONSUMPTION, 63),
                        new ResChunk(ResType.JOB, 1260),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.UPKEEP, 2160),
                        new ResChunk(ResType.POWER_CONSUMPTION, 81),
                        new ResChunk(ResType.JOB, 1620),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.UPKEEP, 2640),
                        new ResChunk(ResType.POWER_CONSUMPTION, 99),
                        new ResChunk(ResType.JOB, 1980),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.UPKEEP, 3120),
                        new ResChunk(ResType.POWER_CONSUMPTION, 117),
                        new ResChunk(ResType.JOB, 2340),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.UPKEEP, 3600),
                        new ResChunk(ResType.POWER_CONSUMPTION, 135),
                        new ResChunk(ResType.JOB, 2700),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.UPKEEP, 4320),
                        new ResChunk(ResType.POWER_CONSUMPTION, 162),
                        new ResChunk(ResType.JOB, 3240),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.UPKEEP, 5040),
                        new ResChunk(ResType.POWER_CONSUMPTION, 189),
                        new ResChunk(ResType.JOB, 3780),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.UPKEEP, 5760),
                        new ResChunk(ResType.POWER_CONSUMPTION, 216),
                        new ResChunk(ResType.JOB, 4320),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.UPKEEP, 6480),
                        new ResChunk(ResType.POWER_CONSUMPTION, 243),
                        new ResChunk(ResType.JOB, 4860),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.UPKEEP, 7200),
                        new ResChunk(ResType.POWER_CONSUMPTION, 270),
                        new ResChunk(ResType.JOB, 5400),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.UPKEEP, 8160),
                        new ResChunk(ResType.POWER_CONSUMPTION, 306),
                        new ResChunk(ResType.JOB, 6120),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.UPKEEP, 9120),
                        new ResChunk(ResType.POWER_CONSUMPTION, 342),
                        new ResChunk(ResType.JOB, 6840),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.UPKEEP, 10080),
                        new ResChunk(ResType.POWER_CONSUMPTION, 378),
                        new ResChunk(ResType.JOB, 7560),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.UPKEEP, 11040),
                        new ResChunk(ResType.POWER_CONSUMPTION, 414),
                        new ResChunk(ResType.JOB, 8280),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.UPKEEP, 12000),
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
    }
}
