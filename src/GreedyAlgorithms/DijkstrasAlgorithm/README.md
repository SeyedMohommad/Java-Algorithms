# Dijkstra’s Algorithm

**Dijkstra’s Algorithm** is a greedy algorithm that finds the shortest paths from a source vertex to all vertices in a graph with non-negative edge weights.

## Algorithm

1. Initialize distances to all vertices as infinity, and set the distance to the source as 0.
2. At each step, pick the vertex with the smallest distance and update the distances to its neighbors.
3. Repeat until all vertices are processed.

## Example

Given a graph represented by an adjacency matrix, Dijkstra’s Algorithm will find the shortest paths from a specified source vertex to all other vertices.

## Usage

To run Dijkstra’s Algorithm, compile and run the `DijkstrasAlgorithm.java` file:

```bash
javac GreedyAlgorithms/DijkstrasAlgorithm/DijkstrasAlgorithm.java
java GreedyAlgorithms.DijkstrasAlgorithm.DijkstrasAlgorithm
