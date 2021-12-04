package vr222ed_assign4;

import java.io.*;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Scanner;

public class countWord {

    private static int i;

    public static void main(String[] args) throws Exception {
        count();

    }

    public static void count() {
    String inputName = "lovecraft.txt";
    File input = new File(Paths.get(inputName).toAbsolutePath().toString());
        try {
        BufferedReader bf = new BufferedReader(new FileReader(inputName));
        String current;
        while (bf.ready()) {
        scanLine(bf.readLine());
        }
    } catch (
    IOException e) {
        e.printStackTrace();
    }
    }

    public static void scanLine(String line) {

        String[] words = line.split("\\s+");
        for (String word : words) {
            i++;
            }
        System.out.println(i);
        }
    }

