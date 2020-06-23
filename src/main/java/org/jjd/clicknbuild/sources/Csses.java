package org.jjd.clicknbuild.sources;

import org.jjd.clicknbuild.util.string.Str;

/** Global hangler of string keys for CssHandler */
public enum Csses {
    EMPTY(""),
    LANDING("landing")
    ;

    final String value;

    Csses(String value) {
        this.value = Str.nonNull(value);
    }

    public static Csses get(String value) {
        for (Csses css : Csses.values()) if (css.value.equalsIgnoreCase(Str.nonNull(value).trim())) return css;
        return EMPTY;
    }

    public static Csses get(int ordinal) {
        for (Csses css : Csses.values()) if (css.ordinal() == ordinal) return css;
        return EMPTY;
    }
}
