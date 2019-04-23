package com.lanqiao.study;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //原始的
        int N= in.nextInt();
//        需要的
        int M = in.nextInt();
        int [] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        double res = getRes(arr,M);
        System.out.print(res);
    }

    private static double getRes(int[] arr,int M) {
        double res = 0.0;
        Arrays.sort(arr);
        int i = arr[arr.length] % arr[0];
        int n = 0;
        if(i == 0){
            return (double)arr[0];
        }else{
            return (double)arr[arr.length] / 2;
        }


    }


}
