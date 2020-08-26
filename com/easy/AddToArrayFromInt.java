package com.easy;

import java.util.ArrayList;
import java.util.List;

public class AddToArrayFromInt {
	public List<Integer> addToArrayForm(int[] A, int K) 
	{
		StringBuilder s=new StringBuilder();
		for(int nums:A)
			s.append(nums);
		double num=Double.parseDouble(s.toString());
		num+=K;
		int j = 0;
		int len = Double.toString(num).length();
		int[] arr = new int[len];
		while(num!=0)
		{
			arr[len-j-1] = (int) (num%10);
			num/=10;
			j++;
		}
		List<Integer> l=new ArrayList<>(arr.length) ;
		for(int i:arr)
		{
			l.add(Integer.valueOf(i));
		}
		return l;
    }
}
