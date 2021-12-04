package Lecture10.Example7;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LinkedHashSet {
    private Set set = new HashSet();
    private List list = new LinkedList();

    public boolean add (Object obj) {
        if (set.add(obj)) {
            list.add(obj);
            return true;
        }
        else
            return false;
    }
}
