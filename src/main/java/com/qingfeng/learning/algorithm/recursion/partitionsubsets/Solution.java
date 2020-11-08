package com.qingfeng.learning.algorithm.recursion.partitionsubsets;

import java.util.Arrays;

/**
 * @author qingfeng
 * @date 2020/11/8
 */
public class Solution {

    public boolean canPartitionKSubsets(int[] nums, int k) {
        // 1、判断数组和能否分为k个子集
        // 1.1、不能整除
        int sum = Arrays.stream(nums).sum();
        if (sum % k > 0) return false;

        // 每个子集的和值
        int target = sum / k;

        // 1.2、排序后，最大值如果小于子集和值，那么继续，如果最大值大于子集和值，返回false
        Arrays.sort(nums);
        int row = nums.length - 1;
        if (nums[row] > target) return false;

        // 2、末位排除与子集和相等的值，直接可以作为一个独立的子集，不需要其他数字加入子集
        while (row >= 0 && nums[row] == target) {
            row--;
            k--;
        }
        return search(new int[k], row, nums, target);
    }

    private boolean search(int[] groups, int row, int[] nums, int target) {
        if (row < 0) return true;
        int v = nums[row--];
        for (int i = 0; i < groups.length; i++) {
            if (groups[i] + v <= target) {
                groups[i] += v;
                if (search(groups, row, nums, target)) return true;
                groups[i] -= v;
            }
            if (groups[i] == 0) break;
        }
        return false;
    }

}
