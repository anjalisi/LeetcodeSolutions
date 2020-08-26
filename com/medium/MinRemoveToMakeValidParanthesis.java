package com.medium;

import java.util.Stack;

public class MinRemoveToMakeValidParanthesis {
    public String minRemoveToMakeValid(String s) 
    {
    	Stack<Integer> stack= new Stack<Integer>();
    	StringBuilder str= new StringBuilder();
    	for(int i=0; i<s.length() ;i++)
    	{
    		//for '('
    		if(s.charAt(i)=='(')
    		{
    			stack.push(str.length());	//We push the position of (
    			str.append('(');
    		}
    		//for ')'
    		else if(s.charAt(i)==')')
    		{
    			if(!stack.isEmpty())
    			{
    				stack.pop();
    				str.append(')');
    			}
    			
    		}
    		//for other characters
    		else
    			str.append(s.charAt(i));
    	}
    	//if stack is not empty, we have misbalanced paranthesis
    	while(!stack.isEmpty())
    	{
    		int pos= stack.pop();
    		str.replace(pos, pos+1, "@");
    	}
    	return str.toString().replaceAll("@","");
    }
}
