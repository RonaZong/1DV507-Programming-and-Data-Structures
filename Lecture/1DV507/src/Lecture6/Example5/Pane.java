package Lecture6.Example5;


import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * GridPane - each node is placed in columns and rows which are indexed from 0 and up
 * Alignment can be set both for the pane itself
 * but also for eh individual nodes
 */

public class Pane extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Login");

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.4));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        pane.add(new Label("User name:"), 0, 0);
        final TextField username = new TextField();
        pane.add(username, 1, 0);

        pane.add(new Label("Password:"), 0, 1);
        final PasswordField password = new PasswordField();
        pane.add(password, 1, 1);

        final Label  result = new Label();
        pane.add(result, 0, 2);

        Button testLogin = new Button("Login");
        pane.add(testLogin, 1, 2);
        GridPane.setHalignment(testLogin, HPos.RIGHT);

        testLogin.setOnAction(e -> {
            if (username.getText().equals("CharlesClemens") && password.getText().equals("Pink Floyd")) {
                result.setText("OK");
            }
            else {
                result.setText("No way!");
            }
        });

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }
}
