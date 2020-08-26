package com.bitManipulation;

public class TotalHammingDistance {
    public int totalHammingDistance(int[] nums) 
    {
    	if(nums.length <= 0 || nums==null)
    		return 0;
    	
    	int total=0;
    	for(int i=0; i<32; i++)
    	{
    		int one=0;
    		for(int j=0; j<nums.length; j++)
    		{
    			one += (nums[j] >> i) & 1; 
    		}
    		total += one * (nums.length- one);
    	}
    	return total;
    }
}
