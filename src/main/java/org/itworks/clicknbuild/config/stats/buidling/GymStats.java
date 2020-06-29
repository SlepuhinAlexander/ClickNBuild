package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;
import org.itworks.clicknbuild.engine.model.ResType;

public final class GymStats extends BuildingStats {
    private static volatile GymStats inst;

    private GymStats() {
    }

    public static GymStats inst() {
        GymStats local = inst;
        if (local == null) {
            synchronized (GymStats.class) {
                local = inst;
                if (local == null) {
                    inst = local = new GymStats();
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
                        new ResourceChunk(ResType.CONSTRUCTION, 360),
                        new ResourceChunk(ResType.STEEL, 61),
                        new ResourceChunk(ResType.CONCRETE, 510),
                        new ResourceChunk(ResType.BRICK, 230),
                        new ResourceChunk(ResType.WOOD, 26),
                        new ResourceChunk(ResType.GLASS, 102),
                        new ResourceChunk(ResType.MONEY, 15300)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.CONSTRUCTION, 1080),
                        new ResourceChunk(ResType.STEEL, 186),
                        new ResourceChunk(ResType.CONCRETE, 1550),
                        new ResourceChunk(ResType.BRICK, 698),
                        new ResourceChunk(ResType.WOOD, 78),
                        new ResourceChunk(ResType.GLASS, 310),
                        new ResourceChunk(ResType.MONEY, 46500)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.CONSTRUCTION, 2160),
                        new ResourceChunk(ResType.STEEL, 377),
                        new ResourceChunk(ResType.CONCRETE, 3140),
                        new ResourceChunk(ResType.BRICK, 1413),
                        new ResourceChunk(ResType.WOOD, 157),
                        new ResourceChunk(ResType.GLASS, 628),
                        new ResourceChunk(ResType.MONEY, 94200)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.CONSTRUCTION, 3600),
                        new ResourceChunk(ResType.STEEL, 636),
                        new ResourceChunk(ResType.CONCRETE, 5300),
                        new ResourceChunk(ResType.BRICK, 2385),
                        new ResourceChunk(ResType.WOOD, 265),
                        new ResourceChunk(ResType.GLASS, 1060),
                        new ResourceChunk(ResType.MONEY, 159000)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.CONSTRUCTION, 5400),
                        new ResourceChunk(ResType.STEEL, 966),
                        new ResourceChunk(ResType.CONCRETE, 8050),
                        new ResourceChunk(ResType.BRICK, 3623),
                        new ResourceChunk(ResType.WOOD, 403),
                        new ResourceChunk(ResType.GLASS, 1610),
                        new ResourceChunk(ResType.MONEY, 241500)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.CONSTRUCTION, 7920),
                        new ResourceChunk(ResType.STEEL, 1445),
                        new ResourceChunk(ResType.CONCRETE, 12040),
                        new ResourceChunk(ResType.BRICK, 5418),
                        new ResourceChunk(ResType.WOOD, 602),
                        new ResourceChunk(ResType.GLASS, 2408),
                        new ResourceChunk(ResType.MONEY, 361200)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.CONSTRUCTION, 11160),
                        new ResourceChunk(ResType.STEEL, 2082),
                        new ResourceChunk(ResType.CONCRETE, 17350),
                        new ResourceChunk(ResType.BRICK, 7808),
                        new ResourceChunk(ResType.WOOD, 868),
                        new ResourceChunk(ResType.GLASS, 3470),
                        new ResourceChunk(ResType.MONEY, 520500)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.CONSTRUCTION, 15120),
                        new ResourceChunk(ResType.STEEL, 2887),
                        new ResourceChunk(ResType.CONCRETE, 24060),
                        new ResourceChunk(ResType.BRICK, 10827),
                        new ResourceChunk(ResType.WOOD, 1203),
                        new ResourceChunk(ResType.GLASS, 4812),
                        new ResourceChunk(ResType.MONEY, 721800)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.CONSTRUCTION, 19800),
                        new ResourceChunk(ResType.STEEL, 3870),
                        new ResourceChunk(ResType.CONCRETE, 32250),
                        new ResourceChunk(ResType.BRICK, 14513),
                        new ResourceChunk(ResType.WOOD, 1613),
                        new ResourceChunk(ResType.GLASS, 6450),
                        new ResourceChunk(ResType.MONEY, 967500)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.CONSTRUCTION, 25200),
                        new ResourceChunk(ResType.STEEL, 5040),
                        new ResourceChunk(ResType.CONCRETE, 42000),
                        new ResourceChunk(ResType.BRICK, 18900),
                        new ResourceChunk(ResType.WOOD, 2100),
                        new ResourceChunk(ResType.GLASS, 8400),
                        new ResourceChunk(ResType.MONEY, 1260000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.CONSTRUCTION, 31680),
                        new ResourceChunk(ResType.STEEL, 6509),
                        new ResourceChunk(ResType.CONCRETE, 54240),
                        new ResourceChunk(ResType.BRICK, 24408),
                        new ResourceChunk(ResType.WOOD, 2712),
                        new ResourceChunk(ResType.GLASS, 10848),
                        new ResourceChunk(ResType.MONEY, 1627200)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.CONSTRUCTION, 39240),
                        new ResourceChunk(ResType.STEEL, 8298),
                        new ResourceChunk(ResType.CONCRETE, 69150),
                        new ResourceChunk(ResType.BRICK, 31118),
                        new ResourceChunk(ResType.WOOD, 3458),
                        new ResourceChunk(ResType.GLASS, 13830),
                        new ResourceChunk(ResType.MONEY, 2074500)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.CONSTRUCTION, 47880),
                        new ResourceChunk(ResType.STEEL, 10429),
                        new ResourceChunk(ResType.CONCRETE, 86910),
                        new ResourceChunk(ResType.BRICK, 39110),
                        new ResourceChunk(ResType.WOOD, 4346),
                        new ResourceChunk(ResType.GLASS, 17382),
                        new ResourceChunk(ResType.MONEY, 2607300)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.CONSTRUCTION, 57600),
                        new ResourceChunk(ResType.STEEL, 12924),
                        new ResourceChunk(ResType.CONCRETE, 107700),
                        new ResourceChunk(ResType.BRICK, 48465),
                        new ResourceChunk(ResType.WOOD, 5385),
                        new ResourceChunk(ResType.GLASS, 21540),
                        new ResourceChunk(ResType.MONEY, 3231000)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.CONSTRUCTION, 68400),
                        new ResourceChunk(ResType.STEEL, 15804),
                        new ResourceChunk(ResType.CONCRETE, 131700),
                        new ResourceChunk(ResType.BRICK, 59265),
                        new ResourceChunk(ResType.WOOD, 6585),
                        new ResourceChunk(ResType.GLASS, 26340),
                        new ResourceChunk(ResType.MONEY, 3951000)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.CONSTRUCTION, 80640),
                        new ResourceChunk(ResType.STEEL, 19231),
                        new ResourceChunk(ResType.CONCRETE, 160260),
                        new ResourceChunk(ResType.BRICK, 72117),
                        new ResourceChunk(ResType.WOOD, 8013),
                        new ResourceChunk(ResType.GLASS, 32052),
                        new ResourceChunk(ResType.MONEY, 4807800)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.CONSTRUCTION, 94320),
                        new ResourceChunk(ResType.STEEL, 23244),
                        new ResourceChunk(ResType.CONCRETE, 193700),
                        new ResourceChunk(ResType.BRICK, 87165),
                        new ResourceChunk(ResType.WOOD, 9685),
                        new ResourceChunk(ResType.GLASS, 38740),
                        new ResourceChunk(ResType.MONEY, 5811000)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.CONSTRUCTION, 109440),
                        new ResourceChunk(ResType.STEEL, 27881),
                        new ResourceChunk(ResType.CONCRETE, 232340),
                        new ResourceChunk(ResType.BRICK, 104553),
                        new ResourceChunk(ResType.WOOD, 11617),
                        new ResourceChunk(ResType.GLASS, 46468),
                        new ResourceChunk(ResType.MONEY, 6970200)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.CONSTRUCTION, 126000),
                        new ResourceChunk(ResType.STEEL, 33180),
                        new ResourceChunk(ResType.CONCRETE, 276500),
                        new ResourceChunk(ResType.BRICK, 124425),
                        new ResourceChunk(ResType.WOOD, 13825),
                        new ResourceChunk(ResType.GLASS, 55300),
                        new ResourceChunk(ResType.MONEY, 8295000)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.CONSTRUCTION, 144000),
                        new ResourceChunk(ResType.STEEL, 39180),
                        new ResourceChunk(ResType.CONCRETE, 326500),
                        new ResourceChunk(ResType.BRICK, 146925),
                        new ResourceChunk(ResType.WOOD, 16325),
                        new ResourceChunk(ResType.GLASS, 65300),
                        new ResourceChunk(ResType.MONEY, 9795000)
                )
        });
        setJobPrice(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.ACTION, 24)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.ACTION, 28)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.ACTION, 32)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.ACTION, 36)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.ACTION, 40)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.ACTION, 44)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.ACTION, 48)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.ACTION, 52)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.ACTION, 56)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.ACTION, 60)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.ACTION, 64)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.ACTION, 68)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.ACTION, 72)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.ACTION, 76)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.ACTION, 80)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.ACTION, 84)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.ACTION, 88)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.ACTION, 92)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.ACTION, 96)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.ACTION, 100)
                )
        });
        setJobReward(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.ENERGY, 26)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.ENERGY, 32)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.ENERGY, 38)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.ENERGY, 44)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.ENERGY, 50)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.ENERGY, 58)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.ENERGY, 66)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.ENERGY, 74)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.ENERGY, 82)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.ENERGY, 90)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.ENERGY, 100)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.ENERGY, 110)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.ENERGY, 120)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.ENERGY, 130)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.ENERGY, 140)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.ENERGY, 152)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.ENERGY, 164)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.ENERGY, 176)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.ENERGY, 188)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.ENERGY, 200)
                )
        });
        setDemand(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 4),
                        new ResourceChunk(ResType.JOB, 80),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 8),
                        new ResourceChunk(ResType.JOB, 160),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 12),
                        new ResourceChunk(ResType.JOB, 240),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 16),
                        new ResourceChunk(ResType.JOB, 320),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 20),
                        new ResourceChunk(ResType.JOB, 400),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 28),
                        new ResourceChunk(ResType.JOB, 560),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 36),
                        new ResourceChunk(ResType.JOB, 720),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 44),
                        new ResourceChunk(ResType.JOB, 880),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 52),
                        new ResourceChunk(ResType.JOB, 1040),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 60),
                        new ResourceChunk(ResType.JOB, 1200),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 72),
                        new ResourceChunk(ResType.JOB, 1440),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 84),
                        new ResourceChunk(ResType.JOB, 1680),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 96),
                        new ResourceChunk(ResType.JOB, 1920),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 108),
                        new ResourceChunk(ResType.JOB, 2160),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 120),
                        new ResourceChunk(ResType.JOB, 2400),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 136),
                        new ResourceChunk(ResType.JOB, 2720),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 152),
                        new ResourceChunk(ResType.JOB, 3040),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 168),
                        new ResourceChunk(ResType.JOB, 3360),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 184),
                        new ResourceChunk(ResType.JOB, 3600),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 200),
                        new ResourceChunk(ResType.JOB, 4000),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                )
        });
        setHold(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.POWER, 4),
                        new ResourceChunk(ResType.WORKER, 80)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.POWER, 8),
                        new ResourceChunk(ResType.WORKER, 160)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.POWER, 12),
                        new ResourceChunk(ResType.WORKER, 240)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.POWER, 16),
                        new ResourceChunk(ResType.WORKER, 320)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.POWER, 20),
                        new ResourceChunk(ResType.WORKER, 400)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.POWER, 28),
                        new ResourceChunk(ResType.WORKER, 560)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.POWER, 36),
                        new ResourceChunk(ResType.WORKER, 720)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.POWER, 44),
                        new ResourceChunk(ResType.WORKER, 880)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.POWER, 52),
                        new ResourceChunk(ResType.WORKER, 1040)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.POWER, 60),
                        new ResourceChunk(ResType.WORKER, 1200)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.POWER, 72),
                        new ResourceChunk(ResType.WORKER, 1440)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.POWER, 84),
                        new ResourceChunk(ResType.WORKER, 1680)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.POWER, 96),
                        new ResourceChunk(ResType.WORKER, 1920)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.POWER, 108),
                        new ResourceChunk(ResType.WORKER, 2160)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.POWER, 120),
                        new ResourceChunk(ResType.WORKER, 2400)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.POWER, 136),
                        new ResourceChunk(ResType.WORKER, 2720)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.POWER, 152),
                        new ResourceChunk(ResType.WORKER, 3040)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.POWER, 168),
                        new ResourceChunk(ResType.WORKER, 3360)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.POWER, 184),
                        new ResourceChunk(ResType.WORKER, 3600)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.POWER, 200),
                        new ResourceChunk(ResType.WORKER, 4000)
                )
        });
        setStore(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.ENERGY, 40)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.ENERGY, 80)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.ENERGY, 120)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.ENERGY, 160)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.ENERGY, 200)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.ENERGY, 280)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.ENERGY, 360)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.ENERGY, 440)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.ENERGY, 520)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.ENERGY, 600)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.ENERGY, 720)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.ENERGY, 840)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.ENERGY, 960)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.ENERGY, 1080)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.ENERGY, 1200)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.ENERGY, 1360)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.ENERGY, 1520)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.ENERGY, 1680)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.ENERGY, 1840)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.ENERGY, 2000)
                )
        });
    }
}
