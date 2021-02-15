package login_simple;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    TextField usernameTextField;

    private Parent root;
    private Stage stage;
    private Scene scene;

    public void login(ActionEvent event) throws IOException {

        String username = usernameTextField.getText();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("scene.fxml"));
        root = loader.load();

        SceneController sceneController = loader.getController();
        sceneController.displayName(username);

//        root = FXMLLoader.load(getClass().getResource("scene_1.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
