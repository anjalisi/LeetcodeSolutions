package com.easy;

import java.util.Arrays;

public class FindTheDifference {
    public char findTheDifference(String s, String t)
    {
    	Arrays.sort(s.toCharArray());
    	Arrays.sort(t.toCharArray());
    	
    	int i=s.length()-1, j=t.length()-1;
    	while(j>=0)
    	{
    		if(t.charAt(j) != s.charAt(i))
    			return t.charAt(j);
    		else
    		{
    			j--;
    			i--;
    		}
    	}
    	return '@';
    }
}
