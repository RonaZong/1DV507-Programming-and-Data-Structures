package Lecture7.Example3;

public class ArgsMain {
    public static void main(String[] args) {
        System.out.println("Arguments: " + args.length);
        for (String s : args) {
            System.out.println("\t" + s);
        }
    }
}
