package GraphAlgorithms.DFS;

public class DFS {

    private final int[][] adjacencyMatrix;
    private final int numVertices;

    public DFS(int numVertices) {
        this.numVertices = numVertices;
        adjacencyMatrix = new int[numVertices][numVertices];
    }

    public void addEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 1;
        adjacencyMatrix[destination][source] = 1; // For undirected graph
    }

    public void dfs(int startVertex) {
        boolean[] visited = new boolean[numVertices];
        dfsUtil(startVertex, visited);
    }

    private void dfsUtil(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int i = 0; i < numVertices; i++) {
            if (adjacencyMatrix[vertex][i] == 1 && !visited[i]) {
                dfsUtil(i, visited);
            }
        }
    }

    public static void main(String[] args) {
        DFS graph = new DFS(5);

        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        System.out.println("Depth-First Search starting from vertex 0:");
        graph.dfs(0);
    }
}
