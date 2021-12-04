package Lecture8.Example2;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {12, 3, 43, 2, 43, 23};
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int[] selectionSort(int[] arr) {
        int sz = arr.length;
        for (int i = 0; i < sz - 1; i++) {
            int update = i;
            int min = update;
            for (int j = update + 1; j < sz; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            /* Swap update and min */
            int tmp = arr[update];
            arr[update] = arr[min];
            arr[min] = tmp;
        }
        return arr;
    }
}
