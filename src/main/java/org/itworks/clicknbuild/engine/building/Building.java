package org.itworks.clicknbuild.engine.building;

import com.google.common.util.concurrent.AtomicDouble;
import org.itworks.clicknbuild.config.stats.BuildingDefStats;
import org.itworks.clicknbuild.config.stats.BuildingDefaults;
import org.itworks.clicknbuild.config.stats.ResStat;
import org.itworks.clicknbuild.engine.city.Location;
import org.itworks.clicknbuild.engine.city.ResManager;
import org.itworks.clicknbuild.engine.profile.Difficulty;
import org.itworks.clicknbuild.engine.res.ResPack;
import org.itworks.clicknbuild.engine.res.ResType;
import org.itworks.clicknbuild.util.math.MathHelper;

import java.util.Objects;
import java.util.concurrent.ConcurrentSkipListMap;

public final class Building {
    /**
     * {@link BuildingType} of this building.
     * Contains a link to corresponding {@link BuildingDefaults} object.
     * Cannot be changed.
     */
    public final BuildingType type;

    /**
     * A map containing a {@link BuildingAttribute} object for all possible {@link BuildingAttrType}-s.
     * Cannot be null.
     * <b>Always</b> must have a value for each possible {@link BuildingAttrType}.
     * A value corresponding to a {@link BuildingAttrType} is not null as well, but could be an empty
     * {@link BuildingAttribute}.
     * </p>
     * </p>
     * <b>Attributes and their meaning:</b>
     * <b>BUILD_COST</b>
     * Cumulative cost to construct a building of this type.
     * Not used in this class. Would always an empty {@link BuildingAttribute}.
     * Actual building costs are taken from corresponding attribute of {@link BuildingDefStats} object.
     * <b>PRODUCTION</b>
     * Amount of resources this building currently produce per hour.
     * Current value shows actual production affected by {@link Building#productivity}.
     * Max value shows max possible production at 100% productivity all else being equal.
     * Both values depend on corresponding <code>PRODUCTION_MUL</code>-s, building {@link Building#level} and
     * current {@link Difficulty}.
     * </p>
     * <b>PRODUCTION_MUL</b>
     * Some buildings could provide global effects on production amounts.
     * The production of resources of this resource type would be increased by given percent in all buildings
     * producing this resource type.
     * Current value shows actual bonuses provided to the city. Affected by current building
     * {@link Building#productivity}.
     * Max value shows max possible bonus to provide when an 100% productivity all else being equal.
     * Both values depend on corresponding {@link Building#level} and current {@link Difficulty}.
     * </p>
     * <b>JOB_PRICE</b>
     * Amount of resources taken from the player to get the corresponding <code>JOB_REWARD</code> for completing a
     * "production intensification" job.
     * Current value always equals to its max.
     * Both values are immutable through time (affected only by {@link Difficulty} and building {@link Building#level})
     * until the building itself is changed (constructed / upgraded / destroyed).
     * </p>
     * <b>JOB_REWARD</b>
     * Amount of resources granted to the player for completing a "production intensification" job in this building.
     * Current value shows actual reward affected by current building {@link Building#productivity}.
     * Max value shows max possible reward at 100% productivity all else being equal.
     * Both values depend on corresponding <code>JOB_REWARD_MUL</code>-s, building {@link Building#level} and
     * current {@link Difficulty}.
     * </p>
     * <b>JOB_REWARD_MUL</b>
     * Some buildings could provide global effects on job rewards.
     * The <code>JOB_REWARD</code> of this resource type would be increased by given percent in all buildings
     * granting rewards of this resource type.
     * Current value shows actual bonuses provided to the city. Affected by current building
     * {@link Building#productivity}.
     * Max value shows max possible bonus to provide when an 100% productivity all else being equal.
     * Both values depend on corresponding {@link Building#level} and current {@link Difficulty}.
     * </p>
     * <b>SUPPLY</b>
     * Amount of resources constantly supplied by this building.
     * Those resources are not collected or stored in some kind of warehouse.
     * Neither they are spent for any construction.
     * Instead they are "reserved" (used) at some level by most of other building allowing them to operate.
     * Currently, {@link ResType#POWER} is the only resource type with such behavior.
     * Current value shows actual supply generation affected by current building {@link Building#productivity}.
     * Max value shows max possible supply generation at 100% productivity all else being equal.
     * Both values depend on corresponding <code>SUPPLY_MUL</code>-s, building {@link Building#level} and
     * current {@link Difficulty}.
     * </p>
     * <b>SUPPLY_MUL</b>
     * Some buildings could provide global effects on <code>SUPPLY</code> generation.
     * The supply generation of this resource type would be increased by given percent in all buildings supplying this
     * resource type.
     * Current value shows actual bonuses provided to the city. Affected by current building
     * {@link Building#productivity}.
     * Max value shows max possible bonus to provide when an 100% productivity all else being equal.
     * Both values depend on corresponding {@link Building#level} and current {@link Difficulty}.
     * </p>
     * <b>DEMAND</b>
     * Amount of resources required for this building to operate.
     * Current value always equals to its max.
     * Both values are immutable through time (affected only by {@link Difficulty} and building {@link Building#level})
     * until the building itself is changed (constructed / upgraded / destroyed).
     * </p>
     * <b>HOLD</b>
     * Amount of supplement resources "reserved" (used) by this building to operate if any provided.
     * Current value shows actual supply provided to the building. Directly affects current building's
     * {@link Building#productivity}.
     * Max value shows the total needs of this building to operate at 100% productivity (not taking into consideration
     * the current criminal level in the city).
     * Max value is immutable through time (affected only by {@link Difficulty} and building {@link Building#level})
     * until the building itself is changed (constructed / upgraded / destroyed).
     * </p>
     * <b>STORE</b>
     * Amount of <code>PRODUCTION</code> resources currently stored in this building.
     * Commonly, one building produces a resource, another - stores it.
     * Current value shows actual amount of resources provided by the city and stored in this building.
     * Max value shows the current max storage capacity - total amount of resources this building can currently keep.
     * Max value always equal to corresponding current value of <code>CAPACITY</code> attribute.
     * </p>
     * <b>CAPACITY</b>
     * Amount of <code>PRODUCTION</code> resources this building can store.
     * Current value shows the actual storage capacity affected by current building's {@link Building#productivity}.
     * Max value shows the max possible storage capacity at 100% productivity all else being equal.
     * Both values depend on corresponding <code>CAPACITY_MUL</code>-s, building {@link Building#level} and
     * current {@link Difficulty}.
     * </p>
     * <b>CAPACITY_MUL</b>
     * Some buildings could provide global effects on storage capacities.
     * The storage capacity of this resource type would be increased by given percent in all buildings storing this
     * resource type.
     * Current value shows actual bonuses provided to the city. Affected by current building's {
     *
     * @link Building#productivity}.
     * Max value shows max possible bonus to provide when an 100% productivity all else being equal.
     * Both values depend on corresponding {@link Building#level} and current {@link Difficulty}.
     */
    private final ConcurrentSkipListMap<BuildingAttrType, BuildingAttribute> attributes = new ConcurrentSkipListMap<>();

