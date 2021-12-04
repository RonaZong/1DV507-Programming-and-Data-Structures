package Lecture10.Example8;

public class Point implements Comparable<Point> {
    private final int X, Y;

    public Point(int x, int y) {
        X = x;
        Y = y;
    }

    public String toString() {
        return "(" + X + "," + Y + ")";
    }

    public boolean equals(Object other) {
        if (other instanceof Point) {
            Point p = (Point) other;
            return p.X == X && p.Y == Y;
        }
        else
            return false;
    }

    public int hashCode() {
        return X ^ Y;
    }

    public int compareTo(Point p) {
        if (X == p.X)
            return Y - p.Y;
        else
            return X - p.X;
    }
}
