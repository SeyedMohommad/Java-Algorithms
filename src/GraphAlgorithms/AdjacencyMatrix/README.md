# Graph Representation using Adjacency Matrix

This directory contains an implementation of a graph using an adjacency matrix in Java. An adjacency matrix is a 2D array that represents the connections (edges) between vertices in a graph.

## Key Features

- **addEdge(int source, int destination)**: Adds an edge between the source and destination vertices.
- **removeEdge(int source, int destination)**: Removes the edge between the source and destination vertices.
- **display()**: Displays the adjacency matrix representing the graph.
- **hasEdge(int source, int destination)**: Checks if there is an edge between the source and destination vertices.

## Example

Here’s an example of how to use this class:

```java
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
```
 ## Usage
To run the graph implementation using an adjacency matrix, compile and run the Graph.java file:

```bash
javac GraphAlgorithms/AdjacencyMatrix/Graph.java
java GraphAlgorithms.AdjacencyMatrix.Graph
```
## Applications

Graphs are used in various applications such as network analysis, scheduling, and navigation. This implementation provides a simple way to understand how graphs can be represented and manipulated in Java.

## Contributing

Contributions are welcome! If you would like to contribute by adding new graph algorithms, improving existing implementations, or enhancing the documentation, please follow the contribution guidelines in the main README.md.

## License
This project is licensed under the MIT License - see the LICENSE file for details.