package com.lanqiao.study;

public class Test {
    @org.junit.Test
    public void test(){
        System.out.println(getRes("lloo"));
    }
    private  String getRes(String str) {
        String s = null;
        //三个相同的去掉一个
        //两对一样的去掉第二队的一个字母
        char[] chars = str.toCharArray();
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

        return s;

    }
}
