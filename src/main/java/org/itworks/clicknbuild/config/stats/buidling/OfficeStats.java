package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResChunk;
import org.itworks.clicknbuild.engine.model.ResPack;
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
        setBuildCost(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.CONSTRUCTION, 500),
                        new ResChunk(ResType.STEEL, 163),
                        new ResChunk(ResType.CONCRETE, 245),
                        new ResChunk(ResType.WOOD, 61),
                        new ResChunk(ResType.GLASS, 1020),
                        new ResChunk(ResType.MONEY, 35700)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.CONSTRUCTION, 1500),
                        new ResChunk(ResType.STEEL, 496),
                        new ResChunk(ResType.CONCRETE, 744),
                        new ResChunk(ResType.WOOD, 186),
                        new ResChunk(ResType.GLASS, 3100),
                        new ResChunk(ResType.MONEY, 108500)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.CONSTRUCTION, 3000),
                        new ResChunk(ResType.STEEL, 1005),
                        new ResChunk(ResType.CONCRETE, 1507),
                        new ResChunk(ResType.WOOD, 377),
                        new ResChunk(ResType.GLASS, 6280),
                        new ResChunk(ResType.MONEY, 219800)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.CONSTRUCTION, 5000),
                        new ResChunk(ResType.STEEL, 1696),
                        new ResChunk(ResType.CONCRETE, 2544),
                        new ResChunk(ResType.WOOD, 636),
                        new ResChunk(ResType.GLASS, 10600),
                        new ResChunk(ResType.MONEY, 371000)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.CONSTRUCTION, 7500),
                        new ResChunk(ResType.STEEL, 2576),
                        new ResChunk(ResType.CONCRETE, 3864),
                        new ResChunk(ResType.WOOD, 966),
                        new ResChunk(ResType.GLASS, 16100),
                        new ResChunk(ResType.MONEY, 563500)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.CONSTRUCTION, 11000),
                        new ResChunk(ResType.STEEL, 3853),
                        new ResChunk(ResType.CONCRETE, 5779),
                        new ResChunk(ResType.WOOD, 1445),
                        new ResChunk(ResType.GLASS, 24080),
                        new ResChunk(ResType.MONEY, 842000)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.CONSTRUCTION, 15500),
                        new ResChunk(ResType.STEEL, 5552),
                        new ResChunk(ResType.CONCRETE, 8328),
                        new ResChunk(ResType.WOOD, 2082),
                        new ResChunk(ResType.GLASS, 34700),
                        new ResChunk(ResType.MONEY, 1214500)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.CONSTRUCTION, 21000),
                        new ResChunk(ResType.STEEL, 7699),
                        new ResChunk(ResType.CONCRETE, 11549),
                        new ResChunk(ResType.WOOD, 2887),
                        new ResChunk(ResType.GLASS, 48120),
                        new ResChunk(ResType.MONEY, 1684200)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.CONSTRUCTION, 27500),
                        new ResChunk(ResType.STEEL, 10320),
                        new ResChunk(ResType.CONCRETE, 15480),
                        new ResChunk(ResType.WOOD, 3870),
                        new ResChunk(ResType.GLASS, 64500),
                        new ResChunk(ResType.MONEY, 2257500)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.CONSTRUCTION, 35000),
                        new ResChunk(ResType.STEEL, 13440),
                        new ResChunk(ResType.CONCRETE, 20160),
                        new ResChunk(ResType.WOOD, 5040),
                        new ResChunk(ResType.GLASS, 84000),
                        new ResChunk(ResType.MONEY, 2940000)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.CONSTRUCTION, 44000),
                        new ResChunk(ResType.STEEL, 17357),
                        new ResChunk(ResType.CONCRETE, 26036),
                        new ResChunk(ResType.WOOD, 6509),
                        new ResChunk(ResType.GLASS, 108480),
                        new ResChunk(ResType.MONEY, 3796800)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.CONSTRUCTION, 54500),
                        new ResChunk(ResType.STEEL, 22128),
                        new ResChunk(ResType.CONCRETE, 33192),
                        new ResChunk(ResType.WOOD, 8298),
                        new ResChunk(ResType.GLASS, 138300),
                        new ResChunk(ResType.MONEY, 4840500)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.CONSTRUCTION, 66500),
                        new ResChunk(ResType.STEEL, 27811),
                        new ResChunk(ResType.CONCRETE, 41717),
                        new ResChunk(ResType.WOOD, 10249),
                        new ResChunk(ResType.GLASS, 173820),
                        new ResChunk(ResType.MONEY, 6083700)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.CONSTRUCTION, 80000),
                        new ResChunk(ResType.STEEL, 34464),
                        new ResChunk(ResType.CONCRETE, 51696),
                        new ResChunk(ResType.WOOD, 12924),
                        new ResChunk(ResType.GLASS, 215400),
                        new ResChunk(ResType.MONEY, 7539000)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.CONSTRUCTION, 95000),
                        new ResChunk(ResType.STEEL, 42144),
                        new ResChunk(ResType.CONCRETE, 63216),
                        new ResChunk(ResType.WOOD, 15804),
                        new ResChunk(ResType.GLASS, 263400),
                        new ResChunk(ResType.MONEY, 9219000)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.CONSTRUCTION, 112000),
                        new ResChunk(ResType.STEEL, 51283),
                        new ResChunk(ResType.CONCRETE, 76925),
                        new ResChunk(ResType.WOOD, 19231),
                        new ResChunk(ResType.GLASS, 320520),
                        new ResChunk(ResType.MONEY, 11218200)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.CONSTRUCTION, 131000),
                        new ResChunk(ResType.STEEL, 61984),
                        new ResChunk(ResType.CONCRETE, 92976),
                        new ResChunk(ResType.WOOD, 23244),
                        new ResChunk(ResType.GLASS, 387400),
                        new ResChunk(ResType.MONEY, 13559000)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.CONSTRUCTION, 152000),
                        new ResChunk(ResType.STEEL, 74349),
                        new ResChunk(ResType.CONCRETE, 111523),
                        new ResChunk(ResType.WOOD, 27881),
                        new ResChunk(ResType.GLASS, 464680),
                        new ResChunk(ResType.MONEY, 16263800)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.CONSTRUCTION, 175000),
                        new ResChunk(ResType.STEEL, 88480),
                        new ResChunk(ResType.CONCRETE, 132720),
                        new ResChunk(ResType.WOOD, 33180),
                        new ResChunk(ResType.GLASS, 553000),
                        new ResChunk(ResType.MONEY, 19355000)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.CONSTRUCTION, 20000),
                        new ResChunk(ResType.STEEL, 104480),
                        new ResChunk(ResType.CONCRETE, 156720),
                        new ResChunk(ResType.WOOD, 39180),
                        new ResChunk(ResType.GLASS, 653000),
                        new ResChunk(ResType.MONEY, 22855000)
                )
        });
        setProduction(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.MONEY, 200)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.MONEY, 400)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.MONEY, 600)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.MONEY, 800)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.MONEY, 1000)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.MONEY, 1400)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.MONEY, 1800)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.MONEY, 2200)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.MONEY, 2600)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.MONEY, 3000)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.MONEY, 3600)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.MONEY, 4200)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.MONEY, 4800)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.MONEY, 5400)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.MONEY, 6000)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.MONEY, 6800)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.MONEY, 7600)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.MONEY, 8400)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.MONEY, 9200)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.MONEY, 10000)
                )
        });
        setJobPrice(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.ACTION, 24),
                        new ResChunk(ResType.ENERGY, 24)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.ACTION, 28),
                        new ResChunk(ResType.ENERGY, 28)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.ACTION, 32),
                        new ResChunk(ResType.ENERGY, 32)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.ACTION, 36),
                        new ResChunk(ResType.ENERGY, 36)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.ACTION, 40),
                        new ResChunk(ResType.ENERGY, 40)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.ACTION, 44),
                        new ResChunk(ResType.ENERGY, 44)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.ACTION, 48),
                        new ResChunk(ResType.ENERGY, 48)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.ACTION, 52),
                        new ResChunk(ResType.ENERGY, 52)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.ACTION, 56),
                        new ResChunk(ResType.ENERGY, 56)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.ACTION, 60),
                        new ResChunk(ResType.ENERGY, 60)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.ACTION, 64),
                        new ResChunk(ResType.ENERGY, 64)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.ACTION, 68),
                        new ResChunk(ResType.ENERGY, 68)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.ACTION, 72),
                        new ResChunk(ResType.ENERGY, 72)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.ACTION, 76),
                        new ResChunk(ResType.ENERGY, 76)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.ACTION, 80),
                        new ResChunk(ResType.ENERGY, 80)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.ACTION, 84),
                        new ResChunk(ResType.ENERGY, 84)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.ACTION, 88),
                        new ResChunk(ResType.ENERGY, 88)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.ACTION, 92),
                        new ResChunk(ResType.ENERGY, 92)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.ACTION, 96),
                        new ResChunk(ResType.ENERGY, 96)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.ACTION, 100),
                        new ResChunk(ResType.ENERGY, 100)
                )
        });
        setJobReward(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.MONEY, 200)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.MONEY, 400)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.MONEY, 600)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.MONEY, 800)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.MONEY, 1000)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.MONEY, 1400)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.MONEY, 1800)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.MONEY, 2200)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.MONEY, 2600)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.MONEY, 3000)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.MONEY, 3600)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.MONEY, 4200)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.MONEY, 4800)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.MONEY, 5400)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.MONEY, 6000)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.MONEY, 6800)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.MONEY, 7600)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.MONEY, 8400)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.MONEY, 9200)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.MONEY, 10000)
                )
        });
        setDemand(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.POWER_CONSUMPTION, 9),
                        new ResChunk(ResType.JOB, 180),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.POWER_CONSUMPTION, 18),
                        new ResChunk(ResType.JOB, 360),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.POWER_CONSUMPTION, 27),
                        new ResChunk(ResType.JOB, 540),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.POWER_CONSUMPTION, 36),
                        new ResChunk(ResType.JOB, 720),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.POWER_CONSUMPTION, 45),
                        new ResChunk(ResType.JOB, 900),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.POWER_CONSUMPTION, 63),
                        new ResChunk(ResType.JOB, 1260),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.POWER_CONSUMPTION, 81),
                        new ResChunk(ResType.JOB, 1620),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.POWER_CONSUMPTION, 99),
                        new ResChunk(ResType.JOB, 1980),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.POWER_CONSUMPTION, 117),
                        new ResChunk(ResType.JOB, 2340),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.POWER_CONSUMPTION, 135),
                        new ResChunk(ResType.JOB, 2700),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.POWER_CONSUMPTION, 162),
                        new ResChunk(ResType.JOB, 3240),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.POWER_CONSUMPTION, 189),
                        new ResChunk(ResType.JOB, 3780),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.POWER_CONSUMPTION, 216),
                        new ResChunk(ResType.JOB, 4320),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.POWER_CONSUMPTION, 243),
                        new ResChunk(ResType.JOB, 4860),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.POWER_CONSUMPTION, 270),
                        new ResChunk(ResType.JOB, 5400),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.POWER_CONSUMPTION, 306),
                        new ResChunk(ResType.JOB, 6120),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.POWER_CONSUMPTION, 342),
                        new ResChunk(ResType.JOB, 6840),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.POWER_CONSUMPTION, 378),
                        new ResChunk(ResType.JOB, 7560),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.POWER_CONSUMPTION, 414),
                        new ResChunk(ResType.JOB, 8280),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 20
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
