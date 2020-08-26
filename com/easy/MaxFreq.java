package com.easy;

import java.util.HashMap;
import java.util.Map.Entry;

public class MaxFreq {
	public int findLucky(int[] arr) {
		HashMap<Integer, Integer> h=new HashMap<Integer, Integer>();
		for(int i=0; i<arr.length; i++)
		{
			if(h.containsKey(arr[i]))
				h.put(arr[i],h.get(arr[i])+1);
			else
				h.put(arr[i],1);
		}
		int count= -1, res=-1;
		
		for(Entry<Integer,Integer> val: h.entrySet())
		{
			if(count<val.getValue())
			{
				if(res!= val.getKey())
				{
					res= val.getKey();
				}
				else
				{
					res= Math.max(val.getKey(), res);
				}
				count=val.getValue();
			}
		}
		return res;
    }
}
