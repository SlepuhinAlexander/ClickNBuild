package org.itworks.clicknbuild.ui.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import org.itworks.clicknbuild.sources.CSSes;
import org.itworks.clicknbuild.sources.Sources;
import org.itworks.clicknbuild.sources.Strings;
import org.itworks.clicknbuild.ui.SceneLoader;
import org.itworks.clicknbuild.ui.scene.Scenes;

import java.io.IOException;

public final class HelpMenuController extends BasicController {
    @FXML
    private Text title;

    @FXML
    private BorderPane rootNode;

    @FXML
    private Text helpTextDummy;

    @FXML
    private Button btnBack;

    @FXML
    private void initialize() {
        rootNode.getStylesheets().addAll(Sources.getCSS(CSSes.HELP_MENU));
        title.setText(Sources.getL10n(Strings.HELP_TITLE));
        helpTextDummy.setText(Sources.getL10n(Strings.HELP_DUMMY));
        btnBack.setText(Sources.getL10n(Strings.BTN_BACK));
    }

    @FXML
    private void toMainMenu() throws IOException {
        SceneLoader.inst().show(Scenes.MAIN_MENU);
    }
}
