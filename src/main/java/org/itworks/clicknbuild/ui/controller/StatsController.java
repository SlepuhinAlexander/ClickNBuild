package org.itworks.clicknbuild.ui.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ScrollPane;
import org.itworks.clicknbuild.sources.CSSes;
import org.itworks.clicknbuild.sources.Sources;

public final class StatsController extends BasicController {
    @FXML
    private ScrollPane rootNode;

    @FXML
    private void initialize() {
        rootNode.getStylesheets().addAll(Sources.getCSS(CSSes.STATS));
    }
}
