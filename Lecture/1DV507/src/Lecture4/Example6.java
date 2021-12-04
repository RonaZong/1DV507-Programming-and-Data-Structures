package Lecture4;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example6 {
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get("\"C:\\\\Java\\\\IdeaProjects\\\\Lecture\\\\1DV507\\\\src\\\\Lecture4\\\\theBible.txt")), StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(contents.split("[\\P{L}]+"));

        // the input to the method is to the function (lambda) to execute for change
        Stream<Character> firstChars = words.stream().map(s -> s.charAt(0));
        firstChars.forEach(value -> System.out.println(value + ""));

    }
}
