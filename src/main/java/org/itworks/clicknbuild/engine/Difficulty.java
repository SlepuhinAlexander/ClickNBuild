package org.itworks.clicknbuild.engine;

import org.itworks.clicknbuild.sources.Strings;
import org.itworks.clicknbuild.util.math.MathHelper;
import org.itworks.clicknbuild.util.string.StringHelper;

import java.util.Objects;

public enum Difficulty {
    EASY("easy",
            Strings.DIFFICULTY_EASY,
            Strings.DIFFICULTY_EASY_DESC,
            false,
            1.25,
            0.8),
    NORMAL("normal",
            Strings.DIFFICULTY_NORMAL,
            Strings.DIFFICULTY_NORMAL_DESC,
            false,
            1.0,
            1.0),
    HARD("hard",
            Strings.DIFFICULTY_HARD,
            Strings.DIFFICULTY_HARD_DESC,
            true,
            1.0,
            1.0);

    /**
     * String identity of this enum values
     */
    final String name;

    /**
     * Key for L10nHandler to get localized <code>Difficulty</code> name.
     */
    final Strings l10n;

    /**
     * Key for L10nHandler to get localized <code>Difficulty</code> description.
     */
    final Strings desc;

    /**
     * If true, the subsequent buildings of the same type would costs exponentially more to construct and upgrade.
     * If false, any buildings of the same type (and level) cost equally.
     * <p>
     * Turning this option on greatly increase difficulty in mid- and end-game.
     *
     * @See org.itworks.clicknbuild.config.stats.buidling.BuildingStats#priceMultiplier
     */
    final boolean useCostMult;

    /**
     * A multiplier that would be applied to any positive ingame results or properties: resources production,
     * storage capacities, rewards, etc.
     * A value greater than 1.0 would ease the game process.
     * A value smaller than 1.0 would make the game harder or even impossible.
     */
    final double gainsMult;

    /**
     * A multiplier that would be applied to any negative ingame results or properties: build, upgrade and upkeep costs,
     * prices, needs, negative effects, etc.
     * A value greater than 1.0 would make the game harder or even impossible.
     * A value smaller than 1.0 would ease the game process.
     */
    final double costsMult;

    Difficulty(String name, Strings l10n, Strings desc, boolean useCostMult, double gainsMult, double costsMult) {
        this.name = StringHelper.nonNull(name);
        this.l10n = Objects.requireNonNull(l10n);
        this.desc = Objects.requireNonNull(desc);
        this.useCostMult = useCostMult;
        this.gainsMult = MathHelper.clamp(gainsMult);
        this.costsMult = MathHelper.clamp(costsMult);
    }

    public static Difficulty getDefault() {
        return NORMAL;
    }
}
