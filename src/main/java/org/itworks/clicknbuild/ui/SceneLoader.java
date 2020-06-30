package org.itworks.clicknbuild.ui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.itworks.clicknbuild.sources.FxmlHandler;
import org.itworks.clicknbuild.sources.Src;
import org.itworks.clicknbuild.ui.scene.Scenes;
import org.itworks.clicknbuild.util.string.Str;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

public final class SceneLoader {
    private static volatile SceneLoader inst;
    /**
     * Overall holder for scenes ever built and loaded.
     * Allows the <code>stage</code> to show again a scene that was once loaded and built and then substituted by some
     * another scene.
     */
    private final ConcurrentHashMap<Scenes, Scene> scenes;
    /**
     * A link to the stage that must show the scenes loaded by this class.
     * In most cases that would be the primary stage of the application.
     */
    private Stage stage;

    private SceneLoader() {
        scenes = new ConcurrentHashMap<>();
    }

    public static SceneLoader inst() {
        SceneLoader local = inst;
        if (local == null) {
            synchronized (SceneLoader.class) {
                local = inst;
                if (local == null) {
                    inst = local = new SceneLoader();
                }
            }
        }
        return local;
    }

    public static Stage getStage() {
        return inst().stage;
    }

    public static void setStage(Stage stage) {
        if (stage == null) return;
        inst().stage = stage;
    }

    /**
     * Forced attempt to re-load the scene from an FXML file instead of using a saved instance of such scene.
     * Used to load the scene for the first time, or to completely rebuild it from the corresponding FXML when needed.
     * Replaces a record in the {@link SceneLoader#scenes} map, if any.
     * <p/>
     * Uses the {@link Scenes} enum to retrieve a string key (which is a filename of the corresponding fxml) and then
     * retrieve a URL to that source using {@link FxmlHandler}
     * <p/>
     * Loaded scene would be immediately shown on the {@link SceneLoader#stage}. Will throw an exception if the stage
     * is not set;
     */
    public static void load(Scenes key) throws IOException {
        if (key == null) return;
        Scene scene = new Scene(new FXMLLoader(Src.getFxml(key.name)).load());
        inst().scenes.put(key, scene);
        inst().stage.setScene(scene);
    }

    public static void load(String key) throws IOException {
        load(Scenes.get(Str.nonNull(key)));
    }

    /**
     * Searches for a saved instance of this scene in {@link SceneLoader#scenes}.
     * If not found, reloads it from the corresponding FXML file and saves the loaded instance.
     * The scene would be immediately shown on the {@link SceneLoader#stage}. Will throw an exception if the stage is
     * not set.
     */
    public static void show(Scenes key) throws IOException {
        if (key == null) return;
        Scene scene = inst().scenes.get(key);
        if (scene != null) {
            inst().stage.setScene(scene);
        } else {
            load(key);
        }
    }

    public static void show(String key) throws IOException {
        show(Scenes.get(Str.nonNull(key)));
    }


}
