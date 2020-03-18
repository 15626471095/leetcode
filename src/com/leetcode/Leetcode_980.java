package com.leetcode;

public class Leetcode_980 {

    // 不同路径
    // leetcode 980

    int step = 0;
    int[][] grid;
    int startX, startY;
    int endX, endY;
    int stepLine = 0;
    int[] offsetX = new int[]{-1, 1, 0, 0};
    int maxX, maxY;
    int[] offsetY = new int[]{0, 0, -1, 1};

    public int uniquePathsIII(int[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        maxX = grid.length;
        maxY = grid[0].length;
        this.grid = grid;
        for (int i = 0; i < maxX; i++) {
            for (int j = 0; j < maxY; j++) {
                int v = grid[i][j];
                if (v == 1) {
                    startX = i;
                    startY = j;
                } else if (v == 2) {
                    endX = i;
                    endY = j;
                } else if (v == 0) {
                    step++;
                }
            }
        }
        dfs(startX, startY, ++step);
        return stepLine;
    }

    public void dfs(int x, int y, int step) {
        if (step < 0) {
            return;
        }
        if (step == 0 && (x == endX && y == endY)) {
            stepLine++;
            return;
        }
        if (grid[x][y] == 0) {
            grid[x][y] = -1;
        }
        --step;
        for (int i = 0; i < 4; i++) {
            int nx = x + offsetX[i];
            int ny = y + offsetY[i];
            if (nx >= 0 && nx < maxX && ny >= 0 && ny < maxY) {
                if (grid[nx][ny] == 0 || (grid[nx][ny] == 2 && step == 0)) {
                    dfs(nx, ny, step);
                }
            }
        }
        if (grid[x][y] == -1) {
            grid[x][y] = 0;
        }
    }

}
