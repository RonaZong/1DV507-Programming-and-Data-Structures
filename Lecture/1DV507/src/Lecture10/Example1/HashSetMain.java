package Lecture10.Example1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetMain {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<String>();
        Set<String> set = new TreeSet<>();

        set.add("Jonas");
        set.add("Jens");
        set.add("Jesper");
        set.add("Johan");
        System.out.println("Size: " + set.size());

        if (set.contains("Jesper")) {
            System.out.println("Contains Jesper");
        }
        if (set.contains("Maria")) {
            System.out.println("Contains Maria");
        }

        set.remove("Jesper");
        System.out.println("Size: " + set.size());
    }
}
