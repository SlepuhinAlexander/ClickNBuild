package org.itworks.clicknbuild.config.stats.model;

import org.itworks.clicknbuild.config.stats.buidling.BuildingStats;

public class BuildingStatsModel {
    private int requiredPlayerLevel;

    private int maxLevel;

    private int buildLimit;

    private int priceMultiplier;

    private int[] structure;

    private ResPackModel[] buildCost;

    private ResPackModel[] production;

    private ResPackModel[] productionMultiplier;

    private ResPackModel[] jobPrice;

    private ResPackModel[] jobReward;

    private ResPackModel[] jobRewardMultiplier;

    private ResPackModel[] supply;

    private ResPackModel[] supplyMultiplier;

    private ResPackModel[] demand;

    private ResPackModel[] hold;

    private ResPackModel[] store;

    private ResPackModel[] storeMultiplier;

    // @formatter:off
    public static BuildingStatsModel valueOf(BuildingStats value) {
        if (value == null) return null;
        BuildingStatsModel result = new BuildingStatsModel();
        result.setRequiredPlayerLevel(                                      value.getRequiredPlayerLevel());
        result.setMaxLevel(                                                 value.getMaxLevel());
        result.setBuildLimit(                                               value.getBuildLimit());
        result.setPriceMultiplier(                                          value.getPriceMultiplier());
        result.setStructure(                                                value.getStructure());
        result.setBuildCost(                ResPackModel.valueOf(      value.getBuildCost()));
        result.setProduction(               ResPackModel.valueOf(      value.getProduction()));
        result.setProductionMultiplier(     ResPackModel.valueOf(      value.getProductionMultiplier()));
        result.setJobPrice(                 ResPackModel.valueOf(      value.getJobPrice()));
        result.setJobReward(                ResPackModel.valueOf(      value.getJobReward()));
        result.setJobRewardMultiplier(      ResPackModel.valueOf(      value.getJobRewardMultiplier()));
        result.setSupply(                   ResPackModel.valueOf(      value.getSupply()));
        result.setSupplyMultiplier(         ResPackModel.valueOf(      value.getSupplyMultiplier()));
        result.setDemand(                   ResPackModel.valueOf(      value.getDemand()));
        result.setHold(                     ResPackModel.valueOf(      value.getHold()));
        result.setStore(                    ResPackModel.valueOf(      value.getStore()));
        result.setStoreMultiplier(          ResPackModel.valueOf(      value.getStoreMultiplier()));
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

    public ResPackModel[] getBuildCost() {
        return buildCost;
    }

    public void setBuildCost(ResPackModel[] buildCost) {
        this.buildCost = buildCost;
    }

    public ResPackModel[] getProduction() {
        return production;
    }

    public void setProduction(ResPackModel[] production) {
        this.production = production;
    }

    public ResPackModel[] getProductionMultiplier() {
        return productionMultiplier;
    }

    public void setProductionMultiplier(ResPackModel[] productionMultiplier) {
        this.productionMultiplier = productionMultiplier;
    }

    public ResPackModel[] getJobPrice() {
        return jobPrice;
    }

    public void setJobPrice(ResPackModel[] jobPrice) {
        this.jobPrice = jobPrice;
    }

    public ResPackModel[] getJobReward() {
        return jobReward;
    }

    public void setJobReward(ResPackModel[] jobReward) {
        this.jobReward = jobReward;
    }

    public ResPackModel[] getJobRewardMultiplier() {
        return jobRewardMultiplier;
    }

    public void setJobRewardMultiplier(ResPackModel[] jobRewardMultiplier) {
        this.jobRewardMultiplier = jobRewardMultiplier;
    }

    public ResPackModel[] getSupply() {
        return supply;
    }

    public void setSupply(ResPackModel[] supply) {
        this.supply = supply;
    }

    public ResPackModel[] getSupplyMultiplier() {
        return supplyMultiplier;
    }

    public void setSupplyMultiplier(ResPackModel[] supplyMultiplier) {
        this.supplyMultiplier = supplyMultiplier;
    }

    public ResPackModel[] getDemand() {
        return demand;
    }

    public void setDemand(ResPackModel[] demand) {
        this.demand = demand;
    }

    public ResPackModel[] getHold() {
        return hold;
    }

    public void setHold(ResPackModel[] hold) {
        this.hold = hold;
    }

    public ResPackModel[] getStore() {
        return store;
    }

    public void setStore(ResPackModel[] store) {
        this.store = store;
    }

    public ResPackModel[] getStoreMultiplier() {
        return storeMultiplier;
    }

    public void setStoreMultiplier(ResPackModel[] storeMultiplier) {
        this.storeMultiplier = storeMultiplier;
    }
}
