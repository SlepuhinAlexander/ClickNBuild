package org.itworks.clicknbuild.sources;

import org.itworks.clicknbuild.util.string.Str;

/**
 * Global holder of string keys for FxmlHandler
 */
public enum Fxmls {
    LANDING("landing"),
    ;

    final String value;

    Fxmls(String value) {
        this.value = Str.nonNull(value);
    }

    public static Fxmls get(String value) {
        Fxmls[] fxmls = values();
        for (Fxmls fxml : fxmls) if (fxml.value.equalsIgnoreCase(Str.nonNull(value).trim())) return fxml;
        return null;
    }

    public static Fxmls get(int ordinal) {
        Fxmls[] fxmls = values();
        if (ordinal < 0 || ordinal >= fxmls.length) return null;
        return fxmls[ordinal];
    }
}
