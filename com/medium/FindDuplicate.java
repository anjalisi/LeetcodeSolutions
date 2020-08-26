package com.medium;

import java.util.HashSet;

public class FindDuplicate 
{
	public int findDuplicate(int[] nums) 
	{
		HashSet<Integer> h=new HashSet<Integer>();
		for(int i=0; i<nums.length;i++)
		{
			if(h.contains(nums[i]))
				return nums[i];
			h.add(nums[i]);
		}
		return -1;
    }
}
