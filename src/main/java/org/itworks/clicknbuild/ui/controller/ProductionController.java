package org.itworks.clicknbuild.ui.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
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

public final class ProductionController extends BasicController implements Ticking {
    private final Map<Text, Supplier<String>> values = new HashMap<>();
    private final Map<ProgressBar, Supplier<Double>> fills = new HashMap<>();
    @FXML
    private VBox rootNode;
    @FXML
    private Text title;
    @FXML
    private StackPane resEnergyBox;
    @FXML
    private ImageView resEnergy;
    @FXML
    private ProgressBar energyFill;
    @FXML
    private Text energyValue;
    @FXML
    private Text energyGain;
    @FXML
    private StackPane resMoneyBox;
    @FXML
    private ImageView resMoney;
    @FXML
    private ProgressBar moneyFill;
    @FXML
    private Text moneyValue;
    @FXML
    private Text moneyGain;
    @FXML
    private StackPane resSteelBox;
    @FXML
    private ImageView resSteel;
    @FXML
    private ProgressBar steelFill;
    @FXML
    private Text steelValue;
    @FXML
    private Text steelGain;
    @FXML
    private StackPane resConcreteBox;
    @FXML
    private ImageView resConcrete;
    @FXML
    private ProgressBar concreteFill;
    @FXML
    private Text concreteValue;
    @FXML
    private Text concreteGain;
    @FXML
    private StackPane resBrickBox;
    @FXML
    private ImageView resBrick;
    @FXML
    private ProgressBar brickFill;
    @FXML
    private Text brickValue;
    @FXML
    private Text brickGain;
    @FXML
    private StackPane resWoodBox;
    @FXML
    private ImageView resWood;
    @FXML
    private ProgressBar woodFill;
    @FXML
    private Text woodValue;
    @FXML
    private Text woodGain;
    @FXML
    private StackPane resGlassBox;
    @FXML
    private ImageView resGlass;
    @FXML
    private ProgressBar glassFill;
    @FXML
    private Text glassValue;
    @FXML
    private Text glassGain;
    @FXML
    private StackPane resCitizenBox;
    @FXML
    private ImageView resCitizen;
    @FXML
    private ProgressBar citizenFill;
    @FXML
    private Text citizenValue;
    @FXML
    private Text citizenGain;

    @FXML
    private void initialize() {
        rootNode.getStylesheets().addAll(Sources.getCSS(CSSes.PRODUCTION));
        title.setText(Sources.getL10n(Strings.PRODUCTION));

        ResType[] resTypes = new ResType[]{ResType.ENERGY, ResType.MONEY, ResType.STEEL, ResType.CONCRETE,
                ResType.BRICK, ResType.WOOD, ResType.GLASS, ResType.CITIZEN};
        Strings[] l10ns = new Strings[]{Strings.RES_ENERGY, Strings.RES_MONEY, Strings.RES_STEEL, Strings.RES_CONCRETE,
                Strings.RES_BRICK, Strings.RES_WOOD, Strings.RES_GLASS, Strings.RES_CITIZEN};
        Images[] resImages = new Images[]{Images.RES_ENERGY, Images.RES_MONEY, Images.RES_STEEL, Images.RES_CONCRETE,
                Images.RES_BRICK, Images.RES_WOOD, Images.RES_GLASS, Images.RES_CITIZEN};
        StackPane[] resBoxes = new StackPane[]{resEnergyBox, resMoneyBox, resSteelBox, resConcreteBox,
                resBrickBox, resWoodBox, resGlassBox, resCitizenBox};
        ImageView[] resources = new ImageView[]{resEnergy, resMoney, resSteel, resConcrete,
                resBrick, resWood, resGlass, resCitizen};
        ProgressBar[] bars = new ProgressBar[]{energyFill, moneyFill, steelFill, concreteFill,
                brickFill, woodFill, glassFill, citizenFill};
        Text[] valuesTexts = new Text[]{energyValue, moneyValue, steelValue, concreteValue,
                brickValue, woodValue, glassValue, citizenValue};
        Text[] gains = new Text[]{energyGain, moneyGain, steelGain, concreteGain,
                brickGain, woodGain, glassGain, citizenGain};

        for (int i = 0; i < resTypes.length; i++) {
            resources[i].setImage(Sources.getImg(resImages[i], ImgHandler.Size.SMALL));
            Tooltip tip = new Tooltip();
            tip.getStyleClass().addAll("production__tooltip");
            tip.setText(Sources.getL10n(l10ns[i]));
            tip.setShowDelay(Duration.valueOf("300ms"));
            tip.setHideDelay(Duration.valueOf("100ms"));
            Tooltip.install(resBoxes[i], tip);

            final int index = i;
            fills.put(bars[i], () ->
                    (int) ResManager.inst().get(BuildingAttrType.STORE).getTotal(resTypes[index]).getCurrent() /
                    ResManager.inst().get(BuildingAttrType.CAPACITY).getTotal(resTypes[index]).getCurrent()
            );
            values.put(valuesTexts[i], () ->
                    (int) ResManager.inst().get(BuildingAttrType.STORE).getTotal(resTypes[index]).getCurrent()
                    + Sources.getL10n(Strings.SEPARATOR)
                    + (int) ResManager.inst().get(BuildingAttrType.CAPACITY).getTotal(resTypes[index]).getCurrent()
            );
            if (resTypes[i].equals(ResType.MONEY)) {
                values.put(gains[i], () -> {
                    double gain = ResManager.inst().get(BuildingAttrType.PRODUCTION)
                            .getTotal(resTypes[index]).getCurrent();
                    gain -= ResManager.inst().get(BuildingAttrType.DEMAND).getTotal(ResType.UPKEEP).getCurrent();
                    gain -= ResManager.inst().get(BuildingAttrType.HOLD).getTotal(ResType.BENEFIT).getCurrent();
                    return ((int) gain > 0d ? "+" : "") + (int) gain + Sources.getL10n(Strings.PER_HOUR);
                });
            } else if (resTypes[i].equals(ResType.CITIZEN)) {
                values.put(gains[i], () -> {
                    double gain = ResManager.inst().get(BuildingAttrType.PRODUCTION)
                            .getTotal(resTypes[index]).getCurrent();
                    gain -= ResManager.inst().get(BuildingAttrType.DEMAND).getTotal(ResType.EMIGRATION).getCurrent();
                    return ((int) gain > 0d ? "+" : "") + (int) gain + Sources.getL10n(Strings.PER_HOUR);
                });
            } else {
                values.put(gains[i], () -> {
                    double gain = ResManager.inst().get(BuildingAttrType.PRODUCTION)
                            .getTotal(resTypes[index]).getCurrent();
                    return ((int) gain > 0d ? "+" : "") + (int) gain + Sources.getL10n(Strings.PER_HOUR);
                });
            }
        }

        updateValues();

        subscribe();
    }

    @Override
    public void tick() {
        updateValues();
    }

    private void updateValues() {
        values.forEach((text, stringSupplier) -> text.setText(stringSupplier.get()));
        fills.forEach((bar, doubleSupplier) -> bar.setProgress(doubleSupplier.get()));
    }
}
