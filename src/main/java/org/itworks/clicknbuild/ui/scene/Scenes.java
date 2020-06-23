package org.itworks.clicknbuild.ui.scene;

import org.itworks.clicknbuild.util.string.Str;

public enum Scenes {
    LANDING("landing");

    public final String name;

    Scenes(String name) {
        this.name = Str.nonNull(name);
    }
}
