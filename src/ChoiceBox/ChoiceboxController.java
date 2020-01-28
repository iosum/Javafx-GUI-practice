package ChoiceBox;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ChoiceBox;

import java.net.URL;
import java.util.ResourceBundle;

public class ChoiceboxController implements Initializable {
    @FXML private ChoiceBox choicebox;
    @FXML private Label choiceboxLabel;

    public void chooseButtonClicked() {
        String message = "you choose: ";
        choiceboxLabel.setText(message + choicebox.getValue().toString());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choiceboxLabel.setText("");
        choicebox.getItems().addAll("black","double double","triple triple");
    }
}
