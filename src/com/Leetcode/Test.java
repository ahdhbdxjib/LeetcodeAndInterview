package com.Leetcode;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class WordListOrder {


    @Test
    public void test140(){
        String s = "catsanddog";
        List<String > wordDict = new ArrayList<>(Arrays.asList("cat", "cats", "and", "sand", "dog"));
        List<String> strings = Solution140.wordBreak(s, wordDict);
        for (String s1 : strings){
            System.out.println(s1);

        }
    }


    @Test
    public void test139(){
        String s = "leetcode";
        List<String>worldList = new ArrayList<>();
        worldList.add("leet");
        worldList.add("code");
        boolean b = Solution139.wordBreak(s, worldList);
        System.out.println("b = " + b);
    }





   /* public static int canArrangeWords(String arr[]) {
        char temp = arr[0].charAt(arr[0].length() - 1);
        for (int i = 1; i < arr.length; i++) {
            if (!arr[i].startsWith(Character.toString(temp))) {
                return 0;
            }
            temp = arr[i].charAt(arr[i].length() - 1);

        }
        return 0;

    }*/

    @Test
    public void test206() {
        ListNode head = new ListNode(1);
        ListNode c = head;
        for (int i = 2; i < 6; i++) {
            c.next = new ListNode(i);
            c = c.next;
        }
        ListNode listNode = Solution206.reverseList(head);

    }

    @Test
    public void test5() {
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            l.add(i);
        }
        for (Integer i : l ) {
            if(i == 5){
                l.remove(5);
            }
            System.out.println(i);
        }

    }
}