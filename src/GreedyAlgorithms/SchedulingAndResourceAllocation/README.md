# Scheduling and Resource Allocation

The **Scheduling and Resource Allocation Problem** is a greedy algorithm that maximizes profit or efficiency when allocating limited resources over time.

## Algorithm

1. Sort all jobs by their profit in descending order.
2. For each job, find the latest time slot that is available before its deadline.
3. If a slot is available, allocate the job to that slot.
4. Repeat until all jobs are scheduled or no more slots are available.

## Example

Given a set of jobs with deadlines and profits, this algorithm will schedule the jobs to maximize total profit.

## Usage

To run the Scheduling and Resource Allocation algorithm, compile and run the `SchedulingAndResourceAllocation.java` file:

```bash
javac GreedyAlgorithms/SchedulingAndResourceAllocation/SchedulingAndResourceAllocation.java
java GreedyAlgorithms.SchedulingAndResourceAllocation.SchedulingAndResourceAllocation
