package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResChunk;
import org.itworks.clicknbuild.engine.model.ResPack;
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
        setBuildCost(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.CONSTRUCTION, 360),
                        new ResChunk(ResType.STEEL, 61),
                        new ResChunk(ResType.CONCRETE, 510),
                        new ResChunk(ResType.BRICK, 230),
                        new ResChunk(ResType.WOOD, 26),
                        new ResChunk(ResType.GLASS, 102),
                        new ResChunk(ResType.MONEY, 15300)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.CONSTRUCTION, 1080),
                        new ResChunk(ResType.STEEL, 186),
                        new ResChunk(ResType.CONCRETE, 1550),
                        new ResChunk(ResType.BRICK, 698),
                        new ResChunk(ResType.WOOD, 78),
                        new ResChunk(ResType.GLASS, 310),
                        new ResChunk(ResType.MONEY, 46500)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.CONSTRUCTION, 2160),
                        new ResChunk(ResType.STEEL, 377),
                        new ResChunk(ResType.CONCRETE, 3140),
                        new ResChunk(ResType.BRICK, 1413),
                        new ResChunk(ResType.WOOD, 157),
                        new ResChunk(ResType.GLASS, 628),
                        new ResChunk(ResType.MONEY, 94200)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.CONSTRUCTION, 3600),
                        new ResChunk(ResType.STEEL, 636),
                        new ResChunk(ResType.CONCRETE, 5300),
                        new ResChunk(ResType.BRICK, 2385),
                        new ResChunk(ResType.WOOD, 265),
                        new ResChunk(ResType.GLASS, 1060),
                        new ResChunk(ResType.MONEY, 159000)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.CONSTRUCTION, 5400),
                        new ResChunk(ResType.STEEL, 966),
                        new ResChunk(ResType.CONCRETE, 8050),
                        new ResChunk(ResType.BRICK, 3623),
                        new ResChunk(ResType.WOOD, 403),
                        new ResChunk(ResType.GLASS, 1610),
                        new ResChunk(ResType.MONEY, 241500)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.CONSTRUCTION, 7920),
                        new ResChunk(ResType.STEEL, 1445),
                        new ResChunk(ResType.CONCRETE, 12040),
                        new ResChunk(ResType.BRICK, 5418),
                        new ResChunk(ResType.WOOD, 602),
                        new ResChunk(ResType.GLASS, 2408),
                        new ResChunk(ResType.MONEY, 361200)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.CONSTRUCTION, 11160),
                        new ResChunk(ResType.STEEL, 2082),
                        new ResChunk(ResType.CONCRETE, 17350),
                        new ResChunk(ResType.BRICK, 7808),
                        new ResChunk(ResType.WOOD, 868),
                        new ResChunk(ResType.GLASS, 3470),
                        new ResChunk(ResType.MONEY, 520500)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.CONSTRUCTION, 15120),
                        new ResChunk(ResType.STEEL, 2887),
                        new ResChunk(ResType.CONCRETE, 24060),
                        new ResChunk(ResType.BRICK, 10827),
                        new ResChunk(ResType.WOOD, 1203),
                        new ResChunk(ResType.GLASS, 4812),
                        new ResChunk(ResType.MONEY, 721800)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.CONSTRUCTION, 19800),
                        new ResChunk(ResType.STEEL, 3870),
                        new ResChunk(ResType.CONCRETE, 32250),
                        new ResChunk(ResType.BRICK, 14513),
                        new ResChunk(ResType.WOOD, 1613),
                        new ResChunk(ResType.GLASS, 6450),
                        new ResChunk(ResType.MONEY, 967500)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.CONSTRUCTION, 25200),
                        new ResChunk(ResType.STEEL, 5040),
                        new ResChunk(ResType.CONCRETE, 42000),
                        new ResChunk(ResType.BRICK, 18900),
                        new ResChunk(ResType.WOOD, 2100),
                        new ResChunk(ResType.GLASS, 8400),
                        new ResChunk(ResType.MONEY, 1260000)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.CONSTRUCTION, 31680),
                        new ResChunk(ResType.STEEL, 6509),
                        new ResChunk(ResType.CONCRETE, 54240),
                        new ResChunk(ResType.BRICK, 24408),
                        new ResChunk(ResType.WOOD, 2712),
                        new ResChunk(ResType.GLASS, 10848),
                        new ResChunk(ResType.MONEY, 1627200)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.CONSTRUCTION, 39240),
                        new ResChunk(ResType.STEEL, 8298),
                        new ResChunk(ResType.CONCRETE, 69150),
                        new ResChunk(ResType.BRICK, 31118),
                        new ResChunk(ResType.WOOD, 3458),
                        new ResChunk(ResType.GLASS, 13830),
                        new ResChunk(ResType.MONEY, 2074500)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.CONSTRUCTION, 47880),
                        new ResChunk(ResType.STEEL, 10429),
                        new ResChunk(ResType.CONCRETE, 86910),
                        new ResChunk(ResType.BRICK, 39110),
                        new ResChunk(ResType.WOOD, 4346),
                        new ResChunk(ResType.GLASS, 17382),
                        new ResChunk(ResType.MONEY, 2607300)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.CONSTRUCTION, 57600),
                        new ResChunk(ResType.STEEL, 12924),
                        new ResChunk(ResType.CONCRETE, 107700),
                        new ResChunk(ResType.BRICK, 48465),
                        new ResChunk(ResType.WOOD, 5385),
                        new ResChunk(ResType.GLASS, 21540),
                        new ResChunk(ResType.MONEY, 3231000)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.CONSTRUCTION, 68400),
                        new ResChunk(ResType.STEEL, 15804),
                        new ResChunk(ResType.CONCRETE, 131700),
                        new ResChunk(ResType.BRICK, 59265),
                        new ResChunk(ResType.WOOD, 6585),
                        new ResChunk(ResType.GLASS, 26340),
                        new ResChunk(ResType.MONEY, 3951000)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.CONSTRUCTION, 80640),
                        new ResChunk(ResType.STEEL, 19231),
                        new ResChunk(ResType.CONCRETE, 160260),
                        new ResChunk(ResType.BRICK, 72117),
                        new ResChunk(ResType.WOOD, 8013),
                        new ResChunk(ResType.GLASS, 32052),
                        new ResChunk(ResType.MONEY, 4807800)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.CONSTRUCTION, 94320),
                        new ResChunk(ResType.STEEL, 23244),
                        new ResChunk(ResType.CONCRETE, 193700),
                        new ResChunk(ResType.BRICK, 87165),
                        new ResChunk(ResType.WOOD, 9685),
                        new ResChunk(ResType.GLASS, 38740),
                        new ResChunk(ResType.MONEY, 5811000)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.CONSTRUCTION, 109440),
                        new ResChunk(ResType.STEEL, 27881),
                        new ResChunk(ResType.CONCRETE, 232340),
                        new ResChunk(ResType.BRICK, 104553),
                        new ResChunk(ResType.WOOD, 11617),
                        new ResChunk(ResType.GLASS, 46468),
                        new ResChunk(ResType.MONEY, 6970200)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.CONSTRUCTION, 126000),
                        new ResChunk(ResType.STEEL, 33180),
                        new ResChunk(ResType.CONCRETE, 276500),
                        new ResChunk(ResType.BRICK, 124425),
                        new ResChunk(ResType.WOOD, 13825),
                        new ResChunk(ResType.GLASS, 55300),
                        new ResChunk(ResType.MONEY, 8295000)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.CONSTRUCTION, 144000),
                        new ResChunk(ResType.STEEL, 39180),
                        new ResChunk(ResType.CONCRETE, 326500),
                        new ResChunk(ResType.BRICK, 146925),
                        new ResChunk(ResType.WOOD, 16325),
                        new ResChunk(ResType.GLASS, 65300),
                        new ResChunk(ResType.MONEY, 9795000)
                )
        });
        setJobPrice(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.ACTION, 24)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.ACTION, 28)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.ACTION, 32)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.ACTION, 36)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.ACTION, 40)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.ACTION, 44)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.ACTION, 48)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.ACTION, 52)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.ACTION, 56)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.ACTION, 60)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.ACTION, 64)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.ACTION, 68)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.ACTION, 72)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.ACTION, 76)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.ACTION, 80)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.ACTION, 84)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.ACTION, 88)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.ACTION, 92)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.ACTION, 96)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.ACTION, 100)
                )
        });
        setJobReward(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.ENERGY, 26)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.ENERGY, 32)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.ENERGY, 38)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.ENERGY, 44)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.ENERGY, 50)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.ENERGY, 58)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.ENERGY, 66)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.ENERGY, 74)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.ENERGY, 82)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.ENERGY, 90)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.ENERGY, 100)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.ENERGY, 110)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.ENERGY, 120)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.ENERGY, 130)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.ENERGY, 140)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.ENERGY, 152)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.ENERGY, 164)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.ENERGY, 176)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.ENERGY, 188)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.ENERGY, 200)
                )
        });
        setDemand(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.POWER_CONSUMPTION, 4),
                        new ResChunk(ResType.JOB, 80),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.POWER_CONSUMPTION, 8),
                        new ResChunk(ResType.JOB, 160),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.POWER_CONSUMPTION, 12),
                        new ResChunk(ResType.JOB, 240),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.POWER_CONSUMPTION, 16),
                        new ResChunk(ResType.JOB, 320),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.POWER_CONSUMPTION, 20),
                        new ResChunk(ResType.JOB, 400),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.POWER_CONSUMPTION, 28),
                        new ResChunk(ResType.JOB, 560),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.POWER_CONSUMPTION, 36),
                        new ResChunk(ResType.JOB, 720),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.POWER_CONSUMPTION, 44),
                        new ResChunk(ResType.JOB, 880),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.POWER_CONSUMPTION, 52),
                        new ResChunk(ResType.JOB, 1040),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.POWER_CONSUMPTION, 60),
                        new ResChunk(ResType.JOB, 1200),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.POWER_CONSUMPTION, 72),
                        new ResChunk(ResType.JOB, 1440),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.POWER_CONSUMPTION, 84),
                        new ResChunk(ResType.JOB, 1680),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.POWER_CONSUMPTION, 96),
                        new ResChunk(ResType.JOB, 1920),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.POWER_CONSUMPTION, 108),
                        new ResChunk(ResType.JOB, 2160),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.POWER_CONSUMPTION, 120),
                        new ResChunk(ResType.JOB, 2400),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.POWER_CONSUMPTION, 136),
                        new ResChunk(ResType.JOB, 2720),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.POWER_CONSUMPTION, 152),
                        new ResChunk(ResType.JOB, 3040),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.POWER_CONSUMPTION, 168),
                        new ResChunk(ResType.JOB, 3360),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.POWER_CONSUMPTION, 184),
                        new ResChunk(ResType.JOB, 3600),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.POWER_CONSUMPTION, 200),
                        new ResChunk(ResType.JOB, 4000),
                        new ResChunk(ResType.IGNITABILITY, 1)
                )
        });
        setHold(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.POWER, 4),
                        new ResChunk(ResType.WORKER, 80)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.POWER, 8),
                        new ResChunk(ResType.WORKER, 160)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.POWER, 12),
                        new ResChunk(ResType.WORKER, 240)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.POWER, 16),
                        new ResChunk(ResType.WORKER, 320)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.POWER, 20),
                        new ResChunk(ResType.WORKER, 400)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.POWER, 28),
                        new ResChunk(ResType.WORKER, 560)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.POWER, 36),
                        new ResChunk(ResType.WORKER, 720)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.POWER, 44),
                        new ResChunk(ResType.WORKER, 880)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.POWER, 52),
                        new ResChunk(ResType.WORKER, 1040)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.POWER, 60),
                        new ResChunk(ResType.WORKER, 1200)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.POWER, 72),
                        new ResChunk(ResType.WORKER, 1440)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.POWER, 84),
                        new ResChunk(ResType.WORKER, 1680)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.POWER, 96),
                        new ResChunk(ResType.WORKER, 1920)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.POWER, 108),
                        new ResChunk(ResType.WORKER, 2160)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.POWER, 120),
                        new ResChunk(ResType.WORKER, 2400)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.POWER, 136),
                        new ResChunk(ResType.WORKER, 2720)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.POWER, 152),
                        new ResChunk(ResType.WORKER, 3040)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.POWER, 168),
                        new ResChunk(ResType.WORKER, 3360)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.POWER, 184),
                        new ResChunk(ResType.WORKER, 3600)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.POWER, 200),
                        new ResChunk(ResType.WORKER, 4000)
                )
        });
        setStore(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.ENERGY, 40)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.ENERGY, 80)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.ENERGY, 120)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.ENERGY, 160)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.ENERGY, 200)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.ENERGY, 280)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.ENERGY, 360)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.ENERGY, 440)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.ENERGY, 520)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.ENERGY, 600)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.ENERGY, 720)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.ENERGY, 840)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.ENERGY, 960)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.ENERGY, 1080)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.ENERGY, 1200)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.ENERGY, 1360)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.ENERGY, 1520)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.ENERGY, 1680)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.ENERGY, 1840)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.ENERGY, 2000)
                )
        });
    }
}
