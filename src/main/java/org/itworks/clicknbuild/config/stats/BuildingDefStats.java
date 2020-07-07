package org.itworks.clicknbuild.config.stats;

import org.itworks.clicknbuild.engine.model.Building;
import org.itworks.clicknbuild.engine.model.BuildingAttrType;
import org.itworks.clicknbuild.engine.model.ResType;
import org.itworks.clicknbuild.util.math.MathHelper;

import java.util.Arrays;
import java.util.Objects;
import java.util.TreeMap;

/**
 * Aggregation of all possible {@link BuildingDefAttr}-es that a building might have at some its level.
 * Represented by a map containing a {@link BuildingDefAttr} object for each possible {@link BuildingAttrType}.
 * Further aggregated in {@link BuildingDefaults}.
 * Non-nullable: null <code>BuildingDefStats</code> does not make any sense.
 */
public final class BuildingDefStats {

    /**
     * One more building defaults attribute which is not a {@link ResStatPack}.
     * Amount of hitPoints the building has at each its level.
     * Affects the amount of Experience points that player acquires when construction is done.
     * Cannot be negative.
     */
    private int structure;

    /**
     * A map containing a {@link BuildingDefAttr} object for all possible {@link BuildingAttrType}-s.
     * Cannot be null.
     * <b>Always</b> must have a value for each possible {@link BuildingAttrType}.
     * A value corresponding to a {@link BuildingAttrType} is allowed to be null though.
     * </p>
     * Further this maps are aggregated in an array at {@link BuildingDefaults#getStats()}
     * </p>
     * <b>Attributes and their meaning:</b>
     * <b>BUILD_COST</b>
     * Cumulative price to construct such building of such level.
     * </p>
     * Suppose the building has {@link BuildingDefaults#getMaxLevel()} = 3
     * {@link BuildingDefaults#getStats()} would be an array of size 3.
     * The initial construction of such building (1st level) would cost the amount of resources presented in
     * <code>BUILD_COST</code> attribute taken from {@link BuildingDefaults#getStats()} at index 0
     * The upgrade from level 1 to level 2 would cost <code>BUILD_COST</code> taken from
     * {@link BuildingDefaults#getStats()} at index 1 <b>minus</b> its analog taken at index 0.
     * The upgrade from level 2 to level 3 would cost resources at index 2 <b>minus</b> resources at index 1.
     * </p>
     * In other worlds, the <code>BUILD_COST</code> of {@link BuildingDefStats} at index n in
     * {@link BuildingDefaults#getStats()} shows how much resources needed to fully construct and upgrade a building of
     * this type from a scratch to the level n + 1.
     * </p>
     * Consider also that {@link BuildingDefaults#getCostMultiplier()} property multiplies these costs for subsequent
     * buildings of the same type.
     * </p>
     * <b>PRODUCTION</b>
     * Amount of resources produced by a building of this type at this construction level -- in an hour.
     * Steady idle production.
     * Directly affected by the building's {@link Building#getProductivity()}: these values correspond to 100%
     * productivity.
     * </p>
     * <b>PRODUCTION_MUL</b>
     * Some buildings could provide global effects on production amounts.
     * These values mean that the production of resources of this resource type would be increased by given percent in
     * all buildings producing this resource type.
     * Values correspond to current building's construction level.
     * Directly affected by the building's {@link Building#getProductivity()}: these values correspond to 100%
     * productivity.
     * </p>
     * <b>JOB_PRICE</b>
     * Amount of resources taken from the player to get the corresponding <code>JOB_REWARD</code> for completing a
     * "production intensification" job.
     * Values correspond to current building's construction level.
     * Not affected by the building's {@link Building#getProductivity()}.
     * </p>
     * <b>JOB_REWARD</b>
     * Amount of resources granted to the player for completing a "production intensification" job.
     * Values correspond to current building's construction level.
     * Directly affected by the building's productivity: these values correspond to 100% productivity.
     * </p>
     * <b>JOB_REWARD_MUL</b>
     * Some buildings could provide global effects on job rewards.
     * These values mean that the additional percent of given resource type would be provided as a "production
     * intensification" job reward in any building having reward of such resource type.
     * Values correspond to current building's construction level.
     * Directly affected by the building's {@link Building#getProductivity()}: these values correspond to 100%
     * productivity.
     * </p>
     * <b>SUPPLY</b>
     * Amount of supplement resources constantly provided by this building at this construction level.
     * Those resources are not collected or stored in some kind of warehouse.
     * Neither they are spent for some construction.
     * Instead they are reserved (used) by other buildings to be able to operate.
     * By default, the only {@link ResType} in this group is {@link ResType#POWER}
     * Directly affected by the building's {@link Building#getProductivity()}: these values correspond to 100%
     * productivity.
     * </p>
     * <b>SUPPLY_MUL</b>
     * Some buildings could provide global effects on supply amounts.
     * These values mean that the supply of resources of this resource type would be increased by given percent in all
     * buildings supplying this resource type.
     * Values correspond to current building's construction level.
     * Directly affected by the building's {@link Building#getProductivity()}: these values correspond to 100%
     * productivity.
     * </p>
     * <b>DEMAND</b>
     * Amount of supplement resources required for this building (at this construction level) to operate.
     * Constant value, depends only on building level.
     * Regardless of current building productivity it would always demand these resources, and consume what is
     * provided.
     * </p>
     * <b>HOLD</b>
     * Max capacity of supplement resources that could be consumed by this building (at this construction level) if any
     * provided.
     * Correspond to <b>DEMAND</b> attribute.
     * Constant value, depends only on building level.
     * Regardless of current building productivity, it would always demand these resources, and consume what is
     * provided.
     * </p>
     * <b>STORE</b>
     * Current amount of <b>PRODUCTION</b> resources stored in this building.
     * Not used in this class. Would always be null.
     * </p>
     * <b>CAPACITY</b>
     * Amount of <b>PRODUCTION</b> resources that could be stored in this building (at this construction level) for
     * future use.
     * Directly affected by the building's {@link Building#getProductivity()}: these values correspond to 100%
     * productivity.
     * </p>
     * <b>CAPACITY_MUL</b>
     * Some buildings could provide global effect on storage capacities.
     * These values mean that the capacity of resources of this resource type would be increased by given percent in
     * all buildings storing this resource type.
     * Values correspond to current building's construction level.
     * Directly affected by the building's {@link Building#getProductivity()}: these values correspond to 100%
     * productivity.
     */
    private TreeMap<BuildingAttrType, BuildingDefAttr> attributes = new TreeMap<>();

    public BuildingDefStats() {
        fillMissingAttributes();
    }

    public int getStructure() {
        return structure;
    }

    public void setStructure(int structure) {
        this.structure = MathHelper.clamp(structure);
    }

    public TreeMap<BuildingAttrType, BuildingDefAttr> getAttributes() {
        return attributes;
    }

    public void setAttributes(TreeMap<BuildingAttrType, BuildingDefAttr> attributes) {
        this.attributes = Objects.requireNonNull(attributes);
        fillMissingAttributes();
    }

    public BuildingDefAttr get(BuildingAttrType type) {
        return attributes.get(Objects.requireNonNull(type));
    }

    private void fillMissingAttributes() {
        Arrays.stream(BuildingAttrType.values()).forEach(type -> attributes.putIfAbsent(type, null));
    }

    public void put(BuildingAttrType key, BuildingDefAttr value) {
        attributes.put(Objects.requireNonNull(key), value);
    }
}
