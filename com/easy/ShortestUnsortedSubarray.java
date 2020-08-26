package com.easy;

public class ShortestUnsortedSubarray {
    public int findUnsortedSubarray(int[] nums) 
    {
    	if(nums.length<=1)
    		return 0;
    	int min=Integer.MAX_VALUE;
    	int max=Integer.MIN_VALUE;
    	int start=-1, end=-1;
    	for(int i=1; i<nums.length; i++)
    		if(nums[i]<nums[i-1])
    			min=Math.min(min, nums[i]);
    	
    	for(int i=nums.length-2; i>=0; i--)
    		if(nums[i]>nums[i+1])
    			max=Math.max(max, nums[i]);
    	
    	for(int i=0; i<nums.length; i++)
    		if(nums[i]>min)
    		{
    			start=i;
    			break;
    		}
    	for(int i=nums.length-2; i>=0; i--)
    		if(nums[i]<max)
    		{
    			end=i;
    			break;
    		}
    	if(start==-1)
    		return 0;
    	return end-start+1;
    }
}
