# Coin Change Problem

The **Coin Change Problem** is a greedy algorithm that finds the minimum number of coins required to make a given amount using available denominations.

## Algorithm

1. Sort the coins by value in descending order.
2. Start with the largest denomination and use as many of that coin as possible.
3. Repeat with the next largest denomination until the amount is made.

## Example

Given a set of coin denominations `{1, 2, 5, 10, 20, 50, 100}` and an amount of `93`, the algorithm will calculate the minimum number of coins needed.

## Usage

To run the Coin Change Problem algorithm, compile and run the `CoinChangeProblem.java` file:

```bash
javac GreedyAlgorithms/CoinChangeProblem/CoinChangeProblem.java
java GreedyAlgorithms.CoinChangeProblem.CoinChangeProblem
