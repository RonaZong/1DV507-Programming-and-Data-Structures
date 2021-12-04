package Lecture2.Example2;

public class ComparingFish {
    public static void main(String[] args) {
        Fish2 aFish = new Fish2("Northern pike", 0.5);
        Fish2 anotherFish = new Fish2("European perch", 0.3);

        if (aFish.compareTo(anotherFish) > 0) {
            System.out.println(aFish.getName() + " is the largest.");
        }
        else if (aFish.compareTo(anotherFish) < 0) {
            System.out.println(anotherFish.getName() + " is the largest.");
        }
        else
            System.out.println("They are equally large.");
    }
}
