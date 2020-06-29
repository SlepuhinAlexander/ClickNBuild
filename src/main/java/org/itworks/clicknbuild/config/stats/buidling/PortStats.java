package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResChunk;
import org.itworks.clicknbuild.engine.model.ResPack;
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
        setBuildCost(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.CONSTRUCTION, 900),
                        new ResChunk(ResType.STEEL, 330),
                        new ResChunk(ResType.CONCRETE, 734),
                        new ResChunk(ResType.BRICK, 275),
                        new ResChunk(ResType.MONEY, 27540)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.CONSTRUCTION, 2700),
                        new ResChunk(ResType.STEEL, 1004),
                        new ResChunk(ResType.CONCRETE, 2232),
                        new ResChunk(ResType.BRICK, 837),
                        new ResChunk(ResType.MONEY, 83700)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.CONSTRUCTION, 5400),
                        new ResChunk(ResType.STEEL, 2035),
                        new ResChunk(ResType.CONCRETE, 4522),
                        new ResChunk(ResType.BRICK, 1696),
                        new ResChunk(ResType.MONEY, 169560)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.CONSTRUCTION, 9000),
                        new ResChunk(ResType.STEEL, 3434),
                        new ResChunk(ResType.CONCRETE, 7632),
                        new ResChunk(ResType.BRICK, 2862),
                        new ResChunk(ResType.MONEY, 286200)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.CONSTRUCTION, 13500),
                        new ResChunk(ResType.STEEL, 5216),
                        new ResChunk(ResType.CONCRETE, 11592),
                        new ResChunk(ResType.BRICK, 4347),
                        new ResChunk(ResType.MONEY, 434700)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.CONSTRUCTION, 19800),
                        new ResChunk(ResType.STEEL, 7802),
                        new ResChunk(ResType.CONCRETE, 17338),
                        new ResChunk(ResType.BRICK, 6502),
                        new ResChunk(ResType.MONEY, 650160)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.CONSTRUCTION, 27900),
                        new ResChunk(ResType.STEEL, 11243),
                        new ResChunk(ResType.CONCRETE, 24984),
                        new ResChunk(ResType.BRICK, 9369),
                        new ResChunk(ResType.MONEY, 936900)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.CONSTRUCTION, 37800),
                        new ResChunk(ResType.STEEL, 15591),
                        new ResChunk(ResType.CONCRETE, 34646),
                        new ResChunk(ResType.BRICK, 12992),
                        new ResChunk(ResType.MONEY, 1299240)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.CONSTRUCTION, 49500),
                        new ResChunk(ResType.STEEL, 20898),
                        new ResChunk(ResType.CONCRETE, 46440),
                        new ResChunk(ResType.BRICK, 17415),
                        new ResChunk(ResType.MONEY, 1741500)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.CONSTRUCTION, 63000),
                        new ResChunk(ResType.STEEL, 27216),
                        new ResChunk(ResType.CONCRETE, 60480),
                        new ResChunk(ResType.BRICK, 22680),
                        new ResChunk(ResType.MONEY, 2268000)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.CONSTRUCTION, 79200),
                        new ResChunk(ResType.STEEL, 35148),
                        new ResChunk(ResType.CONCRETE, 78106),
                        new ResChunk(ResType.BRICK, 29290),
                        new ResChunk(ResType.MONEY, 2928960)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.CONSTRUCTION, 98100),
                        new ResChunk(ResType.STEEL, 44809),
                        new ResChunk(ResType.CONCRETE, 99576),
                        new ResChunk(ResType.BRICK, 37341),
                        new ResChunk(ResType.MONEY, 3734100)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.CONSTRUCTION, 119700),
                        new ResChunk(ResType.STEEL, 56318),
                        new ResChunk(ResType.CONCRETE, 125150),
                        new ResChunk(ResType.BRICK, 46931),
                        new ResChunk(ResType.MONEY, 4693140)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.CONSTRUCTION, 144000),
                        new ResChunk(ResType.STEEL, 69790),
                        new ResChunk(ResType.CONCRETE, 155088),
                        new ResChunk(ResType.BRICK, 58158),
                        new ResChunk(ResType.MONEY, 5815800)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.CONSTRUCTION, 171000),
                        new ResChunk(ResType.STEEL, 85342),
                        new ResChunk(ResType.CONCRETE, 189648),
                        new ResChunk(ResType.BRICK, 71118),
                        new ResChunk(ResType.MONEY, 7111800)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.CONSTRUCTION, 201600),
                        new ResChunk(ResType.STEEL, 103848),
                        new ResChunk(ResType.CONCRETE, 230774),
                        new ResChunk(ResType.BRICK, 86540),
                        new ResChunk(ResType.MONEY, 8654040)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.CONSTRUCTION, 235800),
                        new ResChunk(ResType.STEEL, 125518),
                        new ResChunk(ResType.CONCRETE, 278928),
                        new ResChunk(ResType.BRICK, 104598),
                        new ResChunk(ResType.MONEY, 10459800)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.CONSTRUCTION, 273600),
                        new ResChunk(ResType.STEEL, 150556),
                        new ResChunk(ResType.CONCRETE, 334570),
                        new ResChunk(ResType.BRICK, 125464),
                        new ResChunk(ResType.MONEY, 12546360)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.CONSTRUCTION, 315000),
                        new ResChunk(ResType.STEEL, 179172),
                        new ResChunk(ResType.CONCRETE, 398160),
                        new ResChunk(ResType.BRICK, 149310),
                        new ResChunk(ResType.MONEY, 14931000)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.CONSTRUCTION, 360000),
                        new ResChunk(ResType.STEEL, 211572),
                        new ResChunk(ResType.CONCRETE, 470160),
                        new ResChunk(ResType.BRICK, 176310),
                        new ResChunk(ResType.MONEY, 17631000)
                )
        });
        setProduction(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.CITIZEN, 10)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.CITIZEN, 20)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.CITIZEN, 30)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.CITIZEN, 40)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.CITIZEN, 50)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.CITIZEN, 70)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.CITIZEN, 90)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.CITIZEN, 110)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.CITIZEN, 130)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.CITIZEN, 150)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.CITIZEN, 180)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.CITIZEN, 210)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.CITIZEN, 240)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.CITIZEN, 270)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.CITIZEN, 300)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.CITIZEN, 340)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.CITIZEN, 380)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.CITIZEN, 420)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.CITIZEN, 460)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.CITIZEN, 500)
                )
        });
        setDemand(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.UPKEEP, 80),
                        new ResChunk(ResType.POWER_CONSUMPTION, 4),
                        new ResChunk(ResType.JOB, 80),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.UPKEEP, 160),
                        new ResChunk(ResType.POWER_CONSUMPTION, 8),
                        new ResChunk(ResType.JOB, 160),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.UPKEEP, 240),
                        new ResChunk(ResType.POWER_CONSUMPTION, 12),
                        new ResChunk(ResType.JOB, 240),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.UPKEEP, 320),
                        new ResChunk(ResType.POWER_CONSUMPTION, 16),
                        new ResChunk(ResType.JOB, 320),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.UPKEEP, 400),
                        new ResChunk(ResType.POWER_CONSUMPTION, 20),
                        new ResChunk(ResType.JOB, 400),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.UPKEEP, 560),
                        new ResChunk(ResType.POWER_CONSUMPTION, 28),
                        new ResChunk(ResType.JOB, 560),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.UPKEEP, 720),
                        new ResChunk(ResType.POWER_CONSUMPTION, 36),
                        new ResChunk(ResType.JOB, 720),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.UPKEEP, 880),
                        new ResChunk(ResType.POWER_CONSUMPTION, 44),
                        new ResChunk(ResType.JOB, 880),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.UPKEEP, 1040),
                        new ResChunk(ResType.POWER_CONSUMPTION, 52),
                        new ResChunk(ResType.JOB, 1040),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.UPKEEP, 1200),
                        new ResChunk(ResType.POWER_CONSUMPTION, 60),
                        new ResChunk(ResType.JOB, 1200),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.UPKEEP, 1440),
                        new ResChunk(ResType.POWER_CONSUMPTION, 72),
                        new ResChunk(ResType.JOB, 1440),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.UPKEEP, 1680),
                        new ResChunk(ResType.POWER_CONSUMPTION, 84),
                        new ResChunk(ResType.JOB, 1680),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.UPKEEP, 1920),
                        new ResChunk(ResType.POWER_CONSUMPTION, 96),
                        new ResChunk(ResType.JOB, 1920),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.UPKEEP, 2160),
                        new ResChunk(ResType.POWER_CONSUMPTION, 108),
                        new ResChunk(ResType.JOB, 2160),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.UPKEEP, 2400),
                        new ResChunk(ResType.POWER_CONSUMPTION, 120),
                        new ResChunk(ResType.JOB, 2400),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.UPKEEP, 2720),
                        new ResChunk(ResType.POWER_CONSUMPTION, 136),
                        new ResChunk(ResType.JOB, 2720),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.UPKEEP, 3040),
                        new ResChunk(ResType.POWER_CONSUMPTION, 152),
                        new ResChunk(ResType.JOB, 3040),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.UPKEEP, 3360),
                        new ResChunk(ResType.POWER_CONSUMPTION, 168),
                        new ResChunk(ResType.JOB, 3360),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.UPKEEP, 3680),
                        new ResChunk(ResType.POWER_CONSUMPTION, 184),
                        new ResChunk(ResType.JOB, 3680),
                        new ResChunk(ResType.IGNITABILITY, 1)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.UPKEEP, 4000),
                        new ResChunk(ResType.POWER_CONSUMPTION, 200),
                        new ResChunk(ResType.JOB, 4000),
                        new ResChunk(ResType.IGNITABILITY, 1)
                )
        });
        setHold(new ResPack[]{
                new ResPack( // 1
                        new ResChunk(ResType.POWER, 4),
                        new ResChunk(ResType.WORKER, 80)
                ),
                new ResPack( // 2
                        new ResChunk(ResType.POWER, 8),
                        new ResChunk(ResType.WORKER, 160)
                ),
                new ResPack( // 3
                        new ResChunk(ResType.POWER, 12),
                        new ResChunk(ResType.WORKER, 240)
                ),
                new ResPack( // 4
                        new ResChunk(ResType.POWER, 16),
                        new ResChunk(ResType.WORKER, 320)
                ),
                new ResPack( // 5
                        new ResChunk(ResType.POWER, 20),
                        new ResChunk(ResType.WORKER, 400)
                ),
                new ResPack( // 6
                        new ResChunk(ResType.POWER, 28),
                        new ResChunk(ResType.WORKER, 560)
                ),
                new ResPack( // 7
                        new ResChunk(ResType.POWER, 36),
                        new ResChunk(ResType.WORKER, 720)
                ),
                new ResPack( // 8
                        new ResChunk(ResType.POWER, 44),
                        new ResChunk(ResType.WORKER, 880)
                ),
                new ResPack( // 9
                        new ResChunk(ResType.POWER, 52),
                        new ResChunk(ResType.WORKER, 1040)
                ),
                new ResPack( // 10
                        new ResChunk(ResType.POWER, 60),
                        new ResChunk(ResType.WORKER, 1200)
                ),
                new ResPack( // 11
                        new ResChunk(ResType.POWER, 72),
                        new ResChunk(ResType.WORKER, 1440)
                ),
                new ResPack( // 12
                        new ResChunk(ResType.POWER, 84),
                        new ResChunk(ResType.WORKER, 1680)
                ),
                new ResPack( // 13
                        new ResChunk(ResType.POWER, 96),
                        new ResChunk(ResType.WORKER, 1920)
                ),
                new ResPack( // 14
                        new ResChunk(ResType.POWER, 108),
                        new ResChunk(ResType.WORKER, 2160)
                ),
                new ResPack( // 15
                        new ResChunk(ResType.POWER, 120),
                        new ResChunk(ResType.WORKER, 2400)
                ),
                new ResPack( // 16
                        new ResChunk(ResType.POWER, 136),
                        new ResChunk(ResType.WORKER, 2720)
                ),
                new ResPack( // 17
                        new ResChunk(ResType.POWER, 152),
                        new ResChunk(ResType.WORKER, 3040)
                ),
                new ResPack( // 18
                        new ResChunk(ResType.POWER, 168),
                        new ResChunk(ResType.WORKER, 3360)
                ),
                new ResPack( // 19
                        new ResChunk(ResType.POWER, 184),
                        new ResChunk(ResType.WORKER, 3680)
                ),
                new ResPack( // 20
                        new ResChunk(ResType.POWER, 200),
                        new ResChunk(ResType.WORKER, 4000)
                )
        });
    }
}
