package Lecture4;

import java.util.Arrays;

public class Example3 {
    public static void main(String[] args) {
        double[] numbers = {1, 24, 36, 42, 75, 4, 93, 31, 5, 36, 9};

        double total = 0;
        for (double element : numbers) {
            total += element;
        }

        System.out.println(total);

        double total2 = Arrays.stream(numbers).sum();
        System.out.println(total2);
    }
}
