package com.leetcode;

import java.math.BigInteger;

public class Leetcode_2 {

    // 两数相加
    // leetcode 2
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder sb = new StringBuilder();
        sb.append(l1.val);
        while (l1.next != null) {
            l1 = l1.next;
            sb.append(l1.val);
        }
        BigInteger b1 = new BigInteger(sb.reverse().toString());
        sb.setLength(0);
        sb.append(l2.val);
        while (l2.next != null) {
            l2 = l2.next;
            sb.append(l2.val);
        }
        BigInteger b2 = new BigInteger(sb.reverse().toString());
        char[] chars = b1.add(b2).toString().toCharArray();
        ListNode root = new ListNode(Integer.valueOf("" + chars[chars.length - 1]));
        ListNode cur = root;
        for (int i = chars.length - 2; i >= 0; i--) {
            cur.next = new ListNode(Integer.valueOf("" + chars[i]));
            cur = cur.next;
        }
        return root;
    }

}
