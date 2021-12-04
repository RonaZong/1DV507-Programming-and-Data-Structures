package Lecture2.Example1;

public class NonSentient extends Species {
    private String food;

    public NonSentient() {
    }

    public NonSentient(String name, String desc, String food) {
        super(name, desc);
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String toString() {
        return super.getName() + " with the description \"" + super.getDesc() + "\". It eats " + food;
    }
}
