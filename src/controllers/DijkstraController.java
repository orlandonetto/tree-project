package controllers;

import models.Adjacency;
import models.Point;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraController {

    public void compute(Point p0) {
        p0.minWeight = 0.0;
        PriorityQueue<Point> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(p0);

        while (!priorityQueue.isEmpty()) {
            Point point = priorityQueue.poll();

            for (Adjacency adjacency : point.adjacency) {
                Point next = adjacency.next;

                double calculatedDistance = point.minWeight + adjacency.weight;
                if (calculatedDistance < next.minWeight) {
                    priorityQueue.remove(next);

                    next.minWeight = calculatedDistance;
                    next.previous = point;

                    priorityQueue.add(next);
                }
            }
        }
    }

    public List<Point> shortestPath(Point target) {
        if (target == null)
            new ArrayList<>();

        List<Point> path = new ArrayList<>();

        for (Point point = target; point != null; point = point.previous)
            path.add(point);

        Collections.reverse(path);

        System.out.println("total weight between '" + path.get(0) + "' and '" + target + "' = " + target.minWeight);
        System.out.println("path = " + path);

        return path;
    }

}
