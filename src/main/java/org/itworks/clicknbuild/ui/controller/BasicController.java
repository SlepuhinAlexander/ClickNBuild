package org.itworks.clicknbuild.ui.controller;

import org.itworks.clicknbuild.ui.Controllers;
import org.itworks.clicknbuild.ui.SceneLoader;
import org.itworks.clicknbuild.ui.scene.Scenes;

public abstract class BasicController {
    protected BasicController() {
        register();
    }

    private void register() {
        Controllers.inst().register(this);
    }
}
