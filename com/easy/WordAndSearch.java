package com.easy;

import java.util.HashMap;

public class WordAndSearch {
	HashMap<String, Integer> map;
    public WordAndSearch() {
    	map= new HashMap<String, Integer>();
    	map.put("@", -1);
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        map.put(word, map.getOrDefault(word, 1)+1);
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) 
    {
    	String words= word.replaceAll("\\.","");
    	for(String s: map.keySet()) {
    		if(s.contains(words))
    			return true;
    	}
    	return false;
    }
}
