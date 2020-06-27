package org.itworks.clicknbuild.sources;

import org.itworks.clicknbuild.config.ConfigLoader;
import org.itworks.clicknbuild.config.Configs;
import org.itworks.clicknbuild.util.io.PathWalker;
import org.itworks.clicknbuild.util.string.Str;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public final class FxmlHandler {
    private static final String SOURCE_PATH = ConfigLoader.get(Configs.FXML_SOURCE_PATH);

    private static final String FILE_EXTENSION = ConfigLoader.get(Configs.FXML_FILE_EXTENSION);

    private static final FxmlHandler INST = new FxmlHandler();

    private final HashMap<String, URL> sources = new HashMap<>();

    private FxmlHandler() {
        load();
    }

    public static URL get(String key) {
        return INST.sources.get(Str.nonNull(key));
    }

    public static URL get(Fxmls key) {
        return get(Objects.requireNonNull(key).value);
    }

    public static FxmlHandler inst() {
        return INST;
    }

    private void load() {
        Set<Path> paths = PathWalker.walk(getClass().getResource(SOURCE_PATH), FILE_EXTENSION);
        for (Path path : paths) {
            String filename = path.getFileName().toString();
            filename = filename.substring(0, filename.length() - FILE_EXTENSION.length());
            try {
                sources.put(filename, path.toUri().toURL());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
    }
}
