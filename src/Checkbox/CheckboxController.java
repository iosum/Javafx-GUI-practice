package Checkbox;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class CheckboxController implements Initializable {
    @FXML private CheckBox blackCheckbox;
    @FXML private CheckBox doubleDoubleCheckbox;
    @FXML private CheckBox tripleTripleCheckbox;
    @FXML private Label displayLabel;
    @FXML private Button orderButton;

    public void orderButtonPushed() {
        String order = "you order: ";
        if(blackCheckbox.isSelected()) {
            order += "\nblack coffee";
        }
        if(doubleDoubleCheckbox.isSelected()) {
            order += "\ndouble double";
        }
        if(tripleTripleCheckbox.isSelected()) {
            order += "\ntriple triple";
        }
        this.displayLabel.setText(order);
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        displayLabel.setText("");
    }
}
