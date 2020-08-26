package com.medium;

import java.util.ArrayList;
import java.util.Arrays;

public class ReduceArraySize {
	public static int minSetSize(int[] arr) 
	{
		if(arr.length==0 || arr==null)
			return 0;
		Arrays.sort(arr);
		ArrayList<Integer> a= new ArrayList<Integer>();
		for(int i=0; i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
				a.add(arr[i]);
		}
		System.out.println(a.size());
		return a.size()/2;
    }
	public static void main(String[] args) 
	{
		int[] arr= {7,7,7,7,7,7,7,7,7,7};
		System.out.println(minSetSize(arr));
	}
}
