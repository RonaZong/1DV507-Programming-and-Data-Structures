package Lecture5.Example6;

public interface GenericIntList<T> extends Iterable<T> {
    public void add(T n);     // Add integer n to list.
    public boolean contains(T t);     // True if n is in list, otherwise false.
    public T get(int index);      // Get integer at position index.
    public int size();      // Number of integers currently stored.
    public String toString();       // String of type "[ 7 56 -45 68 ... ]"
    public void addAll(Iterable<T> col);      // Append iterable collection of elements to the list

}
