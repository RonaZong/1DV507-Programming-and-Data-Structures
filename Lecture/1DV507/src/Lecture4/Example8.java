package Lecture4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example8 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Roger Waters", "David Gilmour", "Nick Mason", "Richard Wright");
        Optional<String> found = names.stream().filter(s -> s.contains("David Gilmour")).findFirst();

        if (found.isPresent()) {
            System.out.println("The name " + found.get() + " was found");
        }
        else
            System.out.println("The name was not found!");
    }
}
