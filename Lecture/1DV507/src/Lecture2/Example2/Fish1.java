package Lecture2.Example2;

public class Fish1 extends Animal {
    public Fish1() {
    }

    public Fish1(String name, double size) {
        super(name, size);
    }

    public String howToCatch() {
        return "Catch using a fishing rod.";
    }

    public String howToCook() {
        return "Cook with loads of butter.";
    }

    public String toString() {
        return super.toString() + " " + howToCatch() + " " + howToCook();
    }
}
