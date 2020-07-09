package org.itworks.clicknbuild.engine.city;

import org.itworks.clicknbuild.engine.building.Building;
import org.itworks.clicknbuild.engine.building.BuildingAttrType;
import org.itworks.clicknbuild.engine.res.ResChunk;
import org.itworks.clicknbuild.engine.res.ResType;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentSkipListMap;

/**
 * Responsible for:
 * <ul>
 *     <li>storing cumulative sums of each resource being produced, supplied, used or stored in the entire city</li>
 *     <li>storing collections of {@link Building}-s per each resource being produced, supplied, used or stored</li>
 *     <li>calculating total resources production, usage, storage, etc. per each game tick and per each external
 *     update: (e.g. when player uses resources for construction, or when finishes a "production intensification"
 *     job)</li>
 *     <li>regular distribution of total supplement resources into consuming buildings</li>
 *     <li>regular distribution of resources into corresponding warehouses</li>
 * </ul>
 */
public final class ResManager {
    private static final int TICKS_PER_HOUR = 14400; // 4 ticks per second.

    private static volatile ResManager inst;

    /**
     *
     */
    private final ConcurrentSkipListMap<BuildingAttrType, CityAttribute> attributes = new ConcurrentSkipListMap<>();

    /**
     * Sum of all {@link Building#getExpEarned()} in all currently existing {@link Building}-s.
     * Stored in current value.
     * Max value is immutable and unlimited (big enough).
     */
    private ResChunk totalExpEarned;

    private ResManager() {
    }

    public static ResManager inst() {
        ResManager local = inst;
        if (local == null) {
            synchronized (ResManager.class) {
                local = inst;
                if (local == null) {
                    inst = local = new ResManager();
                    local.init();
                }
            }
        }
        return local;
    }

    private void init() {
        initTotalExpEarned();
        BuildingAttrType[] attrTypes = BuildingAttrType.values();
        for (BuildingAttrType attrType : attrTypes) {
            if (attrType.equals(BuildingAttrType.BUILD_COST) ||
                attrType.equals(BuildingAttrType.JOB_PRICE)) continue;
            put(attrType, new CityAttribute(attrType));
        }
    }

    public CityAttribute get(BuildingAttrType attrType) {
        return attrType == null ? null : attributes.get(attrType);
    }

    private void put(BuildingAttrType attrType, CityAttribute cityAttribute) {
        attributes.put(Objects.requireNonNull(attrType), Objects.requireNonNull(cityAttribute));
    }

    public ResChunk getTotalExpEarned() {
        return totalExpEarned;
    }

    public void setTotalExpEarned(ResChunk totalExpEarned) {
        if (totalExpEarned == null) {
            initTotalExpEarned();
            return;
        }
        this.totalExpEarned = totalExpEarned;
    }

    private void initTotalExpEarned() {
        this.totalExpEarned = new ResChunk(ResType.EXPERIENCE, 0d, Integer.MAX_VALUE);
    }

    public void calculateTotalExpEarned() {
        if (totalExpEarned == null) {
            initTotalExpEarned();
        } else {
            totalExpEarned.setCurrent(0d);
        }
        Collection<List<Building>> buildings = BuildingManager.inst().buildings.values();
        buildings.forEach(buildingsList -> buildingsList.forEach(building ->
                totalExpEarned.add(building.getExpEarned())));
    }

    public void addTotalExpEarned(double amount) {
        if (totalExpEarned == null) initTotalExpEarned();
        totalExpEarned.add(amount);
    }

    public void subTotalExpEarned(double amount) {
        if (totalExpEarned == null) initTotalExpEarned();
        totalExpEarned.sub(amount);
    }

    /**
     * Registers the given building to this ResManages.
     * Not registered buildings are unknown to the game.
     * While registering the building would be added in all {@link CityAttribute#getBuildings()} maps for each non-null
     * (and not-empty) building's {@link BuildingAttrType}.
     * Typically, a building is registered when its construction / upgrading is complete.
     */
    public void register(Building building) {
        if (building == null) return;
        BuildingAttrType[] attrTypes = BuildingAttrType.values();
        for (BuildingAttrType attrType : attrTypes) {
            CityAttribute cityAttribute = attributes.get(attrType);
            if (cityAttribute == null) continue;
            cityAttribute.register(building);
        }
    }

    /**
     * Removes the given building from registered buildings.
     * Typically, a building is delisted when it is destroyed.
     */
    public void delist(Building building) {
        if (building == null) return;
        BuildingAttrType[] attrTypes = BuildingAttrType.values();
        for (BuildingAttrType attrType : attrTypes) {
            CityAttribute cityAttribute = attributes.get(attrType);
            if (cityAttribute == null) continue;
            cityAttribute.delist(building);
        }
    }

    public void clearBuildings() {
        BuildingAttrType[] attrTypes = BuildingAttrType.values();
        for (BuildingAttrType attrType : attrTypes) {
            CityAttribute cityAttribute = attributes.get(attrType);
            if (cityAttribute == null) continue;
            cityAttribute.clear();
        }
    }
}
