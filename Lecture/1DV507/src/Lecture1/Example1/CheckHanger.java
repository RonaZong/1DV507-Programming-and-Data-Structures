package Lecture1.Example1;

public class CheckHanger {
    public static void main(String[] args) {
        Starship xwing = new Fighter();
        Starship aShip = new Starship();

        if (xwing instanceof Fighter)
            System.out.println("It\'s a fighter.");
        if (xwing instanceof Starship)
            System.out.println("It\' a starship.");
        if (!(aShip instanceof Fighter))
            System.out.println("It\'s not a fighter.");
    }
}
