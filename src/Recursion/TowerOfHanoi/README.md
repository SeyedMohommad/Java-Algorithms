# Tower of Hanoi

The **Tower of Hanoi** is a classic problem where you have to move `n` disks from one rod to another, following specific rules.

## Rules

1. Only one disk can be moved at a time.
2. A disk can only be placed on top of a larger disk.
3. All disks start on one rod and must be moved to another rod.

## Algorithm

- Move `n-1` disks from the source rod to the auxiliary rod.
- Move the nth disk from the source rod to the destination rod.
- Move the `n-1` disks from the auxiliary rod to the destination rod.

## Example

Given `3` disks, the algorithm will output the steps needed to solve the Tower of Hanoi problem.

## Usage

To run the Tower of Hanoi algorithm, compile and run the `TowerOfHanoi.java` file:

```bash
javac Recursion/TowerOfHanoi/TowerOfHanoi.java
java Recursion.TowerOfHanoi.TowerOfHanoi
```
## Applications

- Algorithm Design: Understanding recursive algorithms.
- Mathematical Puzzles: Often used in educational contexts to teach recursion.

## Contributing

Contributions are welcome! If you would like to contribute by adding new recursion algorithms, improving existing implementations, or enhancing the documentation, please follow the contribution guidelines in the main README.md.
## License

This project is licensed under the MIT License - see the LICENSE file for details.
## Contact

If you have any questions or suggestions, feel free to contact me:

- GitHub: SeyedMohommad
