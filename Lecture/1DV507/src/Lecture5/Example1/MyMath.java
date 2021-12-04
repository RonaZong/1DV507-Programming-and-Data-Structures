package Lecture5.Example1;

public class MyMath {
    // A static method computing a*b using recursion
    // Requires 2nd argument b to be non-negative
    public static int mult(int a, int b) throws IllegalAccessException {
        if (b < 0) {
            throw new IllegalAccessException("2nd parameter must be non-negative");
        }
        else if (b == 0)
            return 0;
        else
            return a + mult(a, b - 1);
    }
}
