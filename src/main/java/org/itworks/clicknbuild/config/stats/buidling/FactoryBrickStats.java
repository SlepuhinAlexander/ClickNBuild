package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResStat;
import org.itworks.clicknbuild.engine.model.ResStatPack;
import org.itworks.clicknbuild.engine.model.ResType;

public final class FactoryBrickStats extends BuildingStats {
    private static volatile FactoryBrickStats inst;

    private FactoryBrickStats() {
    }

    public static FactoryBrickStats inst() {
        FactoryBrickStats local = inst;
        if (local == null) {
            synchronized (FactoryBrickStats.class) {
                local = inst;
                if (local == null) {
                    inst = local = new FactoryBrickStats();
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
        setPriceMultiplier(132);
        setStructure(new int[]{
                800, // 1
                2400, // 2
                4800, // 3
                8000, // 4
                12000, // 5
                17600, // 6
                24800, // 7
                33600, // 8
                44000, // 9
                56000, // 10
                70400, // 11
                87200, // 12
                106400, // 13
                128000, // 14
                152000, // 15
                179200, // 16
                209600, // 17
                243200, // 18
                280000, // 19
                320000 // 20
        });
        setBuildCost(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.CONSTRUCTION, 800),
                        new ResStat(ResType.STEEL, 408),
                        new ResStat(ResType.CONCRETE, 1275),
                        new ResStat(ResType.WOOD, 71),
                        new ResStat(ResType.GLASS, 143),
                        new ResStat(ResType.MONEY, 40800)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.CONSTRUCTION, 2400),
                        new ResStat(ResType.STEEL, 1240),
                        new ResStat(ResType.CONCRETE, 3875),
                        new ResStat(ResType.WOOD, 217),
                        new ResStat(ResType.GLASS, 434),
                        new ResStat(ResType.MONEY, 124000)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.CONSTRUCTION, 4800),
                        new ResStat(ResType.STEEL, 2512),
                        new ResStat(ResType.CONCRETE, 7850),
                        new ResStat(ResType.WOOD, 440),
                        new ResStat(ResType.GLASS, 879),
                        new ResStat(ResType.MONEY, 251200)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.CONSTRUCTION, 8000),
                        new ResStat(ResType.STEEL, 4240),
                        new ResStat(ResType.CONCRETE, 13250),
                        new ResStat(ResType.WOOD, 742),
                        new ResStat(ResType.GLASS, 1484),
                        new ResStat(ResType.MONEY, 424000)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.CONSTRUCTION, 12000),
                        new ResStat(ResType.STEEL, 6440),
                        new ResStat(ResType.CONCRETE, 20125),
                        new ResStat(ResType.WOOD, 1127),
                        new ResStat(ResType.GLASS, 2254),
                        new ResStat(ResType.MONEY, 644000)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.CONSTRUCTION, 17600),
                        new ResStat(ResType.STEEL, 9632),
                        new ResStat(ResType.CONCRETE, 30100),
                        new ResStat(ResType.WOOD, 1686),
                        new ResStat(ResType.GLASS, 3371),
                        new ResStat(ResType.MONEY, 963200)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.CONSTRUCTION, 24800),
                        new ResStat(ResType.STEEL, 13880),
                        new ResStat(ResType.CONCRETE, 43375),
                        new ResStat(ResType.WOOD, 2429),
                        new ResStat(ResType.GLASS, 4858),
                        new ResStat(ResType.MONEY, 1388000)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.CONSTRUCTION, 33600),
                        new ResStat(ResType.STEEL, 19248),
                        new ResStat(ResType.CONCRETE, 60150),
                        new ResStat(ResType.WOOD, 3368),
                        new ResStat(ResType.GLASS, 67737),
                        new ResStat(ResType.MONEY, 1924800)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.CONSTRUCTION, 44000),
                        new ResStat(ResType.STEEL, 25800),
                        new ResStat(ResType.CONCRETE, 80625),
                        new ResStat(ResType.WOOD, 4515),
                        new ResStat(ResType.GLASS, 9030),
                        new ResStat(ResType.MONEY, 2580000)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.CONSTRUCTION, 56000),
                        new ResStat(ResType.STEEL, 33600),
                        new ResStat(ResType.CONCRETE, 105000),
                        new ResStat(ResType.WOOD, 5880),
                        new ResStat(ResType.GLASS, 11760),
                        new ResStat(ResType.MONEY, 3360000)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.CONSTRUCTION, 70400),
                        new ResStat(ResType.STEEL, 43392),
                        new ResStat(ResType.CONCRETE, 135600),
                        new ResStat(ResType.WOOD, 7594),
                        new ResStat(ResType.GLASS, 15187),
                        new ResStat(ResType.MONEY, 4339200)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.CONSTRUCTION, 87200),
                        new ResStat(ResType.STEEL, 55320),
                        new ResStat(ResType.CONCRETE, 172875),
                        new ResStat(ResType.WOOD, 9681),
                        new ResStat(ResType.GLASS, 19362),
                        new ResStat(ResType.MONEY, 5532000)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.CONSTRUCTION, 106400),
                        new ResStat(ResType.STEEL, 69528),
                        new ResStat(ResType.CONCRETE, 217275),
                        new ResStat(ResType.WOOD, 12167),
                        new ResStat(ResType.GLASS, 24335),
                        new ResStat(ResType.MONEY, 6952800)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.CONSTRUCTION, 128000),
                        new ResStat(ResType.STEEL, 86160),
                        new ResStat(ResType.CONCRETE, 269250),
                        new ResStat(ResType.WOOD, 15078),
                        new ResStat(ResType.GLASS, 30156),
                        new ResStat(ResType.MONEY, 8616000)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.CONSTRUCTION, 152000),
                        new ResStat(ResType.STEEL, 105360),
                        new ResStat(ResType.CONCRETE, 329250),
                        new ResStat(ResType.WOOD, 18438),
                        new ResStat(ResType.GLASS, 36876),
                        new ResStat(ResType.MONEY, 10536000)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.CONSTRUCTION, 179200),
                        new ResStat(ResType.STEEL, 128208),
                        new ResStat(ResType.CONCRETE, 400650),
                        new ResStat(ResType.WOOD, 22436),
                        new ResStat(ResType.GLASS, 44873),
                        new ResStat(ResType.MONEY, 12820800)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.CONSTRUCTION, 209600),
                        new ResStat(ResType.STEEL, 154960),
                        new ResStat(ResType.CONCRETE, 484250),
                        new ResStat(ResType.WOOD, 27118),
                        new ResStat(ResType.GLASS, 54236),
                        new ResStat(ResType.MONEY, 15496000)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.CONSTRUCTION, 243200),
                        new ResStat(ResType.STEEL, 185872),
                        new ResStat(ResType.CONCRETE, 580850),
                        new ResStat(ResType.WOOD, 32528),
                        new ResStat(ResType.GLASS, 65055),
                        new ResStat(ResType.MONEY, 18587200)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.CONSTRUCTION, 280000),
                        new ResStat(ResType.STEEL, 221200),
                        new ResStat(ResType.CONCRETE, 691250),
                        new ResStat(ResType.WOOD, 38710),
                        new ResStat(ResType.GLASS, 77420),
                        new ResStat(ResType.MONEY, 22120000)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.CONSTRUCTION, 320000),
                        new ResStat(ResType.STEEL, 261200),
                        new ResStat(ResType.CONCRETE, 816250),
                        new ResStat(ResType.WOOD, 45710),
                        new ResStat(ResType.GLASS, 91420),
                        new ResStat(ResType.MONEY, 26120000)
                )
        });
        setProduction(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.BRICK, 60)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.BRICK, 120)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.BRICK, 180)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.BRICK, 240)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.BRICK, 300)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.BRICK, 420)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.BRICK, 540)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.BRICK, 660)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.BRICK, 780)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.BRICK, 960)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.BRICK, 1140)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.BRICK, 1320)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.BRICK, 1500)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.BRICK, 1680)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.BRICK, 1860)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.BRICK, 2100)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.BRICK, 2340)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.BRICK, 2580)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.BRICK, 2760)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.BRICK, 3000)
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
                        new ResStat(ResType.BRICK, 30)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.BRICK, 60)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.BRICK, 90)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.BRICK, 120)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.BRICK, 150)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.BRICK, 210)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.BRICK, 270)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.BRICK, 330)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.BRICK, 390)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.BRICK, 480)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.BRICK, 570)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.BRICK, 660)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.BRICK, 750)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.BRICK, 840)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.BRICK, 930)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.BRICK, 1050)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.BRICK, 1170)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.BRICK, 1290)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.BRICK, 1380)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.BRICK, 1500)
                )
        });
        setDemand(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.UPKEEP, 100),
                        new ResStat(ResType.POWER_CONSUMPTION, 16),
                        new ResStat(ResType.JOB, 320),
                        new ResStat(ResType.EMIGRATION, 1),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.UPKEEP, 200),
                        new ResStat(ResType.POWER_CONSUMPTION, 32),
                        new ResStat(ResType.JOB, 640),
                        new ResStat(ResType.EMIGRATION, 2),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.UPKEEP, 300),
                        new ResStat(ResType.POWER_CONSUMPTION, 48),
                        new ResStat(ResType.JOB, 960),
                        new ResStat(ResType.EMIGRATION, 3),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.UPKEEP, 400),
                        new ResStat(ResType.POWER_CONSUMPTION, 64),
                        new ResStat(ResType.JOB, 1280),
                        new ResStat(ResType.EMIGRATION, 4),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.UPKEEP, 500),
                        new ResStat(ResType.POWER_CONSUMPTION, 80),
                        new ResStat(ResType.JOB, 1600),
                        new ResStat(ResType.EMIGRATION, 5),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.UPKEEP, 700),
                        new ResStat(ResType.POWER_CONSUMPTION, 112),
                        new ResStat(ResType.JOB, 2240),
                        new ResStat(ResType.EMIGRATION, 6),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.UPKEEP, 900),
                        new ResStat(ResType.POWER_CONSUMPTION, 144),
                        new ResStat(ResType.JOB, 2880),
                        new ResStat(ResType.EMIGRATION, 7),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.UPKEEP, 1100),
                        new ResStat(ResType.POWER_CONSUMPTION, 176),
                        new ResStat(ResType.JOB, 3520),
                        new ResStat(ResType.EMIGRATION, 8),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.UPKEEP, 1300),
                        new ResStat(ResType.POWER_CONSUMPTION, 208),
                        new ResStat(ResType.JOB, 4160),
                        new ResStat(ResType.EMIGRATION, 9),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.UPKEEP, 1500),
                        new ResStat(ResType.POWER_CONSUMPTION, 240),
                        new ResStat(ResType.JOB, 4800),
                        new ResStat(ResType.EMIGRATION, 10),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.UPKEEP, 1800),
                        new ResStat(ResType.POWER_CONSUMPTION, 288),
                        new ResStat(ResType.JOB, 5760),
                        new ResStat(ResType.EMIGRATION, 11),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.UPKEEP, 2100),
                        new ResStat(ResType.POWER_CONSUMPTION, 336),
                        new ResStat(ResType.JOB, 6720),
                        new ResStat(ResType.EMIGRATION, 12),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.UPKEEP, 2400),
                        new ResStat(ResType.POWER_CONSUMPTION, 384),
                        new ResStat(ResType.JOB, 7680),
                        new ResStat(ResType.EMIGRATION, 13),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.UPKEEP, 2700),
                        new ResStat(ResType.POWER_CONSUMPTION, 432),
                        new ResStat(ResType.JOB, 8640),
                        new ResStat(ResType.EMIGRATION, 14),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.UPKEEP, 3000),
                        new ResStat(ResType.POWER_CONSUMPTION, 480),
                        new ResStat(ResType.JOB, 9600),
                        new ResStat(ResType.EMIGRATION, 15),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.UPKEEP, 3400),
                        new ResStat(ResType.POWER_CONSUMPTION, 544),
                        new ResStat(ResType.JOB, 10880),
                        new ResStat(ResType.EMIGRATION, 16),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.UPKEEP, 3800),
                        new ResStat(ResType.POWER_CONSUMPTION, 608),
                        new ResStat(ResType.JOB, 12160),
                        new ResStat(ResType.EMIGRATION, 17),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.UPKEEP, 4200),
                        new ResStat(ResType.POWER_CONSUMPTION, 672),
                        new ResStat(ResType.JOB, 13440),
                        new ResStat(ResType.EMIGRATION, 18),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.UPKEEP, 4600),
                        new ResStat(ResType.POWER_CONSUMPTION, 736),
                        new ResStat(ResType.JOB, 14720),
                        new ResStat(ResType.EMIGRATION, 19),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.UPKEEP, 5000),
                        new ResStat(ResType.POWER_CONSUMPTION, 800),
                        new ResStat(ResType.JOB, 16000),
                        new ResStat(ResType.EMIGRATION, 20),
                        new ResStat(ResType.IGNITABILITY, 1)
                )
        });
        setHold(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.POWER, 16),
                        new ResStat(ResType.WORKER, 320)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.POWER, 32),
                        new ResStat(ResType.WORKER, 640)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.POWER, 48),
                        new ResStat(ResType.WORKER, 960)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.POWER, 64),
                        new ResStat(ResType.WORKER, 1280)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.POWER, 80),
                        new ResStat(ResType.WORKER, 1600)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.POWER, 112),
                        new ResStat(ResType.WORKER, 2240)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.POWER, 144),
                        new ResStat(ResType.WORKER, 2880)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.POWER, 176),
                        new ResStat(ResType.WORKER, 3520)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.POWER, 208),
                        new ResStat(ResType.WORKER, 4160)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.POWER, 240),
                        new ResStat(ResType.WORKER, 4800)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.POWER, 288),
                        new ResStat(ResType.WORKER, 5760)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.POWER, 336),
                        new ResStat(ResType.WORKER, 6720)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.POWER, 384),
                        new ResStat(ResType.WORKER, 7680)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.POWER, 432),
                        new ResStat(ResType.WORKER, 8640)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.POWER, 480),
                        new ResStat(ResType.WORKER, 9600)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.POWER, 544),
                        new ResStat(ResType.WORKER, 10880)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.POWER, 608),
                        new ResStat(ResType.WORKER, 12160)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.POWER, 672),
                        new ResStat(ResType.WORKER, 13440)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.POWER, 736),
                        new ResStat(ResType.WORKER, 14720)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.POWER, 800),
                        new ResStat(ResType.WORKER, 16000)
                )
        });
    }
}
