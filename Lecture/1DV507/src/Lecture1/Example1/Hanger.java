package Lecture1.Example1;

public class Hanger {
    public static void main(String[] args) {
        Fighter xwing = new Fighter();
        xwing.setMake("Incom Corporation");
        xwing.setModel("T-65 X-wing starfighter");
        xwing.setNoOfWeapons(6);

        // Overriding = overwriting the behaviour that already exists
        System.out.println(xwing.toString());

        System.out.println("I fly a " + xwing.getModel() +
                "\nfrom " + xwing.getMake() +
                "\nand fire with my " + xwing.getNoOfWeapons() + " weapons!");
    }
}
