package Lecture6.Example7;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Both are put inside of a ToggleGroup to group the choices together
 */

public class RadioAndCheckBox extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Pizza Maker");
        VBox layout = new VBox();
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(5, 5, 5, 5));
        layout.setSpacing(5);

        Label heading = new Label("Pizza Maker Mega Ultra Plus");
        heading.setFont(new Font("Confortaa", 42));

        VBox boxCrust = new VBox();
        boxCrust.setPadding(new Insets(10, 0, 0, 0));
        boxCrust.setSpacing(10);
        Label lblCrust = new Label("Choose your crust:");
        RadioButton deep = new RadioButton("Deep pan");
        RadioButton thin = new RadioButton("Thin and crispy");
        ToggleGroup tglCrust = new ToggleGroup();
        deep.setToggleGroup(tglCrust);
        thin.setToggleGroup(tglCrust);
        boxCrust.getChildren().addAll(lblCrust, deep, thin);

        VBox boxTopping = new VBox();
        boxTopping.setPadding(new Insets(20, 0, 0, 0));
        boxTopping.setSpacing(10);
        Label lblTopping = new Label("Select your toppings:");
        CheckBox olives = new CheckBox("Olives");
        CheckBox anchovies = new CheckBox("Anchovies");
        CheckBox pineapple = new CheckBox("Pineapple");
        CheckBox mushrooms = new CheckBox("Mushrooms");
        boxTopping.getChildren().addAll(lblTopping, olives, anchovies, pineapple, mushrooms);

        VBox boxOrder = new VBox();
        boxOrder.setPadding(new Insets(20, 0, 0, 0));
        boxOrder.setSpacing(20);
        Button order = new Button("Place your order!");
        final Label answer = new Label();
        final StringBuilder theOrder = new StringBuilder("You have ordered ");

        order.setOnAction(e -> {
            if (deep.isSelected()) {
                theOrder.append(" a deep pan pizza with: ");
            }
            else if (thin.isSelected()) {
                theOrder.append(" a thin and crusty pizza with: ");
            }

            if (olives.isSelected()) {
                theOrder.append("olives ");
            }
            if (anchovies.isSelected()) {
                theOrder.append("anchovies ");
            }
            if (pineapple.isSelected()) {
                theOrder.append("pineapple ");
            }
            if (mushrooms.isSelected()) {
                theOrder.append("mushrooms ");
            }

            answer.setText(theOrder.toString());
        });
        boxOrder.getChildren().addAll(order, answer);

        layout.getChildren().addAll(heading, boxCrust, boxTopping, boxOrder);

        Scene scene = new Scene(layout, 600, 400);
        stage.setScene(scene);
        stage.show();
    }
}
