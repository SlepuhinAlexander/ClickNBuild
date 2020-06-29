package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;
import org.itworks.clicknbuild.engine.model.ResType;

public final class FactoryWoodStats extends BuildingStats {
    private static volatile FactoryWoodStats inst;

    private FactoryWoodStats() {
    }

    public static FactoryWoodStats inst() {
        FactoryWoodStats local = inst;
        if (local == null) {
            synchronized (FactoryWoodStats.class) {
                local = inst;
                if (local == null) {
                    inst = local = new FactoryWoodStats();
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
        setBuildCost(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.CONSTRUCTION, 800),
                        new ResourceChunk(ResType.STEEL, 408),
                        new ResourceChunk(ResType.CONCRETE, 1275),
                        new ResourceChunk(ResType.BRICK, 1020),
                        new ResourceChunk(ResType.GLASS, 143),
                        new ResourceChunk(ResType.MONEY, 40800)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.CONSTRUCTION, 2400),
                        new ResourceChunk(ResType.STEEL, 1240),
                        new ResourceChunk(ResType.CONCRETE, 3875),
                        new ResourceChunk(ResType.BRICK, 3100),
                        new ResourceChunk(ResType.GLASS, 434),
                        new ResourceChunk(ResType.MONEY, 124000)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.CONSTRUCTION, 4800),
                        new ResourceChunk(ResType.STEEL, 2512),
                        new ResourceChunk(ResType.CONCRETE, 7850),
                        new ResourceChunk(ResType.BRICK, 6280),
                        new ResourceChunk(ResType.GLASS, 879),
                        new ResourceChunk(ResType.MONEY, 251200)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.CONSTRUCTION, 8000),
                        new ResourceChunk(ResType.STEEL, 4240),
                        new ResourceChunk(ResType.CONCRETE, 13250),
                        new ResourceChunk(ResType.BRICK, 10600),
                        new ResourceChunk(ResType.GLASS, 1484),
                        new ResourceChunk(ResType.MONEY, 424000)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.CONSTRUCTION, 12000),
                        new ResourceChunk(ResType.STEEL, 6440),
                        new ResourceChunk(ResType.CONCRETE, 20125),
                        new ResourceChunk(ResType.BRICK, 16100),
                        new ResourceChunk(ResType.GLASS, 2254),
                        new ResourceChunk(ResType.MONEY, 644000)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.CONSTRUCTION, 17600),
                        new ResourceChunk(ResType.STEEL, 9632),
                        new ResourceChunk(ResType.CONCRETE, 30100),
                        new ResourceChunk(ResType.BRICK, 24080),
                        new ResourceChunk(ResType.GLASS, 3371),
                        new ResourceChunk(ResType.MONEY, 963200)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.CONSTRUCTION, 24800),
                        new ResourceChunk(ResType.STEEL, 13880),
                        new ResourceChunk(ResType.CONCRETE, 43375),
                        new ResourceChunk(ResType.BRICK, 34700),
                        new ResourceChunk(ResType.GLASS, 4858),
                        new ResourceChunk(ResType.MONEY, 1388000)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.CONSTRUCTION, 33600),
                        new ResourceChunk(ResType.STEEL, 19248),
                        new ResourceChunk(ResType.CONCRETE, 60150),
                        new ResourceChunk(ResType.BRICK, 48120),
                        new ResourceChunk(ResType.GLASS, 67737),
                        new ResourceChunk(ResType.MONEY, 1924800)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.CONSTRUCTION, 44000),
                        new ResourceChunk(ResType.STEEL, 25800),
                        new ResourceChunk(ResType.CONCRETE, 80625),
                        new ResourceChunk(ResType.BRICK, 64500),
                        new ResourceChunk(ResType.GLASS, 9030),
                        new ResourceChunk(ResType.MONEY, 2580000)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.CONSTRUCTION, 56000),
                        new ResourceChunk(ResType.STEEL, 33600),
                        new ResourceChunk(ResType.CONCRETE, 105000),
                        new ResourceChunk(ResType.BRICK, 84000),
                        new ResourceChunk(ResType.GLASS, 11760),
                        new ResourceChunk(ResType.MONEY, 3360000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.CONSTRUCTION, 70400),
                        new ResourceChunk(ResType.STEEL, 43392),
                        new ResourceChunk(ResType.CONCRETE, 135600),
                        new ResourceChunk(ResType.BRICK, 108480),
                        new ResourceChunk(ResType.GLASS, 15187),
                        new ResourceChunk(ResType.MONEY, 4339200)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.CONSTRUCTION, 87200),
                        new ResourceChunk(ResType.STEEL, 55320),
                        new ResourceChunk(ResType.CONCRETE, 172875),
                        new ResourceChunk(ResType.BRICK, 138300),
                        new ResourceChunk(ResType.GLASS, 19362),
                        new ResourceChunk(ResType.MONEY, 5532000)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.CONSTRUCTION, 106400),
                        new ResourceChunk(ResType.STEEL, 69528),
                        new ResourceChunk(ResType.CONCRETE, 217275),
                        new ResourceChunk(ResType.BRICK, 173820),
                        new ResourceChunk(ResType.GLASS, 24335),
                        new ResourceChunk(ResType.MONEY, 6952800)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.CONSTRUCTION, 128000),
                        new ResourceChunk(ResType.STEEL, 86160),
                        new ResourceChunk(ResType.CONCRETE, 269250),
                        new ResourceChunk(ResType.BRICK, 215400),
                        new ResourceChunk(ResType.GLASS, 30156),
                        new ResourceChunk(ResType.MONEY, 8616000)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.CONSTRUCTION, 152000),
                        new ResourceChunk(ResType.STEEL, 105360),
                        new ResourceChunk(ResType.CONCRETE, 329250),
                        new ResourceChunk(ResType.BRICK, 263400),
                        new ResourceChunk(ResType.GLASS, 36876),
                        new ResourceChunk(ResType.MONEY, 10536000)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.CONSTRUCTION, 179200),
                        new ResourceChunk(ResType.STEEL, 128208),
                        new ResourceChunk(ResType.CONCRETE, 400650),
                        new ResourceChunk(ResType.BRICK, 320520),
                        new ResourceChunk(ResType.GLASS, 44873),
                        new ResourceChunk(ResType.MONEY, 12820800)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.CONSTRUCTION, 209600),
                        new ResourceChunk(ResType.STEEL, 154960),
                        new ResourceChunk(ResType.CONCRETE, 484250),
                        new ResourceChunk(ResType.BRICK, 387400),
                        new ResourceChunk(ResType.GLASS, 54236),
                        new ResourceChunk(ResType.MONEY, 15496000)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.CONSTRUCTION, 243200),
                        new ResourceChunk(ResType.STEEL, 185872),
                        new ResourceChunk(ResType.CONCRETE, 580850),
                        new ResourceChunk(ResType.BRICK, 464680),
                        new ResourceChunk(ResType.GLASS, 65055),
                        new ResourceChunk(ResType.MONEY, 18587200)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.CONSTRUCTION, 280000),
                        new ResourceChunk(ResType.STEEL, 221200),
                        new ResourceChunk(ResType.CONCRETE, 691250),
                        new ResourceChunk(ResType.BRICK, 553000),
                        new ResourceChunk(ResType.GLASS, 77420),
                        new ResourceChunk(ResType.MONEY, 22120000)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.CONSTRUCTION, 320000),
                        new ResourceChunk(ResType.STEEL, 261200),
                        new ResourceChunk(ResType.CONCRETE, 816250),
                        new ResourceChunk(ResType.BRICK, 653000),
                        new ResourceChunk(ResType.GLASS, 91420),
                        new ResourceChunk(ResType.MONEY, 26120000)
                )
        });
        setProduction(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.WOOD, 20)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.WOOD, 40)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.WOOD, 60)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.WOOD, 80)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.WOOD, 100)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.WOOD, 140)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.WOOD, 180)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.WOOD, 220)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.WOOD, 260)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.WOOD, 320)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.WOOD, 380)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.WOOD, 440)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.WOOD, 500)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.WOOD, 560)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.WOOD, 620)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.WOOD, 700)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.WOOD, 780)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.WOOD, 860)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.WOOD, 920)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.WOOD, 1000)
                )
        });
        setJobPrice(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.ACTION, 24),
                        new ResourceChunk(ResType.ENERGY, 24)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.ACTION, 28),
                        new ResourceChunk(ResType.ENERGY, 28)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.ACTION, 32),
                        new ResourceChunk(ResType.ENERGY, 32)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.ACTION, 36),
                        new ResourceChunk(ResType.ENERGY, 36)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.ACTION, 40),
                        new ResourceChunk(ResType.ENERGY, 40)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.ACTION, 44),
                        new ResourceChunk(ResType.ENERGY, 44)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.ACTION, 48),
                        new ResourceChunk(ResType.ENERGY, 48)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.ACTION, 52),
                        new ResourceChunk(ResType.ENERGY, 52)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.ACTION, 56),
                        new ResourceChunk(ResType.ENERGY, 56)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.ACTION, 60),
                        new ResourceChunk(ResType.ENERGY, 60)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.ACTION, 64),
                        new ResourceChunk(ResType.ENERGY, 64)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.ACTION, 68),
                        new ResourceChunk(ResType.ENERGY, 68)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.ACTION, 72),
                        new ResourceChunk(ResType.ENERGY, 72)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.ACTION, 76),
                        new ResourceChunk(ResType.ENERGY, 76)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.ACTION, 80),
                        new ResourceChunk(ResType.ENERGY, 80)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.ACTION, 84),
                        new ResourceChunk(ResType.ENERGY, 84)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.ACTION, 88),
                        new ResourceChunk(ResType.ENERGY, 88)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.ACTION, 92),
                        new ResourceChunk(ResType.ENERGY, 92)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.ACTION, 96),
                        new ResourceChunk(ResType.ENERGY, 96)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.ACTION, 100),
                        new ResourceChunk(ResType.ENERGY, 100)
                )
        });
        setJobReward(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.WOOD, 10)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.WOOD, 20)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.WOOD, 30)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.WOOD, 40)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.WOOD, 50)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.WOOD, 70)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.WOOD, 90)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.WOOD, 110)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.WOOD, 130)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.WOOD, 160)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.WOOD, 190)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.WOOD, 220)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.WOOD, 250)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.WOOD, 280)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.WOOD, 310)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.WOOD, 350)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.WOOD, 390)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.WOOD, 430)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.WOOD, 460)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.WOOD, 500)
                )
        });
        setDemand(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.UPKEEP, 100),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 16),
                        new ResourceChunk(ResType.JOB, 320),
                        new ResourceChunk(ResType.EMIGRATION, 1),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.UPKEEP, 200),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 32),
                        new ResourceChunk(ResType.JOB, 640),
                        new ResourceChunk(ResType.EMIGRATION, 2),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.UPKEEP, 300),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 48),
                        new ResourceChunk(ResType.JOB, 960),
                        new ResourceChunk(ResType.EMIGRATION, 3),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.UPKEEP, 400),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 64),
                        new ResourceChunk(ResType.JOB, 1280),
                        new ResourceChunk(ResType.EMIGRATION, 4),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.UPKEEP, 500),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 80),
                        new ResourceChunk(ResType.JOB, 1600),
                        new ResourceChunk(ResType.EMIGRATION, 5),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.UPKEEP, 700),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 112),
                        new ResourceChunk(ResType.JOB, 2240),
                        new ResourceChunk(ResType.EMIGRATION, 6),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.UPKEEP, 900),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 144),
                        new ResourceChunk(ResType.JOB, 2880),
                        new ResourceChunk(ResType.EMIGRATION, 7),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.UPKEEP, 1100),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 176),
                        new ResourceChunk(ResType.JOB, 3520),
                        new ResourceChunk(ResType.EMIGRATION, 8),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.UPKEEP, 1300),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 208),
                        new ResourceChunk(ResType.JOB, 4160),
                        new ResourceChunk(ResType.EMIGRATION, 9),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.UPKEEP, 1500),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 240),
                        new ResourceChunk(ResType.JOB, 4800),
                        new ResourceChunk(ResType.EMIGRATION, 10),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.UPKEEP, 1800),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 288),
                        new ResourceChunk(ResType.JOB, 5760),
                        new ResourceChunk(ResType.EMIGRATION, 11),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.UPKEEP, 2100),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 336),
                        new ResourceChunk(ResType.JOB, 6720),
                        new ResourceChunk(ResType.EMIGRATION, 12),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.UPKEEP, 2400),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 384),
                        new ResourceChunk(ResType.JOB, 7680),
                        new ResourceChunk(ResType.EMIGRATION, 13),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.UPKEEP, 2700),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 432),
                        new ResourceChunk(ResType.JOB, 8640),
                        new ResourceChunk(ResType.EMIGRATION, 14),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.UPKEEP, 3000),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 480),
                        new ResourceChunk(ResType.JOB, 9600),
                        new ResourceChunk(ResType.EMIGRATION, 15),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.UPKEEP, 3400),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 544),
                        new ResourceChunk(ResType.JOB, 10880),
                        new ResourceChunk(ResType.EMIGRATION, 16),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.UPKEEP, 3800),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 608),
                        new ResourceChunk(ResType.JOB, 12160),
                        new ResourceChunk(ResType.EMIGRATION, 17),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.UPKEEP, 4200),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 672),
                        new ResourceChunk(ResType.JOB, 13440),
                        new ResourceChunk(ResType.EMIGRATION, 18),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.UPKEEP, 4600),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 736),
                        new ResourceChunk(ResType.JOB, 14720),
                        new ResourceChunk(ResType.EMIGRATION, 19),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.UPKEEP, 5000),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 800),
                        new ResourceChunk(ResType.JOB, 16000),
                        new ResourceChunk(ResType.EMIGRATION, 20),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                )
        });
        setHold(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.POWER, 16),
                        new ResourceChunk(ResType.WORKER, 320)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.POWER, 32),
                        new ResourceChunk(ResType.WORKER, 640)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.POWER, 48),
                        new ResourceChunk(ResType.WORKER, 960)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.POWER, 64),
                        new ResourceChunk(ResType.WORKER, 1280)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.POWER, 80),
                        new ResourceChunk(ResType.WORKER, 1600)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.POWER, 112),
                        new ResourceChunk(ResType.WORKER, 2240)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.POWER, 144),
                        new ResourceChunk(ResType.WORKER, 2880)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.POWER, 176),
                        new ResourceChunk(ResType.WORKER, 3520)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.POWER, 208),
                        new ResourceChunk(ResType.WORKER, 4160)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.POWER, 240),
                        new ResourceChunk(ResType.WORKER, 4800)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.POWER, 288),
                        new ResourceChunk(ResType.WORKER, 5760)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.POWER, 336),
                        new ResourceChunk(ResType.WORKER, 6720)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.POWER, 384),
                        new ResourceChunk(ResType.WORKER, 7680)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.POWER, 432),
                        new ResourceChunk(ResType.WORKER, 8640)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.POWER, 480),
                        new ResourceChunk(ResType.WORKER, 9600)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.POWER, 544),
                        new ResourceChunk(ResType.WORKER, 10880)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.POWER, 608),
                        new ResourceChunk(ResType.WORKER, 12160)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.POWER, 672),
                        new ResourceChunk(ResType.WORKER, 13440)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.POWER, 736),
                        new ResourceChunk(ResType.WORKER, 14720)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.POWER, 800),
                        new ResourceChunk(ResType.WORKER, 16000)
                )
        });
    }
}
