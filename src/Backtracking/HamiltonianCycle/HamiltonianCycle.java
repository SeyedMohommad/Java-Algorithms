package Backtracking.HamiltonianCycle;

public class HamiltonianCycle {

    private int V;
    private int[] path;

    private boolean isSafe(int v, int[][] graph, int[] path, int pos) {
        if (graph[path[pos - 1]][v] == 0) {
            return false;
        }

        for (int i = 0; i < pos; i++) {
            if (path[i] == v) {
                return false;
            }
        }

        return true;
    }

    private boolean hamiltonianCycleUtil(int[][] graph, int[] path, int pos) {
        if (pos == V) {
            return graph[path[pos - 1]][path[0]] == 1;
        }

        for (int v = 1; v < V; v++) {
            if (isSafe(v, graph, path, pos)) {
                path[pos] = v;

                if (hamiltonianCycleUtil(graph, path, pos + 1)) {
                    return true;
                }

                path[pos] = -1;
            }
        }

        return false;
    }

    private int hamiltonianCycle(int[][] graph) {
        path = new int[V];
        for (int i = 0; i < V; i++) {
            path[i] = -1;
        }

        path[0] = 0;
        if (!hamiltonianCycleUtil(graph, path, 1)) {
            System.out.println("No solution exists");
            return 0;
        }

        printSolution(path);
        return 1;
    }

    private void printSolution(int[] path) {
        System.out.println("Solution exists: Following is one Hamiltonian Cycle:");
        for (int i = 0; i < V; i++) {
            System.out.print(" " + path[i] + " ");
        }
        System.out.println(" " + path[0] + " ");
    }

    public static void main(String[] args) {
        HamiltonianCycle hamiltonian = new HamiltonianCycle();
        hamiltonian.V = 5;
        int[][] graph = {
                {0, 1, 0, 1, 0},
                {1, 0, 1, 1, 1},
                {0, 1, 0, 0, 1},
                {1, 1, 0, 0, 1},
                {0, 1, 1, 1, 0}
        };

        hamiltonian.hamiltonianCycle(graph);
    }
}