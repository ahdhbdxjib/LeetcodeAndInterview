package com.lanqiao.study;

public class KMP算法 {
    public static void main(String[] args) {
        int[] arr = getNextArray("ababc".toCharArray(),new int[5],5);
        for(int i : arr){
            System.out.println("i = " + i);

        }

    }
    /**
     * 步骤：
     * 1. 将字串的前缀字符串求出
     * 2. 求得每个字符串的最长前缀和最长后缀是都相等（不包括本身）
     * 3. 如果这两个不相等则就将其剪短继续尝试；最终求得prefixtable
     * 4.
     *
     * @return
     */
    private static int[] getNextArray(char pattern[], int[] prefix, int n) {
        /**
         * 使用的时dp的思想
         * 当前的如果和前缀相同的话，就在前面的数组上加1
         * 否则，对应前面的字符串的斜对角的数字的值，
         */
        prefix[0] = 0;
        //
        int len = 0;
        int i = 1;
        while (i < n) {
            if(pattern[i] == pattern[len]){
                len ++;
                prefix[i] = len;
                i ++;
            }else{
                if (len > 0){
                    //转移到左下角
                    len = prefix[len - 1];
                }else{
                    prefix[i] = len;
                    i++;
                }
            }
        }


        return prefix;
    }
}
