package Lecture2.Example2;

import java.util.Arrays;

public class SortingFish {
    public static void main(String[] args) {
        Fish2[] fishArray = new Fish2[5];
        fishArray[0] = new Fish2("Northern pike", 0.5);
        fishArray[1] = new Fish2("European perch", 0.3);
        fishArray[2] = new Fish2("Atlantic salmon", 4.5);
        fishArray[3] = new Fish2("Atlantic herring", 0.4);
        fishArray[4] = new Fish2("European flounder", 0.3);

        for (Fish2 f : fishArray) {
            System.out.print(f.getName() + ", ");
        }
        System.out.println();

        Arrays.sort(fishArray);

        for (Fish2 f : fishArray) {
            System.out.print(f.getName() + ", ");
        }
    }
}
