package com.qingfeng.learning.algorithm.recursion.postordertraversal;

import com.qingfeng.learning.algorithm.recursion.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qingfeng
 * @date 2020/11/8
 */
public class Solution {

    public List<Integer> postorderTraversal(TreeNode<Integer> treeNode) {
        List<Integer> list = new ArrayList<>();
        postorder(treeNode, list);
        return list;
    }

    private void postorder(TreeNode<Integer> node, List<Integer> list) {
        if (null == node) {
            return;
        }

        postorder(node.getLeft(), list);
        postorder(node.getRight(), list);
        list.add(node.getData());
    }

}
