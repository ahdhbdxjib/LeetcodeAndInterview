package com.lanqiao.study;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("leet");
        arr.add("code");
        boolean leetcode = wordBreak("leetcode", arr);
        System.out.println(leetcode);
    }
    public static boolean wordBreak(String s, List<String> wordDict) {

        String str= null;
        int i = 0;
        while("".equals(s)){
            if(i >= wordDict.size()){
                return false;
            }
            str = wordDict.get(i);
            if(!s.startsWith(str)){
                i ++;
                continue;
            }else{
                s = s.replaceFirst(str,"");
                if(s .equals("")){
                    return true;
                }
                i = 0;
                continue;
            }
        }
        return true;
    }
}