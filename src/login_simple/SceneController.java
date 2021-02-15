package login_simple;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SceneController {

    @FXML
    Label nameLabel;

    public void displayName(String username){
        nameLabel.setText("Hello: " + username);
    }
}
