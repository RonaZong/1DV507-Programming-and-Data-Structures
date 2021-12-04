package Lecture7.Example2;

import java.io.File;

public class DirectoryMain {
    public static void main(String[] args) {
        File startDir = new File("src\\Lecture7");
        visitSub(startDir);
    }

    private static int depth = 1, count = 0;

    private static void visitSub(File file) {
        if (file.isDirectory()) {
            printDir(file);
            depth++;
            File[] subs = file.listFiles();
            for (File f : subs) {
                visitSub(f);
            }
            depth--;
        }
    }

    private static void printDir(File file) {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < depth; i++) {
            buf.append(" ");
        }
        System.out.println((count++) + buf.toString() + file.getName());
    }
}
