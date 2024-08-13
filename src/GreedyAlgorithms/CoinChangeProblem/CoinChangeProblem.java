package GreedyAlgorithms.CoinChangeProblem;

import java.util.Arrays;

public class CoinChangeProblem {

    public static int[] coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int[] result = new int[coins.length];
        for (int i = coins.length - 1; i >= 0; i--) {
            result[i] = amount / coins[i];
            amount %= coins[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 10, 20, 50, 100};
        int amount = 93;
        int[] result = coinChange(coins, amount);
        System.out.println("Coins used:");
        for (int i = 0; i < result.length; i++) {
            if (result[i] != 0) {
                System.out.println(coins[i] + " x " + result[i]);
            }
        }
    }
}
