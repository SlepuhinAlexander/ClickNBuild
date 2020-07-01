package org.itworks.clicknbuild.sources;

import org.itworks.clicknbuild.util.string.StringHelper;

/**
 * Global hangler of string keys for CssHandler
 */
public enum Csses {
    LANDING("landing");

    final String value;

    Csses(String value) {
        this.value = StringHelper.nonNull(value);
    }

    public static Csses get(String value) {
        Csses[] csses = values();
        for (Csses css : csses) if (css.value.equalsIgnoreCase(StringHelper.nonNull(value).trim())) return css;
        return null;
    }

    public static Csses get(int ordinal) {
        Csses[] csses = values();
        if (ordinal < 0 || ordinal >= csses.length) return null;
        return csses[ordinal];
    }
}
