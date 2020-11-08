package com.qingfeng.learning.algorithm.test.recursion.partitionsubsets;

import java.util.Arrays;

/**
 * @author qingfeng
 * @date 2020/11/8
 */
public class Solution {

    public boolean canPartitionSubsets(int[] nums, int k) {
        int sum = Arrays.stream(nums).sum();
        if (sum % k > 0) {
            return false;
        }

        Arrays.sort(nums);
        int row = nums.length - 1;

        int target = sum / k;

        while (row >= 0 && nums[row] == target) {
            row --;
            k --;
        }

        return search(new int[k], row, nums, target);
    }

    private boolean search (int[] groups, int row, int[] nums, int target) {
        if (row < 0) {
            return true;
        }

        int v = nums[row--];

        for (int i = 0; i < groups.length; i++) {
            if (groups[i] + v <= target) {
                groups[i] += v;

                if (search(groups, row, nums, target)) {
                    return true;
                }

                groups[i] -= v;
            }

            if (groups[i] == 0) {
                break;
            }
        }

        return false;
    }
}
