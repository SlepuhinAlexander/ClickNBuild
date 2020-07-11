package org.itworks.clicknbuild.ui;

import javafx.scene.control.Button;
import org.itworks.clicknbuild.engine.city.Cell;

import java.util.Objects;

public class CellButton extends Button {
    public final Cell cell;

    public CellButton(Cell cell) {
        this.cell = Objects.requireNonNull(cell);
    }
}
