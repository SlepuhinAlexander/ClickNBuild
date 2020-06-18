package org.jjd.clicknbuild.res;

import org.jjd.clicknbuild.util.io.PathWalker;
import org.jjd.clicknbuild.util.string.Str;

import java.net.MalformedURLException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Set;

public class CssHandler {
    private static final CssHandler INST = new CssHandler();
    private final HashMap<String, String> stylesheets = new HashMap<>();

    private CssHandler() {
        initialize();
    }

    public static String get(String key) {
        return Str.nonNull(INST.stylesheets.get(Str.nonNull(key)));
    }

    private void initialize() {
        Set<Path> paths = PathWalker.walk(getClass().getResource("/static/style"), "css");
        for (Path path : paths) {
            String filename = path.getFileName().toString();
            filename = filename.substring(0, filename.length() - ".css".length());
            String style;
            try {
                style = path.toUri().toURL().toExternalForm();
            } catch (MalformedURLException e) {
                e.printStackTrace();
                continue;
            }
            stylesheets.put(filename, style);
        }
    }
}
