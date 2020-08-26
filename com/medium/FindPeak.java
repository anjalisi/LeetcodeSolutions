package com.medium;

public class FindPeak 
{
	public int findPeakElement(int[] nums) {
	       int l=0;
	        int r=nums.length-1;
	        int ans=-1;    
	        while(l<=r){
	            int mid=(l+r)/2;
	            if(mid==0||nums[mid]>nums[mid-1]){
	                ans=mid;
	                l=mid+1;
	            }
	            else
	                r=mid-1;
	        }
	        return ans;
	        
	    }
}
