package org.sysimc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.sysimc.utils.PathFXML;

import java.io.FileInputStream;
import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent root = fxmlLoader.load(new FileInputStream(PathFXML.pathBase() + "\\main-view.fxml"));
        Scene scene = new Scene(root, 630, 350);
        stage.setTitle("Calculadora de IMC");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}