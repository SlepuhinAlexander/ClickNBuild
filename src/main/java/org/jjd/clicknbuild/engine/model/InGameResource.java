package org.jjd.clicknbuild.engine.model;

import org.jjd.clicknbuild.util.string.Str;

public enum InGameResource {
    STEEL("steel", "res.steel", "res_steel");

    // lowercased equivalent for enum element itself.
    final String value;

    // localized name: the key to get the localized representation from the resource handler.
    final String name;

    // the key to get the corresponding icon from the resource handler.
    final String icon;

    InGameResource(String value, String name, String icon) {
        this.value = Str.nonNull(value);
        this.name = Str.nonNull(name);
        this.icon = Str.nonNull(icon);
    }
}
