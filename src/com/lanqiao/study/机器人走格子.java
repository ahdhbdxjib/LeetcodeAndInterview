package com.lanqiao.study;

public class 机器人走格子 {
    public static void main(String[] args) {
        int res = reslove(6, 6);
        int reslove2 = reslove2(6, 6);
        System.out.println(reslove2);
        System.out.println(res);
    }

    private static int reslove2(int i, int j) {
        int arr[][] = new int[i + 1][j + 1];
        for (int k = 1; k <= j; k++) {
            arr[1][k] = 1;
        }
        for (int k = 1; k <= i; k++) {
            arr[k][1] = 1;
        }

        for (int m = 2; m <= i; m++) {
            for (int n = 2; n <= j; n++) {
                arr[m][n] = arr[m - 1][n] + arr[m][n - 1];
            }
        }
        return arr[i][j];
    }

    /**
     * 使用递归
     *
     * @param i
     * @param j
     * @return
     */
    private static int reslove(int i, int j) {
        if (i == 1 || j == 1) {
            return 1;
        }
        return reslove(i - 1, j) + reslove(i, j - 1);
    }
}
