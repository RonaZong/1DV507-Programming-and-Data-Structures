package Lecture6.Example5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Layouts are used as they make it possible to predict
 * the behaviour of programs on different platforms
 * Panes - work by defining an area with
 * a specific behaviour for placing visual components
 */

/**
 * Pane
 * GridPane - dividing the window into different areas
 * (top, left, centre and so on)
 * AnchorPane - controls to be attached to each others
 */

/**
 * VBox
 * HBox
 * setPadding() - for the space around the layout box
 * setSpacing() - for the space around the controls of the box
 * setPrefSize() - to adjust the size of the visible components themselves
 */

public class Layout extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Label lblSW = new Label("Star Wars"); Label lblBR = new Label("Blade Runner");
        Label lblDW = new Label("Doctor Who"); Label lblDC = new Label("DC's Legends of Tomorrow");
        Label lblPF = new Label("Pink Floyd"); Label lblAO = new Label("And One");

        VBox root = new VBox();
        root.setPadding(new Insets(5));
        root.setSpacing(5);

        HBox horizontally = new HBox();
        horizontally.setPadding(new Insets(5));
        horizontally.setSpacing(5);
        horizontally.getChildren().addAll(lblSW, lblDW, lblPF);

        VBox vertically = new VBox();
        vertically.setPadding(new Insets(5));
        vertically.setSpacing(5);
        vertically.getChildren().addAll(lblBR, lblDC, lblAO);

        root.getChildren().addAll(horizontally, vertically);

        Scene scene = new Scene(root, 300, 200);
        stage.setTitle("With Layout");
        stage.setScene(scene);
        stage.show();
    }
}
