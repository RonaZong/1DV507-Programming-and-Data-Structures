package Lecture3.Example2;

import java.util.Iterator;

public class ArrayIntList implements IntList {
    private int size = 0; // Current size
    private int[] values; // Data storage

    public ArrayIntList() {
        values = new int[8];
    }

    public void add(int n) {
        values[size++] = n;

        // increase size
        if (size == values.length)
            resize();
    }

    @Override
    public void addAt(int n, int index) throws IndexOutOfBoundsException {

    }

    private void resize() {
        // Double the array size
        int[] tmp = new int[2 * values.length];
        /* Copy from values to tmp */
        System.arraycopy(values, 0, tmp, 0, values.length);
        values = tmp;
    }

    /* Remove integer at position index. */
    public void remove(int index) throws IndexOutOfBoundsException {
        checkIndex(index, size);

        // Move one step forward
        for (int i = index; i < size; i++) {
            values[i] = values[i + 1];
        }
        size--;
    }

    @Override
    public int get(int index) throws IndexOutOfBoundsException {
        return 0;
    }

    @Override
    public int indexOf(int n) {
        return 0;
    }

    /* Used by remove(), get(), and addAt() */
    private void checkIndex(int index, int upper) throws IndexOutOfBoundsException {
        if (index < 0 || index >= upper) {
            String msg = "index = " + index + ", Upper boundary = " + upper;
            throw new IndexOutOfBoundsException(msg);
        }
    }


    /* Implements Iterable --> easy to iterate over all elements
    // Travers content using iterators
    IntList list = new ArrayIntList(); // adding integers

    Iterator<Integer> it = list.iterator();
        while (it.hasNext())
                System.out.println(" " + it.next());

    // Apply the extended for-statement
    IntList list2 = new ArrayIntList(); // adding integers
        for (int j : list2) { // Extended for-statement
        System.out.println(" " + j);
    }


    IntList extends Iterable<Integer> --> all implementations must also implement the Iterable interface
    public interface Iterable<T> {
    /** Returns an iterator over a set of elements of type T. */
    /* public Iterator<T> iterator();
    }

    public interface Iterator<T> {
    boolean hasNext() // true if the iteration has more elements
    T next() // Returns the next element in the iteration
    void remove() // Removes the last element returned (optional)
    }
    */



    @Override
    /* Implement the Iterable<Integer> interface */
    public Iterator<Integer> iterator() {
        return new ListIterator();
    }

    /* Inner class implementation of an Iterator */
    private class ListIterator implements Iterator<Integer> {
        private int count = 0;
        public Integer next() {
            return values[count++];
        }

        public boolean hasNext() {
            return count < size;
        }

        public void remove() {
            throw new RuntimeException("remove() is not implemented");
        }
    }
}
