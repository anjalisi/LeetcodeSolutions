package com.medium;

import java.util.Stack;

public class DecodeString {
    public String decodeString(String s)
    {
    	Stack<Integer> counts= new Stack<Integer>();
    	Stack<String> result= new Stack<String>();
    	String res="";
    	int i=0;
    	
    	while(i<s.length())
    	{
    		if(Character.isDigit(s.charAt(i)))
    		{
    			int cnt= 0;
    			while(Character.isDigit(s.charAt(i)))
    			{
    				cnt= cnt*10 + (s.charAt(i)-'0');
    				i++;
    			}
    			counts.push(cnt);
    		}
    		else if(s.charAt(i)=='[')
    		{
    			result.push(res);
    			res= "";
    			i++;
    		}
    		else if(s.charAt(i)==']')
    		{
    			StringBuilder str= new StringBuilder(result.pop());
    			int cnt= counts.pop();
    			for(int ind=0; ind<cnt; ind++)
    			{
    				str.append(res);
    			}
    			res= str.toString();
    			i++;
    		}
    		else
    		{
    			res+= s.charAt(i);
    			i++;
    		}
    		
    	}
    	return res;
    }
}
