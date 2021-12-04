package Lecture5.Example6;

import java.util.ArrayList;

public class GenericArrayListMain {
    public static void main(String[] args) {
        GenericArrayList<String> strList = new GenericArrayList<String>();
        ArrayList<String> sL = new ArrayList<String>();
        sL.add("a");
        sL.add("b");
        sL.add("c");

        strList.addAll(sL);
        System.out.println(strList);
    }
}
