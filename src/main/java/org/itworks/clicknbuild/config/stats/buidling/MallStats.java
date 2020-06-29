package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;
import org.itworks.clicknbuild.engine.model.ResourceType;

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
                        new ResourceChunk(ResourceType.CONSTRUCTION, 300),
                        new ResourceChunk(ResourceType.STEEL, 92),
                        new ResourceChunk(ResourceType.CONCRETE, 153),
                        new ResourceChunk(ResourceType.GLASS, 306),
                        new ResourceChunk(ResourceType.MONEY, 21420)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.CONSTRUCTION, 900),
                        new ResourceChunk(ResourceType.STEEL, 279),
                        new ResourceChunk(ResourceType.CONCRETE, 465),
                        new ResourceChunk(ResourceType.GLASS, 930),
                        new ResourceChunk(ResourceType.MONEY, 65100)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.CONSTRUCTION, 1800),
                        new ResourceChunk(ResourceType.STEEL, 565),
                        new ResourceChunk(ResourceType.CONCRETE, 942),
                        new ResourceChunk(ResourceType.GLASS, 1884),
                        new ResourceChunk(ResourceType.MONEY, 131880)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.CONSTRUCTION, 3000),
                        new ResourceChunk(ResourceType.STEEL, 954),
                        new ResourceChunk(ResourceType.CONCRETE, 1590),
                        new ResourceChunk(ResourceType.GLASS, 3180),
                        new ResourceChunk(ResourceType.MONEY, 222600)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.CONSTRUCTION, 4500),
                        new ResourceChunk(ResourceType.STEEL, 1449),
                        new ResourceChunk(ResourceType.CONCRETE, 2415),
                        new ResourceChunk(ResourceType.GLASS, 4830),
                        new ResourceChunk(ResourceType.MONEY, 338100)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.CONSTRUCTION, 6600),
                        new ResourceChunk(ResourceType.STEEL, 2167),
                        new ResourceChunk(ResourceType.CONCRETE, 3612),
                        new ResourceChunk(ResourceType.GLASS, 7224),
                        new ResourceChunk(ResourceType.MONEY, 505680)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.CONSTRUCTION, 9300),
                        new ResourceChunk(ResourceType.STEEL, 3123),
                        new ResourceChunk(ResourceType.CONCRETE, 5205),
                        new ResourceChunk(ResourceType.GLASS, 10410),
                        new ResourceChunk(ResourceType.MONEY, 728700)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.CONSTRUCTION, 12600),
                        new ResourceChunk(ResourceType.STEEL, 4331),
                        new ResourceChunk(ResourceType.CONCRETE, 7218),
                        new ResourceChunk(ResourceType.GLASS, 14436),
                        new ResourceChunk(ResourceType.MONEY, 1010520)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.CONSTRUCTION, 16500),
                        new ResourceChunk(ResourceType.STEEL, 5805),
                        new ResourceChunk(ResourceType.CONCRETE, 9675),
                        new ResourceChunk(ResourceType.GLASS, 19350),
                        new ResourceChunk(ResourceType.MONEY, 1354500)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.CONSTRUCTION, 21000),
                        new ResourceChunk(ResourceType.STEEL, 7560),
                        new ResourceChunk(ResourceType.CONCRETE, 12600),
                        new ResourceChunk(ResourceType.GLASS, 25200),
                        new ResourceChunk(ResourceType.MONEY, 1764000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.CONSTRUCTION, 26400),
                        new ResourceChunk(ResourceType.STEEL, 9763),
                        new ResourceChunk(ResourceType.CONCRETE, 16272),
                        new ResourceChunk(ResourceType.GLASS, 32544),
                        new ResourceChunk(ResourceType.MONEY, 2278080)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.CONSTRUCTION, 32700),
                        new ResourceChunk(ResourceType.STEEL, 12447),
                        new ResourceChunk(ResourceType.CONCRETE, 20745),
                        new ResourceChunk(ResourceType.GLASS, 41490),
                        new ResourceChunk(ResourceType.MONEY, 2904300)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.CONSTRUCTION, 39900),
                        new ResourceChunk(ResourceType.STEEL, 15644),
                        new ResourceChunk(ResourceType.CONCRETE, 26073),
                        new ResourceChunk(ResourceType.GLASS, 52146),
                        new ResourceChunk(ResourceType.MONEY, 3650220)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.CONSTRUCTION, 48000),
                        new ResourceChunk(ResourceType.STEEL, 19386),
                        new ResourceChunk(ResourceType.CONCRETE, 32310),
                        new ResourceChunk(ResourceType.GLASS, 64620),
                        new ResourceChunk(ResourceType.MONEY, 4523400)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.CONSTRUCTION, 57000),
                        new ResourceChunk(ResourceType.STEEL, 23706),
                        new ResourceChunk(ResourceType.CONCRETE, 39510),
                        new ResourceChunk(ResourceType.GLASS, 79020),
                        new ResourceChunk(ResourceType.MONEY, 5531400)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.CONSTRUCTION, 67200),
                        new ResourceChunk(ResourceType.STEEL, 28847),
                        new ResourceChunk(ResourceType.CONCRETE, 48079),
                        new ResourceChunk(ResourceType.GLASS, 96156),
                        new ResourceChunk(ResourceType.MONEY, 6730920)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.CONSTRUCTION, 78600),
                        new ResourceChunk(ResourceType.STEEL, 34866),
                        new ResourceChunk(ResourceType.CONCRETE, 58110),
                        new ResourceChunk(ResourceType.GLASS, 116220),
                        new ResourceChunk(ResourceType.MONEY, 8135400)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.CONSTRUCTION, 91200),
                        new ResourceChunk(ResourceType.STEEL, 41821),
                        new ResourceChunk(ResourceType.CONCRETE, 69702),
                        new ResourceChunk(ResourceType.GLASS, 139404),
                        new ResourceChunk(ResourceType.MONEY, 9758280)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.CONSTRUCTION, 105000),
                        new ResourceChunk(ResourceType.STEEL, 49770),
                        new ResourceChunk(ResourceType.CONCRETE, 82950),
                        new ResourceChunk(ResourceType.GLASS, 165900),
                        new ResourceChunk(ResourceType.MONEY, 11613000)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.CONSTRUCTION, 120000),
                        new ResourceChunk(ResourceType.STEEL, 58770),
                        new ResourceChunk(ResourceType.CONCRETE, 97950),
                        new ResourceChunk(ResourceType.GLASS, 195900),
                        new ResourceChunk(ResourceType.MONEY, 13713000)
                )
        });
        setProduction(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.MONEY, 120)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.MONEY, 240)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.MONEY, 360)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.MONEY, 480)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.MONEY, 600)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.MONEY, 840)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.MONEY, 1080)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.MONEY, 1320)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.MONEY, 1560)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.MONEY, 1800)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.MONEY, 2160)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.MONEY, 2520)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.MONEY, 2880)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.MONEY, 3240)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.MONEY, 3600)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.MONEY, 4080)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.MONEY, 4560)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.MONEY, 5040)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.MONEY, 5520)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.MONEY, 6000)
                )
        });
        setDemand(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 5),
                        new ResourceChunk(ResourceType.JOB, 100),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 10),
                        new ResourceChunk(ResourceType.JOB, 200),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 15),
                        new ResourceChunk(ResourceType.JOB, 300),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 20),
                        new ResourceChunk(ResourceType.JOB, 400),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 25),
                        new ResourceChunk(ResourceType.JOB, 500),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 35),
                        new ResourceChunk(ResourceType.JOB, 700),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 45),
                        new ResourceChunk(ResourceType.JOB, 900),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 55),
                        new ResourceChunk(ResourceType.JOB, 1100),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 65),
                        new ResourceChunk(ResourceType.JOB, 1300),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 75),
                        new ResourceChunk(ResourceType.JOB, 1500),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 90),
                        new ResourceChunk(ResourceType.JOB, 1800),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 105),
                        new ResourceChunk(ResourceType.JOB, 2100),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 120),
                        new ResourceChunk(ResourceType.JOB, 2400),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 135),
                        new ResourceChunk(ResourceType.JOB, 2700),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 150),
                        new ResourceChunk(ResourceType.JOB, 3000),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 170),
                        new ResourceChunk(ResourceType.JOB, 3400),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 190),
                        new ResourceChunk(ResourceType.JOB, 3800),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 210),
                        new ResourceChunk(ResourceType.JOB, 4200),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 230),
                        new ResourceChunk(ResourceType.JOB, 4600),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 250),
                        new ResourceChunk(ResourceType.JOB, 5000),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                )
        });
        setHold(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.POWER, 5),
                        new ResourceChunk(ResourceType.WORKER, 100)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.POWER, 10),
                        new ResourceChunk(ResourceType.WORKER, 200)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.POWER, 15),
                        new ResourceChunk(ResourceType.WORKER, 300)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.POWER, 20),
                        new ResourceChunk(ResourceType.WORKER, 400)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.POWER, 25),
                        new ResourceChunk(ResourceType.WORKER, 500)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.POWER, 35),
                        new ResourceChunk(ResourceType.WORKER, 700)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.POWER, 45),
                        new ResourceChunk(ResourceType.WORKER, 900)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.POWER, 55),
                        new ResourceChunk(ResourceType.WORKER, 1100)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.POWER, 65),
                        new ResourceChunk(ResourceType.WORKER, 1300)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.POWER, 75),
                        new ResourceChunk(ResourceType.WORKER, 1500)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.POWER, 90),
                        new ResourceChunk(ResourceType.WORKER, 1800)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.POWER, 105),
                        new ResourceChunk(ResourceType.WORKER, 2100)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.POWER, 120),
                        new ResourceChunk(ResourceType.WORKER, 2400)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.POWER, 135),
                        new ResourceChunk(ResourceType.WORKER, 2700)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.POWER, 150),
                        new ResourceChunk(ResourceType.WORKER, 3000)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.POWER, 170),
                        new ResourceChunk(ResourceType.WORKER, 3400)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.POWER, 190),
                        new ResourceChunk(ResourceType.WORKER, 3800)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.POWER, 210),
                        new ResourceChunk(ResourceType.WORKER, 4200)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.POWER, 230),
                        new ResourceChunk(ResourceType.WORKER, 4600)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.POWER, 250),
                        new ResourceChunk(ResourceType.WORKER, 5000)
                )
        });
        setStore(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.MONEY, 15000)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.MONEY, 30000)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.MONEY, 45000)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.MONEY, 60000)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.MONEY, 75000)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.MONEY, 105000)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.MONEY, 135000)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.MONEY, 165000)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.MONEY, 195000)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.MONEY, 225000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.MONEY, 270000)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.MONEY, 315000)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.MONEY, 360000)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.MONEY, 405000)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.MONEY, 450000)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.MONEY, 510000)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.MONEY, 570000)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.MONEY, 630000)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.MONEY, 690000)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.MONEY, 750000)
                )
        });
    }
}
