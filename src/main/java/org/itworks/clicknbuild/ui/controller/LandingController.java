package org.itworks.clicknbuild.ui.controller;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import org.itworks.clicknbuild.sources.CSSes;
import org.itworks.clicknbuild.sources.Images;
import org.itworks.clicknbuild.sources.Sources;
import org.itworks.clicknbuild.sources.Strings;
import org.itworks.clicknbuild.ui.SceneLoader;
import org.itworks.clicknbuild.ui.scene.Scenes;
import org.itworks.clicknbuild.util.math.MathHelper;

import java.io.IOException;

public final class LandingController extends BasicController {
    @FXML
    private StackPane rootNode;

    @FXML
    private ImageView backgroundImage;

    @FXML
    private Text greetingMessage;

    @FXML
    private void initialize() {
        rootNode.getStylesheets().addAll(Sources.getCSS(CSSes.LANDING));
        greetingMessage.setText(Sources.getL10n(Strings.GAME_TITLE));
        Images[] images = Images.get(Images.Group.BUILDING);
        backgroundImage.setImage(Sources.getImg(images[MathHelper.randomInt(images.length)]));
    }

    @FXML
    private void toMainMenu() throws IOException {
        SceneLoader.inst().show(Scenes.MAIN_MENU);
    }
}
