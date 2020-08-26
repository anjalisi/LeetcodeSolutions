package com.medium;

import java.util.Arrays;

public class DivideSubarray {
    public boolean isPossibleDivide(int[] nums, int k) {
    	if(nums.length%k !=0)
			return false;
		Arrays.sort(nums);
		int i=0;
		while(i<nums.length-1)
		{
			if(nums[i]==nums[i+1] || nums[i]+1==nums[i+1])
				i++;
			else
				return false;
		}
		return true;
    }
}
