package Lecture7.Example1;

public class Infinite {
    public static void main(String[] args) {
        System.out.println(m(0));
    }

    private static int m(int n) {
        return m(n + 1);
    }
}
