package com.medium;

import java.util.Stack;

public class MinAddToMakeParanthesisValid 
{
    public static int minAddToMakeValid(String S) 
    {
    	Stack<Character> stack= new Stack<Character>();
    	int result=0;
    	for(int i=0; i<S.length() ; i++)
    	{
    		if(S.charAt(i)=='(')
    			stack.push('(');
    		else
    		{
    			if(stack.isEmpty())
    				result++;
    			else
    				stack.pop();
    		}
    	}
    	while(!stack.isEmpty())
    	{
    		result++;
    		stack.pop();
    	}
    	return result;
	}
    public static void main(String[] args) {
		String S= "()))((";
		System.out.println(minAddToMakeValid(S));
	}
}
