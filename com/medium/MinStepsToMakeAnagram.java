package com.medium;

import java.util.HashMap;
import java.util.Map.Entry;

public class MinStepsToMakeAnagram {
    public int minSteps(String s, String t) {
    	HashMap<Character, Integer> map= new HashMap<Character, Integer>();
    	for(int i=0; i<s.length(); i++)
    	{
    		map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
    		map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)-1);
    	}
    	
    	int res=0;
    	for(Entry<Character, Integer> entry: map.entrySet())
    	{
    		res += Math.abs(entry.getValue());
    	}
    	return res/2;
    }
}
