package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResStat;
import org.itworks.clicknbuild.engine.model.ResStatPack;
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
        setBuildCost(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.CONSTRUCTION, 360),
                        new ResStat(ResType.STEEL, 61),
                        new ResStat(ResType.CONCRETE, 510),
                        new ResStat(ResType.BRICK, 230),
                        new ResStat(ResType.WOOD, 26),
                        new ResStat(ResType.GLASS, 102),
                        new ResStat(ResType.MONEY, 15300)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.CONSTRUCTION, 1080),
                        new ResStat(ResType.STEEL, 186),
                        new ResStat(ResType.CONCRETE, 1550),
                        new ResStat(ResType.BRICK, 698),
                        new ResStat(ResType.WOOD, 78),
                        new ResStat(ResType.GLASS, 310),
                        new ResStat(ResType.MONEY, 46500)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.CONSTRUCTION, 2160),
                        new ResStat(ResType.STEEL, 377),
                        new ResStat(ResType.CONCRETE, 3140),
                        new ResStat(ResType.BRICK, 1413),
                        new ResStat(ResType.WOOD, 157),
                        new ResStat(ResType.GLASS, 628),
                        new ResStat(ResType.MONEY, 94200)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.CONSTRUCTION, 3600),
                        new ResStat(ResType.STEEL, 636),
                        new ResStat(ResType.CONCRETE, 5300),
                        new ResStat(ResType.BRICK, 2385),
                        new ResStat(ResType.WOOD, 265),
                        new ResStat(ResType.GLASS, 1060),
                        new ResStat(ResType.MONEY, 159000)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.CONSTRUCTION, 5400),
                        new ResStat(ResType.STEEL, 966),
                        new ResStat(ResType.CONCRETE, 8050),
                        new ResStat(ResType.BRICK, 3623),
                        new ResStat(ResType.WOOD, 403),
                        new ResStat(ResType.GLASS, 1610),
                        new ResStat(ResType.MONEY, 241500)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.CONSTRUCTION, 7920),
                        new ResStat(ResType.STEEL, 1445),
                        new ResStat(ResType.CONCRETE, 12040),
                        new ResStat(ResType.BRICK, 5418),
                        new ResStat(ResType.WOOD, 602),
                        new ResStat(ResType.GLASS, 2408),
                        new ResStat(ResType.MONEY, 361200)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.CONSTRUCTION, 11160),
                        new ResStat(ResType.STEEL, 2082),
                        new ResStat(ResType.CONCRETE, 17350),
                        new ResStat(ResType.BRICK, 7808),
                        new ResStat(ResType.WOOD, 868),
                        new ResStat(ResType.GLASS, 3470),
                        new ResStat(ResType.MONEY, 520500)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.CONSTRUCTION, 15120),
                        new ResStat(ResType.STEEL, 2887),
                        new ResStat(ResType.CONCRETE, 24060),
                        new ResStat(ResType.BRICK, 10827),
                        new ResStat(ResType.WOOD, 1203),
                        new ResStat(ResType.GLASS, 4812),
                        new ResStat(ResType.MONEY, 721800)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.CONSTRUCTION, 19800),
                        new ResStat(ResType.STEEL, 3870),
                        new ResStat(ResType.CONCRETE, 32250),
                        new ResStat(ResType.BRICK, 14513),
                        new ResStat(ResType.WOOD, 1613),
                        new ResStat(ResType.GLASS, 6450),
                        new ResStat(ResType.MONEY, 967500)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.CONSTRUCTION, 25200),
                        new ResStat(ResType.STEEL, 5040),
                        new ResStat(ResType.CONCRETE, 42000),
                        new ResStat(ResType.BRICK, 18900),
                        new ResStat(ResType.WOOD, 2100),
                        new ResStat(ResType.GLASS, 8400),
                        new ResStat(ResType.MONEY, 1260000)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.CONSTRUCTION, 31680),
                        new ResStat(ResType.STEEL, 6509),
                        new ResStat(ResType.CONCRETE, 54240),
                        new ResStat(ResType.BRICK, 24408),
                        new ResStat(ResType.WOOD, 2712),
                        new ResStat(ResType.GLASS, 10848),
                        new ResStat(ResType.MONEY, 1627200)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.CONSTRUCTION, 39240),
                        new ResStat(ResType.STEEL, 8298),
                        new ResStat(ResType.CONCRETE, 69150),
                        new ResStat(ResType.BRICK, 31118),
                        new ResStat(ResType.WOOD, 3458),
                        new ResStat(ResType.GLASS, 13830),
                        new ResStat(ResType.MONEY, 2074500)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.CONSTRUCTION, 47880),
                        new ResStat(ResType.STEEL, 10429),
                        new ResStat(ResType.CONCRETE, 86910),
                        new ResStat(ResType.BRICK, 39110),
                        new ResStat(ResType.WOOD, 4346),
                        new ResStat(ResType.GLASS, 17382),
                        new ResStat(ResType.MONEY, 2607300)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.CONSTRUCTION, 57600),
                        new ResStat(ResType.STEEL, 12924),
                        new ResStat(ResType.CONCRETE, 107700),
                        new ResStat(ResType.BRICK, 48465),
                        new ResStat(ResType.WOOD, 5385),
                        new ResStat(ResType.GLASS, 21540),
                        new ResStat(ResType.MONEY, 3231000)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.CONSTRUCTION, 68400),
                        new ResStat(ResType.STEEL, 15804),
                        new ResStat(ResType.CONCRETE, 131700),
                        new ResStat(ResType.BRICK, 59265),
                        new ResStat(ResType.WOOD, 6585),
                        new ResStat(ResType.GLASS, 26340),
                        new ResStat(ResType.MONEY, 3951000)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.CONSTRUCTION, 80640),
                        new ResStat(ResType.STEEL, 19231),
                        new ResStat(ResType.CONCRETE, 160260),
                        new ResStat(ResType.BRICK, 72117),
                        new ResStat(ResType.WOOD, 8013),
                        new ResStat(ResType.GLASS, 32052),
                        new ResStat(ResType.MONEY, 4807800)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.CONSTRUCTION, 94320),
                        new ResStat(ResType.STEEL, 23244),
                        new ResStat(ResType.CONCRETE, 193700),
                        new ResStat(ResType.BRICK, 87165),
                        new ResStat(ResType.WOOD, 9685),
                        new ResStat(ResType.GLASS, 38740),
                        new ResStat(ResType.MONEY, 5811000)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.CONSTRUCTION, 109440),
                        new ResStat(ResType.STEEL, 27881),
                        new ResStat(ResType.CONCRETE, 232340),
                        new ResStat(ResType.BRICK, 104553),
                        new ResStat(ResType.WOOD, 11617),
                        new ResStat(ResType.GLASS, 46468),
                        new ResStat(ResType.MONEY, 6970200)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.CONSTRUCTION, 126000),
                        new ResStat(ResType.STEEL, 33180),
                        new ResStat(ResType.CONCRETE, 276500),
                        new ResStat(ResType.BRICK, 124425),
                        new ResStat(ResType.WOOD, 13825),
                        new ResStat(ResType.GLASS, 55300),
                        new ResStat(ResType.MONEY, 8295000)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.CONSTRUCTION, 144000),
                        new ResStat(ResType.STEEL, 39180),
                        new ResStat(ResType.CONCRETE, 326500),
                        new ResStat(ResType.BRICK, 146925),
                        new ResStat(ResType.WOOD, 16325),
                        new ResStat(ResType.GLASS, 65300),
                        new ResStat(ResType.MONEY, 9795000)
                )
        });
        setJobPrice(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.ACTION, 24)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.ACTION, 28)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.ACTION, 32)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.ACTION, 36)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.ACTION, 40)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.ACTION, 44)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.ACTION, 48)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.ACTION, 52)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.ACTION, 56)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.ACTION, 60)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.ACTION, 64)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.ACTION, 68)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.ACTION, 72)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.ACTION, 76)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.ACTION, 80)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.ACTION, 84)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.ACTION, 88)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.ACTION, 92)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.ACTION, 96)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.ACTION, 100)
                )
        });
        setJobReward(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.ENERGY, 26)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.ENERGY, 32)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.ENERGY, 38)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.ENERGY, 44)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.ENERGY, 50)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.ENERGY, 58)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.ENERGY, 66)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.ENERGY, 74)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.ENERGY, 82)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.ENERGY, 90)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.ENERGY, 100)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.ENERGY, 110)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.ENERGY, 120)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.ENERGY, 130)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.ENERGY, 140)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.ENERGY, 152)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.ENERGY, 164)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.ENERGY, 176)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.ENERGY, 188)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.ENERGY, 200)
                )
        });
        setDemand(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.POWER_CONSUMPTION, 4),
                        new ResStat(ResType.JOB, 80),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.POWER_CONSUMPTION, 8),
                        new ResStat(ResType.JOB, 160),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.POWER_CONSUMPTION, 12),
                        new ResStat(ResType.JOB, 240),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.POWER_CONSUMPTION, 16),
                        new ResStat(ResType.JOB, 320),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.POWER_CONSUMPTION, 20),
                        new ResStat(ResType.JOB, 400),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.POWER_CONSUMPTION, 28),
                        new ResStat(ResType.JOB, 560),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.POWER_CONSUMPTION, 36),
                        new ResStat(ResType.JOB, 720),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.POWER_CONSUMPTION, 44),
                        new ResStat(ResType.JOB, 880),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.POWER_CONSUMPTION, 52),
                        new ResStat(ResType.JOB, 1040),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.POWER_CONSUMPTION, 60),
                        new ResStat(ResType.JOB, 1200),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.POWER_CONSUMPTION, 72),
                        new ResStat(ResType.JOB, 1440),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.POWER_CONSUMPTION, 84),
                        new ResStat(ResType.JOB, 1680),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.POWER_CONSUMPTION, 96),
                        new ResStat(ResType.JOB, 1920),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.POWER_CONSUMPTION, 108),
                        new ResStat(ResType.JOB, 2160),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.POWER_CONSUMPTION, 120),
                        new ResStat(ResType.JOB, 2400),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.POWER_CONSUMPTION, 136),
                        new ResStat(ResType.JOB, 2720),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.POWER_CONSUMPTION, 152),
                        new ResStat(ResType.JOB, 3040),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.POWER_CONSUMPTION, 168),
                        new ResStat(ResType.JOB, 3360),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.POWER_CONSUMPTION, 184),
                        new ResStat(ResType.JOB, 3600),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.POWER_CONSUMPTION, 200),
                        new ResStat(ResType.JOB, 4000),
                        new ResStat(ResType.IGNITABILITY, 1)
                )
        });
        setHold(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.POWER, 4),
                        new ResStat(ResType.WORKER, 80)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.POWER, 8),
                        new ResStat(ResType.WORKER, 160)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.POWER, 12),
                        new ResStat(ResType.WORKER, 240)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.POWER, 16),
                        new ResStat(ResType.WORKER, 320)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.POWER, 20),
                        new ResStat(ResType.WORKER, 400)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.POWER, 28),
                        new ResStat(ResType.WORKER, 560)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.POWER, 36),
                        new ResStat(ResType.WORKER, 720)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.POWER, 44),
                        new ResStat(ResType.WORKER, 880)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.POWER, 52),
                        new ResStat(ResType.WORKER, 1040)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.POWER, 60),
                        new ResStat(ResType.WORKER, 1200)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.POWER, 72),
                        new ResStat(ResType.WORKER, 1440)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.POWER, 84),
                        new ResStat(ResType.WORKER, 1680)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.POWER, 96),
                        new ResStat(ResType.WORKER, 1920)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.POWER, 108),
                        new ResStat(ResType.WORKER, 2160)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.POWER, 120),
                        new ResStat(ResType.WORKER, 2400)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.POWER, 136),
                        new ResStat(ResType.WORKER, 2720)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.POWER, 152),
                        new ResStat(ResType.WORKER, 3040)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.POWER, 168),
                        new ResStat(ResType.WORKER, 3360)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.POWER, 184),
                        new ResStat(ResType.WORKER, 3600)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.POWER, 200),
                        new ResStat(ResType.WORKER, 4000)
                )
        });
        setCapacity(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.ENERGY, 40)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.ENERGY, 80)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.ENERGY, 120)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.ENERGY, 160)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.ENERGY, 200)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.ENERGY, 280)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.ENERGY, 360)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.ENERGY, 440)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.ENERGY, 520)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.ENERGY, 600)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.ENERGY, 720)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.ENERGY, 840)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.ENERGY, 960)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.ENERGY, 1080)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.ENERGY, 1200)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.ENERGY, 1360)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.ENERGY, 1520)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.ENERGY, 1680)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.ENERGY, 1840)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.ENERGY, 2000)
                )
        });
    }
}
