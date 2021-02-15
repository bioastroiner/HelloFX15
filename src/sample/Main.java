package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            Scene mainWindow = new Scene(root);
            primaryStage.setTitle("Hello World");
            primaryStage.setScene(mainWindow);
            String css = this.getClass().getResource("sample.css").toExternalForm();
            mainWindow.getStylesheets().add(css);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
