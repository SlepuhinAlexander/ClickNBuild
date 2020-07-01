package org.itworks.clicknbuild.ui.scene;

import org.itworks.clicknbuild.ui.controller.LandingController;
import org.itworks.clicknbuild.util.string.StringHelper;

import java.util.Objects;

public enum Scenes {
    LANDING("landing", LandingController.class),
    ;

    /**
     * String key to retrieve a corresponding FXML from FXML handler
     */
    public final String name;

    /**
     * Link to corresponding scene controller class.
     */
    public final Class<?> controller;

    Scenes(String name, Class<?> controller) {
        this.name = StringHelper.nonNull(name);
        this.controller = Objects.requireNonNull(controller);
    }

    public static Scenes get(String name) {
        Scenes[] scenes = values();
        for (Scenes scene : scenes) if (scene.name.equalsIgnoreCase(StringHelper.nonNull(name).trim())) return scene;
        return null;
    }

    public static Scenes get(int ordinal) {
        Scenes[] scenes = values();
        if (ordinal < 0 || ordinal >= scenes.length) return null;
        return scenes[ordinal];
    }
}
