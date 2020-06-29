package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResChunk;
import org.itworks.clicknbuild.engine.model.ResPack;
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
        setBuildCost(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.CONSTRUCTION, 800),
                        new ResChunk(ResType.STEEL, 408),
                        new ResChunk(ResType.CONCRETE, 1275),
                        new ResChunk(ResType.WOOD, 71),
                        new ResChunk(ResType.GLASS, 143),
                        new ResChunk(ResType.MONEY, 40800)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.CONSTRUCTION, 2400),
                        new ResChunk(ResType.STEEL, 1240),
                        new ResChunk(ResType.CONCRETE, 3875),
                        new ResChunk(ResType.WOOD, 217),
                        new ResChunk(ResType.GLASS, 434),
                        new ResChunk(ResType.MONEY, 124000)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.CONSTRUCTION, 4800),
                        new ResChunk(ResType.STEEL, 2512),
                        new ResChunk(ResType.CONCRETE, 7850),
                        new ResChunk(ResType.WOOD, 440),
                        new ResChunk(ResType.GLASS, 879),
                        new ResChunk(ResType.MONEY, 251200)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.CONSTRUCTION, 8000),
                        new ResChunk(ResType.STEEL, 4240),
                        new ResChunk(ResType.CONCRETE, 13250),
                        new ResChunk(ResType.WOOD, 742),
                        new ResChunk(ResType.GLASS, 1484),
                        new ResChunk(ResType.MONEY, 424000)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.CONSTRUCTION, 12000),
                        new ResChunk(ResType.STEEL, 6440),
                        new ResChunk(ResType.CONCRETE, 20125),
                        new ResChunk(ResType.WOOD, 1127),
                        new ResChunk(ResType.GLASS, 2254),
                        new ResChunk(ResType.MONEY, 644000)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.CONSTRUCTION, 17600),
                        new ResChunk(ResType.STEEL, 9632),
                        new ResChunk(ResType.CONCRETE, 30100),
                        new ResChunk(ResType.WOOD, 1686),
                        new ResChunk(ResType.GLASS, 3371),
                        new ResChunk(ResType.MONEY, 963200)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.CONSTRUCTION, 24800),
                        new ResChunk(ResType.STEEL, 13880),
                        new ResChunk(ResType.CONCRETE, 43375),
                        new ResChunk(ResType.WOOD, 2429),
                        new ResChunk(ResType.GLASS, 4858),
                        new ResChunk(ResType.MONEY, 1388000)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.CONSTRUCTION, 33600),
                        new ResChunk(ResType.STEEL, 19248),
                        new ResChunk(ResType.CONCRETE, 60150),
                        new ResChunk(ResType.WOOD, 3368),
                        new ResChunk(ResType.GLASS, 67737),
                        new ResChunk(ResType.MONEY, 1924800)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.CONSTRUCTION, 44000),
                        new ResChunk(ResType.STEEL, 25800),
                        new ResChunk(ResType.CONCRETE, 80625),
                        new ResChunk(ResType.WOOD, 4515),
                        new ResChunk(ResType.GLASS, 9030),
                        new ResChunk(ResType.MONEY, 2580000)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.CONSTRUCTION, 56000),
                        new ResChunk(ResType.STEEL, 33600),
                        new ResChunk(ResType.CONCRETE, 105000),
                        new ResChunk(ResType.WOOD, 5880),
                        new ResChunk(ResType.GLASS, 11760),
                        new ResChunk(ResType.MONEY, 3360000)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.CONSTRUCTION, 70400),
                        new ResChunk(ResType.STEEL, 43392),
                        new ResChunk(ResType.CONCRETE, 135600),
                        new ResChunk(ResType.WOOD, 7594),
                        new ResChunk(ResType.GLASS, 15187),
                        new ResChunk(ResType.MONEY, 4339200)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.CONSTRUCTION, 87200),
                        new ResChunk(ResType.STEEL, 55320),
                        new ResChunk(ResType.CONCRETE, 172875),
                        new ResChunk(ResType.WOOD, 9681),
                        new ResChunk(ResType.GLASS, 19362),
                        new ResChunk(ResType.MONEY, 5532000)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.CONSTRUCTION, 106400),
                        new ResChunk(ResType.STEEL, 69528),
                        new ResChunk(ResType.CONCRETE, 217275),
                        new ResChunk(ResType.WOOD, 12167),
                        new ResChunk(ResType.GLASS, 24335),
                        new ResChunk(ResType.MONEY, 6952800)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.CONSTRUCTION, 128000),
                        new ResChunk(ResType.STEEL, 86160),
                        new ResChunk(ResType.CONCRETE, 269250),
                        new ResChunk(ResType.WOOD, 15078),
                        new ResChunk(ResType.GLASS, 30156),
                        new ResChunk(ResType.MONEY, 8616000)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.CONSTRUCTION, 152000),
                        new ResChunk(ResType.STEEL, 105360),
                        new ResChunk(ResType.CONCRETE, 329250),
                        new ResChunk(ResType.WOOD, 18438),
                        new ResChunk(ResType.GLASS, 36876),
                        new ResChunk(ResType.MONEY, 10536000)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.CONSTRUCTION, 179200),
                        new ResChunk(ResType.STEEL, 128208),
                        new ResChunk(ResType.CONCRETE, 400650),
                        new ResChunk(ResType.WOOD, 22436),
                        new ResChunk(ResType.GLASS, 44873),
                        new ResChunk(ResType.MONEY, 12820800)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.CONSTRUCTION, 209600),
                        new ResChunk(ResType.STEEL, 154960),
                        new ResChunk(ResType.CONCRETE, 484250),
                        new ResChunk(ResType.WOOD, 27118),
                        new ResChunk(ResType.GLASS, 54236),
                        new ResChunk(ResType.MONEY, 15496000)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.CONSTRUCTION, 243200),
                        new ResChunk(ResType.STEEL, 185872),
                        new ResChunk(ResType.CONCRETE, 580850),
                        new ResChunk(ResType.WOOD, 32528),
                        new ResChunk(ResType.GLASS, 65055),
                        new ResChunk(ResType.MONEY, 18587200)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.CONSTRUCTION, 280000),
                        new ResChunk(ResType.STEEL, 221200),
                        new ResChunk(ResType.CONCRETE, 691250),
                        new ResChunk(ResType.WOOD, 38710),
                        new ResChunk(ResType.GLASS, 77420),
                        new ResChunk(ResType.MONEY, 22120000)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.CONSTRUCTION, 320000),
                        new ResChunk(ResType.STEEL, 261200),
                        new ResChunk(ResType.CONCRETE, 816250),
                        new ResChunk(ResType.WOOD, 45710),
                        new ResChunk(ResType.GLASS, 91420),
                        new ResChunk(ResType.MONEY, 26120000)
                )
        });
        setProduction(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.BRICK, 60)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.BRICK, 120)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.BRICK, 180)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.BRICK, 240)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.BRICK, 300)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.BRICK, 420)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.BRICK, 540)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.BRICK, 660)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.BRICK, 780)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.BRICK, 960)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.BRICK, 1140)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.BRICK, 1320)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.BRICK, 1500)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.BRICK, 1680)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.BRICK, 1860)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.BRICK, 2100)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.BRICK, 2340)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.BRICK, 2580)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.BRICK, 2760)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.BRICK, 3000)
                )
        });
        setJobPrice(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.ACTION, 24),
                        new ResChunk(ResType.ENERGY, 24)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.ACTION, 28),
                        new ResChunk(ResType.ENERGY, 28)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.ACTION, 32),
                        new ResChunk(ResType.ENERGY, 32)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.ACTION, 36),
                        new ResChunk(ResType.ENERGY, 36)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.ACTION, 40),
                        new ResChunk(ResType.ENERGY, 40)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.ACTION, 44),
                        new ResChunk(ResType.ENERGY, 44)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.ACTION, 48),
                        new ResChunk(ResType.ENERGY, 48)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.ACTION, 52),
                        new ResChunk(ResType.ENERGY, 52)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.ACTION, 56),
                        new ResChunk(ResType.ENERGY, 56)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.ACTION, 60),
                        new ResChunk(ResType.ENERGY, 60)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.ACTION, 64),
                        new ResChunk(ResType.ENERGY, 64)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.ACTION, 68),
                        new ResChunk(ResType.ENERGY, 68)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.ACTION, 72),
                        new ResChunk(ResType.ENERGY, 72)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.ACTION, 76),
                        new ResChunk(ResType.ENERGY, 76)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.ACTION, 80),
                        new ResChunk(ResType.ENERGY, 80)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.ACTION, 84),
                        new ResChunk(ResType.ENERGY, 84)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.ACTION, 88),
                        new ResChunk(ResType.ENERGY, 88)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.ACTION, 92),
                        new ResChunk(ResType.ENERGY, 92)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.ACTION, 96),
                        new ResChunk(ResType.ENERGY, 96)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.ACTION, 100),
                        new ResChunk(ResType.ENERGY, 100)
                )
        });
        setJobReward(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.BRICK, 30)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.BRICK, 60)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.BRICK, 90)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.BRICK, 120)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.BRICK, 150)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.BRICK, 210)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.BRICK, 270)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.BRICK, 330)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.BRICK, 390)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.BRICK, 480)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.BRICK, 570)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.BRICK, 660)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.BRICK, 750)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.BRICK, 840)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.BRICK, 930)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.BRICK, 1050)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.BRICK, 1170)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.BRICK, 1290)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.BRICK, 1380)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.BRICK, 1500)
                )
        });
        setDemand(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.UPKEEP, 100),
                        new ResChunk(ResType.POWER_CONSUMPTION, 16),
                        new ResChunk(ResType.JOB, 320),
                        new ResChunk(ResType.EMIGRATION, 1),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.UPKEEP, 200),
                        new ResChunk(ResType.POWER_CONSUMPTION, 32),
                        new ResChunk(ResType.JOB, 640),
                        new ResChunk(ResType.EMIGRATION, 2),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.UPKEEP, 300),
                        new ResChunk(ResType.POWER_CONSUMPTION, 48),
                        new ResChunk(ResType.JOB, 960),
                        new ResChunk(ResType.EMIGRATION, 3),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.UPKEEP, 400),
                        new ResChunk(ResType.POWER_CONSUMPTION, 64),
                        new ResChunk(ResType.JOB, 1280),
                        new ResChunk(ResType.EMIGRATION, 4),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.UPKEEP, 500),
                        new ResChunk(ResType.POWER_CONSUMPTION, 80),
                        new ResChunk(ResType.JOB, 1600),
                        new ResChunk(ResType.EMIGRATION, 5),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.UPKEEP, 700),
                        new ResChunk(ResType.POWER_CONSUMPTION, 112),
                        new ResChunk(ResType.JOB, 2240),
                        new ResChunk(ResType.EMIGRATION, 6),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.UPKEEP, 900),
                        new ResChunk(ResType.POWER_CONSUMPTION, 144),
                        new ResChunk(ResType.JOB, 2880),
                        new ResChunk(ResType.EMIGRATION, 7),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.UPKEEP, 1100),
                        new ResChunk(ResType.POWER_CONSUMPTION, 176),
                        new ResChunk(ResType.JOB, 3520),
                        new ResChunk(ResType.EMIGRATION, 8),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.UPKEEP, 1300),
                        new ResChunk(ResType.POWER_CONSUMPTION, 208),
                        new ResChunk(ResType.JOB, 4160),
                        new ResChunk(ResType.EMIGRATION, 9),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.UPKEEP, 1500),
                        new ResChunk(ResType.POWER_CONSUMPTION, 240),
                        new ResChunk(ResType.JOB, 4800),
                        new ResChunk(ResType.EMIGRATION, 10),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.UPKEEP, 1800),
                        new ResChunk(ResType.POWER_CONSUMPTION, 288),
                        new ResChunk(ResType.JOB, 5760),
                        new ResChunk(ResType.EMIGRATION, 11),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.UPKEEP, 2100),
                        new ResChunk(ResType.POWER_CONSUMPTION, 336),
                        new ResChunk(ResType.JOB, 6720),
                        new ResChunk(ResType.EMIGRATION, 12),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.UPKEEP, 2400),
                        new ResChunk(ResType.POWER_CONSUMPTION, 384),
                        new ResChunk(ResType.JOB, 7680),
                        new ResChunk(ResType.EMIGRATION, 13),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.UPKEEP, 2700),
                        new ResChunk(ResType.POWER_CONSUMPTION, 432),
                        new ResChunk(ResType.JOB, 8640),
                        new ResChunk(ResType.EMIGRATION, 14),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.UPKEEP, 3000),
                        new ResChunk(ResType.POWER_CONSUMPTION, 480),
                        new ResChunk(ResType.JOB, 9600),
                        new ResChunk(ResType.EMIGRATION, 15),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.UPKEEP, 3400),
                        new ResChunk(ResType.POWER_CONSUMPTION, 544),
                        new ResChunk(ResType.JOB, 10880),
                        new ResChunk(ResType.EMIGRATION, 16),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.UPKEEP, 3800),
                        new ResChunk(ResType.POWER_CONSUMPTION, 608),
                        new ResChunk(ResType.JOB, 12160),
                        new ResChunk(ResType.EMIGRATION, 17),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.UPKEEP, 4200),
                        new ResChunk(ResType.POWER_CONSUMPTION, 672),
                        new ResChunk(ResType.JOB, 13440),
                        new ResChunk(ResType.EMIGRATION, 18),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.UPKEEP, 4600),
                        new ResChunk(ResType.POWER_CONSUMPTION, 736),
                        new ResChunk(ResType.JOB, 14720),
                        new ResChunk(ResType.EMIGRATION, 19),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.UPKEEP, 5000),
                        new ResChunk(ResType.POWER_CONSUMPTION, 800),
                        new ResChunk(ResType.JOB, 16000),
                        new ResChunk(ResType.EMIGRATION, 20),
                        new ResChunk(ResType.IGNITABILITY, 1)
                )
        });
        setHold(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.POWER, 16),
                        new ResChunk(ResType.WORKER, 320)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.POWER, 32),
                        new ResChunk(ResType.WORKER, 640)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.POWER, 48),
                        new ResChunk(ResType.WORKER, 960)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.POWER, 64),
                        new ResChunk(ResType.WORKER, 1280)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.POWER, 80),
                        new ResChunk(ResType.WORKER, 1600)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.POWER, 112),
                        new ResChunk(ResType.WORKER, 2240)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.POWER, 144),
                        new ResChunk(ResType.WORKER, 2880)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.POWER, 176),
                        new ResChunk(ResType.WORKER, 3520)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.POWER, 208),
                        new ResChunk(ResType.WORKER, 4160)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.POWER, 240),
                        new ResChunk(ResType.WORKER, 4800)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.POWER, 288),
                        new ResChunk(ResType.WORKER, 5760)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.POWER, 336),
                        new ResChunk(ResType.WORKER, 6720)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.POWER, 384),
                        new ResChunk(ResType.WORKER, 7680)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.POWER, 432),
                        new ResChunk(ResType.WORKER, 8640)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.POWER, 480),
                        new ResChunk(ResType.WORKER, 9600)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.POWER, 544),
                        new ResChunk(ResType.WORKER, 10880)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.POWER, 608),
                        new ResChunk(ResType.WORKER, 12160)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.POWER, 672),
                        new ResChunk(ResType.WORKER, 13440)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.POWER, 736),
                        new ResChunk(ResType.WORKER, 14720)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.POWER, 800),
                        new ResChunk(ResType.WORKER, 16000)
                )
        });
    }
}
