package org.itworks.clicknbuild.engine.city;

import org.itworks.clicknbuild.engine.building.Building;
import org.itworks.clicknbuild.engine.res.TileType;

import java.util.Objects;

public final class Cell {
    public final Location location;
    private TileType tile;
    private Building building;

    public Cell(int row, int col) {
        this.location = new Location(row, col);
    }

    public Cell(Location location) {
        this.location = Objects.requireNonNull(location);
    }

    public TileType getTile() {
        return tile;
    }

    public void setTile(TileType tile) {
        this.tile = Objects.requireNonNull(tile);
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    @Override
    public String toString() {
        return tile.ordinal() + "";
    }
}
