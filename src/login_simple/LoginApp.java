package login_simple;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
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

            primaryStage.setOnCloseRequest(e -> logout(primaryStage));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void logout(Stage stage){

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("Are you sure that you want to log out?!");
        alert.setContentText("you have to log in again...");

        if(alert.showAndWait().get() == ButtonType.OK){
            System.out.println("logged out");
        }
    }
}
