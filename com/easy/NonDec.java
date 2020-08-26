package com.easy;

public class NonDec {
	 public boolean checkPossibility(int[] nums)
	 {
		 int cnt=0;
		 for(int i=0; i<nums.length-1; i++)
		 {
			 if(nums[i]>nums[i+1])
			 {
				 if(i>0)
				 {
	                  if(nums[i-1]<=nums[i+1]) 
	                	  nums[i]=nums[i+1];
	                  else
	                	  nums[i+1]=nums[i];
	                }
				 cnt++;
				 if(cnt>1)
					 return false;
			 }
		 }
		 return true;
	 }
}
