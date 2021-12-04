package Lecture6.Example8;


import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * setFitWidth() or SetFirHeight()
 * setPreserveRatio(true)
 */

public class PartOfImage extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Image theImage = new Image("Lecture6\\Example8\\dice.png");
        ImageView theView = new ImageView(theImage);
        theView.setFitWidth(300);
        theView.setPreserveRatio(true);
        Rectangle2D rect = new Rectangle2D(200, 100, 100, 100);
        theView.setViewport(rect);
        theView.setRotate(45.0);

        Group group = new Group();
        group.getChildren().add(theView);
        Scene scene = new Scene(group, 300, 300);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
