//package Lecture9;
//
//import javafx.scene.Scene;
//import javafx.scene.control.ListView;
//import javafx.scene.image.ImageView;
//import javafx.scene.layout.HBox;
//import javafx.stage.Stage;
//
//import java.awt.*;
//import java.util.ArrayList;
//
//public class TheCode {
//    public void start(Stage primaryStage) {
//        HBox layout = new HBox();
//        ListView<String> jediList = new ListView<>();
//        jediList.setPrefWidth(150);
//        jediList.getItems().addAll(
//                "Yoda",
//                "Mace Windu",
//                "Plo Koon",
//                "Ki-Adi-Mundi",
//                "Shaak Ti",
//                "Even Piell",
//                "Oppo Rancisis",
//                "Saesee Tinn",
//                "Coleman Trebor",
//                "Eeth Koth",
//                "Adi Gallia",
//                "Depa Billaba"
//        );
//        javafx.scene.image.Image jediImage = new Image("file:images/jediorder.png");
//        ImageView showJedi = new ImageView(jediImage);
//        showJedi.setFitWidth(200);
//        showJedi.setPreserveRatio(true);
//
//        final ArrayList<Image> manyJedi = new ArrayList<>();
//        manyJedi.add(new Image("file:images/yoda.png"));
//        manyJedi.add(new Image("file:images/macewindu.png"));
//        manyJedi.add(new Image("file:images/plokoon.png"));
//        manyJedi.add(new Image("file:images/kiadimundi.png"));
//        manyJedi.add(new Image("file:images/shaakti.png"));
//        manyJedi.add(new Image("file:images/evenpiell.png"));
//        manyJedi.add(new Image("file:images/Oppo.jpg"));
//        manyJedi.add(new Image("file:images/saeseetiin.png"));
//        manyJedi.add(new Image("file:images/Coleman.jpg"));
//        manyJedi.add(new Image("file:images/eethkoth.png"));
//        manyJedi.add(new Image("file:images/adigallia.png"));
//        manyJedi.add(new Image("file:images/Depa.jpg"));
//        layout.getChildren().addAll(jediList, showJedi);
//// Add a listener to a selection
//        jediList.getSelectionModel().selectedIndexProperty().addListener(ov -> {
//            showJedi.setImage(manyJedi.get(jediList.getSelectionModel().getSelectedIndex()));
//        });
//        Scene scene = new Scene(layout, 330, 250);
//        primaryStage.setTitle("Hello Jedi!");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//}