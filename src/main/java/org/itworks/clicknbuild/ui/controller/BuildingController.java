package org.itworks.clicknbuild.ui.controller;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.util.Duration;
import org.itworks.clicknbuild.engine.Ticking;
import org.itworks.clicknbuild.engine.building.Building;
import org.itworks.clicknbuild.engine.building.BuildingAttrType;
import org.itworks.clicknbuild.engine.building.BuildingType;
import org.itworks.clicknbuild.engine.city.Cell;
import org.itworks.clicknbuild.engine.res.ResPack;
import org.itworks.clicknbuild.engine.res.ResType;
import org.itworks.clicknbuild.engine.res.TileType;
import org.itworks.clicknbuild.sources.*;
import org.itworks.clicknbuild.ui.Controllers;
import org.itworks.clicknbuild.ui.JobBar;
import org.itworks.clicknbuild.ui.SceneLoader;
import org.itworks.clicknbuild.ui.Scenes;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public final class BuildingController extends BasicController implements Ticking {
    private final Map<Text, Supplier<String>> values = new HashMap<>();
    private final Map<ProgressBar, Supplier<Double>> fills = new HashMap<>();
    @FXML
    private BorderPane rootNode;
    @FXML
    private Text title;
    @FXML
    private ImageView image;
    @FXML
    private Text level;
    @FXML
    private Text structure;
    @FXML
    private Button backBtn;
    @FXML
    private VBox content;
    private Cell cell;

    @FXML
    private void initialize() {
        rootNode.getStylesheets().addAll(Sources.getCSS(CSSes.BUILDING));
        cell = ((MapController) Controllers.inst().get(MapController.class)).getSelectedCell();
        backBtn.setText(Sources.getL10n(Strings.BTN_BACK));
        if (cell.getBuilding() == null) {
            initialize(cell.getTile());
        } else {
            initialize(cell.getBuilding());
        }
        subscribe();
    }

    private void initialize(TileType tile) {
        title.setText(Sources.getL10n(tile.l10nKey));
        image.setImage(Sources.getImg(tile.imgKey, ImgHandler.Size.FULL));
        level.setVisible(false);
        structure.setText(Sources.getL10n(Strings.STRUCTURE) + Sources.getL10n(Strings.CLARIFICATION)
                          + tile.getStructure());
    }

    private void initialize(Building building) {
        title.setText(Sources.getL10n(building.type.l10nKey));
        image.setImage(Sources.getImg(building.type.imgKey, ImgHandler.Size.FULL));
        if (building.type.stats.getMaxLevel() == 1) level.setVisible(false);
        level.setText(Sources.getL10n(Strings.LEVEL) + Sources.getL10n(Strings.CLARIFICATION) + building.getLevel());
        structure.setText(Sources.getL10n(Strings.STRUCTURE) + Sources.getL10n(Strings.CLARIFICATION)
                          + building.type.stats.getStats()[building.getLevel() - 1].getStructure());
        buildContent(cell.getBuilding());
    }

    @FXML
    private void back() throws IOException {
        SceneLoader.inst().load(Scenes.CITY_VIEW);
    }

    @Override
    public void tick() {
        if (cell.getBuilding() == null || cell.getBuilding().type.equals(BuildingType.ROAD)) return;
        updateValues();
    }

    // TODO refactor
    private void buildContent(Building building) {
        if (!building.get(BuildingAttrType.HOLD).pack.isEmpty()) {
            addProductivityBox(building);
        }
        if (building.get(BuildingAttrType.DEMAND).getCurrent(ResType.UPKEEP) > 0d) {
            addUpkeepBox(building);
        }
        if (!building.get(BuildingAttrType.PRODUCTION).pack.isEmpty()) {
            addProductionBox(building);
        }
        if (!building.get(BuildingAttrType.SUPPLY).pack.isEmpty()) {
            addSupplyBox(building);
        }
        if (!building.get(BuildingAttrType.PRODUCTION_MUL).pack.isEmpty() ||
            (!building.get(BuildingAttrType.SUPPLY_MUL).pack.isEmpty()) ||
            (!building.get(BuildingAttrType.CAPACITY_MUL).pack.isEmpty())) {
            addMultipliersBox(building);
        }
        ResPack store = building.get(BuildingAttrType.STORE);
        if (!store.pack.isEmpty() &&
            !(store.pack.containsKey(ResType.OBEDIENCE) || store.pack.containsKey(ResType.IGNITABILITY))) {
            addStoreBox(building);
        }
        if (!store.pack.isEmpty() &&
            (store.pack.containsKey(ResType.OBEDIENCE) || store.pack.containsKey(ResType.IGNITABILITY))) {
            addEnsureBox(building);
        }
        if (!building.get(BuildingAttrType.JOB_REWARD).pack.isEmpty()) {
            addJobBox(building);
        }
        updateValues();
    }

    private void addProductivityBox(Building building) {
        VBox productivityBox = new VBox();
        productivityBox.setAlignment(Pos.CENTER);
        productivityBox.setSpacing(10);
        HBox productivityLevelBox = new HBox();
        productivityLevelBox.setAlignment(Pos.CENTER_LEFT);
        Text productivityLevel = new Text();
        productivityLevel.getStyleClass().addAll("building__text");
        values.put(productivityLevel, () -> Sources.getL10n(Strings.PRODUCTIVITY)
                                            + Sources.getL10n(Strings.CLARIFICATION)
                                            + (int) building.getProductivity() + Sources.getL10n(Strings.PERCENT));
        productivityLevelBox.getChildren().addAll(productivityLevel);
        productivityBox.getChildren().addAll(productivityLevelBox);
        if (building.get(BuildingAttrType.HOLD).get(ResType.POWER) != null) {
            addPowerConsumptionBox(building, productivityBox);
        }
        if (building.get(BuildingAttrType.HOLD).get(ResType.WORKER) != null) {
            addWorkerConsumptionBox(building, productivityBox);
        }
        content.getChildren().addAll(productivityBox);
    }

    private void addPowerConsumptionBox(Building building, Pane box) {
        HBox powerConsumptionBox = new HBox();
        Text powerLabel = new Text();
        powerLabel.getStyleClass().addAll("building__text");
        powerLabel.setText(Sources.getL10n(Strings.SUPPLY) + Sources.getL10n(Strings.CLARIFICATION));
        powerConsumptionBox.setAlignment(Pos.CENTER_LEFT);
        powerConsumptionBox.setSpacing(5);

        StackPane resPowerBox = new StackPane();
        ImageView resPower = new ImageView(Sources.getImg(Images.RES_POWER, ImgHandler.Size.SMALL));
        resPowerBox.getChildren().addAll(resPower);
        Tooltip resPowerTooltip = new Tooltip();
        resPowerTooltip.getStyleClass().addAll("building__tooltip");
        resPowerTooltip.setText(Sources.getL10n(Strings.RES_POWER));
        resPowerTooltip.setShowDelay(Duration.valueOf("300ms"));
        resPowerTooltip.setHideDelay(Duration.valueOf("100ms"));
        Tooltip.install(resPowerBox, resPowerTooltip);

        Text powerValue = new Text();
        powerValue.getStyleClass().addAll("building__text");
        values.put(powerValue, () -> "" + (int) building.get(BuildingAttrType.HOLD).getCurrent(ResType.POWER));

        Text separator = new Text();
        separator.getStyleClass().addAll("building__text");
        separator.setText(Sources.getL10n(Strings.SEPARATOR));

        StackPane resPowerConsumptionBox = new StackPane();
        ImageView resPowerConsumption = new ImageView(Sources.getImg(Images.RES_POWER_CONSUMPTION,
                ImgHandler.Size.SMALL));
        resPowerConsumptionBox.getChildren().addAll(resPowerConsumption);
        Tooltip resPowerConsumptionTooltip = new Tooltip();
        resPowerConsumptionTooltip.getStyleClass().addAll("building__tooltip");
        resPowerConsumptionTooltip.setText(Sources.getL10n(Strings.RES_POWER_CONSUMPTION));
        resPowerConsumptionTooltip.setShowDelay(Duration.valueOf("300ms"));
        resPowerConsumptionTooltip.setHideDelay(Duration.valueOf("100ms"));
        Tooltip.install(resPowerConsumptionBox, resPowerConsumptionTooltip);

        Text powerConsumptionValue = new Text();
        powerConsumptionValue.getStyleClass().addAll("building__text");
        values.put(powerConsumptionValue, () ->
                "" + (int) building.get(BuildingAttrType.DEMAND).getCurrent(ResType.POWER_CONSUMPTION));

        powerConsumptionBox.getChildren().addAll(powerLabel, resPowerBox, powerValue, separator,
                resPowerConsumptionBox, powerConsumptionValue);
        box.getChildren().addAll(powerConsumptionBox);
    }

    private void addWorkerConsumptionBox(Building building, Pane box) {
        HBox workerConsumptionBox = new HBox();
        Text workerLabel = new Text();
        workerLabel.getStyleClass().addAll("building__text");
        workerLabel.setText(Sources.getL10n(Strings.WORKERS) + Sources.getL10n(Strings.CLARIFICATION));
        workerConsumptionBox.setAlignment(Pos.CENTER_LEFT);
        workerConsumptionBox.setSpacing(5);

        StackPane resWorkerBox = new StackPane();
        ImageView resWorker = new ImageView(Sources.getImg(Images.RES_WORKER, ImgHandler.Size.SMALL));
        resWorkerBox.getChildren().addAll(resWorker);
        Tooltip resWorkerTooltip = new Tooltip();
        resWorkerTooltip.getStyleClass().addAll("building__tooltip");
        resWorkerTooltip.setText(Sources.getL10n(Strings.RES_WORKER));
        resWorkerTooltip.setShowDelay(Duration.valueOf("300ms"));
        resWorkerTooltip.setHideDelay(Duration.valueOf("100ms"));
        Tooltip.install(resWorkerBox, resWorkerTooltip);

        Text workerValue = new Text();
        workerValue.getStyleClass().addAll("building__text");
        values.put(workerValue, () -> "" + (int) building.get(BuildingAttrType.HOLD).getCurrent(ResType.WORKER));

        Text separator = new Text();
        separator.getStyleClass().addAll("building__text");
        separator.setText(Sources.getL10n(Strings.SEPARATOR));

        StackPane resJobBox = new StackPane();
        ImageView resJob = new ImageView(Sources.getImg(Images.RES_JOB, ImgHandler.Size.SMALL));
        resJobBox.getChildren().addAll(resJob);
        Tooltip resJobTooltip = new Tooltip();
        resJobTooltip.getStyleClass().addAll("building__tooltip");
        resJobTooltip.setText(Sources.getL10n(Strings.RES_JOB));
        resJobTooltip.setShowDelay(Duration.valueOf("300ms"));
        resJobTooltip.setHideDelay(Duration.valueOf("100ms"));
        Tooltip.install(resJobBox, resJobTooltip);

        Text jobValue = new Text();
        jobValue.getStyleClass().addAll("building__text");
        values.put(jobValue, () -> "" + (int) building.get(BuildingAttrType.HOLD).getMax(ResType.WORKER));

        workerConsumptionBox.getChildren().addAll(workerLabel, resWorkerBox, workerValue, separator,
                resJobBox, jobValue);
        box.getChildren().addAll(workerConsumptionBox);
    }

    private void addUpkeepBox(Building building) {
        HBox upkeepBox = new HBox();
        Text upkeepLabel = new Text();
        upkeepLabel.getStyleClass().addAll("building__text");
        upkeepLabel.setText(Sources.getL10n(Strings.UPKEEP) + Sources.getL10n(Strings.CLARIFICATION));
        upkeepBox.setAlignment(Pos.CENTER_LEFT);
        upkeepBox.setSpacing(5);

        StackPane resUpkeepBox = new StackPane();
        ImageView resUpkeep = new ImageView(Sources.getImg(Images.RES_UPKEEP, ImgHandler.Size.SMALL));
        resUpkeepBox.getChildren().addAll(resUpkeep);
        Tooltip resUpkeepTooltip = new Tooltip();
        resUpkeepTooltip.getStyleClass().addAll("building__tooltip");
        resUpkeepTooltip.setText(Sources.getL10n(Strings.RES_UPKEEP));
        resUpkeepTooltip.setShowDelay(Duration.valueOf("300ms"));
        resUpkeepTooltip.setHideDelay(Duration.valueOf("100ms"));
        Tooltip.install(resUpkeepBox, resUpkeepTooltip);

        Text upkeepValue = new Text();
        upkeepValue.getStyleClass().addAll("building__text");
        upkeepValue.setText((int) building.get(BuildingAttrType.DEMAND).getCurrent(ResType.UPKEEP)
                            + Sources.getL10n(Strings.PER_HOUR));
        upkeepBox.getChildren().addAll(upkeepLabel, resUpkeepBox, upkeepValue);
        content.getChildren().addAll(upkeepBox);
    }

    private void addProductionBox(Building building) {
        HBox productionBox = new HBox();
        Text productionLabel = new Text();
        productionLabel.getStyleClass().addAll("building__text");
        productionLabel.setText(Sources.getL10n(Strings.GAIN) + Sources.getL10n(Strings.CLARIFICATION));
        productionBox.setAlignment(Pos.CENTER_LEFT);
        productionBox.setSpacing(5);
        productionBox.getChildren().addAll(productionLabel);
        building.get(BuildingAttrType.PRODUCTION).pack.keySet().forEach(resType ->
                addResProductionBox(building, resType, productionBox));
        Text perHour = new Text();
        perHour.getStyleClass().addAll("building__text");
        perHour.setText(Sources.getL10n(Strings.PER_HOUR));
        productionBox.getChildren().addAll(perHour);
        content.getChildren().addAll(productionBox);
    }


    private void addResProductionBox(Building building, ResType resType, Pane box) {
        HBox resProductionBox = new HBox();
        resProductionBox.setAlignment(Pos.CENTER_LEFT);
        resProductionBox.setSpacing(5);

        StackPane resBox = new StackPane();
        ImageView res = new ImageView(Sources.getImg(resType.imgKey, ImgHandler.Size.SMALL));
        resBox.getChildren().addAll(res);
        Tooltip resTooltip = new Tooltip();
        resTooltip.getStyleClass().addAll("building__tooltip");
        resTooltip.setText(Sources.getL10n(resType.l10nKey));
        resTooltip.setShowDelay(Duration.valueOf("300ms"));
        resTooltip.setHideDelay(Duration.valueOf("100ms"));
        Tooltip.install(resBox, resTooltip);

        Text value = new Text();
        value.getStyleClass().addAll("building__text");
        values.put(value, () -> "" + (int) building.get(BuildingAttrType.PRODUCTION).getCurrent(resType));
        resProductionBox.getChildren().addAll(resBox, value);
        box.getChildren().addAll(resProductionBox);
    }

    private void addSupplyBox(Building building) {
        HBox supplyBox = new HBox();
        Text supplyLabel = new Text();
        supplyLabel.getStyleClass().addAll("building__text");
        supplyLabel.setText(Sources.getL10n(Strings.SUPPLY) + Sources.getL10n(Strings.CLARIFICATION));
        supplyBox.setAlignment(Pos.CENTER_LEFT);
        supplyBox.setSpacing(5);
        supplyBox.getChildren().addAll(supplyLabel);
        building.get(BuildingAttrType.SUPPLY).pack.keySet().forEach(resType ->
                addResSupplyBox(building, resType, supplyBox));
        content.getChildren().addAll(supplyBox);
    }

    private void addResSupplyBox(Building building, ResType resType, Pane box) {
        HBox resSupplyBox = new HBox();
        resSupplyBox.setAlignment(Pos.CENTER_LEFT);
        resSupplyBox.setSpacing(5);

        StackPane resBox = new StackPane();
        ImageView res = new ImageView(Sources.getImg(resType.imgKey, ImgHandler.Size.SMALL));
        resBox.getChildren().addAll(res);
        Tooltip resTooltip = new Tooltip();
        resTooltip.getStyleClass().addAll("building__tooltip");
        resTooltip.setText(Sources.getL10n(resType.l10nKey));
        resTooltip.setShowDelay(Duration.valueOf("300ms"));
        resTooltip.setHideDelay(Duration.valueOf("100ms"));
        Tooltip.install(resBox, resTooltip);

        Text value = new Text();
        value.getStyleClass().addAll("building__text");
        values.put(value, () -> "" + (int) building.get(BuildingAttrType.SUPPLY).getCurrent(resType));
        resSupplyBox.getChildren().addAll(resBox, value);
        box.getChildren().addAll(resSupplyBox);
    }

    private void addMultipliersBox(Building building) {
        VBox multipliersBox = new VBox();
        Text multipliersLabel = new Text();
        multipliersLabel.getStyleClass().addAll("building__text");
        multipliersLabel.setText(Sources.getL10n(Strings.GIVES_BONUS) + Sources.getL10n(Strings.CLARIFICATION));
        multipliersBox.setAlignment(Pos.CENTER_LEFT);
        multipliersBox.setSpacing(5);
        multipliersBox.getChildren().addAll(multipliersLabel);
        building.get(BuildingAttrType.PRODUCTION_MUL).pack.keySet().forEach(resType ->
                addResMultiplierBox(building, resType, BuildingAttrType.PRODUCTION_MUL, false, multipliersBox));
        building.get(BuildingAttrType.SUPPLY_MUL).pack.keySet().forEach(resType ->
                addResMultiplierBox(building, resType, BuildingAttrType.SUPPLY_MUL, false, multipliersBox));
        building.get(BuildingAttrType.CAPACITY_MUL).pack.keySet().forEach(resType ->
                addResMultiplierBox(building, resType, BuildingAttrType.CAPACITY_MUL, true, multipliersBox));
        content.getChildren().addAll(multipliersBox);
    }

    private void addResMultiplierBox(Building building, ResType resType, BuildingAttrType attrType, boolean capacity,
                                     Pane box) {
        HBox resMultiplierBox = new HBox();
        resMultiplierBox.setAlignment(Pos.CENTER_LEFT);
        resMultiplierBox.setSpacing(5);

        Text value = new Text();
        value.getStyleClass().addAll("building__text");
        values.put(value, () -> "" + (int) building.get(attrType).getCurrent(resType));

        Text to = new Text();
        to.getStyleClass().addAll("building__text");
        to.setText(Sources.getL10n(Strings.PERCENT) + Sources.getL10n(Strings.TO)
                   + (capacity ? Sources.getL10n(Strings.CAPACITY) : ""));

        StackPane resBox = new StackPane();
        ImageView res = new ImageView(Sources.getImg(resType.imgKey, ImgHandler.Size.SMALL));
        resBox.getChildren().addAll(res);
        Tooltip resTooltip = new Tooltip();
        resTooltip.getStyleClass().addAll("building__tooltip");
        resTooltip.setText(Sources.getL10n(resType.l10nKey));
        resTooltip.setShowDelay(Duration.valueOf("300ms"));
        resTooltip.setHideDelay(Duration.valueOf("100ms"));
        Tooltip.install(resBox, resTooltip);

        resMultiplierBox.getChildren().addAll(value, to, resBox);

        box.getChildren().addAll(resMultiplierBox);
    }

    private void addStoreBox(Building building) {
        VBox ensureBox = new VBox();
        Text ensureLabel = new Text();
        ensureLabel.getStyleClass().addAll("building__text");
        ensureLabel.setText(Sources.getL10n(Strings.STORES) + Sources.getL10n(Strings.CLARIFICATION));
        ensureBox.setAlignment(Pos.CENTER_LEFT);
        ensureBox.setSpacing(5);
        ensureBox.getChildren().addAll(ensureLabel);
        building.get(BuildingAttrType.STORE).pack.keySet()
                .stream().filter(resType -> !resType.equals(ResType.OBEDIENCE)
                                            && !resType.equals(ResType.IGNITABILITY))
                .forEach(resType -> addResStoreBox(building, resType, ensureBox));
        content.getChildren().addAll(ensureBox);
    }

    private void addResStoreBox(Building building, ResType resType, Pane box) {
        HBox resSupplyBox = new HBox();
        resSupplyBox.setAlignment(Pos.CENTER_LEFT);
        resSupplyBox.setSpacing(5);

        StackPane resBox = new StackPane();
        ImageView res = new ImageView(Sources.getImg(resType.imgKey, ImgHandler.Size.SMALL));
        resBox.getChildren().addAll(res);
        Tooltip resTooltip = new Tooltip();
        resTooltip.getStyleClass().addAll("building__tooltip");
        resTooltip.setText(Sources.getL10n(resType.l10nKey));
        resTooltip.setShowDelay(Duration.valueOf("300ms"));
        resTooltip.setHideDelay(Duration.valueOf("100ms"));
        Tooltip.install(resBox, resTooltip);

        StackPane resFillBox = new StackPane();
        ProgressBar resFill = new ProgressBar();
        resFill.getStyleClass().addAll("building__progress_bar");
        fills.put(resFill, () -> building.get(BuildingAttrType.STORE).getCurrent(resType) /
                                 building.get(BuildingAttrType.STORE).getMax(resType));

        Text value = new Text();
        value.getStyleClass().addAll("building__text");
        values.put(value, () -> (int) building.get(BuildingAttrType.STORE).getCurrent(resType)
                                + Sources.getL10n(Strings.SEPARATOR)
                                + (int) building.get(BuildingAttrType.STORE).getMax(resType));

        resFillBox.getChildren().addAll(resFill, value);
        resSupplyBox.getChildren().addAll(resBox, resFillBox);
        box.getChildren().addAll(resSupplyBox);
    }

    private void addEnsureBox(Building building) {
        VBox ensureBox = new VBox();
        Text ensureLabel = new Text();
        ensureLabel.getStyleClass().addAll("building__text");
        ensureLabel.setText(Sources.getL10n(Strings.ENSURES) + Sources.getL10n(Strings.CLARIFICATION));
        ensureBox.setAlignment(Pos.CENTER_LEFT);
        ensureBox.setSpacing(5);
        ensureBox.getChildren().addAll(ensureLabel);
        building.get(BuildingAttrType.STORE).pack.keySet()
                .stream().filter(resType -> resType.equals(ResType.OBEDIENCE)
                                            || resType.equals(ResType.IGNITABILITY))
                .forEach(resType -> addResEnsureBox(building, resType, ensureBox));
        content.getChildren().addAll(ensureBox);
    }

    private void addResEnsureBox(Building building, ResType resType, Pane box) {
        HBox resSupplyBox = new HBox();
        resSupplyBox.setAlignment(Pos.CENTER_LEFT);
        resSupplyBox.setSpacing(5);

        StackPane resBox = new StackPane();
        ImageView res = new ImageView(Sources.getImg(resType.imgKey, ImgHandler.Size.SMALL));
        resBox.getChildren().addAll(res);
        Tooltip resTooltip = new Tooltip();
        resTooltip.getStyleClass().addAll("building__tooltip");
        resTooltip.setText(Sources.getL10n(resType.l10nKey));
        resTooltip.setShowDelay(Duration.valueOf("300ms"));
        resTooltip.setHideDelay(Duration.valueOf("100ms"));
        Tooltip.install(resBox, resTooltip);

        Text value = new Text();
        value.getStyleClass().addAll("building__text");
        values.put(value, () -> "" + (int) building.get(BuildingAttrType.STORE).getCurrent(resType));

        Text separator = new Text();
        separator.getStyleClass().addAll("building__text");
        separator.setText(Sources.getL10n(Strings.SEPARATOR));

        Text capacity = new Text();
        capacity.getStyleClass().addAll("building__text");
        values.put(capacity, () -> "" + (int) building.get(BuildingAttrType.STORE).getMax(resType));

        resSupplyBox.getChildren().addAll(resBox, value, separator, capacity);
        box.getChildren().addAll(resSupplyBox);
    }

    private void addJobBox(Building building) {
        VBox jobBox = new VBox();
        jobBox.setAlignment(Pos.CENTER_LEFT);
        jobBox.setSpacing(5);

        Text jobLabel = new Text();
        jobLabel.getStyleClass().addAll("building__text");
        jobLabel.setText(Sources.getL10n(Strings.JOB) + Sources.getL10n(Strings.CLARIFICATION));

        Text getText = new Text();
        getText.getStyleClass().addAll("building__text");
        getText.setText(Sources.getL10n(Strings.GET));

        HBox description = new HBox();
        description.setAlignment(Pos.CENTER_LEFT);
        description.setSpacing(5);
        description.getChildren().addAll(getText);

        building.get(BuildingAttrType.JOB_REWARD).pack.keySet()
                .stream().filter(type -> !type.equals(ResType.ACTION))
                .forEach(type -> addResJobBox(building, BuildingAttrType.JOB_REWARD, type, description));

        Text forText = new Text();
        forText.getStyleClass().addAll("building__text");
        forText.setText(Sources.getL10n(Strings.FOR));

        description.getChildren().addAll(forText);

        building.get(BuildingAttrType.JOB_PRICE).pack.keySet()
                .stream().filter(type -> !type.equals(ResType.ACTION) || building.type.equals(BuildingType.GYM))
                .forEach(type -> addResJobBox(building, BuildingAttrType.JOB_PRICE, type, description));

        JobBar progress = new JobBar();
        progress.getStyleClass().addAll("building__job_bar");
        progress.initJob(building.get(BuildingAttrType.JOB_PRICE), building.get(BuildingAttrType.JOB_REWARD));

        jobBox.getChildren().addAll(jobLabel, description, progress);
        content.getChildren().addAll(jobBox);
    }

    private void addResJobBox(Building building, BuildingAttrType attrType, ResType resType, Pane box) {
        StackPane resBox = new StackPane();
        ImageView res = new ImageView(Sources.getImg(resType.imgKey, ImgHandler.Size.SMALL));
        resBox.getChildren().addAll(res);
        Tooltip resTooltip = new Tooltip();
        resTooltip.getStyleClass().addAll("building__tooltip");
        resTooltip.setText(Sources.getL10n(resType.l10nKey));
        resTooltip.setShowDelay(Duration.valueOf("300ms"));
        resTooltip.setHideDelay(Duration.valueOf("100ms"));
        Tooltip.install(resBox, resTooltip);

        Text value = new Text();
        value.getStyleClass().addAll("building__text");
        values.put(value, () -> "" + (int) building.get(attrType).getCurrent(resType));

        box.getChildren().addAll(resBox, value);
    }

    private void updateValues() {
        values.forEach((text, stringSupplier) -> text.setText(stringSupplier.get()));
        fills.forEach((bar, doubleSupplier) -> bar.setProgress(doubleSupplier.get()));
    }
}
