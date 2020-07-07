package org.itworks.clicknbuild.sources;

import org.itworks.clicknbuild.config.ConfigLoader;
import org.itworks.clicknbuild.config.Configs;
import org.itworks.clicknbuild.util.string.StringHelper;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class L10nHandler {
    /**
     * Prefix String value of a URL for retrieving sources by the classloader
     */
    private static final String SOURCE_PATH = ConfigLoader.inst().get(Configs.L10N_SOURCE_PATH);

    /**
     * String value of the OS file extension to filter only this file type sources.
     */
    private static final String FILE_EXTENSION = ConfigLoader.inst().get(Configs.L10N_FILE_EXTENSION);

    private static volatile L10nHandler inst;

    private final HashMap<Language, Properties> locales = new HashMap<>();

    private Language language = Language.DEF;

    private L10nHandler() {
    }

    /**
     * If key is null replaces it with empty string.
     * Then looks up for the corresponding value in the resource bundle for the currently set language.
     * If fails, looks up for the corresponding value in the resource bundle for the default locale.
     * Not found (null) result replaces with empty string.
     * Parses the received result to resolve possible embedded links to other resource strings.
     */
    public String get(String key) {
        return Resolver.resolve(StringHelper.nonNull(locales.get(language).getProperty(StringHelper.nonNull(key)),
                StringHelper.nonNull(locales.get(Language.DEF).getProperty(StringHelper.nonNull(key)))));
    }

    public String get(Strings key) {
        return get(key.value);
    }

    public static L10nHandler inst() {
        L10nHandler local = inst;
        if (local == null) {
            synchronized (L10nHandler.class) {
                local = inst;
                if (local == null) {
                    inst = local = new L10nHandler();
                    local.loadL10ns();
                }
            }
        }
        return local;
    }

    private void loadL10ns() {
        for (Language lang : Language.values()) {
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

    public void setLanguage(Language language) {
        this.language = language == null ? Language.DEF : language;
    }

    public void setLanguage(Locale locale) {
        this.language = Language.get(locale);
    }

    public void setLanguage(String language) {
        this.language = Language.get(language);
    }

    public enum Language {
        DEF("def"), EN("en"), RU("ru");

        final String name;

        Language(String name) {
            this.name = StringHelper.nonNull(name);
        }

        public static Language get(String name) {
            for (Language lang : values())
                if (lang.name.equalsIgnoreCase(StringHelper.nonNull(name).trim())) {
                    return lang;
                }
            return DEF;
        }

        public static Language get(Locale locale) {
            if (locale == null) return DEF;
            return get(StringHelper.nonNull(locale.getLanguage()));
        }

        public static Language get(int ordinal) {
            for (Language lang : Language.values()) if (lang.ordinal() == ordinal) return lang;
            return DEF;
        }

        public static Language getDefault() {
            return get(Locale.getDefault());
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
            Matcher matcher = toReplace.matcher(StringHelper.nonNull(input));
            Set<String> tokens = new HashSet<>();
            while (matcher.find()) {
                tokens.add(matcher.group());
            }
            return tokens;
        }

        private static String resolve(String nonParsed) {
            String parsed = StringHelper.nonNull(nonParsed);
            Set<String> tokens = tokenize(parsed);
            for (String token : tokens) {
                parsed = parsed.replace(token, inst().get(token.substring(PATTERN_BEGIN.length(),
                        token.length() - PATTERN_END.length())));
            }
            return parsed;
        }
    }
}
