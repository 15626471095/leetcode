package com.leetcode;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Leetcode_3 {

    // leetcode 3
    // 无重复字符的最长字串
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        Window window = new Window();
        int maxSize = 0;
        for (int i = 0; i < chars.length; i++) {
            window.addChar(chars[i], i);
            if (window.size() > maxSize) {
                maxSize = window.size();
            }
        }
        return maxSize;
    }

    class Window {
        Map<Character, Integer> map = new LinkedHashMap<>();

        void addChar(char c, int index) {
            if (map.containsKey(c)) {
                Set<Character> set = new LinkedHashSet<>(map.keySet());
                for (char key : set) {
                    if (key != c) {
                        map.remove(key);
                        continue;
                    }
                    break;
                }
                map.remove(c);
            }
            map.put(c, index);
        }

        int size() {
            return map.size();
        }
    }

}
