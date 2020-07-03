package org.itworks.clicknbuild;

import javafx.stage.Stage;
import org.itworks.clicknbuild.config.stats.StatsLoader;
import org.itworks.clicknbuild.engine.ProfileManager;
import org.itworks.clicknbuild.sources.*;
import org.itworks.clicknbuild.ui.SceneLoader;
import org.itworks.clicknbuild.ui.scene.Scenes;

import java.io.IOException;
import java.util.Locale;

public final class GameLauncher {
    public static void initialize() {
        L10nHandler.inst().setLanguage(Locale.ENGLISH);
        StatsLoader.inst().loadResStats();
        StatsLoader.inst().loadTileStats();
        StatsLoader.inst().loadBuildingStats();
        ProfileManager.inst();
    }

    public static void launch(Stage primaryStage) throws IOException {
        SceneLoader.inst().setStage(primaryStage);
        primaryStage.setTitle(Sources.getL10n(Strings.GAME_TITLE));
        primaryStage.getIcons().add(Sources.getImg(Images.BLD_HEADQUARTER, ImgHandler.Size.SMALL));
        SceneLoader.inst().show(Scenes.LANDING);
        primaryStage.show();
    }
}
