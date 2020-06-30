package org.itworks.clicknbuild;

import javafx.stage.Stage;
import org.itworks.clicknbuild.config.stats.StatsLoader;
import org.itworks.clicknbuild.sources.*;
import org.itworks.clicknbuild.ui.SceneLoader;
import org.itworks.clicknbuild.ui.scene.Scenes;

import java.io.IOException;
import java.util.Locale;

public final class GameLauncher {
    public static void initialize() {
        L10nHandler.inst().setLang(Locale.ENGLISH);
        StatsLoader.inst().loadResStats();
        StatsLoader.inst().loadTileStats();
        StatsLoader.inst().loadBuildingStats();
    }

    public static void launch(Stage primaryStage) throws IOException {
        SceneLoader.setStage(primaryStage);
        primaryStage.setTitle(Src.getL10n(Strings.GAME_TITLE));
        primaryStage.getIcons().add(Src.getImg(Images.BLD_HEADQUARTER, ImgHandler.Size.SMALL));
        SceneLoader.show(Scenes.LANDING);
        primaryStage.show();
    }
}
