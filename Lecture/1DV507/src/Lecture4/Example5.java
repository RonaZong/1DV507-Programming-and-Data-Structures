package Lecture4;

import java.util.stream.IntStream;

public class Example5 {
    public static void main(String[] args) {
        int[] values = {6, 9, 2, 1, 3, 7, 8, 4};
        System.out.println(IntStream.of(values).average().getAsDouble());
    }
}
