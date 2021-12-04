package Lecture2.Example1;

public abstract class Species {
    private String name;
    private String desc;

    public Species() {
    }

    public Species(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract String toString();
}
