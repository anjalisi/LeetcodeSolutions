package com.medium;

import java.util.HashMap;

public class SubarraysWithSum {
    public int numSubarraysWithSum(int[] A, int S) 
    {
    	int res=0;
    	int currSum=0;
    	HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
    	map.put(0, 1);
    	for(int i=0; i<A.length; i++)
    	{
    		currSum += A[i];
    		if(map.containsKey(currSum-S))
    			res+= map.get(currSum-S);
    		map.put(currSum, map.getOrDefault(currSum,0)+1);
    	}
    	return res;
    }
}
