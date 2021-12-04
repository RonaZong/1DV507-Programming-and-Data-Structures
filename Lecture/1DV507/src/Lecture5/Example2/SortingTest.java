package Lecture5.Example2;

import Lecture5.Example1.MyMath;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class SortingTest {

    @Test
    void sort() {
        // Dropping small tests (empty, singleton, few elements, ...)

        int[] arr5 = random(100, 100);
        Sorting.sort(arr5);
        for (int i = 0; i < arr5.length - 1; i++) {
            assertTrue(arr5[i] <= arr5[i + 1]);
        }

        int[] arr6 = random(100000, 1000000);
        Sorting.sort(arr6);
        for (int i = 0; i < arr6.length - 1; i++) {
            assertTrue(arr6[i] <= arr6[i + 1]);
        }

    }

    private int[] random(int size, int max) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1 + rand.nextInt(max);
        }
        return arr;
    }
}