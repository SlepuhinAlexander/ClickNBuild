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

public final class PowerController extends BasicController implements Ticking {
    @FXML
    private VBox rootNode;
    @FXML
    private Text title;
    @FXML
    private StackPane resPowerExcessBox;
    @FXML
    private ImageView resPowerExcess;
    @FXML
    private Text powerExcessValue;
    @FXML
    private Text clarification;
    @FXML
    private StackPane resPowerBox;
    @FXML
    private ImageView resPower;
    @FXML
    private Text powerValue;
    @FXML
    private Text separator;
    @FXML
    private StackPane resPowerConsumptionBox;
    @FXML
    private ImageView resPowerConsumption;
    @FXML
    private Text powerConsumptionValue;

    @FXML
    private void initialize() {
        rootNode.getStylesheets().addAll(Sources.getCSS(CSSes.POWER));
        title.setText(Sources.getL10n(Strings.POWER));
        separator.setText(Sources.getL10n(Strings.SEPARATOR));
        clarification.setText(Sources.getL10n(Strings.CLARIFICATION));

        Strings[] l10ns = new Strings[]{Strings.RES_POWER_EXCESS, Strings.RES_POWER, Strings.RES_POWER_CONSUMPTION};
        Images[] resImages = new Images[]{Images.RES_POWER_EXCESS, Images.RES_POWER, Images.RES_POWER_CONSUMPTION};
        StackPane[] resBoxes = new StackPane[]{resPowerExcessBox, resPowerBox, resPowerConsumptionBox};
        ImageView[] resources = new ImageView[]{resPowerExcess, resPower, resPowerConsumption};

        for (int i = 0; i < resBoxes.length; i++) {
            resources[i].setImage(Sources.getImg(resImages[i], ImgHandler.Size.SMALL));
            Tooltip tip = new Tooltip();
            tip.getStyleClass().addAll("power__tooltip");
            tip.setText(Sources.getL10n(l10ns[i]));
            tip.setShowDelay(Duration.valueOf("300ms"));
            tip.setHideDelay(Duration.valueOf("100ms"));
            Tooltip.install(resBoxes[i], tip);
        }

        updateValues();

        subscribe();
    }

    @Override
    public void tick() {
        updateValues();
    }

    private void updateValues() {
        powerExcessValue.setText("" + (int) ResManager.inst().get(BuildingAttrType.HOLD)
                .getTotal(ResType.POWER_EXCESS).getCurrent());
        powerValue.setText("" + (int) ResManager.inst().get(BuildingAttrType.SUPPLY)
                .getTotal(ResType.POWER).getCurrent());
        powerConsumptionValue.setText("" + (int) ResManager.inst().get(BuildingAttrType.HOLD)
                .getTotal(ResType.POWER).getCurrent());
    }
}
