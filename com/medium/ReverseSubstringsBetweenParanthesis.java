package com.medium;

import java.util.Stack;

public class ReverseSubstringsBetweenParanthesis 
{
    public String reverseParentheses(String s)
    {
    	//Base Case
    	if(!s.contains("("))
    		return s;

    	int end= s.indexOf(")");	//gives first index of )
    	int start= s.substring(0, end).lastIndexOf("(");	//gives last index of (
    	
    	if(end==s.length())
    		return reverseParentheses(s.substring(0, start)+ reverseStr(s.substring(start+1, end)));
    	else
    		return reverseParentheses(s.substring(0, start)+ reverseStr(s.substring(start+1, end)) + s.substring(end+1));
    	
    }

	private String reverseStr(String substring) {
		StringBuilder sb= new StringBuilder(substring);
		return sb.reverse().toString();
	}
}
