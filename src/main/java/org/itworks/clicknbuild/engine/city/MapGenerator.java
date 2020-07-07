package org.itworks.clicknbuild.engine.city;

import org.itworks.clicknbuild.config.ConfigLoader;
import org.itworks.clicknbuild.config.Configs;
import org.itworks.clicknbuild.engine.building.Building;
import org.itworks.clicknbuild.engine.building.BuildingType;
import org.itworks.clicknbuild.engine.res.*;
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

    public void constructRandomBuildings(Cell[][] map) {
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
}
