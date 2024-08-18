# Depth-First Search (DFS)

**Depth-First Search (DFS)** is a graph traversal algorithm that explores as far as possible along each branch before backtracking.

## Algorithm

1. Start from the given source vertex and mark it as visited.
2. Recursively visit all adjacent vertices of the source vertex that are not visited.
3. Backtrack when there are no unvisited adjacent vertices.

## Example

Given a graph, DFS will traverse the graph by exploring each branch before backtracking.

## Usage

To run the DFS algorithm, compile and run the `DFS.java` file:

```bash
javac GraphAlgorithms/DFS/DFS.java
java GraphAlgorithms.DFS.DFS
```

## Applications

- **Path Finding**: Used in puzzles and games to find a path to the goal.
- **Cycle Detection**: Used to detect cycles in a graph.
- **Topological Sorting**: Used in tasks scheduling.

## Contributing

Contributions are welcome! If you would like to contribute by adding new graph algorithms, improving existing implementations, or enhancing the documentation, please follow the contribution guidelines in the main README.md.

## License
This project is licensed under the MIT License - see the LICENSE file for details.