package org.itworks.clicknbuild.engine.profile;

import com.fasterxml.jackson.core.util.DefaultIndenter;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.itworks.clicknbuild.sources.Images;
import org.itworks.clicknbuild.sources.L10nHandler;
import org.itworks.clicknbuild.util.string.StringHelper;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
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
    private boolean selected;

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

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public void setDefaultSelected() {
        setSelected(false);
    }

    public void setDefaults() {
        setDefaultName();
        setDefaultAvatar();
        setDefaultDifficulty();
        setDefaultLanguage();
        setDefaultSelected();
    }

    public void save(Path path) {
        if (path == null || !Files.exists(path)) return;
        ObjectMapper mapper = new ObjectMapper();
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp.indentArraysWith(DefaultIndenter.SYSTEM_LINEFEED_INSTANCE);
        pp.indentObjectsWith(DefaultIndenter.SYSTEM_LINEFEED_INSTANCE);
        try {
            mapper.writer(pp).writeValue(Files.newBufferedWriter(path), this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("UnusedReturnValue")
    public Preferences load(Path path) throws IOException {
        if (!Files.exists(Objects.requireNonNull(path))) throw new FileNotFoundException();
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readerForUpdating(this).readValue(Files.newBufferedReader(path), Preferences.class);
    }
}
