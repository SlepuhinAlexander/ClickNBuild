package org.itworks.clicknbuild.engine.profile;

import java.util.Objects;

public final class Profile {
    /**
     * Link to player's preferences.
     * Cannot be null.
     * Initialized with a default {@link Preferences} object when creating a new profile.
     * Uses the deserialized {@link Preferences} object reconstructed from previously saved profile.
     */
    private Preferences preferences;

    /**
     * Composite object to store all current savable game progress.
     * Cannot be null.
     * Initialized with a default {@link GameSave} object when creating a new profile.
     * Uses the deserialized {@link GameSave} object reconstructed from previously saved profile.
     */
    private GameSave gameSave;

    public Profile() {
        preferences = new Preferences();
        gameSave = new GameSave();
    }

    public Preferences getPreferences() {
        return preferences;
    }

    public void setPreferences(Preferences preferences) {
        this.preferences = Objects.requireNonNull(preferences);
    }

    public GameSave getGameSave() {
        return gameSave;
    }

    public void setGameSave(GameSave gameSave) {
        this.gameSave = Objects.requireNonNull(gameSave);
    }
}
