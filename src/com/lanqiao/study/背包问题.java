package com.lanqiao.study;

/**
 * 算法描述
 * 背包重量：2   3   4   5   9
 * 价值：   3   4   5   8   10
 * 背包容量： 20
 * B(K,W): k 个商品 ； W 剩下的空间
 */
public class 背包问题 {
    public static void main(String[] args) {
        //对于每一种的商品都有偷和不偷的两种情况
        //偷 ： 背包的重量会减少相应的重量，不偷，会将物品减一，商品的数量会减少
        //数组的行代表的是K个商品，列代表的是
        int[][] dp = new int[6][21];
        int[] p = {0, 3, 4, 5, 10, 8};
        int[] v = {0, 2, 3, 4, 9, 5};
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 21; j++) {
                //中止条件时，当前的重量大于背包的容量，就只是减去数量，但是不加质量
                if (v[i] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    //选
                    int a = dp[i - 1][j - v[i]] + p[i];
                    //不选
                    int b = dp[i - 1][j];
                    dp[i][j] = Math.max(a, b);
                }
            }

        }
        System.out.println(dp[5][20]);
    }
}
