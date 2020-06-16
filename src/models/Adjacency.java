package models;

public class Adjacency {
    public final Point next;
    public final double weight;

    public Adjacency(Point next, double weight) {
        this.next = next;
        this.weight = weight;
    }

}
