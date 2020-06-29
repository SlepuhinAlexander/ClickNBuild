package org.itworks.clicknbuild.engine.model;

import org.itworks.clicknbuild.config.stats.buidling.*;
import org.itworks.clicknbuild.sources.Images;
import org.itworks.clicknbuild.sources.Strings;
import org.itworks.clicknbuild.util.string.Str;

import java.util.Objects;

public enum BuildingType {
    HEADQUARTER("headquarter",
            Strings.BLD_HEADQUARTER,
            Images.BLD_HEADQUARTER,
            HeadquarterStats.inst()),
    ROAD("road",
            Strings.BLD_ROAD,
            Images.BLD_ROAD,
            RoadStats.inst()),
    POWER_PLANT("power_plant",
            Strings.BLD_POWER_PLANT,
            Images.BLD_POWER_PLANT,
            PowerPlantStats.inst()),
    FACTORY_STEEL("factory_steel",
            Strings.BLD_FACTORY_STEEL,
            Images.BLD_FACTORY_STEEL,
            FactorySteelStats.inst()),
    FACTORY_CONCRETE("factory_concrete",
            Strings.BLD_FACTORY_CONCRETE,
            Images.BLD_FACTORY_CONCRETE,
            FactoryConcreteStats.inst()),
    FACTORY_BRICK("factory_brick",
            Strings.BLD_FACTORY_BRICK,
            Images.BLD_FACTORY_BRICK,
            FactoryBrickStats.inst()),
    FACTORY_WOOD("factory_wood",
            Strings.BLD_FACTORY_WOOD,
            Images.BLD_FACTORY_WOOD,
            FactoryWoodStats.inst()),
    FACTORY_GLASS("factory_glass",
            Strings.BLD_FACTORY_GLASS,
            Images.BLD_FACTORY_GLASS,
            FactoryGlassStats.inst()),
    OFFICE("office",
            Strings.BLD_OFFICE,
            Images.BLD_OFFICE,
            OfficeStats.inst()),
    APARTMENT("apartment",
            Strings.BLD_APARTMENT,
            Images.BLD_APARTMENT,
            ApartmentStats.inst()),
    WAREHOUSE("warehouse",
            Strings.BLD_WAREHOUSE,
            Images.BLD_WAREHOUSE,
            WarehouseStats.inst()),
    WAREHOUSE_STEEL("warehouse_steel",
            Strings.BLD_WAREHOUSE_STEEL,
            Images.BLD_WAREHOUSE_STEEL,
            WarehouseSteelStats.inst()),
    WAREHOUSE_CONCRETE("warehouse_concrete",
            Strings.BLD_WAREHOUSE_CONCRETE,
            Images.BLD_WAREHOUSE_CONCRETE,
            WarehouseConcreteStats.inst()),
    WAREHOUSE_BRICK("warehouse_brick",
            Strings.BLD_WAREHOUSE_BRICK,
            Images.BLD_WAREHOUSE_BRICK,
            WarehouseBrickStats.inst()),
    WAREHOUSE_WOOD("warehouse_wood",
            Strings.BLD_WAREHOUSE_WOOD,
            Images.BLD_WAREHOUSE_WOOD,
            WarehouseWoodStats.inst()),
    WAREHOUSE_GLASS("warehouse_glass",
            Strings.BLD_WAREHOUSE_GLASS,
            Images.BLD_WAREHOUSE_GLASS,
            WarehouseGlassStats.inst()),
    MALL("mall",
            Strings.BLD_MALL,
            Images.BLD_MALL,
            MallStats.inst()),
    POLICE("police",
            Strings.BLD_POLICE,
            Images.BLD_POLICE,
            PoliceStats.inst()),
    FIRE_STATION("fire_station",
            Strings.BLD_FIRE_STATION,
            Images.BLD_FIRE_STATION,
            FireStationStats.inst()),
    GYM("gym",
            Strings.BLD_GYM,
            Images.BLD_GYM,
            GymStats.inst()),
    CITY_PLANNING("city_planning",
            Strings.BLD_CITY_PLANNING,
            Images.BLD_CITY_PLANNING,
            CityPlanningStats.inst()),
    HOTEL("hotel",
            Strings.BLD_HOTEL,
            Images.BLD_HOTEL,
            HotelStats.inst()),
    CONSTRUCTION_SITE("construction_site",
            Strings.BLD_CONSTRUCTION_SITE,
            Images.BLD_CONSTRUCTION_SITE,
            ConstructionSiteStats.inst()),
    BANK("bank",
            Strings.BLD_BANK,
            Images.BLD_BANK,
            BankStats.inst()),
    ENGINEERING_CENTER("engineering_center",
            Strings.BLD_ENGINEERING_CENTER,
            Images.BLD_ENGINEERING_CENTER,
            EngineeringCenterStats.inst()),
    EXCHANGE("exchange",
            Strings.BLD_EXCHANGE,
            Images.BLD_EXCHANGE,
            ExchangeStats.inst()),
    PORT("port",
            Strings.BLD_PORT,
            Images.BLD_PORT,
            PortStats.inst()),
    AIRPORT("airport",
            Strings.BLD_AIRPORT,
            Images.BLD_AIRPORT,
            AirportStats.inst()),
    NUCLEAR_PLANT("nuclear_plant",
            Strings.BLD_NUCLEAR_PLANT,
            Images.BLD_NUCLEAR_PLANT,
            NuclearPlantStats.inst());

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
     * Link to corresponding stats holder singleton
     */
    public final BuildingStats stats;

    BuildingType(String type, Strings l10nKey, Images imgKey, BuildingStats stats) {
        this.type = Str.nonNull(type);
        this.l10nKey = Objects.requireNonNull(l10nKey);
        this.imgKey = Objects.requireNonNull(imgKey);
        this.stats = Objects.requireNonNull(stats);
    }

    public static BuildingType get(String type) {
        BuildingType[] buildings = values();
        for (BuildingType building : buildings) if (building.type.equalsIgnoreCase(Str.nonNull(type))) return building;
        return null;
    }

    public static BuildingType get(int ordinal) {
        BuildingType[] buildings = values();
        if (ordinal < 0 || ordinal >= buildings.length) return null;
        return buildings[ordinal];
    }
}
