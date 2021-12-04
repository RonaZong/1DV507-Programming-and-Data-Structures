package Lecture1.Example1;

public class FullHanger {
    public static void main(String[] args) {
        Starship[] listOfShips = new Starship[3];
        listOfShips[0] = new Fighter("Incom Corporation", "T-65 X-wing starfighter", 6);
        listOfShips[1] = new Freighter("Corellian Engineering Coporation", "YT-1300", 100);
        listOfShips[2] = new Fighter("Koensayr Manufacturing", "BTL Y-wing", 5);

        for (Starship s: listOfShips) {
            System.out.println("The model is called " + s.getModel());
        }
    }
}
