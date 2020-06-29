package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResourceChunk;
import org.itworks.clicknbuild.engine.model.ResourcePack;
import org.itworks.clicknbuild.engine.model.ResType;

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
                        new ResourceChunk(ResType.CONSTRUCTION, 900),
                        new ResourceChunk(ResType.STEEL, 330),
                        new ResourceChunk(ResType.CONCRETE, 734),
                        new ResourceChunk(ResType.BRICK, 275),
                        new ResourceChunk(ResType.MONEY, 27540)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.CONSTRUCTION, 2700),
                        new ResourceChunk(ResType.STEEL, 1004),
                        new ResourceChunk(ResType.CONCRETE, 2232),
                        new ResourceChunk(ResType.BRICK, 837),
                        new ResourceChunk(ResType.MONEY, 83700)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.CONSTRUCTION, 5400),
                        new ResourceChunk(ResType.STEEL, 2035),
                        new ResourceChunk(ResType.CONCRETE, 4522),
                        new ResourceChunk(ResType.BRICK, 1696),
                        new ResourceChunk(ResType.MONEY, 169560)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.CONSTRUCTION, 9000),
                        new ResourceChunk(ResType.STEEL, 3434),
                        new ResourceChunk(ResType.CONCRETE, 7632),
                        new ResourceChunk(ResType.BRICK, 2862),
                        new ResourceChunk(ResType.MONEY, 286200)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.CONSTRUCTION, 13500),
                        new ResourceChunk(ResType.STEEL, 5216),
                        new ResourceChunk(ResType.CONCRETE, 11592),
                        new ResourceChunk(ResType.BRICK, 4347),
                        new ResourceChunk(ResType.MONEY, 434700)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.CONSTRUCTION, 19800),
                        new ResourceChunk(ResType.STEEL, 7802),
                        new ResourceChunk(ResType.CONCRETE, 17338),
                        new ResourceChunk(ResType.BRICK, 6502),
                        new ResourceChunk(ResType.MONEY, 650160)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.CONSTRUCTION, 27900),
                        new ResourceChunk(ResType.STEEL, 11243),
                        new ResourceChunk(ResType.CONCRETE, 24984),
                        new ResourceChunk(ResType.BRICK, 9369),
                        new ResourceChunk(ResType.MONEY, 936900)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.CONSTRUCTION, 37800),
                        new ResourceChunk(ResType.STEEL, 15591),
                        new ResourceChunk(ResType.CONCRETE, 34646),
                        new ResourceChunk(ResType.BRICK, 12992),
                        new ResourceChunk(ResType.MONEY, 1299240)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.CONSTRUCTION, 49500),
                        new ResourceChunk(ResType.STEEL, 20898),
                        new ResourceChunk(ResType.CONCRETE, 46440),
                        new ResourceChunk(ResType.BRICK, 17415),
                        new ResourceChunk(ResType.MONEY, 1741500)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.CONSTRUCTION, 63000),
                        new ResourceChunk(ResType.STEEL, 27216),
                        new ResourceChunk(ResType.CONCRETE, 60480),
                        new ResourceChunk(ResType.BRICK, 22680),
                        new ResourceChunk(ResType.MONEY, 2268000)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.CONSTRUCTION, 79200),
                        new ResourceChunk(ResType.STEEL, 35148),
                        new ResourceChunk(ResType.CONCRETE, 78106),
                        new ResourceChunk(ResType.BRICK, 29290),
                        new ResourceChunk(ResType.MONEY, 2928960)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.CONSTRUCTION, 98100),
                        new ResourceChunk(ResType.STEEL, 44809),
                        new ResourceChunk(ResType.CONCRETE, 99576),
                        new ResourceChunk(ResType.BRICK, 37341),
                        new ResourceChunk(ResType.MONEY, 3734100)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.CONSTRUCTION, 119700),
                        new ResourceChunk(ResType.STEEL, 56318),
                        new ResourceChunk(ResType.CONCRETE, 125150),
                        new ResourceChunk(ResType.BRICK, 46931),
                        new ResourceChunk(ResType.MONEY, 4693140)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.CONSTRUCTION, 144000),
                        new ResourceChunk(ResType.STEEL, 69790),
                        new ResourceChunk(ResType.CONCRETE, 155088),
                        new ResourceChunk(ResType.BRICK, 58158),
                        new ResourceChunk(ResType.MONEY, 5815800)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.CONSTRUCTION, 171000),
                        new ResourceChunk(ResType.STEEL, 85342),
                        new ResourceChunk(ResType.CONCRETE, 189648),
                        new ResourceChunk(ResType.BRICK, 71118),
                        new ResourceChunk(ResType.MONEY, 7111800)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.CONSTRUCTION, 201600),
                        new ResourceChunk(ResType.STEEL, 103848),
                        new ResourceChunk(ResType.CONCRETE, 230774),
                        new ResourceChunk(ResType.BRICK, 86540),
                        new ResourceChunk(ResType.MONEY, 8654040)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.CONSTRUCTION, 235800),
                        new ResourceChunk(ResType.STEEL, 125518),
                        new ResourceChunk(ResType.CONCRETE, 278928),
                        new ResourceChunk(ResType.BRICK, 104598),
                        new ResourceChunk(ResType.MONEY, 10459800)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.CONSTRUCTION, 273600),
                        new ResourceChunk(ResType.STEEL, 150556),
                        new ResourceChunk(ResType.CONCRETE, 334570),
                        new ResourceChunk(ResType.BRICK, 125464),
                        new ResourceChunk(ResType.MONEY, 12546360)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.CONSTRUCTION, 315000),
                        new ResourceChunk(ResType.STEEL, 179172),
                        new ResourceChunk(ResType.CONCRETE, 398160),
                        new ResourceChunk(ResType.BRICK, 149310),
                        new ResourceChunk(ResType.MONEY, 14931000)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.CONSTRUCTION, 360000),
                        new ResourceChunk(ResType.STEEL, 211572),
                        new ResourceChunk(ResType.CONCRETE, 470160),
                        new ResourceChunk(ResType.BRICK, 176310),
                        new ResourceChunk(ResType.MONEY, 17631000)
                )
        });
        setProduction(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.CITIZEN, 10)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.CITIZEN, 20)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.CITIZEN, 30)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.CITIZEN, 40)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.CITIZEN, 50)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.CITIZEN, 70)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.CITIZEN, 90)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.CITIZEN, 110)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.CITIZEN, 130)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.CITIZEN, 150)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.CITIZEN, 180)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.CITIZEN, 210)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.CITIZEN, 240)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.CITIZEN, 270)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.CITIZEN, 300)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.CITIZEN, 340)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.CITIZEN, 380)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.CITIZEN, 420)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.CITIZEN, 460)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.CITIZEN, 500)
                )
        });
        setDemand(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.UPKEEP, 80),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 4),
                        new ResourceChunk(ResType.JOB, 80),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.UPKEEP, 160),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 8),
                        new ResourceChunk(ResType.JOB, 160),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.UPKEEP, 240),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 12),
                        new ResourceChunk(ResType.JOB, 240),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.UPKEEP, 320),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 16),
                        new ResourceChunk(ResType.JOB, 320),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.UPKEEP, 400),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 20),
                        new ResourceChunk(ResType.JOB, 400),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.UPKEEP, 560),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 28),
                        new ResourceChunk(ResType.JOB, 560),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.UPKEEP, 720),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 36),
                        new ResourceChunk(ResType.JOB, 720),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.UPKEEP, 880),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 44),
                        new ResourceChunk(ResType.JOB, 880),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.UPKEEP, 1040),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 52),
                        new ResourceChunk(ResType.JOB, 1040),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.UPKEEP, 1200),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 60),
                        new ResourceChunk(ResType.JOB, 1200),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.UPKEEP, 1440),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 72),
                        new ResourceChunk(ResType.JOB, 1440),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.UPKEEP, 1680),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 84),
                        new ResourceChunk(ResType.JOB, 1680),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.UPKEEP, 1920),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 96),
                        new ResourceChunk(ResType.JOB, 1920),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.UPKEEP, 2160),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 108),
                        new ResourceChunk(ResType.JOB, 2160),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.UPKEEP, 2400),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 120),
                        new ResourceChunk(ResType.JOB, 2400),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.UPKEEP, 2720),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 136),
                        new ResourceChunk(ResType.JOB, 2720),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.UPKEEP, 3040),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 152),
                        new ResourceChunk(ResType.JOB, 3040),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.UPKEEP, 3360),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 168),
                        new ResourceChunk(ResType.JOB, 3360),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.UPKEEP, 3680),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 184),
                        new ResourceChunk(ResType.JOB, 3680),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.UPKEEP, 4000),
                        new ResourceChunk(ResType.POWER_CONSUMPTION, 200),
                        new ResourceChunk(ResType.JOB, 4000),
                        new ResourceChunk(ResType.IGNITABILITY, 1)
                )
        });
        setHold(new ResourcePack[]{
                new ResourcePack( // 1
                        new ResourceChunk(ResType.POWER, 4),
                        new ResourceChunk(ResType.WORKER, 80)
                ),
                new ResourcePack( // 2
                        new ResourceChunk(ResType.POWER, 8),
                        new ResourceChunk(ResType.WORKER, 160)
                ),
                new ResourcePack( // 3
                        new ResourceChunk(ResType.POWER, 12),
                        new ResourceChunk(ResType.WORKER, 240)
                ),
                new ResourcePack( // 4
                        new ResourceChunk(ResType.POWER, 16),
                        new ResourceChunk(ResType.WORKER, 320)
                ),
                new ResourcePack( // 5
                        new ResourceChunk(ResType.POWER, 20),
                        new ResourceChunk(ResType.WORKER, 400)
                ),
                new ResourcePack( // 6
                        new ResourceChunk(ResType.POWER, 28),
                        new ResourceChunk(ResType.WORKER, 560)
                ),
                new ResourcePack( // 7
                        new ResourceChunk(ResType.POWER, 36),
                        new ResourceChunk(ResType.WORKER, 720)
                ),
                new ResourcePack( // 8
                        new ResourceChunk(ResType.POWER, 44),
                        new ResourceChunk(ResType.WORKER, 880)
                ),
                new ResourcePack( // 9
                        new ResourceChunk(ResType.POWER, 52),
                        new ResourceChunk(ResType.WORKER, 1040)
                ),
                new ResourcePack( // 10
                        new ResourceChunk(ResType.POWER, 60),
                        new ResourceChunk(ResType.WORKER, 1200)
                ),
                new ResourcePack( // 11
                        new ResourceChunk(ResType.POWER, 72),
                        new ResourceChunk(ResType.WORKER, 1440)
                ),
                new ResourcePack( // 12
                        new ResourceChunk(ResType.POWER, 84),
                        new ResourceChunk(ResType.WORKER, 1680)
                ),
                new ResourcePack( // 13
                        new ResourceChunk(ResType.POWER, 96),
                        new ResourceChunk(ResType.WORKER, 1920)
                ),
                new ResourcePack( // 14
                        new ResourceChunk(ResType.POWER, 108),
                        new ResourceChunk(ResType.WORKER, 2160)
                ),
                new ResourcePack( // 15
                        new ResourceChunk(ResType.POWER, 120),
                        new ResourceChunk(ResType.WORKER, 2400)
                ),
                new ResourcePack( // 16
                        new ResourceChunk(ResType.POWER, 136),
                        new ResourceChunk(ResType.WORKER, 2720)
                ),
                new ResourcePack( // 17
                        new ResourceChunk(ResType.POWER, 152),
                        new ResourceChunk(ResType.WORKER, 3040)
                ),
                new ResourcePack( // 18
                        new ResourceChunk(ResType.POWER, 168),
                        new ResourceChunk(ResType.WORKER, 3360)
                ),
                new ResourcePack( // 19
                        new ResourceChunk(ResType.POWER, 184),
                        new ResourceChunk(ResType.WORKER, 3680)
                ),
                new ResourcePack( // 20
                        new ResourceChunk(ResType.POWER, 200),
                        new ResourceChunk(ResType.WORKER, 4000)
                )
        });
    }
}
