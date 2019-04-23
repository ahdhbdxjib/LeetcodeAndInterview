package com.lanqiao.study;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        while (reader.hasNext()) {
            String str = reader.next();
            int length = str.length();
            Map<Character,Integer> map = new LinkedHashMap<>();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < length; i++) {
                map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0) + 1);
            }
            Set<Map.Entry<Character, Integer>> entries = map.entrySet();
            for(Map.Entry c : entries){
                int temp = (int) c.getValue();
                if(temp == 1){
                 sb.append(c.getKey());
                }else{
                    sb.append(c.getKey()+(c.getValue()+""));
                }
            }
            System.out.println(sb);
        }
    }
}
