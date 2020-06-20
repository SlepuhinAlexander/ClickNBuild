package org.jjd.clicknbuild;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.jjd.clicknbuild.res.L10nHandler;
import org.jjd.clicknbuild.res.R;

import java.io.IOException;
import java.util.Locale;

public class App extends Application {

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/static/scene/" + fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        L10nHandler.inst().setLang(Locale.ENGLISH);
        primaryStage.setTitle(R.getL10n("game.title"));
        primaryStage.getIcons().add(R.getImg("builder_16"));
        Scene scene = new Scene(loadFXML("landing"));
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.show();
    }
}
