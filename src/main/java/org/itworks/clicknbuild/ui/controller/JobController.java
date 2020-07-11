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

public final class JobController extends BasicController implements Ticking {
    private final Map<Text, Supplier<String>> values = new HashMap<>();
    @FXML
    private Text title;
    @FXML
    private StackPane resWorkerBox;
    @FXML
    private ImageView resWorker;
    @FXML
    private Text workerValue;
    @FXML
    private Text separator;
    @FXML
    private StackPane resJobBox;
    @FXML
    private ImageView resJob;
    @FXML
    private Text jobValue;
    @FXML
    private StackPane resUnemploymentBox;
    @FXML
    private ImageView resUnemployment;
    @FXML
    private Text unemploymentValue;
    @FXML
    private Text clarification;
    @FXML
    private StackPane resBenefitBox;
    @FXML
    private ImageView resBenefit;
    @FXML
    private Text benefitValue;
    @FXML
    private VBox rootNode;

    @FXML
    private void initialize() {
        rootNode.getStylesheets().addAll(Sources.getCSS(CSSes.JOB));
        title.setText(Sources.getL10n(Strings.WORKERS));
        separator.setText(Sources.getL10n(Strings.SEPARATOR));
        clarification.setText(Sources.getL10n(Strings.CLARIFICATION));

        Strings[] l10ns = new Strings[]{Strings.RES_WORKER, Strings.RES_JOB, Strings.RES_UNEMPLOYMENT,
                Strings.RES_BENEFIT};
        Images[] resImages = new Images[]{Images.RES_WORKER, Images.RES_JOB, Images.RES_UNEMPLOYMENT,
                Images.RES_BENEFIT};
        StackPane[] resBoxes = new StackPane[]{resWorkerBox, resJobBox, resUnemploymentBox, resBenefitBox};
        ImageView[] resources = new ImageView[]{resWorker, resJob, resUnemployment, resBenefit};

        for (int i = 0; i < resBoxes.length; i++) {
            resources[i].setImage(Sources.getImg(resImages[i], ImgHandler.Size.SMALL));
            Tooltip tip = new Tooltip();
            tip.getStyleClass().addAll("job__tooltip");
            tip.setText(Sources.getL10n(l10ns[i]));
            tip.setShowDelay(Duration.valueOf("300ms"));
            tip.setHideDelay(Duration.valueOf("100ms"));
            Tooltip.install(resBoxes[i], tip);
        }

        values.put(workerValue, () -> "" + (int) ResManager.inst().get(BuildingAttrType.HOLD)
                .getTotal(ResType.WORKER).getCurrent());
        values.put(jobValue, () -> "" + (int) ResManager.inst().get(BuildingAttrType.HOLD)
                .getTotal(ResType.JOB).getCurrent());
        values.put(unemploymentValue, () -> "" + (int) ResManager.inst().get(BuildingAttrType.HOLD)
                .getTotal(ResType.UNEMPLOYMENT).getCurrent());
        values.put(benefitValue, () -> "" + (int) ResManager.inst().get(BuildingAttrType.HOLD)
                .getTotal(ResType.BENEFIT).getCurrent() + Sources.getL10n(Strings.PER_HOUR));

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
