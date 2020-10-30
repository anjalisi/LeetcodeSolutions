package com.medium;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacter {
    public int lengthOfLongestSubstring(String str) {
    	if(str.length()<=1) return str.length();
    	HashSet<Character> set= new HashSet<Character>();
    	int start=0, end=0, max=0;
    	
    	while(end< str.length())
    	{
    		if(!set.contains(str.charAt(end)))
    		{
    			set.add(str.charAt(end));
    			end++;
    			max= Math.max(set.size(), max);
    		}
    		else
    		{
    			//The hashset already has that element, so we need to slide our window
    			set.remove(str.charAt(start));
    			start++;
    		}
    	}
    	return max;
    }
}
