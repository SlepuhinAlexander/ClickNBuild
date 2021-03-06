package org.itworks.clicknbuild.sources;

import javafx.scene.image.Image;
import org.itworks.clicknbuild.config.ConfigLoader;
import org.itworks.clicknbuild.config.Configs;
import org.itworks.clicknbuild.util.io.IOHelper;
import org.itworks.clicknbuild.util.math.MathHelper;
import org.itworks.clicknbuild.util.string.StringHelper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public final class ImgHandler {
    private static final String SOURCE_PATH = ConfigLoader.inst().get(Configs.IMG_SOURCE_PATH);

    private static final String FILE_EXTENSION = ConfigLoader.inst().get(Configs.IMG_FILE_EXTENSION);

    private static final String DEFAULT_IMAGE_NAME = ConfigLoader.inst().get(Configs.IMG_DEFAULT_IMAGE_NAME);

    private static volatile ImgHandler inst;

    private final HashMap<String, Image> images = new HashMap<>();

    private ImgHandler() {
    }

    public static ImgHandler inst() {
        ImgHandler local = inst;
        if (local == null) {
            synchronized (ImgHandler.class) {
                local = inst;
                if (local == null) {
                    inst = local = new ImgHandler();
                    local.loadImgs();
                }
            }
        }
        return local;
    }

    public Image get(String key) {
        Image result = images.get(StringHelper.nonNull(key, DEFAULT_IMAGE_NAME));
        return result == null ? images.get(DEFAULT_IMAGE_NAME) : result;
    }

    public Image get(String key, Size size) {
        return get(StringHelper.nonNull(key) + size.source_suffix);
    }

    public Image get(String key, String size) {
        return get(StringHelper.nonNull(key) + Size.get(StringHelper.nonNull(size)).source_suffix);
    }

    public Image get(String key, int size) {
        return get(StringHelper.nonNull(key) + Size.get(size).source_suffix);
    }

    public Image get(Images key) {
        return get(Objects.requireNonNull(key).name);
    }

    public Image get(Images key, Size size) {
        return get(Objects.requireNonNull(key).name, size);
    }

    public Image get(Images key, String size) {
        return get(Objects.requireNonNull(key).name, size);
    }

    public Image get(Images key, int size) {
        return get(Objects.requireNonNull(key).name, size);
    }

    private void loadImgs() {
        Set<Path> paths = IOHelper.walk(getClass().getResource(SOURCE_PATH), FILE_EXTENSION);
        for (Path path : paths) {
            String filename = path.getFileName().toString();
            filename = filename.substring(0, filename.length() - FILE_EXTENSION.length());
            try {
                Image image = new Image(Files.newInputStream(path));
                images.put(filename, image);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Enum for icons sizes.
     * Allows to get an appropriate key suffix to get an icon of desired size form the Image Resource Handler
     */
    public enum Size {
        DEFAULT("default", 512, ""),
        TINY("tiny", 16, "_16"),
        MICRO("micro", 20, "_20"),
        SMALL("small", 24, "_24"),
        MEDIUM("medium", 32, "_32"),
        BIG("big", 48, "_48"),
        LARGE("large", 64, "_64"),
        HUGE("huge", 128, "_128"),
        GIANT("giant", 256, "_256"),
        FULL("full", 512, "_512");

        // lowercased equivalent for enum element itself.
        public final String name;

        // Expected icon size in pixels.
        public final int size;

        // Default key suffix for retrieving and icon form the Image Resource Handler.
        public final String source_suffix;

        Size(String name, int size, String source_suffix) {
            this.name = StringHelper.nonNull(name);
            this.size = MathHelper.clamp(size);
            this.source_suffix = StringHelper.nonNull(source_suffix);
        }

        public static Size get(String value) {
            for (Size size : values()) if (size.name.equalsIgnoreCase(value)) return size;
            return DEFAULT;
        }

        public static Size get(int value) {
            int[] sizes = new int[values().length];
            int i = 0;
            for (Size size : values()) {
                sizes[i] = size.size;
                i++;
            }
            int index = Arrays.binarySearch(sizes, value);
            if (index < 0) {
                int insertion = -index - 1;
                if (insertion >= sizes.length) {
                    index = sizes.length - 1;
                } else if (insertion <= 0) {
                    index = 0;
                } else {
                    if (value - sizes[insertion - 1] < sizes[insertion] - value) {
                        index = insertion - 1;
                    } else {
                        index = insertion;
                    }
                }
            }
            for (Size size : values()) if (size.size == sizes[index]) return size;
            return DEFAULT;
        }
    }
}
