# Naive Pattern Search

The **Naive Pattern Search** algorithm checks for the presence of a pattern in a text by sliding the pattern over the text one character at a time.

## Algorithm

1. Start from the first character of the text.
2. Compare the pattern with the current substring of the text.
3. If a match is found, print the starting index.
4. Move to the next character in the text and repeat.

## Example

Given a text `AABAACAADAABAAABAA` and a pattern `AABA`, the algorithm will find matches at indices `0`, `9`, and `13`.

## Usage

To run the Naive Pattern Search algorithm, compile and run the `NaivePatternSearch.java` file:

```bash
javac PatternSearching/NaivePatternSearch/NaivePatternSearch.java
java PatternSearching.NaivePatternSearch.NaivePatternSearch
```

## Applications
- Text Search: Simple search in text editors.
- DNA Sequence Analysis: Finding sequences in genetic data

## Contributing

Contributions are welcome! If you would like to contribute by adding new pattern searching algorithms, improving existing implementations, or enhancing the documentation, please follow the contribution guidelines in the main README.md.

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Contact

If you have any questions or suggestions, feel free to contact me:

- GitHub: SeyedMohommad
