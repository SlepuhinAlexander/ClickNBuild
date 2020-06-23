package org.jjd.clicknbuild.ui.scene;

import org.jjd.clicknbuild.util.string.Str;

public enum Scenes {
    LANDING("landing");

    public final String name;

    Scenes(String name) {
        this.name = Str.nonNull(name);
    }
}
