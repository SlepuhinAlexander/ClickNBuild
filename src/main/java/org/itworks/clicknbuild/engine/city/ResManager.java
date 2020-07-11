package org.itworks.clicknbuild.engine.city;

import com.google.common.util.concurrent.AtomicDouble;
import org.itworks.clicknbuild.engine.Ticker;
import org.itworks.clicknbuild.engine.Ticking;
import org.itworks.clicknbuild.engine.building.Building;
import org.itworks.clicknbuild.engine.building.BuildingAttrType;
import org.itworks.clicknbuild.engine.res.ResCalculator;
import org.itworks.clicknbuild.engine.res.ResChunk;
import org.itworks.clicknbuild.engine.res.ResType;
import org.itworks.clicknbuild.util.math.MathHelper;

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
public final class ResManager implements Ticking {
    /**
     * A divider to convert a production-per-hour building stats to production-per-game-tick
     * An hour (in ms) divided by current ticking rate (or period, in ms).
     * By default, 4 ticks per second.
     */
    private static final int TICKS_PER_HOUR = 60 * 60 * 1000 / Ticker.inst().getRate();

    private static volatile ResManager inst;

    /**
     * Collection of all {@link CityAttribute}-s for all possible {@link BuildingAttrType}-s except for
     * {@link BuildingAttrType#BUILD_COST} and {@link BuildingAttrType#JOB_PRICE}.
     * Each {@link CityAttribute} holds the current total sum of each {@link ResType} that the entire City has.
     * Each {@link CityAttribute} also collects links to all buildings in the entire City that have an effect on the
     * given {@link BuildingAttrType} (for each {@link ResType} as well).
     */
    private final ConcurrentSkipListMap<BuildingAttrType, CityAttribute> attributes = new ConcurrentSkipListMap<>();
    private final AtomicDouble crimeLevel = new AtomicDouble(0);
    private final AtomicDouble fireHazardLevel = new AtomicDouble(0);
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

    public double getCrimeLevel() {
        return crimeLevel.get();
    }

    private void setCrimeLevel(double value) {
        crimeLevel.set(MathHelper.clamp(value, 0d, 100d));
    }

    public double getFireHazardLevel() {
        return fireHazardLevel.get();
    }

    private void setFireHazardLevel(double value) {
        fireHazardLevel.set(MathHelper.clamp(value, 0d, 100d));
    }

    @Override
    public void tick() {
        loop();
        BuildingManager.inst().buildings.values().forEach(buildings ->
                buildings.forEach(Building::calculateProductivity));
    }

