package org.itworks.clicknbuild;

import javafx.application.Application;
import javafx.stage.Stage;
import org.itworks.clicknbuild.ui.Controllers;
import org.itworks.clicknbuild.ui.controller.LandingController;

import java.io.IOException;

public final class App extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        GameLauncher.initialize();
        GameLauncher.launch(primaryStage);
    }
}
