package Lecture2.Example1;

public class Sentient extends Species {
    private String language;

    public Sentient() {
    }

    public Sentient(String name, String desc, String language) {
        super(name, desc);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String toString() {
        return super.getName() + " with the description \"" + super.getDesc() + "\". " + getName() + " speaks " + language;
    }
}
