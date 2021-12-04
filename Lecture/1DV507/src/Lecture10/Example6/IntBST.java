package Lecture10.Example6;

public class IntBST {
    private BST root = null;

    public void add(int n) {
        if (root == null) {
            root = new BST(n);
        }
        else
            root.add(n);
    }

    private class BST {
        int value;
        BST left = null;
        BST right = null;

        BST(int val) {
            value = val;
        }

        void add(int n) { // Recursive add
            if (n < value) { // Add to left branch
                if (left == null) {
                    left = new BST(n);
                }
                else
                    left.add(n); // Recursive call
            }
            else if (n > value) { // Add to right branch
                if (right == null) {
                    right = new BST(n);
                }
                else
                    right.add(n);
            }
        }

        /* true if tree contains n */
        boolean contains(int n) { // Recursive loop-up
            if (n < value) {
                if (left == null)
                    return false;
                else
                    return left.contains(n);
            }
            else if (n > value) {
                if (right == null)
                    return false;
                else
                    return right.contains(n);
            }
            return true;
        }

        BST remove(int n) {
            if (n < value) {
                if (left != null)
                    left = left.remove(n);
            }
            else if (n > value) {
                if (right != null)
                    right = right.remove(n);
            }
            else {
                if (left == null)
                    return right;
                else if (right == null)
                    return left;
                else {
                    if (right.left == null) {
                        value = right.value;
                        right = right.right;
                    }
                    else
                        value = right.delete_min();
                }
            }
            return this;
        }

        int delete_min() {

        }

        void print() {
            if (left != null)
                left.print();
            System.out.print(" " + value);
            if (right != null)
                right.print();
        }
    }
}