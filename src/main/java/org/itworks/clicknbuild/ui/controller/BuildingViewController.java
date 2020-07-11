package org.itworks.clicknbuild.ui.controller;

import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import org.itworks.clicknbuild.sources.CSSes;
import org.itworks.clicknbuild.sources.Sources;

public final class BuildingViewController extends BasicController {
    @FXML
    private BorderPane rootNode;

    @FXML
    private void initialize() {
        rootNode.getStylesheets().addAll(Sources.getCSS(CSSes.BUILDING_VIEW));
    }
}
