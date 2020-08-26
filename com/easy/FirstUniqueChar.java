package com.easy;

import java.util.HashSet;
import java.util.Set;

public class FirstUniqueChar {
    public int firstUniqChar(String s) 
    {
    	Set<Character> charSet = new HashSet<Character>();
    	Set<Character> duplicates = new HashSet<Character>();
    	
    	for(int i=0; i<s.length(); i++)
    	{
    		if(charSet.contains(s.charAt(i)))
    			duplicates.add(s.charAt(i));
    		
    		charSet.add(s.charAt(i));
    	}
    	for(int i=0; i<s.length(); i++)
    	{
    		if(!duplicates.contains(s.charAt(i)))
    			return i;
    	}
    	return -1;
    }
}
