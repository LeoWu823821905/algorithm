package com.qingfeng.learning.algorithm.recursion.minimumDistanceBetweenBstNodes;

import com.qingfeng.learning.algorithm.recursion.TreeNode;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Random;

/**
 * @author leowu
 * @date 2020/10/29
 */
public class SolutionTest {

    @Test
    public void testMinDiffInBST() {
        Solution solution = new Solution();
        int ans = solution.minDiffInBST(createTreeNode());
        System.out.println("最小差值->" + Integer.toString(ans));
    }

    private TreeNode<Integer> createTreeNode() {
        // 获取0~100数字列表
        LinkedList<Integer> oneHundredNumber = oneHundredNumber();

        // 随机选取n个数字，组成不重复数组
        int n = 5;
        int randomMaxNum = 99;
        Integer[] array = new Integer[5];
        Random random = new Random(1);
        for (int i = 0; i < n; i++) {
            int index = random.nextInt(randomMaxNum);
            array[i] = oneHundredNumber.get(index);
            System.out.println("生成数->" + array[i]);
            oneHundredNumber.remove(index);
            --randomMaxNum;
        }

        // 有数组生成树
        return createTreeNode(array, 1);
    }

    private TreeNode<Integer> createTreeNode(Integer[] array, int index) {
        if (index > array.length) {
            return null;
        }
        Integer value = array[index - 1];
        if (null == value) {
            return null;
        }
        TreeNode<Integer> treeNode = new TreeNode<Integer>(value);

        treeNode.setLeft(createTreeNode(array, index *2));
        treeNode.setRight(createTreeNode(array, index * 2 +1));
        return treeNode;
    }

    private LinkedList<Integer> oneHundredNumber() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for (int i = 1; i <= 100; i++) {
            linkedList.add(i);
        }
        return linkedList;
    }
}
