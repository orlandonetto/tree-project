package models;

public class Point implements Comparable<Point> {

    public final String value;
    public Adjacency[] adjacency;
    public double minWeight = Double.POSITIVE_INFINITY;
    public Point previous;

    public Point(String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }

    @Override
    public int compareTo(Point other) {
        return Double.compare(minWeight, other.minWeight);
    }

}
