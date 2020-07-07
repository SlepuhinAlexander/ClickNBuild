package org.itworks.clicknbuild.engine.model;

import com.google.common.util.concurrent.AtomicDouble;
import org.itworks.clicknbuild.config.stats.BuildingDefaults;
import org.itworks.clicknbuild.config.stats.ResStat;
import org.itworks.clicknbuild.engine.Difficulty;
import org.itworks.clicknbuild.engine.ProfileManager;
import org.itworks.clicknbuild.engine.ResCalculator;
import org.itworks.clicknbuild.engine.ResManager;
import org.itworks.clicknbuild.util.math.MathHelper;

import java.util.Objects;

public final class Building {
    /**
     * {@link BuildingType} of this building.
     * Contains a link to corresponding {@link BuildingDefaults} object.
     * Cannot be changed.
     */
    public final BuildingType type;

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

    /**
     * Amount of resources this building currently produce per hour.
     * Current value shows actual production affected by productivity.
     * Max value shows max possible production at 100% productivity all else being equal.
     * Both values depend on corresponding {@link Building#productionMultiplier}-s, building {@link Building#level} and
     * current {@link Difficulty}.
     */
    private ResPack production;

    /**
     * Some buildings could provide global effects on production amounts.
     * The production of resources of this resource type would be increased by given percent in all buildings
     * producing this resource type.
     * Current value shows actual bonuses provided to the city. Affected by productivity.
     * Max value shows max possible bonus to provide when an 100% productivity all else being equal.
     * Both values depend on corresponding {@link Building#level} and current {@link Difficulty}.
     */
    private ResPack productionMultiplier;

    /**
     * Amount of resources taken from the player to get the corresponding {@link Building#jobReward} for completing a
     * "production intensification" job.
     * Current value always equals to its max.
     * Both values are immutable through time (affected only by {@link Difficulty} and building {@link Building#level})
     * until the building itself is changed (constructed / upgraded / destroyed).
     */
    private ResPack jobPrice;


    /**
     * Amount of resources granted to the player for completing a "production intensification" job in this building.
     * Current value shows actual reward affected by current building productivity.
     * Max value shows max possible reward at 100% productivity all else being equal.
     * Both values depend on corresponding {@link Building#jobRewardMultiplier}-s, building {@link Building#level} and
     * current {@link Difficulty}.
     */
    private ResPack jobReward;

    /**
     * Some buildings could provide global effects on job rewards.
     * The {@link Building#jobReward} of this resource type would be increased by given percent in all buildings
     * granting rewards of this resource type.
     * Current value shows actual bonuses provided to the city. Affected by productivity.
     * Max value shows max possible bonus to provide when an 100% productivity all else being equal.
     * Both values depend on corresponding {@link Building#level} and current {@link Difficulty}.
     */
    private ResPack jobRewardMultiplier;

    /**
     * Amount of resources constantly produced by this building. Those resources are not collected or stored in some
     * kind of warehouse. Neither they are spent for any construction. Instead they are "reserved" (used) at some level
     * by most of other building allowing them to operate.
     * Currently, {@link ResType#POWER} is the only resource type with such behavior.
     * Current value shows actual supply generation affected by current building productivity.
     * Max value shows max possible supply generation at 100% productivity all else being equal.
     * Both values depend on corresponding {@link Building#supplyMultiplier}-s, building {@link Building#level} and
     * current {@link Difficulty}.
     */
    private ResPack supply;

    /**
     * Some buildings could provide global effects on supply generation.
     * The {@link Building#supply} generation of this resource type would be increased by given percent in all
     * buildings supplying this resource type.
     * Current value shows actual bonuses provided to the city. Affected by productivity.
     * Max value shows max possible bonus to provide when an 100% productivity all else being equal.
     * Both values depend on corresponding {@link Building#level} and current {@link Difficulty}.
     */
    private ResPack supplyMultiplier;

    /**
     * Amount of resources required for this building to operate.
     * Current value always equals to its max.
     * Both values are immutable through time (affected only by {@link Difficulty} and building {@link Building#level})
     * until the building itself is changed (constructed / upgraded / destroyed).
     */
    private ResPack demand;

    /**
     * Amount of supplement resources "reserved" (used) by this building to operate if any provided.
     * Current value shows actual supply provided to the building. Directly affects current building
     * {@link Building#productivity}.
     * Max value shows the total needs of the building to operate at 100% productivity (not taking into consideration
     * the current criminal level in the city).
     * Max value is immutable through time (affected only by {@link Difficulty} and building {@link Building#level})
     * until the building itself is changed (constructed / upgraded / destroyed).
     */
    private ResPack hold;

