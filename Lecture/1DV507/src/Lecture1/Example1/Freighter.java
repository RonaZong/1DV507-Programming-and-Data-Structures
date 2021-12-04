package Lecture1.Example1;

public class Freighter extends Starship {
    private int capacity;

    public Freighter(String make, String model, int capacity) { // new constructor
        super(make, model);
        this.capacity = capacity;
    }

    public Freighter(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}
