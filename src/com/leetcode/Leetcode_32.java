package com.leetcode;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Leetcode_32 {

    // 最长有效括号
    // leetcode 32
    public int longestValidParentheses(String s) {
        Map<Integer, Integer> match = new HashMap<>();
        Stack<Map.Entry<Character, Integer>> stack = new Stack<>();
        int m = -1, n = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(new AbstractMap.SimpleEntry<>(c, i));
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    continue;
                }
                if (stack.peek().getKey() == '(') {
                    Map.Entry<Character, Integer> entry = stack.pop();
                    if (m == -1 && n == -1) {
                        m = entry.getValue();
                        n = i;
                    } else {
                        if (n + 1 == entry.getValue()) {
                            n = i;
                            m = Math.min(m, entry.getValue());
                        } else if (n + 1 == i) {
                            n = i;
                            m = entry.getValue();
                        } else {
                            m = entry.getValue();
                            n = i;
                        }
                    }
                    match.put(m, n);
                } else {
                    stack.push(new AbstractMap.SimpleEntry<>(c, i));
                }
            }
        }
        int max = 0;
        for (int start : match.keySet()) {
            int next = match.get(start) + 1;
            while (match.containsKey(next)) {
                next = match.get(next) + 1;
            }
            if (next - start > max) {
                max = next - start;
            }
        }
        return max;
    }

}
