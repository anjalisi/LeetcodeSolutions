package com.easy;

import java.util.HashMap;
import java.util.HashSet;

public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned)
    {
    	HashSet<String> ban= new HashSet<String>();
    	HashMap<String, Integer> valid= new HashMap<String, Integer>();
    	
    	for(String bann: banned)
    		ban.add(bann);
    	
    	String[] words= paragraph.toLowerCase().split("\\W+");
    	for(String word:words)
    	{
    		if(!ban.contains(word))
    			valid.put(word, valid.getOrDefault(word, 0)+1);
    	}
    	
    	int max=0;
    	String res="";
    	for(String w: valid.keySet())
    	{
    		if(valid.get(w)>max)
    		{
    			max= valid.get(w);
    			res= w;
    		}
    	}
    	return res;
    }
}
