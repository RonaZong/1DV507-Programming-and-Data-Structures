package Lecture5.Example6;

public interface IntList extends Iterable<Integer> {
    public void add(int n);     // Add integer n to list.
    public boolean contains(int n);     // True if n is in list, otherwise false.
    public int get(int index);      // Get integer at position index.
    public int size();      // Number of integers currently stored.
    public String toString();       // String of type "[ 7 56 -45 68 ... ]"
    public void addAll(Iterable<Integer> col);      // Append iterable collection of elements to the list

}
