package com.lanqiao.study;

import org.junit.Before;
import org.junit.Test;

public class 返回矩阵中边界为1的最大矩阵的大小 {
    int[][] arr;

    @Before
    public void init() {
        arr = new int[][]{
                {0, 1, 1, 1},
                {0, 1, 0, 1},
                {0, 1, 1, 1}
        };
    }

    public int getMax() {
        int rn = arr.length;
        int cn = arr[0].length;
        while (rn > 0) {
            for (int i = 0; i < rn; i++) {
                //如果越界了，直接下一轮即可
                if (i + rn >= rn) {
                    break;
                }
                l1:
                for (int j = 0; j < rn; j++) {
                    //如果越界了，直接下一轮即可
                    if (j + rn >= cn) {
                        break;
                    }
                    if (arr[i][j] == 0 || arr[i + rn][j + rn] == 0) {
                        continue l1;
                    } else {
                        //判断边界是否都为1
                        boolean isOne = jugeOne(i, j, rn);
                        if (isOne) {
                            return rn;
                        }
                    }
                }
            }

            rn--;
        }

        return 0;
    }

    private boolean jugeOne(int i, int j, int rn) {
        int r = i, c = j;
        while (r <= i + rn && c <= j + rn) {
            if (arr[i][c] == 0 || arr[r][j] == 0) {
                return false;
            } else {
                r++;
                c++;
            }
        }
        r = i + rn;
        c = j + rn;
        while (r >= i && c >= j) {
            if (arr[i][c] == 0 || arr[r][j] == 0) {
                return false;
            } else {
                c--;
                r--;
            }
        }

        return true;
    }

    @Test
    public void test() {
        System.out.println(getMax());
    }
}
