package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Leetcode_LCP5 {


    class LCP5Node {
        int n;
        long coins = 0;
        LCP5Node parent;
        Map<Integer, LCP5Node> children = new HashMap<>();

        LCP5Node(int n) {
            this.n = n;
        }

        public void setParent(LCP5Node parent) {
            this.parent = parent;
        }

        public void addChild(LCP5Node child) {
            children.put(child.n, child);
        }

        public int getChildrenCount() {
            if (childrenCountMap.containsKey(this)) {
                return childrenCountMap.get(this);
            }
            int count = children.size();
            for (LCP5Node child : children.values()) {
                count += child.getChildrenCount();
            }
            childrenCountMap.put(this, count);
            return count;
        }

        public long addCoinsWithChildren(long coins) {
            for (LCP5Node child : children.values()) {
                child.addCoinsWithChildren(coins);
            }
            long collectiveCoins = (getChildrenCount() + 1) * coins;
            this.coins += collectiveCoins;
            return collectiveCoins;
        }

        public void addCoins(long coins) {
            this.coins += coins;
            LCP5Node parent = this.parent;
            while (parent != null) {
                parent.coins += coins;
                parent = parent.parent;
            }
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof LCP5Node)) {
                return false;
            }
            LCP5Node other = (LCP5Node) obj;
            return this.n == other.n;
        }

        @Override
        public String toString() {
            return String.format("%d-%d", n, coins);
        }

        @Override
        public int hashCode() {
            return ("" + n).hashCode();
        }
    }

    private Map<Integer, LCP5Node> leaderMap = new HashMap<>();
    private Map<LCP5Node, Integer> childrenCountMap = new HashMap<>();

    // leetcode LCP 5  发LeetCoins
    public int[] bonus(int n, int[][] leadership, int[][] operations) {
        for (int i = 0; i < n - 1; i++) {
            int leaderNum = leadership[i][0];
            LCP5Node leader = leaderMap.compute(leaderNum, (k, v) -> {
                if (v == null) {
                    v = new LCP5Node(leaderNum);
                }
                return v;
            });
            int memberNum = leadership[i][1];
            LCP5Node member = leaderMap.compute(memberNum, (k, v) -> {
                if (v == null) {
                    v = new LCP5Node(memberNum);
                }
                return v;
            });
            member.setParent(leader);
            leader.addChild(member);
        }
        int[] result = new int[operations.length];
        int count = 0;
        for (int i = 0; i < operations.length; i++) {
            int type = operations[i][0];
            int member = operations[i][1];
            LCP5Node node = leaderMap.get(member);
            switch (type) {
                case 1:
                    node.addCoins(operations[i][2]);
                    break;
                case 2:
                    long moreCoins = node.addCoinsWithChildren(operations[i][2]);
                    if (node.parent != null) {
                        node.parent.addCoins(moreCoins);
                    }
                    break;
                case 3:
                    result[count++] = (int) (node.coins % (1e9 + 7));
            }
        }
        return Arrays.copyOf(result, count);
    }

}
