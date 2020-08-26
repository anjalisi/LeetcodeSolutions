package com.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DNASubsequence 
{
    public List<String> findRepeatedDnaSequences(String s) 
    {
    	Map<String, Boolean> map= new HashMap<>();
    	List<String> res= new ArrayList<String>();
    	for(int i=0; i<s.length()-9; i++)
    	{
    		String str= s.substring(i,i+10);
    		if(!map.containsKey(str))
    			map.put(str, false);
    		else if(!map.get(str))
    		{
    			res.add(str);
    			map.put(str, true);
    		}
    	}
    	return res;
    }
}
