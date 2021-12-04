package Lecture5.Example4;

import java.util.ArrayList;
import java.util.List;

public class GenericMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }

        for (int i = 0; i < list.size(); i++) {
            int n = list.get(i);
            System.out.print(" " + n);
        }
        System.out.println("\n");

        List raw = new ArrayList();
        for (int i = 1; i <= 5; i++) {
            raw.add(i);
        }

        for (int i = 0; i < raw.size(); i++) {
            int n = (Integer) raw.get(i);
            System.out.print(" " + n);
        }
    }
}
