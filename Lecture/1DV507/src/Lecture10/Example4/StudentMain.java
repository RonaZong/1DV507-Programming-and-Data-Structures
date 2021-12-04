package Lecture10.Example4;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student("a", "12345");
        Student s2 = new Student("b", "12345");

        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
