# Rat in a Maze

The **Rat in a Maze** problem is a classic backtracking problem where the goal is to find a path from the top-left corner to the bottom-right corner of a maze.

## Algorithm

- **Base Case**: If the current position is the destination, mark it and return true.
- **Recursive Case**: Try moving in the x direction (right) and y direction (down) from the current position. If moving in any direction leads to a solution, return true. If no movement is possible, backtrack.

## Example

Given a maze:
```
1 0 0 0 1 1 0 1 0 1 0 0 1 1 1 1
```

The algorithm will output the solution:

```
1 0 0 0 1 1 0 0 0 1 0 0 0 1 1 1
```

## Usage

To run the Rat in a Maze algorithm, compile and run the `RatInAMaze.java` file:

```bash
javac Backtracking/RatInAMaze/RatInAMaze.java
java Backtracking.RatInAMaze.RatInAMaze
```

## Applications

- Robotics: Pathfinding for autonomous robots.
- AI and Games: Solving mazes and similar puzzles.

## Contributing

Contributions are welcome! If you would like to contribute by adding new backtracking algorithms, improving existing implementations, or enhancing the documentation, please follow the contribution guidelines in the main README.md.
## License

This project is licensed under the MIT License - see the LICENSE file for details.
## Contact

If you have any questions or suggestions, feel free to contact me:

- GitHub: SeyedMohommad