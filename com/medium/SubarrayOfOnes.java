package com.medium;

public class SubarrayOfOnes {
    public int longestSubarray(int[] nums) 
    {
    	int i=0, j=0, zeroCount=0, oneCount=0;
    	int res=0;
    	while(i<nums.length && j<nums.length)
    	{
    		if(nums[j]==1)
	    		oneCount++;
    		else zeroCount++;
    		
    		while(zeroCount >1)
    		{
    			//We have to slide our window if the count of zero >1
    			if(nums[i]==0)
    				zeroCount--;
    			else
    				oneCount--;
    			i++;
    		}
    		res= Math.max(res, oneCount);
    		j++;
    	}
    	return res==nums.length ? res-1: res;
    }
}
