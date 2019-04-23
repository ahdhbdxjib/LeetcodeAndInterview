package com.lanqiao.study;

public class 最大子数组 {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 5, -2, 6, -1};
        int max = gatMax(arr);
        System.out.println(max);
    }

    //3,5,-2,6
    private static int gatMax(int[] arr) {
        int sum = arr[0];
        int max = sum;
        //如果当前一个加上后一个的数字为大于0就将其带上，并和后面的数字下相加是否最大，并动态的保存当前最大的
        //如果是小于零的就将其区间移动到下一处
        for (int i = 1; i < arr.length; i++) {
            if (sum > 0) {
                sum += arr[i];
            }else{
                sum = arr[i];
            }

            //维护最大的数
            if(max < sum){
                max = sum;
            }
        }

        return max;
    }
}
