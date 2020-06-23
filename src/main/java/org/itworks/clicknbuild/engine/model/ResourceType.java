package org.itworks.clicknbuild.engine.model;

import org.itworks.clicknbuild.util.string.Str;

public enum ResourceType {
    STEEL("steel", "res.steel", "res_steel");

    // lowercased equivalent for enum element itself.
    final String type;

    // localized name: the key to get the localized representation from the resource handler.
    final String name;

    // the key to get the corresponding icon from the resource handler.
    final String icon;

    ResourceType(String type, String name, String icon) {
        this.type = Str.nonNull(type);
        this.name = Str.nonNull(name);
        this.icon = Str.nonNull(icon);
    }
}