    /**
     * Amount of {@link Building#production} resources currently stored in this building. Commonly, one building
     * produces a resource, another - stores it.
     * Current value shows actual amount of resources provided by the city and stored in this building.
     * Max value shows the current max storage capacity - total amount of resources this building can currently keep.
     * Max value always equal to corresponding current value of {@link Building#capacity} parameter.
     */
    private ResPack store;

    /**
     * Amount of {@link Building#production} resources this building can store.
     * Current value shows the actual storage capacity affected by productivity.
     * Max value shows the max possible storage capacity at 100% productivity all else being equal.
     * Both values depend on corresponding {@link Building#capacityMultiplier}-s, building {@link Building#level} and
     * current {@link Difficulty}.
     */
    private ResPack capacity;

    /**
     * Some buildings could provide global effects on storage capacity.
     * The storage capacity of this resource type would be increased by given percent in all buildings storing this
     * resource type.
     * Current value shows actual bonuses provided to the city. Affected by productivity.
     * Max value shows max possible bonus to provide when an 100% productivity all else being equal.
     * Both values depend on corresponding {@link Building#level} and current {@link Difficulty}.
     */
    private ResPack capacityMultiplier;

    private Building(BuildingType type) {
        this.type = Objects.requireNonNull(type);
    }

    public static Building of(BuildingType type, int level) {
        return new Building(type).initValues(level);
    }

