package Lecture6.Example2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Text is not only a Node but also
 * a Shape and needs to be put into something
 */

/**
 * Group is a Node, Parent
 */

/**
 * All programs need a Scene
 * and we attach the root node
 */
public class JavaFXLecture extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Text text = new Text(20, 50, "Any sufficiently advanced technology is indistinguishable from magic.");

        Group root = new Group();
        root.getChildren().add(text);

        Scene scene = new Scene(root, 500, 100);

        stage.setTitle("Hello World!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
