package org.itworks.clicknbuild.ui.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.util.Duration;
import org.itworks.clicknbuild.engine.Ticking;
import org.itworks.clicknbuild.engine.building.BuildingAttrType;
import org.itworks.clicknbuild.engine.city.ResManager;
import org.itworks.clicknbuild.engine.res.ResType;
import org.itworks.clicknbuild.sources.*;

public final class FireController extends BasicController implements Ticking {
    @FXML
    private VBox rootNode;
    @FXML
    private Text title;
    @FXML
    private StackPane resHazardBox;
    @FXML
    private ImageView resHazard;
    @FXML
    private Text hazardLevel;
    @FXML
    private StackPane resIgnitabilityBox;
    @FXML
    private ImageView resIgnitability;
    @FXML
    private Text ignitabilityValue;
    @FXML
    private Text separator;
    @FXML
    private Text ignitabilityCapacity;

    @FXML
    private void initialize() {
        rootNode.getStylesheets().addAll(Sources.getCSS(CSSes.FIRE));
        title.setText(Sources.getL10n(Strings.FIRE_HAZARD));
        separator.setText(Sources.getL10n(Strings.SEPARATOR));

        resHazard.setImage(Sources.getImg(Images.RES_FIRE_HAZARD, ImgHandler.Size.SMALL));
        Tooltip hazardTip = new Tooltip();
        hazardTip.getStyleClass().addAll("fire__tooltip");
        hazardTip.setText(Sources.getL10n(Strings.RES_FIRE_HAZARD));
        hazardTip.setShowDelay(Duration.valueOf("300ms"));
        hazardTip.setHideDelay(Duration.valueOf("100ms"));
        Tooltip.install(resHazardBox, hazardTip);

        resIgnitability.setImage(Sources.getImg(Images.RES_IGNITABILITY, ImgHandler.Size.SMALL));
        Tooltip ignitabilityTip = new Tooltip();
        ignitabilityTip.getStyleClass().addAll("fire__tooltip");
        ignitabilityTip.setText(Sources.getL10n(Strings.RES_IGNITABILITY));
        ignitabilityTip.setShowDelay(Duration.valueOf("300ms"));
        ignitabilityTip.setHideDelay(Duration.valueOf("100ms"));
        Tooltip.install(resIgnitabilityBox, ignitabilityTip);

        updateValues();

        subscribe();
    }

    @Override
    public void tick() {
        updateValues();
    }

    private void updateValues() {
        hazardLevel.setText(Sources.getL10n(Strings.FIRE_HAZARD_LEVEL) + ": " +
                           ((int) ResManager.inst().getFireHazardLevel()) + "%");
        ignitabilityValue.setText("" + (int) ResManager.inst().get(BuildingAttrType.STORE)
                .getTotal(ResType.IGNITABILITY).getCurrent());
        ignitabilityCapacity.setText("" + (int) ResManager.inst().get(BuildingAttrType.CAPACITY)
                .getTotal(ResType.IGNITABILITY).getCurrent());
    }
}
