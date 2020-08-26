package com.easy;

public class MaxAvgSubarray {
	public double findMaxAverage(int[] nums, int k) 
    {
		int window=0;
		int maxSum=Integer.MIN_VALUE;
		double maxAvg=0.00;
		for(int i=0; i<k; i++)
			window+=nums[i];//initial value
		if(nums.length==k)
			   return window/(double)k;
		for(int i=k; i<nums.length; i++)
		{
			window+=nums[i]-nums[i-k];
			maxSum=Math.max(window,maxSum);
		}
		return maxSum/(double)k;
    }
}
