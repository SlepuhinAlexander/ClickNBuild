package org.itworks.clicknbuild.ui.controller;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import org.itworks.clicknbuild.engine.ProfileManager;
import org.itworks.clicknbuild.engine.profile.Profile;
import org.itworks.clicknbuild.sources.*;
import org.itworks.clicknbuild.ui.SceneLoader;
import org.itworks.clicknbuild.ui.scene.Scenes;

import java.io.IOException;

public final class ProfileSelectionController extends BasicController {
    @FXML
    private BorderPane rootNode;

    @FXML
    private Text title;

    @FXML
    private HBox profiles;

    @FXML
    private Button btnBack;

    private int selectedSlot = -1;

    @FXML
    private void initialize() {
        rootNode.getStylesheets().addAll(Sources.getCSS(CSSes.PROFILE_SELECTION));
        title.setText(Sources.getL10n(Strings.PROFILE_SELECTION_TITLE));
        btnBack.setText(Sources.getL10n(Strings.BTN_BACK));
        buildProfiles();
    }

    private void buildProfiles() {
        for (int i = 0; i < ProfileManager.SLOTS_AMOUNT; i++) {
            VBox profileBox = new VBox();
            profileBox.setAlignment(Pos.CENTER);
            profileBox.setSpacing(5);
            StackPane avatarBox = new StackPane();
            avatarBox.setMaxWidth(1);
            avatarBox.getStyleClass().add("profile_selection__avatar");
            ImageView avatar = new ImageView();
            StackPane.setMargin(avatar, new Insets(5, 5, 5, 5));
            Text profileName = new Text();
            profileName.getStyleClass().add("profile_selection__name");
            profileName.setWrappingWidth(256);
            Profile profile = ProfileManager.inst().getProfile(i);
            final int index = i;
            if (profile == null) {
                avatar.setImage(Sources.getImg(Images.BTN_NEW_PROFILE, ImgHandler.Size.GIANT));
                profileName.setText("");
                avatarBox.setOnMouseClicked(mouseEvent -> {
                    selectedSlot = index;
                    try {
                        toCreateProfile();
                    } catch (IOException e) {
                        e.printStackTrace();
                        selectedSlot = -1;
                    }
                });
            } else {
                avatar.setImage(Sources.getImg(profile.getPreferences().getAvatar(), ImgHandler.Size.GIANT));
                profileName.setText(profile.getPreferences().getName());
                avatarBox.setOnMouseClicked(mouseEvent -> {
                    selectedSlot = index;
                    try {
                        toEditProfile();
                    } catch (IOException e) {
                        e.printStackTrace();
                        selectedSlot = -1;
                    }
                });
            }
            avatarBox.getChildren().addAll(avatar);
            profileBox.getChildren().addAll(avatarBox, profileName);
            profiles.getChildren().addAll(profileBox);
        }
    }

    int getSelectedSlot() {
        return selectedSlot;
    }

    private void toEditProfile() throws IOException {
        SceneLoader.inst().load(Scenes.EDIT_PROFILE);
    }

    private void toCreateProfile() throws IOException {
        ProfileManager.inst().createProfile(selectedSlot);
        SceneLoader.inst().load(Scenes.EDIT_PROFILE);
    }

    @FXML
    private void toMainMenu() throws IOException {
        SceneLoader.inst().load(Scenes.MAIN_MENU);
    }
}
