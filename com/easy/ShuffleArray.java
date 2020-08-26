package com.easy;

public class ShuffleArray {
    public static int[] shuffle(int[] nums, int n)
    {
    	if(2*n != nums.length)
    		return nums;
    	int[] arr=new int[nums.length];
    	int j=n;
    	int k=0;
    	for(int i=0; i<nums.length/2; i++)
    	{
    		arr[k]=nums[i];
    		k++;
    		arr[k]=nums[j];
    		k++;
    		j++;
    	}
    	return arr;
    }
    public static void main(String[] args) {
		int nums[]= {2,5,1,3,4,7};
		shuffle(nums, nums.length/2);
	}
}
