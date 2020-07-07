package org.itworks.clicknbuild.engine.model;

import org.itworks.clicknbuild.config.stats.BuildingDefaults;
import org.itworks.clicknbuild.sources.Images;
import org.itworks.clicknbuild.sources.Strings;
import org.itworks.clicknbuild.util.string.StringHelper;

import java.util.Objects;

public enum BuildingType {
    HEADQUARTER("headquarter",
            Strings.BLD_HEADQUARTER,
            Images.BLD_HEADQUARTER),
    ROAD("road",
            Strings.BLD_ROAD,
            Images.BLD_ROAD),
    POWER_PLANT("power_plant",
            Strings.BLD_POWER_PLANT,
            Images.BLD_POWER_PLANT),
    FACTORY_STEEL("factory_steel",
            Strings.BLD_FACTORY_STEEL,
            Images.BLD_FACTORY_STEEL),
    FACTORY_CONCRETE("factory_concrete",
            Strings.BLD_FACTORY_CONCRETE,
            Images.BLD_FACTORY_CONCRETE),
    FACTORY_BRICK("factory_brick",
            Strings.BLD_FACTORY_BRICK,
            Images.BLD_FACTORY_BRICK),
    FACTORY_WOOD("factory_wood",
            Strings.BLD_FACTORY_WOOD,
            Images.BLD_FACTORY_WOOD),
    FACTORY_GLASS("factory_glass",
            Strings.BLD_FACTORY_GLASS,
            Images.BLD_FACTORY_GLASS),
    OFFICE("office",
            Strings.BLD_OFFICE,
            Images.BLD_OFFICE),
    APARTMENT("apartment",
            Strings.BLD_APARTMENT,
            Images.BLD_APARTMENT),
    WAREHOUSE("warehouse",
            Strings.BLD_WAREHOUSE,
            Images.BLD_WAREHOUSE),
    WAREHOUSE_STEEL("warehouse_steel",
            Strings.BLD_WAREHOUSE_STEEL,
            Images.BLD_WAREHOUSE_STEEL),
    WAREHOUSE_CONCRETE("warehouse_concrete",
            Strings.BLD_WAREHOUSE_CONCRETE,
            Images.BLD_WAREHOUSE_CONCRETE),
    WAREHOUSE_BRICK("warehouse_brick",
            Strings.BLD_WAREHOUSE_BRICK,
            Images.BLD_WAREHOUSE_BRICK),
    WAREHOUSE_WOOD("warehouse_wood",
            Strings.BLD_WAREHOUSE_WOOD,
            Images.BLD_WAREHOUSE_WOOD),
    WAREHOUSE_GLASS("warehouse_glass",
            Strings.BLD_WAREHOUSE_GLASS,
            Images.BLD_WAREHOUSE_GLASS),
    MALL("mall",
            Strings.BLD_MALL,
            Images.BLD_MALL),
    POLICE("police",
            Strings.BLD_POLICE,
            Images.BLD_POLICE),
    FIRE_STATION("fire_station",
            Strings.BLD_FIRE_STATION,
            Images.BLD_FIRE_STATION),
    GYM("gym",
            Strings.BLD_GYM,
            Images.BLD_GYM),
    CITY_PLANNING("city_planning",
            Strings.BLD_CITY_PLANNING,
            Images.BLD_CITY_PLANNING),
    HOTEL("hotel",
            Strings.BLD_HOTEL,
            Images.BLD_HOTEL),
    CONSTRUCTION_SITE("construction_site",
            Strings.BLD_CONSTRUCTION_SITE,
            Images.BLD_CONSTRUCTION_SITE),
    BANK("bank",
            Strings.BLD_BANK,
            Images.BLD_BANK),
    ENGINEERING_CENTER("engineering_center",
            Strings.BLD_ENGINEERING_CENTER,
            Images.BLD_ENGINEERING_CENTER),
    EXCHANGE("exchange",
            Strings.BLD_EXCHANGE,
            Images.BLD_EXCHANGE),
    PORT("port",
            Strings.BLD_PORT,
            Images.BLD_PORT),
    AIRPORT("airport",
            Strings.BLD_AIRPORT,
            Images.BLD_AIRPORT),
    NUCLEAR_PLANT("nuclear_plant",
            Strings.BLD_NUCLEAR_PLANT,
            Images.BLD_NUCLEAR_PLANT);

    /**
     * String identity equivalent for the enum itself.
     */
    public final String type;

    /**
     * Link to the key holder to retrieve localized building type name from the Source Handler.
     */
    public final Strings l10nKey;

    /**
     * Link to the key holder to retrieve the corresponding building Image object from the Source Handler.
     */
    public final Images imgKey;

    /**
     * Link to corresponding stats holder instance
     */
    public final BuildingDefaults stats;

    BuildingType(String type, Strings l10nKey, Images imgKey) {
        this.type = StringHelper.nonNull(type);
        this.l10nKey = Objects.requireNonNull(l10nKey);
        this.imgKey = Objects.requireNonNull(imgKey);
        this.stats = new BuildingDefaults();
    }

    public static BuildingType get(String type) {
        BuildingType[] buildings = values();
        for (BuildingType building : buildings) {
            if (building.type.equalsIgnoreCase(StringHelper.nonNull(type))) return building;
        }
        return null;
    }

    public static BuildingType get(int ordinal) {
        BuildingType[] buildings = values();
        if (ordinal < 0 || ordinal >= buildings.length) return null;
        return buildings[ordinal];
    }
}
