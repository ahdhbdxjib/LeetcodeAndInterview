package com.lanqiao.快手;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while (reader.hasNextInt()) {
            int m = reader.nextInt();
            int n = reader.nextInt();
            int k = reader.nextInt();
            int res = getRes(m, n, k);
            System.out.println(res);
        }
    }

    private static int getRes(int m, int n, int k) {
        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j <= k) {
                    res++;
                }else {
                    continue;
                }
            }
        }

        return res;
    }
}
