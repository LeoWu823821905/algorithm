package com.qingfeng.learning.algorithm.test.recursion.postordertraversal;

import com.qingfeng.learning.algorithm.recursion.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qingfeng
 * @date 2020/11/8
 */
public class Solution {

    public List<Integer> postOrder(TreeNode<Integer> treeNode) {
        List<Integer> list = new ArrayList<>();
        postOrder(treeNode, list);
        return list;
    }

    private void postOrder(TreeNode<Integer> treeNode, List<Integer> list) {
        if (treeNode == null) {
            return;
        }

        postOrder(treeNode.getLeft(), list);
        postOrder(treeNode.getRight(), list);

        list.add(treeNode.getData());
    }
}
