package com.medium;

public class SmallestSubarrayWithSum 
{
	 public int minSubArrayLen(int s, int[] nums) 
	 {
		 int n=nums.length;
		 int minlen=n+1;
		 int start=0, end=0, curr=0;
		 while(end<n)
		 {
			 while(curr<=s && end<n)
			 {
				 curr+=nums[start];
				 start++;
			 }
			 if(curr==s && start<n)
			 {
				 if(end-start<minlen)
					 minlen=end-start;
				 curr-=nums[start++];
			 }
		 }
		 return minlen;
//		 int minLen = Integer.MAX_VALUE;
//	        int j = 0;
//	        int currentSum = 0;
//	        
//	        for (int i = 0; i < nums.length; i++) {
//	            currentSum += nums[i];
//	            while (currentSum >= s) {
//	                minLen = Math.min(minLen, i - j + 1);
//	                currentSum -= nums[j];
//	                j++;
//	            }
//	        }
//	        return minLen == Integer.MAX_VALUE ? 0:minLen;
	 }
}
