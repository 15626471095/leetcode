package com.leetcode;

public class Leetcode_23 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    // 合并K个排序链表
    // leetcode 23

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        return mergeKLists(0, lists.length - 1, lists);
    }

    public ListNode mergeKLists(int start, int end, ListNode[] lists) {
        if (start == end) {
            return lists[start];
        }
        if (end - start == 1) {
            ListNode res = new ListNode(0);
            ListNode cur = res;
            ListNode a = lists[start];
            ListNode b = lists[end];
            while (true) {
                if (a == null) {
                    cur.next = b;
                    break;
                }
                if (b == null) {
                    cur.next = a;
                    break;
                }
                if (a.val <= b.val) {
                    cur.next = new ListNode(a.val);
                    a = a.next;
                } else {
                    cur.next = new ListNode(b.val);
                    b = b.next;
                }
                cur = cur.next;
            }
            return res.next;
        }
        int mid = (end - start + 1) / 2;
        return mergeKLists(new ListNode[]{mergeKLists(start, start + mid - 1, lists), mergeKLists(start + mid, end, lists)});
    }

}
