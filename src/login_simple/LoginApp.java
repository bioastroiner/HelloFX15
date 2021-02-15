package login_simple;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("login_scene.fxml"));
            Scene mainWindow = new Scene(root);
            primaryStage.setTitle("Login App");
            primaryStage.setScene(mainWindow);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
