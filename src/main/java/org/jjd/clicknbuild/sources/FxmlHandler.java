package org.jjd.clicknbuild.sources;

import org.jjd.clicknbuild.util.io.PathWalker;
import org.jjd.clicknbuild.util.string.Str;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Set;

public class FxmlHandler {
    private static final FxmlHandler INST = new FxmlHandler();

    private static final String SOURCE_PATH = "/static/scene";

    private static final String FILE_EXTENSION = ".fxml";

    private final HashMap<String, URL> sources = new HashMap<>();

    private FxmlHandler() {
        initialize();
    }

    public static URL get(String key) {
        return INST.sources.get(Str.nonNull(key));
    }

    public static FxmlHandler inst() {
        return INST;
    }

    private void initialize() {
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
