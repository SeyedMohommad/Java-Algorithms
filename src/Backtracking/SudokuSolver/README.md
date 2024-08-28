# Sudoku Solver

The **Sudoku Solver** algorithm fills in the blanks in a 9x9 Sudoku grid so that each row, column, and 3x3 subgrid contains the numbers 1 to 9 exactly once.

## Algorithm

- **Base Case**: If all cells are filled, return true.
- **Recursive Case**: For each empty cell, try all possible numbers from 1 to 9. If placing a number leads to a solution, return true; otherwise, backtrack and try the next number.

## Example

Given a partially filled Sudoku board, the algorithm will output the solved board.

## Usage

To run the Sudoku Solver algorithm, compile and run the `SudokuSolver.java` file:

```bash
javac Backtracking/SudokuSolver/SudokuSolver.java
java Backtracking.SudokuSolver.SudokuSolver
```

## Applications

- Puzzle Games: Solving Sudoku and similar logic puzzles.
- Artificial Intelligence: Constraint satisfaction problems.

## Contributing

Contributions are welcome! If you would like to contribute by adding new backtracking algorithms, improving existing implementations, or enhancing the documentation, please follow the contribution guidelines in the main README.md.
## License

This project is licensed under the MIT License - see the LICENSE file for details.
## Contact

If you have any questions or suggestions, feel free to contact me:

- GitHub: SeyedMohommad