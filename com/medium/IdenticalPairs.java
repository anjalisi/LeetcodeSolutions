package com.medium;

import java.util.HashMap;
import java.util.HashSet;

public class IdenticalPairs {
    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num: nums){
            if(map.containsKey(num)){
                goodPairs += map.get(num);
            }
            map.put(num, map.getOrDefault(num, 0)+1);
        }        
        return goodPairs;
    }
}
