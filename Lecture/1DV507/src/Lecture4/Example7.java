package Lecture4;

import java.util.stream.Stream;

public class Example7 {
    public static void main(String[] args) {
        Stream<Double> randomDoubles = Stream.generate(Math::random).limit(60);

        System.out.println(randomDoubles);
    }
}
