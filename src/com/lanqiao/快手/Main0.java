package com.lanqiao.快手;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//10 5 15 3 7 13 18
public class Main0 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        while (reader.hasNextInt()) {
            int t = reader.nextInt();
            list.add(t);
            System.out.println(t);
        }
        if(IsAVL(list)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }

    private static boolean IsAVL(List<Integer> list) {
        int size = list.size();
        for (int i = 1; i < list.size(); i++) {
            int temp = list.get(i);
            if(i * 2 >= size){
                continue;
            }
            if(list.get(i * 2) < temp && list.get((i * 2) + 1) > temp){
                continue;
            }else{
                return false;
            }
        }

        return true;
    }
}
