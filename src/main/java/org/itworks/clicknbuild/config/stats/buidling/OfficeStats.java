package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResStat;
import org.itworks.clicknbuild.engine.model.ResStatPack;
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
        setBuildCost(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.CONSTRUCTION, 500),
                        new ResStat(ResType.STEEL, 163),
                        new ResStat(ResType.CONCRETE, 245),
                        new ResStat(ResType.WOOD, 61),
                        new ResStat(ResType.GLASS, 1020),
                        new ResStat(ResType.MONEY, 35700)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.CONSTRUCTION, 1500),
                        new ResStat(ResType.STEEL, 496),
                        new ResStat(ResType.CONCRETE, 744),
                        new ResStat(ResType.WOOD, 186),
                        new ResStat(ResType.GLASS, 3100),
                        new ResStat(ResType.MONEY, 108500)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.CONSTRUCTION, 3000),
                        new ResStat(ResType.STEEL, 1005),
                        new ResStat(ResType.CONCRETE, 1507),
                        new ResStat(ResType.WOOD, 377),
                        new ResStat(ResType.GLASS, 6280),
                        new ResStat(ResType.MONEY, 219800)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.CONSTRUCTION, 5000),
                        new ResStat(ResType.STEEL, 1696),
                        new ResStat(ResType.CONCRETE, 2544),
                        new ResStat(ResType.WOOD, 636),
                        new ResStat(ResType.GLASS, 10600),
                        new ResStat(ResType.MONEY, 371000)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.CONSTRUCTION, 7500),
                        new ResStat(ResType.STEEL, 2576),
                        new ResStat(ResType.CONCRETE, 3864),
                        new ResStat(ResType.WOOD, 966),
                        new ResStat(ResType.GLASS, 16100),
                        new ResStat(ResType.MONEY, 563500)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.CONSTRUCTION, 11000),
                        new ResStat(ResType.STEEL, 3853),
                        new ResStat(ResType.CONCRETE, 5779),
                        new ResStat(ResType.WOOD, 1445),
                        new ResStat(ResType.GLASS, 24080),
                        new ResStat(ResType.MONEY, 842000)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.CONSTRUCTION, 15500),
                        new ResStat(ResType.STEEL, 5552),
                        new ResStat(ResType.CONCRETE, 8328),
                        new ResStat(ResType.WOOD, 2082),
                        new ResStat(ResType.GLASS, 34700),
                        new ResStat(ResType.MONEY, 1214500)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.CONSTRUCTION, 21000),
                        new ResStat(ResType.STEEL, 7699),
                        new ResStat(ResType.CONCRETE, 11549),
                        new ResStat(ResType.WOOD, 2887),
                        new ResStat(ResType.GLASS, 48120),
                        new ResStat(ResType.MONEY, 1684200)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.CONSTRUCTION, 27500),
                        new ResStat(ResType.STEEL, 10320),
                        new ResStat(ResType.CONCRETE, 15480),
                        new ResStat(ResType.WOOD, 3870),
                        new ResStat(ResType.GLASS, 64500),
                        new ResStat(ResType.MONEY, 2257500)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.CONSTRUCTION, 35000),
                        new ResStat(ResType.STEEL, 13440),
                        new ResStat(ResType.CONCRETE, 20160),
                        new ResStat(ResType.WOOD, 5040),
                        new ResStat(ResType.GLASS, 84000),
                        new ResStat(ResType.MONEY, 2940000)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.CONSTRUCTION, 44000),
                        new ResStat(ResType.STEEL, 17357),
                        new ResStat(ResType.CONCRETE, 26036),
                        new ResStat(ResType.WOOD, 6509),
                        new ResStat(ResType.GLASS, 108480),
                        new ResStat(ResType.MONEY, 3796800)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.CONSTRUCTION, 54500),
                        new ResStat(ResType.STEEL, 22128),
                        new ResStat(ResType.CONCRETE, 33192),
                        new ResStat(ResType.WOOD, 8298),
                        new ResStat(ResType.GLASS, 138300),
                        new ResStat(ResType.MONEY, 4840500)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.CONSTRUCTION, 66500),
                        new ResStat(ResType.STEEL, 27811),
                        new ResStat(ResType.CONCRETE, 41717),
                        new ResStat(ResType.WOOD, 10249),
                        new ResStat(ResType.GLASS, 173820),
                        new ResStat(ResType.MONEY, 6083700)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.CONSTRUCTION, 80000),
                        new ResStat(ResType.STEEL, 34464),
                        new ResStat(ResType.CONCRETE, 51696),
                        new ResStat(ResType.WOOD, 12924),
                        new ResStat(ResType.GLASS, 215400),
                        new ResStat(ResType.MONEY, 7539000)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.CONSTRUCTION, 95000),
                        new ResStat(ResType.STEEL, 42144),
                        new ResStat(ResType.CONCRETE, 63216),
                        new ResStat(ResType.WOOD, 15804),
                        new ResStat(ResType.GLASS, 263400),
                        new ResStat(ResType.MONEY, 9219000)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.CONSTRUCTION, 112000),
                        new ResStat(ResType.STEEL, 51283),
                        new ResStat(ResType.CONCRETE, 76925),
                        new ResStat(ResType.WOOD, 19231),
                        new ResStat(ResType.GLASS, 320520),
                        new ResStat(ResType.MONEY, 11218200)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.CONSTRUCTION, 131000),
                        new ResStat(ResType.STEEL, 61984),
                        new ResStat(ResType.CONCRETE, 92976),
                        new ResStat(ResType.WOOD, 23244),
                        new ResStat(ResType.GLASS, 387400),
                        new ResStat(ResType.MONEY, 13559000)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.CONSTRUCTION, 152000),
                        new ResStat(ResType.STEEL, 74349),
                        new ResStat(ResType.CONCRETE, 111523),
                        new ResStat(ResType.WOOD, 27881),
                        new ResStat(ResType.GLASS, 464680),
                        new ResStat(ResType.MONEY, 16263800)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.CONSTRUCTION, 175000),
                        new ResStat(ResType.STEEL, 88480),
                        new ResStat(ResType.CONCRETE, 132720),
                        new ResStat(ResType.WOOD, 33180),
                        new ResStat(ResType.GLASS, 553000),
                        new ResStat(ResType.MONEY, 19355000)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.CONSTRUCTION, 20000),
                        new ResStat(ResType.STEEL, 104480),
                        new ResStat(ResType.CONCRETE, 156720),
                        new ResStat(ResType.WOOD, 39180),
                        new ResStat(ResType.GLASS, 653000),
                        new ResStat(ResType.MONEY, 22855000)
                )
        });
        setProduction(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.MONEY, 200)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.MONEY, 400)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.MONEY, 600)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.MONEY, 800)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.MONEY, 1000)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.MONEY, 1400)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.MONEY, 1800)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.MONEY, 2200)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.MONEY, 2600)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.MONEY, 3000)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.MONEY, 3600)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.MONEY, 4200)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.MONEY, 4800)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.MONEY, 5400)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.MONEY, 6000)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.MONEY, 6800)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.MONEY, 7600)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.MONEY, 8400)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.MONEY, 9200)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.MONEY, 10000)
                )
        });
        setJobPrice(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.ACTION, 24),
                        new ResStat(ResType.ENERGY, 24)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.ACTION, 28),
                        new ResStat(ResType.ENERGY, 28)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.ACTION, 32),
                        new ResStat(ResType.ENERGY, 32)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.ACTION, 36),
                        new ResStat(ResType.ENERGY, 36)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.ACTION, 40),
                        new ResStat(ResType.ENERGY, 40)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.ACTION, 44),
                        new ResStat(ResType.ENERGY, 44)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.ACTION, 48),
                        new ResStat(ResType.ENERGY, 48)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.ACTION, 52),
                        new ResStat(ResType.ENERGY, 52)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.ACTION, 56),
                        new ResStat(ResType.ENERGY, 56)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.ACTION, 60),
                        new ResStat(ResType.ENERGY, 60)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.ACTION, 64),
                        new ResStat(ResType.ENERGY, 64)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.ACTION, 68),
                        new ResStat(ResType.ENERGY, 68)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.ACTION, 72),
                        new ResStat(ResType.ENERGY, 72)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.ACTION, 76),
                        new ResStat(ResType.ENERGY, 76)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.ACTION, 80),
                        new ResStat(ResType.ENERGY, 80)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.ACTION, 84),
                        new ResStat(ResType.ENERGY, 84)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.ACTION, 88),
                        new ResStat(ResType.ENERGY, 88)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.ACTION, 92),
                        new ResStat(ResType.ENERGY, 92)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.ACTION, 96),
                        new ResStat(ResType.ENERGY, 96)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.ACTION, 100),
                        new ResStat(ResType.ENERGY, 100)
                )
        });
        setJobReward(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.MONEY, 200)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.MONEY, 400)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.MONEY, 600)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.MONEY, 800)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.MONEY, 1000)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.MONEY, 1400)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.MONEY, 1800)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.MONEY, 2200)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.MONEY, 2600)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.MONEY, 3000)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.MONEY, 3600)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.MONEY, 4200)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.MONEY, 4800)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.MONEY, 5400)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.MONEY, 6000)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.MONEY, 6800)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.MONEY, 7600)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.MONEY, 8400)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.MONEY, 9200)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.MONEY, 10000)
                )
        });
        setDemand(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.POWER_CONSUMPTION, 9),
                        new ResStat(ResType.JOB, 180),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.POWER_CONSUMPTION, 18),
                        new ResStat(ResType.JOB, 360),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.POWER_CONSUMPTION, 27),
                        new ResStat(ResType.JOB, 540),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.POWER_CONSUMPTION, 36),
                        new ResStat(ResType.JOB, 720),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.POWER_CONSUMPTION, 45),
                        new ResStat(ResType.JOB, 900),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.POWER_CONSUMPTION, 63),
                        new ResStat(ResType.JOB, 1260),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.POWER_CONSUMPTION, 81),
                        new ResStat(ResType.JOB, 1620),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.POWER_CONSUMPTION, 99),
                        new ResStat(ResType.JOB, 1980),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.POWER_CONSUMPTION, 117),
                        new ResStat(ResType.JOB, 2340),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.POWER_CONSUMPTION, 135),
                        new ResStat(ResType.JOB, 2700),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.POWER_CONSUMPTION, 162),
                        new ResStat(ResType.JOB, 3240),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.POWER_CONSUMPTION, 189),
                        new ResStat(ResType.JOB, 3780),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.POWER_CONSUMPTION, 216),
                        new ResStat(ResType.JOB, 4320),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.POWER_CONSUMPTION, 243),
                        new ResStat(ResType.JOB, 4860),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.POWER_CONSUMPTION, 270),
                        new ResStat(ResType.JOB, 5400),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.POWER_CONSUMPTION, 306),
                        new ResStat(ResType.JOB, 6120),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.POWER_CONSUMPTION, 342),
                        new ResStat(ResType.JOB, 6840),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.POWER_CONSUMPTION, 378),
                        new ResStat(ResType.JOB, 7560),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.POWER_CONSUMPTION, 414),
                        new ResStat(ResType.JOB, 8280),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 20
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
