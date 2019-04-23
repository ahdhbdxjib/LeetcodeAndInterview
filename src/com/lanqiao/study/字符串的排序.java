package com.lanqiao.study;

import java.util.Stack;

public class 字符串的排序 {
    public static void main(String[] args) {
        int i = 9;
        String num1 = "2235";
        String num2 = "8235";
//        System.out.println(num1.charAt(1));
        String res = multiply(num1, num2);
        System.out.println(res);
    }

    public static String multiply(String num1, String num2) {
        Stack<Integer> stack = new Stack<>();
        int length1 = num1.length();
        int length2 = num2.length();
        int i = length1 - 1, j = length2 - 1;
        int temp = 0;
        StringBuffer sb = new StringBuffer("");
        while (i >= 0 && j >= 0) {
            int a = (int) num1.charAt(i) - '0';
            int b = (int) num2.charAt(j) - '0';
            //求得当前得位置的数据
            if(temp != 0){
                int c = (a * b) + temp;
            }
            int c = a * b;
            stack.push(c % 10);
            System.out.println(c % 10);
            temp = c / 10;
            i--;
            j--;
            if(i < 0 && j < 0 && temp != 0){
                stack.push(temp);
            }
        }
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        //多间了一次，需要加回来
        i++;
        j++;
        return sb.toString();

    }
}
/*    */
