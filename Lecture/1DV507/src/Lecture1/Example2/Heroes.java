package Lecture1.Example2;

public class Heroes {
    public static void main(String[] args) {
        Superhero[] myHeroes = new Superhero[5];

        myHeroes[0] = new Supernatural("Superman", "fly");
        myHeroes[1] = new Natural("Iron man", "superior technology");
        myHeroes[2] = new Natural("Batman", "his fantastic brain");
        myHeroes[3] = new Supernatural("Wolverine", "fight with claws");
        myHeroes[4] = new Supernatural("The flash", "run fast");

        for (Superhero s: myHeroes) {
            System.out.println(s.action());
        }
    }
}
