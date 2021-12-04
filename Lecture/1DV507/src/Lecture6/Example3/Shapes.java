package Lecture6.Example3;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

/**
 * Line
 * Rectangle
 * Circle
 * Arc
 * The coordinate system sets the (0,0) in the upper left corner
 */

public class Shapes extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();

        Circle cockpit = new Circle(320, 240, 50);
        cockpit.setStroke(Color.BLACK);
        cockpit.setStrokeWidth(10.0);
        cockpit.setFill(null);

        Line connector1 = new Line(250, 240, 270, 240);
        connector1.setStrokeWidth(10.0);

        Line connector2 = new Line(370, 240, 390, 240);
        connector2.setStrokeWidth(10.0);

        Line leftWing = new Line(240, 150, 240, 330);
        leftWing.setStrokeWidth(10.0);

        Line rightWing = new Line(400, 150, 400, 330);
        rightWing.setStrokeWidth(10.0);

        Polygon window = new Polygon();
        window.getPoints().addAll(new Double[]{
                305.0, 200.0,
                335.0, 200.0,
                355.0, 220.0,
                355.0, 250.0,
                335.0, 270.0,
                305.0, 270.0,
                285.0, 250.0,
                285.0, 220.0
        });

        Circle leftCannon = new Circle(305, 275, 5);
        leftCannon.setStrokeWidth(1.0);
        leftCannon.setStroke(Color.BLACK);
        leftCannon.setFill(Color.RED);

        Circle rightCannon = new Circle(335, 275, 5);
        rightCannon.setStrokeWidth(1.0);
        rightCannon.setStroke(Color.BLACK);
        rightCannon.setFill(Color.RED);

        root.getChildren().addAll(cockpit, connector1, connector2,
                leftWing, rightWing, window, leftCannon, rightCannon);

        Scene scene = new Scene(root, 640, 480);

        stage.setTitle("Aaaaaaargh");
        stage.setScene(scene);
        stage.show();
    }
}
