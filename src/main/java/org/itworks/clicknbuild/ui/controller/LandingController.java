package org.itworks.clicknbuild.ui.controller;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import org.itworks.clicknbuild.sources.Csses;
import org.itworks.clicknbuild.sources.Images;
import org.itworks.clicknbuild.sources.Sources;
import org.itworks.clicknbuild.sources.Strings;
import org.itworks.clicknbuild.util.math.MathHelper;

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
        rootNode.getStylesheets().addAll(Sources.getCss(Csses.LANDING));
        sLandingGreeting.setText(Sources.getL10n(Strings.GAME_TITLE));
        List<Images> images = Images.get(Images.Group.BUILDING);
        icLandingBackground.setImage(Sources.getImg(images.get(MathHelper.randomInt(images.size()))));
    }
}
