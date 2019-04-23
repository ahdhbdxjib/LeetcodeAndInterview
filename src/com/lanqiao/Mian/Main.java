package com.lanqiao.Mian;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while (reader.hasNextInt()) {
            int n = reader.nextInt();
            int res = getNum(n);
            System.out.println(res);
        }
    }

    private static int getNum(int n) {
        if(n==1){
            return 1;
        }if(n==2){
            return 2;
        }
        return getNum(n -1) + getNum(n -2);
    }
}
