package org.itworks.clicknbuild.ui.controller;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;
import org.itworks.clicknbuild.sources.Csses;
import org.itworks.clicknbuild.sources.Images;
import org.itworks.clicknbuild.sources.Src;
import org.itworks.clicknbuild.sources.Strings;
import org.itworks.clicknbuild.util.math.M;

import java.util.List;

public final class LandingController extends BasicController {
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
        List<Images> images = Images.get(Images.Group.BUILDING);
        icLandingBackground.setImage(Src.getImg(images.get(M.randomInt(images.size()))));
    }
}
