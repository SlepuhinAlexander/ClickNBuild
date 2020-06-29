package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResStat;
import org.itworks.clicknbuild.engine.model.ResStatPack;
import org.itworks.clicknbuild.engine.model.ResType;

public final class MallStats extends BuildingStats {
    private static volatile MallStats inst;

    private MallStats() {
    }

    public static MallStats inst() {
        MallStats local = inst;
        if (local == null) {
            synchronized (MallStats.class) {
                local = inst;
                if (local == null) {
                    inst = local = new MallStats();
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
        setPriceMultiplier(115);
        setStructure(new int[]{
                300, // 1
                900, // 2
                1800, // 3
                3000, // 4
                4500, // 5
                6600, // 6
                9300, // 7
                12600, // 8
                16500, // 9
                21000, // 10
                26400, // 11
                32700, // 12
                39900, // 13
                48000, // 14
                57000, // 15
                67200, // 16
                78600, // 17
                91200, // 18
                105000, // 19
                120000 // 20
        });
        setBuildCost(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.CONSTRUCTION, 300),
                        new ResStat(ResType.STEEL, 92),
                        new ResStat(ResType.CONCRETE, 153),
                        new ResStat(ResType.GLASS, 306),
                        new ResStat(ResType.MONEY, 21420)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.CONSTRUCTION, 900),
                        new ResStat(ResType.STEEL, 279),
                        new ResStat(ResType.CONCRETE, 465),
                        new ResStat(ResType.GLASS, 930),
                        new ResStat(ResType.MONEY, 65100)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.CONSTRUCTION, 1800),
                        new ResStat(ResType.STEEL, 565),
                        new ResStat(ResType.CONCRETE, 942),
                        new ResStat(ResType.GLASS, 1884),
                        new ResStat(ResType.MONEY, 131880)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.CONSTRUCTION, 3000),
                        new ResStat(ResType.STEEL, 954),
                        new ResStat(ResType.CONCRETE, 1590),
                        new ResStat(ResType.GLASS, 3180),
                        new ResStat(ResType.MONEY, 222600)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.CONSTRUCTION, 4500),
                        new ResStat(ResType.STEEL, 1449),
                        new ResStat(ResType.CONCRETE, 2415),
                        new ResStat(ResType.GLASS, 4830),
                        new ResStat(ResType.MONEY, 338100)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.CONSTRUCTION, 6600),
                        new ResStat(ResType.STEEL, 2167),
                        new ResStat(ResType.CONCRETE, 3612),
                        new ResStat(ResType.GLASS, 7224),
                        new ResStat(ResType.MONEY, 505680)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.CONSTRUCTION, 9300),
                        new ResStat(ResType.STEEL, 3123),
                        new ResStat(ResType.CONCRETE, 5205),
                        new ResStat(ResType.GLASS, 10410),
                        new ResStat(ResType.MONEY, 728700)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.CONSTRUCTION, 12600),
                        new ResStat(ResType.STEEL, 4331),
                        new ResStat(ResType.CONCRETE, 7218),
                        new ResStat(ResType.GLASS, 14436),
                        new ResStat(ResType.MONEY, 1010520)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.CONSTRUCTION, 16500),
                        new ResStat(ResType.STEEL, 5805),
                        new ResStat(ResType.CONCRETE, 9675),
                        new ResStat(ResType.GLASS, 19350),
                        new ResStat(ResType.MONEY, 1354500)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.CONSTRUCTION, 21000),
                        new ResStat(ResType.STEEL, 7560),
                        new ResStat(ResType.CONCRETE, 12600),
                        new ResStat(ResType.GLASS, 25200),
                        new ResStat(ResType.MONEY, 1764000)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.CONSTRUCTION, 26400),
                        new ResStat(ResType.STEEL, 9763),
                        new ResStat(ResType.CONCRETE, 16272),
                        new ResStat(ResType.GLASS, 32544),
                        new ResStat(ResType.MONEY, 2278080)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.CONSTRUCTION, 32700),
                        new ResStat(ResType.STEEL, 12447),
                        new ResStat(ResType.CONCRETE, 20745),
                        new ResStat(ResType.GLASS, 41490),
                        new ResStat(ResType.MONEY, 2904300)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.CONSTRUCTION, 39900),
                        new ResStat(ResType.STEEL, 15644),
                        new ResStat(ResType.CONCRETE, 26073),
                        new ResStat(ResType.GLASS, 52146),
                        new ResStat(ResType.MONEY, 3650220)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.CONSTRUCTION, 48000),
                        new ResStat(ResType.STEEL, 19386),
                        new ResStat(ResType.CONCRETE, 32310),
                        new ResStat(ResType.GLASS, 64620),
                        new ResStat(ResType.MONEY, 4523400)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.CONSTRUCTION, 57000),
                        new ResStat(ResType.STEEL, 23706),
                        new ResStat(ResType.CONCRETE, 39510),
                        new ResStat(ResType.GLASS, 79020),
                        new ResStat(ResType.MONEY, 5531400)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.CONSTRUCTION, 67200),
                        new ResStat(ResType.STEEL, 28847),
                        new ResStat(ResType.CONCRETE, 48079),
                        new ResStat(ResType.GLASS, 96156),
                        new ResStat(ResType.MONEY, 6730920)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.CONSTRUCTION, 78600),
                        new ResStat(ResType.STEEL, 34866),
                        new ResStat(ResType.CONCRETE, 58110),
                        new ResStat(ResType.GLASS, 116220),
                        new ResStat(ResType.MONEY, 8135400)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.CONSTRUCTION, 91200),
                        new ResStat(ResType.STEEL, 41821),
                        new ResStat(ResType.CONCRETE, 69702),
                        new ResStat(ResType.GLASS, 139404),
                        new ResStat(ResType.MONEY, 9758280)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.CONSTRUCTION, 105000),
                        new ResStat(ResType.STEEL, 49770),
                        new ResStat(ResType.CONCRETE, 82950),
                        new ResStat(ResType.GLASS, 165900),
                        new ResStat(ResType.MONEY, 11613000)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.CONSTRUCTION, 120000),
                        new ResStat(ResType.STEEL, 58770),
                        new ResStat(ResType.CONCRETE, 97950),
                        new ResStat(ResType.GLASS, 195900),
                        new ResStat(ResType.MONEY, 13713000)
                )
        });
        setProduction(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.MONEY, 120)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.MONEY, 240)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.MONEY, 360)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.MONEY, 480)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.MONEY, 600)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.MONEY, 840)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.MONEY, 1080)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.MONEY, 1320)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.MONEY, 1560)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.MONEY, 1800)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.MONEY, 2160)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.MONEY, 2520)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.MONEY, 2880)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.MONEY, 3240)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.MONEY, 3600)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.MONEY, 4080)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.MONEY, 4560)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.MONEY, 5040)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.MONEY, 5520)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.MONEY, 6000)
                )
        });
        setDemand(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.POWER_CONSUMPTION, 5),
                        new ResStat(ResType.JOB, 100),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.POWER_CONSUMPTION, 10),
                        new ResStat(ResType.JOB, 200),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.POWER_CONSUMPTION, 15),
                        new ResStat(ResType.JOB, 300),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.POWER_CONSUMPTION, 20),
                        new ResStat(ResType.JOB, 400),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.POWER_CONSUMPTION, 25),
                        new ResStat(ResType.JOB, 500),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.POWER_CONSUMPTION, 35),
                        new ResStat(ResType.JOB, 700),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.POWER_CONSUMPTION, 45),
                        new ResStat(ResType.JOB, 900),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.POWER_CONSUMPTION, 55),
                        new ResStat(ResType.JOB, 1100),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.POWER_CONSUMPTION, 65),
                        new ResStat(ResType.JOB, 1300),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.POWER_CONSUMPTION, 75),
                        new ResStat(ResType.JOB, 1500),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.POWER_CONSUMPTION, 90),
                        new ResStat(ResType.JOB, 1800),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.POWER_CONSUMPTION, 105),
                        new ResStat(ResType.JOB, 2100),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.POWER_CONSUMPTION, 120),
                        new ResStat(ResType.JOB, 2400),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.POWER_CONSUMPTION, 135),
                        new ResStat(ResType.JOB, 2700),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.POWER_CONSUMPTION, 150),
                        new ResStat(ResType.JOB, 3000),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.POWER_CONSUMPTION, 170),
                        new ResStat(ResType.JOB, 3400),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.POWER_CONSUMPTION, 190),
                        new ResStat(ResType.JOB, 3800),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.POWER_CONSUMPTION, 210),
                        new ResStat(ResType.JOB, 4200),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.POWER_CONSUMPTION, 230),
                        new ResStat(ResType.JOB, 4600),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.POWER_CONSUMPTION, 250),
                        new ResStat(ResType.JOB, 5000),
                        new ResStat(ResType.IGNITABILITY, 1)
                )
        });
        setHold(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.POWER, 5),
                        new ResStat(ResType.WORKER, 100)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.POWER, 10),
                        new ResStat(ResType.WORKER, 200)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.POWER, 15),
                        new ResStat(ResType.WORKER, 300)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.POWER, 20),
                        new ResStat(ResType.WORKER, 400)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.POWER, 25),
                        new ResStat(ResType.WORKER, 500)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.POWER, 35),
                        new ResStat(ResType.WORKER, 700)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.POWER, 45),
                        new ResStat(ResType.WORKER, 900)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.POWER, 55),
                        new ResStat(ResType.WORKER, 1100)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.POWER, 65),
                        new ResStat(ResType.WORKER, 1300)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.POWER, 75),
                        new ResStat(ResType.WORKER, 1500)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.POWER, 90),
                        new ResStat(ResType.WORKER, 1800)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.POWER, 105),
                        new ResStat(ResType.WORKER, 2100)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.POWER, 120),
                        new ResStat(ResType.WORKER, 2400)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.POWER, 135),
                        new ResStat(ResType.WORKER, 2700)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.POWER, 150),
                        new ResStat(ResType.WORKER, 3000)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.POWER, 170),
                        new ResStat(ResType.WORKER, 3400)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.POWER, 190),
                        new ResStat(ResType.WORKER, 3800)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.POWER, 210),
                        new ResStat(ResType.WORKER, 4200)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.POWER, 230),
                        new ResStat(ResType.WORKER, 4600)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.POWER, 250),
                        new ResStat(ResType.WORKER, 5000)
                )
        });
        setStore(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.MONEY, 15000)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.MONEY, 30000)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.MONEY, 45000)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.MONEY, 60000)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.MONEY, 75000)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.MONEY, 105000)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.MONEY, 135000)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.MONEY, 165000)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.MONEY, 195000)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.MONEY, 225000)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.MONEY, 270000)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.MONEY, 315000)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.MONEY, 360000)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.MONEY, 405000)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.MONEY, 450000)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.MONEY, 510000)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.MONEY, 570000)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.MONEY, 630000)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.MONEY, 690000)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.MONEY, 750000)
                )
        });
    }
}
