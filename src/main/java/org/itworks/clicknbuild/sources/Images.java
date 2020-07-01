package org.itworks.clicknbuild.sources;

import org.itworks.clicknbuild.util.string.StringHelper;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Global holder of string keys for ImgHandler
 */
public enum Images {
    DUMMY("dummy", Group.OTHER),

    RES_ACTION("action", Group.RESOURCE),
    RES_CONSTRUCTION("construction", Group.RESOURCE),
    RES_ENERGY("energy", Group.RESOURCE),
    RES_STEEL("steel", Group.RESOURCE),
    RES_CONCRETE("concrete", Group.RESOURCE),
    RES_BRICK("brick", Group.RESOURCE),
    RES_WOOD("wood", Group.RESOURCE),
    RES_GLASS("glass", Group.RESOURCE),
    RES_MONEY("money", Group.RESOURCE),
    RES_UPKEEP("upkeep", Group.RESOURCE),
    RES_POWER("power", Group.RESOURCE),
    RES_POWER_CONSUMPTION("power_consumption", Group.RESOURCE),
    RES_POWER_EXCESS("power_excess", Group.RESOURCE),
    RES_CITIZEN("citizen", Group.RESOURCE),
    RES_JOB("job", Group.RESOURCE),
    RES_WORKER("worker", Group.RESOURCE),
    RES_UNEMPLOYMENT("unemployment", Group.RESOURCE),
    RES_BENEFIT("benefit", Group.RESOURCE),
    RES_OBEDIENCE("obedience", Group.RESOURCE),
    RES_CRIME("crime", Group.RESOURCE),
    RES_EMIGRATION("emigration", Group.RESOURCE),
    RES_IGNITABILITY("ignitability", Group.RESOURCE),
    RES_FIRE_HAZARD("fire_hazard", Group.RESOURCE),

    PLAYER_EXPERIENCE("experience", Group.RESOURCE),
    PLAYER_EXPERIENCE_LEVEL("experience_level", Group.RESOURCE),

    TILE_LAND("land", Group.TILE),
    TILE_ROCK("rock", Group.TILE),
    TILE_RUIN("ruin", Group.TILE),
    TILE_SEA("sea", Group.TILE),
    TILE_TRASH("trash", Group.TILE),
    TILE_TREE("tree", Group.TILE),

    BLD_AIRPORT("airport", Group.BUILDING),
    BLD_APARTMENT("apartment", Group.BUILDING),
    BLD_BANK("bank", Group.BUILDING),
    BLD_CITY_PLANNING("city_planning", Group.BUILDING),
    BLD_CONSTRUCTION_SITE("construction_site", Group.BUILDING),
    BLD_ENGINEERING_CENTER("engineering_center", Group.BUILDING),
    BLD_EXCHANGE("exchange", Group.BUILDING),
    BLD_FACTORY("factory", Group.BUILDING),
    BLD_FACTORY_BRICK("factory_brick", Group.BUILDING),
    BLD_FACTORY_CONCRETE("factory_concrete", Group.BUILDING),
    BLD_FACTORY_GLASS("factory_glass", Group.BUILDING),
    BLD_FACTORY_STEEL("factory_steel", Group.BUILDING),
    BLD_FACTORY_WOOD("factory_wood", Group.BUILDING),
    BLD_FIRE_STATION("fire_station", Group.BUILDING),
    BLD_GYM("gym", Group.BUILDING),
    BLD_HEADQUARTER("headquarter", Group.BUILDING),
    BLD_HOTEL("hotel", Group.BUILDING),
    BLD_MALL("mall", Group.BUILDING),
    BLD_NUCLEAR_PLANT("nuclear_plant", Group.BUILDING),
    BLD_OFFICE("office", Group.BUILDING),
    BLD_POLICE("police", Group.BUILDING),
    BLD_PORT("port", Group.BUILDING),
    BLD_POWER_PLANT("power_plant", Group.BUILDING),
    BLD_ROAD("road", Group.BUILDING),
    BLD_WAREHOUSE("warehouse", Group.BUILDING),
    BLD_WAREHOUSE_BRICK("warehouse_brick", Group.BUILDING),
    BLD_WAREHOUSE_CONCRETE("warehouse_concrete", Group.BUILDING),
    BLD_WAREHOUSE_GLASS("warehouse_glass", Group.BUILDING),
    BLD_WAREHOUSE_STEEL("warehouse_steel", Group.BUILDING),
    BLD_WAREHOUSE_WOOD("warehouse_wood", Group.BUILDING),

    AVATAR_MAN0("man0", Group.AVATAR),
    AVATAR_MAN1("man1", Group.AVATAR),
    AVATAR_MAN2("man2", Group.AVATAR),
    AVATAR_MAN3("man3", Group.AVATAR),
    AVATAR_MAN4("man4", Group.AVATAR),
    AVATAR_MAN5("man5", Group.AVATAR),
    AVATAR_MAN6("man6", Group.AVATAR),
    AVATAR_MAN7("man7", Group.AVATAR),
    AVATAR_MAN8("man8", Group.AVATAR),
    AVATAR_MAN9("man9", Group.AVATAR),
    AVATAR_MAN10("man10", Group.AVATAR),
    AVATAR_MAN11("man11", Group.AVATAR),
    AVATAR_MAN12("man12", Group.AVATAR),
    AVATAR_MAN13("man13", Group.AVATAR),
    AVATAR_MAN14("man14", Group.AVATAR),
    AVATAR_MAN15("man15", Group.AVATAR),
    AVATAR_MAN16("man16", Group.AVATAR),
    AVATAR_MAN17("man17", Group.AVATAR),
    AVATAR_MAN18("man18", Group.AVATAR),
    AVATAR_MAN19("man19", Group.AVATAR),
    AVATAR_MAN20("man20", Group.AVATAR),
    AVATAR_WOMAN0("woman0", Group.AVATAR),
    AVATAR_WOMAN1("woman1", Group.AVATAR),
    AVATAR_WOMAN2("woman2", Group.AVATAR),
    AVATAR_WOMAN3("woman3", Group.AVATAR),
    AVATAR_WOMAN4("woman4", Group.AVATAR),
    AVATAR_WOMAN5("woman5", Group.AVATAR),
    AVATAR_WOMAN6("woman6", Group.AVATAR),
    AVATAR_WOMAN7("woman7", Group.AVATAR),
    AVATAR_WOMAN8("woman8", Group.AVATAR),
    AVATAR_WOMAN9("woman9", Group.AVATAR),
    AVATAR_WOMAN10("woman10", Group.AVATAR),
    AVATAR_WOMAN11("woman11", Group.AVATAR),
    AVATAR_WOMAN12("woman12", Group.AVATAR),
    AVATAR_WOMAN13("woman13", Group.AVATAR),
    ;

    final String name;

    final Group group;

    Images(String name, Group group) {
        this.name = StringHelper.nonNull(name);
        this.group = Objects.requireNonNull(group);
    }

    public static Images get(String value) {
        Images[] images = values();
        for (Images image : images) if (image.name.equalsIgnoreCase(StringHelper.nonNull(value).trim())) return image;
        return DUMMY;
    }

    public static Images get(int ordinal) {
        Images[] images = values();
        if (ordinal < 0 || ordinal >= images.length) return DUMMY;
        return images[ordinal];
    }

    public static List<Images> get(Group group) {
        if (group == null) return Collections.emptyList();
        return Arrays.stream(values())
                .filter(image -> image.group.equals(group))
                .collect(Collectors.toList());
    }

    public enum Group {
        BUTTON, RESOURCE, TILE, BUILDING, AVATAR, OTHER
    }
}
