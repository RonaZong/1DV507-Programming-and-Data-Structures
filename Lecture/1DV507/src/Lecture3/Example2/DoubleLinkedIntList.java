package Lecture3.Example2;

import java.util.Iterator;

public class DoubleLinkedIntList implements IntList {
    private int size = 0;
    private Node head = null;
    private Node tail = null;

    @Override
    public void add(int n) {

    }

    @Override
    public void addAt(int n, int index) throws IndexOutOfBoundsException {

    }

    @Override
    public void remove(int index) throws IndexOutOfBoundsException {

    }

    @Override
    public int get(int index) throws IndexOutOfBoundsException {
        return 0;
    }

    @Override
    public int indexOf(int n) {
        return 0;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    private class Node {
        int value;
        Node next = null;
        Node prev = null;
        Node(int v) {
            value = v;
        }
    }
}
