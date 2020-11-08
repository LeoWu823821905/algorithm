package com.qingfeng.learning.algorithm.recursion;

import java.util.LinkedList;
import java.util.Random;

/**
 * @author qingfeng
 * @date 2020/11/8
 */
public class TreeNodeCreator {


    /**
     * 由数组生成树
     * @param array 树节点值数组
     * @return 树
     */
    public TreeNode<Integer> createTreeNode(Integer[] array) {

        return createTreeNode(array, 1);
    }

    /**
     * 创建n个节点的二叉树，节点值在0~randomMaxNum之间
     * @param n 节点数
     * @param randomMaxNum 节点值，随机区间
     * @return 树
     */
    public TreeNode<Integer> createTreeNode(int n, int randomMaxNum) {
        // 获取0~100数字列表
        LinkedList<Integer> oneHundredNumber = oneHundredNumber();

        // 随机选取n个数字，组成不重复数组
        Integer[] array = new Integer[5];
        Random random = new Random(1);
        for (int i = 0; i < n; i++) {
            int index = random.nextInt(randomMaxNum);
            array[i] = oneHundredNumber.get(index);
            System.out.println("生成节点的数值->" + array[i]);
            oneHundredNumber.remove(index);
            --randomMaxNum;
        }

        // 由数组生成树
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
