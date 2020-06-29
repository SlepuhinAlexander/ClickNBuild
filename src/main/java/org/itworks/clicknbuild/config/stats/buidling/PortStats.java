package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;
import org.itworks.clicknbuild.engine.model.ResourceType;

public final class PortStats extends BuildingStats {
    private static volatile PortStats inst;

    private PortStats() {
    }

    public static PortStats inst() {
        PortStats local = inst;
        if (local == null) {
            synchronized (PortStats.class) {
                local = inst;
                if (local == null) {
                    inst = local = new PortStats();
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
                900, // 1
                2700, // 2
                5400, // 3
                9000, // 4
                13500, // 5
                19800, // 6
                27900, // 7
                37800, // 8
                49500, // 9
                63000, // 10
                79200, // 11
                98100, // 12
                119700, // 13
                144000, // 14
                171000, // 15
                201600, // 16
                235800, // 17
                273600, // 18
                315000, // 19
                360000 // 20
        });
        setBuildCost(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.CONSTRUCTION, 900),
                        new ResourceChunk(ResourceType.STEEL, 330),
                        new ResourceChunk(ResourceType.CONCRETE, 734),
                        new ResourceChunk(ResourceType.BRICK, 275),
                        new ResourceChunk(ResourceType.MONEY, 27540)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.CONSTRUCTION, 2700),
                        new ResourceChunk(ResourceType.STEEL, 1004),
                        new ResourceChunk(ResourceType.CONCRETE, 2232),
                        new ResourceChunk(ResourceType.BRICK, 837),
                        new ResourceChunk(ResourceType.MONEY, 83700)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.CONSTRUCTION, 5400),
                        new ResourceChunk(ResourceType.STEEL, 2035),
                        new ResourceChunk(ResourceType.CONCRETE, 4522),
                        new ResourceChunk(ResourceType.BRICK, 1696),
                        new ResourceChunk(ResourceType.MONEY, 169560)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.CONSTRUCTION, 9000),
                        new ResourceChunk(ResourceType.STEEL, 3434),
                        new ResourceChunk(ResourceType.CONCRETE, 7632),
                        new ResourceChunk(ResourceType.BRICK, 2862),
                        new ResourceChunk(ResourceType.MONEY, 286200)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.CONSTRUCTION, 13500),
                        new ResourceChunk(ResourceType.STEEL, 5216),
                        new ResourceChunk(ResourceType.CONCRETE, 11592),
                        new ResourceChunk(ResourceType.BRICK, 4347),
                        new ResourceChunk(ResourceType.MONEY, 434700)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.CONSTRUCTION, 19800),
                        new ResourceChunk(ResourceType.STEEL, 7802),
                        new ResourceChunk(ResourceType.CONCRETE, 17338),
                        new ResourceChunk(ResourceType.BRICK, 6502),
                        new ResourceChunk(ResourceType.MONEY, 650160)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.CONSTRUCTION, 27900),
                        new ResourceChunk(ResourceType.STEEL, 11243),
                        new ResourceChunk(ResourceType.CONCRETE, 24984),
                        new ResourceChunk(ResourceType.BRICK, 9369),
                        new ResourceChunk(ResourceType.MONEY, 936900)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.CONSTRUCTION, 37800),
                        new ResourceChunk(ResourceType.STEEL, 15591),
                        new ResourceChunk(ResourceType.CONCRETE, 34646),
                        new ResourceChunk(ResourceType.BRICK, 12992),
                        new ResourceChunk(ResourceType.MONEY, 1299240)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.CONSTRUCTION, 49500),
                        new ResourceChunk(ResourceType.STEEL, 20898),
                        new ResourceChunk(ResourceType.CONCRETE, 46440),
                        new ResourceChunk(ResourceType.BRICK, 17415),
                        new ResourceChunk(ResourceType.MONEY, 1741500)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.CONSTRUCTION, 63000),
                        new ResourceChunk(ResourceType.STEEL, 27216),
                        new ResourceChunk(ResourceType.CONCRETE, 60480),
                        new ResourceChunk(ResourceType.BRICK, 22680),
                        new ResourceChunk(ResourceType.MONEY, 2268000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.CONSTRUCTION, 79200),
                        new ResourceChunk(ResourceType.STEEL, 35148),
                        new ResourceChunk(ResourceType.CONCRETE, 78106),
                        new ResourceChunk(ResourceType.BRICK, 29290),
                        new ResourceChunk(ResourceType.MONEY, 2928960)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.CONSTRUCTION, 98100),
                        new ResourceChunk(ResourceType.STEEL, 44809),
                        new ResourceChunk(ResourceType.CONCRETE, 99576),
                        new ResourceChunk(ResourceType.BRICK, 37341),
                        new ResourceChunk(ResourceType.MONEY, 3734100)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.CONSTRUCTION, 119700),
                        new ResourceChunk(ResourceType.STEEL, 56318),
                        new ResourceChunk(ResourceType.CONCRETE, 125150),
                        new ResourceChunk(ResourceType.BRICK, 46931),
                        new ResourceChunk(ResourceType.MONEY, 4693140)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.CONSTRUCTION, 144000),
                        new ResourceChunk(ResourceType.STEEL, 69790),
                        new ResourceChunk(ResourceType.CONCRETE, 155088),
                        new ResourceChunk(ResourceType.BRICK, 58158),
                        new ResourceChunk(ResourceType.MONEY, 5815800)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.CONSTRUCTION, 171000),
                        new ResourceChunk(ResourceType.STEEL, 85342),
                        new ResourceChunk(ResourceType.CONCRETE, 189648),
                        new ResourceChunk(ResourceType.BRICK, 71118),
                        new ResourceChunk(ResourceType.MONEY, 7111800)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.CONSTRUCTION, 201600),
                        new ResourceChunk(ResourceType.STEEL, 103848),
                        new ResourceChunk(ResourceType.CONCRETE, 230774),
                        new ResourceChunk(ResourceType.BRICK, 86540),
                        new ResourceChunk(ResourceType.MONEY, 8654040)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.CONSTRUCTION, 235800),
                        new ResourceChunk(ResourceType.STEEL, 125518),
                        new ResourceChunk(ResourceType.CONCRETE, 278928),
                        new ResourceChunk(ResourceType.BRICK, 104598),
                        new ResourceChunk(ResourceType.MONEY, 10459800)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.CONSTRUCTION, 273600),
                        new ResourceChunk(ResourceType.STEEL, 150556),
                        new ResourceChunk(ResourceType.CONCRETE, 334570),
                        new ResourceChunk(ResourceType.BRICK, 125464),
                        new ResourceChunk(ResourceType.MONEY, 12546360)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.CONSTRUCTION, 315000),
                        new ResourceChunk(ResourceType.STEEL, 179172),
                        new ResourceChunk(ResourceType.CONCRETE, 398160),
                        new ResourceChunk(ResourceType.BRICK, 149310),
                        new ResourceChunk(ResourceType.MONEY, 14931000)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.CONSTRUCTION, 360000),
                        new ResourceChunk(ResourceType.STEEL, 211572),
                        new ResourceChunk(ResourceType.CONCRETE, 470160),
                        new ResourceChunk(ResourceType.BRICK, 176310),
                        new ResourceChunk(ResourceType.MONEY, 17631000)
                )
        });
        setProduction(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.CITIZEN, 10)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.CITIZEN, 20)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.CITIZEN, 30)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.CITIZEN, 40)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.CITIZEN, 50)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.CITIZEN, 70)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.CITIZEN, 90)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.CITIZEN, 110)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.CITIZEN, 130)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.CITIZEN, 150)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.CITIZEN, 180)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.CITIZEN, 210)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.CITIZEN, 240)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.CITIZEN, 270)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.CITIZEN, 300)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.CITIZEN, 340)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.CITIZEN, 380)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.CITIZEN, 420)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.CITIZEN, 460)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.CITIZEN, 500)
                )
        });
        setDemand(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.UPKEEP, 80),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 4),
                        new ResourceChunk(ResourceType.JOB, 80),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.UPKEEP, 160),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 8),
                        new ResourceChunk(ResourceType.JOB, 160),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.UPKEEP, 240),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 12),
                        new ResourceChunk(ResourceType.JOB, 240),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.UPKEEP, 320),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 16),
                        new ResourceChunk(ResourceType.JOB, 320),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.UPKEEP, 400),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 20),
                        new ResourceChunk(ResourceType.JOB, 400),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.UPKEEP, 560),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 28),
                        new ResourceChunk(ResourceType.JOB, 560),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.UPKEEP, 720),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 36),
                        new ResourceChunk(ResourceType.JOB, 720),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.UPKEEP, 880),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 44),
                        new ResourceChunk(ResourceType.JOB, 880),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.UPKEEP, 1040),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 52),
                        new ResourceChunk(ResourceType.JOB, 1040),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.UPKEEP, 1200),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 60),
                        new ResourceChunk(ResourceType.JOB, 1200),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.UPKEEP, 1440),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 72),
                        new ResourceChunk(ResourceType.JOB, 1440),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.UPKEEP, 1680),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 84),
                        new ResourceChunk(ResourceType.JOB, 1680),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.UPKEEP, 1920),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 96),
                        new ResourceChunk(ResourceType.JOB, 1920),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.UPKEEP, 2160),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 108),
                        new ResourceChunk(ResourceType.JOB, 2160),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.UPKEEP, 2400),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 120),
                        new ResourceChunk(ResourceType.JOB, 2400),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.UPKEEP, 2720),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 136),
                        new ResourceChunk(ResourceType.JOB, 2720),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.UPKEEP, 3040),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 152),
                        new ResourceChunk(ResourceType.JOB, 3040),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.UPKEEP, 3360),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 168),
                        new ResourceChunk(ResourceType.JOB, 3360),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.UPKEEP, 3680),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 184),
                        new ResourceChunk(ResourceType.JOB, 3680),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.UPKEEP, 4000),
                        new ResourceChunk(ResourceType.POWER_CONSUMPTION, 200),
                        new ResourceChunk(ResourceType.JOB, 4000),
                        new ResourceChunk(ResourceType.IGNITABILITY, 1)
                )
        });
        setHold(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResourceType.POWER, 4),
                        new ResourceChunk(ResourceType.WORKER, 80)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResourceType.POWER, 8),
                        new ResourceChunk(ResourceType.WORKER, 160)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResourceType.POWER, 12),
                        new ResourceChunk(ResourceType.WORKER, 240)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResourceType.POWER, 16),
                        new ResourceChunk(ResourceType.WORKER, 320)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResourceType.POWER, 20),
                        new ResourceChunk(ResourceType.WORKER, 400)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResourceType.POWER, 28),
                        new ResourceChunk(ResourceType.WORKER, 560)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResourceType.POWER, 36),
                        new ResourceChunk(ResourceType.WORKER, 720)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResourceType.POWER, 44),
                        new ResourceChunk(ResourceType.WORKER, 880)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResourceType.POWER, 52),
                        new ResourceChunk(ResourceType.WORKER, 1040)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResourceType.POWER, 60),
                        new ResourceChunk(ResourceType.WORKER, 1200)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResourceType.POWER, 72),
                        new ResourceChunk(ResourceType.WORKER, 1440)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResourceType.POWER, 84),
                        new ResourceChunk(ResourceType.WORKER, 1680)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResourceType.POWER, 96),
                        new ResourceChunk(ResourceType.WORKER, 1920)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResourceType.POWER, 108),
                        new ResourceChunk(ResourceType.WORKER, 2160)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResourceType.POWER, 120),
                        new ResourceChunk(ResourceType.WORKER, 2400)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResourceType.POWER, 136),
                        new ResourceChunk(ResourceType.WORKER, 2720)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResourceType.POWER, 152),
                        new ResourceChunk(ResourceType.WORKER, 3040)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResourceType.POWER, 168),
                        new ResourceChunk(ResourceType.WORKER, 3360)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResourceType.POWER, 184),
                        new ResourceChunk(ResourceType.WORKER, 3680)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResourceType.POWER, 200),
                        new ResourceChunk(ResourceType.WORKER, 4000)
                )
        });
    }
}
