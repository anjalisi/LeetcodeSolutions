package com.easy;

public class RelativeSorting {
public int[] runningSum(int[] nums) 
{
	int[] dp=new int[nums.length];
	dp[0]=nums[0];
	for(int i=1; i<nums.length;i++)
		dp[i]=nums[i]+dp[i-1];
	return dp;
}
}
