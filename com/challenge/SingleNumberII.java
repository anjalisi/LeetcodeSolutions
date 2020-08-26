package com.challenge;

import java.util.HashMap;
import java.util.Map.Entry;

public class SingleNumberII {
    public static int singleNumber(int[] nums)
    {
    	HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
    	for(int i=0; i<nums.length; i++)
    		map.put(nums[i],map.getOrDefault(nums[i],0)+1);
    	for(Entry<Integer, Integer> entry: map.entrySet())
    	{
    		if(entry.getValue().equals(1))
    			return entry.getKey();
    	}
    	return -1;
    }
    public static void main(String[] args) {
		int[] nums= {1,1,1,3};
		System.out.println(singleNumber(nums));
		
	}
}
