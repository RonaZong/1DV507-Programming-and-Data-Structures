package Lecture2.Example1;

public class NonHumanoid extends Sentient {
    private int arms;
    private int legs;

    public NonHumanoid() {
    }

    public NonHumanoid(String name, String desc, String language, int arms, int legs) {
        super(name, desc, language);
        this.arms = arms;
        this.legs = legs;
    }

    public int getArms() {
        return arms;
    }

    public void setArms(int arms) {
        this.arms = arms;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String toString() {
        return super.toString() + " and has " + arms + " arms and " + legs + " legs";
    }
}
