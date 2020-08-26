package com.medium;

public class TargetSum 
{
    public int findTargetSumWays(int[] nums, int S) 
    {
    	if(nums.length==0)
    		return 0;
    	int sum_array=0; 
    	//now we need to find the sum of all elements of the array
    	for(int i=0; i<nums.length; i++)
    		sum_array+= nums[i];
    	if(sum_array<S || (sum_array+S)%2!=0)
    		return 0;
    	//Now we just have to find a subset which can find the count of
    	//all subsets with sum= sumtoCheck
    	int sumtoCheck= (sum_array+S)/2;
    	return countSubset(nums, sumtoCheck);
    }

	private int countSubset(int[] nums, int sum)
	{
		if(nums.length==0 || sum <=0)
			return 0;
		int[][] count = new int[nums.length][sum+1];
		//there is 1 way to make sum=0 (not including it)
		for(int i=0; i<nums.length; i++)
			count[i][0]=1;
		
		for(int j=0; j<= sum ; j++)
			if(nums[0]==j)
				count[0][j]=1;
		
		for(int i=1; i<nums.length; i++)
		{
			for(int j=1; j<=sum; j++)
			{
				int include=0;
				int exclude=0;
				if(nums[i]<=j)
					include=count[i-1][j-nums[i]];
				exclude= count[i-1][j];
				count[i][j]=include+exclude;
			}
		}
		
		return count[nums.length-1][sum];
	}
}
