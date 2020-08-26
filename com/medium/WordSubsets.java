package com.medium;

import java.util.ArrayList;
import java.util.List;

public class WordSubsets {
    public List<String> wordSubsets(String[] A, String[] B) 
    {
    	List<String> res= new ArrayList<String>();
    	for(String str: A)
    	{
    		for(String ch:B)
    		{
    			if(!str.contains(ch))
    				break;
    			res.add(str);
    		}
    	}
    	return res;
    }
}
