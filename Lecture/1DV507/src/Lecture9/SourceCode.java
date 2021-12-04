//package Lecture9;
//
//import javafx.event.ActionEvent;
//import javafx.geometry.Insets;
//import javafx.scene.Scene;
//import javafx.scene.control.ComboBox;
//import javafx.scene.effect.Reflection;
//import javafx.scene.layout.VBox;
//import javafx.stage.Stage;
//
//import javax.swing.text.html.ImageView;
//import java.awt.*;
//
//public class SourceCode {
//    public void start(Stage primaryStage) {
//        VBox layout = new VBox();
//        layout.setPadding(new Insets(5, 5, 5, 5));
//        ComboBox<String> pinkFloyd = new ComboBox<>();
//        pinkFloyd.getItems().addAll(
//                "The Piper at the Gates of Dawn", "A Saurcerful of Secrets", "More",
//                "Ummagumma", "Atom Heart Mother", "Meddle", "Obscured by Clouds",
//                "Dark Side of the Moon", "Wish You Were Here", "Animals", "The Wall",
//                "The Final Cut", "A Momentry Lapse of Reason", "The Division Bell",
//                "The Endless River"
//        );
//        VBox imageBox = new VBox();
//        imageBox.setPadding(new Insets(25, 5, 5, 5));
//        javafx.scene.image.Image theAlbum = new Image("file:The Watch Maker.jpg");
//        javafx.scene.image.ImageView showAlbum = new ImageView(theAlbum);
//        showAlbum.setFitWidth(100.0);
//        showAlbum.setPreserveRatio(true);
//        Reflection refl = new Reflection();
//        refl.setFraction(0.8);
//        showAlbum.setEffect(refl);
//        imageBox.getChildren().add(showAlbum);
//        layout.getChildren().addAll(pinkFloyd, imageBox);
//
//
//        pinkFloyd.setOnAction((ActionEvent e) -> {
//            if (pinkFloyd.getValue().equals("The Piper at the Gates of Dawn"))
//                showAlbum.setImage(new Image("file:images/piper.jpg"));
//            else if (pinkFloyd.getValue().equals("A Saurcerful of Secrets"))
//                showAlbum.setImage(new Image("file:images/saucer.jpg"));
//            else if (pinkFloyd.getValue().equals("More"))
//                showAlbum.setImage(new Image("file:images/more.jpg"));
//                // More albums have been cut due to space...
//            else if (pinkFloyd.getValue().equals("The Wall"))
//                showAlbum.setImage(new Image("file:images/wall.jpg"));
//            else if (pinkFloyd.getValue().equals("The Final Cut"))
//                showAlbum.setImage(new Image("file:images/final.jpg"));
//            else if (pinkFloyd.getValue().equals("A Momentary Lapse of Reason"))
//                showAlbum.setImage(new Image("file:images/mlor.jpg"));
//            else if (pinkFloyd.getValue().equals("The Division Bell"))
//                showAlbum.setImage(new Image("file:images/divbell.jpg"));
//            else if (pinkFloyd.getValue().equals("The Endless River"))
//                showAlbum.setImage(new Image("file:images/river.jpg"));
//        });
//        Scene scene = new Scene(layout, 300, 250);
//        primaryStage.setTitle("Pink Floyd");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//}
//
//
