package Lecture5.Example3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class IntListTest {
    private static int count = 0;

    private IntList build (int size) {
        IntList list = new IntListImpl();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        return list;
    }

    private IntList random(int size, int max) {
        Random rand = new Random();

        IntList list = new IntListImpl();
        for (int i = 0; i < size; i++) {
            int n = 1 + rand.nextInt(max);
            list.add(n);
        }
        return list;
    }

    /* Executed before every test method */
    @BeforeEach public void setUp() {
        System.out.println("Run test method: " + (count++));
    }

    /* Executed after every test method */
    @AfterEach public void tearDown() {
        System.out.println(" --- done with test " + count);
    }

    /* My list of test methods */
    @Test public void testInitSize() {

    }

    @Test public void testAddGet() {
        /* Test add(int n) used in build() */
        IntList list1 = build(5);
        assertEquals(5, list1.size());

        IntList list2 = build(10);
        assertEquals(10, list2.size());

        /* Test get(int n) */
        for (int i = 0; i < list2.size(); i++) {
            assertEquals(i, list2.get(i));
        }

        /* Test if get(int index) throws exception */
        assertThrows(IndexOutOfBoundsException.class, () -> list2.get(-8));
        assertThrows(IndexOutOfBoundsException.class, () -> list2.get(123));
    }

    @Test public void testIndexOf() {

    }

    @Test public void testRemove() {

    }

    @Test
    void testSort() {

    }
}