package Lecture6.Example1;

import java.awt.*;

public class GUI_AWT {
    public static void main(String[] args) {
        Frame theFrame = new Frame("The Window");
        Button theButton = new Button("A Button");
        TextField theText = new TextField("Hello from AWT");
        theFrame.setTitle("AWT Example");
        theFrame.setSize(300, 400);
        theFrame.add("Center", theText);
        theFrame.add("South", theButton);
        theFrame.setVisible(true);
    }
}
