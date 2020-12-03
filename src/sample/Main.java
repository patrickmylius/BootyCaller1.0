package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.awt.*;
import java.io.FileInputStream;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml")); //loads sample.fxml file

        primaryStage.setTitle("Booty Call A Legendary 1.0"); //Set window name
        primaryStage.setScene(new Scene(root, 960, 680)); //Set scene and size.
        primaryStage.show();//Showing primary Stage
    }


    public static void main(String[] args) {
        launch(args);
    }
}
