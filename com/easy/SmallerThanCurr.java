package com.easy;

public class SmallerThanCurr {
	public int[] smallerNumbersThanCurrent(int[] nums) 
	{	
        int[] res=new int[nums.length];
        int count=0;
        for(int i=0; i<nums.length; i++)
        {
        	count=0;
        	for(int j=0; j<nums.length; j++)
        	{
        		if(nums[i]>nums[j])
        			count++;
        	}
        	System.out.println(count);
        	res[i]=count;
        }
        return res;
    }
}
