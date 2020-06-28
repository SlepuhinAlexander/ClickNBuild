package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;
import org.itworks.clicknbuild.engine.model.ResourceType;

public final class GymStats extends BuildingStats {
    private static final GymStats INST = new GymStats();

    private GymStats() {
    }

    public static GymStats inst() {
        return INST;
    }

    @Override
    protected void initValues() {
        setRequiredPlayerLevel(1);
        setMaxLevel(20);
        setBuildLimit(1);
        setPriceMultiplier(100);
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
        setBuildCost(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.CONSTRUCTION, 360),
                        new ResourceChunk(ResourceType.STEEL, 61),
                        new ResourceChunk(ResourceType.CONCRETE, 510),
                        new ResourceChunk(ResourceType.BRICK, 230),
                        new ResourceChunk(ResourceType.WOOD, 26),
                        new ResourceChunk(ResourceType.GLASS, 102),
                        new ResourceChunk(ResourceType.MONEY, 15300)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.CONSTRUCTION, 1080),
                        new ResourceChunk(ResourceType.STEEL, 186),
                        new ResourceChunk(ResourceType.CONCRETE, 1550),
                        new ResourceChunk(ResourceType.BRICK, 698),
                        new ResourceChunk(ResourceType.WOOD, 78),
                        new ResourceChunk(ResourceType.GLASS, 310),
                        new ResourceChunk(ResourceType.MONEY, 46500)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.CONSTRUCTION, 2160),
                        new ResourceChunk(ResourceType.STEEL, 377),
                        new ResourceChunk(ResourceType.CONCRETE, 3140),
                        new ResourceChunk(ResourceType.BRICK, 1413),
                        new ResourceChunk(ResourceType.WOOD, 157),
                        new ResourceChunk(ResourceType.GLASS, 628),
                        new ResourceChunk(ResourceType.MONEY, 94200)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.CONSTRUCTION, 3600),
                        new ResourceChunk(ResourceType.STEEL, 636),
                        new ResourceChunk(ResourceType.CONCRETE, 5300),
                        new ResourceChunk(ResourceType.BRICK, 2385),
                        new ResourceChunk(ResourceType.WOOD, 265),
                        new ResourceChunk(ResourceType.GLASS, 1060),
                        new ResourceChunk(ResourceType.MONEY, 159000)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.CONSTRUCTION, 5400),
                        new ResourceChunk(ResourceType.STEEL, 966),
                        new ResourceChunk(ResourceType.CONCRETE, 8050),
                        new ResourceChunk(ResourceType.BRICK, 3623),
                        new ResourceChunk(ResourceType.WOOD, 403),
                        new ResourceChunk(ResourceType.GLASS, 1610),
                        new ResourceChunk(ResourceType.MONEY, 241500)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.CONSTRUCTION, 7920),
                        new ResourceChunk(ResourceType.STEEL, 1445),
                        new ResourceChunk(ResourceType.CONCRETE, 12040),
                        new ResourceChunk(ResourceType.BRICK, 5418),
                        new ResourceChunk(ResourceType.WOOD, 602),
                        new ResourceChunk(ResourceType.GLASS, 2408),
                        new ResourceChunk(ResourceType.MONEY, 361200)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.CONSTRUCTION, 11160),
                        new ResourceChunk(ResourceType.STEEL, 2082),
                        new ResourceChunk(ResourceType.CONCRETE, 17350),
                        new ResourceChunk(ResourceType.BRICK, 7808),
                        new ResourceChunk(ResourceType.WOOD, 868),
                        new ResourceChunk(ResourceType.GLASS, 3470),
                        new ResourceChunk(ResourceType.MONEY, 520500)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.CONSTRUCTION, 15120),
                        new ResourceChunk(ResourceType.STEEL, 2887),
                        new ResourceChunk(ResourceType.CONCRETE, 24060),
                        new ResourceChunk(ResourceType.BRICK, 10827),
                        new ResourceChunk(ResourceType.WOOD, 1203),
                        new ResourceChunk(ResourceType.GLASS, 4812),
                        new ResourceChunk(ResourceType.MONEY, 721800)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.CONSTRUCTION, 19800),
                        new ResourceChunk(ResourceType.STEEL, 3870),
                        new ResourceChunk(ResourceType.CONCRETE, 32250),
                        new ResourceChunk(ResourceType.BRICK, 14513),
                        new ResourceChunk(ResourceType.WOOD, 1613),
                        new ResourceChunk(ResourceType.GLASS, 6450),
                        new ResourceChunk(ResourceType.MONEY, 967500)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.CONSTRUCTION, 25200),
                        new ResourceChunk(ResourceType.STEEL, 5040),
                        new ResourceChunk(ResourceType.CONCRETE, 42000),
                        new ResourceChunk(ResourceType.BRICK, 18900),
                        new ResourceChunk(ResourceType.WOOD, 2100),
                        new ResourceChunk(ResourceType.GLASS, 8400),
                        new ResourceChunk(ResourceType.MONEY, 1260000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.CONSTRUCTION, 31680),
                        new ResourceChunk(ResourceType.STEEL, 6509),
                        new ResourceChunk(ResourceType.CONCRETE, 54240),
                        new ResourceChunk(ResourceType.BRICK, 24408),
                        new ResourceChunk(ResourceType.WOOD, 2712),
                        new ResourceChunk(ResourceType.GLASS, 10848),
                        new ResourceChunk(ResourceType.MONEY, 1627200)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.CONSTRUCTION, 39240),
                        new ResourceChunk(ResourceType.STEEL, 8298),
                        new ResourceChunk(ResourceType.CONCRETE, 69150),
                        new ResourceChunk(ResourceType.BRICK, 31118),
                        new ResourceChunk(ResourceType.WOOD, 3458),
                        new ResourceChunk(ResourceType.GLASS, 13830),
                        new ResourceChunk(ResourceType.MONEY, 2074500)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.CONSTRUCTION, 47880),
                        new ResourceChunk(ResourceType.STEEL, 10429),
                        new ResourceChunk(ResourceType.CONCRETE, 86910),
                        new ResourceChunk(ResourceType.BRICK, 39110),
                        new ResourceChunk(ResourceType.WOOD, 4346),
                        new ResourceChunk(ResourceType.GLASS, 17382),
                        new ResourceChunk(ResourceType.MONEY, 2607300)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.CONSTRUCTION, 57600),
                        new ResourceChunk(ResourceType.STEEL, 12924),
                        new ResourceChunk(ResourceType.CONCRETE, 107700),
                        new ResourceChunk(ResourceType.BRICK, 48465),
                        new ResourceChunk(ResourceType.WOOD, 5385),
                        new ResourceChunk(ResourceType.GLASS, 21540),
                        new ResourceChunk(ResourceType.MONEY, 3231000)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.CONSTRUCTION, 68400),
                        new ResourceChunk(ResourceType.STEEL, 15804),
                        new ResourceChunk(ResourceType.CONCRETE, 131700),
                        new ResourceChunk(ResourceType.BRICK, 59265),
                        new ResourceChunk(ResourceType.WOOD, 6585),
                        new ResourceChunk(ResourceType.GLASS, 26340),
                        new ResourceChunk(ResourceType.MONEY, 3951000)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.CONSTRUCTION, 80640),
                        new ResourceChunk(ResourceType.STEEL, 19231),
                        new ResourceChunk(ResourceType.CONCRETE, 160260),
                        new ResourceChunk(ResourceType.BRICK, 72117),
                        new ResourceChunk(ResourceType.WOOD, 8013),
                        new ResourceChunk(ResourceType.GLASS, 32052),
                        new ResourceChunk(ResourceType.MONEY, 4807800)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.CONSTRUCTION, 94320),
                        new ResourceChunk(ResourceType.STEEL, 23244),
                        new ResourceChunk(ResourceType.CONCRETE, 193700),
                        new ResourceChunk(ResourceType.BRICK, 87165),
                        new ResourceChunk(ResourceType.WOOD, 9685),
                        new ResourceChunk(ResourceType.GLASS, 38740),
                        new ResourceChunk(ResourceType.MONEY, 5811000)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.CONSTRUCTION, 109440),
                        new ResourceChunk(ResourceType.STEEL, 27881),
                        new ResourceChunk(ResourceType.CONCRETE, 232340),
                        new ResourceChunk(ResourceType.BRICK, 104553),
                        new ResourceChunk(ResourceType.WOOD, 11617),
                        new ResourceChunk(ResourceType.GLASS, 46468),
                        new ResourceChunk(ResourceType.MONEY, 6970200)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.CONSTRUCTION, 126000),
                        new ResourceChunk(ResourceType.STEEL, 33180),
                        new ResourceChunk(ResourceType.CONCRETE, 276500),
                        new ResourceChunk(ResourceType.BRICK, 124425),
                        new ResourceChunk(ResourceType.WOOD, 13825),
                        new ResourceChunk(ResourceType.GLASS, 55300),
                        new ResourceChunk(ResourceType.MONEY, 8295000)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.CONSTRUCTION, 144000),
                        new ResourceChunk(ResourceType.STEEL, 39180),
                        new ResourceChunk(ResourceType.CONCRETE, 326500),
                        new ResourceChunk(ResourceType.BRICK, 146925),
                        new ResourceChunk(ResourceType.WOOD, 16325),
                        new ResourceChunk(ResourceType.GLASS, 65300),
                        new ResourceChunk(ResourceType.MONEY, 9795000)
                )
        });
        setJobPrice(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.ACTION, 24)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.ACTION, 28)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.ACTION, 32)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.ACTION, 36)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.ACTION, 40)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.ACTION, 44)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.ACTION, 48)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.ACTION, 52)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.ACTION, 56)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.ACTION, 60)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.ACTION, 64)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.ACTION, 68)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.ACTION, 72)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.ACTION, 76)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.ACTION, 80)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.ACTION, 84)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.ACTION, 88)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.ACTION, 92)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.ACTION, 96)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.ACTION, 100)
                )
        });
        setJobReward(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.ENERGY, 26)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.ENERGY, 32)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.ENERGY, 38)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.ENERGY, 44)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.ENERGY, 50)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.ENERGY, 58)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.ENERGY, 66)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.ENERGY, 74)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.ENERGY, 82)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.ENERGY, 90)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.ENERGY, 100)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.ENERGY, 110)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.ENERGY, 120)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.ENERGY, 130)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.ENERGY, 140)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.ENERGY, 152)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.ENERGY, 164)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.ENERGY, 176)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.ENERGY, 188)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.ENERGY, 200)
                )
        });
        setDemand(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 4),
                        new ResourceChunk(ResourceType.JOB, 80),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 8),
                        new ResourceChunk(ResourceType.JOB, 160),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 12),
                        new ResourceChunk(ResourceType.JOB, 240),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 16),
                        new ResourceChunk(ResourceType.JOB, 320),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 20),
                        new ResourceChunk(ResourceType.JOB, 400),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 28),
                        new ResourceChunk(ResourceType.JOB, 560),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 36),
                        new ResourceChunk(ResourceType.JOB, 720),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 44),
                        new ResourceChunk(ResourceType.JOB, 880),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 52),
                        new ResourceChunk(ResourceType.JOB, 1040),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 60),
                        new ResourceChunk(ResourceType.JOB, 1200),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 72),
                        new ResourceChunk(ResourceType.JOB, 1440),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 84),
                        new ResourceChunk(ResourceType.JOB, 1680),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 96),
                        new ResourceChunk(ResourceType.JOB, 1920),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 108),
                        new ResourceChunk(ResourceType.JOB, 2160),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 120),
                        new ResourceChunk(ResourceType.JOB, 2400),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 136),
                        new ResourceChunk(ResourceType.JOB, 2720),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 152),
                        new ResourceChunk(ResourceType.JOB, 3040),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 168),
                        new ResourceChunk(ResourceType.JOB, 3360),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 184),
                        new ResourceChunk(ResourceType.JOB, 3600),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 200),
                        new ResourceChunk(ResourceType.JOB, 4000),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                )
        });
        setHold(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.POWER, 4),
                        new ResourceChunk(ResourceType.WORKER, 80)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.POWER, 8),
                        new ResourceChunk(ResourceType.WORKER, 160)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.POWER, 12),
                        new ResourceChunk(ResourceType.WORKER, 240)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.POWER, 16),
                        new ResourceChunk(ResourceType.WORKER, 320)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.POWER, 20),
                        new ResourceChunk(ResourceType.WORKER, 400)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.POWER, 28),
                        new ResourceChunk(ResourceType.WORKER, 560)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.POWER, 36),
                        new ResourceChunk(ResourceType.WORKER, 720)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.POWER, 44),
                        new ResourceChunk(ResourceType.WORKER, 880)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.POWER, 52),
                        new ResourceChunk(ResourceType.WORKER, 1040)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.POWER, 60),
                        new ResourceChunk(ResourceType.WORKER, 1200)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.POWER, 72),
                        new ResourceChunk(ResourceType.WORKER, 1440)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.POWER, 84),
                        new ResourceChunk(ResourceType.WORKER, 1680)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.POWER, 96),
                        new ResourceChunk(ResourceType.WORKER, 1920)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.POWER, 108),
                        new ResourceChunk(ResourceType.WORKER, 2160)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.POWER, 120),
                        new ResourceChunk(ResourceType.WORKER, 2400)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.POWER, 136),
                        new ResourceChunk(ResourceType.WORKER, 2720)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.POWER, 152),
                        new ResourceChunk(ResourceType.WORKER, 3040)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.POWER, 168),
                        new ResourceChunk(ResourceType.WORKER, 3360)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.POWER, 184),
                        new ResourceChunk(ResourceType.WORKER, 3600)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.POWER, 200),
                        new ResourceChunk(ResourceType.WORKER, 4000)
                )
        });
        setStore(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.ENERGY, 40)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.ENERGY, 80)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.ENERGY, 120)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.ENERGY, 160)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.ENERGY, 200)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.ENERGY, 280)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.ENERGY, 360)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.ENERGY, 440)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.ENERGY, 520)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.ENERGY, 600)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.ENERGY, 720)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.ENERGY, 840)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.ENERGY, 960)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.ENERGY, 1080)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.ENERGY, 1200)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.ENERGY, 1360)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.ENERGY, 1520)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.ENERGY, 1680)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.ENERGY, 1840)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.ENERGY, 2000)
                )
        });
    }
}
