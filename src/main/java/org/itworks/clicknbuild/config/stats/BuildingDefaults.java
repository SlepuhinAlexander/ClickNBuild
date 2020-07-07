package org.itworks.clicknbuild.config.stats;

import org.itworks.clicknbuild.engine.profile.Difficulty;
import org.itworks.clicknbuild.engine.building.BuildingAttrType;
import org.itworks.clicknbuild.util.math.MathHelper;

import java.util.Objects;

/**
 * Final aggregation of all attributes that any building has by default.
 * Each building of a certain type inherits these defaults further transformed by the game (mainly, by current game
 * {@link Difficulty}).
 * Contains an array of {@link BuildingDefStats}, each one representing a building of this type at its certain
 * building level.* Additionally contains some global properties not depending on building level.
 * Non nullable: null <code>BuildingDefaults</code> does not make any sense.
 */
public final class BuildingDefaults {
    /**
     * Upper limit for {@link BuildingDefaults#requiredPlayerLevel} param.
     */
    private static final int MAX_REQUIRED_PLAYER_LEVEL = 100;

    /**
     * Upper limit for {@link BuildingDefaults#maxLevel} param.
     */
    private static final int MAX_ALLOWED_BUILDING_LEVEL = 100;

    /**
     * Upper limit for {@link BuildingDefaults#buildLimit} param.
     */
    private static final int MAX_BUILD_LIMIT = 1000;

    /**
     * Upper limit for {@link BuildingDefaults#costMultiplier} param.
     */
    private static final int MAX_COST_MULTIPLIER = 1000;

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
     * E.g. the <code>costMultiplier</code> equals 115:
     * First building of this type would cost exactly the values taken from the {@link BuildingAttrType#BUILD_COST}
     * attribute.
     * The second building of this type would proportionally cost x1.15 times more.
     * The third one would be x1.3225 (= 1.15 ^ 2) times more expensive.
     * And so on.
     */
    private int costMultiplier = 100;

    /**
     * An array of {@link BuildingDefStats}.
     * Each element in the array represents default stats for a building of this type at corresponding construction
     * level (the level = index + 1).
     * The array itself be null.
     * Array elements cannot be null as well.
     * See detailed description at {@link BuildingDefStats}.
     */
    private BuildingDefStats[] stats = new BuildingDefStats[maxLevel];

    public final int getRequiredPlayerLevel() {
        return requiredPlayerLevel;
    }

    public final void setRequiredPlayerLevel(int requiredPlayerLevel) {
        this.requiredPlayerLevel = MathHelper.clamp(requiredPlayerLevel, 1, MAX_REQUIRED_PLAYER_LEVEL);
    }

    public final int getMaxLevel() {
        return maxLevel;
    }

    /**
     * <b>Use with caution!</b>
     * Will erase ALL {@link BuildingDefaults#getStats()} if the maxLevel is changed.
     * When needed to change the maxLevel should be followed by re-filling the <code>stats</code> array
     */
    public final void setMaxLevel(int maxLevel) {
        this.maxLevel = MathHelper.clamp(maxLevel, 1, MAX_ALLOWED_BUILDING_LEVEL);
        fillMissingStats();
    }

    public final int getBuildLimit() {
        return buildLimit;
    }

    public final void setBuildLimit(int buildLimit) {
        this.buildLimit = MathHelper.clamp(buildLimit, 1, MAX_BUILD_LIMIT);
    }

    public final int getCostMultiplier() {
        return costMultiplier;
    }

    public final void setCostMultiplier(int costMultiplier) {
        this.costMultiplier = MathHelper.clamp(costMultiplier, MAX_COST_MULTIPLIER);
    }

    public BuildingDefStats[] getStats() {
        return stats;
    }

    /**
     * <b>Use with caution!</b>
     * Will erase ALL {@link BuildingDefaults#getStats()} if the length of the provided array does not equal to
     * <code>maxLevel</code>.
     */
    public void setStats(BuildingDefStats[] stats) {
        this.stats = Objects.requireNonNull(stats);
        fillMissingStats();
    }

    private void fillMissingStats() {
        if (stats == null || stats.length != maxLevel) stats = new BuildingDefStats[maxLevel];
        for (int i = 0; i < stats.length; i++) {
            if (stats[i] == null) stats[i] = new BuildingDefStats();
        }
    }
}
