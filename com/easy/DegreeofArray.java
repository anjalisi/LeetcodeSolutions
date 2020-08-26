package com.easy;

import java.util.HashMap;
import java.util.Map.Entry;

public class DegreeofArray {
    public int findShortestSubArray(int[] nums) 
    {
    	HashMap<Integer, Integer> map= new HashMap<>();
    	for(int i=0; i<nums.length; i++)
    		map.put(nums[i],map.getOrDefault(nums[i],0)+1);
    	int max_count=0, res=-1;
    	for(Entry<Integer, Integer> val: map.entrySet())
    	{
    		if(max_count < val.getValue())
    		{
    			max_count= val.getValue();
    		}
    	}
    	return max_count;
    }
}
