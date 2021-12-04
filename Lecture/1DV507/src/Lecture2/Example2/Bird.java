package Lecture2.Example2;

public class Bird extends Animal{
    public Bird() {
    }

    public Bird(String name, double size) {
        super(name, size);
    }

    public String howToCatch() {
        return "Catch by shooting.";
    }

    public String howToCook() {
        return "Barbecue it to eat.";
    }

    public String toString() {
        return super.toString() + " " + howToCatch() + " " + howToCook();
    }
}
