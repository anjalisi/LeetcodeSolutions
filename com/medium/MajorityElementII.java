package com.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElementII
{
    public List<Integer> majorityElement(int[] nums) 
    {
        int n = nums.length/3;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        List<Integer> result = new ArrayList<>();
        
        for(int key : map.keySet())
        {
            if(map.get(key) > n)
            {
                result.add(key);
            }
        }
        
        return result;
    }
}
