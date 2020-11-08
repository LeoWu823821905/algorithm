package com.qingfeng.learning.algorithm.test.recursion.fibonacci;

/**
 * @author qingfeng
 * @date 2020/11/8
 */
public class Solution {

    public long fib(int n) {
        return fib(n, 1, 1);
    }
    private long fib(int n, long a, long b) {
        if (n <= 0) {
            return 0;
        }

        if (n < 3) {
            return b;
        }
        return fib(n - 1, b, a + b);
    }
}
