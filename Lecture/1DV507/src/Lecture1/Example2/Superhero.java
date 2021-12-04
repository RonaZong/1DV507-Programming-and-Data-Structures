package Lecture1.Example2;

public class Superhero {
    private String name;

    public Superhero(){
    }

    public Superhero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String action() {
        return name + " will ";
    }
}
