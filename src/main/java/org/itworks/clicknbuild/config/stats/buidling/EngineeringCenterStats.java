package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResStat;
import org.itworks.clicknbuild.engine.model.ResStatPack;
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
        setBuildCost(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.CONSTRUCTION, 560),
                        new ResStat(ResType.STEEL, 367),
                        new ResStat(ResType.CONCRETE, 1224),
                        new ResStat(ResType.BRICK, 918),
                        new ResStat(ResType.WOOD, 77),
                        new ResStat(ResType.GLASS, 102),
                        new ResStat(ResType.MONEY, 61200)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.CONSTRUCTION, 1680),
                        new ResStat(ResType.STEEL, 1116),
                        new ResStat(ResType.CONCRETE, 3720),
                        new ResStat(ResType.BRICK, 2790),
                        new ResStat(ResType.WOOD, 233),
                        new ResStat(ResType.GLASS, 310),
                        new ResStat(ResType.MONEY, 186000)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.CONSTRUCTION, 3360),
                        new ResStat(ResType.STEEL, 2261),
                        new ResStat(ResType.CONCRETE, 7536),
                        new ResStat(ResType.BRICK, 5652),
                        new ResStat(ResType.WOOD, 471),
                        new ResStat(ResType.GLASS, 628),
                        new ResStat(ResType.MONEY, 376800)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.CONSTRUCTION, 5600),
                        new ResStat(ResType.STEEL, 3816),
                        new ResStat(ResType.CONCRETE, 12720),
                        new ResStat(ResType.BRICK, 9540),
                        new ResStat(ResType.WOOD, 795),
                        new ResStat(ResType.GLASS, 1060),
                        new ResStat(ResType.MONEY, 636000)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.CONSTRUCTION, 8400),
                        new ResStat(ResType.STEEL, 5796),
                        new ResStat(ResType.CONCRETE, 19320),
                        new ResStat(ResType.BRICK, 14490),
                        new ResStat(ResType.WOOD, 1208),
                        new ResStat(ResType.GLASS, 1610),
                        new ResStat(ResType.MONEY, 966000)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.CONSTRUCTION, 12320),
                        new ResStat(ResType.STEEL, 8669),
                        new ResStat(ResType.CONCRETE, 28896),
                        new ResStat(ResType.BRICK, 21672),
                        new ResStat(ResType.WOOD, 1806),
                        new ResStat(ResType.GLASS, 2408),
                        new ResStat(ResType.MONEY, 1444800)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.CONSTRUCTION, 17360),
                        new ResStat(ResType.STEEL, 12492),
                        new ResStat(ResType.CONCRETE, 41640),
                        new ResStat(ResType.BRICK, 31230),
                        new ResStat(ResType.WOOD, 2603),
                        new ResStat(ResType.GLASS, 3470),
                        new ResStat(ResType.MONEY, 2082000)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.CONSTRUCTION, 23520),
                        new ResStat(ResType.STEEL, 17323),
                        new ResStat(ResType.CONCRETE, 57744),
                        new ResStat(ResType.BRICK, 43308),
                        new ResStat(ResType.WOOD, 3609),
                        new ResStat(ResType.GLASS, 4812),
                        new ResStat(ResType.MONEY, 2887200)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.CONSTRUCTION, 30800),
                        new ResStat(ResType.STEEL, 23220),
                        new ResStat(ResType.CONCRETE, 77400),
                        new ResStat(ResType.BRICK, 58050),
                        new ResStat(ResType.WOOD, 4838),
                        new ResStat(ResType.GLASS, 6450),
                        new ResStat(ResType.MONEY, 3870000)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.CONSTRUCTION, 39200),
                        new ResStat(ResType.STEEL, 30240),
                        new ResStat(ResType.CONCRETE, 100800),
                        new ResStat(ResType.BRICK, 75600),
                        new ResStat(ResType.WOOD, 6300),
                        new ResStat(ResType.GLASS, 8400),
                        new ResStat(ResType.MONEY, 5040000)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.CONSTRUCTION, 49280),
                        new ResStat(ResType.STEEL, 39053),
                        new ResStat(ResType.CONCRETE, 130176),
                        new ResStat(ResType.BRICK, 97632),
                        new ResStat(ResType.WOOD, 8136),
                        new ResStat(ResType.GLASS, 10848),
                        new ResStat(ResType.MONEY, 6508800)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.CONSTRUCTION, 61040),
                        new ResStat(ResType.STEEL, 49788),
                        new ResStat(ResType.CONCRETE, 165960),
                        new ResStat(ResType.BRICK, 124470),
                        new ResStat(ResType.WOOD, 10373),
                        new ResStat(ResType.GLASS, 13830),
                        new ResStat(ResType.MONEY, 8298000)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.CONSTRUCTION, 74480),
                        new ResStat(ResType.STEEL, 62575),
                        new ResStat(ResType.CONCRETE, 208584),
                        new ResStat(ResType.BRICK, 156438),
                        new ResStat(ResType.WOOD, 13037),
                        new ResStat(ResType.GLASS, 17382),
                        new ResStat(ResType.MONEY, 10429200)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.CONSTRUCTION, 89600),
                        new ResStat(ResType.STEEL, 77544),
                        new ResStat(ResType.CONCRETE, 258480),
                        new ResStat(ResType.BRICK, 193860),
                        new ResStat(ResType.WOOD, 16155),
                        new ResStat(ResType.GLASS, 21540),
                        new ResStat(ResType.MONEY, 12924000)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.CONSTRUCTION, 106400),
                        new ResStat(ResType.STEEL, 94824),
                        new ResStat(ResType.CONCRETE, 316080),
                        new ResStat(ResType.BRICK, 237060),
                        new ResStat(ResType.WOOD, 19755),
                        new ResStat(ResType.GLASS, 26340),
                        new ResStat(ResType.MONEY, 15804000)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.CONSTRUCTION, 125440),
                        new ResStat(ResType.STEEL, 115387),
                        new ResStat(ResType.CONCRETE, 384624),
                        new ResStat(ResType.BRICK, 288468),
                        new ResStat(ResType.WOOD, 24039),
                        new ResStat(ResType.GLASS, 32052),
                        new ResStat(ResType.MONEY, 19231200)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.CONSTRUCTION, 146720),
                        new ResStat(ResType.STEEL, 139464),
                        new ResStat(ResType.CONCRETE, 464880),
                        new ResStat(ResType.BRICK, 348660),
                        new ResStat(ResType.WOOD, 29055),
                        new ResStat(ResType.GLASS, 38740),
                        new ResStat(ResType.MONEY, 23244000)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.CONSTRUCTION, 170240),
                        new ResStat(ResType.STEEL, 167285),
                        new ResStat(ResType.CONCRETE, 557616),
                        new ResStat(ResType.BRICK, 418212),
                        new ResStat(ResType.WOOD, 34851),
                        new ResStat(ResType.GLASS, 46468),
                        new ResStat(ResType.MONEY, 27880800)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.CONSTRUCTION, 196000),
                        new ResStat(ResType.STEEL, 199080),
                        new ResStat(ResType.CONCRETE, 663600),
                        new ResStat(ResType.BRICK, 497700),
                        new ResStat(ResType.WOOD, 41475),
                        new ResStat(ResType.GLASS, 55300),
                        new ResStat(ResType.MONEY, 33180000)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.CONSTRUCTION, 224000),
                        new ResStat(ResType.STEEL, 235080),
                        new ResStat(ResType.CONCRETE, 783600),
                        new ResStat(ResType.BRICK, 587700),
                        new ResStat(ResType.WOOD, 48975),
                        new ResStat(ResType.GLASS, 65300),
                        new ResStat(ResType.MONEY, 39180000)
                )
        });
        setProductionMultiplier(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.STEEL, 2),
                        new ResStat(ResType.CONCRETE, 2),
                        new ResStat(ResType.BRICK, 2),
                        new ResStat(ResType.WOOD, 2),
                        new ResStat(ResType.GLASS, 2)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.STEEL, 4),
                        new ResStat(ResType.CONCRETE, 4),
                        new ResStat(ResType.BRICK, 4),
                        new ResStat(ResType.WOOD, 4),
                        new ResStat(ResType.GLASS, 4)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.STEEL, 6),
                        new ResStat(ResType.CONCRETE, 6),
                        new ResStat(ResType.BRICK, 6),
                        new ResStat(ResType.WOOD, 6),
                        new ResStat(ResType.GLASS, 6)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.STEEL, 8),
                        new ResStat(ResType.CONCRETE, 8),
                        new ResStat(ResType.BRICK, 8),
                        new ResStat(ResType.WOOD, 8),
                        new ResStat(ResType.GLASS, 8)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.STEEL, 10),
                        new ResStat(ResType.CONCRETE, 10),
                        new ResStat(ResType.BRICK, 10),
                        new ResStat(ResType.WOOD, 10),
                        new ResStat(ResType.GLASS, 10)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.STEEL, 14),
                        new ResStat(ResType.CONCRETE, 14),
                        new ResStat(ResType.BRICK, 14),
                        new ResStat(ResType.WOOD, 14),
                        new ResStat(ResType.GLASS, 14)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.STEEL, 18),
                        new ResStat(ResType.CONCRETE, 18),
                        new ResStat(ResType.BRICK, 18),
                        new ResStat(ResType.WOOD, 18),
                        new ResStat(ResType.GLASS, 18)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.STEEL, 22),
                        new ResStat(ResType.CONCRETE, 22),
                        new ResStat(ResType.BRICK, 22),
                        new ResStat(ResType.WOOD, 22),
                        new ResStat(ResType.GLASS, 22)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.STEEL, 26),
                        new ResStat(ResType.CONCRETE, 26),
                        new ResStat(ResType.BRICK, 26),
                        new ResStat(ResType.WOOD, 26),
                        new ResStat(ResType.GLASS, 26)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.STEEL, 30),
                        new ResStat(ResType.CONCRETE, 30),
                        new ResStat(ResType.BRICK, 30),
                        new ResStat(ResType.WOOD, 30),
                        new ResStat(ResType.GLASS, 30)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.STEEL, 36),
                        new ResStat(ResType.CONCRETE, 36),
                        new ResStat(ResType.BRICK, 36),
                        new ResStat(ResType.WOOD, 36),
                        new ResStat(ResType.GLASS, 36)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.STEEL, 42),
                        new ResStat(ResType.CONCRETE, 42),
                        new ResStat(ResType.BRICK, 42),
                        new ResStat(ResType.WOOD, 42),
                        new ResStat(ResType.GLASS, 42)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.STEEL, 48),
                        new ResStat(ResType.CONCRETE, 48),
                        new ResStat(ResType.BRICK, 48),
                        new ResStat(ResType.WOOD, 48),
                        new ResStat(ResType.GLASS, 48)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.STEEL, 54),
                        new ResStat(ResType.CONCRETE, 54),
                        new ResStat(ResType.BRICK, 54),
                        new ResStat(ResType.WOOD, 54),
                        new ResStat(ResType.GLASS, 54)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.STEEL, 60),
                        new ResStat(ResType.CONCRETE, 60),
                        new ResStat(ResType.BRICK, 60),
                        new ResStat(ResType.WOOD, 60),
                        new ResStat(ResType.GLASS, 60)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.STEEL, 68),
                        new ResStat(ResType.CONCRETE, 68),
                        new ResStat(ResType.BRICK, 68),
                        new ResStat(ResType.WOOD, 68),
                        new ResStat(ResType.GLASS, 68)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.STEEL, 76),
                        new ResStat(ResType.CONCRETE, 76),
                        new ResStat(ResType.BRICK, 76),
                        new ResStat(ResType.WOOD, 76),
                        new ResStat(ResType.GLASS, 76)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.STEEL, 84),
                        new ResStat(ResType.CONCRETE, 84),
                        new ResStat(ResType.BRICK, 84),
                        new ResStat(ResType.WOOD, 84),
                        new ResStat(ResType.GLASS, 84)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.STEEL, 92),
                        new ResStat(ResType.CONCRETE, 92),
                        new ResStat(ResType.BRICK, 92),
                        new ResStat(ResType.WOOD, 92),
                        new ResStat(ResType.GLASS, 92)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.STEEL, 100),
                        new ResStat(ResType.CONCRETE, 100),
                        new ResStat(ResType.BRICK, 100),
                        new ResStat(ResType.WOOD, 100),
                        new ResStat(ResType.GLASS, 100)
                )
        });
        setJobRewardMultiplier(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.STEEL, 2),
                        new ResStat(ResType.CONCRETE, 2),
                        new ResStat(ResType.BRICK, 2),
                        new ResStat(ResType.WOOD, 2),
                        new ResStat(ResType.GLASS, 2)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.STEEL, 4),
                        new ResStat(ResType.CONCRETE, 4),
                        new ResStat(ResType.BRICK, 4),
                        new ResStat(ResType.WOOD, 4),
                        new ResStat(ResType.GLASS, 4)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.STEEL, 6),
                        new ResStat(ResType.CONCRETE, 6),
                        new ResStat(ResType.BRICK, 6),
                        new ResStat(ResType.WOOD, 6),
                        new ResStat(ResType.GLASS, 6)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.STEEL, 8),
                        new ResStat(ResType.CONCRETE, 8),
                        new ResStat(ResType.BRICK, 8),
                        new ResStat(ResType.WOOD, 8),
                        new ResStat(ResType.GLASS, 8)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.STEEL, 10),
                        new ResStat(ResType.CONCRETE, 10),
                        new ResStat(ResType.BRICK, 10),
                        new ResStat(ResType.WOOD, 10),
                        new ResStat(ResType.GLASS, 10)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.STEEL, 14),
                        new ResStat(ResType.CONCRETE, 14),
                        new ResStat(ResType.BRICK, 14),
                        new ResStat(ResType.WOOD, 14),
                        new ResStat(ResType.GLASS, 14)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.STEEL, 18),
                        new ResStat(ResType.CONCRETE, 18),
                        new ResStat(ResType.BRICK, 18),
                        new ResStat(ResType.WOOD, 18),
                        new ResStat(ResType.GLASS, 18)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.STEEL, 22),
                        new ResStat(ResType.CONCRETE, 22),
                        new ResStat(ResType.BRICK, 22),
                        new ResStat(ResType.WOOD, 22),
                        new ResStat(ResType.GLASS, 22)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.STEEL, 26),
                        new ResStat(ResType.CONCRETE, 26),
                        new ResStat(ResType.BRICK, 26),
                        new ResStat(ResType.WOOD, 26),
                        new ResStat(ResType.GLASS, 26)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.STEEL, 30),
                        new ResStat(ResType.CONCRETE, 30),
                        new ResStat(ResType.BRICK, 30),
                        new ResStat(ResType.WOOD, 30),
                        new ResStat(ResType.GLASS, 30)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.STEEL, 36),
                        new ResStat(ResType.CONCRETE, 36),
                        new ResStat(ResType.BRICK, 36),
                        new ResStat(ResType.WOOD, 36),
                        new ResStat(ResType.GLASS, 36)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.STEEL, 42),
                        new ResStat(ResType.CONCRETE, 42),
                        new ResStat(ResType.BRICK, 42),
                        new ResStat(ResType.WOOD, 42),
                        new ResStat(ResType.GLASS, 42)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.STEEL, 48),
                        new ResStat(ResType.CONCRETE, 48),
                        new ResStat(ResType.BRICK, 48),
                        new ResStat(ResType.WOOD, 48),
                        new ResStat(ResType.GLASS, 48)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.STEEL, 54),
                        new ResStat(ResType.CONCRETE, 54),
                        new ResStat(ResType.BRICK, 54),
                        new ResStat(ResType.WOOD, 54),
                        new ResStat(ResType.GLASS, 54)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.STEEL, 60),
                        new ResStat(ResType.CONCRETE, 60),
                        new ResStat(ResType.BRICK, 60),
                        new ResStat(ResType.WOOD, 60),
                        new ResStat(ResType.GLASS, 60)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.STEEL, 68),
                        new ResStat(ResType.CONCRETE, 68),
                        new ResStat(ResType.BRICK, 68),
                        new ResStat(ResType.WOOD, 68),
                        new ResStat(ResType.GLASS, 68)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.STEEL, 76),
                        new ResStat(ResType.CONCRETE, 76),
                        new ResStat(ResType.BRICK, 76),
                        new ResStat(ResType.WOOD, 76),
                        new ResStat(ResType.GLASS, 76)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.STEEL, 84),
                        new ResStat(ResType.CONCRETE, 84),
                        new ResStat(ResType.BRICK, 84),
                        new ResStat(ResType.WOOD, 84),
                        new ResStat(ResType.GLASS, 84)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.STEEL, 92),
                        new ResStat(ResType.CONCRETE, 92),
                        new ResStat(ResType.BRICK, 92),
                        new ResStat(ResType.WOOD, 92),
                        new ResStat(ResType.GLASS, 92)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.STEEL, 100),
                        new ResStat(ResType.CONCRETE, 100),
                        new ResStat(ResType.BRICK, 100),
                        new ResStat(ResType.WOOD, 100),
                        new ResStat(ResType.GLASS, 100)
                )
        });
        setDemand(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.UPKEEP, 240),
                        new ResStat(ResType.POWER_CONSUMPTION, 9),
                        new ResStat(ResType.JOB, 180),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.UPKEEP, 480),
                        new ResStat(ResType.POWER_CONSUMPTION, 18),
                        new ResStat(ResType.JOB, 360),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.UPKEEP, 720),
                        new ResStat(ResType.POWER_CONSUMPTION, 27),
                        new ResStat(ResType.JOB, 540),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.UPKEEP, 960),
                        new ResStat(ResType.POWER_CONSUMPTION, 36),
                        new ResStat(ResType.JOB, 720),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.UPKEEP, 1200),
                        new ResStat(ResType.POWER_CONSUMPTION, 45),
                        new ResStat(ResType.JOB, 900),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.UPKEEP, 1680),
                        new ResStat(ResType.POWER_CONSUMPTION, 63),
                        new ResStat(ResType.JOB, 1260),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.UPKEEP, 2160),
                        new ResStat(ResType.POWER_CONSUMPTION, 81),
                        new ResStat(ResType.JOB, 1620),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.UPKEEP, 2640),
                        new ResStat(ResType.POWER_CONSUMPTION, 99),
                        new ResStat(ResType.JOB, 1980),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.UPKEEP, 3120),
                        new ResStat(ResType.POWER_CONSUMPTION, 117),
                        new ResStat(ResType.JOB, 2340),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.UPKEEP, 3600),
                        new ResStat(ResType.POWER_CONSUMPTION, 135),
                        new ResStat(ResType.JOB, 2700),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.UPKEEP, 4320),
                        new ResStat(ResType.POWER_CONSUMPTION, 162),
                        new ResStat(ResType.JOB, 3240),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.UPKEEP, 5040),
                        new ResStat(ResType.POWER_CONSUMPTION, 189),
                        new ResStat(ResType.JOB, 3780),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.UPKEEP, 5760),
                        new ResStat(ResType.POWER_CONSUMPTION, 216),
                        new ResStat(ResType.JOB, 4320),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.UPKEEP, 6480),
                        new ResStat(ResType.POWER_CONSUMPTION, 243),
                        new ResStat(ResType.JOB, 4860),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.UPKEEP, 7200),
                        new ResStat(ResType.POWER_CONSUMPTION, 270),
                        new ResStat(ResType.JOB, 5400),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.UPKEEP, 8160),
                        new ResStat(ResType.POWER_CONSUMPTION, 306),
                        new ResStat(ResType.JOB, 6120),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.UPKEEP, 9120),
                        new ResStat(ResType.POWER_CONSUMPTION, 342),
                        new ResStat(ResType.JOB, 6840),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.UPKEEP, 10080),
                        new ResStat(ResType.POWER_CONSUMPTION, 378),
                        new ResStat(ResType.JOB, 7560),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.UPKEEP, 11040),
                        new ResStat(ResType.POWER_CONSUMPTION, 414),
                        new ResStat(ResType.JOB, 8280),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.UPKEEP, 12000),
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
    }
}
