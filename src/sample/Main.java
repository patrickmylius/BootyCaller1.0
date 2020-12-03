package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml")); //loads sample.fxml file
        primaryStage.setTitle("Booty Call A Legendary 1.0"); //Set window name
        primaryStage.setScene(new Scene(root, 1280, 720)); //Set scene and size.
        primaryStage.show();//Showing primary Stage
    }


    public static void main(String[] args) {
        launch(args);
    }
}
