# Rabin-Karp Algorithm

The **Rabin-Karp Algorithm** is a pattern searching algorithm that uses hashing to find an exact match of a pattern in a text.

## Algorithm

1. Compute the hash value of the pattern and the hash value of the first window of text.
2. Slide the pattern over the text one character at a time.
3. Compare the hash value of the current window of text with the hash value of the pattern.
4. If the hash values match, check the characters one by one for confirmation.

## Example

Given a text `Spider man is so powerful!` and a pattern `man`, the algorithm will find matches at indices `0` and `10`.

## Usage

To run the Rabin-Karp Algorithm, compile and run the `RabinKarpAlgorithm.java` file:

```bash
javac PatternSearching/RabinKarpAlgorithm/RabinKarpAlgorithm.java
java PatternSearching.RabinKarpAlgorithm.RabinKarpAlgorithm
```

## Applications

- Plagiarism Detection: Searching for similar content in documents.
- String Matching: Efficient string matching in large datasets.

## Contributing

Contributions are welcome! If you would like to contribute by adding new pattern searching algorithms, improving existing implementations, or enhancing the documentation, please follow the contribution guidelines in the main README.md.
## License

This project is licensed under the MIT License - see the LICENSE file for details.
## Contact

If you have any questions or suggestions, feel free to contact me:

- GitHub: SeyedMohommad

