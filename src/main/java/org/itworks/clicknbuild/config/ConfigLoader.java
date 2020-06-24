package org.itworks.clicknbuild.config;

import org.itworks.clicknbuild.util.string.Str;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

public class ConfigLoader {
    private static final String CONFIG_PATH = Configs.MAIN_CONFIG_PATH.value;

    private static final ConfigLoader INST = new ConfigLoader();

    private final Properties configs = new Properties();

    private ConfigLoader() {
        loadConfigs();
    }

    public static ConfigLoader inst() {
        return INST;
    }

    public static String get(String key) {
        return INST.configs.getProperty(Str.nonNull(key));
    }

    public static String get(Configs config) {
        return get(Objects.requireNonNull(config).value);
    }

    private void loadConfigs() {
        try (InputStream in = getClass().getResourceAsStream(CONFIG_PATH)) {
            configs.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
