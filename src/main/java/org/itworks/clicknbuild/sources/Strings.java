package org.itworks.clicknbuild.sources;

import org.itworks.clicknbuild.util.string.StringHelper;

/**
 * Global holder of string keys for L10nHandler
 */
public enum Strings {
    EMPTY(""),

    GAME_TITLE("game.title"),

    RES_ACTION("res.action"),
    RES_CONSTRUCTION("res.construction"),
    RES_ENERGY("res.energy"),
    RES_STEEL("res.steel"),
    RES_CONCRETE("res.concrete"),
    RES_BRICK("res.brick"),
    RES_WOOD("res.wood"),
    RES_GLASS("res.glass"),
    RES_MONEY("res.money"),
    RES_UPKEEP("res.upkeep"),
    RES_POWER("res.power"),
    RES_POWER_CONSUMPTION("res.power_consumption"),
    RES_POWER_EXCESS("res.power_excess"),
    RES_CITIZEN("res.citizen"),
    RES_JOB("res.job"),
    RES_WORKER("res.worker"),
    RES_UNEMPLOYMENT("res.unemployment"),
    RES_BENEFIT("res.benefit"),
    RES_OBEDIENCE("res.obedience"),
    RES_CRIME("res.crime"),
    RES_EMIGRATION("res.emigration"),
    RES_IGNITABILITY("res.ignitability"),
    RES_FIRE_HAZARD("res.fire_hazard"),

    PLAYER_EXPERIENCE("res.experience"),
    PLAYER_EXPERIENCE_LEVEL("res.experience_level"),

    TILE_LAND("tile.land"),
    TILE_ROCK("tile.rock"),
    TILE_RUIN("tile.ruin"),
    TILE_SEA("tile.sea"),
    TILE_TRASH("tile.trash"),
    TILE_TREE("tile.tree"),

    BLD_AIRPORT("bld.airport"),
    BLD_APARTMENT("bld.apartment"),
    BLD_BANK("bld.bank"),
    BLD_CITY_PLANNING("bld.city_planning"),
    BLD_CONSTRUCTION_SITE("bld.construction_site"),
    BLD_ENGINEERING_CENTER("bld.engineering_center"),
    BLD_EXCHANGE("bld.exchange"),
    BLD_FACTORY("bld.factory"),
    BLD_FACTORY_BRICK("bld.factory_brick"),
    BLD_FACTORY_CONCRETE("bld.factory_concrete"),
    BLD_FACTORY_GLASS("bld.factory_glass"),
    BLD_FACTORY_STEEL("bld.factory_steel"),
    BLD_FACTORY_WOOD("bld.factory_wood"),
    BLD_FIRE_STATION("bld.fire_station"),
    BLD_GYM("bld.gym"),
    BLD_HEADQUARTER("bld.headquarter"),
    BLD_HOTEL("bld.hotel"),
    BLD_MALL("bld.mall"),
    BLD_NUCLEAR_PLANT("bld.nuclear_plant"),
    BLD_OFFICE("bld.office"),
    BLD_POLICE("bld.police"),
    BLD_PORT("bld.port"),
    BLD_POWER_PLANT("bld.power_plant"),
    BLD_ROAD("bld.road"),
    BLD_WAREHOUSE("bld.warehouse"),
    BLD_WAREHOUSE_BRICK("bld.warehouse_brick"),
    BLD_WAREHOUSE_CONCRETE("bld.warehouse_concrete"),
    BLD_WAREHOUSE_GLASS("bld.warehouse_glass"),
    BLD_WAREHOUSE_STEEL("bld.warehouse_steel"),
    BLD_WAREHOUSE_WOOD("bld.warehouse_wood"),

    DIFFICULTY_EASY("difficulty.easy"),
    DIFFICULTY_NORMAL("difficulty.normal"),
    DIFFICULTY_HARD("difficulty.hard"),
    DIFFICULTY_EASY_DESC("difficulty.easy.description"),
    DIFFICULTY_NORMAL_DESC("difficulty.normal.description"),
    DIFFICULTY_HARD_DESC("difficulty.hard.description"),

    MAIN_MENU_TITLE("main_menu.title"),
    BTN_START_GAME("btn.start_game"),
    BTN_SELECT_PROFILE("btn.select_profile"),
    BTN_HELP("btn.help"),
    BTN_EXIT("btn.exit"),
    BTN_BACK("btn.back"),
    BTN_SAVE("btn.save"),
    BTN_DEFAULTS("btn.defaults"),
    BTN_WIPE_SAVE("btn.wipe_save"),
    BTN_DELETE_PROFILE("btn.delete_profile"),

    HELP_TITLE("help.title"),
    HELP_DUMMY("help.dummy"),

    PROFILE_SELECTION_TITLE("profile_selection.title"),

    EDIT_PROFILE_TITLE("edit_profile.title"),
    ;

    final String value;

    Strings(String value) {
        this.value = StringHelper.nonNull(value);
    }

    public static Strings get(String value) {
        Strings[] strings = values();
        for (Strings string : strings) {
            if (string.value.equalsIgnoreCase(StringHelper.nonNull(value).trim())) return string;
        }
        return EMPTY;
    }

    public static Strings get(int ordinal) {
        Strings[] strings = values();
        if (ordinal < 0 || ordinal >= strings.length) return EMPTY;
        return strings[ordinal];
    }
}
