package org.itworks.clicknbuild.sources;

import org.itworks.clicknbuild.config.ConfigLoader;
import org.itworks.clicknbuild.config.Configs;
import org.itworks.clicknbuild.util.io.IOHelper;
import org.itworks.clicknbuild.util.string.StringHelper;

import java.net.MalformedURLException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public final class CssHandler {
    private static final String SOURCE_PATH = ConfigLoader.inst().get(Configs.CSS_SOURCE_PATH);

    private static final String FILE_EXTENSION = ConfigLoader.inst().get(Configs.CSS_FILE_EXTENSION);

    private static volatile CssHandler inst;

    private final HashMap<String, String> stylesheets = new HashMap<>();

    private CssHandler() {
    }

    public String get(String key) {
        return StringHelper.nonNull(stylesheets.get(StringHelper.nonNull(key)));
    }

    public String get(Csses key) {
        return get(Objects.requireNonNull(key.value));
    }

    public static CssHandler inst() {
        CssHandler local = inst;
        if (local == null) {
            synchronized (CssHandler.class) {
                local = inst;
                if (local == null) {
                    inst = local = new CssHandler();
                    local.loadCsses();
                }
            }
        }
        return local;
    }

    private void loadCsses() {
        Set<Path> paths = IOHelper.walk(getClass().getResource(SOURCE_PATH), FILE_EXTENSION);
        for (Path path : paths) {
            String filename = path.getFileName().toString();
            filename = filename.substring(0, filename.length() - FILE_EXTENSION.length());
            try {
                stylesheets.put(filename, path.toUri().toURL().toExternalForm());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
    }
}
