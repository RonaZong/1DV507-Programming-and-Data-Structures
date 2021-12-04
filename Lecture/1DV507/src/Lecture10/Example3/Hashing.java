package Lecture10.Example3;

import java.util.HashSet;

public class Hashing {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Hello");

        System.out.println(hashSet.hashCode() % 64);
        System.out.println(hashSet.size());
    }
}
