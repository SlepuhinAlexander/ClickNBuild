package org.itworks.clicknbuild.ui.controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import org.itworks.clicknbuild.engine.Difficulty;
import org.itworks.clicknbuild.engine.ProfileManager;
import org.itworks.clicknbuild.engine.profile.Preferences;
import org.itworks.clicknbuild.engine.profile.Profile;
import org.itworks.clicknbuild.sources.*;
import org.itworks.clicknbuild.ui.Controllers;
import org.itworks.clicknbuild.ui.SceneLoader;
import org.itworks.clicknbuild.ui.scene.Scenes;
import org.itworks.clicknbuild.util.string.StringHelper;

import java.io.IOException;

public final class EditProfileController extends BasicController {
    private final Images[] avatars = Images.get(Images.Group.AVATAR);
    @FXML
    private BorderPane rootNode;
    @FXML
    private Text title;
    @FXML
    private Button btnLeft;
    @FXML
    private ImageView avatar;
    @FXML
    private Button btnRight;
    @FXML
    private TextField nameInput;
    @FXML
    private ToggleButton btnEn;
    @FXML
    private ToggleButton btnRu;
    @FXML
    private ToggleGroup languages;
    @FXML
    private ToggleButton btnEasy;
    @FXML
    private Tooltip tipEasy;
    @FXML
    private ToggleButton btnNormal;
    @FXML
    private Tooltip tipNormal;
    @FXML
    private ToggleButton btnHard;
    @FXML
    private Tooltip tipHard;
    @FXML
    private ToggleGroup difficulty;
    @FXML
    private Button btnDefaults;
    @FXML
    private Button btnWipeSave;
    @FXML
    private Button btnDeleteProfile;
    @FXML
    private Button btnSave;
    @FXML
    private Button btnBack;
    private int selectedSlot = -1;
    private Profile selectedProfile;
    private int selectedAvatar;

    @FXML
    private void initialize() {
        selectedSlot = ((ProfileSelectionController) Controllers.inst().get(ProfileSelectionController.class))
                .getSelectedSlot();
        selectedProfile = ProfileManager.inst().getProfile(selectedSlot);
        rootNode.getStylesheets().addAll(Sources.getCSS(CSSes.EDIT_PROFILE));
        L10nHandler.inst().setLanguage(selectedProfile.getPreferences().getLanguage());
        title.setText(Sources.getL10n(Strings.EDIT_PROFILE_TITLE));
        btnLeft.setGraphic(new ImageView(Sources.getImg(Images.BTN_LEFT, ImgHandler.Size.BIG)));
        avatar.setImage(Sources.getImg(selectedProfile.getPreferences().getAvatar(), ImgHandler.Size.GIANT));
        btnRight.setGraphic(new ImageView(Sources.getImg(Images.BTN_RIGHT, ImgHandler.Size.BIG)));
        nameInput.setText(selectedProfile.getPreferences().getName());
        nameInput.requestFocus();
        btnEn.setGraphic(new ImageView(Sources.getImg(Images.BTN_EN, ImgHandler.Size.BIG)));
        btnRu.setGraphic(new ImageView(Sources.getImg(Images.BTN_RU, ImgHandler.Size.BIG)));
        languages.selectToggle((selectedProfile.getPreferences().getLanguage() == L10nHandler.Language.EN) ? btnEn :
                btnRu);
        btnEasy.setGraphic(new ImageView(Sources.getImg(Images.BTN_EASY, ImgHandler.Size.BIG)));
        tipEasy.setText(Sources.getL10n(Strings.DIFFICULTY_EASY_DESC));
        btnNormal.setGraphic(new ImageView(Sources.getImg(Images.BTN_NORMAL, ImgHandler.Size.BIG)));
        tipNormal.setText(Sources.getL10n(Strings.DIFFICULTY_NORMAL_DESC));
        btnHard.setGraphic(new ImageView(Sources.getImg(Images.BTN_HARD, ImgHandler.Size.BIG)));
        tipHard.setText(Sources.getL10n(Strings.DIFFICULTY_HARD_DESC));
        switch (selectedProfile.getPreferences().getDifficulty()) {
            case EASY:
                difficulty.selectToggle(btnEasy);
                break;
            case NORMAL:
                difficulty.selectToggle(btnNormal);
                break;
            case HARD:
                difficulty.selectToggle(btnHard);
        }
        btnDefaults.setText(Sources.getL10n(Strings.BTN_DEFAULTS));
        btnWipeSave.setText(Sources.getL10n(Strings.BTN_WIPE_SAVE));
        btnDeleteProfile.setText(Sources.getL10n(Strings.BTN_DELETE_PROFILE));
        btnSave.setText(Sources.getL10n(Strings.BTN_SAVE));
        btnBack.setText(Sources.getL10n(Strings.BTN_BACK));
        findSelectedAvatar();
    }

