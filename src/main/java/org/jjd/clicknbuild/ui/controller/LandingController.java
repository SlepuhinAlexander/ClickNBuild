package org.jjd.clicknbuild.ui.controller;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import org.jjd.clicknbuild.sources.R;
import org.jjd.clicknbuild.sources.Size;

public class LandingController {
    @FXML
    private StackPane rootNode;

    @FXML
    private ImageView icLandingBackground;

    @FXML
    private Text sLandingGreeting;

    @FXML
    private void initialize() {
        rootNode.getStylesheets().addAll(R.getCss("landing"));
        sLandingGreeting.setText(R.getL10n("game.title"));
        icLandingBackground.setImage(R.getImg("headquarter", Size.FULL));
    }
}
