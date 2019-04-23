package com.Leetcode;

import java.util.*;

public class Solution347 {
    private class myObj implements Comparable<myObj> {
        int n, seq;

        public myObj() {
        }

        public myObj(int n, int seq) {
            this.n = n;
            this.seq = seq;
        }

        @Override
        public int compareTo(myObj o) {
            if (this.seq < o.seq) {
                return -1;
            } else if (this.seq > o.seq) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public List<Integer> topKFrequent(int[] nums, int k) {
        /**
         * 1.使用map将数据排序
         * 2.使用优先队列将数据按照频次排序
         * 3.使用LinkedList将数据返回
         */
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        PriorityQueue<myObj> queue = new PriorityQueue<>();
        for (int key : map.keySet()){
            if(queue.size() < k){
                queue.add(new myObj(key,map.get(key)));
            }else{
                queue.add(new myObj(key,map.get(key)));
                myObj t = queue.poll();
                System.out.println("出来的元素是："+t.n);
            }
        }
        List<Integer> list = new ArrayList<>(k);
        while (!queue.isEmpty()){
            list.add(queue.poll().n);
        }
        return list;
    }
}
