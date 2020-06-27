package org.itworks.clicknbuild.sources;

import org.itworks.clicknbuild.config.ConfigLoader;
import org.itworks.clicknbuild.config.Configs;
import org.itworks.clicknbuild.util.io.PathWalker;
import org.itworks.clicknbuild.util.string.Str;

import java.net.MalformedURLException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public final class CssHandler {
    private static final String SOURCE_PATH = ConfigLoader.get(Configs.CSS_SOURCE_PATH);

    private static final String FILE_EXTENSION = ConfigLoader.get(Configs.CSS_FILE_EXTENSION);

    private static final CssHandler INST = new CssHandler();

    private final HashMap<String, String> stylesheets = new HashMap<>();

    private CssHandler() {
        load();
    }

    public static String get(String key) {
        return Str.nonNull(INST.stylesheets.get(Str.nonNull(key)));
    }

    public static String get(Csses key) {
        return get(Objects.requireNonNull(key.value));
    }

    public static CssHandler inst() {
        return INST;
    }

    private void load() {
        Set<Path> paths = PathWalker.walk(getClass().getResource(SOURCE_PATH), FILE_EXTENSION);
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
