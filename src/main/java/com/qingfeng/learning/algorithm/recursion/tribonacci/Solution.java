package com.qingfeng.learning.algorithm.recursion.tribonacci;

/**
 * @author leowu
 * @date 2020/10/30
 */
public class Solution {

    public long trib(int n) {
        return trib(n, 0, 1, 1);
    }

    private long trib(int n, long a, long b, long c) {
        if (n <= 0) {
            return 0;
        }
        if (n < 3) {
            return c;
        }

        return trib(n - 1, b, c, a + b +c);
    }
}
