package Lecture3.Example2;

import java.util.Iterator;

public class LinkedIntList implements IntList {
    private int size = 0;
    private Node head = null;

    public void add(int n) {
        if (head == null) {
            head = new Node(n);
        }
        else {
            Node node = head;
            while (node.next != null)
                node = node.next;
            node.next = new Node(n);
        }
        size++;
    }

    public void remove(int index) throws IndexOutOfBoundsException {
        Node before = head;
        for (int i = 0; i < index - 1; i++) {
            before = before.next;
        }
        Node delete = before.next;
        before.next = delete.next;
        size--;
    }

    public void addAt(int n, int index) {
        Node nw = new Node(n);
        if (index == 0) {
            nw.next = head;
            head = nw;
        }
        else {
            Node before = head;
            for (int i = 0; i < index - 1; i++) {
                before = before.next;
            }
            nw.next = before.next;
            before.next = nw;
        }
        size++;
    }

    private class Node {
        // Private inner Node class
        int value;
        Node next = null;
        Node(int v) {
            value = v;
        }
    }

    /* Find node at position index and return its value */
    public int get(int index) throws IndexOutOfBoundsException {
        checkIndex(index, size);  // Exception if index outside [0, size - 1]
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.value;
    }

    /* Return index of first node with value == n */
    public int indexOf(int n) {
        Node node = head;
        int index = 0;
        while (node != null) {
            if (node.value == n) {
                return index;
            }
            index++;
            node = node.next;
        }
        return -1;
    }

    /* Used by remove(), get(), and addAt() */
    private void checkIndex(int index, int upper) throws IndexOutOfBoundsException {
        if (index < 0 || index >= upper) {
            String msg = "index = " + index + ", Upper boundary = " + upper;
            throw new IndexOutOfBoundsException(msg);
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ListIterator();
    }

    class ListIterator implements Iterator<Integer> {
        private Node node = head;
        public Integer next() {
            int val = node.value;
            node = node.next;
            return val;
        }

        public boolean hasNext() {
            return node != null;
        }

        public void remove() {
            throw new RuntimeException("remove() is not implemented");
        }
    }

}
