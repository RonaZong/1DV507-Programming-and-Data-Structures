package Lecture7.Example1;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(4));
        for (int i = 0; i < 100; i++) {
            System.out.println(fib(i));
        }
    }

    private static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
