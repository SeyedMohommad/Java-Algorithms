# Fractional Knapsack Problem

The **Fractional Knapsack Problem** is a greedy algorithm where you have to maximize the value that can be carried in a knapsack with a given capacity. Unlike the 0/1 Knapsack, you can break items to maximize the total value.

## Algorithm

1. Calculate the value-to-weight ratio for each item.
2. Sort the items by this ratio in descending order.
3. Start with the item with the highest ratio and add it to the knapsack.
4. If you can't add the entire item, add as much as possible.
5. Repeat until the knapsack is full.

## Example

Given items with weights and values, and a knapsack with a certain capacity, this algorithm will calculate the maximum value you can carry.

## Usage

To run the Fractional Knapsack Problem algorithm, compile and run the `FractionalKnapsack.java` file:

```bash
javac GreedyAlgorithms/FractionalKnapsack/FractionalKnapsack.java
java GreedyAlgorithms.FractionalKnapsack.FractionalKnapsack