    /**
     * Building coordinates on the map.
     */
    private Location location;

    /**
     * Ordinal number of this typed building being construct.
     */
    private int ordinal;

    /**
     * Current level of this building.
     * Cannot be less than 1 and cannot be higher than corresponding {@link BuildingDefaults#getMaxLevel()}.
     * Can only increment by 1;
     */
    private int level = 1;

    /**
     * Amount of player experience earned while building and upgrading this building.
     * Used to properly subtract this value from overall player experience when this building is demolished or
     * destroyed.
     */
    private ResStat expEarned;

    /**
     * Current production efficiency of this building (in percents).
     * Depends on criminal level in the city, and on satisfying this building needs (like power and workers).
     * Cannot be less than 0.0 and higher than 100.0.
     */
    private AtomicDouble productivity;

    private Building(BuildingType type) {
        this.type = Objects.requireNonNull(type);
    }

    public static Building of(BuildingType type, int level) {
        return new Building(type).init().initValues(level);
    }

    public static Building of(BuildingType type) {
        return of(type, 1);
    }

    private Building init() {
        setExpEarned(new ResStat(ResType.EXPERIENCE));
        setProductivity(100d);
        attributes.put(BuildingAttrType.PRODUCTION, new Production());
        attributes.put(BuildingAttrType.PRODUCTION_MUL, new ProductionMul());
        attributes.put(BuildingAttrType.JOB_PRICE, new JobPrice());
        attributes.put(BuildingAttrType.JOB_REWARD, new JobReward());
        attributes.put(BuildingAttrType.JOB_REWARD_MUL, new JobRewardMul());
        attributes.put(BuildingAttrType.SUPPLY, new Supply());
        attributes.put(BuildingAttrType.SUPPLY_MUL, new SupplyMul());
        attributes.put(BuildingAttrType.DEMAND, new Demand());
        attributes.put(BuildingAttrType.HOLD, new Hold());
        attributes.put(BuildingAttrType.STORE, new Store());
        attributes.put(BuildingAttrType.CAPACITY, new Capacity());
        attributes.put(BuildingAttrType.CAPACITY_MUL, new CapacityMul());
        ((Capacity) attributes.get(BuildingAttrType.CAPACITY)).bind(((Store) attributes.get(BuildingAttrType.STORE)));
        return this;
    }

