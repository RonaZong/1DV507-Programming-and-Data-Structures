package Lecture1.Example3;

public class Jedi {
    private String name;

    public Jedi() {
    }

    public Jedi(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Jedi) {
            if (this.name.equals(((Jedi) obj).getName())) {
                return true;
            }
        }
        return false;
    }
}
