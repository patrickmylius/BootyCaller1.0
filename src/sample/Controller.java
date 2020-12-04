package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileWriter;
import java.io.IOException;


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
        nameField.setText(null);
        image.setImage(null);
    }

    @FXML
    protected void handleSpecValues(ActionEvent event) {
        String userClass = (String) classChoice.getValue();
        System.out.println("Class Choice Log: " + classChoice.getValue());
        switch (userClass.toLowerCase()) {
            case "death knight":
                specChoice.getItems().clear();
                specChoice.getItems().addAll("Frost", "Unholy", "Blood");
                break;
            case "mage":
                specChoice.getItems().clear();
                specChoice.getItems().addAll("Frost", "Fire", "Arcane");
                break;
            case "rogue":
                specChoice.getItems().clear();
                specChoice.getItems().addAll("Assasination", "Outlaw", "Subtlety");
                break;
            case "warrior":
                specChoice.getItems().clear();
                specChoice.getItems().addAll("Arms", "Fury", "Protection");
                break;
            case "hunter":
                specChoice.getItems().clear();
                specChoice.getItems().addAll("Beast Mastery", "Markmanship", "Survival");
                break;
            case "paladin":
                specChoice.getItems().clear();
                specChoice.getItems().addAll("Holy", "Protection", "Retribution");
                break;
            case "shaman":
                specChoice.getItems().clear();
                specChoice.getItems().addAll("Restoration", "Elemental", "Enhancement");
                break;
            case "priest":
                specChoice.getItems().clear();
                specChoice.getItems().addAll("Shadow", "Holy", "Discipline");
                break;
            case "warlock":
                specChoice.getItems().clear();
                specChoice.getItems().addAll("Demonology", "Affliction", "Destruction");
                break;
            case "monk":
                specChoice.getItems().clear();
                specChoice.getItems().addAll("Mistweaver", "Brewmaster", "Windwalker");
                break;
            case "demon hunter":
                specChoice.getItems().clear();
                specChoice.getItems().addAll("Havoc", "Vengeance");
                break;
            case "druid":
                specChoice.getItems().clear();
                specChoice.getItems().addAll("Feral", "Balance", "Restoration", "Guardian");
        }


    }

    //create method for handling click generateButton event
    @FXML
    protected void handleGenerateButtonAction(ActionEvent event) {
        String userClass = (String) classChoice.getValue();
        String userSpec = (String) specChoice.getValue();

        switch (userClass.toLowerCase()) {
            //CLASS: DEATH KNIGHT
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
            //CLASS: MAGE
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
            //CLASS: ROGUE
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

            //CLASS: WARRIOR
            case "warrior":
                switch (userSpec.toLowerCase()) {
                    case "arms":
                        Image unholy = new Image("resources/ArmsWarrior.png");
                        image.setImage(unholy);
                        break;
                    case "fury":
                        Image frost = new Image("resources/FuryWarrior.png");
                        image.setImage(frost);
                        break;
                    case "protection":
                        Image blood = new Image("resources/ProtWarrior.png");
                        image.setImage(blood);
                }
                break;

            //CLASS: HUNTER
            case "hunter":
                switch (userSpec.toLowerCase()) {
                    case "beast mastery":
                        Image unholy = new Image("resources/BeastHunter.png");
                        image.setImage(unholy);
                        break;
                    case "markmanship":
                        Image frost = new Image("resources/MMHunter.png");
                        image.setImage(frost);
                        break;
                    case "survival":
                        Image blood = new Image("resources/SurvHunter.png");
                        image.setImage(blood);
                }
                break;

            //CLASS: PALADIN
            case "paladin":
                switch (userSpec.toLowerCase()) {
                    case "holy":
                        Image unholy = new Image("resources/HolyPala.png");
                        image.setImage(unholy);
                        break;
                    case "protection":
                        Image frost = new Image("resources/ProtPala.png");
                        image.setImage(frost);
                        break;
                    case "retribution":
                        Image blood = new Image("resources/RetPala.png");
                        image.setImage(blood);
                }
                break;

            //CLASS: SHAMAN
            case "shaman":
                switch (userSpec.toLowerCase()) {
                    case "restoration":
                        Image unholy = new Image("resources/RestoShaman.png");
                        image.setImage(unholy);
                        break;
                    case "elemental":
                        Image frost = new Image("resources/EleShaman.png");
                        image.setImage(frost);
                        break;
                    case "enhancement":
                        Image blood = new Image("resources/EnhanceShaman.png");
                        image.setImage(blood);
                }
                break;

            //CLASS: PRIEST
            case "priest":
                switch (userSpec.toLowerCase()) {
                    case "shadow":
                        Image unholy = new Image("resources/ShadowPriest.png");
                        image.setImage(unholy);
                        break;
                    case "holy":
                        Image frost = new Image("resources/HolyPriest.png");
                        image.setImage(frost);
                        break;
                    case "discipline":
                        Image blood = new Image("resources/DiscPriest.png");
                        image.setImage(blood);
                }
                break;

            //CLASS: WARLOCK
            case "warlock":
                switch (userSpec.toLowerCase()) {
                    case "demonology":
                        Image unholy = new Image("resources/DemoLock.png");
                        image.setImage(unholy);
                        break;
                    case "affliction":
                        Image frost = new Image("resources/AffLock.png");
                        image.setImage(frost);
                        break;
                    case "destruction":
                        Image blood = new Image("resources/DestruLock.png");
                        image.setImage(blood);
                }
                break;

            //CLASS: MONK
            case "monk":
                switch (userSpec.toLowerCase()) {
                    case "mistweaver":
                        Image unholy = new Image("resources/MistMonk.png");
                        image.setImage(unholy);
                        break;
                    case "brewmaster":
                        Image frost = new Image("resources/BrewMonk.png");
                        image.setImage(frost);
                        break;
                    case "windwalker":
                        Image blood = new Image("resources/WindMonk.png");
                        image.setImage(blood);
                }
                break;

            //CLASS: DEMON HUNTER
            case "demon hunter":
                switch (userSpec.toLowerCase()) {
                    case "havoc":
                        Image unholy = new Image("resources/HavocDH.png");
                        image.setImage(unholy);
                        break;
                    case "vengeance":
                        Image frost = new Image("resources/VengeanceDH.png");
                        image.setImage(frost);
                }
                break;

            //CLASS: DRUID
            case "druid":
                switch (userSpec.toLowerCase()) {
                    case "feral":
                        Image unholy = new Image("resources/FeralDruid.png");
                        image.setImage(unholy);
                        break;
                    case "balance":
                        Image frost = new Image("resources/BalanceDruid.png");
                        image.setImage(frost);
                        break;
                    case "restoration":
                        Image blood = new Image("resources/RestoDruid.png");
                        image.setImage(blood);
                        break;
                    case "guardian":
                        Image guardian = new Image("resources/GuardianDruid.png");
                        image.setImage(guardian);
                        break;
                }
        }
        try {
            FileWriter fileWriter = new FileWriter("nameLog.txt", true);
            String name = nameField.getText();
            fileWriter.write("Name: " + name + " | " + "Class: " + userClass + " | " + "Specialization: " + userSpec + "\n");
            fileWriter.close();
            System.out.println("Succesfully saved user name..");

        } catch (IOException e) {
            System.out.println("Error occured, save failed");
            e.printStackTrace();
        }

    }

}
