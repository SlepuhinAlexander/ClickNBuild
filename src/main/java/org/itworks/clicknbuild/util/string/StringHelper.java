package org.itworks.clicknbuild.util.string;

public class StringHelper {
    private static final String DEFAULT_STRING = "";

    public static String nonNull(String value) {
        return value == null ? DEFAULT_STRING : value;
    }

    public static String nonNull(String value, String def) {
        return value == null ? nonNull(def) : value;
    }

    public static boolean notEmpty(String s) {
        return (s != null) && !s.isEmpty();
    }

    public static boolean startsWithIgnoreCase(String string, String prefix) {
        return notEmpty(string) &&
               notEmpty(prefix) &&
               prefix.length() <= string.length() &&
               string.regionMatches(true, 0, prefix, 0, prefix.length());
    }

    public static boolean endsWithIgnoreCase(String string, String postfix) {
        return notEmpty(string) &&
               notEmpty(postfix) &&
               postfix.length() <= string.length() &&
               string.regionMatches(true, string.length() - postfix.length(), postfix, 0,
                       postfix.length());
    }
}
