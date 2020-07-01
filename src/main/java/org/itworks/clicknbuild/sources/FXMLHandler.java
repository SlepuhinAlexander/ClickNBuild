package org.itworks.clicknbuild.sources;

import org.itworks.clicknbuild.config.ConfigLoader;
import org.itworks.clicknbuild.config.Configs;
import org.itworks.clicknbuild.util.io.IOHelper;
import org.itworks.clicknbuild.util.string.StringHelper;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public final class FXMLHandler {
    private static final String SOURCE_PATH = ConfigLoader.inst().get(Configs.FXML_SOURCE_PATH);

    private static final String FILE_EXTENSION = ConfigLoader.inst().get(Configs.FXML_FILE_EXTENSION);

    private static volatile FXMLHandler inst;

    private final HashMap<String, URL> fxmls = new HashMap<>();

    private FXMLHandler() {
        loadFXMLs();
    }

    public URL get(String key) {
        return fxmls.get(StringHelper.nonNull(key));
    }

    public URL get(FXMLs key) {
        return get(Objects.requireNonNull(key).value);
    }

    public static FXMLHandler inst() {
        FXMLHandler local = inst;
        if (local == null) {
            synchronized (FXMLHandler.class) {
                local = inst;
                if (local == null) {
                    inst = local = new FXMLHandler();
                    local.loadFXMLs();
                }
            }
        }
        return local;
    }

    private void loadFXMLs() {
        Set<Path> paths = IOHelper.walk(getClass().getResource(SOURCE_PATH), FILE_EXTENSION);
        for (Path path : paths) {
            String filename = path.getFileName().toString();
            filename = filename.substring(0, filename.length() - FILE_EXTENSION.length());
            try {
                fxmls.put(filename, path.toUri().toURL());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
    }
}
