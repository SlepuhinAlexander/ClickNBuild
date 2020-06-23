package org.jjd.clicknbuild;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.jjd.clicknbuild.config.ConfigLoader;
import org.jjd.clicknbuild.sources.*;
import org.jjd.clicknbuild.ui.scene.Scenes;

import java.io.IOException;
import java.util.Locale;

public class App extends Application {

    private static Parent loadFXML(String fxml) throws IOException {
        return new FXMLLoader(Src.getFxml(fxml)).load();
    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        L10nHandler.inst().setLang(Locale.ENGLISH);
        primaryStage.setTitle(Src.getL10n(Strings.GAME_TITLE));
        primaryStage.getIcons().add(Src.getImg(Images.BLD_HEADQUARTER, ImgHandler.Size.TINY));
        Scene scene = new Scene(loadFXML(Scenes.LANDING.name));
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.show();
    }
}
