package com.easy;

import java.util.HashSet;

public class UnoqueMorseCode {
    public int uniqueMorseRepresentations(String[] words) {
    	HashSet<String> unique= new HashSet<String>();
    	String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                "....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-",
                "...-",".--","-..-","-.--","--.."};
    	for(String word:words)
    	{
    		StringBuilder str= new StringBuilder();
    		for(char ch: word.toCharArray())
    		{
    			str.append(MORSE[ch-'a']);
    		}
    		unique.add(str.toString());
    	}
    	
    	return unique.size();
    }
}
