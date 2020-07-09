package org.itworks.clicknbuild.engine.city;

import org.itworks.clicknbuild.config.ConfigLoader;
import org.itworks.clicknbuild.config.Configs;
import org.itworks.clicknbuild.engine.building.Building;
import org.itworks.clicknbuild.engine.building.BuildingType;
import org.itworks.clicknbuild.engine.exception.CannotBuildException;
import org.itworks.clicknbuild.engine.res.TileType;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Responsible for:
 * <ul>
 *     <li>storing the game map of {@link Cell}-s</li>
 *     <li>collecting all {@link Building}-s that currently present on the map</li>
 *     <li>providing terraform options: checking possibilities to change a {@link TileType}, providing corresponding
 *     options to the player, generating a corresponding job, applying the change</li>
 *     <li>providing construction options: checking possibilities to construct a {@link BuildingType} building in a
 *     cell, providing list of available buildings to construct</li>
 *     <li>checking the construction requirements: player level, construction limits, prices, etc</li>
 *     <li>calculating the construction / upgrade price of a building taking into account possible cost multipliers</li>
 *     <li>initiating construction / upgrading / demolition job</li>
 *     <li>actual construction / upgrading / demolition</li>
 * </ul>
 */
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
     * Removes thе given building from registered buildings (if it was actually registered).
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

    public void clearAll() {
        clearBuildings();
        clearMap();
    }

    public void clearBuildings() {
        buildings.clear();
    }

    public void clearMap() {
        for (int i = 0; i < MAP_WIDTH; i++) {
            for (int j = 0; j < MAP_HEIGHT; j++) {
                map[i][j] = new Cell(i, j);
            }
        }
    }

    private Location validateLocation(int row, int col) {
        if (row < 0 || row >= MAP_HEIGHT || col < 0 || col >= MAP_WIDTH) throw new IllegalArgumentException();
        return new Location(row, col);
    }

    private void dry(int row, int col) {
        dry(validateLocation(row, col));
    }

    /**
     * Turns {@link TileType#SEA} tile into {@link TileType#LAND}.
     * Should happen when drying job is complete.
     */
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

    /**
     * Turns {@link TileType#LAND} tile into {@link TileType#SEA} if it is not occupied by any building.
     * Should happen when gigging job is complete.
     */
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

    /**
     * Turns {@link TileType#TRASH}, {@link TileType#TREE}, {@link TileType#ROCK} or {@link TileType#RUIN} into
     * {@link TileType#LAND}.
     * Should happen when clearing job is complete.
     */
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

    /**
     * Creates a {@link Building} object of this {@link BuildingType}, places it in the given {@link Location} on the
     * map and registers it in game managers.
     * Always creates a building at level 1.
     * Should happen when construction job is complete.
     */
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
        //TODO registering in Resource manager
    }

    private void burn(int row, int col) {
        burn(validateLocation(row, col));
    }

    private void upgrade(int row, int col) {
        upgrade(validateLocation(row, col));
    }

    /**
     * Levels up a {@link Building} located at given {@link Location} (if possible) and updates register records in
     * game managers.
     */
    private void upgrade(Location location) {
        //TODO implement
    }


    /**
     * Destructs a {@link Building} located at given {@link Location} (if any), delists it from game managers and turns
     * the corresponding tile into {@link TileType#RUIN}.
     * Should happen when this building failed to pass inflammability check.
     * Building of any level could burn.
     */
    private void burn(Location location) {
        demolish(location);
        map[location.row][location.col].setTile(TileType.RUIN);
    }

    private void demolish(int row, int col) {
        demolish(validateLocation(row, col));
    }

    /**
     * Destructs a {@link Building} located at given {@link Location} (if any), delists it from game managers.
     * Does not change the tile (it should have been {@link TileType#LAND}).
     * Should happen when demolition job is done.
     * Building of any level could be demolished.
     */
    private void demolish(Location location) {
        Objects.requireNonNull(location);
        Cell cell = map[location.row][location.col];
        Building building = cell.getBuilding();
        if (building == null) return;
        cell.setBuilding(null);
        delist(building);
        // TODO delisting from Resource Manager
    }
}
