package org.itworks.clicknbuild.ui.controller;

import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import org.itworks.clicknbuild.sources.CSSes;
import org.itworks.clicknbuild.sources.Sources;

public final class CityViewController extends BasicController {
    @FXML
    private BorderPane rootNode;

    @FXML
    private void initialize() {
        rootNode.getStylesheets().addAll(Sources.getCSS(CSSes.CITY_VIEW));
    }
}
