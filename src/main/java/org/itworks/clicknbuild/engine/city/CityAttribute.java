package org.itworks.clicknbuild.engine.city;

import org.itworks.clicknbuild.engine.building.Building;
import org.itworks.clicknbuild.engine.building.BuildingAttrType;
import org.itworks.clicknbuild.engine.building.BuildingAttribute;
import org.itworks.clicknbuild.engine.res.ResChunk;
import org.itworks.clicknbuild.engine.res.ResPack;
import org.itworks.clicknbuild.engine.res.ResType;

import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Aggregator of all {@link Building}-s having a certain non-null (and not empty) {@link BuildingAttribute} of a
 * certain {@link BuildingAttrType}
 * Cumulates a total sum of resources presented in those buildings in this attribute type as well.
 * The city would use an instance of such <code>CityAttribute</code> for each possible {@link BuildingAttrType}.
 */
public class CityAttribute {
    /**
     * {@link BuildingAttrType} this object works with.
     */
    private final BuildingAttrType attrType;

    /**
     * Collection of all currently existing {@link Building}-s that have non-null (and not empty) value for
     * corresponding {@link BuildingAttrType}.
     * Stored per {@link ResType} being effected.
     * Cannot be null.
     * Cannot have null values: should use empty lists instead;
     */
    private ConcurrentHashMap<ResType, CopyOnWriteArrayList<Building>> buildings;
    /**
     * Sum of all resources in all buildings that have the given {@link BuildingAttrType} attribute.
     * Cumulates values from corresponding {@link CityAttribute#buildings} or, visa versa, distributes this total to
     * {@link CityAttribute#buildings} for usage or storage.
     */
    private ResPack total;

    public CityAttribute(BuildingAttrType attrType) {
        this.attrType = Objects.requireNonNull(attrType);
        initTotal();
        initBuildings();
    }

    public ConcurrentHashMap<ResType, CopyOnWriteArrayList<Building>> getBuildings() {
        return buildings;
    }

    public CopyOnWriteArrayList<Building> get(ResType type) {
        return buildings.get(Objects.requireNonNull(type));
    }

    public ResPack getTotal() {
        return total;
    }

    public void setTotal(ResPack total) {
        if (total == null) {
            initTotal();
            return;
        }
        this.total = total;
    }

    private void initTotal() {
        total = new ResPack();
        ResType[] resTypes = ResType.values();
        for (ResType type : resTypes) total.put(new ResChunk(type, 0d, Integer.MAX_VALUE));
    }

    public void calculateTotal() {
        initTotal();
        ResType[] resTypes = ResType.values();
        for (ResType type : resTypes) {
            buildings.get(type).forEach(building -> {
                BuildingAttribute attribute = building.get(attrType);
                if (attribute == null) return;
                total.add(type, building.get(attrType).getCurrent(type));
            });
        }
    }

    private void initBuildings() {
        buildings = new ConcurrentHashMap<>();
        ResType[] resTypes = ResType.values();
        for (ResType type : resTypes) buildings.put(type, new CopyOnWriteArrayList<>());
    }

    public void register(Building building) {
        if (building == null) return;
        BuildingAttribute attribute = building.get(attrType);
        if (attribute == null) return;
        attribute.pack.forEach((resType, resChunk) -> {
            if (resChunk == null || resChunk.getMax() <= 0) return;
            if (buildings.get(resType).contains(building)) return;
            buildings.get(resType).add(building);
        });
    }

    public void delist(Building building) {
        if (building == null) return;
        BuildingAttribute attribute = building.get(attrType);
        if (attribute == null) return;
        attribute.pack.forEach((resType, resChunk) -> buildings.get(resType).remove(building));
    }
}