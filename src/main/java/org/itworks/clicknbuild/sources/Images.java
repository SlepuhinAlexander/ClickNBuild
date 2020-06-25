package org.itworks.clicknbuild.sources;

import org.itworks.clicknbuild.util.string.Str;

/** Global holder of string keys for ImgHandler */
public enum Images {
    DUMMY("dummy"),

    RES_ACTION("action"),
    RES_CONSTRUCTION("construction"),
    RES_ENERGY("energy"),
    RES_STEEL("steel"),
    RES_CONCRETE("concrete"),
    RES_BRICK("brick"),
    RES_WOOD("wood"),
    RES_GLASS("glass"),
    RES_MONEY("money"),
    RES_UPKEEP("upkeep"),
    RES_POWER("power"),
    RES_POWER_CONSUMPTION("power_consumption"),
    RES_POWER_EXCESS("power_excess"),
    RES_CITIZEN("citizen"),
    RES_JOB("job"),
    RES_WORKER("worker"),
    RES_UNEMPLOYMENT("unemployment"),
    RES_BENEFIT("benefit"),
    RES_OBEDIENCE("obedience"),
    RES_CRIME("crime"),
    RES_EMIGRATION("emigration"),
    RES_IGNITABILITY("ignitability"),
    RES_FIRE_HAZARD("fire_hazard"),

    PLAYER_EXPERIENCE("experience"),
    PLAYER_EXPERIENCE_LEVEL("experience_level"),

    TILE_LAND("land"),
    TILE_ROCK("rock"),
    TILE_RUIN("ruin"),
    TILE_SEA("sea"),
    TILE_TRASH("trash"),
    TILE_TREE("tree"),

    BLD_AIRPORT("airport"),
    BLD_APARTMENT("apartment"),
    BLD_BANK("bank"),
    BLD_CITY_PLANNING("city_planning"),
    BLD_CONSTRUCTION_SITE("construction_site"),
    BLD_ENGINEERING_CENTER("engineering_center"),
    BLD_EXCHANGE("exchange"),
    BLD_FACTORY("factory"),
    BLD_FACTORY_BRICK("factory_brick"),
    BLD_FACTORY_CONCRETE("factory_concrete"),
    BLD_FACTORY_GLASS("factory_glass"),
    BLD_FACTORY_STEEL("factory_steel"),
    BLD_FACTORY_WOOD("factory_wood"),
    BLD_FIRE_STATION("fire_station"),
    BLD_GYM("gym"),
    BLD_HEADQUARTER("headquarter"),
    BLD_HOTEL("hotel"),
    BLD_MALL("mall"),
    BLD_NUCLEAR_PLANT("nuclear_plant"),
    BLD_OFFICE("office"),
    BLD_POLICE("police"),
    BLD_PORT("port"),
    BLD_POWER_PLANT("power_plant"),
    BLD_ROAD("road"),
    BLD_WAREHOUSE("warehouse"),
    BLD_WAREHOUSE_BRICK("warehouse_brick"),
    BLD_WAREHOUSE_CONCRETE("warehouse_concrete"),
    BLD_WAREHOUSE_GLASS("warehouse_glass"),
    BLD_WAREHOUSE_STEEL("warehouse_steel"),
    BLD_WAREHOUSE_WOOD("warehouse_wood"),

    ;


    final String value;

    Images(String value) {
        this.value = Str.nonNull(value);
    }

    public static Images get(String value) {
        for (Images image : Images.values()) if (image.value.equalsIgnoreCase(Str.nonNull(value).trim())) return image;
        return DUMMY;
    }

    public static Images get(int ordinal) {
        for (Images image : Images.values()) if (image.ordinal() == ordinal) return image;
        return DUMMY;
    }
}
