package com.medium;

import java.util.ArrayList;
import java.util.HashMap;

public class SingleNumberIII {
    public int[] singleNumber(int[] nums) 
    {	
        HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
        ArrayList<Integer> arr= new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++)
        	map.put(nums[i],map.getOrDefault(nums[i], 1)+1);
        for(int i=0; i<nums.length; i++)
        	if(map.get(nums[i]) ==2)
        		arr.add(nums[i]);
        int[] res= new int[arr.size()];
        for(int i=0; i<arr.size(); i++)
        	res[i]=arr.get(i);
        return res;
    }
}
