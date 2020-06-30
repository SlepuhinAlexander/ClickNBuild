package org.itworks.clicknbuild.sources;

import org.itworks.clicknbuild.util.string.Str;

/**
 * Global holder of string keys for ImgHandler
 */
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

    AVATAR_MAN0("man0"),
    AVATAR_MAN1("man1"),
    AVATAR_MAN2("man2"),
    AVATAR_MAN3("man3"),
    AVATAR_MAN4("man4"),
    AVATAR_MAN5("man5"),
    AVATAR_MAN6("man6"),
    AVATAR_MAN7("man7"),
    AVATAR_MAN8("man8"),
    AVATAR_MAN9("man9"),
    AVATAR_MAN10("man10"),
    AVATAR_MAN11("man11"),
    AVATAR_MAN12("man12"),
    AVATAR_MAN13("man13"),
    AVATAR_MAN14("man14"),
    AVATAR_MAN15("man15"),
    AVATAR_MAN16("man16"),
    AVATAR_MAN17("man17"),
    AVATAR_MAN18("man18"),
    AVATAR_MAN19("man19"),
    AVATAR_MAN20("man20"),
    AVATAR_WOMAN0("woman0"),
    AVATAR_WOMAN1("woman1"),
    AVATAR_WOMAN2("woman2"),
    AVATAR_WOMAN3("woman3"),
    AVATAR_WOMAN4("woman4"),
    AVATAR_WOMAN5("woman5"),
    AVATAR_WOMAN6("woman6"),
    AVATAR_WOMAN7("woman7"),
    AVATAR_WOMAN8("woman8"),
    AVATAR_WOMAN9("woman9"),
    AVATAR_WOMAN10("woman10"),
    AVATAR_WOMAN11("woman11"),
    AVATAR_WOMAN12("woman12"),
    AVATAR_WOMAN13("woman13"),
    ;


    final String value;

    Images(String value) {
        this.value = Str.nonNull(value);
    }

    public static Images get(String value) {
        Images[] images = values();
        for (Images image : images) if (image.value.equalsIgnoreCase(Str.nonNull(value).trim())) return image;
        return DUMMY;
    }

    public static Images get(int ordinal) {
        Images[] images = values();
        if (ordinal < 0 || ordinal >= images.length) return DUMMY;
        return images[ordinal];
    }
}
