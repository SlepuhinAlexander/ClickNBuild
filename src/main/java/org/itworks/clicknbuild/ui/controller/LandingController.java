package org.itworks.clicknbuild.ui.controller;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import org.itworks.clicknbuild.sources.*;

public class LandingController {
    @FXML
    private StackPane rootNode;

    @FXML
    private ImageView icLandingBackground;

    @FXML
    private Text sLandingGreeting;

    @FXML
    private void initialize() {
        rootNode.getStylesheets().addAll(Src.getCss(Csses.LANDING));
        sLandingGreeting.setText(Src.getL10n(Strings.GAME_TITLE));
        icLandingBackground.setImage(Src.getImg(Images.BLD_HEADQUARTER));
    }
}
