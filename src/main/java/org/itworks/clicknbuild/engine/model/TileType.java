package org.itworks.clicknbuild.engine.model;

import org.itworks.clicknbuild.sources.Images;
import org.itworks.clicknbuild.sources.Strings;
import org.itworks.clicknbuild.util.math.M;
import org.itworks.clicknbuild.util.string.Str;

import java.util.Objects;

public enum TileType {
    SEA("sea", Strings.TILE_SEA, Images.TILE_SEA, 10000),
    LAND("land", Strings.TILE_LAND, Images.TILE_LAND, 10000),
    ROCK("rock", Strings.TILE_ROCK, Images.TILE_ROCK, 2000),
    TREE("tree", Strings.TILE_TREE, Images.TILE_TREE, 1000),
    TRASH("trash", Strings.TILE_TRASH, Images.TILE_TRASH, 500),
    RUIN("ruin", Strings.TILE_RUIN, Images.TILE_RUIN, 5000);

    public final String type;

    public final Strings l10nKey;

    public final Images imgKey;

    private double structure;

    TileType(String type, Strings l10nKey, Images imgKey, double structure) {
        this.type = Str.nonNull(type);
        this.l10nKey = Objects.requireNonNull(l10nKey);
        this.imgKey = Objects.requireNonNull(imgKey);
        this.structure = M.clamp(structure);
    }

    public static TileType get(String type) {
        for (TileType tile : TileType.values()) if (tile.type.equalsIgnoreCase(Str.nonNull(type).trim())) return tile;
        return null;
    }

    public static TileType get(int ordinal) {
        for (TileType tile : TileType.values()) if (tile.ordinal() == ordinal) return tile;
        return null;
    }

    public double getStructure() {
        return structure;
    }

    public void setStructure(double structure) {
        this.structure = M.clamp(structure);
    }
}
