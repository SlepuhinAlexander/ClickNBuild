package org.itworks.clicknbuild.sources;

import javafx.scene.image.Image;
import org.itworks.clicknbuild.util.string.Str;

import java.net.URL;
import java.util.Objects;

public final class Src {
    public static URL getFxml(String key) {
        return FxmlHandler.get(key);
    }

    public static URL getFxml(Fxmls key) {
        return FxmlHandler.get(Objects.requireNonNull(key));
    }

    public static String getCss(String key) {
        return CssHandler.get(key);
    }

    public static String getCss(Csses key) {
        return CssHandler.get(key);
    }

    public static String getL10n(String key) {
        return L10nHandler.get(key);
    }

    public static String getL10n(Strings key) {
        return L10nHandler.get(key);
    }

    public static Image getImg(String key) {
        return ImgHandler.get(Str.nonNull(key));
    }

    public static Image getImg(Images key) {
        return ImgHandler.get(key);
    }

    public static Image getImg(String key, ImgHandler.Size size) {
        return ImgHandler.get(key, size);
    }

    public static Image getImg(Images key, ImgHandler.Size size) {
        return ImgHandler.get(key, size);
    }

    public static Image getImg(String key, String size) {
        return ImgHandler.get(key, size);
    }

    public static Image getImg(Images key, String size) {
        return ImgHandler.get(key, size);
    }

    public static Image getImg(String key, int size) {
        return ImgHandler.get(key, size);
    }

    public static Image getImg(Images key, int size) {
        return ImgHandler.get(key, size);
    }

    /**
     * Returns any possible application resource by request.
     * Awaits for the following key prefixes in the <code>key</code> param:
     * <ul>
     *     <li>"s_" or "loc_" for a localized string resource;</li>
     *     <li>"img_" or "ic_" for an image resource to reuse in UI;</li>
     *     <li>"css_" for a URL (as a <code>String</code> type value) to a stylesheet;</li>
     *     <li>"fxml_" for a URL (as a <code>URL</code> type value) to an fxml-file.</li>
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
        if (Str.startsWithIgnoreCase(key, "fxml_")) return getFxml(key.substring("fxml_".length()));
        return getL10n(key);
    }
}
