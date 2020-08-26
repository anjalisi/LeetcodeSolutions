package com.hard;

import java.util.HashMap;

public class SubarraysWithDistinctK {
    public int subarraysWithKDistinct(int[] A, int K)
    {
    	return atMostK(A, K)-atMostK(A, K-1);
    }

	private int atMostK(int[] a, int k) 
	{
		int left= 0, right=0, res=0;
		HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
		while(right<a.length)
		{
			map.put(a[right],map.getOrDefault(a[right],0)+1);
			while(map.size() >k)
			{
				//Slide the window from the left
				map.put(a[left],map.get(a[left])-1);
				if(map.get(a[left])==0) map.remove(a[left]);
				left++;
			}
			res += right-left+1;
			right++;
		}
		return res;
	}
}
