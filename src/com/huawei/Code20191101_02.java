package com.huawei;

import java.util.Stack;

public class Code20191101_02 {

    public int[] findFirstMinArr(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty()) {
                int peek = stack.peek();
                if (arr[i] > peek) {
                    ans[i] = peek;
                    stack.push(arr[i]);
                    break;
                } else {
                    stack.pop();
                }
            }
            if (stack.isEmpty()) {
                ans[i] = -1;
                stack.push(arr[i]);
            }
        }
        return ans;
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Code20191101_02 test = new Code20191101_02();
        print(test.findFirstMinArr(new int[]{1, 4, 10, 2, 8, 9, 1}));
        print(test.findFirstMinArr(new int[]{1, 6, 4, 10, 2, 5}));
        print(test.findFirstMinArr(new int[]{2, 4, 1, 3, 6}));
    }

}
