package GraphAlgorithms.AdjacencyMatrix;

public class Graph {

    private final int[][] adjacencyMatrix;
    private final int numVertices;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjacencyMatrix = new int[numVertices][numVertices];
    }

    // Add an edge between source and destination
    public void addEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 1;
        adjacencyMatrix[destination][source] = 1; // For undirected graph
    }

    // Remove an edge between source and destination
    public void removeEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 0;
        adjacencyMatrix[destination][source] = 0; // For undirected graph
    }

    // Display the adjacency matrix
    public void display() {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Check if there is an edge between source and destination
    public boolean hasEdge(int source, int destination) {
        return adjacencyMatrix[source][destination] == 1;
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5);

        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Display the adjacency matrix
        System.out.println("Adjacency Matrix:");
        graph.display();

        // Check for an edge
        System.out.println("Does an edge exist between vertex 0 and 1? " + graph.hasEdge(0, 1));
        System.out.println("Does an edge exist between vertex 1 and 4? " + graph.hasEdge(1, 4));
    }
}
