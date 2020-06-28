package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;
import org.itworks.clicknbuild.engine.model.ResourceType;

public final class EngineeringCenterStats extends BuildingStats {
    private static final EngineeringCenterStats INST = new EngineeringCenterStats();

    private EngineeringCenterStats() {
    }

    public static EngineeringCenterStats inst() {
        return INST;
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
                        new ResourceChunk(ResourceType.CONSTRUCTION, 560),
                        new ResourceChunk(ResourceType.STEEL, 367),
                        new ResourceChunk(ResourceType.CONCRETE, 1224),
                        new ResourceChunk(ResourceType.BRICK, 918),
                        new ResourceChunk(ResourceType.WOOD, 77),
                        new ResourceChunk(ResourceType.GLASS, 102),
                        new ResourceChunk(ResourceType.MONEY, 61200)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.CONSTRUCTION, 1680),
                        new ResourceChunk(ResourceType.STEEL, 1116),
                        new ResourceChunk(ResourceType.CONCRETE, 3720),
                        new ResourceChunk(ResourceType.BRICK, 2790),
                        new ResourceChunk(ResourceType.WOOD, 233),
                        new ResourceChunk(ResourceType.GLASS, 310),
                        new ResourceChunk(ResourceType.MONEY, 186000)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.CONSTRUCTION, 3360),
                        new ResourceChunk(ResourceType.STEEL, 2261),
                        new ResourceChunk(ResourceType.CONCRETE, 7536),
                        new ResourceChunk(ResourceType.BRICK, 5652),
                        new ResourceChunk(ResourceType.WOOD, 471),
                        new ResourceChunk(ResourceType.GLASS, 628),
                        new ResourceChunk(ResourceType.MONEY, 376800)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.CONSTRUCTION, 5600),
                        new ResourceChunk(ResourceType.STEEL, 3816),
                        new ResourceChunk(ResourceType.CONCRETE, 12720),
                        new ResourceChunk(ResourceType.BRICK, 9540),
                        new ResourceChunk(ResourceType.WOOD, 795),
                        new ResourceChunk(ResourceType.GLASS, 1060),
                        new ResourceChunk(ResourceType.MONEY, 636000)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.CONSTRUCTION, 8400),
                        new ResourceChunk(ResourceType.STEEL, 5796),
                        new ResourceChunk(ResourceType.CONCRETE, 19320),
                        new ResourceChunk(ResourceType.BRICK, 14490),
                        new ResourceChunk(ResourceType.WOOD, 1208),
                        new ResourceChunk(ResourceType.GLASS, 1610),
                        new ResourceChunk(ResourceType.MONEY, 966000)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.CONSTRUCTION, 12320),
                        new ResourceChunk(ResourceType.STEEL, 8669),
                        new ResourceChunk(ResourceType.CONCRETE, 28896),
                        new ResourceChunk(ResourceType.BRICK, 21672),
                        new ResourceChunk(ResourceType.WOOD, 1806),
                        new ResourceChunk(ResourceType.GLASS, 2408),
                        new ResourceChunk(ResourceType.MONEY, 1444800)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.CONSTRUCTION, 17360),
                        new ResourceChunk(ResourceType.STEEL, 12492),
                        new ResourceChunk(ResourceType.CONCRETE, 41640),
                        new ResourceChunk(ResourceType.BRICK, 31230),
                        new ResourceChunk(ResourceType.WOOD, 2603),
                        new ResourceChunk(ResourceType.GLASS, 3470),
                        new ResourceChunk(ResourceType.MONEY, 2082000)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.CONSTRUCTION, 23520),
                        new ResourceChunk(ResourceType.STEEL, 17323),
                        new ResourceChunk(ResourceType.CONCRETE, 57744),
                        new ResourceChunk(ResourceType.BRICK, 43308),
                        new ResourceChunk(ResourceType.WOOD, 3609),
                        new ResourceChunk(ResourceType.GLASS, 4812),
                        new ResourceChunk(ResourceType.MONEY, 2887200)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.CONSTRUCTION, 30800),
                        new ResourceChunk(ResourceType.STEEL, 23220),
                        new ResourceChunk(ResourceType.CONCRETE, 77400),
                        new ResourceChunk(ResourceType.BRICK, 58050),
                        new ResourceChunk(ResourceType.WOOD, 4838),
                        new ResourceChunk(ResourceType.GLASS, 6450),
                        new ResourceChunk(ResourceType.MONEY, 3870000)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.CONSTRUCTION, 39200),
                        new ResourceChunk(ResourceType.STEEL, 30240),
                        new ResourceChunk(ResourceType.CONCRETE, 100800),
                        new ResourceChunk(ResourceType.BRICK, 75600),
                        new ResourceChunk(ResourceType.WOOD, 6300),
                        new ResourceChunk(ResourceType.GLASS, 8400),
                        new ResourceChunk(ResourceType.MONEY, 5040000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.CONSTRUCTION, 49280),
                        new ResourceChunk(ResourceType.STEEL, 39053),
                        new ResourceChunk(ResourceType.CONCRETE, 130176),
                        new ResourceChunk(ResourceType.BRICK, 97632),
                        new ResourceChunk(ResourceType.WOOD, 8136),
                        new ResourceChunk(ResourceType.GLASS, 10848),
                        new ResourceChunk(ResourceType.MONEY, 6508800)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.CONSTRUCTION, 61040),
                        new ResourceChunk(ResourceType.STEEL, 49788),
                        new ResourceChunk(ResourceType.CONCRETE, 165960),
                        new ResourceChunk(ResourceType.BRICK, 124470),
                        new ResourceChunk(ResourceType.WOOD, 10373),
                        new ResourceChunk(ResourceType.GLASS, 13830),
                        new ResourceChunk(ResourceType.MONEY, 8298000)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.CONSTRUCTION, 74480),
                        new ResourceChunk(ResourceType.STEEL, 62575),
                        new ResourceChunk(ResourceType.CONCRETE, 208584),
                        new ResourceChunk(ResourceType.BRICK, 156438),
                        new ResourceChunk(ResourceType.WOOD, 13037),
                        new ResourceChunk(ResourceType.GLASS, 17382),
                        new ResourceChunk(ResourceType.MONEY, 10429200)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.CONSTRUCTION, 89600),
                        new ResourceChunk(ResourceType.STEEL, 77544),
                        new ResourceChunk(ResourceType.CONCRETE, 258480),
                        new ResourceChunk(ResourceType.BRICK, 193860),
                        new ResourceChunk(ResourceType.WOOD, 16155),
                        new ResourceChunk(ResourceType.GLASS, 21540),
                        new ResourceChunk(ResourceType.MONEY, 12924000)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.CONSTRUCTION, 106400),
                        new ResourceChunk(ResourceType.STEEL, 94824),
                        new ResourceChunk(ResourceType.CONCRETE, 316080),
                        new ResourceChunk(ResourceType.BRICK, 237060),
                        new ResourceChunk(ResourceType.WOOD, 19755),
                        new ResourceChunk(ResourceType.GLASS, 26340),
                        new ResourceChunk(ResourceType.MONEY, 15804000)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.CONSTRUCTION, 125440),
                        new ResourceChunk(ResourceType.STEEL, 115387),
                        new ResourceChunk(ResourceType.CONCRETE, 384624),
                        new ResourceChunk(ResourceType.BRICK, 288468),
                        new ResourceChunk(ResourceType.WOOD, 24039),
                        new ResourceChunk(ResourceType.GLASS, 32052),
                        new ResourceChunk(ResourceType.MONEY, 19231200)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.CONSTRUCTION, 146720),
                        new ResourceChunk(ResourceType.STEEL, 139464),
                        new ResourceChunk(ResourceType.CONCRETE, 464880),
                        new ResourceChunk(ResourceType.BRICK, 348660),
                        new ResourceChunk(ResourceType.WOOD, 29055),
                        new ResourceChunk(ResourceType.GLASS, 38740),
                        new ResourceChunk(ResourceType.MONEY, 23244000)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.CONSTRUCTION, 170240),
                        new ResourceChunk(ResourceType.STEEL, 167285),
                        new ResourceChunk(ResourceType.CONCRETE, 557616),
                        new ResourceChunk(ResourceType.BRICK, 418212),
                        new ResourceChunk(ResourceType.WOOD, 34851),
                        new ResourceChunk(ResourceType.GLASS, 46468),
                        new ResourceChunk(ResourceType.MONEY, 27880800)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.CONSTRUCTION, 196000),
                        new ResourceChunk(ResourceType.STEEL, 199080),
                        new ResourceChunk(ResourceType.CONCRETE, 663600),
                        new ResourceChunk(ResourceType.BRICK, 497700),
                        new ResourceChunk(ResourceType.WOOD, 41475),
                        new ResourceChunk(ResourceType.GLASS, 55300),
                        new ResourceChunk(ResourceType.MONEY, 33180000)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.CONSTRUCTION, 224000),
                        new ResourceChunk(ResourceType.STEEL, 235080),
                        new ResourceChunk(ResourceType.CONCRETE, 783600),
                        new ResourceChunk(ResourceType.BRICK, 587700),
                        new ResourceChunk(ResourceType.WOOD, 48975),
                        new ResourceChunk(ResourceType.GLASS, 65300),
                        new ResourceChunk(ResourceType.MONEY, 39180000)
                )
        });
        setProductionMultiplier(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.STEEL, 2),
                        new ResourceChunk(ResourceType.CONCRETE, 2),
                        new ResourceChunk(ResourceType.BRICK, 2),
                        new ResourceChunk(ResourceType.WOOD, 2),
                        new ResourceChunk(ResourceType.GLASS, 2)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.STEEL, 4),
                        new ResourceChunk(ResourceType.CONCRETE, 4),
                        new ResourceChunk(ResourceType.BRICK, 4),
                        new ResourceChunk(ResourceType.WOOD, 4),
                        new ResourceChunk(ResourceType.GLASS, 4)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.STEEL, 6),
                        new ResourceChunk(ResourceType.CONCRETE, 6),
                        new ResourceChunk(ResourceType.BRICK, 6),
                        new ResourceChunk(ResourceType.WOOD, 6),
                        new ResourceChunk(ResourceType.GLASS, 6)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.STEEL, 8),
                        new ResourceChunk(ResourceType.CONCRETE, 8),
                        new ResourceChunk(ResourceType.BRICK, 8),
                        new ResourceChunk(ResourceType.WOOD, 8),
                        new ResourceChunk(ResourceType.GLASS, 8)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.STEEL, 10),
                        new ResourceChunk(ResourceType.CONCRETE, 10),
                        new ResourceChunk(ResourceType.BRICK, 10),
                        new ResourceChunk(ResourceType.WOOD, 10),
                        new ResourceChunk(ResourceType.GLASS, 10)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.STEEL, 14),
                        new ResourceChunk(ResourceType.CONCRETE, 14),
                        new ResourceChunk(ResourceType.BRICK, 14),
                        new ResourceChunk(ResourceType.WOOD, 14),
                        new ResourceChunk(ResourceType.GLASS, 14)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.STEEL, 18),
                        new ResourceChunk(ResourceType.CONCRETE, 18),
                        new ResourceChunk(ResourceType.BRICK, 18),
                        new ResourceChunk(ResourceType.WOOD, 18),
                        new ResourceChunk(ResourceType.GLASS, 18)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.STEEL, 22),
                        new ResourceChunk(ResourceType.CONCRETE, 22),
                        new ResourceChunk(ResourceType.BRICK, 22),
                        new ResourceChunk(ResourceType.WOOD, 22),
                        new ResourceChunk(ResourceType.GLASS, 22)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.STEEL, 26),
                        new ResourceChunk(ResourceType.CONCRETE, 26),
                        new ResourceChunk(ResourceType.BRICK, 26),
                        new ResourceChunk(ResourceType.WOOD, 26),
                        new ResourceChunk(ResourceType.GLASS, 26)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.STEEL, 30),
                        new ResourceChunk(ResourceType.CONCRETE, 30),
                        new ResourceChunk(ResourceType.BRICK, 30),
                        new ResourceChunk(ResourceType.WOOD, 30),
                        new ResourceChunk(ResourceType.GLASS, 30)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.STEEL, 36),
                        new ResourceChunk(ResourceType.CONCRETE, 36),
                        new ResourceChunk(ResourceType.BRICK, 36),
                        new ResourceChunk(ResourceType.WOOD, 36),
                        new ResourceChunk(ResourceType.GLASS, 36)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.STEEL, 42),
                        new ResourceChunk(ResourceType.CONCRETE, 42),
                        new ResourceChunk(ResourceType.BRICK, 42),
                        new ResourceChunk(ResourceType.WOOD, 42),
                        new ResourceChunk(ResourceType.GLASS, 42)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.STEEL, 48),
                        new ResourceChunk(ResourceType.CONCRETE, 48),
                        new ResourceChunk(ResourceType.BRICK, 48),
                        new ResourceChunk(ResourceType.WOOD, 48),
                        new ResourceChunk(ResourceType.GLASS, 48)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.STEEL, 54),
                        new ResourceChunk(ResourceType.CONCRETE, 54),
                        new ResourceChunk(ResourceType.BRICK, 54),
                        new ResourceChunk(ResourceType.WOOD, 54),
                        new ResourceChunk(ResourceType.GLASS, 54)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.STEEL, 60),
                        new ResourceChunk(ResourceType.CONCRETE, 60),
                        new ResourceChunk(ResourceType.BRICK, 60),
                        new ResourceChunk(ResourceType.WOOD, 60),
                        new ResourceChunk(ResourceType.GLASS, 60)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.STEEL, 68),
                        new ResourceChunk(ResourceType.CONCRETE, 68),
                        new ResourceChunk(ResourceType.BRICK, 68),
                        new ResourceChunk(ResourceType.WOOD, 68),
                        new ResourceChunk(ResourceType.GLASS, 68)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.STEEL, 76),
                        new ResourceChunk(ResourceType.CONCRETE, 76),
                        new ResourceChunk(ResourceType.BRICK, 76),
                        new ResourceChunk(ResourceType.WOOD, 76),
                        new ResourceChunk(ResourceType.GLASS, 76)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.STEEL, 84),
                        new ResourceChunk(ResourceType.CONCRETE, 84),
                        new ResourceChunk(ResourceType.BRICK, 84),
                        new ResourceChunk(ResourceType.WOOD, 84),
                        new ResourceChunk(ResourceType.GLASS, 84)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.STEEL, 92),
                        new ResourceChunk(ResourceType.CONCRETE, 92),
                        new ResourceChunk(ResourceType.BRICK, 92),
                        new ResourceChunk(ResourceType.WOOD, 92),
                        new ResourceChunk(ResourceType.GLASS, 92)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.STEEL, 100),
                        new ResourceChunk(ResourceType.CONCRETE, 100),
                        new ResourceChunk(ResourceType.BRICK, 100),
                        new ResourceChunk(ResourceType.WOOD, 100),
                        new ResourceChunk(ResourceType.GLASS, 100)
                )
        });
        setJobRewardMultiplier(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.STEEL, 2),
                        new ResourceChunk(ResourceType.CONCRETE, 2),
                        new ResourceChunk(ResourceType.BRICK, 2),
                        new ResourceChunk(ResourceType.WOOD, 2),
                        new ResourceChunk(ResourceType.GLASS, 2)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.STEEL, 4),
                        new ResourceChunk(ResourceType.CONCRETE, 4),
                        new ResourceChunk(ResourceType.BRICK, 4),
                        new ResourceChunk(ResourceType.WOOD, 4),
                        new ResourceChunk(ResourceType.GLASS, 4)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.STEEL, 6),
                        new ResourceChunk(ResourceType.CONCRETE, 6),
                        new ResourceChunk(ResourceType.BRICK, 6),
                        new ResourceChunk(ResourceType.WOOD, 6),
                        new ResourceChunk(ResourceType.GLASS, 6)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.STEEL, 8),
                        new ResourceChunk(ResourceType.CONCRETE, 8),
                        new ResourceChunk(ResourceType.BRICK, 8),
                        new ResourceChunk(ResourceType.WOOD, 8),
                        new ResourceChunk(ResourceType.GLASS, 8)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.STEEL, 10),
                        new ResourceChunk(ResourceType.CONCRETE, 10),
                        new ResourceChunk(ResourceType.BRICK, 10),
                        new ResourceChunk(ResourceType.WOOD, 10),
                        new ResourceChunk(ResourceType.GLASS, 10)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.STEEL, 14),
                        new ResourceChunk(ResourceType.CONCRETE, 14),
                        new ResourceChunk(ResourceType.BRICK, 14),
                        new ResourceChunk(ResourceType.WOOD, 14),
                        new ResourceChunk(ResourceType.GLASS, 14)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.STEEL, 18),
                        new ResourceChunk(ResourceType.CONCRETE, 18),
                        new ResourceChunk(ResourceType.BRICK, 18),
                        new ResourceChunk(ResourceType.WOOD, 18),
                        new ResourceChunk(ResourceType.GLASS, 18)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.STEEL, 22),
                        new ResourceChunk(ResourceType.CONCRETE, 22),
                        new ResourceChunk(ResourceType.BRICK, 22),
                        new ResourceChunk(ResourceType.WOOD, 22),
                        new ResourceChunk(ResourceType.GLASS, 22)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.STEEL, 26),
                        new ResourceChunk(ResourceType.CONCRETE, 26),
                        new ResourceChunk(ResourceType.BRICK, 26),
                        new ResourceChunk(ResourceType.WOOD, 26),
                        new ResourceChunk(ResourceType.GLASS, 26)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.STEEL, 30),
                        new ResourceChunk(ResourceType.CONCRETE, 30),
                        new ResourceChunk(ResourceType.BRICK, 30),
                        new ResourceChunk(ResourceType.WOOD, 30),
                        new ResourceChunk(ResourceType.GLASS, 30)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.STEEL, 36),
                        new ResourceChunk(ResourceType.CONCRETE, 36),
                        new ResourceChunk(ResourceType.BRICK, 36),
                        new ResourceChunk(ResourceType.WOOD, 36),
                        new ResourceChunk(ResourceType.GLASS, 36)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.STEEL, 42),
                        new ResourceChunk(ResourceType.CONCRETE, 42),
                        new ResourceChunk(ResourceType.BRICK, 42),
                        new ResourceChunk(ResourceType.WOOD, 42),
                        new ResourceChunk(ResourceType.GLASS, 42)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.STEEL, 48),
                        new ResourceChunk(ResourceType.CONCRETE, 48),
                        new ResourceChunk(ResourceType.BRICK, 48),
                        new ResourceChunk(ResourceType.WOOD, 48),
                        new ResourceChunk(ResourceType.GLASS, 48)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.STEEL, 54),
                        new ResourceChunk(ResourceType.CONCRETE, 54),
                        new ResourceChunk(ResourceType.BRICK, 54),
                        new ResourceChunk(ResourceType.WOOD, 54),
                        new ResourceChunk(ResourceType.GLASS, 54)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.STEEL, 60),
                        new ResourceChunk(ResourceType.CONCRETE, 60),
                        new ResourceChunk(ResourceType.BRICK, 60),
                        new ResourceChunk(ResourceType.WOOD, 60),
                        new ResourceChunk(ResourceType.GLASS, 60)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.STEEL, 68),
                        new ResourceChunk(ResourceType.CONCRETE, 68),
                        new ResourceChunk(ResourceType.BRICK, 68),
                        new ResourceChunk(ResourceType.WOOD, 68),
                        new ResourceChunk(ResourceType.GLASS, 68)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.STEEL, 76),
                        new ResourceChunk(ResourceType.CONCRETE, 76),
                        new ResourceChunk(ResourceType.BRICK, 76),
                        new ResourceChunk(ResourceType.WOOD, 76),
                        new ResourceChunk(ResourceType.GLASS, 76)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.STEEL, 84),
                        new ResourceChunk(ResourceType.CONCRETE, 84),
                        new ResourceChunk(ResourceType.BRICK, 84),
                        new ResourceChunk(ResourceType.WOOD, 84),
                        new ResourceChunk(ResourceType.GLASS, 84)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.STEEL, 92),
                        new ResourceChunk(ResourceType.CONCRETE, 92),
                        new ResourceChunk(ResourceType.BRICK, 92),
                        new ResourceChunk(ResourceType.WOOD, 92),
                        new ResourceChunk(ResourceType.GLASS, 92)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.STEEL, 100),
                        new ResourceChunk(ResourceType.CONCRETE, 100),
                        new ResourceChunk(ResourceType.BRICK, 100),
                        new ResourceChunk(ResourceType.WOOD, 100),
                        new ResourceChunk(ResourceType.GLASS, 100)
                )
        });
        setDemand(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.UPKEEP, 240),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 9),
                        new ResourceChunk(ResourceType.JOB, 180),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.UPKEEP, 480),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 18),
                        new ResourceChunk(ResourceType.JOB, 360),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.UPKEEP, 720),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 27),
                        new ResourceChunk(ResourceType.JOB, 540),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.UPKEEP, 960),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 36),
                        new ResourceChunk(ResourceType.JOB, 720),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.UPKEEP, 1200),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 45),
                        new ResourceChunk(ResourceType.JOB, 900),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.UPKEEP, 1680),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 63),
                        new ResourceChunk(ResourceType.JOB, 1260),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.UPKEEP, 2160),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 81),
                        new ResourceChunk(ResourceType.JOB, 1620),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.UPKEEP, 2640),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 99),
                        new ResourceChunk(ResourceType.JOB, 1980),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.UPKEEP, 3120),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 117),
                        new ResourceChunk(ResourceType.JOB, 2340),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.UPKEEP, 3600),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 135),
                        new ResourceChunk(ResourceType.JOB, 2700),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.UPKEEP, 4320),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 162),
                        new ResourceChunk(ResourceType.JOB, 3240),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.UPKEEP, 5040),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 189),
                        new ResourceChunk(ResourceType.JOB, 3780),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.UPKEEP, 5760),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 216),
                        new ResourceChunk(ResourceType.JOB, 4320),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.UPKEEP, 6480),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 243),
                        new ResourceChunk(ResourceType.JOB, 4860),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.UPKEEP, 7200),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 270),
                        new ResourceChunk(ResourceType.JOB, 5400),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.UPKEEP, 8160),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 306),
                        new ResourceChunk(ResourceType.JOB, 6120),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.UPKEEP, 9120),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 342),
                        new ResourceChunk(ResourceType.JOB, 6840),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.UPKEEP, 10080),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 378),
                        new ResourceChunk(ResourceType.JOB, 7560),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.UPKEEP, 11040),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 414),
                        new ResourceChunk(ResourceType.JOB, 8280),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.UPKEEP, 12000),
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
    }
}
