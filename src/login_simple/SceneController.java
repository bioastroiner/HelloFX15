package login_simple;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.Random;

public class SceneController {

    Stage stage;
    @FXML
    private Label nameLabel;
    @FXML
    private Button logoutButton;
    @FXML
    private Button bomb_butt;
    @FXML
    private AnchorPane scenePane;
    @FXML
    private ImageView memeholder;

    public void displayName(String username) {
        nameLabel.setText("Hello: " + username);
    }

    public void logout(ActionEvent event) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("Are you sure that you want to log out?!");
        alert.setContentText("you have to log in again...");

        if (alert.showAndWait().get() == ButtonType.OK) {
            stage = (Stage) scenePane.getScene().getWindow();
            System.out.println("logged out");
            System.exit(0);
        }
    }

    public void showCode(ActionEvent event) {
        Alert alert =
        new Alert(Alert.AlertType.ERROR,
                "Australia is not a real country ,Please Enter a Valid Country!",
                ButtonType.OK);
        alert.setHeaderText("Failed");
        if(alert.showAndWait().get() == ButtonType.OK)
            new Alert(Alert.AlertType.WARNING,"Activating all warhead to random locations...",ButtonType.APPLY).show();
    }

    public void showMeme(ActionEvent event){
        Image img = new Image(getClass().getResourceAsStream(String.format("meme_%s.png",new Random().nextInt(10) + 1)));
        System.out.println();
        memeholder.setImage(img);
    }
}
