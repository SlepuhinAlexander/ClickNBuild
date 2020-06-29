package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResChunk;
import org.itworks.clicknbuild.engine.model.ResPack;
import org.itworks.clicknbuild.engine.model.ResType;

public final class NuclearPlantStats extends BuildingStats {
    private static volatile NuclearPlantStats inst;

    private NuclearPlantStats() {
    }

    public static NuclearPlantStats inst() {
        NuclearPlantStats local = inst;
        if (local == null) {
            synchronized (NuclearPlantStats.class) {
                local = inst;
                if (local == null) {
                    inst = local = new NuclearPlantStats();
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
                1000, // 1
                3000, // 2
                6000, // 3
                10000, // 4
                15000, // 5
                22000, // 6
                31000, // 7
                42000, // 8
                55000, // 9
                70000, // 10
                88000, // 11
                109000, // 12
                133000, // 13
                160000, // 14
                190000, // 15
                224000, // 16
                262000, // 17
                304000, // 18
                350000, // 19
                400000 // 20
        });
        setBuildCost(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.CONSTRUCTION, 1000),
                        new ResChunk(ResType.STEEL, 408),
                        new ResChunk(ResType.CONCRETE, 2040),
                        new ResChunk(ResType.BRICK, 1020),
                        new ResChunk(ResType.GLASS, 102),
                        new ResChunk(ResType.MONEY, 61200)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.CONSTRUCTION, 3000),
                        new ResChunk(ResType.STEEL, 1240),
                        new ResChunk(ResType.CONCRETE, 6200),
                        new ResChunk(ResType.BRICK, 3100),
                        new ResChunk(ResType.GLASS, 310),
                        new ResChunk(ResType.MONEY, 186000)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.CONSTRUCTION, 6000),
                        new ResChunk(ResType.STEEL, 2512),
                        new ResChunk(ResType.CONCRETE, 12560),
                        new ResChunk(ResType.BRICK, 6280),
                        new ResChunk(ResType.GLASS, 628),
                        new ResChunk(ResType.MONEY, 376800)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.CONSTRUCTION, 10000),
                        new ResChunk(ResType.STEEL, 4240),
                        new ResChunk(ResType.CONCRETE, 21200),
                        new ResChunk(ResType.BRICK, 10600),
                        new ResChunk(ResType.GLASS, 1060),
                        new ResChunk(ResType.MONEY, 636000)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.CONSTRUCTION, 15000),
                        new ResChunk(ResType.STEEL, 6440),
                        new ResChunk(ResType.CONCRETE, 32200),
                        new ResChunk(ResType.BRICK, 16100),
                        new ResChunk(ResType.GLASS, 1610),
                        new ResChunk(ResType.MONEY, 966000)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.CONSTRUCTION, 22000),
                        new ResChunk(ResType.STEEL, 9632),
                        new ResChunk(ResType.CONCRETE, 48160),
                        new ResChunk(ResType.BRICK, 24080),
                        new ResChunk(ResType.GLASS, 2408),
                        new ResChunk(ResType.MONEY, 1444800)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.CONSTRUCTION, 31000),
                        new ResChunk(ResType.STEEL, 13880),
                        new ResChunk(ResType.CONCRETE, 69400),
                        new ResChunk(ResType.BRICK, 34700),
                        new ResChunk(ResType.GLASS, 3470),
                        new ResChunk(ResType.MONEY, 2082000)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.CONSTRUCTION, 42000),
                        new ResChunk(ResType.STEEL, 19248),
                        new ResChunk(ResType.CONCRETE, 96240),
                        new ResChunk(ResType.BRICK, 48120),
                        new ResChunk(ResType.GLASS, 4812),
                        new ResChunk(ResType.MONEY, 2887200)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.CONSTRUCTION, 55000),
                        new ResChunk(ResType.STEEL, 25800),
                        new ResChunk(ResType.CONCRETE, 129000),
                        new ResChunk(ResType.BRICK, 64500),
                        new ResChunk(ResType.GLASS, 6450),
                        new ResChunk(ResType.MONEY, 3870000)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.CONSTRUCTION, 70000),
                        new ResChunk(ResType.STEEL, 33600),
                        new ResChunk(ResType.CONCRETE, 168000),
                        new ResChunk(ResType.BRICK, 84000),
                        new ResChunk(ResType.GLASS, 8400),
                        new ResChunk(ResType.MONEY, 5040000)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.CONSTRUCTION, 88000),
                        new ResChunk(ResType.STEEL, 43392),
                        new ResChunk(ResType.CONCRETE, 216960),
                        new ResChunk(ResType.BRICK, 108480),
                        new ResChunk(ResType.GLASS, 10848),
                        new ResChunk(ResType.MONEY, 6508800)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.CONSTRUCTION, 109000),
                        new ResChunk(ResType.STEEL, 55320),
                        new ResChunk(ResType.CONCRETE, 276600),
                        new ResChunk(ResType.BRICK, 138300),
                        new ResChunk(ResType.GLASS, 13830),
                        new ResChunk(ResType.MONEY, 8298000)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.CONSTRUCTION, 133000),
                        new ResChunk(ResType.STEEL, 69528),
                        new ResChunk(ResType.CONCRETE, 347640),
                        new ResChunk(ResType.BRICK, 173820),
                        new ResChunk(ResType.GLASS, 17382),
                        new ResChunk(ResType.MONEY, 10429200)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.CONSTRUCTION, 160000),
                        new ResChunk(ResType.STEEL, 86160),
                        new ResChunk(ResType.CONCRETE, 430800),
                        new ResChunk(ResType.BRICK, 215400),
                        new ResChunk(ResType.GLASS, 21540),
                        new ResChunk(ResType.MONEY, 12924000)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.CONSTRUCTION, 190000),
                        new ResChunk(ResType.STEEL, 105360),
                        new ResChunk(ResType.CONCRETE, 526800),
                        new ResChunk(ResType.BRICK, 263400),
                        new ResChunk(ResType.GLASS, 26340),
                        new ResChunk(ResType.MONEY, 15804000)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.CONSTRUCTION, 224000),
                        new ResChunk(ResType.STEEL, 128208),
                        new ResChunk(ResType.CONCRETE, 641040),
                        new ResChunk(ResType.BRICK, 320520),
                        new ResChunk(ResType.GLASS, 32052),
                        new ResChunk(ResType.MONEY, 19231200)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.CONSTRUCTION, 262000),
                        new ResChunk(ResType.STEEL, 154960),
                        new ResChunk(ResType.CONCRETE, 774800),
                        new ResChunk(ResType.BRICK, 387400),
                        new ResChunk(ResType.GLASS, 38740),
                        new ResChunk(ResType.MONEY, 23244000)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.CONSTRUCTION, 304000),
                        new ResChunk(ResType.STEEL, 185872),
                        new ResChunk(ResType.CONCRETE, 929360),
                        new ResChunk(ResType.BRICK, 464680),
                        new ResChunk(ResType.GLASS, 46468),
                        new ResChunk(ResType.MONEY, 27880800)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.CONSTRUCTION, 350000),
                        new ResChunk(ResType.STEEL, 221200),
                        new ResChunk(ResType.CONCRETE, 1106000),
                        new ResChunk(ResType.BRICK, 553000),
                        new ResChunk(ResType.GLASS, 55300),
                        new ResChunk(ResType.MONEY, 33180000)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.CONSTRUCTION, 400000),
                        new ResChunk(ResType.STEEL, 261200),
                        new ResChunk(ResType.CONCRETE, 1306000),
                        new ResChunk(ResType.BRICK, 653000),
                        new ResChunk(ResType.GLASS, 65300),
                        new ResChunk(ResType.MONEY, 39180000)
                )
        });
        setSupply(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.POWER, 250)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.POWER, 500)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.POWER, 750)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.POWER, 1000)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.POWER, 1250)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.POWER, 1750)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.POWER, 2250)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.POWER, 2750)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.POWER, 3250)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.POWER, 3750)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.POWER, 4500)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.POWER, 5250)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.POWER, 6000)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.POWER, 6750)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.POWER, 7500)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.POWER, 8500)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.POWER, 9500)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.POWER, 10500)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.POWER, 11500)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.POWER, 12500)
                )
        });
        setSupplyMultiplier(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.POWER, 2)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.POWER, 4)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.POWER, 6)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.POWER, 8)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.POWER, 10)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.POWER, 14)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.POWER, 18)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.POWER, 22)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.POWER, 26)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.POWER, 30)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.POWER, 36)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.POWER, 42)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.POWER, 48)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.POWER, 54)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.POWER, 60)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.POWER, 68)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.POWER, 76)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.POWER, 84)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.POWER, 92)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.POWER, 100)
                )
        });
        setDemand(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.UPKEEP, 400),
                        new ResChunk(ResType.JOB, 320),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.UPKEEP, 800),
                        new ResChunk(ResType.JOB, 640),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.UPKEEP, 1200),
                        new ResChunk(ResType.JOB, 960),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.UPKEEP, 1600),
                        new ResChunk(ResType.JOB, 1280),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.UPKEEP, 2000),
                        new ResChunk(ResType.JOB, 1600),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.UPKEEP, 2800),
                        new ResChunk(ResType.JOB, 2240),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.UPKEEP, 3600),
                        new ResChunk(ResType.JOB, 2880),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.UPKEEP, 4400),
                        new ResChunk(ResType.JOB, 3520),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.UPKEEP, 5200),
                        new ResChunk(ResType.JOB, 4160),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.UPKEEP, 6000),
                        new ResChunk(ResType.JOB, 4800),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.UPKEEP, 7200),
                        new ResChunk(ResType.JOB, 5760),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.UPKEEP, 8400),
                        new ResChunk(ResType.JOB, 6720),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.UPKEEP, 9600),
                        new ResChunk(ResType.JOB, 7680),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.UPKEEP, 10800),
                        new ResChunk(ResType.JOB, 8640),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.UPKEEP, 12000),
                        new ResChunk(ResType.JOB, 9600),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.UPKEEP, 13600),
                        new ResChunk(ResType.JOB, 10880),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.UPKEEP, 15200),
                        new ResChunk(ResType.JOB, 12160),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.UPKEEP, 16800),
                        new ResChunk(ResType.JOB, 13440),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.UPKEEP, 18400),
                        new ResChunk(ResType.JOB, 14720),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.UPKEEP, 20000),
                        new ResChunk(ResType.JOB, 16000),
                        new ResChunk(ResType.IGNITABILITY, 1)
                )
        });
        setHold(new ResPack[]{ // hold
                new ResPack( // 1
                        new ResChunk(ResType.WORKER, 320)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.WORKER, 640)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.WORKER, 960)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.WORKER, 1280)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.WORKER, 1600)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.WORKER, 2240)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.WORKER, 2880)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.WORKER, 3520)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.WORKER, 4160)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.WORKER, 4800)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.WORKER, 5760)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.WORKER, 6720)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.WORKER, 7680)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.WORKER, 8640)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.WORKER, 9600)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.WORKER, 10880)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.WORKER, 12160)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.WORKER, 13440)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.WORKER, 14720)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.WORKER, 16000)
                )
        });
    }
}
