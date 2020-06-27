package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;
import org.itworks.clicknbuild.engine.model.ResourceType;

public final class FactoryGlassStats extends BuildingStats {
    private static final FactoryGlassStats INST = new FactoryGlassStats();

    private FactoryGlassStats() {
    }

    public static FactoryGlassStats inst() {
        return INST;
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
                        new ResourceChunk(ResourceType.CONSTRUCTION, 800),
                        new ResourceChunk(ResourceType.STEEL, 408),
                        new ResourceChunk(ResourceType.CONCRETE, 1275),
                        new ResourceChunk(ResourceType.BRICK, 1020),
                        new ResourceChunk(ResourceType.WOOD, 71),
                        new ResourceChunk(ResourceType.MONEY, 40800)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.CONSTRUCTION, 2400),
                        new ResourceChunk(ResourceType.STEEL, 1240),
                        new ResourceChunk(ResourceType.CONCRETE, 3875),
                        new ResourceChunk(ResourceType.BRICK, 3100),
                        new ResourceChunk(ResourceType.WOOD, 217),
                        new ResourceChunk(ResourceType.MONEY, 124000)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.CONSTRUCTION, 4800),
                        new ResourceChunk(ResourceType.STEEL, 2512),
                        new ResourceChunk(ResourceType.CONCRETE, 7850),
                        new ResourceChunk(ResourceType.BRICK, 6280),
                        new ResourceChunk(ResourceType.WOOD, 440),
                        new ResourceChunk(ResourceType.MONEY, 251200)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.CONSTRUCTION, 8000),
                        new ResourceChunk(ResourceType.STEEL, 4240),
                        new ResourceChunk(ResourceType.CONCRETE, 13250),
                        new ResourceChunk(ResourceType.BRICK, 10600),
                        new ResourceChunk(ResourceType.WOOD, 742),
                        new ResourceChunk(ResourceType.MONEY, 424000)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.CONSTRUCTION, 12000),
                        new ResourceChunk(ResourceType.STEEL, 6440),
                        new ResourceChunk(ResourceType.CONCRETE, 20125),
                        new ResourceChunk(ResourceType.BRICK, 16100),
                        new ResourceChunk(ResourceType.WOOD, 1127),
                        new ResourceChunk(ResourceType.MONEY, 644000)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.CONSTRUCTION, 17600),
                        new ResourceChunk(ResourceType.STEEL, 9632),
                        new ResourceChunk(ResourceType.CONCRETE, 30100),
                        new ResourceChunk(ResourceType.BRICK, 24080),
                        new ResourceChunk(ResourceType.WOOD, 1686),
                        new ResourceChunk(ResourceType.MONEY, 963200)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.CONSTRUCTION, 24800),
                        new ResourceChunk(ResourceType.STEEL, 13880),
                        new ResourceChunk(ResourceType.CONCRETE, 43375),
                        new ResourceChunk(ResourceType.BRICK, 34700),
                        new ResourceChunk(ResourceType.WOOD, 2429),
                        new ResourceChunk(ResourceType.MONEY, 1388000)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.CONSTRUCTION, 33600),
                        new ResourceChunk(ResourceType.STEEL, 19248),
                        new ResourceChunk(ResourceType.CONCRETE, 60150),
                        new ResourceChunk(ResourceType.BRICK, 48120),
                        new ResourceChunk(ResourceType.WOOD, 3368),
                        new ResourceChunk(ResourceType.MONEY, 1924800)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.CONSTRUCTION, 44000),
                        new ResourceChunk(ResourceType.STEEL, 25800),
                        new ResourceChunk(ResourceType.CONCRETE, 80625),
                        new ResourceChunk(ResourceType.BRICK, 64500),
                        new ResourceChunk(ResourceType.WOOD, 4515),
                        new ResourceChunk(ResourceType.MONEY, 2580000)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.CONSTRUCTION, 56000),
                        new ResourceChunk(ResourceType.STEEL, 33600),
                        new ResourceChunk(ResourceType.CONCRETE, 105000),
                        new ResourceChunk(ResourceType.BRICK, 84000),
                        new ResourceChunk(ResourceType.WOOD, 5880),
                        new ResourceChunk(ResourceType.MONEY, 3360000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.CONSTRUCTION, 70400),
                        new ResourceChunk(ResourceType.STEEL, 43392),
                        new ResourceChunk(ResourceType.CONCRETE, 135600),
                        new ResourceChunk(ResourceType.BRICK, 108480),
                        new ResourceChunk(ResourceType.WOOD, 7594),
                        new ResourceChunk(ResourceType.MONEY, 4339200)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.CONSTRUCTION, 87200),
                        new ResourceChunk(ResourceType.STEEL, 55320),
                        new ResourceChunk(ResourceType.CONCRETE, 172875),
                        new ResourceChunk(ResourceType.BRICK, 138300),
                        new ResourceChunk(ResourceType.WOOD, 9681),
                        new ResourceChunk(ResourceType.MONEY, 5532000)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.CONSTRUCTION, 106400),
                        new ResourceChunk(ResourceType.STEEL, 69528),
                        new ResourceChunk(ResourceType.CONCRETE, 217275),
                        new ResourceChunk(ResourceType.BRICK, 173820),
                        new ResourceChunk(ResourceType.WOOD, 12167),
                        new ResourceChunk(ResourceType.MONEY, 6952800)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.CONSTRUCTION, 128000),
                        new ResourceChunk(ResourceType.STEEL, 86160),
                        new ResourceChunk(ResourceType.CONCRETE, 269250),
                        new ResourceChunk(ResourceType.BRICK, 215400),
                        new ResourceChunk(ResourceType.WOOD, 15078),
                        new ResourceChunk(ResourceType.MONEY, 8616000)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.CONSTRUCTION, 152000),
                        new ResourceChunk(ResourceType.STEEL, 105360),
                        new ResourceChunk(ResourceType.CONCRETE, 329250),
                        new ResourceChunk(ResourceType.BRICK, 263400),
                        new ResourceChunk(ResourceType.WOOD, 18438),
                        new ResourceChunk(ResourceType.MONEY, 10536000)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.CONSTRUCTION, 179200),
                        new ResourceChunk(ResourceType.STEEL, 128208),
                        new ResourceChunk(ResourceType.CONCRETE, 400650),
                        new ResourceChunk(ResourceType.BRICK, 320520),
                        new ResourceChunk(ResourceType.WOOD, 22436),
                        new ResourceChunk(ResourceType.MONEY, 12820800)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.CONSTRUCTION, 209600),
                        new ResourceChunk(ResourceType.STEEL, 154960),
                        new ResourceChunk(ResourceType.CONCRETE, 484250),
                        new ResourceChunk(ResourceType.BRICK, 387400),
                        new ResourceChunk(ResourceType.WOOD, 27118),
                        new ResourceChunk(ResourceType.MONEY, 15496000)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.CONSTRUCTION, 243200),
                        new ResourceChunk(ResourceType.STEEL, 185872),
                        new ResourceChunk(ResourceType.CONCRETE, 580850),
                        new ResourceChunk(ResourceType.BRICK, 464680),
                        new ResourceChunk(ResourceType.WOOD, 32528),
                        new ResourceChunk(ResourceType.MONEY, 18587200)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.CONSTRUCTION, 280000),
                        new ResourceChunk(ResourceType.STEEL, 221200),
                        new ResourceChunk(ResourceType.CONCRETE, 691250),
                        new ResourceChunk(ResourceType.BRICK, 553000),
                        new ResourceChunk(ResourceType.WOOD, 38710),
                        new ResourceChunk(ResourceType.MONEY, 22120000)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.CONSTRUCTION, 320000),
                        new ResourceChunk(ResourceType.STEEL, 261200),
                        new ResourceChunk(ResourceType.CONCRETE, 816250),
                        new ResourceChunk(ResourceType.BRICK, 653000),
                        new ResourceChunk(ResourceType.WOOD, 45710),
                        new ResourceChunk(ResourceType.MONEY, 26120000)
                )
        });
        setProduction(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.GLASS, 40)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.GLASS, 80)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.GLASS, 120)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.GLASS, 160)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.GLASS, 200)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.GLASS, 280)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.GLASS, 360)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.GLASS, 440)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.GLASS, 520)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.GLASS, 600)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.GLASS, 720)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.GLASS, 840)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.GLASS, 960)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.GLASS, 1080)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.GLASS, 1200)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.GLASS, 1360)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.GLASS, 1520)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.GLASS, 1680)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.GLASS, 1840)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.GLASS, 2000)
                )
        });
        setJobPrice(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.ACTION, 24),
                        new ResourceChunk(ResourceType.ENERGY, 24)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.ACTION, 28),
                        new ResourceChunk(ResourceType.ENERGY, 28)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.ACTION, 32),
                        new ResourceChunk(ResourceType.ENERGY, 32)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.ACTION, 36),
                        new ResourceChunk(ResourceType.ENERGY, 36)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.ACTION, 40),
                        new ResourceChunk(ResourceType.ENERGY, 40)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.ACTION, 44),
                        new ResourceChunk(ResourceType.ENERGY, 44)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.ACTION, 48),
                        new ResourceChunk(ResourceType.ENERGY, 48)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.ACTION, 52),
                        new ResourceChunk(ResourceType.ENERGY, 52)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.ACTION, 56),
                        new ResourceChunk(ResourceType.ENERGY, 56)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.ACTION, 60),
                        new ResourceChunk(ResourceType.ENERGY, 60)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.ACTION, 64),
                        new ResourceChunk(ResourceType.ENERGY, 64)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.ACTION, 68),
                        new ResourceChunk(ResourceType.ENERGY, 68)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.ACTION, 72),
                        new ResourceChunk(ResourceType.ENERGY, 72)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.ACTION, 76),
                        new ResourceChunk(ResourceType.ENERGY, 76)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.ACTION, 80),
                        new ResourceChunk(ResourceType.ENERGY, 80)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.ACTION, 84),
                        new ResourceChunk(ResourceType.ENERGY, 84)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.ACTION, 88),
                        new ResourceChunk(ResourceType.ENERGY, 88)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.ACTION, 92),
                        new ResourceChunk(ResourceType.ENERGY, 92)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.ACTION, 96),
                        new ResourceChunk(ResourceType.ENERGY, 96)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.ACTION, 100),
                        new ResourceChunk(ResourceType.ENERGY, 100)
                )
        });
        setJobReward(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.GLASS, 20)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.GLASS, 40)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.GLASS, 60)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.GLASS, 80)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.GLASS, 100)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.GLASS, 140)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.GLASS, 180)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.GLASS, 220)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.GLASS, 260)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.GLASS, 300)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.GLASS, 360)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.GLASS, 420)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.GLASS, 480)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.GLASS, 540)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.GLASS, 600)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.GLASS, 680)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.GLASS, 760)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.GLASS, 840)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.GLASS, 920)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.GLASS, 1000)
                )
        });
        setDemand(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.UPKEEP, 100),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 16),
                        new ResourceChunk(ResourceType.JOB, 320),
                        new ResourceChunk(ResourceType.EMIGRATION, 1),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.UPKEEP, 200),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 32),
                        new ResourceChunk(ResourceType.JOB, 640),
                        new ResourceChunk(ResourceType.EMIGRATION, 2),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.UPKEEP, 300),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 48),
                        new ResourceChunk(ResourceType.JOB, 960),
                        new ResourceChunk(ResourceType.EMIGRATION, 3),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.UPKEEP, 400),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 64),
                        new ResourceChunk(ResourceType.JOB, 1280),
                        new ResourceChunk(ResourceType.EMIGRATION, 4),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.UPKEEP, 500),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 80),
                        new ResourceChunk(ResourceType.JOB, 1600),
                        new ResourceChunk(ResourceType.EMIGRATION, 5),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.UPKEEP, 700),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 112),
                        new ResourceChunk(ResourceType.JOB, 2240),
                        new ResourceChunk(ResourceType.EMIGRATION, 6),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.UPKEEP, 900),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 144),
                        new ResourceChunk(ResourceType.JOB, 2880),
                        new ResourceChunk(ResourceType.EMIGRATION, 7),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.UPKEEP, 1100),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 176),
                        new ResourceChunk(ResourceType.JOB, 3520),
                        new ResourceChunk(ResourceType.EMIGRATION, 8),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.UPKEEP, 1300),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 208),
                        new ResourceChunk(ResourceType.JOB, 4160),
                        new ResourceChunk(ResourceType.EMIGRATION, 9),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.UPKEEP, 1500),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 240),
                        new ResourceChunk(ResourceType.JOB, 4800),
                        new ResourceChunk(ResourceType.EMIGRATION, 10),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.UPKEEP, 1800),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 288),
                        new ResourceChunk(ResourceType.JOB, 5760),
                        new ResourceChunk(ResourceType.EMIGRATION, 11),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.UPKEEP, 2100),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 336),
                        new ResourceChunk(ResourceType.JOB, 6720),
                        new ResourceChunk(ResourceType.EMIGRATION, 12),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.UPKEEP, 2400),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 384),
                        new ResourceChunk(ResourceType.JOB, 7680),
                        new ResourceChunk(ResourceType.EMIGRATION, 13),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.UPKEEP, 2700),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 432),
                        new ResourceChunk(ResourceType.JOB, 8640),
                        new ResourceChunk(ResourceType.EMIGRATION, 14),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.UPKEEP, 3000),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 480),
                        new ResourceChunk(ResourceType.JOB, 9600),
                        new ResourceChunk(ResourceType.EMIGRATION, 15),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.UPKEEP, 3400),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 544),
                        new ResourceChunk(ResourceType.JOB, 10880),
                        new ResourceChunk(ResourceType.EMIGRATION, 16),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.UPKEEP, 3800),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 608),
                        new ResourceChunk(ResourceType.JOB, 12160),
                        new ResourceChunk(ResourceType.EMIGRATION, 17),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.UPKEEP, 4200),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 672),
                        new ResourceChunk(ResourceType.JOB, 13440),
                        new ResourceChunk(ResourceType.EMIGRATION, 18),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.UPKEEP, 4600),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 736),
                        new ResourceChunk(ResourceType.JOB, 14720),
                        new ResourceChunk(ResourceType.EMIGRATION, 19),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.UPKEEP, 5000),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 800),
                        new ResourceChunk(ResourceType.JOB, 16000),
                        new ResourceChunk(ResourceType.EMIGRATION, 20),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                )
        });
        setHold(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.POWER, 16),
                        new ResourceChunk(ResourceType.WORKER, 320)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.POWER, 32),
                        new ResourceChunk(ResourceType.WORKER, 640)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.POWER, 48),
                        new ResourceChunk(ResourceType.WORKER, 960)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.POWER, 64),
                        new ResourceChunk(ResourceType.WORKER, 1280)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.POWER, 80),
                        new ResourceChunk(ResourceType.WORKER, 1600)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.POWER, 112),
                        new ResourceChunk(ResourceType.WORKER, 2240)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.POWER, 144),
                        new ResourceChunk(ResourceType.WORKER, 2880)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.POWER, 176),
                        new ResourceChunk(ResourceType.WORKER, 3520)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.POWER, 208),
                        new ResourceChunk(ResourceType.WORKER, 4160)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.POWER, 240),
                        new ResourceChunk(ResourceType.WORKER, 4800)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.POWER, 288),
                        new ResourceChunk(ResourceType.WORKER, 5760)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.POWER, 336),
                        new ResourceChunk(ResourceType.WORKER, 6720)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.POWER, 384),
                        new ResourceChunk(ResourceType.WORKER, 7680)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.POWER, 432),
                        new ResourceChunk(ResourceType.WORKER, 8640)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.POWER, 480),
                        new ResourceChunk(ResourceType.WORKER, 9600)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.POWER, 544),
                        new ResourceChunk(ResourceType.WORKER, 10880)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.POWER, 608),
                        new ResourceChunk(ResourceType.WORKER, 12160)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.POWER, 672),
                        new ResourceChunk(ResourceType.WORKER, 13440)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.POWER, 736),
                        new ResourceChunk(ResourceType.WORKER, 14720)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.POWER, 800),
                        new ResourceChunk(ResourceType.WORKER, 16000)
                )
        });
    }
}
