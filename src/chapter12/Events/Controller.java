package chapter12.Events;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField nameField;
    @FXML
    private Button helloButton;
    @FXML
    private Button byeButton;


    @FXML
    public void onButtonClicked(ActionEvent actionEvent) {
        if(actionEvent.getSource().equals(helloButton)) {
            System.out.println("Hello, " + nameField.getText());
        } else if (actionEvent.getSource().equals(byeButton)) {
        System.out.println("The following button was pressed " + actionEvent.getSource());
        }
    }
}
