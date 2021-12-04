package Lecture1.Example3;

public class JediObjectCheck {
    public static void main(String[] args) {
        Jedi tiin = new Jedi("Saesee Tiin");
        Jedi saesee = new Jedi("Saesee Tiin");

        System.out.println(tiin.toString());
        System.out.println(saesee.toString());
        System.out.println(tiin.getClass());

        if (tiin.equals(saesee)) {
            System.out.println("The same");
        }
        else
            System.out.println("Not the same");
    }
}
