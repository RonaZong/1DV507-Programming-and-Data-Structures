package Lecture2.Example1;

public class StarWarsCharacters {
    public static void main(String[] args) {
        Humanoid tiin = new Humanoid("Saesee Tiin", "was a male Iktochi from the moon Iktotch", "Basic", "horns");
        NonHumanoid jabba = new NonHumanoid("Jabba Desilijic Tiure", "was a Hutt and ganster", "Huttese", 2, 1);
        NonSentient tauntaun = new NonSentient("Tauntaun", "is a race of furry lizards from the planet Hoth", "floor lichen, ice scrabblers and Hoth hogs");

        System.out.println(tiin.toString());
        System.out.println(jabba.toString());
        System.out.println(tauntaun.toString());
    }
}
