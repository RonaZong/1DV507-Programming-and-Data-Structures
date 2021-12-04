package Lecture1.Example1;

public class Starship {
    private String make;
    private String model;

    public Starship() {
    }

    public Starship(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    //Overriding methods
    public String toString() {
        return "This is a " + make + " " + model;
    }
}
