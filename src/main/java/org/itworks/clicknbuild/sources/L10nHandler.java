package org.itworks.clicknbuild.sources;

import org.itworks.clicknbuild.config.ConfigLoader;
import org.itworks.clicknbuild.config.Configs;
import org.itworks.clicknbuild.util.string.Str;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class L10nHandler {
    private static final String SOURCE_PATH = ConfigLoader.get(Configs.L10N_SOURCE_PATH);

    private static final String FILE_EXTENSION = ConfigLoader.get(Configs.L10N_FILE_EXTENSION);

    private static final L10nHandler INST = new L10nHandler();

    private final HashMap<Lang, Properties> locales = new HashMap<>();

    private Lang lang = Lang.DEF;

    private L10nHandler() {
        load();
    }

    /**
     * If key is null replaces it with empty string.
     * Then looks up for the corresponding value in the resource bundle for the currently set language.
     * If fails, looks up for the corresponding value in the resource bundle for the default locale.
     * Not found (null) result replaces with empty string.
     * Parses the received result to resolve possible embedded links to other resource strings.
     */
    public static String get(String key) {
        return Resolver.resolve(Str.nonNull(INST.locales.get(INST.lang).getProperty(Str.nonNull(key)),
                Str.nonNull(INST.locales.get(Lang.DEF).getProperty(Str.nonNull(key)))));
    }

    public static String get(Strings key) {
        return get(key.value);
    }

    public static L10nHandler inst() {
        return INST;
    }

    private void load() {
        setLang(Locale.getDefault());
        for (Lang lang : Lang.values()) {
            try (InputStream langReader = getClass().getResourceAsStream(SOURCE_PATH
                                                                         + lang.name + FILE_EXTENSION)) {
                Properties langProperties = new Properties();
                langProperties.load(langReader);
                locales.put(lang, langProperties);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void setLang(Locale lang) {
        this.lang = Lang.get(Str.nonNull(lang.getLanguage()));
    }

    public void setLang(String loc) {
        this.lang = Lang.get(loc);
    }

    private enum Lang {
        DEF("def"), EN("en"), RU("ru");

        final String name;

        Lang(String name) {
            this.name = Str.nonNull(name);
        }

        static Lang get(String name) {
            for (Lang lang : Lang.values()) if (lang.name.equalsIgnoreCase(Str.nonNull(name).trim())) return lang;
            return DEF;
        }

        static Lang get(int ordinal) {
            for (Lang lang : Lang.values()) if (lang.ordinal() == ordinal) return lang;
            return DEF;
        }
    }

    /**
     * Resolves embedded links to other string resources.
     * Syntax: <code>${anotherResourceKey}</code>
     *
     * </p>Example:
     * having resources:
     * <pre><code>
     *      foo=foo ${bar}
     *      bar=bar ${buz}
     *      buz=buz
     * </code></pre>
     * result of <code>L10nHandler.get("foo")</code> would be <code>foo bar buz</code>
     */
    private static class Resolver {
        /**
         * regex string value to resolve / replace
         */
        private static final String REGEX_PATTERN = "\\$\\{.*?}";

        /**
         * string value defining pattern beginning
         */
        private static final String PATTERN_BEGIN = "${";

        /**
         * string value defining pattern ending
         */
        private static final String PATTERN_END = "}";

        private static Set<String> tokenize(String input) {
            Pattern toReplace = Pattern.compile(REGEX_PATTERN);
            Matcher matcher = toReplace.matcher(Str.nonNull(input));
            Set<String> tokens = new HashSet<>();
            while (matcher.find()) {
                tokens.add(matcher.group());
            }
            return tokens;
        }

        static String resolve(String nonParsed) {
            String parsed = Str.nonNull(nonParsed);
            Set<String> tokens = tokenize(parsed);
            for (String token : tokens) {
                parsed = parsed.replace(token, get(token.substring(PATTERN_BEGIN.length(),
                        token.length() - PATTERN_END.length())));
            }
            return parsed;
        }
    }
}
