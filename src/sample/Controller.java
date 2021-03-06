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
    //FXML Vars set.
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
        nameField.clear();
        image.setImage(null);
    }

    //Creating method for handling specValues from ChoiceBox
    @FXML
    protected void handleSpecValues(ActionEvent event) {
        String userClass = (String) classChoice.getValue(); //String casting Spec choiceBox value
        //Checking userClass choicebox value with all cases within.
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

    //Creating method for handling click generateButton event
    @FXML
    protected void handleGenerateButtonAction(ActionEvent event) {
        String userClass = (String) classChoice.getValue();//String casting class ChoiceBox value
        String userSpec = (String) specChoice.getValue();//String casting spec ChoiceBox value
        //Checking class choiceBox value with all cases within
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
                        Image assa = new Image("resources/AssaRogue.png");
                        image.setImage(assa);
                        break;
                    case "subtlety":
                        Image subtlety = new Image("resources/SubRogue.png");
                        image.setImage(subtlety);
                        break;
                    case "outlaw":
                        Image outlaw = new Image("resources/OutlawRogue.png");
                        image.setImage(outlaw);
                }
                break;

            //CLASS: WARRIOR
            case "warrior":
                switch (userSpec.toLowerCase()) {
                    case "arms":
                        Image arms = new Image("resources/ArmsWarrior.png");
                        image.setImage(arms);
                        break;
                    case "fury":
                        Image fury = new Image("resources/FuryWarrior.png");
                        image.setImage(fury);
                        break;
                    case "protection":
                        Image protection = new Image("resources/ProtWarrior.png");
                        image.setImage(protection);
                }
                break;

            //CLASS: HUNTER
            case "hunter":
                switch (userSpec.toLowerCase()) {
                    case "beast mastery":
                        Image bm = new Image("resources/BeastHunter.png");
                        image.setImage(bm);
                        break;
                    case "markmanship":
                        Image markmanship = new Image("resources/MMHunter.png");
                        image.setImage(markmanship);
                        break;
                    case "survival":
                        Image survival = new Image("resources/SurvHunter.png");
                        image.setImage(survival);
                }
                break;

            //CLASS: PALADIN
            case "paladin":
                switch (userSpec.toLowerCase()) {
                    case "holy":
                        Image holy = new Image("resources/HolyPala.png");
                        image.setImage(holy);
                        break;
                    case "protection":
                        Image protection = new Image("resources/ProtPala.png");
                        image.setImage(protection);
                        break;
                    case "retribution":
                        Image retribution = new Image("resources/RetPala.png");
                        image.setImage(retribution);
                }
                break;

            //CLASS: SHAMAN
            case "shaman":
                switch (userSpec.toLowerCase()) {
                    case "restoration":
                        Image resto = new Image("resources/RestoShaman.png");
                        image.setImage(resto);
                        break;
                    case "elemental":
                        Image elemental = new Image("resources/EleShaman.png");
                        image.setImage(elemental);
                        break;
                    case "enhancement":
                        Image enhancement = new Image("resources/EnhanceShaman.png");
                        image.setImage(enhancement);
                }
                break;

            //CLASS: PRIEST
            case "priest":
                switch (userSpec.toLowerCase()) {
                    case "shadow":
                        Image shadow = new Image("resources/ShadowPriest.png");
                        image.setImage(shadow);
                        break;
                    case "holy":
                        Image holy = new Image("resources/HolyPriest.png");
                        image.setImage(holy);
                        break;
                    case "discipline":
                        Image discipline = new Image("resources/DiscPriest.png");
                        image.setImage(discipline);
                }
                break;

            //CLASS: WARLOCK
            case "warlock":
                switch (userSpec.toLowerCase()) {
                    case "demonology":
                        Image demonology = new Image("resources/DemoLock.png");
                        image.setImage(demonology);
                        break;
                    case "affliction":
                        Image affliction = new Image("resources/AffLock.png");
                        image.setImage(affliction);
                        break;
                    case "destruction":
                        Image destruction = new Image("resources/DestruLock.png");
                        image.setImage(destruction);
                }
                break;

            //CLASS: MONK
            case "monk":
                switch (userSpec.toLowerCase()) {
                    case "mistweaver":
                        Image mistweaver = new Image("resources/MistMonk.png");
                        image.setImage(mistweaver);
                        break;
                    case "brewmaster":
                        Image brewmaster = new Image("resources/BrewMonk.png");
                        image.setImage(brewmaster);
                        break;
                    case "windwalker":
                        Image windwalker = new Image("resources/WindMonk.png");
                        image.setImage(windwalker);
                }
                break;

            //CLASS: DEMON HUNTER
            case "demon hunter":
                switch (userSpec.toLowerCase()) {
                    case "havoc":
                        Image havoc = new Image("resources/HavocDH.png");
                        image.setImage(havoc);
                        break;
                    case "vengeance":
                        Image vengeance = new Image("resources/VengeanceDH.png");
                        image.setImage(vengeance);
                }
                break;

            //CLASS: DRUID
            case "druid":
                switch (userSpec.toLowerCase()) {
                    case "feral":
                        Image feral = new Image("resources/FeralDruid.png");
                        image.setImage(feral);
                        break;
                    case "balance":
                        Image balance = new Image("resources/BalanceDruid.png");
                        image.setImage(balance);
                        break;
                    case "restoration":
                        Image resto = new Image("resources/RestoDruid.png");
                        image.setImage(resto);
                        break;
                    case "guardian":
                        Image guardian = new Image("resources/GuardianDruid.png");
                        image.setImage(guardian);
                        break;
                }
        }
        //Try catch: Creating new fileWriter logging Name, Class and Spec choice to userLog.txt
        try {
            FileWriter fileWriter = new FileWriter("userLog.txt", true);
            String name = nameField.getText();
            fileWriter.write("Name: " + name + " | " + "Class: " + userClass + " | " + "Specialization: " + userSpec + "\n");
            fileWriter.close();
            System.out.println("Succesfully saved user data..");

        } catch (IOException e) {
            System.out.println("Error occured, user data save failed");
            e.printStackTrace();
        }

    }

}
