package com.medium;

import java.util.HashSet;

public class TwoSum 
{
public static void main(String[] args) {
	int arr[] = { 1, 2, 5 }; 
    int sum = 7; 
    int n = arr.length; 
    System.out.println(subset(arr,sum,n));
}

private static String subset(int[] arr, int sum, int n) 
{
	HashSet<Integer> h=new HashSet<Integer>();
	for(int i=0; i<n; i++)
	{
		int x=sum-arr[i];
		if(h.contains(x))
		{
			return "True";
		}
		else
			h.add(arr[i]);
	}
	return "False";
}
}
