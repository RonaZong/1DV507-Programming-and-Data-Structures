package Lecture3.Example2;

public interface IntList extends Iterable<Integer> {
    /* Add integer n to the ned of the list. */
    public void add(int n);

    /* Inserts integer n at position index.
     * Shifts the element currently at that position (if any) and any subsequent elements to the right. */
    public void addAt(int n, int index) throws IndexOutOfBoundsException;

    /* Remove integer at position index. */
    public void remove(int index) throws IndexOutOfBoundsException;

    /* Get integer at position index. */
    public int get(int index) throws IndexOutOfBoundsException;

    /* Find position of integer n, otherwise return -1 */
    public int indexOf(int n);

    /* Number of integers currently stored. */

}
