package org.itworks.clicknbuild.sources;

import org.itworks.clicknbuild.util.string.StringHelper;

/**
 * Global handler of string keys for CssHandler
 */
public enum CSSes {
    LANDING("landing"),
    MAIN_MENU("main_menu"),
    HELP_MENU("help_menu"),
    PROFILE_SELECTION("profile_selection"),
    EDIT_PROFILE("edit_profile"),
    CITY_VIEW("city_view"),
    MAP("map"),
    PLAYER_STATS("player_stats"),
    STATS("stats"),
    PRODUCTION("production"),
    POWER("power"),
    JOB("job"),
    CRIME("crime"),
    FIRE("fire"),
    BUILDING_VIEW("building_view"),
    BUILDING("building"),
    ;

    final String value;

    CSSes(String value) {
        this.value = StringHelper.nonNull(value);
    }

    public static CSSes get(String value) {
        CSSes[] csses = values();
        for (CSSes css : csses) if (css.value.equalsIgnoreCase(StringHelper.nonNull(value).trim())) return css;
        return null;
    }

    public static CSSes get(int ordinal) {
        CSSes[] csses = values();
        if (ordinal < 0 || ordinal >= csses.length) return null;
        return csses[ordinal];
    }
}
