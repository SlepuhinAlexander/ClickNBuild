package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;
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
        setBuildCost(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.CONSTRUCTION, 560),
                        new ResourceChunk(ResType.STEEL, 367),
                        new ResourceChunk(ResType.CONCRETE, 1224),
                        new ResourceChunk(ResType.BRICK, 918),
                        new ResourceChunk(ResType.WOOD, 77),
                        new ResourceChunk(ResType.GLASS, 102),
                        new ResourceChunk(ResType.MONEY, 61200)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.CONSTRUCTION, 1680),
                        new ResourceChunk(ResType.STEEL, 1116),
                        new ResourceChunk(ResType.CONCRETE, 3720),
                        new ResourceChunk(ResType.BRICK, 2790),
                        new ResourceChunk(ResType.WOOD, 233),
                        new ResourceChunk(ResType.GLASS, 310),
                        new ResourceChunk(ResType.MONEY, 186000)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.CONSTRUCTION, 3360),
                        new ResourceChunk(ResType.STEEL, 2261),
                        new ResourceChunk(ResType.CONCRETE, 7536),
                        new ResourceChunk(ResType.BRICK, 5652),
                        new ResourceChunk(ResType.WOOD, 471),
                        new ResourceChunk(ResType.GLASS, 628),
                        new ResourceChunk(ResType.MONEY, 376800)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.CONSTRUCTION, 5600),
                        new ResourceChunk(ResType.STEEL, 3816),
                        new ResourceChunk(ResType.CONCRETE, 12720),
                        new ResourceChunk(ResType.BRICK, 9540),
                        new ResourceChunk(ResType.WOOD, 795),
                        new ResourceChunk(ResType.GLASS, 1060),
                        new ResourceChunk(ResType.MONEY, 636000)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.CONSTRUCTION, 8400),
                        new ResourceChunk(ResType.STEEL, 5796),
                        new ResourceChunk(ResType.CONCRETE, 19320),
                        new ResourceChunk(ResType.BRICK, 14490),
                        new ResourceChunk(ResType.WOOD, 1208),
                        new ResourceChunk(ResType.GLASS, 1610),
                        new ResourceChunk(ResType.MONEY, 966000)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.CONSTRUCTION, 12320),
                        new ResourceChunk(ResType.STEEL, 8669),
                        new ResourceChunk(ResType.CONCRETE, 28896),
                        new ResourceChunk(ResType.BRICK, 21672),
                        new ResourceChunk(ResType.WOOD, 1806),
                        new ResourceChunk(ResType.GLASS, 2408),
                        new ResourceChunk(ResType.MONEY, 1444800)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.CONSTRUCTION, 17360),
                        new ResourceChunk(ResType.STEEL, 12492),
                        new ResourceChunk(ResType.CONCRETE, 41640),
                        new ResourceChunk(ResType.BRICK, 31230),
                        new ResourceChunk(ResType.WOOD, 2603),
                        new ResourceChunk(ResType.GLASS, 3470),
                        new ResourceChunk(ResType.MONEY, 2082000)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.CONSTRUCTION, 23520),
                        new ResourceChunk(ResType.STEEL, 17323),
                        new ResourceChunk(ResType.CONCRETE, 57744),
                        new ResourceChunk(ResType.BRICK, 43308),
                        new ResourceChunk(ResType.WOOD, 3609),
                        new ResourceChunk(ResType.GLASS, 4812),
                        new ResourceChunk(ResType.MONEY, 2887200)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.CONSTRUCTION, 30800),
                        new ResourceChunk(ResType.STEEL, 23220),
                        new ResourceChunk(ResType.CONCRETE, 77400),
                        new ResourceChunk(ResType.BRICK, 58050),
                        new ResourceChunk(ResType.WOOD, 4838),
                        new ResourceChunk(ResType.GLASS, 6450),
                        new ResourceChunk(ResType.MONEY, 3870000)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.CONSTRUCTION, 39200),
                        new ResourceChunk(ResType.STEEL, 30240),
                        new ResourceChunk(ResType.CONCRETE, 100800),
                        new ResourceChunk(ResType.BRICK, 75600),
                        new ResourceChunk(ResType.WOOD, 6300),
                        new ResourceChunk(ResType.GLASS, 8400),
                        new ResourceChunk(ResType.MONEY, 5040000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.CONSTRUCTION, 49280),
                        new ResourceChunk(ResType.STEEL, 39053),
                        new ResourceChunk(ResType.CONCRETE, 130176),
                        new ResourceChunk(ResType.BRICK, 97632),
                        new ResourceChunk(ResType.WOOD, 8136),
                        new ResourceChunk(ResType.GLASS, 10848),
                        new ResourceChunk(ResType.MONEY, 6508800)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.CONSTRUCTION, 61040),
                        new ResourceChunk(ResType.STEEL, 49788),
                        new ResourceChunk(ResType.CONCRETE, 165960),
                        new ResourceChunk(ResType.BRICK, 124470),
                        new ResourceChunk(ResType.WOOD, 10373),
                        new ResourceChunk(ResType.GLASS, 13830),
                        new ResourceChunk(ResType.MONEY, 8298000)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.CONSTRUCTION, 74480),
                        new ResourceChunk(ResType.STEEL, 62575),
                        new ResourceChunk(ResType.CONCRETE, 208584),
                        new ResourceChunk(ResType.BRICK, 156438),
                        new ResourceChunk(ResType.WOOD, 13037),
                        new ResourceChunk(ResType.GLASS, 17382),
                        new ResourceChunk(ResType.MONEY, 10429200)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.CONSTRUCTION, 89600),
                        new ResourceChunk(ResType.STEEL, 77544),
                        new ResourceChunk(ResType.CONCRETE, 258480),
                        new ResourceChunk(ResType.BRICK, 193860),
                        new ResourceChunk(ResType.WOOD, 16155),
                        new ResourceChunk(ResType.GLASS, 21540),
                        new ResourceChunk(ResType.MONEY, 12924000)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.CONSTRUCTION, 106400),
                        new ResourceChunk(ResType.STEEL, 94824),
                        new ResourceChunk(ResType.CONCRETE, 316080),
                        new ResourceChunk(ResType.BRICK, 237060),
                        new ResourceChunk(ResType.WOOD, 19755),
                        new ResourceChunk(ResType.GLASS, 26340),
                        new ResourceChunk(ResType.MONEY, 15804000)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.CONSTRUCTION, 125440),
                        new ResourceChunk(ResType.STEEL, 115387),
                        new ResourceChunk(ResType.CONCRETE, 384624),
                        new ResourceChunk(ResType.BRICK, 288468),
                        new ResourceChunk(ResType.WOOD, 24039),
                        new ResourceChunk(ResType.GLASS, 32052),
                        new ResourceChunk(ResType.MONEY, 19231200)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.CONSTRUCTION, 146720),
                        new ResourceChunk(ResType.STEEL, 139464),
                        new ResourceChunk(ResType.CONCRETE, 464880),
                        new ResourceChunk(ResType.BRICK, 348660),
                        new ResourceChunk(ResType.WOOD, 29055),
                        new ResourceChunk(ResType.GLASS, 38740),
                        new ResourceChunk(ResType.MONEY, 23244000)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.CONSTRUCTION, 170240),
                        new ResourceChunk(ResType.STEEL, 167285),
                        new ResourceChunk(ResType.CONCRETE, 557616),
                        new ResourceChunk(ResType.BRICK, 418212),
                        new ResourceChunk(ResType.WOOD, 34851),
                        new ResourceChunk(ResType.GLASS, 46468),
                        new ResourceChunk(ResType.MONEY, 27880800)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.CONSTRUCTION, 196000),
                        new ResourceChunk(ResType.STEEL, 199080),
                        new ResourceChunk(ResType.CONCRETE, 663600),
                        new ResourceChunk(ResType.BRICK, 497700),
                        new ResourceChunk(ResType.WOOD, 41475),
                        new ResourceChunk(ResType.GLASS, 55300),
                        new ResourceChunk(ResType.MONEY, 33180000)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.CONSTRUCTION, 224000),
                        new ResourceChunk(ResType.STEEL, 235080),
                        new ResourceChunk(ResType.CONCRETE, 783600),
                        new ResourceChunk(ResType.BRICK, 587700),
                        new ResourceChunk(ResType.WOOD, 48975),
                        new ResourceChunk(ResType.GLASS, 65300),
                        new ResourceChunk(ResType.MONEY, 39180000)
                )
        });
        setProductionMultiplier(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.STEEL, 2),
                        new ResourceChunk(ResType.CONCRETE, 2),
                        new ResourceChunk(ResType.BRICK, 2),
                        new ResourceChunk(ResType.WOOD, 2),
                        new ResourceChunk(ResType.GLASS, 2)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.STEEL, 4),
                        new ResourceChunk(ResType.CONCRETE, 4),
                        new ResourceChunk(ResType.BRICK, 4),
                        new ResourceChunk(ResType.WOOD, 4),
                        new ResourceChunk(ResType.GLASS, 4)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.STEEL, 6),
                        new ResourceChunk(ResType.CONCRETE, 6),
                        new ResourceChunk(ResType.BRICK, 6),
                        new ResourceChunk(ResType.WOOD, 6),
                        new ResourceChunk(ResType.GLASS, 6)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.STEEL, 8),
                        new ResourceChunk(ResType.CONCRETE, 8),
                        new ResourceChunk(ResType.BRICK, 8),
                        new ResourceChunk(ResType.WOOD, 8),
                        new ResourceChunk(ResType.GLASS, 8)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.STEEL, 10),
                        new ResourceChunk(ResType.CONCRETE, 10),
                        new ResourceChunk(ResType.BRICK, 10),
                        new ResourceChunk(ResType.WOOD, 10),
                        new ResourceChunk(ResType.GLASS, 10)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.STEEL, 14),
                        new ResourceChunk(ResType.CONCRETE, 14),
                        new ResourceChunk(ResType.BRICK, 14),
                        new ResourceChunk(ResType.WOOD, 14),
                        new ResourceChunk(ResType.GLASS, 14)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.STEEL, 18),
                        new ResourceChunk(ResType.CONCRETE, 18),
                        new ResourceChunk(ResType.BRICK, 18),
                        new ResourceChunk(ResType.WOOD, 18),
                        new ResourceChunk(ResType.GLASS, 18)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.STEEL, 22),
                        new ResourceChunk(ResType.CONCRETE, 22),
                        new ResourceChunk(ResType.BRICK, 22),
                        new ResourceChunk(ResType.WOOD, 22),
                        new ResourceChunk(ResType.GLASS, 22)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.STEEL, 26),
                        new ResourceChunk(ResType.CONCRETE, 26),
                        new ResourceChunk(ResType.BRICK, 26),
                        new ResourceChunk(ResType.WOOD, 26),
                        new ResourceChunk(ResType.GLASS, 26)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.STEEL, 30),
                        new ResourceChunk(ResType.CONCRETE, 30),
                        new ResourceChunk(ResType.BRICK, 30),
                        new ResourceChunk(ResType.WOOD, 30),
                        new ResourceChunk(ResType.GLASS, 30)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.STEEL, 36),
                        new ResourceChunk(ResType.CONCRETE, 36),
                        new ResourceChunk(ResType.BRICK, 36),
                        new ResourceChunk(ResType.WOOD, 36),
                        new ResourceChunk(ResType.GLASS, 36)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.STEEL, 42),
                        new ResourceChunk(ResType.CONCRETE, 42),
                        new ResourceChunk(ResType.BRICK, 42),
                        new ResourceChunk(ResType.WOOD, 42),
                        new ResourceChunk(ResType.GLASS, 42)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.STEEL, 48),
                        new ResourceChunk(ResType.CONCRETE, 48),
                        new ResourceChunk(ResType.BRICK, 48),
                        new ResourceChunk(ResType.WOOD, 48),
                        new ResourceChunk(ResType.GLASS, 48)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.STEEL, 54),
                        new ResourceChunk(ResType.CONCRETE, 54),
                        new ResourceChunk(ResType.BRICK, 54),
                        new ResourceChunk(ResType.WOOD, 54),
                        new ResourceChunk(ResType.GLASS, 54)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.STEEL, 60),
                        new ResourceChunk(ResType.CONCRETE, 60),
                        new ResourceChunk(ResType.BRICK, 60),
                        new ResourceChunk(ResType.WOOD, 60),
                        new ResourceChunk(ResType.GLASS, 60)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.STEEL, 68),
                        new ResourceChunk(ResType.CONCRETE, 68),
                        new ResourceChunk(ResType.BRICK, 68),
                        new ResourceChunk(ResType.WOOD, 68),
                        new ResourceChunk(ResType.GLASS, 68)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.STEEL, 76),
                        new ResourceChunk(ResType.CONCRETE, 76),
                        new ResourceChunk(ResType.BRICK, 76),
                        new ResourceChunk(ResType.WOOD, 76),
                        new ResourceChunk(ResType.GLASS, 76)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.STEEL, 84),
                        new ResourceChunk(ResType.CONCRETE, 84),
                        new ResourceChunk(ResType.BRICK, 84),
                        new ResourceChunk(ResType.WOOD, 84),
                        new ResourceChunk(ResType.GLASS, 84)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.STEEL, 92),
                        new ResourceChunk(ResType.CONCRETE, 92),
                        new ResourceChunk(ResType.BRICK, 92),
                        new ResourceChunk(ResType.WOOD, 92),
                        new ResourceChunk(ResType.GLASS, 92)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.STEEL, 100),
                        new ResourceChunk(ResType.CONCRETE, 100),
                        new ResourceChunk(ResType.BRICK, 100),
                        new ResourceChunk(ResType.WOOD, 100),
                        new ResourceChunk(ResType.GLASS, 100)
                )
        });
        setJobRewardMultiplier(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.STEEL, 2),
                        new ResourceChunk(ResType.CONCRETE, 2),
                        new ResourceChunk(ResType.BRICK, 2),
                        new ResourceChunk(ResType.WOOD, 2),
                        new ResourceChunk(ResType.GLASS, 2)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.STEEL, 4),
                        new ResourceChunk(ResType.CONCRETE, 4),
                        new ResourceChunk(ResType.BRICK, 4),
                        new ResourceChunk(ResType.WOOD, 4),
                        new ResourceChunk(ResType.GLASS, 4)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.STEEL, 6),
                        new ResourceChunk(ResType.CONCRETE, 6),
                        new ResourceChunk(ResType.BRICK, 6),
                        new ResourceChunk(ResType.WOOD, 6),
                        new ResourceChunk(ResType.GLASS, 6)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.STEEL, 8),
                        new ResourceChunk(ResType.CONCRETE, 8),
                        new ResourceChunk(ResType.BRICK, 8),
                        new ResourceChunk(ResType.WOOD, 8),
                        new ResourceChunk(ResType.GLASS, 8)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.STEEL, 10),
                        new ResourceChunk(ResType.CONCRETE, 10),
                        new ResourceChunk(ResType.BRICK, 10),
                        new ResourceChunk(ResType.WOOD, 10),
                        new ResourceChunk(ResType.GLASS, 10)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.STEEL, 14),
                        new ResourceChunk(ResType.CONCRETE, 14),
                        new ResourceChunk(ResType.BRICK, 14),
                        new ResourceChunk(ResType.WOOD, 14),
                        new ResourceChunk(ResType.GLASS, 14)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.STEEL, 18),
                        new ResourceChunk(ResType.CONCRETE, 18),
                        new ResourceChunk(ResType.BRICK, 18),
                        new ResourceChunk(ResType.WOOD, 18),
                        new ResourceChunk(ResType.GLASS, 18)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.STEEL, 22),
                        new ResourceChunk(ResType.CONCRETE, 22),
                        new ResourceChunk(ResType.BRICK, 22),
                        new ResourceChunk(ResType.WOOD, 22),
                        new ResourceChunk(ResType.GLASS, 22)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.STEEL, 26),
                        new ResourceChunk(ResType.CONCRETE, 26),
                        new ResourceChunk(ResType.BRICK, 26),
                        new ResourceChunk(ResType.WOOD, 26),
                        new ResourceChunk(ResType.GLASS, 26)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.STEEL, 30),
                        new ResourceChunk(ResType.CONCRETE, 30),
                        new ResourceChunk(ResType.BRICK, 30),
                        new ResourceChunk(ResType.WOOD, 30),
                        new ResourceChunk(ResType.GLASS, 30)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.STEEL, 36),
                        new ResourceChunk(ResType.CONCRETE, 36),
                        new ResourceChunk(ResType.BRICK, 36),
                        new ResourceChunk(ResType.WOOD, 36),
                        new ResourceChunk(ResType.GLASS, 36)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.STEEL, 42),
                        new ResourceChunk(ResType.CONCRETE, 42),
                        new ResourceChunk(ResType.BRICK, 42),
                        new ResourceChunk(ResType.WOOD, 42),
                        new ResourceChunk(ResType.GLASS, 42)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.STEEL, 48),
                        new ResourceChunk(ResType.CONCRETE, 48),
                        new ResourceChunk(ResType.BRICK, 48),
                        new ResourceChunk(ResType.WOOD, 48),
                        new ResourceChunk(ResType.GLASS, 48)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.STEEL, 54),
                        new ResourceChunk(ResType.CONCRETE, 54),
                        new ResourceChunk(ResType.BRICK, 54),
                        new ResourceChunk(ResType.WOOD, 54),
                        new ResourceChunk(ResType.GLASS, 54)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.STEEL, 60),
                        new ResourceChunk(ResType.CONCRETE, 60),
                        new ResourceChunk(ResType.BRICK, 60),
                        new ResourceChunk(ResType.WOOD, 60),
                        new ResourceChunk(ResType.GLASS, 60)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.STEEL, 68),
                        new ResourceChunk(ResType.CONCRETE, 68),
                        new ResourceChunk(ResType.BRICK, 68),
                        new ResourceChunk(ResType.WOOD, 68),
                        new ResourceChunk(ResType.GLASS, 68)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.STEEL, 76),
                        new ResourceChunk(ResType.CONCRETE, 76),
                        new ResourceChunk(ResType.BRICK, 76),
                        new ResourceChunk(ResType.WOOD, 76),
                        new ResourceChunk(ResType.GLASS, 76)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.STEEL, 84),
                        new ResourceChunk(ResType.CONCRETE, 84),
                        new ResourceChunk(ResType.BRICK, 84),
                        new ResourceChunk(ResType.WOOD, 84),
                        new ResourceChunk(ResType.GLASS, 84)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.STEEL, 92),
                        new ResourceChunk(ResType.CONCRETE, 92),
                        new ResourceChunk(ResType.BRICK, 92),
                        new ResourceChunk(ResType.WOOD, 92),
                        new ResourceChunk(ResType.GLASS, 92)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.STEEL, 100),
                        new ResourceChunk(ResType.CONCRETE, 100),
                        new ResourceChunk(ResType.BRICK, 100),
                        new ResourceChunk(ResType.WOOD, 100),
                        new ResourceChunk(ResType.GLASS, 100)
                )
        });
        setDemand(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.UPKEEP, 240),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 9),
                        new ResourceChunk(ResType.JOB, 180),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.UPKEEP, 480),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 18),
                        new ResourceChunk(ResType.JOB, 360),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.UPKEEP, 720),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 27),
                        new ResourceChunk(ResType.JOB, 540),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.UPKEEP, 960),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 36),
                        new ResourceChunk(ResType.JOB, 720),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.UPKEEP, 1200),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 45),
                        new ResourceChunk(ResType.JOB, 900),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.UPKEEP, 1680),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 63),
                        new ResourceChunk(ResType.JOB, 1260),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.UPKEEP, 2160),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 81),
                        new ResourceChunk(ResType.JOB, 1620),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.UPKEEP, 2640),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 99),
                        new ResourceChunk(ResType.JOB, 1980),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.UPKEEP, 3120),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 117),
                        new ResourceChunk(ResType.JOB, 2340),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.UPKEEP, 3600),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 135),
                        new ResourceChunk(ResType.JOB, 2700),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.UPKEEP, 4320),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 162),
                        new ResourceChunk(ResType.JOB, 3240),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.UPKEEP, 5040),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 189),
                        new ResourceChunk(ResType.JOB, 3780),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.UPKEEP, 5760),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 216),
                        new ResourceChunk(ResType.JOB, 4320),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.UPKEEP, 6480),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 243),
                        new ResourceChunk(ResType.JOB, 4860),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.UPKEEP, 7200),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 270),
                        new ResourceChunk(ResType.JOB, 5400),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.UPKEEP, 8160),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 306),
                        new ResourceChunk(ResType.JOB, 6120),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.UPKEEP, 9120),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 342),
                        new ResourceChunk(ResType.JOB, 6840),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.UPKEEP, 10080),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 378),
                        new ResourceChunk(ResType.JOB, 7560),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.UPKEEP, 11040),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 414),
                        new ResourceChunk(ResType.JOB, 8280),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.UPKEEP, 12000),
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
    }
}
