package com.lanqiao.study;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        int n = 200;
        String [] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = in.next();
        }
        String[] res = getRes(strs);
        System.out.print(res);
    }

    private static String[] getRes(String[] strs) {
       String[] res = new String[strs.length];
        for (int i = 0; i < strs.length; i++) {
            String temp = strs[i];
            temp = getRes(temp);
            while (!temp.equals(getRes(temp))){
                temp = getRes(temp);
            }
            res[i] = temp;
        }
        return res;
    }
    private static String getRes(String str) {
        String s = null;
        //三个相同的去掉一个
        //两对一样的去掉第二队的一个字母
        int i = 0,j = 1;
        boolean flag = false;
        while(i < str.length() && j < str.length()){
            if(str.charAt(i) != str.charAt(j) && flag == false){
                i = j;
                j ++;
            }
            if(flag == true && str.charAt(i) != str.charAt(j)){
                i = j;
                j ++;

            }
            if(str.charAt(i) == str.charAt(j)){
                j ++;
                //三个了
                if(flag == true && str.charAt(i) == str.charAt(j)){
                    s = str.substring(0, j)+""+str.substring(j+1);
                    return s;
                }
                if(j - i == 2){
                    s = str.substring(0, j)+""+str.substring(j+1);
                    return s;
                }
                flag =true;
            }
        }

        return str;


    }
}
