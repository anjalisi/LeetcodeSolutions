// Java program to find maximum product subarray 
package com.medium;
import java.io.*;
import java.util.Arrays;
import java.util.Collections; 

class ProductSubarray { 

	
	public int maxProduct(int[] nums) {
		int dp[][]=new int[nums.length][2]; //one row for +ve ele, one for -ve ele
		dp[0][0]=nums[0];
		dp[0][1]=nums[0];
		int res=nums[0];
		for(int i=0; i<nums.length; i++)
		{
			if(nums[i]>=0)
			{
				dp[i][0]=Math.max(dp[i-1][0]*nums[i], nums[i]);
				dp[i][1]=dp[i-1][1]*nums[i];
			}
			else
			{
				dp[i][1]=Math.min(dp[i-1][0]*nums[i], nums[i]);
				dp[i][0]=dp[i-1][1]*nums[i];
			}
			res=Collections.max(Arrays.asList(res,dp[i][0],dp[i][1]));
		}
		return res;
	}
	// Utility functions to get minimum of two integers 
//	static int min(int x, int y) { return x < y ? x : y; } 
//
//	// Utility functions to get maximum of two integers 
//	static int max(int x, int y) { return x > y ? x : y; } 
//
//	/* Returns the product of max product subarray. 
//	Assumes that the given array always has a subarray 
//	with product more than 1 */
//	static int maxSubarrayProduct(int arr[]) 
//	{ 
//		int n = arr.length; 
//		// max positive product ending at the current position 
//		int max_ending_here = 1; 
//
//		// min negative product ending at the current position 
//		int min_ending_here = 1; 
//
//		// Initialize overall max product 
//		int max_so_far = 1; 
//		int flag = 0; 
//
//		/* Traverse through the array. Following 
//		values are maintained after the ith iteration: 
//		max_ending_here is always 1 or some positive product 
//						ending with arr[i] 
//		min_ending_here is always 1 or some negative product 
//						ending with arr[i] */
//		for (int i = 0; i < n; i++) { 
//			/* If this element is positive, update max_ending_here. 
//				Update min_ending_here only if min_ending_here is 
//				negative */
//			if (arr[i] > 0) { 
//				max_ending_here = max_ending_here * arr[i]; 
//				min_ending_here = min(min_ending_here * arr[i], 1); 
//				flag = 1; 
//			} 
//
//			/* If this element is 0, then the maximum product cannot 
//			end here, make both max_ending_here and min_ending 
//			_here 0 
//			Assumption: Output is alway greater than or equal to 1. */
//			else if (arr[i] == 0) { 
//				max_ending_here = 1; 
//				min_ending_here = 1; 
//			} 
//
//			/* If element is negative. This is tricky 
//			max_ending_here can either be 1 or positive. 
//			min_ending_here can either be 1 or negative. 
//			next min_ending_here will always be prev. 
//			max_ending_here * arr[i] 
//			next max_ending_here will be 1 if prev 
//			min_ending_here is 1, otherwise 
//			next max_ending_here will be 
//						prev min_ending_here * arr[i] */
//			else { 
//				int temp = max_ending_here; 
//				max_ending_here = max(min_ending_here * arr[i], 1); 
//				min_ending_here = temp * arr[i]; 
//			} 
//
//			// update max_so_far, if needed 
//			if (max_so_far < max_ending_here) 
//				max_so_far = max_ending_here; 
//		} 
//
//		if (flag == 0 && max_so_far == 1) 
//			return 0; 
//		return max_so_far; 
//	} 
//
//	public static void main(String[] args) 
//	{ 
//
//		int arr[] = { -2,0,-1 }; 
//		System.out.println("Maximum Sub array product is "
//						+ maxSubarrayProduct(arr)); 
//	} 
} /*This code is contributed by Devesh Agrawal*/
