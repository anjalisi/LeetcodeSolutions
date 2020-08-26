package com.easy;

import java.util.HashMap;
import java.util.Map;

public class Dominoes {
	 public int numEquivDominoPairs(int[][] dominoes) 
	 {
		 Map<Integer, Integer> pairMap= new HashMap<Integer,Integer>();
	        int result = 0;
	        
	        for(int [] pair: dominoes) {
	            int addition = pair[0] < pair[1] ? pair[0]*10+pair[1] : pair[1]*10+pair[0];
	            if (pairMap.containsKey(addition)) {
	                 int occurence = pairMap.get(addition);
	                 int increment = occurence + 1;
	                 pairMap.put(addition, increment);
	                 result+=increment;
	            } else {
	                pairMap.put(addition, 0);
	                result+=0;
	            }
	        }
	        
	        return result;
	 }
}
