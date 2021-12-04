package Lecture5.Example6;

import java.util.Iterator;

public class ArrayList implements IntList {
    private int size = 0;
    private int[] values;

    @Override
    public void add(int n) {

    }

    @Override
    public boolean contains(int n) {
        for (int i = 0; i < size; i++) {
            int v = values[i];
            if (v == n) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int get(int index) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void addAll(Iterable<Integer> col) {

    }

    @Override
    public Iterator<Integer> iterator() {
        return new ListIterator();
    }

    private void resize() {
        int[] tmp = new int[2 * values.length];
        System.arraycopy(values, 0, tmp, 0, values.length);
        values = tmp;
    }

    private class ListIterator implements Iterator<Integer> {
        private int count = 0;

        @Override
        public Integer next() {
            return values[count++];
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
