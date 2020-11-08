package com.qingfeng.learning.algorithm.recursion.tribonacci;

import org.junit.Test;

/**
 * @author leowu
 * @date 2020/10/30
 */
public class SolutionTest {

    @Test
    public void testTrib() {
        Solution solution = new Solution();
        System.out.println(solution.trib(25));
    }

    @Test
    public void show() {
        Solution solution = new Solution();
        StringBuffer sb = new StringBuffer("泰波那契（Fibonacci）数列-》");
        int n = 5;
        for (int i = 0; i <= n; i++) {
            sb.append(solution.trib(i)).append(" ");
        }

        System.out.println(sb.toString());
    }
}
