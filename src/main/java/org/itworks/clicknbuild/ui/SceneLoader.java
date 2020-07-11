package org.itworks.clicknbuild.ui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.itworks.clicknbuild.engine.Ticking;
import org.itworks.clicknbuild.sources.FXMLHandler;
import org.itworks.clicknbuild.sources.Sources;
import org.itworks.clicknbuild.util.string.StringHelper;

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

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        if (stage == null) return;
        this.stage = stage;
    }

    /**
     * Forced attempt to re-load the scene from an FXML file instead of using a saved instance of such scene.
     * Used to load the scene for the first time, or to completely rebuild it from the corresponding FXML when needed.
     * Replaces a record in the {@link SceneLoader#scenes} map, if any.
     * <p/>
     * Uses the {@link Scenes} enum to retrieve a string key (which is a filename of the corresponding fxml) and then
     * retrieve a URL to that source using {@link FXMLHandler}
     * <p/>
     * Loaded scene would be immediately shown on the {@link SceneLoader#stage}. Will throw an exception if the stage
     * is not set;
     */
    public void load(Scenes key) throws IOException {
        if (key == null) return;
        scenes.keySet().forEach(scenesKey -> {
            Object controller = Controllers.inst().get(scenesKey.controller);
            if (controller instanceof Ticking) ((Ticking) controller).unsubscribe();
        });
        Scene currentScene = stage.getScene();
        Scene scene;
        if (currentScene == null) {
            scene = new Scene(new FXMLLoader(Sources.getFXML(key.fxml)).load());
        } else {
            scene = new Scene(new FXMLLoader(Sources.getFXML(key.fxml)).load(),
                    currentScene.getWidth(),
                    currentScene.getHeight());
        }
        scenes.put(key, scene);
        stage.setScene(scene);
    }

    public void load(String key) throws IOException {
        load(Scenes.get(StringHelper.nonNull(key)));
    }

    /**
     * Searches for a saved instance of this scene in {@link SceneLoader#scenes}.
     * If not found, reloads it from the corresponding FXML file and saves the loaded instance.
     * The scene would be immediately shown on the {@link SceneLoader#stage}. Will throw an exception if the stage is
     * not set.
     */
    public void show(Scenes key) throws IOException {
        if (key == null) return;
        Scene scene = scenes.get(key);
        if (scene != null) {
            stage.setScene(scene);
        } else {
            load(key);
        }
    }

    public void show(String key) throws IOException {
        show(Scenes.get(StringHelper.nonNull(key)));
    }
}
