# Permutations

The **Permutations** algorithm generates all possible arrangements of a given string or set.

## Algorithm

- **Base Case**: If the string is empty, print the accumulated result.
- **Recursive Case**: For each character in the string, remove it and append it to the result, then recurse with the remaining characters.

## Example

Given a string `ABC`, the algorithm will generate the permutations: `ABC`, `ACB`, `BAC`, `BCA`, `CAB`, `CBA`.

## Usage

To run the Permutations algorithm, compile and run the `Permutations.java` file:

```bash
javac Recursion/Permutations/Permutations.java
java Recursion.Permutations.Permutations
```

## Applications

- Combinatorics: Generating all possible arrangements in a set.
- Cryptography: Exploring different keys or passwords.

## Contributing

Contributions are welcome! If you would like to contribute by adding new recursion algorithms, improving existing implementations, or enhancing the documentation, please follow the contribution guidelines in the main README.md.
## License

This project is licensed under the MIT License - see the LICENSE file for details.
## Contact

If you have any questions or suggestions, feel free to contact me:

- GitHub: SeyedMohommad