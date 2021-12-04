package Lecture7.Example2;

public class FibonacciBetter {
    public static void main(String[] args) {
        int N = 90;
        long fm2 = 0, fm1 = 1, f;
        for (int i = 3; i < N; i++) {
            f = fm1 + fm2;
            System.out.println(i + "\t" + f);
            fm2 = fm1;
            fm1 = f;
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
