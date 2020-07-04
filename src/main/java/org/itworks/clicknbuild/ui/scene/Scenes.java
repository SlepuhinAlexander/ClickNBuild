package org.itworks.clicknbuild.ui.scene;

import org.itworks.clicknbuild.sources.FXMLs;
import org.itworks.clicknbuild.ui.controller.*;
import org.itworks.clicknbuild.util.string.StringHelper;

import java.util.Objects;

public enum Scenes {
    LANDING("landing", FXMLs.LANDING, LandingController.class),
    MAIN_MENU("main_menu", FXMLs.MAIN_MENU, MainMenuController.class),
    HELP_MENU("help_menu", FXMLs.HELP_MENU, HelpMenuController.class),
    PROFILE_SELECTION("profile_selection", FXMLs.PROFILE_SELECTION, ProfileSelectionController.class),
    EDIT_PROFILE("edit_profile", FXMLs.EDIT_PROFILE, EditProfileController.class),
    ;

    /**
     * String equivalent of this enum value.
     */
    public final String name;

    /**
     * {@link FXMLs} key to retrieve a corresponding FXML from FXML handler
     */
    public final FXMLs fxml;

    /**
     * Link to corresponding scene controller class.
     */
    public final Class<?> controller;

    Scenes(String name, FXMLs fxml, Class<?> controller) {
        this.name = StringHelper.nonNull(name);
        this.fxml = Objects.requireNonNull(fxml);
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
