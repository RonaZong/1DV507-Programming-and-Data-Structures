package Lecture5.Example2;

public class Sorting {
    // A static method sorting an integer array using Selection Sort
    public static void sort(int[] in) {
        int sz = in.length;
        for (int i = 0; i < sz - 1; i++) {
            int first = i;
            int min = first;
            for (int j = first + 1; j < sz; j++) {
                if (in[j] < in[min]) {
                    min = j;
                }
            }

            /* Swap first and min */
            int tmp = in[first];
            in[first] = in[min];
            in[min] = tmp;
        }
    }
}
