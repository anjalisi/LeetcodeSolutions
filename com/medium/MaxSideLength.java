package com.medium;

public class MaxSideLength {
	public static int findMin(int[] nums) {
		int min = nums[0];
	    for(int i = 1; i < nums.length; i++){
	        if(min < nums[i]){
	            min = nums[i];
	        } else {
	            min = nums[i];
	            break;
	        }
	    }
	    return (min<nums[0])?min:nums[0];
    }
	 public static void main(String[] args) {
		int[] arr= new int[] {3,4,5,1,2};
		//int threshold=4;
		System.out.println(findMin(arr));
	}
}
