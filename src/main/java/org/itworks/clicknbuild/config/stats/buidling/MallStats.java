package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResChunk;
import org.itworks.clicknbuild.engine.model.ResPack;
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
        setBuildCost(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.CONSTRUCTION, 300),
                        new ResChunk(ResType.STEEL, 92),
                        new ResChunk(ResType.CONCRETE, 153),
                        new ResChunk(ResType.GLASS, 306),
                        new ResChunk(ResType.MONEY, 21420)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.CONSTRUCTION, 900),
                        new ResChunk(ResType.STEEL, 279),
                        new ResChunk(ResType.CONCRETE, 465),
                        new ResChunk(ResType.GLASS, 930),
                        new ResChunk(ResType.MONEY, 65100)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.CONSTRUCTION, 1800),
                        new ResChunk(ResType.STEEL, 565),
                        new ResChunk(ResType.CONCRETE, 942),
                        new ResChunk(ResType.GLASS, 1884),
                        new ResChunk(ResType.MONEY, 131880)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.CONSTRUCTION, 3000),
                        new ResChunk(ResType.STEEL, 954),
                        new ResChunk(ResType.CONCRETE, 1590),
                        new ResChunk(ResType.GLASS, 3180),
                        new ResChunk(ResType.MONEY, 222600)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.CONSTRUCTION, 4500),
                        new ResChunk(ResType.STEEL, 1449),
                        new ResChunk(ResType.CONCRETE, 2415),
                        new ResChunk(ResType.GLASS, 4830),
                        new ResChunk(ResType.MONEY, 338100)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.CONSTRUCTION, 6600),
                        new ResChunk(ResType.STEEL, 2167),
                        new ResChunk(ResType.CONCRETE, 3612),
                        new ResChunk(ResType.GLASS, 7224),
                        new ResChunk(ResType.MONEY, 505680)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.CONSTRUCTION, 9300),
                        new ResChunk(ResType.STEEL, 3123),
                        new ResChunk(ResType.CONCRETE, 5205),
                        new ResChunk(ResType.GLASS, 10410),
                        new ResChunk(ResType.MONEY, 728700)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.CONSTRUCTION, 12600),
                        new ResChunk(ResType.STEEL, 4331),
                        new ResChunk(ResType.CONCRETE, 7218),
                        new ResChunk(ResType.GLASS, 14436),
                        new ResChunk(ResType.MONEY, 1010520)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.CONSTRUCTION, 16500),
                        new ResChunk(ResType.STEEL, 5805),
                        new ResChunk(ResType.CONCRETE, 9675),
                        new ResChunk(ResType.GLASS, 19350),
                        new ResChunk(ResType.MONEY, 1354500)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.CONSTRUCTION, 21000),
                        new ResChunk(ResType.STEEL, 7560),
                        new ResChunk(ResType.CONCRETE, 12600),
                        new ResChunk(ResType.GLASS, 25200),
                        new ResChunk(ResType.MONEY, 1764000)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.CONSTRUCTION, 26400),
                        new ResChunk(ResType.STEEL, 9763),
                        new ResChunk(ResType.CONCRETE, 16272),
                        new ResChunk(ResType.GLASS, 32544),
                        new ResChunk(ResType.MONEY, 2278080)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.CONSTRUCTION, 32700),
                        new ResChunk(ResType.STEEL, 12447),
                        new ResChunk(ResType.CONCRETE, 20745),
                        new ResChunk(ResType.GLASS, 41490),
                        new ResChunk(ResType.MONEY, 2904300)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.CONSTRUCTION, 39900),
                        new ResChunk(ResType.STEEL, 15644),
                        new ResChunk(ResType.CONCRETE, 26073),
                        new ResChunk(ResType.GLASS, 52146),
                        new ResChunk(ResType.MONEY, 3650220)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.CONSTRUCTION, 48000),
                        new ResChunk(ResType.STEEL, 19386),
                        new ResChunk(ResType.CONCRETE, 32310),
                        new ResChunk(ResType.GLASS, 64620),
                        new ResChunk(ResType.MONEY, 4523400)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.CONSTRUCTION, 57000),
                        new ResChunk(ResType.STEEL, 23706),
                        new ResChunk(ResType.CONCRETE, 39510),
                        new ResChunk(ResType.GLASS, 79020),
                        new ResChunk(ResType.MONEY, 5531400)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.CONSTRUCTION, 67200),
                        new ResChunk(ResType.STEEL, 28847),
                        new ResChunk(ResType.CONCRETE, 48079),
                        new ResChunk(ResType.GLASS, 96156),
                        new ResChunk(ResType.MONEY, 6730920)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.CONSTRUCTION, 78600),
                        new ResChunk(ResType.STEEL, 34866),
                        new ResChunk(ResType.CONCRETE, 58110),
                        new ResChunk(ResType.GLASS, 116220),
                        new ResChunk(ResType.MONEY, 8135400)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.CONSTRUCTION, 91200),
                        new ResChunk(ResType.STEEL, 41821),
                        new ResChunk(ResType.CONCRETE, 69702),
                        new ResChunk(ResType.GLASS, 139404),
                        new ResChunk(ResType.MONEY, 9758280)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.CONSTRUCTION, 105000),
                        new ResChunk(ResType.STEEL, 49770),
                        new ResChunk(ResType.CONCRETE, 82950),
                        new ResChunk(ResType.GLASS, 165900),
                        new ResChunk(ResType.MONEY, 11613000)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.CONSTRUCTION, 120000),
                        new ResChunk(ResType.STEEL, 58770),
                        new ResChunk(ResType.CONCRETE, 97950),
                        new ResChunk(ResType.GLASS, 195900),
                        new ResChunk(ResType.MONEY, 13713000)
                )
        });
        setProduction(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.MONEY, 120)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.MONEY, 240)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.MONEY, 360)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.MONEY, 480)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.MONEY, 600)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.MONEY, 840)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.MONEY, 1080)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.MONEY, 1320)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.MONEY, 1560)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.MONEY, 1800)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.MONEY, 2160)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.MONEY, 2520)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.MONEY, 2880)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.MONEY, 3240)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.MONEY, 3600)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.MONEY, 4080)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.MONEY, 4560)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.MONEY, 5040)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.MONEY, 5520)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.MONEY, 6000)
                )
        });
        setDemand(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.POWER_CONSUMPTION, 5),
                        new ResChunk(ResType.JOB, 100),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.POWER_CONSUMPTION, 10),
                        new ResChunk(ResType.JOB, 200),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.POWER_CONSUMPTION, 15),
                        new ResChunk(ResType.JOB, 300),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.POWER_CONSUMPTION, 20),
                        new ResChunk(ResType.JOB, 400),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.POWER_CONSUMPTION, 25),
                        new ResChunk(ResType.JOB, 500),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.POWER_CONSUMPTION, 35),
                        new ResChunk(ResType.JOB, 700),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.POWER_CONSUMPTION, 45),
                        new ResChunk(ResType.JOB, 900),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.POWER_CONSUMPTION, 55),
                        new ResChunk(ResType.JOB, 1100),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.POWER_CONSUMPTION, 65),
                        new ResChunk(ResType.JOB, 1300),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.POWER_CONSUMPTION, 75),
                        new ResChunk(ResType.JOB, 1500),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.POWER_CONSUMPTION, 90),
                        new ResChunk(ResType.JOB, 1800),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.POWER_CONSUMPTION, 105),
                        new ResChunk(ResType.JOB, 2100),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.POWER_CONSUMPTION, 120),
                        new ResChunk(ResType.JOB, 2400),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.POWER_CONSUMPTION, 135),
                        new ResChunk(ResType.JOB, 2700),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.POWER_CONSUMPTION, 150),
                        new ResChunk(ResType.JOB, 3000),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.POWER_CONSUMPTION, 170),
                        new ResChunk(ResType.JOB, 3400),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.POWER_CONSUMPTION, 190),
                        new ResChunk(ResType.JOB, 3800),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.POWER_CONSUMPTION, 210),
                        new ResChunk(ResType.JOB, 4200),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.POWER_CONSUMPTION, 230),
                        new ResChunk(ResType.JOB, 4600),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.POWER_CONSUMPTION, 250),
                        new ResChunk(ResType.JOB, 5000),
                        new ResChunk(ResType.IGNITABILITY, 1)
                )
        });
        setHold(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.POWER, 5),
                        new ResChunk(ResType.WORKER, 100)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.POWER, 10),
                        new ResChunk(ResType.WORKER, 200)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.POWER, 15),
                        new ResChunk(ResType.WORKER, 300)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.POWER, 20),
                        new ResChunk(ResType.WORKER, 400)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.POWER, 25),
                        new ResChunk(ResType.WORKER, 500)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.POWER, 35),
                        new ResChunk(ResType.WORKER, 700)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.POWER, 45),
                        new ResChunk(ResType.WORKER, 900)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.POWER, 55),
                        new ResChunk(ResType.WORKER, 1100)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.POWER, 65),
                        new ResChunk(ResType.WORKER, 1300)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.POWER, 75),
                        new ResChunk(ResType.WORKER, 1500)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.POWER, 90),
                        new ResChunk(ResType.WORKER, 1800)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.POWER, 105),
                        new ResChunk(ResType.WORKER, 2100)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.POWER, 120),
                        new ResChunk(ResType.WORKER, 2400)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.POWER, 135),
                        new ResChunk(ResType.WORKER, 2700)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.POWER, 150),
                        new ResChunk(ResType.WORKER, 3000)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.POWER, 170),
                        new ResChunk(ResType.WORKER, 3400)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.POWER, 190),
                        new ResChunk(ResType.WORKER, 3800)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.POWER, 210),
                        new ResChunk(ResType.WORKER, 4200)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.POWER, 230),
                        new ResChunk(ResType.WORKER, 4600)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.POWER, 250),
                        new ResChunk(ResType.WORKER, 5000)
                )
        });
        setStore(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.MONEY, 15000)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.MONEY, 30000)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.MONEY, 45000)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.MONEY, 60000)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.MONEY, 75000)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.MONEY, 105000)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.MONEY, 135000)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.MONEY, 165000)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.MONEY, 195000)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.MONEY, 225000)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.MONEY, 270000)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.MONEY, 315000)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.MONEY, 360000)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.MONEY, 405000)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.MONEY, 450000)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.MONEY, 510000)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.MONEY, 570000)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.MONEY, 630000)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.MONEY, 690000)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.MONEY, 750000)
                )
        });
    }
}
