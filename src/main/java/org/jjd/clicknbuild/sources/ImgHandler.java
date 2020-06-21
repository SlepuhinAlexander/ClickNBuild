package org.jjd.clicknbuild.sources;

import javafx.scene.image.Image;
import org.jjd.clicknbuild.util.io.PathWalker;
import org.jjd.clicknbuild.util.string.Str;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Set;

public class ImgHandler {
    private static final ImgHandler INST = new ImgHandler();

    private final HashMap<String, Image> images = new HashMap<>();

    private ImgHandler() {
        initialize();
    }

    public static ImgHandler inst() {
        return INST;
    }

    public static Image get(String key) {
        Image result = INST.images.get(Str.nonNull(key, "dummy"));
        return result == null ? INST.images.get("dummy") : result;
    }

    public static Image get(String key, Size size) {
        return get(Str.nonNull(key) + size.suffix);
    }

    public static Image get(String key, String size) {
        return get(Str.nonNull(key) + Size.get(Str.nonNull(size)).suffix);
    }

    public static Image get(String key, int size) {
        return get(Str.nonNull(key) + Size.get(size).suffix);
    }

    private void initialize() {
        Set<Path> paths = PathWalker.walk(getClass().getResource("/static/icon"), "png");
        for (Path path : paths) {
            String filename = path.getFileName().toString();
            filename = filename.substring(0, filename.length() - ".png".length());
            Image image;
            try {
                image = new Image(Files.newInputStream(path));
            } catch (IOException e) {
                e.printStackTrace();
                continue;
            }
            images.put(filename, image);
        }
    }
}
