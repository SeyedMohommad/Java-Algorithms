package Backtracking.RatInAMaze;

public class RatInAMaze {

    private static boolean isSafe(int[][] maze, int x, int y) {
        return x >= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y] == 1;
    }

    private static boolean solveMaze(int[][] maze, int x, int y, int[][] solution) {
        if (x == maze.length - 1 && y == maze.length - 1) {
            solution[x][y] = 1;
            return true;
        }

        if (isSafe(maze, x, y)) {
            solution[x][y] = 1;

            // Move forward in the x direction
            if (solveMaze(maze, x + 1, y, solution)) {
                return true;
            }

            // If moving in x doesn't give solution then move down in y direction
            if (solveMaze(maze, x, y + 1, solution)) {
                return true;
            }

            // If none of the above movements work, then backtrack
            solution[x][y] = 0;
            return false;
        }

        return false;
    }

    private static void printSolution(int[][] solution) {
        for (int i = 0; i < solution.length; i++) {
            for (int j = 0; j < solution.length; j++) {
                System.out.print(solution[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}
        };

        int[][] solution = new int[maze.length][maze.length];

        if (solveMaze(maze, 0, 0, solution)) {
            printSolution(solution);
        } else {
            System.out.println("No solution exists");
        }
    }
}
