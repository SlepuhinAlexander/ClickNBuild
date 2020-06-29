package org.itworks.clicknbuild.config.stats;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.itworks.clicknbuild.config.ConfigLoader;
import org.itworks.clicknbuild.config.Configs;
import org.itworks.clicknbuild.config.stats.model.BuildingStatsModel;
import org.itworks.clicknbuild.config.stats.model.ResourceTypeModel;
import org.itworks.clicknbuild.config.stats.model.TileModel;
import org.itworks.clicknbuild.engine.model.BuildingType;
import org.itworks.clicknbuild.engine.model.ResourceType;
import org.itworks.clicknbuild.engine.model.TileType;
import org.itworks.clicknbuild.util.io.PathWalker;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Set;

public final class StatsLoader {
    private static final String STATS_PATH = ConfigLoader.get(Configs.STATS_SOURCE_PATH);

    private static final String RESOURCE_FILE = ConfigLoader.get(Configs.STATS_RESOURCE_FILE);

    private static final String TILE_FILE = ConfigLoader.get(Configs.STATS_TILE_FILE);

    private static final String BUILDING_PATH = ConfigLoader.get(Configs.STATS_BUILDING_PATH);

    private static final String BUILDING_FILE_EXTENSION = ConfigLoader.get(Configs.STATS_BUILDING_FILE_EXTENSION);

    private static volatile StatsLoader inst;

    private StatsLoader() {
    }

    public static StatsLoader inst() {
        StatsLoader local = inst;
        if (local == null) {
            synchronized (StatsLoader.class) {
                local = inst;
                if (local == null) {
                    inst = local = new StatsLoader();
                }
            }
        }
        return local;
    }

    public void loadResourceStats() {
        ObjectMapper mapper = new ObjectMapper();
        ResourceTypeModel[] resources = null;
        try {
            resources = mapper.readValue(getClass().getResource(STATS_PATH + RESOURCE_FILE),
                    ResourceTypeModel[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        applyResourceStats(resources);
    }

    public void loadTileStats() {
        ObjectMapper mapper = new ObjectMapper();
        TileModel[] tiles = null;
        try {
            tiles = mapper.readValue(getClass().getResource(STATS_PATH + TILE_FILE), TileModel[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        applyTileStats(tiles);
    }

    public void loadBuildingStats() {
        ObjectMapper mapper = new ObjectMapper();
        Set<Path> paths = PathWalker.walk(getClass().getResource(BUILDING_PATH), BUILDING_FILE_EXTENSION);
        for (Path path : paths) {
            String filename = path.getFileName().toString();
            filename = filename.substring(0, filename.length() - BUILDING_FILE_EXTENSION.length());
            BuildingType type = BuildingType.get(filename);
            if (type == null) return;
            BuildingStatsModel model = null;
            try {
                model = mapper.readValue(path.toUri().toURL(), BuildingStatsModel.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
            applyBuildingStats(type, model);
        }
    }

    private void applyResourceStats(ResourceTypeModel... resources) {
        if (resources == null) return;
        for (ResourceTypeModel loaded : resources) {
            ResourceType resource = ResourceType.get(loaded.getType());
            if (resource == null) continue;
            if (loaded.getTradable() != null) resource.setTradable(loaded.getTradable());
            if (loaded.getPrice() != null) resource.setPrice(loaded.getPrice());
        }
    }

    private void applyTileStats(TileModel... tiles) {
        if (tiles == null) return;
        for (TileModel loaded : tiles) {
            TileType tile = TileType.get(loaded.getType());
            if (tile == null) continue;
            if (loaded.getStructure() != null) tile.setStructure(loaded.getStructure());
        }
    }

    private void applyBuildingStats(BuildingType type, BuildingStatsModel model) {
        if (type == null || model == null) return;
        type.stats.applyModelValues(model);
    }
}