    public static Building of(BuildingType type) {
        return of(type, 1);
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

    public ResPack getProduction() {
        return production;
    }

    private void setProduction(ResPack production) {
        this.production = production == null ? new ResPack() : production;
    }

    public ResPack getProductionMultiplier() {
        return productionMultiplier;
    }

    private void setProductionMultiplier(ResPack productionMultiplier) {
        this.productionMultiplier = productionMultiplier == null ? new ResPack() : productionMultiplier;
    }

    public ResPack getJobPrice() {
        return jobPrice;
    }

    private void setJobPrice(ResPack jobPrice) {
        this.jobPrice = jobPrice == null ? new ResPack() : jobPrice;
    }

    public ResPack getJobReward() {
        return jobReward;
    }

    private void setJobReward(ResPack jobReward) {
        this.jobReward = jobReward == null ? new ResPack() : jobReward;
    }

    public ResPack getJobRewardMultiplier() {
        return jobRewardMultiplier;
    }

    private void setJobRewardMultiplier(ResPack jobRewardMultiplier) {
        this.jobRewardMultiplier = jobRewardMultiplier == null ? new ResPack() : jobRewardMultiplier;
    }

    public ResPack getSupply() {
        return supply;
    }

    private void setSupply(ResPack supply) {
        this.supply = supply == null ? new ResPack() : supply;
    }

    public ResPack getSupplyMultiplier() {
        return supplyMultiplier;
    }

    private void setSupplyMultiplier(ResPack supplyMultiplier) {
        this.supplyMultiplier = supplyMultiplier == null ? new ResPack() : supplyMultiplier;
    }

    public ResPack getDemand() {
        return demand;
    }

    private void setDemand(ResPack demand) {
        this.demand = demand == null ? new ResPack() : demand;
    }

    public ResPack getHold() {
        return hold;
    }

    private void setHold(ResPack hold) {
        this.hold = hold == null ? new ResPack() : hold;
    }

    public ResPack getStore() {
        return store;
    }

    private void setStore(ResPack store) {
        this.store = store == null ? new ResPack() : store;
    }

    public ResPack getCapacity() {
        return capacity;
    }

    private void setCapacity(ResPack capacity) {
        this.capacity = capacity == null ? new ResPack() : capacity;
    }

    public ResPack getCapacityMultiplier() {
        return capacityMultiplier;
    }

    private void setCapacityMultiplier(ResPack capacityMultiplier) {
        this.capacityMultiplier = capacityMultiplier == null ? new ResPack() : capacityMultiplier;
    }

    private void addExpEarned(double amount) {
        expEarned.add(amount);
    }

    public void calculateProductivity() {
        //TODO implement

        // needs taking into account the criminal level from outside.
        applyProductivity();
    }

    public void applyProductivity() {
        //TODO implement
    }

    public void applyProductionMultipliers() {
        Difficulty difficulty = ProfileManager.inst().getProfile().getPreferences().getDifficulty();
        ResPack totalProductionMultiplier = ResManager.inst().getTotalProductionMultiplier();
        production.pack.keySet().forEach(resType -> production.get(resType).setMax(
                type.stats.getStats()[getLevel() - 1].get(BuildingAttrType.PRODUCTION).get(resType) *
                difficulty.gainsMultiplier *
                (1 + totalProductionMultiplier.getCurrent(resType) / 100d)
        ));
    }

    public void applyJobRewardMultipliers() {
        Difficulty difficulty = ProfileManager.inst().getProfile().getPreferences().getDifficulty();
        ResPack totalJobRewardMultiplier = ResManager.inst().getTotalJobRewardMultiplier();
        jobReward.pack.keySet().forEach(resType -> jobReward.get(resType).setMax(
                type.stats.getStats()[getLevel() - 1].get(BuildingAttrType.JOB_REWARD).get(resType) *
                difficulty.gainsMultiplier *
                (1 + totalJobRewardMultiplier.getCurrent(resType) / 100d)
        ));
    }

    public void applySupplyMultipliers() {
        Difficulty difficulty = ProfileManager.inst().getProfile().getPreferences().getDifficulty();
        ResPack totalSupplyMultiplier = ResManager.inst().getTotalSupplyMultiplier();
        supply.pack.keySet().forEach(resType -> production.get(resType).setMax(
                type.stats.getStats()[getLevel() - 1].get(BuildingAttrType.SUPPLY).get(resType) *
                difficulty.gainsMultiplier *
                (1 + totalSupplyMultiplier.getCurrent(resType) / 100d)
        ));
    }

    private Building initValues(int level) {
        Difficulty difficulty = ProfileManager.inst().getProfile().getPreferences().getDifficulty();
        setLevel(level);
        setExpEarned(new ResStat(ResType.EXPERIENCE));
        setProductivity(0d);
        setProduction(ResCalculator.toResPack(
                ResCalculator.mul(type.stats.getStats()[getLevel() - 1].get(BuildingAttrType.PRODUCTION),
                        difficulty.gainsMultiplier), getProductivity()));
        setProductionMultiplier(ResCalculator.toResPack(
                ResCalculator.mul(type.stats.getStats()[getLevel() - 1].get(BuildingAttrType.PRODUCTION_MUL),
                        difficulty.gainsMultiplier), getProductivity()));
        setJobPrice(ResCalculator.toResPack(
                ResCalculator.mul(type.stats.getStats()[getLevel() - 1].get(BuildingAttrType.JOB_PRICE),
                        difficulty.costsMultiplier)));
        setJobReward(ResCalculator.toResPack(
                ResCalculator.mul(type.stats.getStats()[getLevel() - 1].get(BuildingAttrType.JOB_REWARD),
                        difficulty.gainsMultiplier), getProductivity()));
        setJobRewardMultiplier(ResCalculator.toResPack(
                ResCalculator.mul(type.stats.getStats()[getLevel() - 1].get(BuildingAttrType.JOB_REWARD_MUL),
                        difficulty.gainsMultiplier), getProductivity()));
        setSupply(ResCalculator.toResPack(
                ResCalculator.mul(type.stats.getStats()[getLevel() - 1].get(BuildingAttrType.SUPPLY),
                        difficulty.gainsMultiplier), getProductivity()));
        setSupplyMultiplier(ResCalculator.toResPack(
                ResCalculator.mul(type.stats.getStats()[getLevel() - 1].get(BuildingAttrType.SUPPLY_MUL),
                        difficulty.gainsMultiplier), getProductivity()));
        setDemand(ResCalculator.toResPack(
                ResCalculator.mul(type.stats.getStats()[getLevel() - 1].get(BuildingAttrType.DEMAND),
                        difficulty.costsMultiplier)));
        setHold(ResCalculator.toResPack(
                ResCalculator.mul(type.stats.getStats()[getLevel() - 1].get(BuildingAttrType.HOLD),
                        difficulty.costsMultiplier), 0));
        setCapacity(ResCalculator.toResPack(
                ResCalculator.mul(type.stats.getStats()[getLevel() - 1].get(BuildingAttrType.CAPACITY),
                        difficulty.gainsMultiplier), getProductivity()));
        setCapacityMultiplier(ResCalculator.toResPack(
                ResCalculator.mul(type.stats.getStats()[getLevel() - 1].get(BuildingAttrType.CAPACITY_MUL),
                        difficulty.gainsMultiplier), getProductivity()));
        setStore(ResCalculator.resPackMaxedBy(getCapacity()));
        return this;
    }
}
