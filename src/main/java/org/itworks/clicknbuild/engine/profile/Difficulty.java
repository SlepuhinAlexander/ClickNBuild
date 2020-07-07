package org.itworks.clicknbuild.engine.profile;

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
    public final String name;

    /**
     * Key for L10nHandler to get localized <code>Difficulty</code> name.
     */
    public final Strings l10n;

    /**
     * Key for L10nHandler to get localized <code>Difficulty</code> description.
     */
    public final Strings desc;

    /**
     * If true, the subsequent buildings of the same type would costs exponentially more to construct and upgrade.
     * If false, any buildings of the same type (and level) cost equally.
     * <p>
     * Turning this option on greatly increase difficulty in mid- and end-game.
     *
     * @See BuildingDefaults#costMultiplier
     */
    public final boolean useCostMultiplier;

    /**
     * A multiplier that would be applied to any positive ingame results or properties: resources production,
     * storage capacities, rewards, etc.
     * A value greater than 1.0 would ease the game process.
     * A value smaller than 1.0 would make the game harder or even impossible.
     */
    public final double gainsMultiplier;

    /**
     * A multiplier that would be applied to any negative ingame results or properties: build, upgrade and upkeep costs,
     * prices, needs, negative effects, etc.
     * A value greater than 1.0 would make the game harder or even impossible.
     * A value smaller than 1.0 would ease the game process.
     */
    public final double costsMultiplier;

    Difficulty(String name, Strings l10n, Strings desc, boolean useCostMultiplier, double gainsMultiplier,
               double costsMultiplier) {
        this.name = StringHelper.nonNull(name);
        this.l10n = Objects.requireNonNull(l10n);
        this.desc = Objects.requireNonNull(desc);
        this.useCostMultiplier = useCostMultiplier;
        this.gainsMultiplier = MathHelper.clamp(gainsMultiplier);
        this.costsMultiplier = MathHelper.clamp(costsMultiplier);
    }

    public static Difficulty getDefault() {
        return NORMAL;
    }
}
