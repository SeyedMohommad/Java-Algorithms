# Huffman Coding

**Huffman Coding** is a greedy algorithm used for lossless data compression. It assigns variable-length codes to input characters, with shorter codes assigned to more frequent characters.

## Algorithm

1. Build a priority queue with all characters as nodes.
2. Extract two nodes with the lowest frequency and create a new internal node with these two as children.
3. Insert the new node into the priority queue.
4. Repeat until the queue contains only one node, which will be the root of the Huffman tree.
5. Traverse the Huffman tree and assign codes to characters.

## Example

Given a set of characters `{a, b, c, d, e, f}` with frequencies `{5, 9, 12, 13, 16, 45}`, the algorithm will generate Huffman codes for each character.

## Usage

To run the Huffman Coding algorithm, compile and run the `HuffmanCoding.java` file:

```bash
javac GreedyAlgorithms/HuffmanCoding/HuffmanCoding.java
java GreedyAlgorithms.HuffmanCoding.HuffmanCoding
