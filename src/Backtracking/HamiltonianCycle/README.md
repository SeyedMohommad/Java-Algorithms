# Hamiltonian Cycle

The **Hamiltonian Cycle** problem is a classic problem where the goal is to find a cycle in a graph that visits every vertex exactly once and returns to the starting vertex.

## Algorithm

- **Base Case**: If all vertices are included in the path, check if there is an edge from the last included vertex to the first vertex.
- **Recursive Case**: Try different vertices as the next candidate in the Hamiltonian Cycle. If adding a vertex leads to a solution, return true; otherwise, backtrack.

## Example

Given a graph:

```
0 1 0 1 0 1 0 1 1 1 0 1 0 0 1 1 1 0 0 1 0 1 1 1 0
```


The algorithm will output a Hamiltonian Cycle if one exists.

## Usage

To run the Hamiltonian Cycle algorithm, compile and run the `HamiltonianCycle.java` file:

```bash
javac Backtracking/HamiltonianCycle/HamiltonianCycle.java
java Backtracking.HamiltonianCycle.HamiltonianCycle
```
## Applications

- Graph Theory: Studying cycles in graphs.
- Optimization: Solving routing problems.

## Contributing

Contributions are welcome! If you would like to contribute by adding new backtracking algorithms, improving existing implementations, or enhancing the documentation, please follow the contribution guidelines in the main README.md.
## License

This project is licensed under the MIT License - see the LICENSE file for details.
## Contact

If you have any questions or suggestions, feel free to contact me:

- GitHub: SeyedMohommad