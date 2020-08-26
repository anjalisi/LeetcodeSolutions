package com.easy;

public class RepeatedSubstr {
    public boolean repeatedSubstringPattern(String s) 
    {
    	//We will make a StringBuilder to store the temp str
    	StringBuilder str= new StringBuilder();
    	for(int i=s.length()/2; i>0; i--)
    	{
    		if(s.length()%i !=0) continue; 
    		String sub= new String();	//Stores the substring
    		str.setLength(0); //we clear the str set in any before iterations
    		sub= s.substring(0, i);
    		for(int j=0; j<(s.length()/sub.length()); j++)
    		{
    			str.append(sub);
    		}
    		if(str.toString().equals(s))
    			return true;
    	}
    	return false;
    }
}
