package org.itworks.clicknbuild.config;

import org.itworks.clicknbuild.util.string.StringHelper;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

public final class ConfigLoader {
    private static final String CONFIG_PATH = Configs.MAIN_CONFIG_PATH.value;

    private static volatile ConfigLoader inst;

    private final Properties configs = new Properties();

    private ConfigLoader() {
    }

    public static ConfigLoader inst() {
        ConfigLoader local = inst;
        if (local == null) {
            synchronized (ConfigLoader.class) {
                local = inst;
                if (local == null) {
                    inst = local = new ConfigLoader();
                    local.loadConfigs();
                }
            }
        }
        return local;
    }

    public String get(String key) {
        return configs.getProperty(StringHelper.nonNull(key));
    }

    public String get(Configs config) {
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
