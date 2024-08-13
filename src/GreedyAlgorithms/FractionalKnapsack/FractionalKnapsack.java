package GreedyAlgorithms.FractionalKnapsack;

import java.util.Arrays;
import java.util.Comparator;

class Item {
    int weight;
    int value;

    Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}

public class FractionalKnapsack {

    private static double getMaxValue(Item[] items, int capacity) {
        Arrays.sort(items, Comparator.comparingDouble(i -> ((double) i.value / i.weight)));

        double totalValue = 0d;

        for (Item item : items) {
            int currentWeight = item.weight;
            int currentValue = item.value;

            if (capacity - currentWeight >= 0) {
                capacity -= currentWeight;
                totalValue += currentValue;
            } else {
                double fraction = ((double) capacity / currentWeight);
                totalValue += (currentValue * fraction);
                capacity = (int) (capacity - (currentWeight * fraction));
                break;
            }
        }
        return totalValue;
    }

    public static void main(String[] args) {
        Item[] items = {
                new Item(10, 60),
                new Item(20, 100),
                new Item(30, 120)
        };
        int capacity = 50;

        double maxValue = getMaxValue(items, capacity);
        System.out.println("Maximum value in Knapsack = " + maxValue);
    }
}
