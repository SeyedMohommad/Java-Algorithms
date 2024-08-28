package DivideAndConquer.ClosestPairOfPoints;

import java.util.Arrays;
import java.util.Comparator;

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class ClosestPairOfPoints {

    public static double dist(Point p1, Point p2) {
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
    }

    public static double bruteForce(Point[] points, int n) {
        double minDist = Double.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (dist(points[i], points[j]) < minDist) {
                    minDist = dist(points[i], points[j]);
                }
            }
        }
        return minDist;
    }

    public static double closestPair(Point[] points, int n) {
        Arrays.sort(points, Comparator.comparingInt(p -> p.x));
        return closestUtil(points, 0, n - 1);
    }

    private static double closestUtil(Point[] points, int l, int r) {
        if (r - l <= 3) {
            return bruteForce(points, r - l + 1);
        }

        int mid = l + (r - l) / 2;
        Point midPoint = points[mid];

        double dl = closestUtil(points, l, mid);
        double dr = closestUtil(points, mid + 1, r);

        double d = Math.min(dl, dr);

        Point[] strip = new Point[r - l + 1];
        int j = 0;
        for (int i = l; i <= r; i++) {
            if (Math.abs(points[i].x - midPoint.x) < d) {
                strip[j] = points[i];
                j++;
            }
        }

        return Math.min(d, stripClosest(strip, j, d));
    }

    private static double stripClosest(Point[] strip, int size, double d) {
        double minDist = d;
        Arrays.sort(strip, 0, size, Comparator.comparingInt(p -> p.y));

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size && (strip[j].y - strip[i].y) < minDist; j++) {
                if (dist(strip[i], strip[j]) < minDist) {
                    minDist = dist(strip[i], strip[j]);
                }
            }
        }
        return minDist;
    }

    public static void main(String[] args) {
        Point[] points = {
                new Point(2, 3), new Point(12, 30), new Point(40, 50),
                new Point(5, 1), new Point(12, 10), new Point(3, 4)
        };

        int n = points.length;
        System.out.println("The smallest distance is " + closestPair(points, n));
    }
}
