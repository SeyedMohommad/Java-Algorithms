# Kruskal’s Algorithm

**Kruskal’s Algorithm** is a greedy algorithm that finds the minimum spanning tree (MST) of a connected, undirected graph. It adds edges in increasing order of weight, ensuring no cycles are formed.

## Algorithm

1. Sort all the edges in non-decreasing order of their weight.
2. Pick the smallest edge. Check if it forms a cycle with the spanning tree formed so far.
3. If it doesn’t form a cycle, include it in the MST. Otherwise, discard it.
4. Repeat until the MST contains all the vertices.

## Example

Given a graph with edges and weights, Kruskal’s Algorithm will find the minimum spanning tree.

## Usage

To run Kruskal’s Algorithm, compile and run the `KruskalsAlgorithm.java` file:

```bash
javac GreedyAlgorithms/KruskalsAlgorithm/KruskalsAlgorithm.java
java GreedyAlgorithms.KruskalsAlgorithm.KruskalsAlgorithm
