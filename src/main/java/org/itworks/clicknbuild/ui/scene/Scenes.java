package org.itworks.clicknbuild.ui.scene;

import org.itworks.clicknbuild.util.string.Str;

public enum Scenes {
    LANDING("landing");

    public final String name;

    Scenes(String name) {
        this.name = Str.nonNull(name);
    }

    public static Scenes get(String name) {
        Scenes[] scenes = values();
        for (Scenes scene : scenes) if (scene.name.equalsIgnoreCase(Str.nonNull(name).trim())) return scene;
        return null;
    }

    public static Scenes get(int ordinal) {
        Scenes[] scenes = values();
        if (ordinal < 0 || ordinal >= scenes.length) return null;
        return scenes[ordinal];
    }
}
