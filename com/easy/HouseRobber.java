package com.easy;

public class HouseRobber {
    public int rob(int[] nums) {
        //If there are no houses, we can not rob any
        if(nums.length==0 || nums==null) return 0;
        //If we only have one house, we can only rob that house
        if(nums.length==1) return nums[0];
        //If we have 2 houses, we will select the max from the 2
        if(nums.length==2) return Math.max(nums[0],nums[1]);

        int[] dp= new int[nums.length];
        //Initialize the first 2 values
        dp[0]= nums[0];
        dp[1]=Math.max(nums[0],nums[1]);

        //Now, while making the choices, we will see if we want to rob the house previous to us, or, we want to rob the current house
        // and add the value of the house-2
        for(int i=2; i<dp.length; i++)
            dp[i]= Math.max(nums[i]+dp[i-2],dp[i-1]);

        return dp[nums.length-1];
    }  
}