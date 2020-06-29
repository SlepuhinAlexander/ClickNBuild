package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;
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
        setBuildCost(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.CONSTRUCTION, 1000),
                        new ResourceChunk(ResType.STEEL, 408),
                        new ResourceChunk(ResType.CONCRETE, 2040),
                        new ResourceChunk(ResType.BRICK, 1020),
                        new ResourceChunk(ResType.GLASS, 102),
                        new ResourceChunk(ResType.MONEY, 61200)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.CONSTRUCTION, 3000),
                        new ResourceChunk(ResType.STEEL, 1240),
                        new ResourceChunk(ResType.CONCRETE, 6200),
                        new ResourceChunk(ResType.BRICK, 3100),
                        new ResourceChunk(ResType.GLASS, 310),
                        new ResourceChunk(ResType.MONEY, 186000)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.CONSTRUCTION, 6000),
                        new ResourceChunk(ResType.STEEL, 2512),
                        new ResourceChunk(ResType.CONCRETE, 12560),
                        new ResourceChunk(ResType.BRICK, 6280),
                        new ResourceChunk(ResType.GLASS, 628),
                        new ResourceChunk(ResType.MONEY, 376800)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.CONSTRUCTION, 10000),
                        new ResourceChunk(ResType.STEEL, 4240),
                        new ResourceChunk(ResType.CONCRETE, 21200),
                        new ResourceChunk(ResType.BRICK, 10600),
                        new ResourceChunk(ResType.GLASS, 1060),
                        new ResourceChunk(ResType.MONEY, 636000)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.CONSTRUCTION, 15000),
                        new ResourceChunk(ResType.STEEL, 6440),
                        new ResourceChunk(ResType.CONCRETE, 32200),
                        new ResourceChunk(ResType.BRICK, 16100),
                        new ResourceChunk(ResType.GLASS, 1610),
                        new ResourceChunk(ResType.MONEY, 966000)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.CONSTRUCTION, 22000),
                        new ResourceChunk(ResType.STEEL, 9632),
                        new ResourceChunk(ResType.CONCRETE, 48160),
                        new ResourceChunk(ResType.BRICK, 24080),
                        new ResourceChunk(ResType.GLASS, 2408),
                        new ResourceChunk(ResType.MONEY, 1444800)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.CONSTRUCTION, 31000),
                        new ResourceChunk(ResType.STEEL, 13880),
                        new ResourceChunk(ResType.CONCRETE, 69400),
                        new ResourceChunk(ResType.BRICK, 34700),
                        new ResourceChunk(ResType.GLASS, 3470),
                        new ResourceChunk(ResType.MONEY, 2082000)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.CONSTRUCTION, 42000),
                        new ResourceChunk(ResType.STEEL, 19248),
                        new ResourceChunk(ResType.CONCRETE, 96240),
                        new ResourceChunk(ResType.BRICK, 48120),
                        new ResourceChunk(ResType.GLASS, 4812),
                        new ResourceChunk(ResType.MONEY, 2887200)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.CONSTRUCTION, 55000),
                        new ResourceChunk(ResType.STEEL, 25800),
                        new ResourceChunk(ResType.CONCRETE, 129000),
                        new ResourceChunk(ResType.BRICK, 64500),
                        new ResourceChunk(ResType.GLASS, 6450),
                        new ResourceChunk(ResType.MONEY, 3870000)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.CONSTRUCTION, 70000),
                        new ResourceChunk(ResType.STEEL, 33600),
                        new ResourceChunk(ResType.CONCRETE, 168000),
                        new ResourceChunk(ResType.BRICK, 84000),
                        new ResourceChunk(ResType.GLASS, 8400),
                        new ResourceChunk(ResType.MONEY, 5040000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.CONSTRUCTION, 88000),
                        new ResourceChunk(ResType.STEEL, 43392),
                        new ResourceChunk(ResType.CONCRETE, 216960),
                        new ResourceChunk(ResType.BRICK, 108480),
                        new ResourceChunk(ResType.GLASS, 10848),
                        new ResourceChunk(ResType.MONEY, 6508800)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.CONSTRUCTION, 109000),
                        new ResourceChunk(ResType.STEEL, 55320),
                        new ResourceChunk(ResType.CONCRETE, 276600),
                        new ResourceChunk(ResType.BRICK, 138300),
                        new ResourceChunk(ResType.GLASS, 13830),
                        new ResourceChunk(ResType.MONEY, 8298000)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.CONSTRUCTION, 133000),
                        new ResourceChunk(ResType.STEEL, 69528),
                        new ResourceChunk(ResType.CONCRETE, 347640),
                        new ResourceChunk(ResType.BRICK, 173820),
                        new ResourceChunk(ResType.GLASS, 17382),
                        new ResourceChunk(ResType.MONEY, 10429200)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.CONSTRUCTION, 160000),
                        new ResourceChunk(ResType.STEEL, 86160),
                        new ResourceChunk(ResType.CONCRETE, 430800),
                        new ResourceChunk(ResType.BRICK, 215400),
                        new ResourceChunk(ResType.GLASS, 21540),
                        new ResourceChunk(ResType.MONEY, 12924000)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.CONSTRUCTION, 190000),
                        new ResourceChunk(ResType.STEEL, 105360),
                        new ResourceChunk(ResType.CONCRETE, 526800),
                        new ResourceChunk(ResType.BRICK, 263400),
                        new ResourceChunk(ResType.GLASS, 26340),
                        new ResourceChunk(ResType.MONEY, 15804000)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.CONSTRUCTION, 224000),
                        new ResourceChunk(ResType.STEEL, 128208),
                        new ResourceChunk(ResType.CONCRETE, 641040),
                        new ResourceChunk(ResType.BRICK, 320520),
                        new ResourceChunk(ResType.GLASS, 32052),
                        new ResourceChunk(ResType.MONEY, 19231200)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.CONSTRUCTION, 262000),
                        new ResourceChunk(ResType.STEEL, 154960),
                        new ResourceChunk(ResType.CONCRETE, 774800),
                        new ResourceChunk(ResType.BRICK, 387400),
                        new ResourceChunk(ResType.GLASS, 38740),
                        new ResourceChunk(ResType.MONEY, 23244000)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.CONSTRUCTION, 304000),
                        new ResourceChunk(ResType.STEEL, 185872),
                        new ResourceChunk(ResType.CONCRETE, 929360),
                        new ResourceChunk(ResType.BRICK, 464680),
                        new ResourceChunk(ResType.GLASS, 46468),
                        new ResourceChunk(ResType.MONEY, 27880800)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.CONSTRUCTION, 350000),
                        new ResourceChunk(ResType.STEEL, 221200),
                        new ResourceChunk(ResType.CONCRETE, 1106000),
                        new ResourceChunk(ResType.BRICK, 553000),
                        new ResourceChunk(ResType.GLASS, 55300),
                        new ResourceChunk(ResType.MONEY, 33180000)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.CONSTRUCTION, 400000),
                        new ResourceChunk(ResType.STEEL, 261200),
                        new ResourceChunk(ResType.CONCRETE, 1306000),
                        new ResourceChunk(ResType.BRICK, 653000),
                        new ResourceChunk(ResType.GLASS, 65300),
                        new ResourceChunk(ResType.MONEY, 39180000)
                )
        });
        setSupply(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.POWER, 250)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.POWER, 500)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.POWER, 750)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.POWER, 1000)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.POWER, 1250)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.POWER, 1750)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.POWER, 2250)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.POWER, 2750)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.POWER, 3250)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.POWER, 3750)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.POWER, 4500)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.POWER, 5250)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.POWER, 6000)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.POWER, 6750)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.POWER, 7500)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.POWER, 8500)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.POWER, 9500)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.POWER, 10500)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.POWER, 11500)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.POWER, 12500)
                )
        });
        setSupplyMultiplier(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.POWER, 2)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.POWER, 4)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.POWER, 6)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.POWER, 8)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.POWER, 10)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.POWER, 14)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.POWER, 18)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.POWER, 22)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.POWER, 26)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.POWER, 30)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.POWER, 36)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.POWER, 42)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.POWER, 48)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.POWER, 54)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.POWER, 60)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.POWER, 68)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.POWER, 76)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.POWER, 84)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.POWER, 92)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.POWER, 100)
                )
        });
        setDemand(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.UPKEEP, 400),
                        new ResourceChunk(ResType.JOB, 320),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.UPKEEP, 800),
                        new ResourceChunk(ResType.JOB, 640),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.UPKEEP, 1200),
                        new ResourceChunk(ResType.JOB, 960),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.UPKEEP, 1600),
                        new ResourceChunk(ResType.JOB, 1280),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.UPKEEP, 2000),
                        new ResourceChunk(ResType.JOB, 1600),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.UPKEEP, 2800),
                        new ResourceChunk(ResType.JOB, 2240),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.UPKEEP, 3600),
                        new ResourceChunk(ResType.JOB, 2880),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.UPKEEP, 4400),
                        new ResourceChunk(ResType.JOB, 3520),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.UPKEEP, 5200),
                        new ResourceChunk(ResType.JOB, 4160),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.UPKEEP, 6000),
                        new ResourceChunk(ResType.JOB, 4800),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.UPKEEP, 7200),
                        new ResourceChunk(ResType.JOB, 5760),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.UPKEEP, 8400),
                        new ResourceChunk(ResType.JOB, 6720),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.UPKEEP, 9600),
                        new ResourceChunk(ResType.JOB, 7680),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.UPKEEP, 10800),
                        new ResourceChunk(ResType.JOB, 8640),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.UPKEEP, 12000),
                        new ResourceChunk(ResType.JOB, 9600),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.UPKEEP, 13600),
                        new ResourceChunk(ResType.JOB, 10880),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.UPKEEP, 15200),
                        new ResourceChunk(ResType.JOB, 12160),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.UPKEEP, 16800),
                        new ResourceChunk(ResType.JOB, 13440),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.UPKEEP, 18400),
                        new ResourceChunk(ResType.JOB, 14720),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.UPKEEP, 20000),
                        new ResourceChunk(ResType.JOB, 16000),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                )
        });
        setHold(new ResourcePack[]{ // hold
                new ResourcePack( // 1
                        new ResourceChunk(ResType.WORKER, 320)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.WORKER, 640)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.WORKER, 960)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.WORKER, 1280)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.WORKER, 1600)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.WORKER, 2240)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.WORKER, 2880)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.WORKER, 3520)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.WORKER, 4160)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.WORKER, 4800)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.WORKER, 5760)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.WORKER, 6720)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.WORKER, 7680)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.WORKER, 8640)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.WORKER, 9600)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.WORKER, 10880)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.WORKER, 12160)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.WORKER, 13440)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.WORKER, 14720)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.WORKER, 16000)
                )
        });
    }
}
