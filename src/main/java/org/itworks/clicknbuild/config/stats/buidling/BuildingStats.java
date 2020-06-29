package org.itworks.clicknbuild.config.stats.buidling;

import org.itworks.clicknbuild.config.stats.model.BuildingStatsModel;
import org.itworks.clicknbuild.engine.model.ResStatPack;
import org.itworks.clicknbuild.util.math.M;

public abstract class BuildingStats {
    /**
     * Upper limit for <code>requiredPlayerLevel</code> param.
     */
    private static final int MAX_REQUIRED_PLAYER_LEVEL = 100;

    /**
     * Upper limit for <code>maxLevel</code> param.
     */
    private static final int MAX_ALLOWED_BUILDING_LEVEL = 100;

    /**
     * Upper limit for <code>buildLimit</code> param.
     */
    private static final int MAX_BUILD_LIMIT = 1000;

    /**
     * Upper limit for <code>priceMultiplier</code> param.
     */
    private static final int MAX_PRICE_MULTIPLIER = 1000;

    /**
     * Player must have at least this experience level to be able to construct buildings of this type.
     */
    private int requiredPlayerLevel = 1;

    /**
     * Amount of levels (upgrades) this type of building can have.
     * Building levels are counted form 1
     */
    private int maxLevel = 1;

    /**
     * How many buildings of this type are allowed to construct
     */
    private int buildLimit = 1;

    /**
     * Each subsequent building of this type costs this much higher to construct and upgrade.
     * </p>
     * E.g. the <code>priceMultiplier</code> equals 115:
     * First building of this type would cost exactly the values taken from the <code>buildCost</code> property.
     * The second building of this type would proportionally cost x1.15 times more.
     * The third one would be x1.3225 (= 1.15 ^ 2) times more expensive.
     * And so on.
     */
    private int priceMultiplier = 100;

    /**
     * Amount of hitPoints the building has at each its level.
     * Affects the amount of Experience points that player acquires when construction is done.
     */
    private int[] structure;

    /**
     * Cumulative prices to construct such building of such level.
     * </p>
     * Suppose the building has <code>maxLevel = 3</code>.
     * This property must have the same amount of values (array length = 3).
     * The initial construction of such building (1st level) would cost the amount of resources at index 0 in this
     * array.
     * The upgrade from level 1 to level 2 would cost resources at index 1 <b>minus</b> resources at index 0.
     * The upgrade from level 2 to level 3 would cost resources at index 2 <b>minus</b> resources at index 1.
     * </p>
     * In other worlds, the value at index n shows how much resources needed to construct and upgrade a building of
     * this type from a scratch to the level n + 1.
     * </p>
     * Consider also that <code>priceMultiplier</code> property multiplies these costs for subsequent buildings of the
     * same type.
     */
    private ResStatPack[] buildCost;

    /**
     * Amount of resources produced by a building of this type in an hour. Steady idle production.
     * Ranged by building level correspondingly.
     * Directly affected by the building's productivity: these values correspond to 100% productivity.
     */
    private ResStatPack[] production;

    /**
     * Some buildings could provide global effects on production amounts.
     * These values mean that the production of resources of this resource type would be increased by given percent in
     * all buildings producing this resource type.
     * Values are ranged by building level correspondingly.
     * Directly affected by the building's productivity: these values correspond to 100% productivity.
     */
    private ResStatPack[] productionMultiplier;

    /**
     * Amount of resources taken from the player to get the corresponding <code>jobReward</code> for completing a
     * "production intensification" job.
     * Ranged by building level correspondingly.
     * Not affected by the building's productivity.
     */
    private ResStatPack[] jobPrice;

    /**
     * Amount of resources granted to the player for completing a "production intensification" job.
     * Ranged by building level correspondingly.
     * Directly affected by the building's productivity: these values correspond to 100% productivity.
     */
    private ResStatPack[] jobReward;

    /**
     * Some buildings could provide global effects on job rewards.
     * These values mean that the additional percent of given resource type would be provided as a "production
     * intensification" job reward in any building having reward of such resource type.
     * Ranged by building level correspondingly.
     * Directly affected by the building's productivity: these values correspond to 100% productivity.
     */
    private ResStatPack[] jobRewardMultiplier;

    /**
     * Amount of supplement resources constantly provided by this building. Those resources are not collected or stored
     * in some kind of warehouse. Neither they are spent for some construction.
     * Values are ranged by building level correspondingly.
     * Directly affected by the building's productivity: these values correspond to 100% productivity.
     */
    private ResStatPack[] supply;

