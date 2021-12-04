package Lecture6.Example8;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * Place an ImageView control where the images is going to be displayed
 * Use an Image object to load and hold the image itself
 */

public class Images extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Image theImage = new Image("Lecture6\\Example8\\dice.png");
//        Image theImage = new Image(getClass().getResourceAsStream("Lecture6\Example8\Images.java"));
//        Image theImage = new Image("file:Lecture6\Example8\Images.java");
        ImageView theIV = new ImageView();
        theIV.setImage(theImage);

        Group group = new Group();
        group.getChildren().add(theIV);

        Scene scene = new Scene(group);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
