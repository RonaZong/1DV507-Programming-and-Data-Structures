package Lecture4;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;

public class Example9 {
    public static void main(String[] args) throws IOException {
        String newContents = new String(Files.readAllBytes(Paths.get("C:\\Java\\IdeaProjects\\Lecture\\1DV507\\src\\Lecture4\\theBible.txt")), StandardCharsets.UTF_8);
        List<String> newWords = Arrays.asList(newContents.split("[\\P{L}]+"));

        long startTime1 = System.nanoTime();
        long numberOfWords = newWords.stream().count();
        long stopTime1 = System.nanoTime();
        System.out.println("Number of words in the Veda: " + numberOfWords + " in " + (stopTime1 - startTime1));

        long startTime2 = System.nanoTime();
        long numberOfWordsP = newWords.parallelStream().count();
        long stopTime2 = System.nanoTime();
        System.out.println("Number of words in the Veda: " + numberOfWordsP + " in " + (stopTime2 - startTime2));


        // or
        Instant start = Instant.now();
        long numberOfWordsI = newWords.stream().count();
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        long millis = timeElapsed.toMillis();
        System.out.println("Number of words: " + numberOfWordsI + " in " + millis);
    }
}
