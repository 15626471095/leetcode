package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_5081 {

    // leetcode 5081 步进数
    public List<Integer> countSteppingNumbers(int low, int high) {
        List<Integer> result = new ArrayList<>();
        if (low > high) {
            return result;
        }
        if (low == 0) {
            result.add(0);
            low++;
        }
        int lowLen = (int) Math.floor(Math.log10(low) + 1);
        int highLen = (int) Math.floor(Math.log10(high) + 1);

        for (int i = lowLen; i <= highLen; i++) {
            for (int j = 1; j < 10; j++) {
                countSteppingHelper(result, low, high, i, j);
            }
        }
        result.sort(Integer::compareTo);
        return result;
    }


    public void countSteppingHelper(List<Integer> res, int low, int high, int length, long num) {
        if (length - 1 == 0) {
            if (low <= num && num <= high) {
                res.add((int) num);
            }
            return;
        }
        int lastDigit = (int) (num % 10);
        if (lastDigit == 0) {
            countSteppingHelper(res, low, high, length - 1, num * 10 + 1);
        } else if (lastDigit == 9) {
            countSteppingHelper(res, low, high, length - 1, num * 10 + 8);
        } else {
            countSteppingHelper(res, low, high, length - 1, num * 10 + lastDigit + 1);
            countSteppingHelper(res, low, high, length - 1, num * 10 + lastDigit - 1);
        }
    }

}
