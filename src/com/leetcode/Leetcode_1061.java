package com.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode_1061 {

    // leetcode 1061 按字典序排列最小的等效字符串
    public String smallestEquivalentString(String A, String B, String S) {
        List<Set<Character>> list = new ArrayList<>();
        int len = A.length();
        for (int i = 0; i < len; i++) {
            char a = A.charAt(i);
            char b = B.charAt(i);
            boolean find = false;
            for (Set<Character> set : list) {
                if (set.contains(a) || set.contains(b)) {
                    set.add(a);
                    set.add(b);
                    find = true;
                    break;
                }
            }
            if (!find) {
                Set<Character> set = new HashSet<>();
                set.add(a);
                set.add(b);
                list.add(set);
            }
        }
        len = S.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            char c = S.charAt(i);
            sb.append(c);
        }
        return sb.toString();
    }

}
