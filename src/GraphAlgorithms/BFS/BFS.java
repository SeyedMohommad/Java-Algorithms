package GraphAlgorithms.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    private final int[][] adjacencyMatrix;
    private final int numVertices;

    public BFS(int numVertices) {
        this.numVertices = numVertices;
        adjacencyMatrix = new int[numVertices][numVertices];
    }

    public void addEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 1;
        adjacencyMatrix[destination][source] = 1; // For undirected graph
    }

    public void bfs(int startVertex) {
        boolean[] visited = new boolean[numVertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int i = 0; i < numVertices; i++) {
                if (adjacencyMatrix[vertex][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        BFS graph = new BFS(5);

        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        System.out.println("Breadth-First Search starting from vertex 0:");
        graph.bfs(0);
    }
}
