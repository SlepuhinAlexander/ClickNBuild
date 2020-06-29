package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResStat;
import org.itworks.clicknbuild.engine.model.ResStatPack;
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
        setBuildCost(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.CONSTRUCTION, 1000),
                        new ResStat(ResType.STEEL, 408),
                        new ResStat(ResType.CONCRETE, 2040),
                        new ResStat(ResType.BRICK, 1020),
                        new ResStat(ResType.GLASS, 102),
                        new ResStat(ResType.MONEY, 61200)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.CONSTRUCTION, 3000),
                        new ResStat(ResType.STEEL, 1240),
                        new ResStat(ResType.CONCRETE, 6200),
                        new ResStat(ResType.BRICK, 3100),
                        new ResStat(ResType.GLASS, 310),
                        new ResStat(ResType.MONEY, 186000)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.CONSTRUCTION, 6000),
                        new ResStat(ResType.STEEL, 2512),
                        new ResStat(ResType.CONCRETE, 12560),
                        new ResStat(ResType.BRICK, 6280),
                        new ResStat(ResType.GLASS, 628),
                        new ResStat(ResType.MONEY, 376800)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.CONSTRUCTION, 10000),
                        new ResStat(ResType.STEEL, 4240),
                        new ResStat(ResType.CONCRETE, 21200),
                        new ResStat(ResType.BRICK, 10600),
                        new ResStat(ResType.GLASS, 1060),
                        new ResStat(ResType.MONEY, 636000)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.CONSTRUCTION, 15000),
                        new ResStat(ResType.STEEL, 6440),
                        new ResStat(ResType.CONCRETE, 32200),
                        new ResStat(ResType.BRICK, 16100),
                        new ResStat(ResType.GLASS, 1610),
                        new ResStat(ResType.MONEY, 966000)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.CONSTRUCTION, 22000),
                        new ResStat(ResType.STEEL, 9632),
                        new ResStat(ResType.CONCRETE, 48160),
                        new ResStat(ResType.BRICK, 24080),
                        new ResStat(ResType.GLASS, 2408),
                        new ResStat(ResType.MONEY, 1444800)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.CONSTRUCTION, 31000),
                        new ResStat(ResType.STEEL, 13880),
                        new ResStat(ResType.CONCRETE, 69400),
                        new ResStat(ResType.BRICK, 34700),
                        new ResStat(ResType.GLASS, 3470),
                        new ResStat(ResType.MONEY, 2082000)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.CONSTRUCTION, 42000),
                        new ResStat(ResType.STEEL, 19248),
                        new ResStat(ResType.CONCRETE, 96240),
                        new ResStat(ResType.BRICK, 48120),
                        new ResStat(ResType.GLASS, 4812),
                        new ResStat(ResType.MONEY, 2887200)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.CONSTRUCTION, 55000),
                        new ResStat(ResType.STEEL, 25800),
                        new ResStat(ResType.CONCRETE, 129000),
                        new ResStat(ResType.BRICK, 64500),
                        new ResStat(ResType.GLASS, 6450),
                        new ResStat(ResType.MONEY, 3870000)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.CONSTRUCTION, 70000),
                        new ResStat(ResType.STEEL, 33600),
                        new ResStat(ResType.CONCRETE, 168000),
                        new ResStat(ResType.BRICK, 84000),
                        new ResStat(ResType.GLASS, 8400),
                        new ResStat(ResType.MONEY, 5040000)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.CONSTRUCTION, 88000),
                        new ResStat(ResType.STEEL, 43392),
                        new ResStat(ResType.CONCRETE, 216960),
                        new ResStat(ResType.BRICK, 108480),
                        new ResStat(ResType.GLASS, 10848),
                        new ResStat(ResType.MONEY, 6508800)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.CONSTRUCTION, 109000),
                        new ResStat(ResType.STEEL, 55320),
                        new ResStat(ResType.CONCRETE, 276600),
                        new ResStat(ResType.BRICK, 138300),
                        new ResStat(ResType.GLASS, 13830),
                        new ResStat(ResType.MONEY, 8298000)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.CONSTRUCTION, 133000),
                        new ResStat(ResType.STEEL, 69528),
                        new ResStat(ResType.CONCRETE, 347640),
                        new ResStat(ResType.BRICK, 173820),
                        new ResStat(ResType.GLASS, 17382),
                        new ResStat(ResType.MONEY, 10429200)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.CONSTRUCTION, 160000),
                        new ResStat(ResType.STEEL, 86160),
                        new ResStat(ResType.CONCRETE, 430800),
                        new ResStat(ResType.BRICK, 215400),
                        new ResStat(ResType.GLASS, 21540),
                        new ResStat(ResType.MONEY, 12924000)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.CONSTRUCTION, 190000),
                        new ResStat(ResType.STEEL, 105360),
                        new ResStat(ResType.CONCRETE, 526800),
                        new ResStat(ResType.BRICK, 263400),
                        new ResStat(ResType.GLASS, 26340),
                        new ResStat(ResType.MONEY, 15804000)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.CONSTRUCTION, 224000),
                        new ResStat(ResType.STEEL, 128208),
                        new ResStat(ResType.CONCRETE, 641040),
                        new ResStat(ResType.BRICK, 320520),
                        new ResStat(ResType.GLASS, 32052),
                        new ResStat(ResType.MONEY, 19231200)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.CONSTRUCTION, 262000),
                        new ResStat(ResType.STEEL, 154960),
                        new ResStat(ResType.CONCRETE, 774800),
                        new ResStat(ResType.BRICK, 387400),
                        new ResStat(ResType.GLASS, 38740),
                        new ResStat(ResType.MONEY, 23244000)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.CONSTRUCTION, 304000),
                        new ResStat(ResType.STEEL, 185872),
                        new ResStat(ResType.CONCRETE, 929360),
                        new ResStat(ResType.BRICK, 464680),
                        new ResStat(ResType.GLASS, 46468),
                        new ResStat(ResType.MONEY, 27880800)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.CONSTRUCTION, 350000),
                        new ResStat(ResType.STEEL, 221200),
                        new ResStat(ResType.CONCRETE, 1106000),
                        new ResStat(ResType.BRICK, 553000),
                        new ResStat(ResType.GLASS, 55300),
                        new ResStat(ResType.MONEY, 33180000)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.CONSTRUCTION, 400000),
                        new ResStat(ResType.STEEL, 261200),
                        new ResStat(ResType.CONCRETE, 1306000),
                        new ResStat(ResType.BRICK, 653000),
                        new ResStat(ResType.GLASS, 65300),
                        new ResStat(ResType.MONEY, 39180000)
                )
        });
        setSupply(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.POWER, 250)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.POWER, 500)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.POWER, 750)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.POWER, 1000)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.POWER, 1250)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.POWER, 1750)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.POWER, 2250)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.POWER, 2750)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.POWER, 3250)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.POWER, 3750)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.POWER, 4500)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.POWER, 5250)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.POWER, 6000)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.POWER, 6750)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.POWER, 7500)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.POWER, 8500)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.POWER, 9500)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.POWER, 10500)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.POWER, 11500)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.POWER, 12500)
                )
        });
        setSupplyMultiplier(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.POWER, 2)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.POWER, 4)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.POWER, 6)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.POWER, 8)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.POWER, 10)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.POWER, 14)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.POWER, 18)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.POWER, 22)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.POWER, 26)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.POWER, 30)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.POWER, 36)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.POWER, 42)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.POWER, 48)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.POWER, 54)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.POWER, 60)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.POWER, 68)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.POWER, 76)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.POWER, 84)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.POWER, 92)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.POWER, 100)
                )
        });
        setDemand(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.UPKEEP, 400),
                        new ResStat(ResType.JOB, 320),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.UPKEEP, 800),
                        new ResStat(ResType.JOB, 640),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.UPKEEP, 1200),
                        new ResStat(ResType.JOB, 960),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.UPKEEP, 1600),
                        new ResStat(ResType.JOB, 1280),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.UPKEEP, 2000),
                        new ResStat(ResType.JOB, 1600),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.UPKEEP, 2800),
                        new ResStat(ResType.JOB, 2240),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.UPKEEP, 3600),
                        new ResStat(ResType.JOB, 2880),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.UPKEEP, 4400),
                        new ResStat(ResType.JOB, 3520),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.UPKEEP, 5200),
                        new ResStat(ResType.JOB, 4160),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.UPKEEP, 6000),
                        new ResStat(ResType.JOB, 4800),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.UPKEEP, 7200),
                        new ResStat(ResType.JOB, 5760),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.UPKEEP, 8400),
                        new ResStat(ResType.JOB, 6720),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.UPKEEP, 9600),
                        new ResStat(ResType.JOB, 7680),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.UPKEEP, 10800),
                        new ResStat(ResType.JOB, 8640),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.UPKEEP, 12000),
                        new ResStat(ResType.JOB, 9600),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.UPKEEP, 13600),
                        new ResStat(ResType.JOB, 10880),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.UPKEEP, 15200),
                        new ResStat(ResType.JOB, 12160),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.UPKEEP, 16800),
                        new ResStat(ResType.JOB, 13440),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.UPKEEP, 18400),
                        new ResStat(ResType.JOB, 14720),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.UPKEEP, 20000),
                        new ResStat(ResType.JOB, 16000),
                        new ResStat(ResType.IGNITABILITY, 1)
                )
        });
        setHold(new ResStatPack[]{ // hold
                new ResStatPack( // 1
                        new ResStat(ResType.WORKER, 320)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.WORKER, 640)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.WORKER, 960)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.WORKER, 1280)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.WORKER, 1600)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.WORKER, 2240)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.WORKER, 2880)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.WORKER, 3520)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.WORKER, 4160)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.WORKER, 4800)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.WORKER, 5760)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.WORKER, 6720)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.WORKER, 7680)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.WORKER, 8640)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.WORKER, 9600)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.WORKER, 10880)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.WORKER, 12160)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.WORKER, 13440)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.WORKER, 14720)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.WORKER, 16000)
                )
        });
    }
}