    /**
     * Some buildings could provide global effects on supply amounts.
     * These values mean that the supply of resources of this resource type would be increased by given percent in all
     * buildings supplying this resource type.
     * Values are ranged by building level correspondingly.
     * Directly affected by the building's productivity: these values correspond to 100% productivity.
     */
    private ResStatPack[] supplyMultiplier;

    /**
     * Amount of supplement resources required for this building to operate.
     * Constant value, depends only on building level: values are ranged by building level correspondingly.
     * Regardless of condition, the building would always demand these resources and consume what is provided to it.
     */
    private ResStatPack[] demand;

    /**
     * Amount of supplement resources consumed by this building if any provided.
     * Constant value, depends only on building level: values are ranged by building level correspondingly.
     * Regardless of condition, the building would always demand these resources and consume what is provided to it.
     */
    private ResStatPack[] hold;

    /**
     * Amount of resources that could be stored in this building for future use.
     * Values are ranged by building level correspondingly.
     * Directly affected by the building's productivity: these values correspond to 100% productivity.
     */
    private ResStatPack[] store;

    /**
     * Some buildings could provide global effect on storage amount.
     * These values mean that the store of resources of this resource type would be increase by given percent in all
     * buildings storing this resource type.
     * Values are ranged by the building's productivity: these values correspond to 100% productivity.
     */
    private ResStatPack[] storeMultiplier;

    public final int getRequiredPlayerLevel() {
        return requiredPlayerLevel;
    }

    public final void setRequiredPlayerLevel(int requiredPlayerLevel) {
        this.requiredPlayerLevel = M.clamp(requiredPlayerLevel, 1, MAX_REQUIRED_PLAYER_LEVEL);
    }

    public final int getMaxLevel() {
        return maxLevel;
    }

    public final void setMaxLevel(int maxLevel) {
        int clamped = M.clamp(maxLevel, 1, MAX_ALLOWED_BUILDING_LEVEL);
        if (this.maxLevel == clamped && this.structure != null && this.structure.length == this.maxLevel) return;
        this.maxLevel = clamped;
        initArrays();
    }

    public final int getBuildLimit() {
        return buildLimit;
    }

    public final void setBuildLimit(int buildLimit) {
        this.buildLimit = M.clamp(buildLimit, 1, MAX_BUILD_LIMIT);
    }

    public final int getPriceMultiplier() {
        return priceMultiplier;
    }

    public final void setPriceMultiplier(int priceMultiplier) {
        this.priceMultiplier = M.clamp(priceMultiplier, MAX_PRICE_MULTIPLIER);
    }

    public final int[] getStructure() {
        return structure;
    }

    public final void setStructure(int[] structure) {
        if (structure == null) {
            this.structure = new int[maxLevel];
            return;
        }
        if (structure.length != maxLevel) return;
        this.structure = structure;
    }

    public final ResStatPack[] getBuildCost() {
        return buildCost;
    }

    public final void setBuildCost(ResStatPack[] buildCost) {
        if (buildCost == null) {
            this.buildCost = new ResStatPack[maxLevel];
            return;
        }
        if (buildCost.length != maxLevel) return;
        this.buildCost = buildCost;
    }

    public final ResStatPack[] getProduction() {
        return production;
    }

    public final void setProduction(ResStatPack[] production) {
        if (production == null) {
            this.production = new ResStatPack[maxLevel];
            return;
        }
        if (production.length != maxLevel) return;
        this.production = production;
    }

    public final ResStatPack[] getProductionMultiplier() {
        return productionMultiplier;
    }

    public final void setProductionMultiplier(ResStatPack[] productionMultiplier) {
        if (productionMultiplier == null) {
            this.productionMultiplier = new ResStatPack[maxLevel];
            return;
        }
        if (productionMultiplier.length != maxLevel) return;
        this.productionMultiplier = productionMultiplier;
    }

    public final ResStatPack[] getJobPrice() {
        return jobPrice;
    }

    public final void setJobPrice(ResStatPack[] jobPrice) {
        if (jobPrice == null) {
            this.jobPrice = new ResStatPack[maxLevel];
            return;
        }
        if (jobPrice.length != maxLevel) return;
        this.jobPrice = jobPrice;
    }

    public final ResStatPack[] getJobReward() {
        return jobReward;
    }

    public final void setJobReward(ResStatPack[] jobReward) {
        if (jobReward == null) {
            this.jobReward = new ResStatPack[maxLevel];
            return;
        }
        if (jobReward.length != maxLevel) return;
        this.jobReward = jobReward;
    }

    public final ResStatPack[] getJobRewardMultiplier() {
        return jobRewardMultiplier;
    }

