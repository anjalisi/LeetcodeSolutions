package com.medium;

public class SubarrayLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
    	int p = 1, start = 0, end = 0, count = 0;
        while (end < nums.length) {
            p *= nums[end++];
            while (p >= k && start < end)
            	p /= nums[start++];
            count += end - start;
        }
        return count;
    }
}
