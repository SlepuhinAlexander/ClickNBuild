package org.itworks.clicknbuild.config.stats.model;

import org.itworks.clicknbuild.config.stats.buidling.BuildingStats;

public class BuildingStatsModel {
    private int requiredPlayerLevel;

    private int maxLevel;

    private int buildLimit;

    private int priceMultiplier;

    private int[] structure;

    private ResStatPackModel[] buildCost;

    private ResStatPackModel[] production;

    private ResStatPackModel[] productionMultiplier;

    private ResStatPackModel[] jobPrice;

    private ResStatPackModel[] jobReward;

    private ResStatPackModel[] jobRewardMultiplier;

    private ResStatPackModel[] supply;

    private ResStatPackModel[] supplyMultiplier;

    private ResStatPackModel[] demand;

    private ResStatPackModel[] hold;

    private ResStatPackModel[] store;

    private ResStatPackModel[] storeMultiplier;

    // @formatter:off
    public static BuildingStatsModel valueOf(BuildingStats value) {
        if (value == null) return null;
        BuildingStatsModel result = new BuildingStatsModel();
        result.setRequiredPlayerLevel(                                      value.getRequiredPlayerLevel());
        result.setMaxLevel(                                                 value.getMaxLevel());
        result.setBuildLimit(                                               value.getBuildLimit());
        result.setPriceMultiplier(                                          value.getPriceMultiplier());
        result.setStructure(                                                value.getStructure());
        result.setBuildCost(                ResStatPackModel.valueOf(      value.getBuildCost()));
        result.setProduction(               ResStatPackModel.valueOf(      value.getProduction()));
        result.setProductionMultiplier(     ResStatPackModel.valueOf(      value.getProductionMultiplier()));
        result.setJobPrice(                 ResStatPackModel.valueOf(      value.getJobPrice()));
        result.setJobReward(                ResStatPackModel.valueOf(      value.getJobReward()));
        result.setJobRewardMultiplier(      ResStatPackModel.valueOf(      value.getJobRewardMultiplier()));
        result.setSupply(                   ResStatPackModel.valueOf(      value.getSupply()));
        result.setSupplyMultiplier(         ResStatPackModel.valueOf(      value.getSupplyMultiplier()));
        result.setDemand(                   ResStatPackModel.valueOf(      value.getDemand()));
        result.setHold(                     ResStatPackModel.valueOf(      value.getHold()));
        result.setStore(                    ResStatPackModel.valueOf(      value.getStore()));
        result.setStoreMultiplier(          ResStatPackModel.valueOf(      value.getStoreMultiplier()));
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

    public ResStatPackModel[] getBuildCost() {
        return buildCost;
    }

    public void setBuildCost(ResStatPackModel[] buildCost) {
        this.buildCost = buildCost;
    }

    public ResStatPackModel[] getProduction() {
        return production;
    }

    public void setProduction(ResStatPackModel[] production) {
        this.production = production;
    }

    public ResStatPackModel[] getProductionMultiplier() {
        return productionMultiplier;
    }

    public void setProductionMultiplier(ResStatPackModel[] productionMultiplier) {
        this.productionMultiplier = productionMultiplier;
    }

    public ResStatPackModel[] getJobPrice() {
        return jobPrice;
    }

    public void setJobPrice(ResStatPackModel[] jobPrice) {
        this.jobPrice = jobPrice;
    }

    public ResStatPackModel[] getJobReward() {
        return jobReward;
    }

    public void setJobReward(ResStatPackModel[] jobReward) {
        this.jobReward = jobReward;
    }

    public ResStatPackModel[] getJobRewardMultiplier() {
        return jobRewardMultiplier;
    }

    public void setJobRewardMultiplier(ResStatPackModel[] jobRewardMultiplier) {
        this.jobRewardMultiplier = jobRewardMultiplier;
    }

    public ResStatPackModel[] getSupply() {
        return supply;
    }

    public void setSupply(ResStatPackModel[] supply) {
        this.supply = supply;
    }

    public ResStatPackModel[] getSupplyMultiplier() {
        return supplyMultiplier;
    }

    public void setSupplyMultiplier(ResStatPackModel[] supplyMultiplier) {
        this.supplyMultiplier = supplyMultiplier;
    }

    public ResStatPackModel[] getDemand() {
        return demand;
    }

    public void setDemand(ResStatPackModel[] demand) {
        this.demand = demand;
    }

    public ResStatPackModel[] getHold() {
        return hold;
    }

    public void setHold(ResStatPackModel[] hold) {
        this.hold = hold;
    }

    public ResStatPackModel[] getStore() {
        return store;
    }

    public void setStore(ResStatPackModel[] store) {
        this.store = store;
    }

    public ResStatPackModel[] getStoreMultiplier() {
        return storeMultiplier;
    }

    public void setStoreMultiplier(ResStatPackModel[] storeMultiplier) {
        this.storeMultiplier = storeMultiplier;
    }
}
