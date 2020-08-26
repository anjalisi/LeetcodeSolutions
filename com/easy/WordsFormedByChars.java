package com.easy;

import java.util.HashMap;
import java.util.Map;

public class WordsFormedByChars {
    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> h=new HashMap<>();
        for(char c:chars.toCharArray())
        	h.put(c, h.getOrDefault(c,0)+1);
        
        int len=0;
        for(int i=0; i<words.length; i++)
        {
        	String str= words[i];
        	boolean can_form= true;
        	Map<Character, Integer> temp=new HashMap<>();
        	for(char c:str.toCharArray())
        		temp.put(c, temp.getOrDefault(c,0)+1);
        	for(int j=0; j<str.length(); j++)
        	{
        		char ch=str.charAt(j);
        		if(!h.containsKey(ch) || h.get(ch)<temp.get(ch))
        		{
        			can_form=false;
        			break;
        		}
        	}
        	if(can_form)
        	{
        		len+=str.length();
        	}
        }
        return len;
    }
}
