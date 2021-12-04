package Lecture2.Example2;

public abstract class Animal implements Edible, Catchable {
    private String name;
    private double size;

    public Animal() {
    }

    public Animal(String name, double size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String toString() {
        return "A(n) " + name + " is " + size + " meters.";
    }
}
