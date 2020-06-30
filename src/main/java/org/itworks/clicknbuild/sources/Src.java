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
}
