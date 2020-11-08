package com.qingfeng.learning.algorithm.recursion.fibonacci;

/**
 * @author leowu
 * @date 2020/10/29
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

    /**
     * TODO 存在问题，待修复，输出结果：0 1 2 3 5 8
     * @param n
     * @return
     */
    public long fibLoop(int n) {
        long a = 0, b = 1, sum;

        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007; // 1(8)7 1000000007
            a = b;
            b = sum;
        }

        return a;
    }
}
