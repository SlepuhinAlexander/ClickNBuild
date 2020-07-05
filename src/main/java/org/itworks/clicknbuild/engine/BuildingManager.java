package org.itworks.clicknbuild.engine;

import org.itworks.clicknbuild.config.ConfigLoader;
import org.itworks.clicknbuild.config.Configs;
import org.itworks.clicknbuild.engine.exception.CannotBuildException;
import org.itworks.clicknbuild.engine.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public final class BuildingManager {
    private static final int MAP_WIDTH = Integer.parseInt(ConfigLoader.inst().get(Configs.MAP_WIDTH));
    private static final int MAP_HEIGHT = Integer.parseInt(ConfigLoader.inst().get(Configs.MAP_HEIGHT));

    private static volatile BuildingManager inst;

    public final Cell[][] map = new Cell[MAP_HEIGHT][MAP_WIDTH];
    public final ConcurrentHashMap<BuildingType, List<Building>> buildings = new ConcurrentHashMap<>();

    private BuildingManager() {
    }

    public static BuildingManager inst() {
        BuildingManager local = inst;
        if (local == null) {
            synchronized (BuildingManager.class) {
                local = inst;
                if (local == null) {
                    inst = local = new BuildingManager();
                    local.init();
                }
            }
        }
        return local;
    }

    private void init() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = new Cell(i, j);
            }
        }
    }

    /**
     * Recalculates ordinals for registered buildings of given type.
     * Required when a new building is constructed (and registered).
     * Or when a building is lost: demolished or destructed (and delisted).
     * Ordinals are used for construction prices calculation.
     *
     * @see Building#getOrdinal()
     */
    private void reorder(BuildingType type) {
        if (type == null) return;
        List<Building> buildingList = buildings.get(type);
        for (int i = 0; i < (buildingList == null ? 0 : buildingList.size()); i++) {
            buildingList.get(i).setOrdinal(i);
        }
    }

    /**
     * Registers the given building to this BuildingManager.
     * Not registered buildings are unknown to the game.
     * Typically, a building is registered when its construction / upgrading is complete.
     */
    private void register(Building building) {
        if (building == null) return;
        List<Building> buildingList = buildings.get(building.type);
        if (buildingList == null) {
            buildings.put(building.type, new ArrayList<>());
            buildings.get(building.type).add(building);
            return;
        }
        for (int i = 0; i < buildingList.size(); i++) {
            if (buildingList.get(i).equals(building)) return;
            if (buildingList.get(i).getLocation().equals(building.getLocation())) buildingList.set(i, building);
            /*
             * If a building is not the same object but in the same location, it might be an upgraded version of
             * already registered building.
             * */
        }
        buildingList.add(building);
        reorder(building.type);
    }

    /**
     * Removes this building from registered buildings (if it was actually registered).
     * Typically, a building is desisted when it is destroyed: demolished, burned down, etc.
     */
    private void delist(Building building) {
        if (building == null) return;
        List<Building> buildingList = buildings.get(building.type);
        if (buildingList == null) return;
        buildingList.removeIf(registered -> registered.equals(building) ||
                                            registered.getLocation().equals(building.getLocation()));
        reorder(building.type);
    }

    private Location validateLocation(int row, int col) {
        if (row < 0 || row >= MAP_HEIGHT || col < 0 || col >= MAP_WIDTH) throw new IllegalArgumentException();
        return new Location(row, col);
    }

    private void dry(int row, int col) {
        dry(validateLocation(row, col));
    }

    private void dry(Location location) {
        Objects.requireNonNull(location);
        Cell cell = map[location.row][location.col];
        if (cell.getTile() == null || cell.getTile() != TileType.SEA) {
            throw new CannotBuildException("invalid tile type");
        }
        cell.setTile(TileType.LAND);
    }

    private void dig(int row, int col) {
        dig(validateLocation(row, col));
    }

    private void dig(Location location) {
        Objects.requireNonNull(location);
        Cell cell = map[location.row][location.col];
        if (cell.getTile() == null || cell.getTile() != TileType.LAND) {
            throw new CannotBuildException("invalid tile type");
        }
        if (cell.getBuilding() != null) throw new CannotBuildException("cell is in use");
        cell.setTile(TileType.SEA);
    }

    private void clear(int row, int col) {
        clear(validateLocation(row, col));
    }

    private void clear(Location location) {
        Objects.requireNonNull(location);
        Cell cell = map[location.row][location.col];
        if (cell.getTile() == null || cell.getTile() == TileType.LAND || cell.getTile() == TileType.SEA) {
            throw new CannotBuildException("invalid tile type");
        }
        cell.setTile(TileType.LAND);
    }

    private void build(BuildingType type, int row, int col) {
        build(type, validateLocation(row, col));
    }

    private void build(BuildingType type, Location location) {
        Objects.requireNonNull(type);
        Objects.requireNonNull(location);
        Cell cell = map[location.row][location.col];
        if (cell.getBuilding() != null) throw new CannotBuildException("cell already in use");
        if (cell.getTile() != TileType.LAND) throw new CannotBuildException("cell is not cleared");
        Building building = Building.of(type);
        building.setLocation(location);
        cell.setBuilding(building);
        register(building);
    }

    private void burn(int row, int col) {
        burn(validateLocation(row, col));
    }

    private void burn(Location location) {
        demolish(location);
        map[location.row][location.col].setTile(TileType.RUIN);
    }

    private void demolish(int row, int col) {
        demolish(validateLocation(row, col));
    }

    private void demolish(Location location) {
        Objects.requireNonNull(location);
        Cell cell = map[location.row][location.col];
        Building building = cell.getBuilding();
        if (building == null) return;
        delist(building);
        cell.setBuilding(null);
    }
}
