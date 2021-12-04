package Lecture10.Example4;

public class Student {
    private String name;
    private String idNumber;

    public Student(String name, String idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }

    /* Override Object.equals() */
    @Override
    public boolean equals(Object other) {
        if (other instanceof Student) {
            Student otherStudent = (Student) other;
            return idNumber.equals(otherStudent.idNumber);
        }
        return false;
    }

    /* Override Object.hashCode() */
    @Override
    public int hashCode() {
        int hc = 0;
        for (int i = 0; i < idNumber.length(); i++) {
            char c = idNumber.charAt(i);
            hc += Character.getNumericValue(c); // ASCII number
        }
        return hc;
    }
}
