package org.jjd.clicknbuild.config;

import org.jjd.clicknbuild.util.string.Str;

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
    RES_SOURCE_PATH("res.source_path")
    ;

    final String value;

    Configs(String value) {
        this.value = Str.nonNull(value);
    }

    public static Configs get(String value) {
        for (Configs config : Configs.values()) {
            if (config.value.equalsIgnoreCase(Str.nonNull(value).trim())) return config;
        }
        return null;
    }

    public static Configs get(int ordinal) {
        for (Configs config : Configs.values()) if (config.ordinal() == ordinal) return config;
        return null;
    }
}



