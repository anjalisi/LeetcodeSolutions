package com.bitManipulation;

import java.util.HashMap;

public class FindDifference {
    public char findTheDifference(String s, String t) 
    {
    	HashMap<Character, Integer> map= new HashMap<Character, Integer>();
    	//We will add all the elements with their frequency in a hashmap
    	for(char ch: s.toCharArray())
    		map.put(ch,map.getOrDefault(ch, 0)+1);
    	
    	//Now we need to find which element is not there in string t
    	for(char ch: t.toCharArray())
    	{
    		if(!map.containsKey(ch) || map.containsKey(ch) && map.get(ch)==0)
    			return ch;
    		else
    			map.put(ch,map.get(ch)-1);
    	}
    	return '#';
    }
}
