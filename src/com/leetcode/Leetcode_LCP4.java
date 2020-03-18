package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode_LCP4 {

    private int[] offsetLCP4X = new int[]{-1, 1, 0, 0};
    private int[] offsetLCP4Y = new int[]{0, 0, -1, 1};

    // leetcode LCP 4 多米诺骨牌 二分图 匈牙利算法
    public int domino(int n, int m, int[][] broken) {
        Map<PointLCF4, PointLCF4> cache = new HashMap<>();
        Map<PointLCF4, List<PointLCF4>> map = new HashMap<>();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < broken.length; i++) {
            matrix[broken[i][0]][broken[i][1]] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] != 0) {
                    continue;
                }
                if ((i + j) % 2 == 0) {
                    PointLCF4 left = new PointLCF4(i, j);
                    List<PointLCF4> right = new ArrayList<>();
                    for (int k = 0; k < 4; k++) {
                        int xx = i + offsetLCP4X[k];
                        int yy = j + offsetLCP4Y[k];
                        if (xx >= 0 && xx < n && yy >= 0 && yy < m && matrix[xx][yy] == 0) {
                            PointLCF4 r = new PointLCF4(xx, yy);
                            r = cache.getOrDefault(r, r);
                            cache.put(r, r);
                            right.add(r);
                        }
                    }
                    map.put(left, right);
                }
            }
        }
        for (PointLCF4 left : map.keySet()) {
            Map<PointLCF4, Boolean> used = new HashMap<>();
            hungray(map, used, left);
        }
        int count = 0;
        for (PointLCF4 left : map.keySet()) {
            count += (left.getMatch() == null ? 0 : 1);
        }
        return count;
    }

    public boolean hungray(Map<PointLCF4, List<PointLCF4>> map, Map<PointLCF4, Boolean> used, PointLCF4 left) {
        List<PointLCF4> rightList = map.get(left);
        if (rightList == null || rightList.isEmpty()) {
            return false;
        }
        for (PointLCF4 right : rightList) {
            if (!used.getOrDefault(right, false)) {
                used.put(right, true);
                if (right.getMatch() == null || hungray(map, used, right.getMatch())) {
                    left.setMatch(right);
                    right.setMatch(left);
                    return true;
                }
            }
        }
        return false;
    }

    class PointLCF4 {
        int x;
        int y;

        PointLCF4 match;

        public PointLCF4(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof PointLCF4)) {
                return false;
            }
            PointLCF4 other = (PointLCF4) obj;
            return this.x == other.x && this.y == other.y;
        }

        @Override
        public int hashCode() {
            return toString().hashCode();
        }

        @Override
        public String toString() {
            return String.format("[%d,%d]", x, y);
        }

        public PointLCF4 getMatch() {
            return match;
        }

        public void setMatch(PointLCF4 match) {
            this.match = match;
        }
    }

    private int[][] matrixLCP4;
    private int maxDomino = 0;
    private int maxLCP4X;
    private int maxLCP4Y;


    // leetcode LCP 4 多米诺骨牌 回溯 超时！！！
    public int dominoDFS(int n, int m, int[][] broken) {
        maxLCP4X = n;
        maxLCP4Y = m;
        matrixLCP4 = new int[n][m];
        for (int i = 0; i < broken.length; i++) {
            matrixLCP4[broken[i][0]][broken[i][1]] = 2;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dfsLCP4(i, j, 0);
            }
        }
        return maxDomino;
    }

    public void dfsLCP4(int x, int y, int step) {
        if (!checkBoundLCF4(x, y)) {
            maxDomino = Math.max(maxDomino, step);
            return;
        }
        matrixLCP4[x][y] = 1;
        for (int i = 0; i < 4; i++) {
            int x1 = x + offsetLCP4X[i];
            int y1 = y + offsetLCP4Y[i];
            if (!checkBoundLCF4(x1, y1)) {
                continue;
            }
            if (matrixLCP4[x1][y1] == 0) {
                matrixLCP4[x1][y1] = 1;
                step++;
            } else {
            }
            for (int j = 0; j < 4; j++) {
                int x2 = x1 + offsetLCP4X[j];
                int y2 = y1 + offsetLCP4Y[j];
                dfsLCP4(x2, y2, step);
            }
            matrixLCP4[x1][y1] = 0;
            step--;
        }
        matrixLCP4[x][y] = 0;
    }

    public boolean checkBoundLCF4(int x, int y) {
        return !(x < 0 || x >= maxLCP4X || y < 0 || y >= maxLCP4Y || matrixLCP4[x][y] != 0);
    }

}
