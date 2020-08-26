package com.easy;

import java.util.ArrayList;

public class DecompressArray {
	static ArrayList<Integer> arr;
    public static int[] decompressRLElist(int[] nums) 
    {
    	arr=  new ArrayList<Integer>();
    	for(int i=0; i<nums.length-1; i=i+2)
    	{
    		addNew(nums[i], nums[i+1]);
    	}
    	System.out.println(arr.size());
    	int[] result= new int[arr.size()];
    	for(int i=0; i<arr.size(); i++)
    	{
    		result[i]=arr.get(i);
    		System.out.print(result[i]+" ");
    	}
    	return result;
    }

	private static void addNew(int freq, int num) {
		for(int i=0; i<freq; i++)
			arr.add(num);
	}
	public static void main(String[] args) {
		int[] nums= {1,2,3,4};
		System.out.println(decompressRLElist(nums));
	}
}
