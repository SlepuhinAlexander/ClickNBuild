package org.itworks.clicknbuild.engine.profile;

import org.itworks.clicknbuild.engine.Difficulty;
import org.itworks.clicknbuild.sources.Images;
import org.itworks.clicknbuild.sources.L10nHandler;
import org.itworks.clicknbuild.util.string.StringHelper;

import java.nio.file.Path;
import java.util.Objects;

public final class Preferences {
    private static final String DEFAULT_NAME = "Builder";
    private static final Images DEFAULT_AVATAR = Images.AVATAR_MAN0;
    private static final L10nHandler.Language DEFAULT_LANGUAGE = L10nHandler.Language.getDefault();
    private static final Difficulty DEFAULT_DIFFICULTY = Difficulty.getDefault();

    private String name;
    private Images avatar;
    private L10nHandler.Language language;
    private Difficulty difficulty;

    public Preferences() {
        setDefaults();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = StringHelper.nonNull(name);
    }

    public void setDefaultName() {
        setName(DEFAULT_NAME);
    }

    public Images getAvatar() {
        return avatar;
    }

    public void setAvatar(Images avatar) {
        this.avatar = Objects.requireNonNull(avatar);
    }

    public void setDefaultAvatar() {
        setAvatar(DEFAULT_AVATAR);
    }

    public L10nHandler.Language getLanguage() {
        return language;
    }

    public void setLanguage(L10nHandler.Language language) {
        this.language = Objects.requireNonNull(language);
    }

    public void setDefaultLanguage() {
        setLanguage(DEFAULT_LANGUAGE);
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = Objects.requireNonNull(difficulty);
    }

    public void setDefaultDifficulty() {
        setDifficulty(DEFAULT_DIFFICULTY);
    }

    public void setDefaults() {
        setDefaultName();
        setDefaultAvatar();
        setDefaultDifficulty();
        setDefaultLanguage();
    }

    public void save(Path path) {

    }
}