    @FXML
    private void rotateLeft() {
        selectedAvatar = (selectedAvatar - 1 + avatars.length) % avatars.length;
        avatar.setImage(Sources.getImg(avatars[selectedAvatar], ImgHandler.Size.GIANT));
    }

    @FXML
    private void rotateRight() {
        selectedAvatar = (selectedAvatar + 1) % avatars.length;
        avatar.setImage(Sources.getImg(avatars[selectedAvatar], ImgHandler.Size.GIANT));
    }

    private void findSelectedAvatar() {
        for (int i = 0; i < avatars.length; i++) {
            if (Sources.getImg(avatars[i], ImgHandler.Size.GIANT).equals(avatar.getImage())) {
                selectedAvatar = i;
                return;
            }
        }
        selectedAvatar = -1;
    }

    @FXML
    private void resetToDefaults() {
        Preferences preferences = new Preferences();
        avatar.setImage(Sources.getImg(preferences.getAvatar(), ImgHandler.Size.GIANT));
        findSelectedAvatar();
        nameInput.setText(preferences.getName());
        languages.selectToggle(preferences.getLanguage().equals(L10nHandler.Language.EN) ? btnEn : btnRu);
        switch (preferences.getDifficulty()) {
            case EASY:
                difficulty.selectToggle(btnEasy);
                break;
            case NORMAL:
                difficulty.selectToggle(btnNormal);
                break;
            case HARD:
                difficulty.selectToggle(btnHard);
        }
    }

    @FXML
    private void wipeSave() {
        ProfileManager.inst().wipeSave(selectedSlot);
    }

    @FXML
    private void deleteProfile() throws IOException {
        ProfileManager.inst().deleteProfile(selectedSlot);
        L10nHandler.inst().setLanguage(ProfileManager.inst().getProfile().getPreferences().getLanguage());
        toProfileSelection();
    }

    @FXML
    private void saveProfile() throws IOException {
        selectedProfile.getPreferences().setAvatar(avatars[selectedAvatar]);
        selectedProfile.getPreferences().setName(StringHelper.crop(nameInput.getText(), 20));
        Toggle selectedLanguage = languages.getSelectedToggle();
        if (btnEn.equals(selectedLanguage)) {
            selectedProfile.getPreferences().setLanguage(L10nHandler.Language.EN);
        } else if (btnRu.equals(selectedLanguage)) {
            selectedProfile.getPreferences().setLanguage(L10nHandler.Language.RU);
        } else {
            selectedProfile.getPreferences().setDefaultLanguage();
        }
        Toggle selectedDifficulty = difficulty.getSelectedToggle();
        if (btnEasy.equals(selectedDifficulty)) {
            selectedProfile.getPreferences().setDifficulty(Difficulty.EASY);
        } else if (btnNormal.equals(selectedDifficulty)) {
            selectedProfile.getPreferences().setDifficulty(Difficulty.NORMAL);
        } else if (btnHard.equals(selectedDifficulty)) {
            selectedProfile.getPreferences().setDifficulty(Difficulty.HARD);
        } else {
            selectedProfile.getPreferences().setDefaultDifficulty();
        }
        ProfileManager.inst().selectProfile(selectedSlot);
        L10nHandler.inst().setLanguage(ProfileManager.inst().getProfile().getPreferences().getLanguage());
        SceneLoader.inst().load(Scenes.MAIN_MENU);
    }

    @FXML
    private void toProfileSelection() throws IOException {
        L10nHandler.inst().setLanguage(ProfileManager.inst().getProfile().getPreferences().getLanguage());
        SceneLoader.inst().load(Scenes.PROFILE_SELECTION);
    }
}
