package com.medium;

import java.util.Arrays;

public class LIS {
    public int lengthOfLIS(int[] nums) {
    	if(nums.length <=1) return nums.length ;
    	
    	int[] lis= new int[nums.length];
    	Arrays.fill(lis, 1);
    	
    	for(int i=1; i<nums.length; i++)
    	{
    		for(int j=0; j<i; j++)
    		{
    			if(nums[i]>nums[j] && lis[i]<lis[j]+1)
    				lis[i]=lis[j]+1;
    		}
    	}
    	int max=0;
    	
    	for(int i=0; i<nums.length; i++)
    		if(max<lis[i])
    			max=lis[i];
    	return max;
    }
}
