package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Controller {
    @FXML
    private ImageView image;

    @FXML
    private Label nameLabel;
    @FXML
    private TextField nameField;

    @FXML
    private Label roleLabel;
    @FXML
    private TextField roleField;

    @FXML
    private Label specLabel;
    @FXML
    private TextField specField;

    @FXML
    private Button clearButton;
    @FXML
    private Button generateButton;


    //create method for handling clickClearButton event
    @FXML
    protected void handleClearButtonAction(ActionEvent event) {

    }

    //create method for handling click generateButton event
    @FXML
    protected void handleGenerateButtonAction(ActionEvent event) {
        switch (specField.getText().toLowerCase()) {
            case "unholy":
                Image unholy = new Image("resources/" + "Unholy.png");
                image.setImage(unholy);
        }

    }
}
