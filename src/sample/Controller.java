package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class Controller {
    //create Text
    @FXML
    private Text actiontarget;
    //create method for handling click event
    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) {
        actiontarget.setText("Button clicked");

    }
}
