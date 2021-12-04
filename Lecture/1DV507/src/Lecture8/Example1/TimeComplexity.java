package Lecture8.Example1;

public class TimeComplexity {
    public static void main(String[] args) {
        printTable(5);

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(search(5, arr));
    }

    /**
     * multiplication table for N = O(n^2)
     * @param N
     */
    private static void printTable(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println(i * j);
            }
        }
    }

    /**
     * X in array of size N = O(N)
     */
    private static boolean search(int X, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == X) {
                return true;
            }
        }
        return false;
    }
}
