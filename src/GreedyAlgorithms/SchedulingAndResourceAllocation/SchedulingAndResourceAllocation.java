package GreedyAlgorithms.SchedulingAndResourceAllocation;

import java.util.Arrays;
import java.util.Comparator;

class Job {
    int deadline;
    int profit;

    Job(int deadline, int profit) {
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class SchedulingAndResourceAllocation {

    private static int getMaxProfit(Job[] jobs, int n) {
        Arrays.sort(jobs, Comparator.comparingInt((Job job) -> job.profit).reversed());

        int[] result = new int[n];
        boolean[] slot = new boolean[n];

        for (int i = 0; i < n; i++) {
            for (int j = Math.min(n, jobs[i].deadline) - 1; j >= 0; j--) {
                if (!slot[j]) {
                    result[j] = i;
                    slot[j] = true;
                    break;
                }
            }
        }

        int profit = 0;
        for (int i = 0; i < n; i++) {
            if (slot[i]) {
                profit += jobs[result[i]].profit;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        Job[] jobs = {
                new Job(2, 100),
                new Job(1, 19),
                new Job(2, 27),
                new Job(1, 25),
                new Job(3, 15)
        };
        int n = jobs.length;

        int maxProfit = getMaxProfit(jobs, n);
        System.out.println("Maximum profit = " + maxProfit);
    }
}
