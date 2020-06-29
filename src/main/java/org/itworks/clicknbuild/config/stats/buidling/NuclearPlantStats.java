package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;
import org.itworks.clicknbuild.engine.model.ResourceType;

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
                        new ResourceChunk(ResourceType.CONSTRUCTION, 1000),
                        new ResourceChunk(ResourceType.STEEL, 408),
                        new ResourceChunk(ResourceType.CONCRETE, 2040),
                        new ResourceChunk(ResourceType.BRICK, 1020),
                        new ResourceChunk(ResourceType.GLASS, 102),
                        new ResourceChunk(ResourceType.MONEY, 61200)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.CONSTRUCTION, 3000),
                        new ResourceChunk(ResourceType.STEEL, 1240),
                        new ResourceChunk(ResourceType.CONCRETE, 6200),
                        new ResourceChunk(ResourceType.BRICK, 3100),
                        new ResourceChunk(ResourceType.GLASS, 310),
                        new ResourceChunk(ResourceType.MONEY, 186000)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.CONSTRUCTION, 6000),
                        new ResourceChunk(ResourceType.STEEL, 2512),
                        new ResourceChunk(ResourceType.CONCRETE, 12560),
                        new ResourceChunk(ResourceType.BRICK, 6280),
                        new ResourceChunk(ResourceType.GLASS, 628),
                        new ResourceChunk(ResourceType.MONEY, 376800)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.CONSTRUCTION, 10000),
                        new ResourceChunk(ResourceType.STEEL, 4240),
                        new ResourceChunk(ResourceType.CONCRETE, 21200),
                        new ResourceChunk(ResourceType.BRICK, 10600),
                        new ResourceChunk(ResourceType.GLASS, 1060),
                        new ResourceChunk(ResourceType.MONEY, 636000)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.CONSTRUCTION, 15000),
                        new ResourceChunk(ResourceType.STEEL, 6440),
                        new ResourceChunk(ResourceType.CONCRETE, 32200),
                        new ResourceChunk(ResourceType.BRICK, 16100),
                        new ResourceChunk(ResourceType.GLASS, 1610),
                        new ResourceChunk(ResourceType.MONEY, 966000)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.CONSTRUCTION, 22000),
                        new ResourceChunk(ResourceType.STEEL, 9632),
                        new ResourceChunk(ResourceType.CONCRETE, 48160),
                        new ResourceChunk(ResourceType.BRICK, 24080),
                        new ResourceChunk(ResourceType.GLASS, 2408),
                        new ResourceChunk(ResourceType.MONEY, 1444800)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.CONSTRUCTION, 31000),
                        new ResourceChunk(ResourceType.STEEL, 13880),
                        new ResourceChunk(ResourceType.CONCRETE, 69400),
                        new ResourceChunk(ResourceType.BRICK, 34700),
                        new ResourceChunk(ResourceType.GLASS, 3470),
                        new ResourceChunk(ResourceType.MONEY, 2082000)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.CONSTRUCTION, 42000),
                        new ResourceChunk(ResourceType.STEEL, 19248),
                        new ResourceChunk(ResourceType.CONCRETE, 96240),
                        new ResourceChunk(ResourceType.BRICK, 48120),
                        new ResourceChunk(ResourceType.GLASS, 4812),
                        new ResourceChunk(ResourceType.MONEY, 2887200)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.CONSTRUCTION, 55000),
                        new ResourceChunk(ResourceType.STEEL, 25800),
                        new ResourceChunk(ResourceType.CONCRETE, 129000),
                        new ResourceChunk(ResourceType.BRICK, 64500),
                        new ResourceChunk(ResourceType.GLASS, 6450),
                        new ResourceChunk(ResourceType.MONEY, 3870000)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.CONSTRUCTION, 70000),
                        new ResourceChunk(ResourceType.STEEL, 33600),
                        new ResourceChunk(ResourceType.CONCRETE, 168000),
                        new ResourceChunk(ResourceType.BRICK, 84000),
                        new ResourceChunk(ResourceType.GLASS, 8400),
                        new ResourceChunk(ResourceType.MONEY, 5040000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.CONSTRUCTION, 88000),
                        new ResourceChunk(ResourceType.STEEL, 43392),
                        new ResourceChunk(ResourceType.CONCRETE, 216960),
                        new ResourceChunk(ResourceType.BRICK, 108480),
                        new ResourceChunk(ResourceType.GLASS, 10848),
                        new ResourceChunk(ResourceType.MONEY, 6508800)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.CONSTRUCTION, 109000),
                        new ResourceChunk(ResourceType.STEEL, 55320),
                        new ResourceChunk(ResourceType.CONCRETE, 276600),
                        new ResourceChunk(ResourceType.BRICK, 138300),
                        new ResourceChunk(ResourceType.GLASS, 13830),
                        new ResourceChunk(ResourceType.MONEY, 8298000)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.CONSTRUCTION, 133000),
                        new ResourceChunk(ResourceType.STEEL, 69528),
                        new ResourceChunk(ResourceType.CONCRETE, 347640),
                        new ResourceChunk(ResourceType.BRICK, 173820),
                        new ResourceChunk(ResourceType.GLASS, 17382),
                        new ResourceChunk(ResourceType.MONEY, 10429200)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.CONSTRUCTION, 160000),
                        new ResourceChunk(ResourceType.STEEL, 86160),
                        new ResourceChunk(ResourceType.CONCRETE, 430800),
                        new ResourceChunk(ResourceType.BRICK, 215400),
                        new ResourceChunk(ResourceType.GLASS, 21540),
                        new ResourceChunk(ResourceType.MONEY, 12924000)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.CONSTRUCTION, 190000),
                        new ResourceChunk(ResourceType.STEEL, 105360),
                        new ResourceChunk(ResourceType.CONCRETE, 526800),
                        new ResourceChunk(ResourceType.BRICK, 263400),
                        new ResourceChunk(ResourceType.GLASS, 26340),
                        new ResourceChunk(ResourceType.MONEY, 15804000)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.CONSTRUCTION, 224000),
                        new ResourceChunk(ResourceType.STEEL, 128208),
                        new ResourceChunk(ResourceType.CONCRETE, 641040),
                        new ResourceChunk(ResourceType.BRICK, 320520),
                        new ResourceChunk(ResourceType.GLASS, 32052),
                        new ResourceChunk(ResourceType.MONEY, 19231200)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.CONSTRUCTION, 262000),
                        new ResourceChunk(ResourceType.STEEL, 154960),
                        new ResourceChunk(ResourceType.CONCRETE, 774800),
                        new ResourceChunk(ResourceType.BRICK, 387400),
                        new ResourceChunk(ResourceType.GLASS, 38740),
                        new ResourceChunk(ResourceType.MONEY, 23244000)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.CONSTRUCTION, 304000),
                        new ResourceChunk(ResourceType.STEEL, 185872),
                        new ResourceChunk(ResourceType.CONCRETE, 929360),
                        new ResourceChunk(ResourceType.BRICK, 464680),
                        new ResourceChunk(ResourceType.GLASS, 46468),
                        new ResourceChunk(ResourceType.MONEY, 27880800)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.CONSTRUCTION, 350000),
                        new ResourceChunk(ResourceType.STEEL, 221200),
                        new ResourceChunk(ResourceType.CONCRETE, 1106000),
                        new ResourceChunk(ResourceType.BRICK, 553000),
                        new ResourceChunk(ResourceType.GLASS, 55300),
                        new ResourceChunk(ResourceType.MONEY, 33180000)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.CONSTRUCTION, 400000),
                        new ResourceChunk(ResourceType.STEEL, 261200),
                        new ResourceChunk(ResourceType.CONCRETE, 1306000),
                        new ResourceChunk(ResourceType.BRICK, 653000),
                        new ResourceChunk(ResourceType.GLASS, 65300),
                        new ResourceChunk(ResourceType.MONEY, 39180000)
                )
        });
        setSupply(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.POWER, 250)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.POWER, 500)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.POWER, 750)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.POWER, 1000)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.POWER, 1250)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.POWER, 1750)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.POWER, 2250)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.POWER, 2750)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.POWER, 3250)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.POWER, 3750)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.POWER, 4500)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.POWER, 5250)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.POWER, 6000)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.POWER, 6750)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.POWER, 7500)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.POWER, 8500)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.POWER, 9500)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.POWER, 10500)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.POWER, 11500)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.POWER, 12500)
                )
        });
        setSupplyMultiplier(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.POWER, 2)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.POWER, 4)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.POWER, 6)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.POWER, 8)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.POWER, 10)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.POWER, 14)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.POWER, 18)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.POWER, 22)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.POWER, 26)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.POWER, 30)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.POWER, 36)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.POWER, 42)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.POWER, 48)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.POWER, 54)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.POWER, 60)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.POWER, 68)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.POWER, 76)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.POWER, 84)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.POWER, 92)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.POWER, 100)
                )
        });
        setDemand(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.UPKEEP, 400),
                        new ResourceChunk(ResourceType.JOB, 320),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.UPKEEP, 800),
                        new ResourceChunk(ResourceType.JOB, 640),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.UPKEEP, 1200),
                        new ResourceChunk(ResourceType.JOB, 960),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.UPKEEP, 1600),
                        new ResourceChunk(ResourceType.JOB, 1280),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.UPKEEP, 2000),
                        new ResourceChunk(ResourceType.JOB, 1600),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.UPKEEP, 2800),
                        new ResourceChunk(ResourceType.JOB, 2240),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.UPKEEP, 3600),
                        new ResourceChunk(ResourceType.JOB, 2880),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.UPKEEP, 4400),
                        new ResourceChunk(ResourceType.JOB, 3520),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.UPKEEP, 5200),
                        new ResourceChunk(ResourceType.JOB, 4160),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.UPKEEP, 6000),
                        new ResourceChunk(ResourceType.JOB, 4800),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.UPKEEP, 7200),
                        new ResourceChunk(ResourceType.JOB, 5760),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.UPKEEP, 8400),
                        new ResourceChunk(ResourceType.JOB, 6720),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.UPKEEP, 9600),
                        new ResourceChunk(ResourceType.JOB, 7680),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.UPKEEP, 10800),
                        new ResourceChunk(ResourceType.JOB, 8640),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.UPKEEP, 12000),
                        new ResourceChunk(ResourceType.JOB, 9600),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.UPKEEP, 13600),
                        new ResourceChunk(ResourceType.JOB, 10880),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.UPKEEP, 15200),
                        new ResourceChunk(ResourceType.JOB, 12160),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.UPKEEP, 16800),
                        new ResourceChunk(ResourceType.JOB, 13440),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.UPKEEP, 18400),
                        new ResourceChunk(ResourceType.JOB, 14720),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.UPKEEP, 20000),
                        new ResourceChunk(ResourceType.JOB, 16000),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                )
        });
        setHold(new ResourcePack[]{ // hold
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.WORKER, 320)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.WORKER, 640)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.WORKER, 960)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.WORKER, 1280)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.WORKER, 1600)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.WORKER, 2240)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.WORKER, 2880)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.WORKER, 3520)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.WORKER, 4160)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.WORKER, 4800)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.WORKER, 5760)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.WORKER, 6720)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.WORKER, 7680)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.WORKER, 8640)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.WORKER, 9600)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.WORKER, 10880)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.WORKER, 12160)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.WORKER, 13440)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.WORKER, 14720)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.WORKER, 16000)
                )
        });
    }
}
