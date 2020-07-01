package org.itworks.clicknbuild.sources;

import org.itworks.clicknbuild.util.string.StringHelper;

/**
 * Global holder of string keys for FxmlHandler
 */
public enum FXMLs {
    LANDING("landing"),
    ;

    final String value;

    FXMLs(String value) {
        this.value = StringHelper.nonNull(value);
    }

    public static FXMLs get(String value) {
        FXMLs[] fxmls = values();
        for (FXMLs fxml : fxmls) if (fxml.value.equalsIgnoreCase(StringHelper.nonNull(value).trim())) return fxml;
        return null;
    }

    public static FXMLs get(int ordinal) {
        FXMLs[] fxmls = values();
        if (ordinal < 0 || ordinal >= fxmls.length) return null;
        return fxmls[ordinal];
    }
}
