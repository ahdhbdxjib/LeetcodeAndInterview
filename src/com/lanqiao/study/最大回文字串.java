package com.lanqiao.study;

import sun.security.util.Length;

public class 最大回文字串 {
    public static void main(String[] args) {
        String str = "bbbbab";
  //      int n = getParl(str);
        int m = getParlCenter(str);
        System.out.println("center :" + m);
  //      System.out.println(n);
    }

    private static int getParlCenter(String str) {
//使用中心扩散的方法
        int length = str.length();
        if (length <= 1) {
            return length;
        }
        int max = 1;
        int i = 0;
        //如果回文串是奇数的话
        while (i < length) {
            int m = i, n = i, temp = 0;
            while (m >= 0 && n < length) {
                if (str.charAt(m) == str.charAt(n)) {
                    temp = n - m + 1;
                    max = Math.max(temp, max);
                } else {
                    break;
                }
                m--;
                n++;
            }
            i++;
        }
        //是偶数就向右边一位扩展
        i = 0;
        while (i < length) {
            int m = i, n = i + 1, temp = 0;
            while (m >= 0 && n < length) {
                if (str.charAt(m) == str.charAt(n)) {
                    temp = n - m + 1;
                    max = Math.max(temp, max);
                } else {
                    break;
                }
                m--;
                n++;
            }
            i++;
        }
        return max;
    }

    private static int getParl(String s) {

        int n = s.length();
        int max = 0;
        boolean[][] dp = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                dp[j][i] = s.charAt(i) == s.charAt(j) && i - j <= 2 || dp[i + 1][j - 1];
                if (dp[i][j]) {
                    max = Math.max(i - 1 + 1, max);
                }
            }

        }
        return max;
    }
}
