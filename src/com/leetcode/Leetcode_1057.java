package com.leetcode;

import java.util.*;

public class Leetcode_1057 {

    class Pair1057 {
        int worker;
        int workerX, workerY;
        int bike;
        int bikeX, bikeY;
        int distance;

        public Pair1057(int worker, int workerX, int workerY, int bike, int bikeX, int bikeY) {
            this.worker = worker;
            this.workerX = workerX;
            this.workerY = workerY;
            this.bike = bike;
            this.bikeX = bikeX;
            this.bikeY = bikeY;
            this.distance = manhattan(workerX, workerY, bikeX, bikeY);
        }

        public int compare(Pair1057 other) {
            int ans = Integer.compare(distance, other.distance);
            if (ans == 0) {
                ans = Integer.compare(this.worker, other.worker);
            }
            if (ans == 0) {
                ans = Integer.compare(this.bike, other.bike);
            }
            return ans;
        }
    }

    // leetcode 1057 校园自行车分配
    public int[] assignBikes(int[][] workers, int[][] bikes) {
        int n = workers.length;
        int m = bikes.length;
        List<Pair1057> pairs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                pairs.add(new Pair1057(i, workers[i][0], workers[i][1], j, bikes[j][0], bikes[j][1]));
            }
        }
        pairs.sort(Pair1057::compare);
        Set<Integer> usedWorker = new HashSet<>();
        Set<Integer> usedBike = new HashSet<>();
        List<Pair1057> matched = new ArrayList<>();
        for (int i = 0; i < pairs.size(); i++) {
            Pair1057 p = pairs.get(i);
            if (usedWorker.contains(p.worker) || usedBike.contains(p.bike)) {
                continue;
            }
            matched.add(p);
            usedBike.add(p.bike);
            usedWorker.add(p.worker);
        }
        matched.sort(Comparator.comparingInt(p -> p.worker));
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = matched.get(i).bike;
        }
        return ans;
    }

    public int manhattan(int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }

}
