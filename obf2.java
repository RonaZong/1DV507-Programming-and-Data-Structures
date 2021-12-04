package vr222ed_assign4;

import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;

public class obf2 {
    public static void print() {
        System.out.println("Obscure\r\n" +
                "=======\n"
                + "1. Make obscure\r\n" +
                "2. Make readable\r\n" +
                "3. Print obscure\r\n" +
                "4. Print readable\r\n" +
                "0. Exit");
    }

    public static void obf(boolean en) {
        String inputName = "lovecraft.txt";
        String outputName = "EncryptedLovecraft.txt";
        if (!en) {
            String temp = inputName;
            inputName = outputName;
            outputName = temp;
        }

        CircularArr a = new CircularArr();
        File input = new File(Paths.get(inputName).toAbsolutePath().toString());
        if (!input.exists()) {
            System.out.println("Does not exist");
        }
        try {
            BufferedReader bf = new BufferedReader(new FileReader(inputName));
            File output = new File(outputName);
            output.createNewFile();
            FileWriter wr = new FileWriter(output);
            String current;
            while (bf.ready()) {
                wr.write(a.get((char) bf.read(), en));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printF(boolean enc) throws IOException {
        String path = "EncryptedLovecraft.txt";
        String current;
        if (!enc) {
            path = "lovecraft.txt";
        }
        BufferedReader bf = new BufferedReader(new FileReader(path));
        while (bf.ready()) {
            current = bf.readLine();
            System.out.println(current);
        }
    }

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        boolean run = true;
        int c = -1;
        print();
        do {
            print();
            c = s.nextInt();
            switch (c) {
                case 1: obf(true); break;
                case 2: obf(false); break;
                case 3: printF(true); break;
                case 4: printF(false); break;
                case 0: System.exit(0);
                default:  break;
            }
        }
        while (c!=0);
    }
}

