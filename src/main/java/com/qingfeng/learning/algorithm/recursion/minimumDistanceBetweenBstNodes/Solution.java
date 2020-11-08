package com.qingfeng.learning.algorithm.recursion.minimumDistanceBetweenBstNodes;

import com.qingfeng.learning.algorithm.recursion.TreeNode;

/**
 * @author leowu
 * @date 2020/10/29
 */
public class Solution {

    private Integer prev, ans;

    public int minDiffInBST(TreeNode<Integer> treeNode) {
        prev = null;
        ans = Integer.MAX_VALUE;
        dfs(treeNode);
        return ans;
    }

    private void dfs(TreeNode<Integer> treeNode) {

        // 如果node为null，则返回
        if (null == treeNode) return;

        // 遍历左子节点
        dfs(treeNode.getLeft());

        if (null != prev) {
            ans = Math.min(ans, treeNode.getData() - prev);
            ans = Math.abs(ans);
        }

        prev = treeNode.getData();

        // 遍历右子节点
        dfs(treeNode.getRight());

    }
}
