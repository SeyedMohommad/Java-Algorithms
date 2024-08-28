# Binary Search

**Binary Search** is a divide and conquer algorithm used to efficiently find an element in a sorted array by repeatedly dividing the search interval in half.

## Algorithm

1. **Divide**: Find the middle element of the array.
2. **Conquer**: Compare the middle element with the target value. If the middle element is the target, return its index. If the target is smaller, search the left half; if larger, search the right half.
3. **Combine**: No explicit combining step is required.

## Example

Given a sorted array `{2, 3, 4, 10, 40}` and target value `10`, the algorithm will find `10` at index `3`.

## Usage

To run the Binary Search algorithm, compile and run the `BinarySearch.java` file:

```bash
javac DivideAndConquer/BinarySearch/BinarySearch.java
java DivideAndConquer.BinarySearch.BinarySearch
```
## Applications

- Search: Efficiently searching in sorted arrays.
- Algorithm Design: Frequently used in other algorithms that require searching in sorted data.

## Contributing

Contributions are welcome! If you would like to contribute by adding new divide and conquer algorithms, improving existing implementations, or enhancing the documentation, please follow the contribution guidelines in the main README.md.
## License

This project is licensed under the MIT License - see the LICENSE file for details.
## Contact

If you have any questions or suggestions, feel free to contact me:

- GitHub: SeyedMohommad