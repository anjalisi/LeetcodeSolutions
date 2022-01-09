package com.easy;

public class SortedSquare {
	public int[] sortedSquares(int[] nums) 
    {
		int []res= new int[nums.length];
		int low=0, high=nums.length-1, ind=nums.length-1;
				
		while(low<=high){
			if(Math.abs(nums[low])<=Math.abs(nums[high])){
				res[ind]= nums[high]*nums[high];
				high--;
			}
			else{
				res[ind]= nums[low]*nums[low];
				low++;
			}
			ind--;
		}
		return res;
	}
}
// for(int i=0; i<A.length; i++)
// A[i]=A[i]*A[i];
// Arrays.sort(A);
// return A;
