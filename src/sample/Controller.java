package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Sphere;

public class Controller {

    @FXML
    private Sphere sphere; 
    private double x;
    private double y;

    public void exit(ActionEvent e) {
        System.out.println("Good Bye!");
        System.exit(0);
    }

    public void sayHelloWorld(ActionEvent e) {
        System.out.println("Hello World");
    }

    public void onDragSphere(){
        System.out.println("h");
    }
}
