package Lecture2.Example2;

public class Fish2 extends Animal implements Comparable<Fish2> {
    public Fish2() {
    }

    public Fish2(String name, double size) {
        super(name,size);
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

    public int compareTo(Fish2 o) {
        if (this.getSize() > o.getSize()) {
            return 1;
        }
        else if (this.getSize() < o.getSize()) {
            return -1;
        }
        else
            return 0;
    }
}
