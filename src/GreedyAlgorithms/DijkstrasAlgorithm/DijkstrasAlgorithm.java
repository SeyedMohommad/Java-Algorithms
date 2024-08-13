package GreedyAlgorithms.DijkstrasAlgorithm;

import java.util.Arrays;

public class DijkstrasAlgorithm {

    private static final int NO_PARENT = -1;

    public static void dijkstra(int[][] adjacencyMatrix, int startVertex) {
        int nVertices = adjacencyMatrix.length;

        int[] shortestDistances = new int[nVertices];
        boolean[] added = new boolean[nVertices];

        Arrays.fill(shortestDistances, Integer.MAX_VALUE);
        Arrays.fill(added, false);

        shortestDistances[startVertex] = 0;

        int[] parents = new int[nVertices];
        parents[startVertex] = NO_PARENT;

        for (int i = 1; i < nVertices; i++) {
            int nearestVertex = -1;
            int shortestDistance = Integer.MAX_VALUE;

            for (int vertexIndex = 0; vertexIndex < nVertices; vertexIndex++) {
                if (!added[vertexIndex] && shortestDistances[vertexIndex] < shortestDistance) {
                    nearestVertex = vertexIndex;
                    shortestDistance = shortestDistances[vertexIndex];
                }
            }

            added[nearestVertex] = true;

            for (int vertexIndex = 0; vertexIndex < nVertices; vertexIndex++) {
                int edgeDistance = adjacencyMatrix[nearestVertex][vertexIndex];

                if (edgeDistance > 0 && ((shortestDistance + edgeDistance) < shortestDistances[vertexIndex])) {
                    parents[vertexIndex] = nearestVertex;
                    shortestDistances[vertexIndex] = shortestDistance + edgeDistance;
                }
            }
        }

        printSolution(startVertex, shortestDistances, parents);
    }

    private static void printSolution(int startVertex, int[] distances, int[] parents) {
        int nVertices = distances.length;
        System.out.println("Vertex\t Distance\tPath");

        for (int vertexIndex = 0; vertexIndex < nVertices; vertexIndex++) {
            if (vertexIndex != startVertex) {
                System.out.print("\n" + startVertex + " -> ");
                System.out.print(vertexIndex + " \t\t ");
                System.out.print(distances[vertexIndex] + "\t\t");
                printPath(vertexIndex, parents);
            }
        }
    }

    private static void printPath(int currentVertex, int[] parents) {
        if (currentVertex == NO_PARENT) {
            return;
        }
        printPath(parents[currentVertex], parents);
        System.out.print(currentVertex + " ");
    }

    public static void main(String[] args) {
        int[][] adjacencyMatrix = {
                {0, 9, 0, 0, 0, 14, 15, 0},
                {9, 0, 24, 0, 0, 0, 0, 10},
                {0, 24, 0, 6, 2, 0, 0, 0},
                {0, 0, 6, 0, 0, 30, 0, 0},
                {0, 0, 2, 0, 0, 0, 20, 0},
                {14, 0, 0, 30, 0, 0, 5, 0},
                {15, 0, 0, 0, 20, 5, 0, 44},
                {0, 10, 0, 0, 0, 0, 44, 0}
        };
        dijkstra(adjacencyMatrix, 0);
    }
}