    private Building initValues(int level) {
        attributes.values().forEach(buildingAttribute -> buildingAttribute.initValues(type, level));
        setLevel(level);
        return this;
    }

    public int getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(int ordinal) {
        this.ordinal = MathHelper.clamp(ordinal);
    }

    public int getLevel() {
        return level;
    }

    private void setLevel(int level) {
        this.level = MathHelper.clamp(level, 1, type.stats.getMaxLevel());
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = Objects.requireNonNull(location);
    }

    public void setLocation(int row, int col) {
        setLocation(new Location(row, col));
    }

    public ResStat getExpEarned() {
        return expEarned;
    }

    private void setExpEarned(ResStat expEarned) {
        this.expEarned = expEarned == null ? new ResStat(ResType.EXPERIENCE) : expEarned;
    }

    public double getProductivity() {
        return productivity.get();
    }

    private void setProductivity(double value) {
        if (productivity == null) productivity = new AtomicDouble(0);
        productivity.set(MathHelper.clamp(value, 0d, 100d));
    }

    public BuildingAttribute get(BuildingAttrType type) {
        return attributes.get(Objects.requireNonNull(type));
    }

    private void put(BuildingAttrType type, BuildingAttribute value) {
        attributes.put(Objects.requireNonNull(type), Objects.requireNonNull(value));
    }

    private void addExpEarned(double amount) {
        expEarned.add(amount);
    }

    public void calculateProductivity() {
        if (type == BuildingType.HEADQUARTER) return;
        double productivity = 100d;
        productivity *= 1 - ResManager.inst().getCrimeLevel() / 100d;
        ResPack hold = get(BuildingAttrType.HOLD);
        if (hold != null) {
            for (ResType type : hold.pack.keySet()) {
                if (hold.getMax(type) == 0) continue;
                productivity *= hold.getCurrent(type) / hold.getMax(type);
            }
        }
        setProductivity(productivity);
        applyProductivity();
    }

    public void applyProductivity() {
        attributes.forEach((buildingAttrType, buildingAttribute) ->
                buildingAttribute.applyProductivity(getProductivity()));
    }

    public void applyMultipliers(BuildingAttrType attrType, ResPack multipliers) {
        if (attrType == null || multipliers == null) return;
        BuildingAttribute attribute = get(attrType);
        if (attribute == null) return;
        attribute.applyMultipliers(multipliers);
        applyProductivity();
    }
}