    public final void setJobRewardMultiplier(ResStatPack[] jobRewardMultiplier) {
        if (jobRewardMultiplier == null) {
            this.jobRewardMultiplier = new ResStatPack[maxLevel];
            return;
        }
        if (jobRewardMultiplier.length != maxLevel) return;
        this.jobRewardMultiplier = jobRewardMultiplier;
    }

    public final ResStatPack[] getSupply() {
        return supply;
    }

    public final void setSupply(ResStatPack[] supply) {
        if (supply == null) {
            this.supply = new ResStatPack[maxLevel];
            return;
        }
        if (supply.length != maxLevel) return;
        this.supply = supply;
    }

    public final ResStatPack[] getSupplyMultiplier() {
        return supplyMultiplier;
    }

    public final void setSupplyMultiplier(ResStatPack[] supplyMultiplier) {
        if (supplyMultiplier == null) {
            this.supplyMultiplier = new ResStatPack[maxLevel];
            return;
        }
        if (supplyMultiplier.length != maxLevel) return;
        this.supplyMultiplier = supplyMultiplier;
    }

    public final ResStatPack[] getDemand() {
        return demand;
    }

    public final void setDemand(ResStatPack[] demand) {
        if (demand == null) {
            this.demand = new ResStatPack[maxLevel];
            return;
        }
        if (demand.length != maxLevel) return;
        this.demand = demand;
    }

    public final ResStatPack[] getHold() {
        return hold;
    }

    public final void setHold(ResStatPack[] hold) {
        if (hold == null) {
            this.hold = new ResStatPack[maxLevel];
            return;
        }
        if (hold.length != maxLevel) return;
        this.hold = hold;
    }

    public final ResStatPack[] getStore() {
        return store;
    }

    public final void setStore(ResStatPack[] store) {
        if (store == null) {
            this.store = new ResStatPack[maxLevel];
            return;
        }
        if (store.length != maxLevel) return;
        this.store = store;
    }

    public final ResStatPack[] getStoreMultiplier() {
        return storeMultiplier;
    }

    public final void setStoreMultiplier(ResStatPack[] storeMultiplier) {
        if (storeMultiplier == null) {
            this.storeMultiplier = new ResStatPack[maxLevel];
            return;
        }
        if (storeMultiplier.length != maxLevel) return;
        this.storeMultiplier = storeMultiplier;
    }

    protected final void initArrays() {
        setStructure(null);
        setBuildCost(null);
        setProduction(null);
        setProductionMultiplier(null);
        setJobPrice(null);
        setJobReward(null);
        setJobRewardMultiplier(null);
        setSupply(null);
        setSupplyMultiplier(null);
        setDemand(null);
        setHold(null);
        setStore(null);
        setStoreMultiplier(null);
    }

    protected abstract void initValues();

    //@formatter:off
    public final void applyModelValues(BuildingStatsModel model) {
        if (model == null) return;
                  setRequiredPlayerLevel(                                model.getRequiredPlayerLevel());
                  setMaxLevel(                                           model.getMaxLevel());
                  setBuildLimit(                                         model.getBuildLimit());
                  setPriceMultiplier(                                    model.getPriceMultiplier());
        if (model.getStructure() != null)
                  setStructure(                                          model.getStructure());
        if (model.getBuildCost() != null)
                  setBuildCost(                     ResStatPack.valueOf(model.getBuildCost()));
        if (model.getProduction() != null)
                  setProduction(                    ResStatPack.valueOf(model.getProduction()));
        if (model.getProductionMultiplier() != null)
                  setProductionMultiplier(          ResStatPack.valueOf(model.getProductionMultiplier()));
        if (model.getJobPrice() != null)
                  setJobPrice(                      ResStatPack.valueOf(model.getJobPrice()));
        if (model.getJobReward() != null)
                  setJobReward(                     ResStatPack.valueOf(model.getJobReward()));
        if (model.getJobRewardMultiplier() != null)
                  setJobRewardMultiplier(           ResStatPack.valueOf(model.getJobRewardMultiplier()));
        if (model.getSupply() != null)
                  setSupply(                        ResStatPack.valueOf(model.getSupply()));
        if (model.getSupplyMultiplier() != null)
                  setSupplyMultiplier(              ResStatPack.valueOf(model.getSupplyMultiplier()));
        if (model.getDemand() != null)
                  setDemand(                        ResStatPack.valueOf(model.getDemand()));
        if (model.getHold() != null)
                  setHold(                          ResStatPack.valueOf(model.getHold()));
        if (model.getStore() != null)
                  setStore(                         ResStatPack.valueOf(model.getStore()));
        if (model.getStoreMultiplier() != null)
                  setStoreMultiplier(               ResStatPack.valueOf(model.getStoreMultiplier()));
    }
    //@formatter:on
}
