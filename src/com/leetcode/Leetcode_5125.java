package com.leetcode;

public class Leetcode_5125 {

    private int[] directX = new int[]{-1, 1, 0, 0};
    private int[] directY = new int[]{0, 0, -1, 1};
    private int[][] grid5215;
    private int gridX, gridY;
    private int goldCount = 0;

    // leetcode 5215 黄金矿工
    public int getMaximumGold(int[][] grid) {
        grid5215 = grid;
        gridX = grid.length;
        gridY = grid[0].length;
        for (int i = 0; i < gridX; i++) {
            for (int j = 0; j < gridY; j++) {
                goldMine(i, j, 0);
            }
        }
        return goldCount;
    }

    public void goldMine(int x, int y, int count) {
        if (x < 0 || x >= gridX || y < 0 || y >= gridY) {
            return;
        }
        int gold = grid5215[x][y];
        if (gold == 0) {
            return;
        } else {
            grid5215[x][y] = 0;
            count += gold;
        }
        for (int i = 0; i < 4; i++) {
            int newX = x + directX[i];
            int newY = y + directY[i];
            goldMine(newX, newY, count);
        }
        goldCount = Math.max(goldCount, count);
        grid5215[x][y] = gold;
    }

}
