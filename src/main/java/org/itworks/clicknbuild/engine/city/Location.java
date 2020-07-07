package org.itworks.clicknbuild.engine.city;

import java.util.Objects;

public class Location {
    public final int row;
    public final int col;

    public Location(int row, int col) {
        this.row = row;
        this.col = col;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        return row == location.row &&
               col == location.col;
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, col);
    }
}
