package com.medium;

import java.util.Stack;

public class ScoreOfParanthesis {
    public int scoreOfParentheses(String S) {
    	Stack<Integer> stack = new Stack<Integer>();
    	for(int i=0; i<S.length(); i++)
    	{
    		if(S.charAt(i)=='(')
    			stack.push(0);
    		else
    		{
    			int val=0;
    			if(stack.peek() == 0)	
    			{
    				val=1;
    				stack.pop();
    			}
    			else if(stack.peek() != 0)	//If stack already has a value, multiply by 2
    			{
    				val= 2*stack.pop();
    				stack.pop();
    			}
    			if(!stack.isEmpty() && stack.peek() !=0)
    				val +=stack.pop();  
    			
    			stack.push(val);
    		}
    	}
    	return stack.pop();
    }
}
