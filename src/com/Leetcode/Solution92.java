package com.Leetcode;

/**
 * 反转链表2
 */
public class Solution92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        //将链表遍历在指定的的位置时，将各自的两端保存起来，然后
        int len = n - m + 1;
        ListNode nNode = null;
        ListNode pre_nNode = null;
        ListNode cur = head;
        int i = 1;
        while (cur != null) {
            if(i == m -1){
               pre_nNode = cur; 
            }if(i == m){
                nNode = cur;
            }
        }
        //将后面的len个节点反转
        ListNode pre = nNode;
        cur = nNode.next;
        ListNode mNode = null;
        int j = 1;
        while (j <= len && cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
            if(j == n ){
                mNode = cur.next;
            }
            j --;
        }
        //将链表放回原来的链表
        pre_nNode.next = cur;
        nNode = mNode;
        return head;
    }
}
