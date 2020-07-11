package org.itworks.clicknbuild.engine.city;

import org.itworks.clicknbuild.config.ConfigLoader;
import org.itworks.clicknbuild.config.Configs;
import org.itworks.clicknbuild.engine.building.Building;
import org.itworks.clicknbuild.engine.building.BuildingType;
import org.itworks.clicknbuild.engine.res.TileType;
import org.itworks.clicknbuild.util.math.MathHelper;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class MapGenerator {
    private static final int MAP_HEIGHT = Integer.parseInt(ConfigLoader.inst().get(Configs.MAP_HEIGHT));
    private static final int MAP_WIDTH = Integer.parseInt(ConfigLoader.inst().get(Configs.MAP_WIDTH));

    public static void generateInitialMap(Cell[][] map) {
        if (map == null) return;
        if (map.length != MAP_HEIGHT) throw new IllegalArgumentException();
        for (int i = 0; i < MAP_HEIGHT; i++) {
            if (map[i] == null || map[i].length != MAP_WIDTH) throw new IllegalArgumentException();
            for (int j = 0; j < MAP_WIDTH; j++) {
                map[i][j] = new Cell(i, j); // clear-up
            }
        }
        int amount = MAP_HEIGHT * MAP_WIDTH / 2;
        Location center = new Location(MAP_HEIGHT / 2, MAP_WIDTH / 2);
        Location current = new Location(center.row, center.col);
        Set<Location> toFill = new HashSet<>();
        toFill.add(current);
        toFill.add(current);
        while (toFill.size() < amount) {
            if (Math.random() < 0.5) {
                int step = current.row >= center.row ? -1 : 1;
                if (Math.random() < 0.4) step = -step;
                current = new Location(MathHelper.clamp(current.row + step, MAP_HEIGHT - 1), current.col);
            } else {
                int step = current.col >= center.col ? -1 : 1;
                if (Math.random() < 0.4) step = -step;
                current = new Location(current.row, MathHelper.clamp(current.col + step, MAP_WIDTH - 1));
            }
            toFill.add(current);
        }
        toFill.forEach(location -> {
            double seed = Math.random();
            Cell cell = map[location.row][location.col];
            if (seed < 0.05) {
                cell.setTile(TileType.RUIN);
            } else if (seed < 0.25) {
                cell.setTile(TileType.TRASH);
            } else if (seed < 0.5) {
                cell.setTile(TileType.TREE);
            } else if (seed < 0.6) {
                cell.setTile(TileType.ROCK);
            } else {
                cell.setTile(TileType.LAND);
            }
        });
        for (int i = 0; i < MAP_HEIGHT; i++) {
            for (int j = 0; j < MAP_WIDTH; j++) {
                if (map[i][j].getTile() == null) map[i][j].setTile(TileType.SEA);
            }
        }
    }

    //TODO clear
    public static void constructRandomBuildings(Cell[][] map) {
        if (map == null) return;
        if (map.length != MAP_HEIGHT) throw new IllegalArgumentException();
        BuildingType[] buildingTypes = BuildingType.values();
        for (int i = 0; i < MAP_HEIGHT; i++) {
            if (map[i] == null || map[i].length != MAP_WIDTH) throw new IllegalArgumentException();
            for (int j = 0; j < MAP_WIDTH; j++) {
                Cell cell = Objects.requireNonNull(map[i][j]);
                if (cell.getTile().equals(TileType.SEA)) continue; // cannot build on sea
                if (Math.random() < 0.5) continue; // skip some cells untouched
                Building building;
                if (Math.random() < 0.5) {
                    building = Building.of(BuildingType.ROAD);
                } else {
                    BuildingType buildingType = buildingTypes[MathHelper.randomInt(2, buildingTypes.length)];
                    int maxLevel = buildingType.stats.getMaxLevel();
                    building = Building.of(buildingType, maxLevel == 1 ? 1 : MathHelper.randomInt(maxLevel) + 1);
                }
                building.setLocation(cell.location);
                cell.setTile(TileType.LAND);
                cell.setBuilding(building);
            }
        }
    }

    // TODO clear
    public static void generatePredefinedMap(Cell[][] map) {
        if (map == null) return;
        if (map.length != MAP_HEIGHT) throw new IllegalArgumentException();
        for (int i = 0; i < MAP_HEIGHT; i++) {
            if (map[i] == null || map[i].length != MAP_WIDTH) throw new IllegalArgumentException();
            for (int j = 0; j < MAP_WIDTH; j++) {
                if (i == 0 || i == MAP_HEIGHT - 1 || j == 0 || j == MAP_WIDTH - 1) {
                    map[i][j].setTile(TileType.SEA);
                } else {
                    map[i][j].setTile(TileType.LAND);
                }
                map[i][j].setBuilding(null);
            }
        }
        map[7][18].setTile(TileType.SEA);
        for (int j = 3; j <= 16; j++) {
            if (map[7][j].getBuilding() == null) map[7][j].setBuilding(Building.of(BuildingType.ROAD, 1));
        }
        for (int i = 3; i <= 11; i++) {
            for (int j = 3; j <= 15; j += 3) {
                if (map[i][j].getBuilding() == null) map[i][j].setBuilding(Building.of(BuildingType.ROAD, 1));
            }
        }
        for (int i = 2; i <= 12; i += 10) {
            for (int j = 3; j <= 9; j += 3) {
                if (map[i][j].getBuilding() == null) {
                    map[i][j].setBuilding(Building.of(BuildingType.POLICE, MathHelper.randomInt(13, 21)));
                }
            }
        }
        for (int i = 6; i <= 8; i += 2) {
            for (int j = 4; j <= 11; j++) {
                if (map[i][j].getBuilding() == null) {
                    map[i][j].setBuilding(Building.of(BuildingType.MALL, MathHelper.randomInt(11, 21)));
                }
            }
        }
        for (int i = 2; i <= 12; i++) {
            if (map[i][2].getBuilding() == null) {
                map[i][2].setBuilding(Building.of(BuildingType.APARTMENT, MathHelper.randomInt(5, 15)));
            }
        }
        for (int i = 2; i <= 12; i++) {
            for (int j = 4; j <= 7; j++) {
                if (map[i][j].getBuilding() == null) {
                    map[i][j].setBuilding(Building.of(BuildingType.APARTMENT,
                            MathHelper.randomInt(8, 21)));
                }
            }
        }
        map[9][10].setBuilding(Building.of(BuildingType.BANK, MathHelper.randomInt(11, 21)));
        map[10][10].setBuilding(Building.of(BuildingType.EXCHANGE, 1));
        map[4][11].setBuilding(Building.of(BuildingType.ENGINEERING_CENTER, MathHelper.randomInt(11, 21)));
        map[5][11].setBuilding(Building.of(BuildingType.CITY_PLANNING, 1));
        map[9][11].setBuilding(Building.of(BuildingType.HOTEL, MathHelper.randomInt(11, 21)));
        map[10][11].setBuilding(Building.of(BuildingType.GYM, MathHelper.randomInt(11, 21)));
        map[12][11].setBuilding(Building.of(BuildingType.CONSTRUCTION_SITE, MathHelper.randomInt(6, 21)));
        for (int i = 3; i <= 11; i++) {
            for (int j = 8; j <= 10; j++) {
                if (map[i][j].getBuilding() == null) {
                    map[i][j].setBuilding(Building.of(BuildingType.OFFICE, MathHelper.randomInt(11, 21)));
                }
            }
        }
        for (int i = 2; i <= 12; i++) {
            for (int j = 8; j <= 11; j++) {
                if (map[i][j].getBuilding() == null) {
                    map[i][j].setBuilding(Building.of(BuildingType.APARTMENT,
                            MathHelper.randomInt(11, 21)));
                }
            }
        }
        map[2][12].setBuilding(Building.of(BuildingType.FIRE_STATION, MathHelper.randomInt(18, 21)));
        map[12][12].setBuilding(Building.of(BuildingType.FIRE_STATION, MathHelper.randomInt(18, 21)));
        for (int i = 2; i <= 12; i++) {
            if (map[i][13].getBuilding() == null) {
                map[i][13].setBuilding(Building.of(BuildingType.POWER_PLANT,
                        MathHelper.randomInt(9, 15)));
            }
        }
        map[2][15].setBuilding(Building.of(BuildingType.WAREHOUSE, MathHelper.randomInt(11, 21)));
        map[12][15].setBuilding(Building.of(BuildingType.WAREHOUSE, MathHelper.randomInt(11, 21)));
        map[2][14].setBuilding(Building.of(BuildingType.WAREHOUSE_STEEL, MathHelper.randomInt(11, 21)));
        map[3][14].setBuilding(Building.of(BuildingType.WAREHOUSE_CONCRETE, MathHelper.randomInt(11, 21)));
        map[4][14].setBuilding(Building.of(BuildingType.WAREHOUSE_BRICK, MathHelper.randomInt(11, 21)));
        map[5][14].setBuilding(Building.of(BuildingType.WAREHOUSE_WOOD, MathHelper.randomInt(11, 21)));
        map[6][14].setBuilding(Building.of(BuildingType.WAREHOUSE_GLASS, MathHelper.randomInt(11, 21)));
        map[8][14].setBuilding(Building.of(BuildingType.WAREHOUSE_GLASS, MathHelper.randomInt(11, 21)));
        map[9][14].setBuilding(Building.of(BuildingType.WAREHOUSE_WOOD, MathHelper.randomInt(11, 21)));
        map[10][14].setBuilding(Building.of(BuildingType.WAREHOUSE_BRICK, MathHelper.randomInt(11, 21)));
        map[11][14].setBuilding(Building.of(BuildingType.WAREHOUSE_CONCRETE,
                MathHelper.randomInt(11, 21)));
        map[12][14].setBuilding(Building.of(BuildingType.WAREHOUSE_STEEL, MathHelper.randomInt(11, 21)));
        map[2][16].setBuilding(Building.of(BuildingType.FACTORY_STEEL, MathHelper.randomInt(11, 21)));
        map[3][16].setBuilding(Building.of(BuildingType.FACTORY_CONCRETE, MathHelper.randomInt(11, 21)));
        map[4][16].setBuilding(Building.of(BuildingType.FACTORY_BRICK, MathHelper.randomInt(11, 21)));
        map[5][16].setBuilding(Building.of(BuildingType.FACTORY_WOOD, MathHelper.randomInt(11, 21)));
        map[6][16].setBuilding(Building.of(BuildingType.FACTORY_GLASS, MathHelper.randomInt(11, 21)));
        map[8][16].setBuilding(Building.of(BuildingType.FACTORY_GLASS, MathHelper.randomInt(11, 21)));
        map[9][16].setBuilding(Building.of(BuildingType.FACTORY_WOOD, MathHelper.randomInt(11, 21)));
        map[10][16].setBuilding(Building.of(BuildingType.FACTORY_BRICK, MathHelper.randomInt(11, 21)));
        map[11][16].setBuilding(Building.of(BuildingType.FACTORY_CONCRETE, MathHelper.randomInt(11, 21)));
        map[12][16].setBuilding(Building.of(BuildingType.FACTORY_STEEL, MathHelper.randomInt(11, 21)));
        map[6][17].setBuilding(Building.of(BuildingType.AIRPORT, MathHelper.randomInt(11, 21)));
        map[7][17].setBuilding(Building.of(BuildingType.PORT, MathHelper.randomInt(11, 21)));
        map[8][17].setBuilding(Building.of(BuildingType.NUCLEAR_PLANT, MathHelper.randomInt(5, 15)));
        for (int i = 0; i < MAP_HEIGHT; i++) {
            for (int j = 0; j < MAP_WIDTH; j++) {
                if (map[i][j].getTile() == TileType.LAND && map[i][j].getBuilding() == null) {
                    double seed = Math.random();
                    if (seed < 0.05) {
                        map[i][j].setTile(TileType.RUIN);
                    } else if (seed < 0.15) {
                        map[i][j].setTile(TileType.ROCK);
                    } else if (seed < 0.40) {
                        map[i][j].setTile(TileType.TREE);
                    } else if (seed < 0.60) {
                        map[i][j].setTile(TileType.TRASH);
                    }
                }
            }
        }
        for (int i = 0; i < MAP_HEIGHT; i++) {
            for (int j = 0; j < MAP_WIDTH; j++) {
                Building building = map[i][j].getBuilding();
                if (building != null) building.setLocation(i, j);
            }
        }
    }
}
