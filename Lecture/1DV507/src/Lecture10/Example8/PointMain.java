package Lecture10.Example8;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PointMain {
    public static void main(String[] args) {
        // Content
        Set<Point> points = new HashSet<>();

        // Ordered
//        Set<Point> points = new TreeSet<Point>();

        //Insertion order
//        Set<Point> points = new LinkedHashSet<>();

        points.add(new Point(3, 3));
        points.add(new Point(3, 2));
        points.add(new Point(5,4));
        points.add(new Point(1, 3));
        points.add(new Point(1, 2));

        /* Add duplicates */
        points.add(new Point(3,2));
        points.add(new Point(5,4));
        points.add(new Point(1, 3));

        /* Print results */
        System.out.println("Set implementation: " + points.getClass().getName());
        System.out.println("Size: " + points.size());
        System.out.print("Content: ");
        for (Point p : points) {
            System.out.print(" " + p);
        }
    }
}
