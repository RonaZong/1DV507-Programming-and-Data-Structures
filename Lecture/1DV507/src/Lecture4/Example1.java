package Lecture4;

/**
 * (parameter1, parameter2 ...) -> {Block of code}
 */

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Example1 {
    public static void main(String[] args) {
        /**
         * A lambda returning the comparision between two strings using compare
         */
        BiFunction<String, String, Integer> comp = (str1, str2) -> Integer.compare(str1.length(), str2.length());
        int res = comp.apply("Anakin Skywalker", "Darth Vader");

        /**
         * If only one parameter is used, then the parenthesis can be left out as well
         */
        Consumer<String> valueOutput = value -> System.out.println(value + "");
        valueOutput.accept(res + "");

        /** better */
        Consumer<String> moreOutput = (System.out::println);
        moreOutput.accept("Let's end this");

        /**
        A simple lambda returning a string
         */
        Supplier<String> output = () -> "The End!";
        valueOutput.accept(output.get());

        Runnable really = () -> System.out.println("Now, really -- The End!");
        really.run();

//        btn.setOnAction(event -> {
//            System.out.println("Hello World!");
//        });

    }
}
