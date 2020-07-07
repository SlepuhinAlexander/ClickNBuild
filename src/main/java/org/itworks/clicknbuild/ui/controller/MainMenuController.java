package org.itworks.clicknbuild.ui.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import org.itworks.clicknbuild.engine.profile.ProfileManager;
import org.itworks.clicknbuild.sources.CSSes;
import org.itworks.clicknbuild.sources.ImgHandler;
import org.itworks.clicknbuild.sources.Sources;
import org.itworks.clicknbuild.sources.Strings;
import org.itworks.clicknbuild.ui.SceneLoader;
import org.itworks.clicknbuild.ui.Scenes;

import java.io.IOException;

public final class MainMenuController extends BasicController {
    @FXML
    private BorderPane rootNode;

    @FXML
    private Text title;

    @FXML
    private ImageView selectedProfile;

    @FXML
    private Text selectedProfileName;

    @FXML
    private Button btnStartGame;

    @FXML
    private Button btnSelectProfile;

    @FXML
    private Button btnHelp;

    @FXML
    private Button bntExit;

    @FXML
    private void initialize() {
        rootNode.getStylesheets().addAll(Sources.getCSS(CSSes.MAIN_MENU));
        title.setText(Sources.getL10n(Strings.GAME_TITLE));
        selectedProfile.setImage(Sources.getImg(ProfileManager.inst().getProfile().getPreferences().getAvatar(),
                ImgHandler.Size.HUGE));
        selectedProfileName.setText(ProfileManager.inst().getProfile().getPreferences().getName());
        btnStartGame.setText(Sources.getL10n(Strings.BTN_START_GAME));
        btnSelectProfile.setText(Sources.getL10n(Strings.BTN_SELECT_PROFILE));
        btnHelp.setText(Sources.getL10n(Strings.BTN_HELP));
        bntExit.setText(Sources.getL10n(Strings.BTN_EXIT));
    }

    @FXML
    private void startGame() {

    }

    @FXML
    private void toProfileSelection() throws IOException {
        SceneLoader.inst().load(Scenes.PROFILE_SELECTION);
    }

    @FXML
    private void toHelp() throws IOException {
        SceneLoader.inst().show(Scenes.HELP_MENU);
    }

    @FXML
    private void exit() {
        SceneLoader.inst().getStage().close();
    }
}
