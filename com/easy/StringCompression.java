package com.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class StringCompression 
{
    public int compress(char[] chars) 
    {
    	int idx=0, i=0;
    	while(i<chars.length)
    	{
    		int j=i;
    		while(j<chars.length && chars[j]==chars[i])
    			j++;
    		chars[idx++]= chars[i];
    		if(j-i>1)
    		{
    			String count= j-i+"";
    			for(char ch: count.toCharArray())
    				chars[idx++]= ch;
    		}
    		i=j;
    	}
    	return idx;
    }
}
