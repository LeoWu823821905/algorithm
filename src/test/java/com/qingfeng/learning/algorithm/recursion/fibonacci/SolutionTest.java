package com.qingfeng.learning.algorithm.recursion.fibonacci;

import org.junit.Test;

/**
 * @author leowu
 * @date 2020/10/29
 */
public class SolutionTest {

    @Test
    public void testFib() {
        Solution solution = new Solution();
        System.out.println(solution.fib(5));
    }

    @Test
    public void testFibLoop() {
        Solution solution = new Solution();
        System.out.println(solution.fibLoop(5));
    }

    @Test
    public void show() {
        Solution solution = new Solution();
        StringBuffer sb = new StringBuffer("斐波那契（Fibonacci）数列-》");
        int n = 5;
        for (int i = 0; i <= n; i++) {
//            sb.append(solution.fib(i)).append(" ");
            sb.append(solution.fibLoop(i)).append(" ");
        }

        System.out.println(sb.toString());
    }
}
