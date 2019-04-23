package com.Leetcode;

public class Solution206 {
    public static ListNode reverseList(ListNode head) {
        //使用三个指针操作链表
        ListNode pre = null;
        ListNode cur = head;
        while (cur.next != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        cur.next = pre;
        return cur;
    }
}
