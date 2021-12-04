package Lecture10.Example1;

import java.util.Iterator;

public interface Set<T> extends Iterable<T> {
    public boolean add(T t); // Add t if not already, returns true if added
    public boolean contains (Object o); // Return true if o contained
    public void remove(Object o); // Remove o if o contained
    public String toString(); // Print contained elements
    public Iterator<T> iterator(); // Returns iterator over all elements, required by Iterable<T>
}
