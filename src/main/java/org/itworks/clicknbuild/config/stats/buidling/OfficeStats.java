package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;
import org.itworks.clicknbuild.engine.model.ResourceType;

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
                        new ResourceChunk(ResourceType.CONSTRUCTION, 500),
                        new ResourceChunk(ResourceType.STEEL, 163),
                        new ResourceChunk(ResourceType.CONCRETE, 245),
                        new ResourceChunk(ResourceType.WOOD, 61),
                        new ResourceChunk(ResourceType.GLASS, 1020),
                        new ResourceChunk(ResourceType.MONEY, 35700)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.CONSTRUCTION, 1500),
                        new ResourceChunk(ResourceType.STEEL, 496),
                        new ResourceChunk(ResourceType.CONCRETE, 744),
                        new ResourceChunk(ResourceType.WOOD, 186),
                        new ResourceChunk(ResourceType.GLASS, 3100),
                        new ResourceChunk(ResourceType.MONEY, 108500)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.CONSTRUCTION, 3000),
                        new ResourceChunk(ResourceType.STEEL, 1005),
                        new ResourceChunk(ResourceType.CONCRETE, 1507),
                        new ResourceChunk(ResourceType.WOOD, 377),
                        new ResourceChunk(ResourceType.GLASS, 6280),
                        new ResourceChunk(ResourceType.MONEY, 219800)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.CONSTRUCTION, 5000),
                        new ResourceChunk(ResourceType.STEEL, 1696),
                        new ResourceChunk(ResourceType.CONCRETE, 2544),
                        new ResourceChunk(ResourceType.WOOD, 636),
                        new ResourceChunk(ResourceType.GLASS, 10600),
                        new ResourceChunk(ResourceType.MONEY, 371000)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.CONSTRUCTION, 7500),
                        new ResourceChunk(ResourceType.STEEL, 2576),
                        new ResourceChunk(ResourceType.CONCRETE, 3864),
                        new ResourceChunk(ResourceType.WOOD, 966),
                        new ResourceChunk(ResourceType.GLASS, 16100),
                        new ResourceChunk(ResourceType.MONEY, 563500)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.CONSTRUCTION, 11000),
                        new ResourceChunk(ResourceType.STEEL, 3853),
                        new ResourceChunk(ResourceType.CONCRETE, 5779),
                        new ResourceChunk(ResourceType.WOOD, 1445),
                        new ResourceChunk(ResourceType.GLASS, 24080),
                        new ResourceChunk(ResourceType.MONEY, 842000)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.CONSTRUCTION, 15500),
                        new ResourceChunk(ResourceType.STEEL, 5552),
                        new ResourceChunk(ResourceType.CONCRETE, 8328),
                        new ResourceChunk(ResourceType.WOOD, 2082),
                        new ResourceChunk(ResourceType.GLASS, 34700),
                        new ResourceChunk(ResourceType.MONEY, 1214500)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.CONSTRUCTION, 21000),
                        new ResourceChunk(ResourceType.STEEL, 7699),
                        new ResourceChunk(ResourceType.CONCRETE, 11549),
                        new ResourceChunk(ResourceType.WOOD, 2887),
                        new ResourceChunk(ResourceType.GLASS, 48120),
                        new ResourceChunk(ResourceType.MONEY, 1684200)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.CONSTRUCTION, 27500),
                        new ResourceChunk(ResourceType.STEEL, 10320),
                        new ResourceChunk(ResourceType.CONCRETE, 15480),
                        new ResourceChunk(ResourceType.WOOD, 3870),
                        new ResourceChunk(ResourceType.GLASS, 64500),
                        new ResourceChunk(ResourceType.MONEY, 2257500)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.CONSTRUCTION, 35000),
                        new ResourceChunk(ResourceType.STEEL, 13440),
                        new ResourceChunk(ResourceType.CONCRETE, 20160),
                        new ResourceChunk(ResourceType.WOOD, 5040),
                        new ResourceChunk(ResourceType.GLASS, 84000),
                        new ResourceChunk(ResourceType.MONEY, 2940000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.CONSTRUCTION, 44000),
                        new ResourceChunk(ResourceType.STEEL, 17357),
                        new ResourceChunk(ResourceType.CONCRETE, 26036),
                        new ResourceChunk(ResourceType.WOOD, 6509),
                        new ResourceChunk(ResourceType.GLASS, 108480),
                        new ResourceChunk(ResourceType.MONEY, 3796800)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.CONSTRUCTION, 54500),
                        new ResourceChunk(ResourceType.STEEL, 22128),
                        new ResourceChunk(ResourceType.CONCRETE, 33192),
                        new ResourceChunk(ResourceType.WOOD, 8298),
                        new ResourceChunk(ResourceType.GLASS, 138300),
                        new ResourceChunk(ResourceType.MONEY, 4840500)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.CONSTRUCTION, 66500),
                        new ResourceChunk(ResourceType.STEEL, 27811),
                        new ResourceChunk(ResourceType.CONCRETE, 41717),
                        new ResourceChunk(ResourceType.WOOD, 10249),
                        new ResourceChunk(ResourceType.GLASS, 173820),
                        new ResourceChunk(ResourceType.MONEY, 6083700)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.CONSTRUCTION, 80000),
                        new ResourceChunk(ResourceType.STEEL, 34464),
                        new ResourceChunk(ResourceType.CONCRETE, 51696),
                        new ResourceChunk(ResourceType.WOOD, 12924),
                        new ResourceChunk(ResourceType.GLASS, 215400),
                        new ResourceChunk(ResourceType.MONEY, 7539000)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.CONSTRUCTION, 95000),
                        new ResourceChunk(ResourceType.STEEL, 42144),
                        new ResourceChunk(ResourceType.CONCRETE, 63216),
                        new ResourceChunk(ResourceType.WOOD, 15804),
                        new ResourceChunk(ResourceType.GLASS, 263400),
                        new ResourceChunk(ResourceType.MONEY, 9219000)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.CONSTRUCTION, 112000),
                        new ResourceChunk(ResourceType.STEEL, 51283),
                        new ResourceChunk(ResourceType.CONCRETE, 76925),
                        new ResourceChunk(ResourceType.WOOD, 19231),
                        new ResourceChunk(ResourceType.GLASS, 320520),
                        new ResourceChunk(ResourceType.MONEY, 11218200)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.CONSTRUCTION, 131000),
                        new ResourceChunk(ResourceType.STEEL, 61984),
                        new ResourceChunk(ResourceType.CONCRETE, 92976),
                        new ResourceChunk(ResourceType.WOOD, 23244),
                        new ResourceChunk(ResourceType.GLASS, 387400),
                        new ResourceChunk(ResourceType.MONEY, 13559000)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.CONSTRUCTION, 152000),
                        new ResourceChunk(ResourceType.STEEL, 74349),
                        new ResourceChunk(ResourceType.CONCRETE, 111523),
                        new ResourceChunk(ResourceType.WOOD, 27881),
                        new ResourceChunk(ResourceType.GLASS, 464680),
                        new ResourceChunk(ResourceType.MONEY, 16263800)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.CONSTRUCTION, 175000),
                        new ResourceChunk(ResourceType.STEEL, 88480),
                        new ResourceChunk(ResourceType.CONCRETE, 132720),
                        new ResourceChunk(ResourceType.WOOD, 33180),
                        new ResourceChunk(ResourceType.GLASS, 553000),
                        new ResourceChunk(ResourceType.MONEY, 19355000)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.CONSTRUCTION, 20000),
                        new ResourceChunk(ResourceType.STEEL, 104480),
                        new ResourceChunk(ResourceType.CONCRETE, 156720),
                        new ResourceChunk(ResourceType.WOOD, 39180),
                        new ResourceChunk(ResourceType.GLASS, 653000),
                        new ResourceChunk(ResourceType.MONEY, 22855000)
                )
        });
        setProduction(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.MONEY, 200)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.MONEY, 400)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.MONEY, 600)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.MONEY, 800)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.MONEY, 1000)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.MONEY, 1400)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.MONEY, 1800)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.MONEY, 2200)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.MONEY, 2600)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.MONEY, 3000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.MONEY, 3600)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.MONEY, 4200)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.MONEY, 4800)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.MONEY, 5400)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.MONEY, 6000)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.MONEY, 6800)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.MONEY, 7600)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.MONEY, 8400)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.MONEY, 9200)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.MONEY, 10000)
                )
        });
        setJobPrice(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.ACTION, 24),
                        new ResourceChunk(ResourceType.ENERGY, 24)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.ACTION, 28),
                        new ResourceChunk(ResourceType.ENERGY, 28)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.ACTION, 32),
                        new ResourceChunk(ResourceType.ENERGY, 32)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.ACTION, 36),
                        new ResourceChunk(ResourceType.ENERGY, 36)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.ACTION, 40),
                        new ResourceChunk(ResourceType.ENERGY, 40)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.ACTION, 44),
                        new ResourceChunk(ResourceType.ENERGY, 44)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.ACTION, 48),
                        new ResourceChunk(ResourceType.ENERGY, 48)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.ACTION, 52),
                        new ResourceChunk(ResourceType.ENERGY, 52)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.ACTION, 56),
                        new ResourceChunk(ResourceType.ENERGY, 56)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.ACTION, 60),
                        new ResourceChunk(ResourceType.ENERGY, 60)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.ACTION, 64),
                        new ResourceChunk(ResourceType.ENERGY, 64)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.ACTION, 68),
                        new ResourceChunk(ResourceType.ENERGY, 68)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.ACTION, 72),
                        new ResourceChunk(ResourceType.ENERGY, 72)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.ACTION, 76),
                        new ResourceChunk(ResourceType.ENERGY, 76)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.ACTION, 80),
                        new ResourceChunk(ResourceType.ENERGY, 80)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.ACTION, 84),
                        new ResourceChunk(ResourceType.ENERGY, 84)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.ACTION, 88),
                        new ResourceChunk(ResourceType.ENERGY, 88)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.ACTION, 92),
                        new ResourceChunk(ResourceType.ENERGY, 92)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.ACTION, 96),
                        new ResourceChunk(ResourceType.ENERGY, 96)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.ACTION, 100),
                        new ResourceChunk(ResourceType.ENERGY, 100)
                )
        });
        setJobReward(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.MONEY, 200)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.MONEY, 400)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.MONEY, 600)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.MONEY, 800)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.MONEY, 1000)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.MONEY, 1400)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.MONEY, 1800)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.MONEY, 2200)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.MONEY, 2600)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.MONEY, 3000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.MONEY, 3600)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.MONEY, 4200)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.MONEY, 4800)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.MONEY, 5400)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.MONEY, 6000)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.MONEY, 6800)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.MONEY, 7600)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.MONEY, 8400)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.MONEY, 9200)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.MONEY, 10000)
                )
        });
        setDemand(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 9),
                        new ResourceChunk(ResourceType.JOB, 180),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 18),
                        new ResourceChunk(ResourceType.JOB, 360),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 27),
                        new ResourceChunk(ResourceType.JOB, 540),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 36),
                        new ResourceChunk(ResourceType.JOB, 720),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 45),
                        new ResourceChunk(ResourceType.JOB, 900),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 63),
                        new ResourceChunk(ResourceType.JOB, 1260),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 81),
                        new ResourceChunk(ResourceType.JOB, 1620),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 99),
                        new ResourceChunk(ResourceType.JOB, 1980),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 117),
                        new ResourceChunk(ResourceType.JOB, 2340),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 135),
                        new ResourceChunk(ResourceType.JOB, 2700),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 162),
                        new ResourceChunk(ResourceType.JOB, 3240),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 189),
                        new ResourceChunk(ResourceType.JOB, 3780),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 216),
                        new ResourceChunk(ResourceType.JOB, 4320),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 243),
                        new ResourceChunk(ResourceType.JOB, 4860),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 270),
                        new ResourceChunk(ResourceType.JOB, 5400),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 306),
                        new ResourceChunk(ResourceType.JOB, 6120),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 342),
                        new ResourceChunk(ResourceType.JOB, 6840),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 378),
                        new ResourceChunk(ResourceType.JOB, 7560),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 414),
                        new ResourceChunk(ResourceType.JOB, 8280),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 20
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
