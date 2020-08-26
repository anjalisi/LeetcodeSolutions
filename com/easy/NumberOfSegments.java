package com.easy;

public class NumberOfSegments {
    public int countSegments(String s) 
    {
    	int seg=0;
    	for(int i=0; i<s.length(); i++)
    	{
    		if((i==0 || s.charAt(i-1)==' ') && s.charAt(i) != ' ' )
    			seg++;
    	}
    	return seg;
    }
}
