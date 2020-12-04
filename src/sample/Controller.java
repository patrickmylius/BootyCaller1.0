package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
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
    private ChoiceBox classChoice;

    @FXML
    private Label specLabel;
    @FXML
    private ChoiceBox specChoice;
    @FXML
    private Button clearButton;
    @FXML
    private Button generateButton;


    //create method for handling clickClearButton event
    @FXML
    protected void handleClearButtonAction(ActionEvent event) {
        image.setImage(null);
    }

    @FXML
    protected void handleSpec(ActionEvent event) {
        System.out.println("logged: " + classChoice.getValue());
        specChoice.getItems().clear();
        specChoice.getItems().addAll("Frost", "Fire", "Arcane");

    }

    //create method for handling click generateButton event
    @FXML
    protected void handleGenerateButtonAction(ActionEvent event) {
        String userClass = (String) classChoice.getValue();
        String userSpec = (String) specChoice.getValue();

        switch (userClass.toLowerCase()) {
            //CLASS: Death Knight
            case "death knight":
                switch (userSpec.toLowerCase()) {
                    case "unholy":
                        Image unholy = new Image("resources/UnholyDK.png");
                        image.setImage(unholy);
                        break;
                    case "frost":
                        Image frost = new Image("resources/FrostDK.png");
                        image.setImage(frost);
                        break;
                    case "blood":
                        Image blood = new Image("resources/BloodDK.png");
                        image.setImage(blood);
                }
                break;
            //CLASS: Mage
            case "mage":
                switch (userSpec.toLowerCase()) {
                    case "fire":
                        Image fire = new Image("resources/FireMage.png");
                        image.setImage(fire);
                        break;
                    case "frost":
                        Image frost = new Image("resources/FrostMage.png");
                        image.setImage(frost);
                        break;
                    case "arcane":
                        Image arcane = new Image("resources/ArcaneMage.png");
                        image.setImage(arcane);
                }
                break;
            //CLASS: Rogue
            case "rogue":
                switch (userSpec.toLowerCase()) {
                    case "assasination":
                        Image unholy = new Image("resources/AssaRogue.png");
                        image.setImage(unholy);
                        break;
                    case "subtlety":
                        Image frost = new Image("resources/SubRogue.png");
                        image.setImage(frost);
                        break;
                    case "outlaw":
                        Image blood = new Image("resources/OutlawRogue.png");
                        image.setImage(blood);
                }
                break;
        }

    }
}
