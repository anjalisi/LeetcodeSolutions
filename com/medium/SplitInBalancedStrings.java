package com.medium;

import java.util.Stack;

public class SplitInBalancedStrings {
    public int balancedStringSplit(String s) 
    {
    	int countR=0, countL=0, balance=0;
    	for(int i=0; i<s.length(); i++)
    	{
    		if(s.charAt(i)=='R')
    			countR++;
    		else if(s.charAt(i)=='L')
    			countL++;
    		if((i%2 != 0) && (countL==countR))
    		{
    			balance++;
    			countL=0;
    			countR=0;
    		}
    	}
    	return balance;
    }
}
