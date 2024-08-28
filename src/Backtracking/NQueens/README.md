# N-Queens Problem

The **N-Queens Problem** is a classic problem where the goal is to place `n` queens on an `n x n` chessboard such that no two queens threaten each other.

## Algorithm

- **Base Case**: If all queens are placed, return true.
- **Recursive Case**: Try placing a queen in each row of the current column, check if it's safe, and then recursively place the remaining queens. If placing the queen leads to a solution, return true; otherwise, backtrack.

## Example

Given a 4x4 chessboard, the algorithm will output one possible solution:

0 1 0 0 0 0 0 1 1 0 0 0 0 0 1 0


## Usage

To run the N-Queens algorithm, compile and run the `NQueens.java` file:

```bash
javac Backtracking/NQueens/NQueens.java
java Backtracking.NQueens.NQueens
```
## Applications

- Artificial Intelligence: Solving constraint satisfaction problems.
- Game Theory: Designing games with complex strategies.

## Contributing

Contributions are welcome! If you would like to contribute by adding new backtracking algorithms, improving existing implementations, or enhancing the documentation, please follow the contribution guidelines in the main README.md.
## License

This project is licensed under the MIT License - see the LICENSE file for details.
## Contact

If you have any questions or suggestions, feel free to contact me:

- GitHub: SeyedMohommad