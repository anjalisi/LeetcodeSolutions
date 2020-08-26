package com.medium;

import java.util.Arrays;

public class Sum3Closest {
    public int threeSumClosest(int[] nums, int target) 
    {
    	//Setting the initial sum
    	int result= nums[0]+nums[1]+nums[nums.length-1];
    	Arrays.sort(nums);
    	for(int i=0; i<nums.length-2; i++)
    	{
    		int firstPtr = i+1;
    		int lastPtr = nums.length-1;
    		
    		//Now we will find the sum for every combination 
    		while(firstPtr < lastPtr)
    		{
    			int currSum = nums[i]+nums[firstPtr]+nums[lastPtr];
    			if(currSum > target)
    				lastPtr--;
    			else
    				firstPtr++;
    			if(Math.abs(currSum-target) < Math.abs(result-target))
    				result= currSum;
    		}
    	}
    	return result;
    }
}
