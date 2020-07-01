package org.itworks.clicknbuild.engine.model;

import org.itworks.clicknbuild.sources.Images;
import org.itworks.clicknbuild.sources.Strings;
import org.itworks.clicknbuild.util.math.MathHelper;
import org.itworks.clicknbuild.util.string.StringHelper;

import java.util.Objects;

public enum ResType {
    ACTION("action",
            Strings.RES_ACTION,
            Images.RES_ACTION,
            false,
            -1),
    CONSTRUCTION("construction",
            Strings.RES_CONSTRUCTION,
            Images.RES_CONSTRUCTION,
            false,
            -1),
    ENERGY("energy",
            Strings.RES_ENERGY,
            Images.RES_ENERGY,
            false,
            -1),
    STEEL("steel",
            Strings.RES_STEEL,
            Images.RES_STEEL,
            true,
            50),
    CONCRETE("concrete",
            Strings.RES_CONCRETE,
            Images.RES_CONCRETE,
            true,
            15),
    BRICK("brick",
            Strings.RES_BRICK,
            Images.RES_BRICK,
            true,
            20),
    WOOD("wood",
            Strings.RES_WOOD,
            Images.RES_WOOD,
            true,
            60),
    GLASS("glass",
            Strings.RES_GLASS,
            Images.RES_GLASS,
            true,
            30),
    MONEY("money",
            Strings.RES_MONEY,
            Images.RES_MONEY,
            true,
            1),
    UPKEEP("upkeep",
            Strings.RES_UPKEEP,
            Images.RES_UPKEEP,
            false,
            1),
    POWER("power",
            Strings.RES_POWER,
            Images.RES_POWER,
            false,
            -1),
    POWER_CONSUMPTION("power_consumption",
            Strings.RES_POWER_CONSUMPTION,
            Images.RES_POWER_CONSUMPTION,
            false,
            -1),
    POWER_EXCESS("power_excess",
            Strings.RES_POWER_EXCESS,
            Images.RES_POWER_EXCESS,
            false,
            -1),
    CITIZEN("citizen",
            Strings.RES_CITIZEN,
            Images.RES_CITIZEN,
            false,
            -1),
    JOB("job",
            Strings.RES_JOB,
            Images.RES_JOB,
            false,
            -1),
    WORKER("worker",
            Strings.RES_WORKER,
            Images.RES_WORKER,
            false,
            -1),
    UNEMPLOYMENT("unemployment",
            Strings.RES_UNEMPLOYMENT,
            Images.RES_UNEMPLOYMENT,
            false,
            -1),
    BENEFIT("benefit",
            Strings.RES_BENEFIT,
            Images.RES_BENEFIT,
            false,
            5),
    OBEDIENCE("obedience",
            Strings.RES_OBEDIENCE,
            Images.RES_OBEDIENCE,
            false,
            -1),
    CRIME("crime",
            Strings.RES_CRIME,
            Images.RES_CRIME,
            false,
            -1),
    EMIGRATION("emigration",
            Strings.RES_EMIGRATION,
            Images.RES_EMIGRATION,
            false,
            -1),
    IGNITABILITY("ignitability",
            Strings.RES_IGNITABILITY,
            Images.RES_IGNITABILITY,
            false,
            -1),
    FIRE_HAZARD("fire_hazard",
            Strings.RES_FIRE_HAZARD,
            Images.RES_FIRE_HAZARD,
            false,
            -1);

    // lowercased equivalent for enum element itself.
    public final String type;

    // localized name: the key to get the localized representation from the resource handler.
    public final Strings l10nKey;

    // the key to get the corresponding icon from the resource handler.
    public final Images imgKey;

    private boolean tradable;

    private double price;

    ResType(String type, Strings l10nKey, Images imgKey, boolean tradable, double price) {
        this.type = StringHelper.nonNull(type);
        this.l10nKey = Objects.requireNonNull(l10nKey);
        this.imgKey = Objects.requireNonNull(imgKey);
        this.tradable = tradable;
        this.price = MathHelper.clamp(price, -1, 1000);
    }

    public static ResType get(String type) {
        ResType[] resources = values();
        for (ResType res : resources) if (res.type.equalsIgnoreCase(StringHelper.nonNull(type).trim())) return res;
        return null;
    }

    public static ResType get(int ordinal) {
        ResType[] resources = values();
        if (ordinal < 0 || ordinal >= resources.length) return null;
        return resources[ordinal];
    }

    public boolean isTradable() {
        return tradable;
    }

    public void setTradable(boolean tradable) {
        switch (this) {
            case STEEL:
            case CONCRETE:
            case BRICK:
            case WOOD:
            case GLASS:
            case MONEY:
                this.tradable = tradable;
                break;
            default:
                this.tradable = false;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = isTradable() ? MathHelper.clamp(price, 1000) : -1;
    }
}
