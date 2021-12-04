package Lecture7.Example2;

public class Hanoi {
    public static void main(String[] args) {
        moveTower(6, 1, 2, 3);
    }

    public static void moveTower(int numDisks, int start, int end, int temp) {
        if (numDisks == 1) {
            System.out.println("Move disc from " + start + " to " + end);
        }
        else {
            moveTower(numDisks - 1, start, temp, end);
            System.out.println("Move disc from " + start + " to " + end);
            moveTower(numDisks - 1, temp, end, start);
        }
    }
}
