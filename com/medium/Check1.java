package com.medium;

import java.util.ArrayList;

public class Check1 
{
	public static boolean kLengthApart(int[] nums, int k) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=0; i<nums.length; i++)
		{
			if(nums[i]==1)
			{
				//System.out.println(i);
				arr.add(i);
			}
			
		}
		
		for(int i=0;i<arr.size()-1;i++){
			if(arr.get(i+1)-arr.get(i)<=k){
				return false;
			}
		}
		return true;
    }
	public static void main(String[] args) 
	{
		int[] arr=new int[] {1,0,0,1,0,1};
		int k=2;
		System.out.println(kLengthApart(arr, k));
	}
}
