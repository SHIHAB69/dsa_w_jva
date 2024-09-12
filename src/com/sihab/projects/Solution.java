package com.sihab.projects;

import java.util.*;

public class Solution {
    private static int manhattanDistance(int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int xa = scanner.nextInt();
            int ya = scanner.nextInt();

            int xb = scanner.nextInt();
            int yb = scanner.nextInt();

            int N = scanner.nextInt();
            int M = scanner.nextInt();

            int[][] stations = new int[N][2];
            for (int i = 0; i < N; i++) {
                stations[i][0] = scanner.nextInt();
                stations[i][1] = scanner.nextInt();
            }

            List<int[]> points = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                points.add(new int[]{stations[i][0], stations[i][1]});
            }

            points.add(new int[]{xb, yb});

            points.sort(Comparator.comparingInt(p -> manhattanDistance(xa, ya, p[0], p[1])));

            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

            int currentFuel = M;
            int currentPosX = xa;
            int currentPosY = ya;
            int refuels = 0;
            int index = 0;

            while (index < points.size()) {
                int nextX = points.get(index)[0];
                int nextY = points.get(index)[1];
                int distanceToNext = manhattanDistance(currentPosX, currentPosY, nextX, nextY);

                while (currentFuel < distanceToNext) {
                    if (pq.isEmpty()) {
                        refuels = -1;
                        break;
                    }
                    currentFuel += pq.poll();
                    refuels++;
                }

                if (refuels == -1) break;

                currentFuel -= distanceToNext;
                currentPosX = nextX;
                currentPosY = nextY;

                if (index < N) {
                    pq.add(M);
                }

                index++;
            }

            System.out.println(refuels);
        }

        scanner.close();
    }
}
