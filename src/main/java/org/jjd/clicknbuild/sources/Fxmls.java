package org.jjd.clicknbuild.sources;

import org.jjd.clicknbuild.util.string.Str;

/** Global holder of string keys for FxmlHandler */
public enum Fxmls {
    LANDING("landing"),
    ;

    final String value;

    Fxmls(String value) {
        this.value = Str.nonNull(value);
    }

    public static Fxmls get(String value) {
        for (Fxmls fxml : Fxmls.values()) if (fxml.value.equalsIgnoreCase(Str.nonNull(value).trim())) return fxml;
        return null;
    }

    public static Fxmls get(int ordinal) {
        for (Fxmls fxml : Fxmls.values()) if (fxml.ordinal() == ordinal) return fxml;
        return null;
    }
}
