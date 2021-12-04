package Lecture4;

public class Example2 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};

        Runnable change = () -> {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    array[i] = array[i] + 1;
                }
            }
        };

        change.run();
    }
}
