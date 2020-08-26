package com.easy;

import java.util.HashMap;
import java.util.Map;

public class SongsDivisible {
	 public int numPairsDivisibleBy60(int[] time) 
	 {
		 Map<Integer, Integer> map = new HashMap<>();
	        int cntr = 0;
	        for (int t : time) {
	            cntr += map.getOrDefault((60 - t % 60) % 60, 0);
	            map.put(t % 60, map.getOrDefault(t % 60, 0) + 1);
	        }
	        return cntr;
	 }
}
