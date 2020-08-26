package com.medium;

public class PartitionIntoKEqualSubsets {
    public boolean canPartitionKSubsets(int[] nums, int k) 
    {
    	int sumOfItems= 0;
    	for(int i=0; i<nums.length; i++)
    		sumOfItems+= nums[i];
    	if(k==0 ||sumOfItems%k !=0 )
    		return false;
    	return canPartition(nums, 0, k, 0,0,sumOfItems/k,new int[nums.length]);
    }

	private boolean canPartition(int[] nums, int start, int k, int currSumBucket,
			int currItem,int bucketSum, int[] visited) 
	{
		if(k==1) return true;
		if(currSumBucket== bucketSum && currItem>0)
			return canPartition(nums, start, k-1, currSumBucket, currItem, bucketSum, visited);
		for(int i=start; i<nums.length; i++)
		{
			if(visited[i]==0)
			{
				visited[i]=1;
				if(canPartition(nums, start+1, k, currSumBucket+nums[i], currItem++, bucketSum, visited))
					return true;
				visited[i]=0;
			}
		}
		return false;
	}
}
