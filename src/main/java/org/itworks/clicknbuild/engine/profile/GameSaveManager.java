package org.itworks.clicknbuild.engine.profile;

import org.itworks.clicknbuild.engine.Ticker;
import org.itworks.clicknbuild.engine.building.Building;
import org.itworks.clicknbuild.engine.building.BuildingAttrType;
import org.itworks.clicknbuild.engine.building.BuildingType;
import org.itworks.clicknbuild.engine.city.*;
import org.itworks.clicknbuild.engine.res.ResType;

import java.util.Arrays;

/**
 * Constructs a {@link GameSave} object to save the current game state.
 * And reconstructs the game state from a given {@link GameSave} object.
 */
public final class GameSaveManager {
    private static volatile GameSaveManager inst;

    private GameSaveManager() {
    }

    public static GameSaveManager inst() {
        GameSaveManager local = inst;
        if (local == null) {
            synchronized (GameSaveManager.class) {
                local = inst;
                if (local == null) {
                    inst = local = new GameSaveManager();
                }
            }
        }
        return local;
    }

    /**
     * Accepts {@link GameSave argument} (read form the save file) from the {@link ProfileManager} and reconstructs
     * the game state from it.
     */
    public void load(GameSave gameSave) {
        // TODO implement
        loadDummySave();
    }

    /**
     * Constructs a {@link GameSave} object from the current game state for further use by {@link ProfileManager}
     * (to write it to a file)
     */
    public GameSave save() {
        // TODO implement
        return new GameSave();
    }

    private void loadDummySave() {
        Cell[][] map = BuildingManager.inst().map;
        Building headquarter = Building.of(BuildingType.HEADQUARTER);
        BuildingManager.inst().register(headquarter);
        headquarter.setLocation(-1, -1);
        ResManager.inst().register(headquarter);
        MapGenerator.generatePredefinedMap(map);
        for (Cell[] row : map) {
            for (Cell cell : row) {
                Building building = cell.getBuilding();
                if (building != null) {
                    BuildingManager.inst().register(building);
                    ResManager.inst().register(building);
                }
            }
        }
        BuildingType[] buildingTypes = BuildingType.values();
        for (BuildingType buildingType : buildingTypes) {
            BuildingManager.inst().reorder(buildingType);
        }
        ResType[] resTypes = new ResType[]{ResType.STEEL, ResType.CONCRETE, ResType.BRICK, ResType.WOOD,
                ResType.GLASS, ResType.MONEY};
        for (ResType resType : resTypes) {
            ResManager.inst().get(BuildingAttrType.STORE).getTotal().add(resType, 2500000d / resType.getPrice());
        }
        ResManager.inst().get(BuildingAttrType.STORE).getTotal().add(ResType.ENERGY, 1000d);
        ResManager.inst().get(BuildingAttrType.STORE).getTotal().add(ResType.CITIZEN, 300000d);
        ResManager.inst().subscribe();
        Ticker.inst().start();
    }
}
