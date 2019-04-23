package com.lanqiao.Mian;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while (reader.hasNextInt()) {
            int n = reader.nextInt();
            long res = getNum(n);
            System.out.println(res);
        }
    }

    private static long getNum(int n) {
        long[] dp = new long[n];
        if (n == 0) {
            return 0;
        }
        dp[0] = 1;
        if (n == 1) {
            return 1;
        }
        dp[1] = 2;
        if (n == 2) {
            return 2;
        }
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n - 1];
    }
}
