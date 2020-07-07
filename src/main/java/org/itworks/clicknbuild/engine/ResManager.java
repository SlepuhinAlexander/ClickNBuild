package org.itworks.clicknbuild.engine;

import org.itworks.clicknbuild.config.stats.BuildingDefaults;
import org.itworks.clicknbuild.engine.model.Building;
import org.itworks.clicknbuild.engine.model.ResChunk;
import org.itworks.clicknbuild.engine.model.ResPack;
import org.itworks.clicknbuild.engine.model.ResType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

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
     * Sum of all {@link Building#getExpEarned()} in all currently existing {@link Building}-s.
     * Stored in current value.
     * Max value is immutable and unlimited (big enough).
     */
    private ResChunk totalExpEarned;

    /**
     * Sum of all {@link Building#getProduction()}-s in all currently existing {@link Building}-s.
     * Accounts all possible {@link ResType}-s to cover possible cases of overriding default {@link BuildingDefaults}.
     * Stored in current values.
     * Max values are immutable and unlimited (big enough).
     * Used to produce these resources per game tick and to display global stats to the player.
     */
    private ResPack totalProduction;

    /**
     * Sum of all {@link Building#getProductionMultiplier()}-s in all currently existing {@link Building}-s.
     * Accounts all possible {@link ResType}-s to cover possible cases of overriding default {@link BuildingDefaults}.
     * Stored in current values. Values are in percents.
     * Max values are immutable and unlimited (big enough).
     * Shows global multiplicative effect for each {@link Building} producing these {@link ResType}-s.
     * Used to boost productions in corresponding buildings.
     */
    private ResPack totalProductionMultiplier;

    /**
     * Sum of all {@link Building#getJobRewardMultiplier()}-s in all currently existing {@link Building}-s.
     * Accounts all possible {@link ResType}-s to cover possible cases of overriding default {@link BuildingDefaults}.
     * Stored in current values. Values are in percents.
     * Max values are immutable and unlimited (big enough).
     * Shows global multiplicative effect for each {@link Building} rewarding these {@link ResType}-s as a result of a
     * "production intensification" job.
     * Used to boost jobRewards in corresponding buildings.
     */
    private ResPack totalJobRewardMultiplier;

    /**
     * Sum of all {@link Building#getSupply()}-s in all currently existing {@link Building}-s.
     * Accounts all possible {@link ResType}-s to cover possible cases of overriding default {@link BuildingDefaults}.
     * Stored in current values.
     * Max values are immutable and unlimited (big enough).
     * Used to provide a steady supply of this resource type to the city needs.
     * (By default, the only resource type in this group is {@link ResType#POWER}.)
     */
    private ResPack totalSupply;

    /**
     * Sum of all {@link Building#getSupplyMultiplier()}-s in all currently existing {@link Building}-s.
     * Accounts all possible {@link ResType}-s to cover possible cases of overriding default {@link BuildingDefaults}.
     * Stored in current values. Values are in percents.
     * Max values are immutable and unlimited (big enough).
     * Shows global multiplicative effect for each {@link Building} supplying these {@link ResType}-s.
     * Used to boost supply in corresponding buildings.
     * (By default, the only resource type in this group is {@link ResType#POWER}.)
     */
    private ResPack totalSupplyMultiplier;

    /**
     * Collection of all currently existing {@link Building}-s that <i>produce</i> anything
     * (see {@link Building#getProduction()}).
     * Stored per produced {@link ResType}.
     * Lists of buildings are not null: if a ResType is not produced anywhere, the corresponding value in the map is an
     * empty list.
     * Used to re-{@link ResManager#calculateTotalProduction()} each game tick.
     */
    private ConcurrentHashMap<ResType, List<Building>> productions;

    /**
     * Collection of all currently existing {@link Building}-s that give <i>production multiplier</i> effect to
     * anything (see {@link Building#getProductionMultiplier()}).
     * Stored per {@link ResType} being effected.
     * Lists of buildings are not null: if a ResType is not boosted anywhere, the corresponding value in the map is an
     * empty list.
     * Used to re-{@link ResManager#calculateTotalProductionMultiplier()} each game tick.
     */
    private ConcurrentHashMap<ResType, List<Building>> productionMultipliers;

    /**
     * Collection of all currently existing {@link Building}-s that give <i>job reward multiplier</i> effect to
     * anything (see {@link Building#getJobRewardMultiplier()}).
     * Stored per {@link ResType} being effected.
     * Lists of buildings are not null: if a ResType reward is not boosted anywhere, the corresponding value in the map
     * is an empty list.
     * Used to re-{@link ResManager#calculateTotalJobRewardMultiplier()} each game tick.
     */
    private ConcurrentHashMap<ResType, List<Building>> jobRewardMultipliers;

    /**
     * Collection of all currently existing {@link Building}-s that <i>supply</i> anything (see
     * {@link Building#getSupply()}).
     * Stored per {@link ResType} being effected.
     * Lists of buildings are not null: if a ResType reward is not boosted anywhere, the corresponding value in the map
     * is an empty list.
     * Used to re-{@link ResManager#calculateTotalSupply()} each game tick.
     */
    private ConcurrentHashMap<ResType, List<Building>> supplies;

    /**
     * Collection of all currently existing {@link Building}-s that give <i>supply multiplier</i> effect to
     * anything (see {@link Building#getSupplyMultiplier()}).
     * Stored per {@link ResType} being effected.
     * Lists of buildings are not null: if a ResType is not boosted anywhere, the corresponding value in the map is an
     * empty list.
     * Used to re-{@link ResManager#calculateTotalSupplyMultiplier()} each game tick.
     */
    private ConcurrentHashMap<ResType, List<Building>> supplyMultipliers;

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
        initTotalProduction();
        initTotalProductionMultiplier();
        initTotalJobRewardMultiplier();
        initTotalSupply();
        initTotalSupplyMultiplier();
        initProductions();
        initProductionMultipliers();
        initJobRewardMultipliers();
        initSupplies();
        initSupplyMultipliers();
        //TODO implement
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

    public ResPack getTotalProduction() {
        return totalProduction;
    }

    public void setTotalProduction(ResPack totalProduction) {
        if (totalProduction == null) {
            initTotalProduction();
            return;
        }
        this.totalProduction = totalProduction;
    }

    private void initTotalProduction() {
        totalProduction = new ResPack();
        ResType[] resTypes = ResType.values();
        for (ResType type : resTypes) totalProduction.put(new ResChunk(type, 0d, Integer.MAX_VALUE));
    }

    public void calculateTotalProduction() {
        initTotalProduction();
        ResType[] resTypes = ResType.values();
        for (ResType type : resTypes) {
            productions.get(type).forEach(building ->
                    totalProduction.add(type, building.getProduction().getCurrent(type)));
        }
    }

    public ResPack getTotalProductionMultiplier() {
        return totalProductionMultiplier;
    }

    public void setTotalProductionMultiplier(ResPack totalProductionMultiplier) {
        if (totalProductionMultiplier == null) {
            initTotalProductionMultiplier();
            return;
        }
        this.totalProductionMultiplier = totalProductionMultiplier;
    }

    private void initTotalProductionMultiplier() {
        totalProductionMultiplier = new ResPack();
        ResType[] resTypes = ResType.values();
        for (ResType type : resTypes) totalProductionMultiplier.put(new ResChunk(type, 0d, Integer.MAX_VALUE));
    }

    public void calculateTotalProductionMultiplier() {
        initTotalProductionMultiplier();
        ResType[] resTypes = ResType.values();
        for (ResType type : resTypes) {
            productionMultipliers.get(type).forEach(building ->
                    totalProductionMultiplier.add(type, building.getProductionMultiplier().getCurrent(type)));
        }
    }

    public ResPack getTotalJobRewardMultiplier() {
        return totalJobRewardMultiplier;
    }

    private void setTotalJobRewardMultiplier(ResPack jobRewardMultiplier) {
        if (jobRewardMultiplier == null) {
            initTotalJobRewardMultiplier();
            return;
        }
        this.totalJobRewardMultiplier = jobRewardMultiplier;
    }

    private void initTotalJobRewardMultiplier() {
        totalJobRewardMultiplier = new ResPack();
        ResType[] resTypes = ResType.values();
        for (ResType type : resTypes) totalJobRewardMultiplier.put(new ResChunk(type, 0, Integer.MAX_VALUE));
    }

    public void calculateTotalJobRewardMultiplier() {
        initTotalJobRewardMultiplier();
        ResType[] resTypes = ResType.values();
        for (ResType type : resTypes) {
            jobRewardMultipliers.get(type).forEach(building ->
                    totalJobRewardMultiplier.add(type, building.getJobRewardMultiplier().getCurrent(type)));
        }
    }

    private ResPack getTotalSupply() {
        return totalSupply;
    }

    private void setTotalSupply(ResPack totalSupply) {
        if (totalSupply == null) {
            initTotalSupply();
            return;
        }
        this.totalSupply = totalSupply;
    }

    private void initTotalSupply() {
        totalSupply = new ResPack();
        ResType[] resTypes = ResType.values();
        for (ResType type : resTypes) totalSupply.put(new ResChunk(type, 0d, Integer.MAX_VALUE));
    }

    public void calculateTotalSupply() {
        initTotalSupply();
        ResType[] resTypes = ResType.values();
        for (ResType type : resTypes) {
            supplies.get(type).forEach(building ->
                    totalSupply.add(type, building.getSupply().getCurrent(type)));
        }
    }

    public ResPack getTotalSupplyMultiplier() {
        return totalSupplyMultiplier;
    }

    private void setTotalSupplyMultiplier(ResPack totalSupplyMultiplier) {
        if (totalSupplyMultiplier == null) {
            initTotalSupplyMultiplier();
            return;
        }
        this.totalSupplyMultiplier = totalSupplyMultiplier;
    }

    private void initTotalSupplyMultiplier() {
        totalSupplyMultiplier = new ResPack();
        ResType[] resTypes = ResType.values();
        for (ResType type : resTypes) totalSupplyMultiplier.put(new ResChunk(type, 0d, Integer.MAX_VALUE));
    }

    public void calculateTotalSupplyMultiplier() {
        initTotalSupply();
        ResType[] resTypes = ResType.values();
        for (ResType type : resTypes) {
            supplyMultipliers.get(type).forEach(building ->
                    totalSupplyMultiplier.add(type, building.getSupplyMultiplier().getCurrent(type)));
        }
    }

    private void initProductions() {
        productions = new ConcurrentHashMap<>();
        ResType[] resTypes = ResType.values();
        for (ResType type : resTypes) productions.put(type, new ArrayList<>());
    }

    private void initProductionMultipliers() {
        productionMultipliers = new ConcurrentHashMap<>();
        ResType[] resTypes = ResType.values();
        for (ResType type : resTypes) productionMultipliers.put(type, new ArrayList<>());
    }

    private void initJobRewardMultipliers() {
        jobRewardMultipliers = new ConcurrentHashMap<>();
        ResType[] resTypes = ResType.values();
        for (ResType type : resTypes) jobRewardMultipliers.put(type, new ArrayList<>());
    }

    private void initSupplies() {
        supplies = new ConcurrentHashMap<>();
        ResType[] resTypes = ResType.values();
        for (ResType type : resTypes) supplies.put(type, new ArrayList<>());
    }

    private void initSupplyMultipliers() {
        supplyMultipliers = new ConcurrentHashMap<>();
        ResType[] resTypes = ResType.values();
        for (ResType type : resTypes) supplyMultipliers.put(type, new ArrayList<>());
    }
}
