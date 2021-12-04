package Lecture6.Example4;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontSmoothingType;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * setOnAction()
 */

public class Actions extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Go for it... Press the button!");
        final Text theText = new Text(10, 70, "May the Force be with You!");
        theText.setFontSmoothingType(FontSmoothingType.LCD);
        Font font = Font.font("Serif", 30);
        theText.setFont(font);

        DropShadow ds = new DropShadow();
        ds.setOffsetX(2.0f);
        ds.setOffsetY(2.0f);
        ds.setColor(Color.rgb(50, 50, 50, .588));
        theText.setEffect(ds);

        Button theButton = new Button("Change text");

        theButton.setOnAction(e -> {
            if (!theText.getText().equals("Shine on you crazy diamond")) {
                theText.setText("Shine on you crazy diamond");
            }
            else {
                theText.setText("May the Force be with You!");
            }
        });

        Group group = new Group();
        group.getChildren().addAll(theButton, theText);

        stage.setScene(new Scene(group, 450, 150));
        stage.show();
    }
}
