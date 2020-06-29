package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;
import org.itworks.clicknbuild.engine.model.ResType;

public final class OfficeStats extends BuildingStats {
    private static volatile OfficeStats inst;

    private OfficeStats() {
    }

    public static OfficeStats inst() {
        OfficeStats local = inst;
        if (local == null) {
            synchronized (OfficeStats.class) {
                local = inst;
                if (local == null) {
                    inst = local = new OfficeStats();
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
        setBuildLimit(1000);
        setPriceMultiplier(110);
        setStructure(new int[]{
                500, // 1
                1500, // 2
                3000, // 3
                5000, // 4
                7500, // 5
                11000, // 6
                15500, // 7
                21000, // 8
                27500, // 9
                35000, // 10
                44000, // 11
                54500, // 12
                66500, // 13
                80000, // 14
                95000, // 15
                112000, // 16
                131000, // 17
                152000, // 18
                175000, // 19
                200000 // 20
        });
        setBuildCost(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.CONSTRUCTION, 500),
                        new ResourceChunk(ResType.STEEL, 163),
                        new ResourceChunk(ResType.CONCRETE, 245),
                        new ResourceChunk(ResType.WOOD, 61),
                        new ResourceChunk(ResType.GLASS, 1020),
                        new ResourceChunk(ResType.MONEY, 35700)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.CONSTRUCTION, 1500),
                        new ResourceChunk(ResType.STEEL, 496),
                        new ResourceChunk(ResType.CONCRETE, 744),
                        new ResourceChunk(ResType.WOOD, 186),
                        new ResourceChunk(ResType.GLASS, 3100),
                        new ResourceChunk(ResType.MONEY, 108500)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.CONSTRUCTION, 3000),
                        new ResourceChunk(ResType.STEEL, 1005),
                        new ResourceChunk(ResType.CONCRETE, 1507),
                        new ResourceChunk(ResType.WOOD, 377),
                        new ResourceChunk(ResType.GLASS, 6280),
                        new ResourceChunk(ResType.MONEY, 219800)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.CONSTRUCTION, 5000),
                        new ResourceChunk(ResType.STEEL, 1696),
                        new ResourceChunk(ResType.CONCRETE, 2544),
                        new ResourceChunk(ResType.WOOD, 636),
                        new ResourceChunk(ResType.GLASS, 10600),
                        new ResourceChunk(ResType.MONEY, 371000)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.CONSTRUCTION, 7500),
                        new ResourceChunk(ResType.STEEL, 2576),
                        new ResourceChunk(ResType.CONCRETE, 3864),
                        new ResourceChunk(ResType.WOOD, 966),
                        new ResourceChunk(ResType.GLASS, 16100),
                        new ResourceChunk(ResType.MONEY, 563500)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.CONSTRUCTION, 11000),
                        new ResourceChunk(ResType.STEEL, 3853),
                        new ResourceChunk(ResType.CONCRETE, 5779),
                        new ResourceChunk(ResType.WOOD, 1445),
                        new ResourceChunk(ResType.GLASS, 24080),
                        new ResourceChunk(ResType.MONEY, 842000)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.CONSTRUCTION, 15500),
                        new ResourceChunk(ResType.STEEL, 5552),
                        new ResourceChunk(ResType.CONCRETE, 8328),
                        new ResourceChunk(ResType.WOOD, 2082),
                        new ResourceChunk(ResType.GLASS, 34700),
                        new ResourceChunk(ResType.MONEY, 1214500)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.CONSTRUCTION, 21000),
                        new ResourceChunk(ResType.STEEL, 7699),
                        new ResourceChunk(ResType.CONCRETE, 11549),
                        new ResourceChunk(ResType.WOOD, 2887),
                        new ResourceChunk(ResType.GLASS, 48120),
                        new ResourceChunk(ResType.MONEY, 1684200)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.CONSTRUCTION, 27500),
                        new ResourceChunk(ResType.STEEL, 10320),
                        new ResourceChunk(ResType.CONCRETE, 15480),
                        new ResourceChunk(ResType.WOOD, 3870),
                        new ResourceChunk(ResType.GLASS, 64500),
                        new ResourceChunk(ResType.MONEY, 2257500)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.CONSTRUCTION, 35000),
                        new ResourceChunk(ResType.STEEL, 13440),
                        new ResourceChunk(ResType.CONCRETE, 20160),
                        new ResourceChunk(ResType.WOOD, 5040),
                        new ResourceChunk(ResType.GLASS, 84000),
                        new ResourceChunk(ResType.MONEY, 2940000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.CONSTRUCTION, 44000),
                        new ResourceChunk(ResType.STEEL, 17357),
                        new ResourceChunk(ResType.CONCRETE, 26036),
                        new ResourceChunk(ResType.WOOD, 6509),
                        new ResourceChunk(ResType.GLASS, 108480),
                        new ResourceChunk(ResType.MONEY, 3796800)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.CONSTRUCTION, 54500),
                        new ResourceChunk(ResType.STEEL, 22128),
                        new ResourceChunk(ResType.CONCRETE, 33192),
                        new ResourceChunk(ResType.WOOD, 8298),
                        new ResourceChunk(ResType.GLASS, 138300),
                        new ResourceChunk(ResType.MONEY, 4840500)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.CONSTRUCTION, 66500),
                        new ResourceChunk(ResType.STEEL, 27811),
                        new ResourceChunk(ResType.CONCRETE, 41717),
                        new ResourceChunk(ResType.WOOD, 10249),
                        new ResourceChunk(ResType.GLASS, 173820),
                        new ResourceChunk(ResType.MONEY, 6083700)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.CONSTRUCTION, 80000),
                        new ResourceChunk(ResType.STEEL, 34464),
                        new ResourceChunk(ResType.CONCRETE, 51696),
                        new ResourceChunk(ResType.WOOD, 12924),
                        new ResourceChunk(ResType.GLASS, 215400),
                        new ResourceChunk(ResType.MONEY, 7539000)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.CONSTRUCTION, 95000),
                        new ResourceChunk(ResType.STEEL, 42144),
                        new ResourceChunk(ResType.CONCRETE, 63216),
                        new ResourceChunk(ResType.WOOD, 15804),
                        new ResourceChunk(ResType.GLASS, 263400),
                        new ResourceChunk(ResType.MONEY, 9219000)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.CONSTRUCTION, 112000),
                        new ResourceChunk(ResType.STEEL, 51283),
                        new ResourceChunk(ResType.CONCRETE, 76925),
                        new ResourceChunk(ResType.WOOD, 19231),
                        new ResourceChunk(ResType.GLASS, 320520),
                        new ResourceChunk(ResType.MONEY, 11218200)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.CONSTRUCTION, 131000),
                        new ResourceChunk(ResType.STEEL, 61984),
                        new ResourceChunk(ResType.CONCRETE, 92976),
                        new ResourceChunk(ResType.WOOD, 23244),
                        new ResourceChunk(ResType.GLASS, 387400),
                        new ResourceChunk(ResType.MONEY, 13559000)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.CONSTRUCTION, 152000),
                        new ResourceChunk(ResType.STEEL, 74349),
                        new ResourceChunk(ResType.CONCRETE, 111523),
                        new ResourceChunk(ResType.WOOD, 27881),
                        new ResourceChunk(ResType.GLASS, 464680),
                        new ResourceChunk(ResType.MONEY, 16263800)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.CONSTRUCTION, 175000),
                        new ResourceChunk(ResType.STEEL, 88480),
                        new ResourceChunk(ResType.CONCRETE, 132720),
                        new ResourceChunk(ResType.WOOD, 33180),
                        new ResourceChunk(ResType.GLASS, 553000),
                        new ResourceChunk(ResType.MONEY, 19355000)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.CONSTRUCTION, 20000),
                        new ResourceChunk(ResType.STEEL, 104480),
                        new ResourceChunk(ResType.CONCRETE, 156720),
                        new ResourceChunk(ResType.WOOD, 39180),
                        new ResourceChunk(ResType.GLASS, 653000),
                        new ResourceChunk(ResType.MONEY, 22855000)
                )
        });
        setProduction(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.MONEY, 200)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.MONEY, 400)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.MONEY, 600)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.MONEY, 800)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.MONEY, 1000)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.MONEY, 1400)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.MONEY, 1800)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.MONEY, 2200)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.MONEY, 2600)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.MONEY, 3000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.MONEY, 3600)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.MONEY, 4200)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.MONEY, 4800)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.MONEY, 5400)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.MONEY, 6000)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.MONEY, 6800)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.MONEY, 7600)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.MONEY, 8400)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.MONEY, 9200)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.MONEY, 10000)
                )
        });
        setJobPrice(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.ACTION, 24),
                        new ResourceChunk(ResType.ENERGY, 24)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.ACTION, 28),
                        new ResourceChunk(ResType.ENERGY, 28)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.ACTION, 32),
                        new ResourceChunk(ResType.ENERGY, 32)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.ACTION, 36),
                        new ResourceChunk(ResType.ENERGY, 36)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.ACTION, 40),
                        new ResourceChunk(ResType.ENERGY, 40)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.ACTION, 44),
                        new ResourceChunk(ResType.ENERGY, 44)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.ACTION, 48),
                        new ResourceChunk(ResType.ENERGY, 48)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.ACTION, 52),
                        new ResourceChunk(ResType.ENERGY, 52)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.ACTION, 56),
                        new ResourceChunk(ResType.ENERGY, 56)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.ACTION, 60),
                        new ResourceChunk(ResType.ENERGY, 60)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.ACTION, 64),
                        new ResourceChunk(ResType.ENERGY, 64)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.ACTION, 68),
                        new ResourceChunk(ResType.ENERGY, 68)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.ACTION, 72),
                        new ResourceChunk(ResType.ENERGY, 72)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.ACTION, 76),
                        new ResourceChunk(ResType.ENERGY, 76)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.ACTION, 80),
                        new ResourceChunk(ResType.ENERGY, 80)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.ACTION, 84),
                        new ResourceChunk(ResType.ENERGY, 84)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.ACTION, 88),
                        new ResourceChunk(ResType.ENERGY, 88)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.ACTION, 92),
                        new ResourceChunk(ResType.ENERGY, 92)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.ACTION, 96),
                        new ResourceChunk(ResType.ENERGY, 96)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.ACTION, 100),
                        new ResourceChunk(ResType.ENERGY, 100)
                )
        });
        setJobReward(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.MONEY, 200)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.MONEY, 400)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.MONEY, 600)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.MONEY, 800)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.MONEY, 1000)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.MONEY, 1400)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.MONEY, 1800)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.MONEY, 2200)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.MONEY, 2600)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.MONEY, 3000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.MONEY, 3600)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.MONEY, 4200)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.MONEY, 4800)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.MONEY, 5400)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.MONEY, 6000)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.MONEY, 6800)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.MONEY, 7600)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.MONEY, 8400)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.MONEY, 9200)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.MONEY, 10000)
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
    }
}
