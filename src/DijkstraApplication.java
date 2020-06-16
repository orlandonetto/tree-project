import controllers.DijkstraController;
import models.Adjacency;
import models.Point;

public class DijkstraApplication {

    public static void main(String[] args) {

        Point p0 = new Point("Arad");
        Point p1 = new Point("Zerind");
        Point p2 = new Point("Sibiu");
        Point p3 = new Point("Timisoara");
        Point p4 = new Point("Oraclea");
        Point p5 = new Point("Fagaras");
        Point p6 = new Point("Rinnicu Vilcea");
        Point p7 = new Point("Lugoj");
        Point p8 = new Point("Dobreta");
        Point p9 = new Point("Pitesti");
        Point p10 = new Point("Cralova");
        Point p11 = new Point("Mehadla");
        Point p12 = new Point("Neamt");
        Point p13 = new Point("Giurgiu");
        Point p14 = new Point("Urzicenl");
        Point p15 = new Point("Vaslui");
        Point p16 = new Point("Hirsova");
        Point p17 = new Point("Iasl");
        Point p18 = new Point("Eforle");
        Point p19 = new Point("Bucharest");

        p0.adjacency = new Adjacency[]{new Adjacency(p1, 75), new Adjacency(p2, 140), new Adjacency(p3, 118)};
        p1.adjacency = new Adjacency[]{new Adjacency(p0, 75), new Adjacency(p4, 71)};
        p2.adjacency = new Adjacency[]{new Adjacency(p0, 140), new Adjacency(p4, 151), new Adjacency(p5, 99), new Adjacency(p6, 80)};
        p3.adjacency = new Adjacency[]{new Adjacency(p0, 118), new Adjacency(p7, 111)};
        p4.adjacency = new Adjacency[]{new Adjacency(p1, 71), new Adjacency(p2, 151)};
        p5.adjacency = new Adjacency[]{new Adjacency(p2, 99), new Adjacency(p19, 211)};
        p6.adjacency = new Adjacency[]{new Adjacency(p2, 80), new Adjacency(p9, 97), new Adjacency(p10, 146)};
        p7.adjacency = new Adjacency[]{new Adjacency(p3, 111), new Adjacency(p11, 70)};
        p8.adjacency = new Adjacency[]{new Adjacency(p11, 75), new Adjacency(p10, 120)};
        p9.adjacency = new Adjacency[]{new Adjacency(p6, 97), new Adjacency(p10, 138), new Adjacency(p19, 101)};
        p10.adjacency = new Adjacency[]{new Adjacency(p9, 138), new Adjacency(p8, 120)};
        p11.adjacency = new Adjacency[]{new Adjacency(p7, 70), new Adjacency(p8, 75)};
        p12.adjacency = new Adjacency[]{new Adjacency(p17, 87)};
        p13.adjacency = new Adjacency[]{new Adjacency(p19, 70)};
        p14.adjacency = new Adjacency[]{new Adjacency(p19, 85), new Adjacency(p15, 142), new Adjacency(p16, 98)};
        p15.adjacency = new Adjacency[]{new Adjacency(p14, 142), new Adjacency(p17, 92)};
        p16.adjacency = new Adjacency[]{new Adjacency(p18, 86), new Adjacency(p14, 98)};
        p17.adjacency = new Adjacency[]{new Adjacency(p15, 92), new Adjacency(p12, 87)};
        p18.adjacency = new Adjacency[]{new Adjacency(p16, 86)};
        p19.adjacency = new Adjacency[]{new Adjacency(p9, 101), new Adjacency(p5, 210), new Adjacency(p13, 90), new Adjacency(p14, 85)};

        // Compute tree (CHOOSE ORIGIN)
        new DijkstraController().compute(p0);

        // Shortest Path (CHOOSE TARGET)
        new DijkstraController().shortestPath(p19);
    }

}
