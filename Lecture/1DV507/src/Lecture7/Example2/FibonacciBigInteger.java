package Lecture7.Example2;

import java.math.BigInteger;

public class FibonacciBigInteger {
    public static void main(String[] args) {
        fibIterate(100);
    }

    private static void fibIterate(int N) {
        BigInteger fm2 = new BigInteger("0");
        BigInteger fm1 = new BigInteger("1");
        BigInteger f = new BigInteger("0");
        for (int i = 2; i < N; i++) {
            f = fm1.add(fm2);
            System.out.println(i + "\t" + f);
            fm2 = fm1;
            fm1 = f;
        }
    }
}
