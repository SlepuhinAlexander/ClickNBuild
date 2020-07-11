package org.itworks.clicknbuild.ui.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.util.Duration;
import org.itworks.clicknbuild.config.ConfigLoader;
import org.itworks.clicknbuild.config.Configs;
import org.itworks.clicknbuild.engine.building.BuildingType;
import org.itworks.clicknbuild.engine.city.BuildingManager;
import org.itworks.clicknbuild.engine.city.Cell;
import org.itworks.clicknbuild.sources.CSSes;
import org.itworks.clicknbuild.sources.ImgHandler;
import org.itworks.clicknbuild.sources.Sources;
import org.itworks.clicknbuild.sources.Strings;
import org.itworks.clicknbuild.ui.CellButton;
import org.itworks.clicknbuild.ui.SceneLoader;
import org.itworks.clicknbuild.ui.Scenes;

import java.io.IOException;

public final class MapController extends BasicController {
    private static final int MAP_WIDTH = Integer.parseInt(ConfigLoader.inst().get(Configs.MAP_WIDTH));
    private static final int MAP_HEIGHT = Integer.parseInt(ConfigLoader.inst().get(Configs.MAP_HEIGHT));

    @FXML
    private GridPane rootNode;

    private Cell selectedCell;

    public Cell getSelectedCell() {
        return selectedCell;
    }

    @FXML
    private void initialize() {
        rootNode.getStylesheets().addAll(Sources.getCSS(CSSes.MAP));
        Cell[][] map = BuildingManager.inst().map;
        for (int i = 0; i < MAP_HEIGHT; i++) {
            for (int j = 0; j < MAP_WIDTH; j++) {
                Cell cell = map[i][j];
                CellButton cellButton = new CellButton(cell);
                cellButton.getStyleClass().addAll("map__cell");
                Tooltip tooltip = new Tooltip();
                tooltip.getStyleClass().addAll("map__tooltip");
                tooltip.setShowDelay(Duration.valueOf("300ms"));
                tooltip.setHideDelay(Duration.valueOf("100ms"));
                if (cell.getBuilding() == null) {
                    cellButton.setGraphic(new ImageView(Sources.getImg(cell.getTile().imgKey,
                            ImgHandler.Size.LARGE)));
                    tooltip.setText(Sources.getL10n(cell.getTile().l10nKey));
                } else {
                    cellButton.setGraphic(new ImageView(Sources.getImg(cell.getBuilding().type.imgKey,
                            ImgHandler.Size.LARGE)));
                    if (cell.getBuilding().type.equals(BuildingType.ROAD)) {
                        tooltip.setText(Sources.getL10n(cell.getBuilding().type.l10nKey));
                    } else {
                        tooltip.setText(Sources.getL10n(cell.getBuilding().type.l10nKey) + "\n" +
                                        Sources.getL10n(Strings.LEVEL) + " "
                                        + cell.getBuilding().getLevel());
                    }
                }
                cellButton.setTooltip(tooltip);
                cellButton.setOnAction(actionEvent -> {
                    try {
                        toBuildingView(actionEvent);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
                rootNode.add(cellButton, j, i);
            }
        }
    }

    private void toBuildingView(ActionEvent actionEvent) throws IOException {
        selectedCell = ((CellButton) actionEvent.getSource()).cell;
        SceneLoader.inst().load(Scenes.BUILDING_VIEW);
    }
}
