package org.itworks.clicknbuild.ui.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import org.itworks.clicknbuild.engine.building.Building;
import org.itworks.clicknbuild.engine.city.Cell;
import org.itworks.clicknbuild.engine.res.TileType;
import org.itworks.clicknbuild.sources.CSSes;
import org.itworks.clicknbuild.sources.ImgHandler;
import org.itworks.clicknbuild.sources.Sources;
import org.itworks.clicknbuild.sources.Strings;
import org.itworks.clicknbuild.ui.Controllers;
import org.itworks.clicknbuild.ui.SceneLoader;
import org.itworks.clicknbuild.ui.Scenes;

import java.io.IOException;

public final class BuildingController extends BasicController {
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

    private Cell cell;

    @FXML
    private void initialize() {
        rootNode.getStylesheets().addAll(Sources.getCSS(CSSes.BUILDING));
        cell = ((MapController) Controllers.inst().get(MapController.class)).getSelectedCell();
        if (cell.getBuilding() == null) {
            initialize(cell.getTile());
        } else {
            initialize(cell.getBuilding());
        }
        backBtn.setText(Sources.getL10n(Strings.BTN_BACK));
    }

    private void initialize(TileType tile) {
        title.setText(Sources.getL10n(tile.l10nKey));
        image.setImage(Sources.getImg(tile.imgKey, ImgHandler.Size.GIANT));
        level.setVisible(false);
        structure.setText(Sources.getL10n(Strings.STRUCTURE) + Sources.getL10n(Strings.CLARIFICATION)
                          + tile.getStructure());
    }

    private void initialize(Building building) {
        title.setText(Sources.getL10n(cell.getBuilding().type.l10nKey));
        image.setImage(Sources.getImg(building.type.imgKey, ImgHandler.Size.GIANT));
        if (building.type.stats.getMaxLevel() == 1) level.setVisible(false);
        level.setText(Sources.getL10n(Strings.LEVEL) + Sources.getL10n(Strings.CLARIFICATION) + building.getLevel());
        structure.setText(Sources.getL10n(Strings.STRUCTURE) + Sources.getL10n(Strings.CLARIFICATION)
                          + building.type.stats.getStats()[building.getLevel() - 1].getStructure());
    }

    @FXML
    private void back() throws IOException {
        SceneLoader.inst().load(Scenes.CITY_VIEW);
    }
}
