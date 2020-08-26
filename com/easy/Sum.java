package com.easy;

import java.util.HashMap;

public class Sum {
	public int[] twoSum(int[] numbers, int target)
    {
		int[] res= new int[2];
		int count=0;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0; i<numbers.length; i++)
        {
        	int temp=target-numbers[i];
        	if(h.containsKey(temp) &&h.containsKey(numbers[i]))
        	{
        		res[0]=h.get(temp)+1;
        		res[1]=h.get(numbers[i])+1;
        	}
        	h.put(numbers[i],i);
        }
        return res;
    }
}
