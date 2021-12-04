package Lecture6.Example1;

import javax.swing.*;

public class GUI_Swing {
    public static void main(String[] args) {
        JFrame theFrame = new JFrame("A Window");
        JButton theButton = new JButton("A Button");
        JTextField theText = new JTextField("Hello from Swing");
        JSlider theSlider = new JSlider();
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theFrame.setBounds(100, 100, 200, 200);
        theFrame.setVisible(true);
        theFrame.add("North", theSlider);
        theFrame.add("Center", theText);
        theFrame.add("South", theButton);
        theFrame.setVisible(true);
    }
}