    /**
     * The heart of the game.
     * Looping cycle happening each game tick.
     * Here the game recalculates everything it has in the entire city: all productions, consumptions, distributions to
     * storages and other effects.
     * Here is also the place where the Player's actions (like finished job, construction, upgrade, or demolition)
     * lead to actual results when the city recalculates everything for consistency.
     */
    private void loop() {
        // Calculate total PRODUCTION of all resources
        get(BuildingAttrType.PRODUCTION).calculateTotal();
        get(BuildingAttrType.JOB_REWARD).calculateTotal();
        get(BuildingAttrType.SUPPLY).calculateTotal();
        get(BuildingAttrType.CAPACITY).calculateTotal();

        // Calculate total "booster" multipliers effects to all resources
        get(BuildingAttrType.PRODUCTION_MUL).calculateTotal();
        get(BuildingAttrType.JOB_REWARD_MUL).calculateTotal();
        get(BuildingAttrType.SUPPLY_MUL).calculateTotal();
        get(BuildingAttrType.CAPACITY_MUL).calculateTotal();

        // Apply the calculated "booster" multipliers to ALL buildings they might affect
        get(BuildingAttrType.PRODUCTION).applyMultipliers(get(BuildingAttrType.PRODUCTION_MUL).getTotal());
        get(BuildingAttrType.JOB_REWARD).applyMultipliers(get(BuildingAttrType.JOB_REWARD_MUL).getTotal());
        get(BuildingAttrType.SUPPLY).applyMultipliers(get(BuildingAttrType.SUPPLY_MUL).getTotal());
        get(BuildingAttrType.CAPACITY).applyMultipliers(get(BuildingAttrType.CAPACITY_MUL).getTotal());
        // Affected buildings would automatically apply their current productivity (to apply these multipliers not only
        // to max limiters but to current values as well).

        // Calculate total PRODUCTION of all resources.
        get(BuildingAttrType.PRODUCTION).calculateTotal();

        // Produce all the PRODUCTION resources per tick and STORE them.
        get(BuildingAttrType.STORE).getTotal()
                .add(ResCalculator.mul(get(BuildingAttrType.PRODUCTION).getTotal(), 1d / TICKS_PER_HOUR));

        // Calculate total DEMAND of all resources.
        get(BuildingAttrType.DEMAND).calculateTotal();

        // Put total DEMAND of POWER_CONSUMPTION & JOB to HOLD of POWER_CONSUMPTION & JOB correspondingly
        // and distribute it to buildings.
        get(BuildingAttrType.HOLD).distribute(get(BuildingAttrType.DEMAND).getTotal(ResType.POWER_CONSUMPTION));
        get(BuildingAttrType.HOLD).calculateTotal(ResType.POWER_CONSUMPTION);
        get(BuildingAttrType.HOLD).distribute(get(BuildingAttrType.DEMAND).getTotal(ResType.JOB));
        get(BuildingAttrType.HOLD).calculateTotal(ResType.JOB);

        // Subtract the total DEMAND of UPKEEP from total STORE of MONEY
        get(BuildingAttrType.STORE).getTotal(ResType.MONEY).sub(
                get(BuildingAttrType.DEMAND).getTotal(ResType.UPKEEP).getCurrent() * ResType.UPKEEP.getPrice()
                * 1d / TICKS_PER_HOUR);

        // Calculate total SUPPLY of all resources
        get(BuildingAttrType.SUPPLY).calculateTotal();

        // Distribute total SUPPLY of POWER to HOLD of POWER.
        get(BuildingAttrType.HOLD).distribute(get(BuildingAttrType.SUPPLY).getTotal(ResType.POWER));
        get(BuildingAttrType.HOLD).calculateTotal(ResType.POWER);

        // Calculate surplus of POWER SUPPLY and turn it into HOLD of POWER_EXCESS
        get(BuildingAttrType.HOLD).distribute(new ResChunk(ResType.POWER_EXCESS,
                get(BuildingAttrType.SUPPLY).getTotal(ResType.POWER).getCurrent() -
                get(BuildingAttrType.HOLD).getTotal(ResType.POWER).getCurrent(),
                Integer.MAX_VALUE));
        get(BuildingAttrType.HOLD).calculateTotal(ResType.POWER_EXCESS);

        // Turn CITIZEN to WORKER and distribute them to HOLD of WORKER
        get(BuildingAttrType.HOLD).distribute(new ResChunk(ResType.WORKER,
                get(BuildingAttrType.STORE).getTotal(ResType.CITIZEN).getCurrent(), Integer.MAX_VALUE));
        get(BuildingAttrType.HOLD).calculateTotal(ResType.WORKER);

        // Calculate surplus of CITIZEN and turn it into HOLD of UNEMPLOYMENT
        get(BuildingAttrType.HOLD).distribute(new ResChunk(ResType.UNEMPLOYMENT,
                get(BuildingAttrType.STORE).getTotal(ResType.CITIZEN).getCurrent() -
                get(BuildingAttrType.HOLD).getTotal(ResType.WORKER).getCurrent(),
                Integer.MAX_VALUE));
        get(BuildingAttrType.HOLD).calculateTotal(ResType.UNEMPLOYMENT);

        // Calculate BENEFIT for all UNEMPLOYMENT
        get(BuildingAttrType.HOLD).distribute(new ResChunk(ResType.BENEFIT,
                get(BuildingAttrType.HOLD).getTotal(ResType.UNEMPLOYMENT).getCurrent() *
                ResType.BENEFIT.getPrice(),
                Integer.MAX_VALUE));
        get(BuildingAttrType.HOLD).calculateTotal(ResType.BENEFIT);

        // Pay the BENEFIT
        get(BuildingAttrType.STORE).getTotal(ResType.MONEY).sub(
                get(BuildingAttrType.HOLD).getTotal(ResType.BENEFIT).getCurrent() * 1 / TICKS_PER_HOUR);

        // Turn CITIZEN to OBEDIENCE and distribute it to STORE of OBEDIENCE
        get(BuildingAttrType.STORE).distribute(new ResChunk(ResType.OBEDIENCE,
                get(BuildingAttrType.STORE).getTotal(ResType.CITIZEN).getCurrent(),
                Integer.MAX_VALUE));
        get(BuildingAttrType.STORE).calculateTotal(ResType.OBEDIENCE);

        // Calculate surplus of CITIZEN and turn it into HOLD of CRIME
        get(BuildingAttrType.HOLD).distribute(new ResChunk(ResType.CRIME,
                get(BuildingAttrType.STORE).getTotal(ResType.CITIZEN).getCurrent() -
                get(BuildingAttrType.STORE).getTotal(ResType.OBEDIENCE).getCurrent(),
                Integer.MAX_VALUE));
        get(BuildingAttrType.HOLD).calculateTotal(ResType.CRIME);
        setCrimeLevel(get(BuildingAttrType.HOLD).getTotal(ResType.CRIME).getCurrent() * 100d /
                      get(BuildingAttrType.STORE).getTotal(ResType.CITIZEN).getCurrent());

        // Add EMIGRATION from crimeLevel to DEMAND of EMIGRATION
        get(BuildingAttrType.DEMAND).getTotal(ResType.EMIGRATION).add(
                get(BuildingAttrType.HOLD).getTotal(ResType.CRIME).getCurrent() / ResType.CRIME.getPrice());

        // HOLD total EMIGRATION
        get(BuildingAttrType.HOLD).distribute(get(BuildingAttrType.DEMAND).getTotal(ResType.EMIGRATION));
        get(BuildingAttrType.HOLD).calculateTotal(ResType.EMIGRATION);

        // EMIGRATE CITIZEN
        get(BuildingAttrType.STORE).getTotal(ResType.CITIZEN)
                .sub(get(BuildingAttrType.HOLD).getTotal(ResType.EMIGRATION).getCurrent() * 1d / TICKS_PER_HOUR);

        // Distribute DEMAND of IGNITABILITY to STORE of IGNITABILITY
        get(BuildingAttrType.STORE).distribute(get(BuildingAttrType.DEMAND).getTotal(ResType.IGNITABILITY));
        get(BuildingAttrType.STORE).calculateTotal(ResType.IGNITABILITY);

        // Calculate surplus of IGNITABILITY and turn it into FIRE_HAZARD
        get(BuildingAttrType.HOLD).distribute(new ResChunk(ResType.FIRE_HAZARD,
                get(BuildingAttrType.DEMAND).getTotal(ResType.IGNITABILITY).getCurrent() -
                get(BuildingAttrType.STORE).getTotal(ResType.IGNITABILITY).getCurrent(),
                Integer.MAX_VALUE));
        get(BuildingAttrType.HOLD).calculateTotal(ResType.FIRE_HAZARD);
        setFireHazardLevel(get(BuildingAttrType.HOLD).getTotal(ResType.FIRE_HAZARD).getCurrent() * 100d /
                           get(BuildingAttrType.DEMAND).getTotal(ResType.IGNITABILITY).getCurrent());

        // Distribute what's left in STORE. Ignore surpluses.
        ResType[] toDistribute = new ResType[]{ResType.ENERGY, ResType.STEEL, ResType.CONCRETE, ResType.BRICK,
                ResType.WOOD, ResType.GLASS, ResType.MONEY, ResType.CITIZEN};
        for (ResType resType : toDistribute) {
            get(BuildingAttrType.STORE).distribute(get(BuildingAttrType.STORE).getTotal(resType));
            get(BuildingAttrType.STORE).calculateTotal(resType);
        }
    }
}
