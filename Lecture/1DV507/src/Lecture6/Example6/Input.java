package Lecture6.Example6;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * TextField - all controls inheriting from TextInput can be use
 * setText() and getText()
 * copy(), cut(), paste(), selectAll()
 */

public class Input extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        TextField left = new TextField();
        left.setPrefSize(100, 20);

        Label right = new Label();
        right.setPrefSize(100,20);

        Button btn = new Button();
        btn.setText(" -> Copy -> ");
        btn.setPrefSize(150, 20);
        btn.setOnAction(e -> {
            right.setText(left.getText());
        });

        HBox root = new HBox();
        root.setPadding(new Insets(10));
        root.setSpacing(5);
        root.getChildren().addAll(left, btn, right);

        Scene scene = new Scene(root, 350, 50);

        stage.setTitle("Copy");
        stage.setScene(scene);
        stage.show();
    }
}
