package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.engine.model.ResStat;
import org.itworks.clicknbuild.engine.model.ResStatPack;
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
        setBuildCost(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.CONSTRUCTION, 900),
                        new ResStat(ResType.STEEL, 330),
                        new ResStat(ResType.CONCRETE, 734),
                        new ResStat(ResType.BRICK, 275),
                        new ResStat(ResType.MONEY, 27540)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.CONSTRUCTION, 2700),
                        new ResStat(ResType.STEEL, 1004),
                        new ResStat(ResType.CONCRETE, 2232),
                        new ResStat(ResType.BRICK, 837),
                        new ResStat(ResType.MONEY, 83700)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.CONSTRUCTION, 5400),
                        new ResStat(ResType.STEEL, 2035),
                        new ResStat(ResType.CONCRETE, 4522),
                        new ResStat(ResType.BRICK, 1696),
                        new ResStat(ResType.MONEY, 169560)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.CONSTRUCTION, 9000),
                        new ResStat(ResType.STEEL, 3434),
                        new ResStat(ResType.CONCRETE, 7632),
                        new ResStat(ResType.BRICK, 2862),
                        new ResStat(ResType.MONEY, 286200)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.CONSTRUCTION, 13500),
                        new ResStat(ResType.STEEL, 5216),
                        new ResStat(ResType.CONCRETE, 11592),
                        new ResStat(ResType.BRICK, 4347),
                        new ResStat(ResType.MONEY, 434700)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.CONSTRUCTION, 19800),
                        new ResStat(ResType.STEEL, 7802),
                        new ResStat(ResType.CONCRETE, 17338),
                        new ResStat(ResType.BRICK, 6502),
                        new ResStat(ResType.MONEY, 650160)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.CONSTRUCTION, 27900),
                        new ResStat(ResType.STEEL, 11243),
                        new ResStat(ResType.CONCRETE, 24984),
                        new ResStat(ResType.BRICK, 9369),
                        new ResStat(ResType.MONEY, 936900)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.CONSTRUCTION, 37800),
                        new ResStat(ResType.STEEL, 15591),
                        new ResStat(ResType.CONCRETE, 34646),
                        new ResStat(ResType.BRICK, 12992),
                        new ResStat(ResType.MONEY, 1299240)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.CONSTRUCTION, 49500),
                        new ResStat(ResType.STEEL, 20898),
                        new ResStat(ResType.CONCRETE, 46440),
                        new ResStat(ResType.BRICK, 17415),
                        new ResStat(ResType.MONEY, 1741500)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.CONSTRUCTION, 63000),
                        new ResStat(ResType.STEEL, 27216),
                        new ResStat(ResType.CONCRETE, 60480),
                        new ResStat(ResType.BRICK, 22680),
                        new ResStat(ResType.MONEY, 2268000)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.CONSTRUCTION, 79200),
                        new ResStat(ResType.STEEL, 35148),
                        new ResStat(ResType.CONCRETE, 78106),
                        new ResStat(ResType.BRICK, 29290),
                        new ResStat(ResType.MONEY, 2928960)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.CONSTRUCTION, 98100),
                        new ResStat(ResType.STEEL, 44809),
                        new ResStat(ResType.CONCRETE, 99576),
                        new ResStat(ResType.BRICK, 37341),
                        new ResStat(ResType.MONEY, 3734100)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.CONSTRUCTION, 119700),
                        new ResStat(ResType.STEEL, 56318),
                        new ResStat(ResType.CONCRETE, 125150),
                        new ResStat(ResType.BRICK, 46931),
                        new ResStat(ResType.MONEY, 4693140)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.CONSTRUCTION, 144000),
                        new ResStat(ResType.STEEL, 69790),
                        new ResStat(ResType.CONCRETE, 155088),
                        new ResStat(ResType.BRICK, 58158),
                        new ResStat(ResType.MONEY, 5815800)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.CONSTRUCTION, 171000),
                        new ResStat(ResType.STEEL, 85342),
                        new ResStat(ResType.CONCRETE, 189648),
                        new ResStat(ResType.BRICK, 71118),
                        new ResStat(ResType.MONEY, 7111800)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.CONSTRUCTION, 201600),
                        new ResStat(ResType.STEEL, 103848),
                        new ResStat(ResType.CONCRETE, 230774),
                        new ResStat(ResType.BRICK, 86540),
                        new ResStat(ResType.MONEY, 8654040)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.CONSTRUCTION, 235800),
                        new ResStat(ResType.STEEL, 125518),
                        new ResStat(ResType.CONCRETE, 278928),
                        new ResStat(ResType.BRICK, 104598),
                        new ResStat(ResType.MONEY, 10459800)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.CONSTRUCTION, 273600),
                        new ResStat(ResType.STEEL, 150556),
                        new ResStat(ResType.CONCRETE, 334570),
                        new ResStat(ResType.BRICK, 125464),
                        new ResStat(ResType.MONEY, 12546360)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.CONSTRUCTION, 315000),
                        new ResStat(ResType.STEEL, 179172),
                        new ResStat(ResType.CONCRETE, 398160),
                        new ResStat(ResType.BRICK, 149310),
                        new ResStat(ResType.MONEY, 14931000)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.CONSTRUCTION, 360000),
                        new ResStat(ResType.STEEL, 211572),
                        new ResStat(ResType.CONCRETE, 470160),
                        new ResStat(ResType.BRICK, 176310),
                        new ResStat(ResType.MONEY, 17631000)
                )
        });
        setProduction(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.CITIZEN, 10)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.CITIZEN, 20)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.CITIZEN, 30)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.CITIZEN, 40)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.CITIZEN, 50)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.CITIZEN, 70)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.CITIZEN, 90)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.CITIZEN, 110)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.CITIZEN, 130)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.CITIZEN, 150)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.CITIZEN, 180)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.CITIZEN, 210)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.CITIZEN, 240)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.CITIZEN, 270)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.CITIZEN, 300)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.CITIZEN, 340)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.CITIZEN, 380)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.CITIZEN, 420)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.CITIZEN, 460)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.CITIZEN, 500)
                )
        });
        setDemand(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.UPKEEP, 80),
                        new ResStat(ResType.POWER_CONSUMPTION, 4),
                        new ResStat(ResType.JOB, 80),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.UPKEEP, 160),
                        new ResStat(ResType.POWER_CONSUMPTION, 8),
                        new ResStat(ResType.JOB, 160),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.UPKEEP, 240),
                        new ResStat(ResType.POWER_CONSUMPTION, 12),
                        new ResStat(ResType.JOB, 240),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.UPKEEP, 320),
                        new ResStat(ResType.POWER_CONSUMPTION, 16),
                        new ResStat(ResType.JOB, 320),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.UPKEEP, 400),
                        new ResStat(ResType.POWER_CONSUMPTION, 20),
                        new ResStat(ResType.JOB, 400),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.UPKEEP, 560),
                        new ResStat(ResType.POWER_CONSUMPTION, 28),
                        new ResStat(ResType.JOB, 560),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.UPKEEP, 720),
                        new ResStat(ResType.POWER_CONSUMPTION, 36),
                        new ResStat(ResType.JOB, 720),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.UPKEEP, 880),
                        new ResStat(ResType.POWER_CONSUMPTION, 44),
                        new ResStat(ResType.JOB, 880),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.UPKEEP, 1040),
                        new ResStat(ResType.POWER_CONSUMPTION, 52),
                        new ResStat(ResType.JOB, 1040),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.UPKEEP, 1200),
                        new ResStat(ResType.POWER_CONSUMPTION, 60),
                        new ResStat(ResType.JOB, 1200),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.UPKEEP, 1440),
                        new ResStat(ResType.POWER_CONSUMPTION, 72),
                        new ResStat(ResType.JOB, 1440),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.UPKEEP, 1680),
                        new ResStat(ResType.POWER_CONSUMPTION, 84),
                        new ResStat(ResType.JOB, 1680),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.UPKEEP, 1920),
                        new ResStat(ResType.POWER_CONSUMPTION, 96),
                        new ResStat(ResType.JOB, 1920),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.UPKEEP, 2160),
                        new ResStat(ResType.POWER_CONSUMPTION, 108),
                        new ResStat(ResType.JOB, 2160),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.UPKEEP, 2400),
                        new ResStat(ResType.POWER_CONSUMPTION, 120),
                        new ResStat(ResType.JOB, 2400),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.UPKEEP, 2720),
                        new ResStat(ResType.POWER_CONSUMPTION, 136),
                        new ResStat(ResType.JOB, 2720),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.UPKEEP, 3040),
                        new ResStat(ResType.POWER_CONSUMPTION, 152),
                        new ResStat(ResType.JOB, 3040),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.UPKEEP, 3360),
                        new ResStat(ResType.POWER_CONSUMPTION, 168),
                        new ResStat(ResType.JOB, 3360),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.UPKEEP, 3680),
                        new ResStat(ResType.POWER_CONSUMPTION, 184),
                        new ResStat(ResType.JOB, 3680),
                        new ResStat(ResType.IGNITABILITY, 1)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.UPKEEP, 4000),
                        new ResStat(ResType.POWER_CONSUMPTION, 200),
                        new ResStat(ResType.JOB, 4000),
                        new ResStat(ResType.IGNITABILITY, 1)
                )
        });
        setHold(new ResStatPack[]{
                new ResStatPack( // 1
                        new ResStat(ResType.POWER, 4),
                        new ResStat(ResType.WORKER, 80)
                ),
                new ResStatPack( // 2
                        new ResStat(ResType.POWER, 8),
                        new ResStat(ResType.WORKER, 160)
                ),
                new ResStatPack( // 3
                        new ResStat(ResType.POWER, 12),
                        new ResStat(ResType.WORKER, 240)
                ),
                new ResStatPack( // 4
                        new ResStat(ResType.POWER, 16),
                        new ResStat(ResType.WORKER, 320)
                ),
                new ResStatPack( // 5
                        new ResStat(ResType.POWER, 20),
                        new ResStat(ResType.WORKER, 400)
                ),
                new ResStatPack( // 6
                        new ResStat(ResType.POWER, 28),
                        new ResStat(ResType.WORKER, 560)
                ),
                new ResStatPack( // 7
                        new ResStat(ResType.POWER, 36),
                        new ResStat(ResType.WORKER, 720)
                ),
                new ResStatPack( // 8
                        new ResStat(ResType.POWER, 44),
                        new ResStat(ResType.WORKER, 880)
                ),
                new ResStatPack( // 9
                        new ResStat(ResType.POWER, 52),
                        new ResStat(ResType.WORKER, 1040)
                ),
                new ResStatPack( // 10
                        new ResStat(ResType.POWER, 60),
                        new ResStat(ResType.WORKER, 1200)
                ),
                new ResStatPack( // 11
                        new ResStat(ResType.POWER, 72),
                        new ResStat(ResType.WORKER, 1440)
                ),
                new ResStatPack( // 12
                        new ResStat(ResType.POWER, 84),
                        new ResStat(ResType.WORKER, 1680)
                ),
                new ResStatPack( // 13
                        new ResStat(ResType.POWER, 96),
                        new ResStat(ResType.WORKER, 1920)
                ),
                new ResStatPack( // 14
                        new ResStat(ResType.POWER, 108),
                        new ResStat(ResType.WORKER, 2160)
                ),
                new ResStatPack( // 15
                        new ResStat(ResType.POWER, 120),
                        new ResStat(ResType.WORKER, 2400)
                ),
                new ResStatPack( // 16
                        new ResStat(ResType.POWER, 136),
                        new ResStat(ResType.WORKER, 2720)
                ),
                new ResStatPack( // 17
                        new ResStat(ResType.POWER, 152),
                        new ResStat(ResType.WORKER, 3040)
                ),
                new ResStatPack( // 18
                        new ResStat(ResType.POWER, 168),
                        new ResStat(ResType.WORKER, 3360)
                ),
                new ResStatPack( // 19
                        new ResStat(ResType.POWER, 184),
                        new ResStat(ResType.WORKER, 3680)
                ),
                new ResStatPack( // 20
                        new ResStat(ResType.POWER, 200),
                        new ResStat(ResType.WORKER, 4000)
                )
        });
    }
}
