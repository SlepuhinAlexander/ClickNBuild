package org.jjd.clicknbuild.res;

import org.jjd.clicknbuild.util.string.Str;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class L10nHandler {
    private static final L10nHandler INST = new L10nHandler();

    private final Properties def = new Properties();
    private final Properties en = new Properties();
    private final Properties ru = new Properties();

    private final HashMap<Lang, Properties> locales = new HashMap<>();

    private Lang lang = Lang.DEF;

    private L10nHandler() {
        initialize();
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

    public static L10nHandler inst() {
        return INST;
    }

    private void initialize() {
        String pref = "/static/string/locale";
        try (
                InputStream defReader = getClass().getResourceAsStream(pref + "/def.properties");
                InputStream enReader = getClass().getResourceAsStream(pref + "/en.properties");
                InputStream ruReader = getClass().getResourceAsStream(pref + "/ru.properties")
        ) {
            def.load(defReader);
            en.load(enReader);
            ru.load(ruReader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        setLang(Locale.getDefault());
        locales.put(Lang.DEF, def);
        locales.put(Lang.EN, en);
        locales.put(Lang.RU, ru);
    }

    public void setLang(Locale lang) {
        this.lang = Lang.get(Str.nonNull(lang.getLanguage()));
    }

    public void setLang(String loc) {
        this.lang = Lang.get(loc);
    }

    private enum Lang {
        DEF("def"), EN("en"), RU("ru");

        final String value;

        Lang(String val) {
            this.value = Str.nonNull(val);
        }

        static Lang get(String value) {
            for (Lang lang : Lang.values())
                if (lang.value.equalsIgnoreCase(Str.nonNull(value).toLowerCase().trim())) return lang;
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
        private static Set<String> tokenize(String input) {
            Pattern toReplace = Pattern.compile("\\$\\{.*?}");
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
                parsed = parsed.replace(token, get(token.substring(2, token.length() - 1)));
            }
            return parsed;
        }
    }
}
