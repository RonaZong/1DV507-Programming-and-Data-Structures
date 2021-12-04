package Lecture1.Example2;

public class Natural extends Superhero {
    private String advantage;

    public Natural() {
    }

    public Natural(String advantage) {
        this.advantage = advantage;
    }

    public Natural(String name, String advantage) {
        super(name);
        this.advantage = advantage;
    }

    public String getAdvantage() {
        return advantage;
    }

    public void setAdvantage(String advantage) {
        this.advantage = advantage;
    }

    public String action() {
        return super.action() + "use " + advantage + " to save you!";
    }
}
