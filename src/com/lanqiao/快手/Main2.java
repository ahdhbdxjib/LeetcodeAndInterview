package com.lanqiao.快手;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while (reader.hasNextInt()) {
            int m = reader.nextInt();
            int res = getRes(m);
            System.out.println(res);
        }
    }

    private static int getRes(int m) {
        int res = 0;
        while (m > 0){
            int temp = m % 2;
            if(temp == 1){
                res ++;
            }
            m = m / 2;
        }
        return res;
    }
}
