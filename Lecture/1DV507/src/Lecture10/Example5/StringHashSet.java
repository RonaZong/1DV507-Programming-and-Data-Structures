package Lecture10.Example5;

public class StringHashSet implements StringSet {
    private int sz;
    private Node[] buckets = new Node[8];

    private class Node {
        String value;
        Node next  = null;

        public Node (String str) {
            value = str;
        }

        public String toString() {
            return value;
        }
    }

    public void add(String str) {
        int pos = getBucketNumber(str);
        Node node = buckets[pos]; // First node in list
        while (node != null) { // Search list
            if (node.value.equals(str)) {
                return; // Element found -> return
            }
            else
                node = node.next; // Next node in list
        }

        node = new Node(str); // Not found, add new node as first entry
        node.next = buckets[pos];
        buckets[pos] = node;
        sz++;
        if (sz == buckets.length) { // Rehash if needed
            rehash();
        }
    }

    private int getBucketNumber(String str) {
        int hc = str.hashCode(); // Use hashCode() from String class
        if (hc < 0) { // Make sure non-negetive
            hc = -hc;
        }
        return hc % buckets.length; // Simple hash function
    }

    private void rehash() {
        Node[] temp = buckets; // Copy of old buckets
        buckets = new Node[2 * temp.length]; // New empty buckets
        sz = 0;
        for (Node n: temp) { // Insert old values into new buckets
            if (n == null) { // Empty bucket
                continue;
            }
            while (n != null) {
                add(n.value); // Add elements again
                n = n.next;
            }
        }
    }

    public boolean contains(String str) {
        int pos = getBucketNumber(str);
        Node node = buckets[pos];
        while (node != null) { // Search list for element
            if (node.value.equals(str)) {
                return true; // Found
            }
            else
                node = node.next;
        }
        return false; // Not found
    }
}
