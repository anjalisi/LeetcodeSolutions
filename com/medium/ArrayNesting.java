package com.medium;

import java.util.ArrayList;

public class ArrayNesting 
{
    public static int arrayNesting(int[] nums) {
    	 int n = nums.length, max = 0;
         boolean[] vis = new boolean[n];
         for(int i = 0;i < n;i++){
             if(!vis[i])
             {
                 int c = 0,ind = i;
                 while(!vis[ind])
                 {
                     vis[ind] = true;
                     ind = nums[ind];
                     c++;
                 }
                 max = Math.max(c,max);
             }
         }
         return max;
    }
    public static void main(String[] args) {
		int[] nums= {5,4,0,3,1,6,2};
		System.out.println(arrayNesting(nums));
	}
}
