package com.qingfeng.learning.algorithm.recursion.qingWaTiaoTaiJie;

/**
 * @author leowu
 * @date 2020/10/30
 */
public class Solution {

    public long numWays(int n) {

        long a = 1l, b = 1l, sum;

        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
