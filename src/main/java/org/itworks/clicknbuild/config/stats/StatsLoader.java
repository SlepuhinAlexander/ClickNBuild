package org.itworks.clicknbuild.config.stats;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.itworks.clicknbuild.config.ConfigLoader;
import org.itworks.clicknbuild.config.Configs;
import org.itworks.clicknbuild.config.stats.model.ResourceModel;
import org.itworks.clicknbuild.engine.model.ResourceType;

import java.io.IOException;

public class StatsLoader {
    private static final String STATS_PATH = ConfigLoader.get(Configs.STATS_SOURCE_PATH);

    private static final String RESOURCE_FILE = ConfigLoader.get(Configs.STATS_RESOURCE_FILE);

    private static final String TILE_FILE = ConfigLoader.get(Configs.STATS_TILE_FILE);

    private static final String BUILDING_FILE = ConfigLoader.get(Configs.STATS_BUILDING_FILE);

    private static final StatsLoader INST = new StatsLoader();

    public static StatsLoader inst() {
        return INST;
    }

    public void loadResourceStats() {
        ObjectMapper mapper = new ObjectMapper();
        ResourceModel[] resources = null;
        try {
            resources = mapper.readValue(getClass().getResource(STATS_PATH + RESOURCE_FILE),
                    ResourceModel[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        applyResourceStats(resources);
    }

    public void loadTileStats() {
        applyTileStats();
    }

    public void loadBuildingStats() {
        applyBuildingStats();
    }

    private void applyResourceStats(ResourceModel... resources) {
        if (resources == null) return;
        for (ResourceModel loaded : resources) {
            ResourceType resource = ResourceType.get(loaded.getType());
            if (resource == null) continue;
            if (loaded.getTradable() != null) resource.setTradable(loaded.getTradable());
            if (loaded.getPrice() != null) resource.setPrice(loaded.getPrice());
        }
    }

    private void applyTileStats() {

    }

    private void applyBuildingStats() {

    }
}
