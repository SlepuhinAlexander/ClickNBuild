package org.itworks.clicknbuild.engine;

import org.itworks.clicknbuild.config.ConfigLoader;
import org.itworks.clicknbuild.config.Configs;
import org.itworks.clicknbuild.engine.profile.Preferences;
import org.itworks.clicknbuild.engine.profile.Profile;
import org.itworks.clicknbuild.sources.L10nHandler;
import org.itworks.clicknbuild.util.io.IOHelper;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public final class ProfileManager {
    /**
     * Limit for the amount of player {@link Profile} there could be in the game.
     * Used for predictable UI look.
     */
    public static final int SLOTS_AMOUNT = Integer.parseInt(ConfigLoader.inst().get(Configs.PROFILE_SLOTS_COUNT));

    /**
     * Path to a folder with profile saves.
     * The folder is created if not exists.
     */
    private static final Path PATH = Paths.get(System.getProperty("user.home"))
            .resolve(Paths.get(ConfigLoader.inst().get(Configs.PROFILE_PATH)))
            .toAbsolutePath();

    /**
     * Folder name that would be used for searching for a saved {@link Profile} or to create one if not exist.
     * E.g. if {@link ProfileManager#SLOTS_AMOUNT} = 3 and <code>PROFILE_FOLDER_NAME</code> = "profile" profiles would
     * be saved in (and loaded from) folders "profile0", "profile1" and "profile2" correspondingly.
     * <p>
     * The folder would be created automatically when creating a profile.
     * The folder would be deleted automatically when deleting a profile.
     */
    private static final String FOLDER_NAME = ConfigLoader.inst().get(Configs.PROFILE_FOLDER_NAME);

    /**
     * A file name where to store (and load from) the {@link Profile}'s {@link Preferences}.
     * The file is located in the corresponding {@link ProfileManager#FOLDER_NAME}.
     * <p>
     * The file would be created automatically if not found in the folder (if the profile record is corrupted).
     * Auto-generated file would have default preferences.
     */
    private static final String PREFERENCES_FILE_NAME = ConfigLoader.inst().get(Configs.PROFILE_PREFERENCES_FILE_NAME);

    /**
     * A file name where to store (and load from) the {@link Profile}'s {@link GameSave}
     * The file is located in the corresponding {@link ProfileManager#FOLDER_NAME}.
     * <p>
     * The file would be created automatically if not found in the folder (if the profile record is corrupted).
     * Auto-generated file would have default initial game save state.
     */
    private static final String GAMESAVE_FILE_NAME = ConfigLoader.inst().get(Configs.PROFILE_GAMESAVE_FILE_NAME);

    private static volatile ProfileManager inst;

    /**
     * List of all currently existing (& loaded) {@link Profile}-s.
     */
    private final Profile[] profiles = new Profile[SLOTS_AMOUNT];

    /**
     * Slot number of the currently selected {@link Profile}.
     */
    private int selected = -1;

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

    public Profile getProfile() {
        return profiles[selected];
    }

    public Profile getProfile(int slot) {
        if (slot < 0 || slot >= SLOTS_AMOUNT) return null;
        return profiles[slot];
    }

    private void initialize() {
        loadProfiles();
    }

    private void loadProfiles() {
        clearUp();
        for (int i = 0; i < SLOTS_AMOUNT; i++) loadProfile(i);
        if (anyProfilesExist()) {
            int selectedSlot = findSelectedSlot();
            // selectedSlot == -1 if currently deleted profile was the selected profile
            selectProfile(selectedSlot == -1 ? findExistingSlot() : selectedSlot);
        } else {
            createProfile(0);
            selectProfile(0);
        }
    }

    private void loadProfile(int slot) {
        if (slot < 0 || slot > SLOTS_AMOUNT) return;
        Path folder = PATH.resolve(FOLDER_NAME + slot);
        Profile profile = new Profile();
        try {
            profile.getPreferences().load(folder.resolve(PREFERENCES_FILE_NAME));
            profile.getGameSave().load(folder.resolve(GAMESAVE_FILE_NAME));
        } catch (FileNotFoundException ignored) {
            return;
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        profiles[slot] = profile;
    }

    private void initializeProfile(int slot) {
        if (slot < 0 || slot >= SLOTS_AMOUNT) return;
        Path folder = PATH.resolve(FOLDER_NAME + slot);
        try {
            IOHelper.createIfNotExist(folder.resolve(PREFERENCES_FILE_NAME), false);
            IOHelper.createIfNotExist(folder.resolve(GAMESAVE_FILE_NAME), false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteProfile(int slot) {
        if (slot < 0 || slot >= SLOTS_AMOUNT) return;
        profiles[slot] = null;
        deleteProfileFolder(slot);
        if (anyProfilesExist()) {
            int selectedSlot = findSelectedSlot();
            // selectedSlot == -1 if currently deleted profile was the selected profile
            selectProfile(selectedSlot == -1 ? findExistingSlot() : selectedSlot);
        } else {
            createProfile(0);
            selectProfile(0);
        }
    }

    private void deleteProfileFolder(int slot) {
        if (slot < 0 || slot >= SLOTS_AMOUNT) return;
        try {
            IOHelper.deleteIfExists(PATH.resolve(FOLDER_NAME + slot));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean anyProfilesExist() {
        for (Profile profile : profiles) if (profile != null) return true;
        return false;
    }

    public void createProfile(int slot) {
        if (slot < 0 || slot >= SLOTS_AMOUNT) return;
        if (profiles[slot] != null) return;
        deleteProfileFolder(slot); // to clear up possible leftovers of a somehow corrupted profile slot
        initializeProfile(slot);
        profiles[slot] = new Profile();
        saveProfile(slot);
    }

    public void selectProfile(int slot) {
        if (slot < 0 || slot >= SLOTS_AMOUNT) return;
        for (int i = 0; i < SLOTS_AMOUNT; i++) {
            if (profiles[i] != null) profiles[i].getPreferences().setSelected(i == slot);
        }
        selected = slot;
        L10nHandler.inst().setLanguage(profiles[selected].getPreferences().getLanguage());
        saveAllProfiles();
    }

    private int findSelectedSlot() {
        for (int i = 0; i < SLOTS_AMOUNT; i++) {
            if (profiles[i] != null && profiles[i].getPreferences().isSelected()) return i;
        }
        return -1;
    }

    private int findExistingSlot() {
        for (int i = 0; i < SLOTS_AMOUNT; i++) {
            if (profiles[i] != null) return i;
        }
        return -1;
    }

    public void saveProfile(int slot) {
        if (slot < 0 || slot >= SLOTS_AMOUNT) return;
        Profile profile = profiles[slot];
        if (profile == null) return;
        initializeProfile(slot); // just in case there are no files to save to
        Path path = PATH.resolve(FOLDER_NAME + slot);
        profile.getPreferences().save(path.resolve(PREFERENCES_FILE_NAME));
        profile.getGameSave().save(path.resolve(GAMESAVE_FILE_NAME));
    }

    public void saveProfile() {
        saveProfile(selected);
    }

    private void saveAllProfiles() {
        for (int i = 0; i < SLOTS_AMOUNT; i++) {
            if (profiles[i] != null) saveProfile(i);
        }
    }

    public void wipeSave(int slot) {
        if (slot < 0 || slot >= SLOTS_AMOUNT) return;
        Profile profile = profiles[slot];
        if (profile == null) return;
        initializeProfile(slot); // just in case there are no files to save to
        profile.setGameSave(new GameSave());
        Path path = PATH.resolve(FOLDER_NAME + slot);
        profile.getGameSave().save(path.resolve(GAMESAVE_FILE_NAME));
    }

    private void clearUp() {
        selected = -1;
        Arrays.fill(profiles, null);
    }
}
