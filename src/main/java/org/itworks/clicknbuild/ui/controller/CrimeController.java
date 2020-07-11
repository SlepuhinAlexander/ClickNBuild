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

public final class CrimeController extends BasicController implements Ticking {
    private final Map<Text, Supplier<String>> values = new HashMap<>();
    @FXML
    private Text title;
    @FXML
    private Text crimeLevel;
    @FXML
    private StackPane resObedienceBox;
    @FXML
    private ImageView resObedience;
    @FXML
    private Text obedienceValue;
    @FXML
    private Text separator;
    @FXML
    private Text obedienceCapacity;
    @FXML
    private StackPane resCrimeBox;
    @FXML
    private ImageView resCrime;
    @FXML
    private Text crimeValue;
    @FXML
    private StackPane resEmigrationBox;
    @FXML
    private ImageView resEmigration;
    @FXML
    private Text emigrationValue;
    @FXML
    private VBox rootNode;

    @FXML
    private void initialize() {
        rootNode.getStylesheets().addAll(Sources.getCSS(CSSes.CRIME));
        title.setText(Sources.getL10n(Strings.CRIME));
        separator.setText(Sources.getL10n(Strings.SEPARATOR));

        Strings[] l10ns = new Strings[]{Strings.RES_OBEDIENCE, Strings.RES_CRIME, Strings.RES_EMIGRATION};
        Images[] resImages = new Images[]{Images.RES_OBEDIENCE, Images.RES_CRIME, Images.RES_EMIGRATION};
        StackPane[] resBoxes = new StackPane[]{resObedienceBox, resCrimeBox, resEmigrationBox};
        ImageView[] resources = new ImageView[]{resObedience, resCrime, resEmigration};

        for (int i = 0; i < resBoxes.length; i++) {
            resources[i].setImage(Sources.getImg(resImages[i], ImgHandler.Size.SMALL));
            Tooltip tip = new Tooltip();
            tip.getStyleClass().addAll("crime__tooltip");
            tip.setText(Sources.getL10n(l10ns[i]));
            tip.setShowDelay(Duration.valueOf("300ms"));
            tip.setHideDelay(Duration.valueOf("100ms"));
            Tooltip.install(resBoxes[i], tip);
        }

        values.put(crimeLevel, () -> Sources.getL10n(Strings.CRIME_LEVEL) + ": " +
                                     ((int) ResManager.inst().getCrimeLevel()) + Sources.getL10n(Strings.PERCENT));
        values.put(obedienceValue, () -> "" + (int) ResManager.inst().get(BuildingAttrType.STORE)
                .getTotal(ResType.OBEDIENCE).getCurrent());
        values.put(obedienceCapacity, () -> "" + (int) ResManager.inst().get(BuildingAttrType.CAPACITY)
                .getTotal(ResType.OBEDIENCE).getCurrent());
        values.put(crimeValue, () -> "" + (int) ResManager.inst().get(BuildingAttrType.HOLD)
                .getTotal(ResType.CRIME).getCurrent());
        values.put(emigrationValue, () -> "" + (int) ResManager.inst().get(BuildingAttrType.HOLD)
                .getTotal(ResType.EMIGRATION).getCurrent() + Sources.getL10n(Strings.PER_HOUR));


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
