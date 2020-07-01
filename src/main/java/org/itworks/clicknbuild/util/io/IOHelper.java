package org.itworks.clicknbuild.util.io;

import org.itworks.clicknbuild.util.string.StringHelper;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class IOHelper {
    /**
     * Recursively walks down the file tree starting from the <code>root</code> position.
     * Collects all regular files (Paths to them) ending with the given <code>extension</code>.
     * <b>USE</b> the dot sign for <code>extension</code> param: e.g. <code>walk(root, ".txt")</code>
     */
    public static Set<Path> walk(URL root, String extension) {
        Set<Path> paths = new HashSet<>();
        if (root == null) return paths;
        try {
            paths = Files.walk(Paths.get(root.toURI()))
                    .filter(Files::isRegularFile)
                    .filter(Files::isReadable)
                    .filter(path -> StringHelper.endsWithIgnoreCase(path.toFile().getName(),
                            StringHelper.nonNull(extension)))
                    .collect(Collectors.toSet());
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
        return paths;
    }

    /**
     * Recursively creates a file or a directory as well as all parent directories if they are not exist.
     */
    public static void createIfNotExist(Path path, boolean isDirectory) throws IOException {
        Objects.requireNonNull(path);
        if (!path.isAbsolute()) throw new IllegalArgumentException("path must be absolute");
        if (Files.exists(path) && Files.isDirectory(path) == isDirectory && Files.isRegularFile(path) != isDirectory) {
            return;
        }
        createIfNotExist(path.getParent(), true);
        if (!Files.exists(path)) {
            if (isDirectory) {
                Files.createDirectory(path);
            } else {
                Files.createFile(path);
            }
        }
    }

    /**
     * Recursively deletes a folder with all its contents.
     */
    public static void deleteIfExists(Path path) throws IOException {
        Objects.requireNonNull(path);
        if (!Files.exists(path)) return;
        if (!path.isAbsolute()) throw new IllegalArgumentException("path must be absolute");
        Files.walk(path).sorted(Comparator.reverseOrder()).forEach(aPath -> {
            try {
                Files.deleteIfExists(aPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
