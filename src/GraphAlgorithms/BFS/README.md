# Breadth-First Search (BFS)

**Breadth-First Search (BFS)** is a graph traversal algorithm that explores all vertices at the present depth level before moving on to vertices at the next depth level.

## Algorithm

1. Start from the given source vertex and mark it as visited.
2. Add the source vertex to a queue.
3. While the queue is not empty:
    - Dequeue a vertex from the queue.
    - For each adjacent vertex of the dequeued vertex, if it is not visited, mark it as visited and enqueue it.
4. Repeat until the queue is empty.

## Example

Given a graph, BFS will traverse the graph level by level, starting from the given source vertex.

## Usage

To run the BFS algorithm, compile and run the `BFS.java` file:

```bash
javac GraphAlgorithms/BFS/BFS.java
java GraphAlgorithms.BFS.BFS
```

## Applications

- Shortest Path: BFS is used to find the shortest path in an unweighted graph.
- Peer-to-Peer Networks: Used in network broadcasting algorithms.
- Crawling: Used by search engines to index web pages.

## Contributing

Contributions are welcome! If you would like to contribute by adding new graph algorithms, improving existing implementations, or enhancing the documentation, please follow the contribution guidelines in the main README.md.

## License

This project is licensed under the MIT License - see the LICENSE file for details.
