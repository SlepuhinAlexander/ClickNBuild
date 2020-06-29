package org.itworks.clicknbuild.config.stats.model;

import org.itworks.clicknbuild.config.stats.buidling.BuildingStats;

public class BuildingStatsModel {
    private int requiredPlayerLevel;

    private int maxLevel;

    private int buildLimit;

    private int priceMultiplier;

    private int[] structure;

    private ResourcePackModel[] buildCost;

    private ResourcePackModel[] production;

    private ResourcePackModel[] productionMultiplier;

    private ResourcePackModel[] jobPrice;

    private ResourcePackModel[] jobReward;

    private ResourcePackModel[] jobRewardMultiplier;

    private ResourcePackModel[] supply;

    private ResourcePackModel[] supplyMultiplier;

    private ResourcePackModel[] demand;

    private ResourcePackModel[] hold;

    private ResourcePackModel[] store;

    private ResourcePackModel[] storeMultiplier;

    // @formatter:off
    public static BuildingStatsModel valueOf(BuildingStats value) {
        if (value == null) return null;
        BuildingStatsModel result = new BuildingStatsModel();
        result.setRequiredPlayerLevel(                                      value.getRequiredPlayerLevel());
        result.setMaxLevel(                                                 value.getMaxLevel());
        result.setBuildLimit(                                               value.getBuildLimit());
        result.setPriceMultiplier(                                          value.getPriceMultiplier());
        result.setStructure(                                                value.getStructure());
        result.setBuildCost(                ResourcePackModel.valueOf(      value.getBuildCost()));
        result.setProduction(               ResourcePackModel.valueOf(      value.getProduction()));
        result.setProductionMultiplier(     ResourcePackModel.valueOf(      value.getProductionMultiplier()));
        result.setJobPrice(                 ResourcePackModel.valueOf(      value.getJobPrice()));
        result.setJobReward(                ResourcePackModel.valueOf(      value.getJobReward()));
        result.setJobRewardMultiplier(      ResourcePackModel.valueOf(      value.getJobRewardMultiplier()));
        result.setSupply(                   ResourcePackModel.valueOf(      value.getSupply()));
        result.setSupplyMultiplier(         ResourcePackModel.valueOf(      value.getSupplyMultiplier()));
        result.setDemand(                   ResourcePackModel.valueOf(      value.getDemand()));
        result.setHold(                     ResourcePackModel.valueOf(      value.getHold()));
        result.setStore(                    ResourcePackModel.valueOf(      value.getStore()));
        result.setStoreMultiplier(          ResourcePackModel.valueOf(      value.getStoreMultiplier()));
        return result;
    }
    // @formatter:on

    public int getRequiredPlayerLevel() {
        return requiredPlayerLevel;
    }

    public void setRequiredPlayerLevel(int requiredPlayerLevel) {
        this.requiredPlayerLevel = requiredPlayerLevel;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(int maxLevel) {
        this.maxLevel = maxLevel;
    }

    public int getBuildLimit() {
        return buildLimit;
    }

    public void setBuildLimit(int buildLimit) {
        this.buildLimit = buildLimit;
    }

    public int getPriceMultiplier() {
        return priceMultiplier;
    }

    public void setPriceMultiplier(int priceMultiplier) {
        this.priceMultiplier = priceMultiplier;
    }

    public int[] getStructure() {
        return structure;
    }

    public void setStructure(int[] structure) {
        this.structure = structure;
    }

    public ResourcePackModel[] getBuildCost() {
        return buildCost;
    }

    public void setBuildCost(ResourcePackModel[] buildCost) {
        this.buildCost = buildCost;
    }

    public ResourcePackModel[] getProduction() {
        return production;
    }

    public void setProduction(ResourcePackModel[] production) {
        this.production = production;
    }

    public ResourcePackModel[] getProductionMultiplier() {
        return productionMultiplier;
    }

    public void setProductionMultiplier(ResourcePackModel[] productionMultiplier) {
        this.productionMultiplier = productionMultiplier;
    }

    public ResourcePackModel[] getJobPrice() {
        return jobPrice;
    }

    public void setJobPrice(ResourcePackModel[] jobPrice) {
        this.jobPrice = jobPrice;
    }

    public ResourcePackModel[] getJobReward() {
        return jobReward;
    }

    public void setJobReward(ResourcePackModel[] jobReward) {
        this.jobReward = jobReward;
    }

    public ResourcePackModel[] getJobRewardMultiplier() {
        return jobRewardMultiplier;
    }

    public void setJobRewardMultiplier(ResourcePackModel[] jobRewardMultiplier) {
        this.jobRewardMultiplier = jobRewardMultiplier;
    }

    public ResourcePackModel[] getSupply() {
        return supply;
    }

    public void setSupply(ResourcePackModel[] supply) {
        this.supply = supply;
    }

    public ResourcePackModel[] getSupplyMultiplier() {
        return supplyMultiplier;
    }

    public void setSupplyMultiplier(ResourcePackModel[] supplyMultiplier) {
        this.supplyMultiplier = supplyMultiplier;
    }

    public ResourcePackModel[] getDemand() {
        return demand;
    }

    public void setDemand(ResourcePackModel[] demand) {
        this.demand = demand;
    }

    public ResourcePackModel[] getHold() {
        return hold;
    }

    public void setHold(ResourcePackModel[] hold) {
        this.hold = hold;
    }

    public ResourcePackModel[] getStore() {
        return store;
    }

    public void setStore(ResourcePackModel[] store) {
        this.store = store;
    }

    public ResourcePackModel[] getStoreMultiplier() {
        return storeMultiplier;
    }

    public void setStoreMultiplier(ResourcePackModel[] storeMultiplier) {
        this.storeMultiplier = storeMultiplier;
    }
}
