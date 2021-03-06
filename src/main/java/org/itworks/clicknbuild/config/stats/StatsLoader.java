package org.itworks.clicknbuild.config.stats;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.itworks.clicknbuild.config.ConfigLoader;
import org.itworks.clicknbuild.config.Configs;
import org.itworks.clicknbuild.config.stats.model.ResTypeModel;
import org.itworks.clicknbuild.config.stats.model.TileModel;
import org.itworks.clicknbuild.engine.building.BuildingType;
import org.itworks.clicknbuild.engine.res.ResType;
import org.itworks.clicknbuild.engine.res.TileType;
import org.itworks.clicknbuild.util.io.IOHelper;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Set;

public final class StatsLoader {
    private static final String STATS_PATH = ConfigLoader.inst().get(Configs.STATS_SOURCE_PATH);

    private static final String RESOURCE_FILE = ConfigLoader.inst().get(Configs.STATS_RESOURCE_FILE);

    private static final String TILE_FILE = ConfigLoader.inst().get(Configs.STATS_TILE_FILE);

    private static final String BUILDING_PATH = ConfigLoader.inst().get(Configs.STATS_BUILDING_PATH);

    private static final String BUILDING_FILE_EXTENSION =
            ConfigLoader.inst().get(Configs.STATS_BUILDING_FILE_EXTENSION);

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

    public void loadResStats() {
        ObjectMapper mapper = new ObjectMapper();
        ResTypeModel[] resources = null;
        try {
            resources = mapper.readValue(getClass().getResource(STATS_PATH + RESOURCE_FILE),
                    ResTypeModel[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        applyResStats(resources);
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
        Set<Path> paths = IOHelper.walk(getClass().getResource(BUILDING_PATH), BUILDING_FILE_EXTENSION);
        for (Path path : paths) {
            String filename = path.getFileName().toString();
            filename = filename.substring(0, filename.length() - BUILDING_FILE_EXTENSION.length());
            BuildingType type = BuildingType.get(filename);
            if (type == null) return;
            try {
                mapper.readerForUpdating(type.stats).readValue(path.toUri().toURL(), BuildingDefaults.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void applyResStats(ResTypeModel... resources) {
        if (resources == null) return;
        for (ResTypeModel loaded : resources) {
            ResType res = ResType.get(loaded.getType());
            if (res == null) continue;
            if (loaded.getTradable() != null) res.setTradable(loaded.getTradable());
            if (loaded.getPrice() != null) res.setPrice(loaded.getPrice());
        }
    }

    private void applyTileStats(TileModel... tiles) {
        if (tiles == null) return;
        for (TileModel loaded : tiles) {
            TileType tile = TileType.get(loaded.getType());
            if (tile == null) continue;
            if (loaded.getStructure() != null) tile.setStructure(loaded.getStructure().intValue());
        }
    }
}
