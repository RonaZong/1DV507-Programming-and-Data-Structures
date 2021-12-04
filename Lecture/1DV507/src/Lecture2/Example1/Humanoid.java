package Lecture2.Example1;

public class Humanoid extends Sentient {
    private String feature;

    public Humanoid() {
    }

    public Humanoid(String name, String desc, String language, String feature) {
        super(name, desc, language);
        this.feature = feature;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String toString() {
        return super.toString() + " and its feature is " + feature;
    }
}
