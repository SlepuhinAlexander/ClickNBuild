package org.jjd.clicknbuild.sources;

import org.jjd.clicknbuild.util.io.PathWalker;
import org.jjd.clicknbuild.util.string.Str;

import java.net.MalformedURLException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Set;

public class CssHandler {
    private static final CssHandler INST = new CssHandler();

    private static final String SOURCE_PATH = "/static/style";

    private static final String FILE_EXTENSION = ".css";

    private final HashMap<String, String> stylesheets = new HashMap<>();

    private CssHandler() {
        initialize();
    }

    public static String get(String key) {
        return Str.nonNull(INST.stylesheets.get(Str.nonNull(key)));
    }

    public static CssHandler inst() {return INST;}

    private void initialize() {
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
