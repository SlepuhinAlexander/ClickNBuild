package org.itworks.clicknbuild.engine;

import org.itworks.clicknbuild.config.ConfigLoader;
import org.itworks.clicknbuild.config.Configs;
import org.itworks.clicknbuild.engine.profile.Preferences;
import org.itworks.clicknbuild.engine.profile.Profile;
import org.itworks.clicknbuild.util.io.FsHelper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public final class ProfileManager {
    /**
     * Limit for the amount of player {@link Profile} there could be in the game.
     * Used for predictable UI look.
     */
    private static final int SLOTS_AMOUNT = Integer.parseInt(ConfigLoader.get(Configs.PROFILE_SLOTS_COUNT));

    /**
     * Path to a folder with profile saves.
     * The folder is created if not exists.
     */
    private static final Path PATH = Paths.get(System.getProperty("user.home"))
            .resolve(Paths.get(ConfigLoader.get(Configs.PROFILE_PATH)))
            .toAbsolutePath();

    /**
     * Folder name that would be used for searching for a saved {@link Profile} or to create one if not exist.
     * E.g. if {@link ProfileManager#SLOTS_AMOUNT} = 3 and <code>PROFILE_FOLDER_NAME</code> = "profile" profiles would
     * be saved in (and loaded from) folders "profile0", "profile1" and "profile2" correspondingly.
     * <p>
     * The folder would be created automatically when creating a profile.
     * The folder would be deleted automatically when deleting a profile.
     */
    private static final String FOLDER_NAME = ConfigLoader.get(Configs.PROFILE_FOLDER_NAME);

    /**
     * A file name where to store (and load from) the {@link Profile}'s {@link Preferences}.
     * The file is located in the corresponding {@link ProfileManager#FOLDER_NAME}.
     * <p>
     * The file would be created automatically if not found in the folder (if the profile record is corrupted).
     * Auto-generated file would have default preferences.
     */
    private static final String PREFERENCES_FILE_NAME = ConfigLoader.get(Configs.PROFILE_PREFERENCES_FILE_NAME);

    /**
     * A file name where to store (and load from) the {@link Profile}'s {@link GameSave}
     * The file is located in the corresponding {@link ProfileManager#FOLDER_NAME}.
     * <p>
     * The file would be created automatically if not found in the folder (if the profile record is corrupted).
     * Auto-generated file would have default initial game save state.
     */
    private static final String GAMESAVE_FILE_NAME = ConfigLoader.get(Configs.PROFILE_GAMESAVE_FILE_NAME);

    private static volatile ProfileManager inst;

    private Profile[] profiles = new Profile[SLOTS_AMOUNT];

    private ProfileManager() {
    }

    public static ProfileManager inst() {
        ProfileManager local = inst;
        if (local == null) {
            synchronized (ProfileManager.class) {
                local = inst;
                if (local == null) {
                    inst = local = new ProfileManager();
                    local.initialize();
                }
            }
        }
        return local;
    }

    private void initialize() {
        loadProfiles();
    }

    private void loadProfiles() {

    }

    private static void initializeProfile(int slot) {
        if (slot < 0 || slot >= SLOTS_AMOUNT) return;
        Path profile = PATH.resolve(FOLDER_NAME + slot);
        try {
            FsHelper.createIfNotExist(profile.resolve(PREFERENCES_FILE_NAME),false);
            FsHelper.createIfNotExist(profile.resolve(GAMESAVE_FILE_NAME), false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deleteProfile(int slot) {
        if (slot < 0 || slot >= SLOTS_AMOUNT) return;
        inst().profiles[slot] = null;
        Path profile = PATH.resolve(FOLDER_NAME + slot);
        try {
            FsHelper.deleteIfExists(profile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createProfile(int slot) {
        if (slot < 0 || slot >= SLOTS_AMOUNT) return;
        if (inst().profiles[slot] != null) return;
        initializeProfile(slot);
        inst().profiles[slot] = new Profile();
    }

    public static void saveProfile(int slot) {
        if (slot < 0 || slot >= SLOTS_AMOUNT) return;
        Profile profile = inst().profiles[slot];
        if (profile == null) return;
        Path path = PATH.resolve(FOLDER_NAME + slot);
        profile.getPreferences().save(path.resolve(PREFERENCES_FILE_NAME));
        profile.getGameSave().save(path.resolve(GAMESAVE_FILE_NAME));
    }
}
