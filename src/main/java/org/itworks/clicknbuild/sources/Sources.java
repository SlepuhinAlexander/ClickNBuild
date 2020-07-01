package org.itworks.clicknbuild.sources;

import javafx.scene.image.Image;
import org.itworks.clicknbuild.util.string.StringHelper;

import java.net.URL;
import java.util.Objects;

public final class Sources {
    public static URL getFxml(String key) {
        return FXMLHandler.inst().get(key);
    }

    public static URL getFxml(FXMLs key) {
        return FXMLHandler.inst().get(Objects.requireNonNull(key));
    }

    public static String getCss(String key) {
        return CssHandler.inst().get(key);
    }

    public static String getCss(Csses key) {
        return CssHandler.inst().get(key);
    }

    public static String getL10n(String key) {
        return L10nHandler.inst().get(key);
    }

    public static String getL10n(Strings key) {
        return L10nHandler.inst().get(key);
    }

    public static Image getImg(String key) {
        return ImgHandler.inst().get(StringHelper.nonNull(key));
    }

    public static Image getImg(Images key) {
        return ImgHandler.inst().get(key);
    }

    public static Image getImg(String key, ImgHandler.Size size) {
        return ImgHandler.inst().get(key, size);
    }

    public static Image getImg(Images key, ImgHandler.Size size) {
        return ImgHandler.inst().get(key, size);
    }

    public static Image getImg(String key, String size) {
        return ImgHandler.inst().get(key, size);
    }

    public static Image getImg(Images key, String size) {
        return ImgHandler.inst().get(key, size);
    }

    public static Image getImg(String key, int size) {
        return ImgHandler.inst().get(key, size);
    }

    public static Image getImg(Images key, int size) {
        return ImgHandler.inst().get(key, size);
    }
}
