package org.jjd.clicknbuild.res;

import javafx.scene.image.Image;
import org.jjd.clicknbuild.util.string.Str;

public class R {
    public static String getCss(String key) {
        return CssHandler.get(Str.nonNull(key));
    }

    public static String getL10n(String key) {
        return L10nHandler.get(Str.nonNull(key));
    }

    public static Image getImg(String key) {
        return ImgHandler.get(Str.nonNull(key));
    }

    /**
     * Returns any possible application resource by request.
     * Awaits for the following key prefixes in the <code>key</code> param:
     * <ul>
     *     <li>"s_" or "loc_" for a localized string resource;</li>
     *     <li>"img_" or "ic_" for an image resource to reuse in UI;</li>
     *     <li>"css_" for a URL to a stylesheet.</li>
     * </ul>
     * Key prefixes are case insensitive.
     * <p/>
     * If none of this prefixes used, processes the whole <code>key</code> param as a key to retrieve a localized
     * string resource.
     */
    public static Object get(String key) {
        if (Str.startsWithIgnoreCase(key, "s_")) return getL10n(key.substring("s_".length()));
        if (Str.startsWithIgnoreCase(key, "loc_")) return getL10n(key.substring("loc_".length()));
        if (Str.startsWithIgnoreCase(key, "img_")) return getImg(key.substring("img_".length()));
        if (Str.startsWithIgnoreCase(key, "ic_")) return getImg(key.substring("ic_".length()));
        if (Str.startsWithIgnoreCase(key, "css_")) return getCss(key.substring("css_".length()));
        return getL10n(key);
    }
}
