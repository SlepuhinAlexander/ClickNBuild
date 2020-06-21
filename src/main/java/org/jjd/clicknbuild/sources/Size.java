package org.jjd.clicknbuild.sources;

import org.jjd.clicknbuild.util.math.M;
import org.jjd.clicknbuild.util.string.Str;

import java.util.Arrays;

/**
 * Enum for icons sizes.
 * Allows to get an appropriate key suffix to get an icon of desired size form the Image Resource Handler
 */
public enum Size {
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
    public final String value;

    // Expected icon size in pixels.
    public final int size;

    // Default key suffix for retrieving and icon form the Image Resource Handler.
    public final String suffix;

    Size(String value, int size, String suffix) {
        this.value = Str.nonNull(value);
        this.size = M.clamp(size);
        this.suffix = Str.nonNull(suffix);
    }

    public static Size get(String value) {
        for (Size size : values()) {
            if (size.value.equalsIgnoreCase(value)) return size;
        }
        return SMALL;
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
        for (Size size : values()) {
            if (size.size == sizes[index]) return size;
        }
        return SMALL;
    }
}
