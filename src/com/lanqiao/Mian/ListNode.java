package com.lanqiao.Mian;



 public class ListNode {
     int val;
      ListNode next;
     ListNode(int x) { val = x; }
 }
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //使用归并的方法
        ListNode res = new ListNode(0);
        ListNode p = res;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                res = l1;
                l1 = l1.next;
            }else{
                res = l2;
                l2 = l2.next;
            }
            res = res.next;
        }
        if(l1 != null){
            while(l1 != null){
                res = l1;
                l1 = l1.next;
                res = res.next;
            }
        }
        if(l2 != null){
            while(l2 != null){
                res = l2;
                l2 = l2.next;
                res = res.next;
            }
        }

        return p.next;
    }
}

class test{
    public static void main(String[] args) {

    }
}