package Lecture6.Example2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * DropShadow
 * GaussianBlur
 * InnerShadow
 * Reflection
 * All nodes are treated as vector graphics
 * Effects are classes which transform or add visual properties to nodes
 */

public class Effects extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Text text = new Text(10, 50, "I do not fear computers. I fear the lack of them.");
        text.setFont(Font.font("Sanserif", 20));

        DropShadow ds = new DropShadow();
        ds.setOffsetX(2.0f);
        ds.setOffsetY(2.0f);
        ds.setColor(Color.rgb(50, 50, 50, .588));

        text.setEffect(ds);

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
