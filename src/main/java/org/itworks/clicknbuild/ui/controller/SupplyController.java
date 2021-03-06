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

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public final class SupplyController extends BasicController implements Ticking {
    private final Map<Text, Supplier<String>> values = new HashMap<>();
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
    private StackPane resUpkeepBox;
    @FXML
    private ImageView resUpkeep;
    @FXML
    private Text upkeepValue;

    @FXML
    private void initialize() {
        rootNode.getStylesheets().addAll(Sources.getCSS(CSSes.SUPPLY));
        title.setText(Sources.getL10n(Strings.SUPPLY));
        separator.setText(Sources.getL10n(Strings.SEPARATOR));
        clarification.setText(Sources.getL10n(Strings.CLARIFICATION));

        Strings[] l10ns = new Strings[]{Strings.RES_POWER_EXCESS, Strings.RES_POWER, Strings.RES_POWER_CONSUMPTION,
                Strings.RES_UPKEEP};
        Images[] resImages = new Images[]{Images.RES_POWER_EXCESS, Images.RES_POWER, Images.RES_POWER_CONSUMPTION,
                Images.RES_UPKEEP};
        StackPane[] resBoxes = new StackPane[]{resPowerExcessBox, resPowerBox, resPowerConsumptionBox,
                resUpkeepBox};
        ImageView[] resources = new ImageView[]{resPowerExcess, resPower, resPowerConsumption, resUpkeep};

        for (int i = 0; i < resBoxes.length; i++) {
            resources[i].setImage(Sources.getImg(resImages[i], ImgHandler.Size.SMALL));
            Tooltip tip = new Tooltip();
            tip.getStyleClass().addAll("supply__tooltip");
            tip.setText(Sources.getL10n(l10ns[i]));
            tip.setShowDelay(Duration.valueOf("300ms"));
            tip.setHideDelay(Duration.valueOf("100ms"));
            Tooltip.install(resBoxes[i], tip);
        }

        values.put(powerExcessValue, () -> "" + (int) ResManager.inst().get(BuildingAttrType.HOLD)
                .getTotal(ResType.POWER_EXCESS).getCurrent());
        values.put(powerValue, () -> "" + (int) ResManager.inst().get(BuildingAttrType.SUPPLY)
                .getTotal(ResType.POWER).getCurrent());
        values.put(powerConsumptionValue, () -> "" + (int) ResManager.inst().get(BuildingAttrType.DEMAND)
                .getTotal(ResType.POWER_CONSUMPTION).getCurrent());
        values.put(upkeepValue, () -> (int) ResManager.inst().get(BuildingAttrType.DEMAND)
                .getTotal(ResType.UPKEEP).getCurrent() + Sources.getL10n(Strings.PER_HOUR));

        updateValues();

        subscribe();
    }

    @Override
    public void tick() {
        updateValues();
    }

    private void updateValues() {
        values.forEach((text, stringSupplier) -> text.setText(stringSupplier.get()));
    }
}
