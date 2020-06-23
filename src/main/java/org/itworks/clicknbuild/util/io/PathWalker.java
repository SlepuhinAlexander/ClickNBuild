package org.itworks.clicknbuild.util.io;

import org.itworks.clicknbuild.util.string.Str;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class PathWalker {
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
                    .filter(path -> Str.endsWithIgnoreCase(path.toFile().getName(), Str.nonNull(extension)))
                    .collect(Collectors.toSet());
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
        return paths;
    }
}
