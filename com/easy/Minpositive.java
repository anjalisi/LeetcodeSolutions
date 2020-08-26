package com.easy;

import java.util.Arrays;

public class Minpositive {
    public int minStartValue(int[] nums) 
    {
        int len = nums.length;
    	int sum=0;
    	int startValue=0;
    	for(int i=0;i<len;i++) {
    		sum = sum+nums[i];
    		nums[i]=sum;
    	}
         Arrays.sort(nums);  
         if(nums[0]>0) {
        	 startValue = 1;
         }
         else {
        	 startValue = Math.abs(nums[0])+1;
         }
    	return startValue; 
     
    }
}
