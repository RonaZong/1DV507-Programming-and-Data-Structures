package Lecture6.Example5;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class WithoutLayout extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Label lblSW = new Label("Star Wars");
        Label lblDW = new Label("Doctor Who");
        Label lblPF = new Label("Pink Floyd");

        Group root = new Group();
        root.getChildren().addAll(lblSW, lblDW, lblPF);

        Scene scene = new Scene(root, 300, 200);
        stage.setTitle("Without Layout");
        stage.setScene(scene);
        stage.show();

    }
}
