package org.itworks.clicknbuild.ui.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.util.Duration;
import org.itworks.clicknbuild.engine.Ticking;
import org.itworks.clicknbuild.engine.city.ResManager;
import org.itworks.clicknbuild.engine.profile.ProfileManager;
import org.itworks.clicknbuild.sources.*;
import org.itworks.clicknbuild.ui.SceneLoader;
import org.itworks.clicknbuild.ui.Scenes;

import java.io.IOException;

public final class PlayerStatsController extends BasicController implements Ticking {
    @FXML
    private BorderPane rootNode;
    @FXML
    private Text title;
    @FXML
    private StackPane resExperienceBox;
    @FXML
    private ImageView resExperience;
    @FXML
    private Text valueExperience;
    @FXML
    private StackPane resLevelBox;
    @FXML
    private ImageView resLevel;
    @FXML
    private Text valueLevel;
    @FXML
    private ImageView avatar;
    @FXML
    private Text name;

    @FXML
    private void initialize() {
        rootNode.getStylesheets().addAll(Sources.getCSS(CSSes.PLAYER_STATS));

        title.setText(Sources.getL10n(Strings.PLAYER));

        resExperience.setImage(Sources.getImg(Images.PLAYER_EXPERIENCE, ImgHandler.Size.SMALL));
        Tooltip tipExperience = new Tooltip();
        tipExperience.getStyleClass().add("player_stats__tooltip");
        tipExperience.setText(Sources.getL10n(Strings.PLAYER_EXPERIENCE));
        tipExperience.setShowDelay(Duration.valueOf("300ms"));
        tipExperience.setHideDelay(Duration.valueOf("100ms"));
        Tooltip.install(resExperienceBox, tipExperience);
        valueExperience.setText("" + ((int) ResManager.inst().getTotalExpEarned().getCurrent()));

        resLevel.setImage(Sources.getImg(Images.PLAYER_EXPERIENCE_LEVEL, ImgHandler.Size.SMALL));
        Tooltip tipLevel = new Tooltip();
        tipLevel.getStyleClass().add("player_stats__tooltip");
        tipLevel.setText(Sources.getL10n(Strings.PLAYER_EXPERIENCE_LEVEL));
        tipLevel.setShowDelay(Duration.valueOf("300ms"));
        tipLevel.setHideDelay(Duration.valueOf("100ms"));
        Tooltip.install(resLevelBox, tipLevel);
        valueLevel.setText("1");

        avatar.setImage(Sources.getImg(ProfileManager.inst().getProfile().getPreferences().getAvatar(),
                ImgHandler.Size.BIG));
        name.setText(ProfileManager.inst().getProfile().getPreferences().getName());

        subscribe();
    }

    @Override
    public void tick() {
        updateValues();
    }

    private void updateValues() {
        valueExperience.setText("" + ((int) ResManager.inst().getTotalExpEarned().getCurrent()));
        // TODO update player level as well
    }

    @FXML
    private void toPlayerView() {
        // TODO implement
    }
}
