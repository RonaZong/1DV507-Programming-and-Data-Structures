package Lecture5.Example5;

public class GenValueMain {
    public static void main(String[] args) {
        GenValue<Integer> i1 = new GenValue<Integer>(7);
        i1.setValue(23);
        System.out.println("Integers: "+ i1.toString() + "\t" + i1.getValue());

        GenValue<String> s1 = new GenValue<String>("Hello");
        System.out.println("\nString: " + s1.toString() + "\t" + s1.getValue());
        GenValue<String> s2 = new GenValue<String>("World!");
        System.out.println("\nString: " + s2.toString() + "\t" + s2.getValue());

        String msg = s1.equals(s2) ? "equal" : "not equal";
        System.out.println("They are " + msg);
    }
}
