package org.itworks.clicknbuild.config;

import org.itworks.clicknbuild.util.string.StringHelper;

public enum Configs {
    MAIN_CONFIG_PATH("/config/config.properties"),
    FXML_SOURCE_PATH("fxml.source_path"),
    FXML_FILE_EXTENSION("fxml.file_extension"),
    CSS_SOURCE_PATH("css.source_path"),
    CSS_FILE_EXTENSION("css.file_extension"),
    IMG_SOURCE_PATH("img.source_path"),
    IMG_FILE_EXTENSION("img.file_extension"),
    IMG_DEFAULT_IMAGE_NAME("img.default_image_name"),
    L10N_SOURCE_PATH("l10n.source_path"),
    L10N_FILE_EXTENSION("l10n.file_extension"),
    STATS_SOURCE_PATH("stats.source_path"),
    STATS_RESOURCE_FILE("stats.resource_file"),
    STATS_TILE_FILE("stats.tile_file"),
    STATS_BUILDING_PATH("stats.building_path"),
    STATS_BUILDING_FILE_EXTENSION("stats.building_file_extension"),
    PROFILE_SLOTS_COUNT("profile.slots_count"),
    PROFILE_PATH("profile.path"),
    PROFILE_FOLDER_NAME("profile.folder_name"),
    PROFILE_PREFERENCES_FILE_NAME("profile.preferences_file_name"),
    PROFILE_GAMESAVE_FILE_NAME("profile.gamesave_file_name"),

    ;

    /**
     * String key to retrieve a config value from the {@link ConfigLoader}
     */
    final String value;

    Configs(String value) {
        this.value = StringHelper.nonNull(value);
    }

    public static Configs get(String value) {
        Configs[] configs = values();
        for (Configs config : configs) {
            if (config.value.equalsIgnoreCase(StringHelper.nonNull(value).trim())) return config;
        }
        return null;
    }

    public static Configs get(int ordinal) {
        Configs[] configs = values();
        if (ordinal < 0 || ordinal >= configs.length) return null;
        return configs[ordinal];
    }
}



