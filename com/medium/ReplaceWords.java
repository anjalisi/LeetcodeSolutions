package com.medium;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReplaceWords {
    public String replaceWords(List<String> dict, String sentence) 
    {
    	StringBuilder sb= new StringBuilder();
    	Set<String> res= new HashSet<>();
    	for(String di:dict) res.add(di);
    	
    	for(String word: sentence.split("\\s"))
    	{
    		String pref="";
    		for(int i=1; i<= word.length();i++)
    		{
    			pref= word.substring(0, i);
    			if(dict.contains(pref))
    				break;
    		}
    		if(sb.length()>0 ) 
    			sb.append(" ");
    		sb.append(pref);
    	}
    	return sb.toString();
    }
   
}
