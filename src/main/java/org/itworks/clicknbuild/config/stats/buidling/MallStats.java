package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;
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
        setBuildCost(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.CONSTRUCTION, 300),
                        new ResourceChunk(ResType.STEEL, 92),
                        new ResourceChunk(ResType.CONCRETE, 153),
                        new ResourceChunk(ResType.GLASS, 306),
                        new ResourceChunk(ResType.MONEY, 21420)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.CONSTRUCTION, 900),
                        new ResourceChunk(ResType.STEEL, 279),
                        new ResourceChunk(ResType.CONCRETE, 465),
                        new ResourceChunk(ResType.GLASS, 930),
                        new ResourceChunk(ResType.MONEY, 65100)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.CONSTRUCTION, 1800),
                        new ResourceChunk(ResType.STEEL, 565),
                        new ResourceChunk(ResType.CONCRETE, 942),
                        new ResourceChunk(ResType.GLASS, 1884),
                        new ResourceChunk(ResType.MONEY, 131880)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.CONSTRUCTION, 3000),
                        new ResourceChunk(ResType.STEEL, 954),
                        new ResourceChunk(ResType.CONCRETE, 1590),
                        new ResourceChunk(ResType.GLASS, 3180),
                        new ResourceChunk(ResType.MONEY, 222600)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.CONSTRUCTION, 4500),
                        new ResourceChunk(ResType.STEEL, 1449),
                        new ResourceChunk(ResType.CONCRETE, 2415),
                        new ResourceChunk(ResType.GLASS, 4830),
                        new ResourceChunk(ResType.MONEY, 338100)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.CONSTRUCTION, 6600),
                        new ResourceChunk(ResType.STEEL, 2167),
                        new ResourceChunk(ResType.CONCRETE, 3612),
                        new ResourceChunk(ResType.GLASS, 7224),
                        new ResourceChunk(ResType.MONEY, 505680)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.CONSTRUCTION, 9300),
                        new ResourceChunk(ResType.STEEL, 3123),
                        new ResourceChunk(ResType.CONCRETE, 5205),
                        new ResourceChunk(ResType.GLASS, 10410),
                        new ResourceChunk(ResType.MONEY, 728700)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.CONSTRUCTION, 12600),
                        new ResourceChunk(ResType.STEEL, 4331),
                        new ResourceChunk(ResType.CONCRETE, 7218),
                        new ResourceChunk(ResType.GLASS, 14436),
                        new ResourceChunk(ResType.MONEY, 1010520)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.CONSTRUCTION, 16500),
                        new ResourceChunk(ResType.STEEL, 5805),
                        new ResourceChunk(ResType.CONCRETE, 9675),
                        new ResourceChunk(ResType.GLASS, 19350),
                        new ResourceChunk(ResType.MONEY, 1354500)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.CONSTRUCTION, 21000),
                        new ResourceChunk(ResType.STEEL, 7560),
                        new ResourceChunk(ResType.CONCRETE, 12600),
                        new ResourceChunk(ResType.GLASS, 25200),
                        new ResourceChunk(ResType.MONEY, 1764000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.CONSTRUCTION, 26400),
                        new ResourceChunk(ResType.STEEL, 9763),
                        new ResourceChunk(ResType.CONCRETE, 16272),
                        new ResourceChunk(ResType.GLASS, 32544),
                        new ResourceChunk(ResType.MONEY, 2278080)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.CONSTRUCTION, 32700),
                        new ResourceChunk(ResType.STEEL, 12447),
                        new ResourceChunk(ResType.CONCRETE, 20745),
                        new ResourceChunk(ResType.GLASS, 41490),
                        new ResourceChunk(ResType.MONEY, 2904300)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.CONSTRUCTION, 39900),
                        new ResourceChunk(ResType.STEEL, 15644),
                        new ResourceChunk(ResType.CONCRETE, 26073),
                        new ResourceChunk(ResType.GLASS, 52146),
                        new ResourceChunk(ResType.MONEY, 3650220)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.CONSTRUCTION, 48000),
                        new ResourceChunk(ResType.STEEL, 19386),
                        new ResourceChunk(ResType.CONCRETE, 32310),
                        new ResourceChunk(ResType.GLASS, 64620),
                        new ResourceChunk(ResType.MONEY, 4523400)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.CONSTRUCTION, 57000),
                        new ResourceChunk(ResType.STEEL, 23706),
                        new ResourceChunk(ResType.CONCRETE, 39510),
                        new ResourceChunk(ResType.GLASS, 79020),
                        new ResourceChunk(ResType.MONEY, 5531400)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.CONSTRUCTION, 67200),
                        new ResourceChunk(ResType.STEEL, 28847),
                        new ResourceChunk(ResType.CONCRETE, 48079),
                        new ResourceChunk(ResType.GLASS, 96156),
                        new ResourceChunk(ResType.MONEY, 6730920)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.CONSTRUCTION, 78600),
                        new ResourceChunk(ResType.STEEL, 34866),
                        new ResourceChunk(ResType.CONCRETE, 58110),
                        new ResourceChunk(ResType.GLASS, 116220),
                        new ResourceChunk(ResType.MONEY, 8135400)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.CONSTRUCTION, 91200),
                        new ResourceChunk(ResType.STEEL, 41821),
                        new ResourceChunk(ResType.CONCRETE, 69702),
                        new ResourceChunk(ResType.GLASS, 139404),
                        new ResourceChunk(ResType.MONEY, 9758280)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.CONSTRUCTION, 105000),
                        new ResourceChunk(ResType.STEEL, 49770),
                        new ResourceChunk(ResType.CONCRETE, 82950),
                        new ResourceChunk(ResType.GLASS, 165900),
                        new ResourceChunk(ResType.MONEY, 11613000)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.CONSTRUCTION, 120000),
                        new ResourceChunk(ResType.STEEL, 58770),
                        new ResourceChunk(ResType.CONCRETE, 97950),
                        new ResourceChunk(ResType.GLASS, 195900),
                        new ResourceChunk(ResType.MONEY, 13713000)
                )
        });
        setProduction(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.MONEY, 120)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.MONEY, 240)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.MONEY, 360)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.MONEY, 480)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.MONEY, 600)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.MONEY, 840)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.MONEY, 1080)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.MONEY, 1320)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.MONEY, 1560)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.MONEY, 1800)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.MONEY, 2160)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.MONEY, 2520)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.MONEY, 2880)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.MONEY, 3240)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.MONEY, 3600)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.MONEY, 4080)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.MONEY, 4560)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.MONEY, 5040)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.MONEY, 5520)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.MONEY, 6000)
                )
        });
        setDemand(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 5),
                        new ResourceChunk(ResType.JOB, 100),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 10),
                        new ResourceChunk(ResType.JOB, 200),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 15),
                        new ResourceChunk(ResType.JOB, 300),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 20),
                        new ResourceChunk(ResType.JOB, 400),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 25),
                        new ResourceChunk(ResType.JOB, 500),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 35),
                        new ResourceChunk(ResType.JOB, 700),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 45),
                        new ResourceChunk(ResType.JOB, 900),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 55),
                        new ResourceChunk(ResType.JOB, 1100),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 65),
                        new ResourceChunk(ResType.JOB, 1300),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 75),
                        new ResourceChunk(ResType.JOB, 1500),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 90),
                        new ResourceChunk(ResType.JOB, 1800),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 105),
                        new ResourceChunk(ResType.JOB, 2100),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 120),
                        new ResourceChunk(ResType.JOB, 2400),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 135),
                        new ResourceChunk(ResType.JOB, 2700),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 150),
                        new ResourceChunk(ResType.JOB, 3000),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 170),
                        new ResourceChunk(ResType.JOB, 3400),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 190),
                        new ResourceChunk(ResType.JOB, 3800),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 210),
                        new ResourceChunk(ResType.JOB, 4200),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 230),
                        new ResourceChunk(ResType.JOB, 4600),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 250),
                        new ResourceChunk(ResType.JOB, 5000),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                )
        });
        setHold(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.POWER, 5),
                        new ResourceChunk(ResType.WORKER, 100)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.POWER, 10),
                        new ResourceChunk(ResType.WORKER, 200)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.POWER, 15),
                        new ResourceChunk(ResType.WORKER, 300)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.POWER, 20),
                        new ResourceChunk(ResType.WORKER, 400)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.POWER, 25),
                        new ResourceChunk(ResType.WORKER, 500)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.POWER, 35),
                        new ResourceChunk(ResType.WORKER, 700)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.POWER, 45),
                        new ResourceChunk(ResType.WORKER, 900)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.POWER, 55),
                        new ResourceChunk(ResType.WORKER, 1100)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.POWER, 65),
                        new ResourceChunk(ResType.WORKER, 1300)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.POWER, 75),
                        new ResourceChunk(ResType.WORKER, 1500)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.POWER, 90),
                        new ResourceChunk(ResType.WORKER, 1800)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.POWER, 105),
                        new ResourceChunk(ResType.WORKER, 2100)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.POWER, 120),
                        new ResourceChunk(ResType.WORKER, 2400)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.POWER, 135),
                        new ResourceChunk(ResType.WORKER, 2700)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.POWER, 150),
                        new ResourceChunk(ResType.WORKER, 3000)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.POWER, 170),
                        new ResourceChunk(ResType.WORKER, 3400)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.POWER, 190),
                        new ResourceChunk(ResType.WORKER, 3800)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.POWER, 210),
                        new ResourceChunk(ResType.WORKER, 4200)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.POWER, 230),
                        new ResourceChunk(ResType.WORKER, 4600)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.POWER, 250),
                        new ResourceChunk(ResType.WORKER, 5000)
                )
        });
        setStore(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.MONEY, 15000)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.MONEY, 30000)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.MONEY, 45000)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.MONEY, 60000)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.MONEY, 75000)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.MONEY, 105000)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.MONEY, 135000)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.MONEY, 165000)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.MONEY, 195000)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.MONEY, 225000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.MONEY, 270000)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.MONEY, 315000)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.MONEY, 360000)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.MONEY, 405000)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.MONEY, 450000)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.MONEY, 510000)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.MONEY, 570000)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.MONEY, 630000)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.MONEY, 690000)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.MONEY, 750000)
                )
        });
    }
}
