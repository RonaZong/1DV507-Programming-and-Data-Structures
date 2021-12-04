package Lecture4;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Example11 {
    public static void main(String[] args) {
        var number = 10;
        number++;
        System.out.println(number);

        var list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list.get(2));

        var randomNumbers = new SecureRandom();
        var numbers = randomNumbers.ints(10, 1, 7).mapToObj(String::valueOf).collect(Collectors.joining(" "));
        System.out.println(numbers);
    }
}
