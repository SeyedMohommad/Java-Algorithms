# Closest Pair of Points

The **Closest Pair of Points** problem is a classic problem in computational geometry where the goal is to find the two points that are closest to each other among a set of points.

## Algorithm

1. **Divide**: Divide the set of points into two equal halves.
2. **Conquer**: Recursively find the smallest distance in each half.
3. **Combine**: Find the smallest distance across the dividing line by comparing points in a "strip" centered at the dividing line.

## Example

Given a set of points `[(2, 3), (12, 30), (40, 50), (5, 1), (12, 10), (3, 4)]`, the algorithm will find the closest pair of points and their distance.

## Usage

To run the Closest Pair of Points algorithm, compile and run the `ClosestPairOfPoints.java` file:

```bash
javac DivideAndConquer/ClosestPairOfPoints/ClosestPairOfPoints.java
java DivideAndConquer.ClosestPairOfPoints.ClosestPairOfPoints
```
## Applications

- Computational Geometry: Used in computer graphics, geographical information systems, and robotics.
- Optimization: Finding closest points in various optimization problems.

## Contributing

Contributions are welcome! If you would like to contribute by adding new divide and conquer algorithms, improving existing implementations, or enhancing the documentation, please follow the contribution guidelines in the main README.md.
## License

This project is licensed under the MIT License - see the LICENSE file for details.
## Contact

If you have any questions or suggestions, feel free to contact me:

- GitHub: SeyedMohommad