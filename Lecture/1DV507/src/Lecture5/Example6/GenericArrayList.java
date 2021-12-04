package Lecture5.Example6;

import java.util.Iterator;

public class GenericArrayList<T> implements GenericIntList<T> {
    private int size = 0;
    private T[] values;

    public GenericArrayList() {
        values = (T[]) new Object[8];
    }

    @Override
    public void add(T t) {
        values[size++] = t;
        if (size == values.length) {
            resize();
        }
    }

    @Override
    public boolean contains(T t) {
        for (int i = 0; i < size; i++) {
            T v = values[i];
            if (v.equals(t)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void addAll(Iterable<T> col) {
        for (T t : col) {
            add(t);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator<T>(values);
    }

    private void resize() {
        T[] tmp = (T[]) new Object[2 * values.length];
        System.arraycopy(values, 0, tmp, 0, values.length);
        values = tmp;
    }

    private class ListIterator<X> implements Iterator<X> {
        private int count = 0;
        private X[] elements;

        public ListIterator(X[] xElements) {
            elements = xElements;
        }

        @Override
        public X next() {
            return elements[count++];
        }

        @Override
        public boolean hasNext() {
            return count < size;
        }

        @Override
        public void remove() {
            throw new RuntimeException("remove() is not implemented");
        }
    }

}
