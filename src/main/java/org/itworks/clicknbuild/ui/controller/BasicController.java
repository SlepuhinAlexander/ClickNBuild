package org.itworks.clicknbuild.ui.controller;

import org.itworks.clicknbuild.ui.Controllers;

public abstract class BasicController {
    protected BasicController() {
        register();
    }

    private void register() {
        Controllers.inst().register(this);
    }
}
