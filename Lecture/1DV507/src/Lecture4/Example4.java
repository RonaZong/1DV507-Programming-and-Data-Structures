package Lecture4;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example4 {
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get("C:\\Java\\IdeaProjects\\Lecture\\1DV507\\src\\Lecture4\\theBible.txt")), StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(contents.split("[\\P{L}]+"));

        int counterIter = 0;
        for (String w : words) {
            if (w.length() > 7) {
                counterIter++;
            }
        }
        System.out.println("Number of words more than 7 letters: "+ counterIter);

        // Using internal iterator (lambda)
        long counterStream = words.stream().filter(w -> w.length() > 7).count();
        System.out.println("Number of words more than 7 letters: " + counterStream);

        // change words to lower case and count the number of words starting with q
        long qWords = words.stream().map(String :: toLowerCase).filter(s -> s.startsWith("q")).count();
        System.out.println("Number of words starting with q: " + qWords);

        //
        long uniqueWords = words.stream().distinct().count();
        System.out.println("Number of unique words: " + uniqueWords);

        //
        List<String> uniqueWordsList = words.stream().map(String::toLowerCase).distinct().filter(s -> s.startsWith("q")).collect(Collectors.toList());
        for (String w : uniqueWordsList) {
            System.out.println(w);
        }

        //
        uniqueWordsList.stream().forEach(System.out::println);
    }
}
