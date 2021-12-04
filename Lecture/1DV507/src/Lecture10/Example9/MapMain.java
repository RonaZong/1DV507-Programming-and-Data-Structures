package Lecture10.Example9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Jonas");
        map.put(8, "Jesper");
        map.put(64, "Jens");
        map.put(4, "Johan");

        System.out.println("Value for 8: " + map.get(8));
        System.out.println("Value for 4: " + map.get(4));

        map.put(8, "Johanna");
        System.out.println("Value for 8: " + map.get(8));

        Iterator<Integer> it = map.keySet().iterator();
        while (it.hasNext()) {
            int key = it.next();
            String value = map.get(key);
            System.out.println("\t" + key + "\t" + value);
        }
    }
}
