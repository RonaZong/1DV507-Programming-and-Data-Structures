package Lecture1.Example2;

public class Supernatural extends Superhero {
    private String power;

    public Supernatural() {
    }

    public Supernatural(String power) {
        this.power = power;
    }

    public Supernatural(String name, String power) {
        super(name);
        this.power = power;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String action() {
        return super.action() + power + " to save you!";
    }
}
