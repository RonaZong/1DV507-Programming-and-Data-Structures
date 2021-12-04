package Lecture1.Example1;

public class Fighter extends Starship {
    private int noOfWeapons;

    public Fighter() {
    }

    public Fighter(String make, String model, int noOfWeapons) { // new constructor
        super(make, model);
        this.noOfWeapons = noOfWeapons;
    }

    public Fighter(int noOfWeapons) {
        this.noOfWeapons = noOfWeapons;
    }

    public int getNoOfWeapons() {
        return noOfWeapons;
    }

    public void setNoOfWeapons(int noOfWeapons) {
        this.noOfWeapons = noOfWeapons;
    }

    @Override
    public String toString() {
        return super.toString() + " with " + noOfWeapons + " weapons.";
    }
}
