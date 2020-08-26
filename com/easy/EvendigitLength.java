package com.easy;

public class EvendigitLength {
	public int findNumbers(int[] nums) 
	{
		int count=0;
		for(int i=0; i<nums.length; i++)
		{
			if(numOfDigits(nums[i])%2==0)
				count++;
		}
		return count;
	}

	private int numOfDigits(int num) 
	{
		int cnt=0;
		while(num>0)
		{
			num=num/10;
			cnt++;
		}
		return cnt;
	}
}
