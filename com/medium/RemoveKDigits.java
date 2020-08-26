package com.medium;

import java.util.Stack;

public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
    	/*MAIN IDEA
    	 * 1. Take a stack and keep adding the digits.
    	 * 2. If you find a digit smaller than the previous, pop the previous and push the current one
    	 * 3. Pop the elements from the stack and add the digits to the String
    	 * 4. Reverse the string and return (if any zeroes at the start, remove them too)
    	 * */
    	Stack<Character> stack= new Stack<Character>();
    	int size= num.length();
    	//Remove everything and return zero
    	if(size-k==0) return "0";
    	//Adding the characters into the stack
    	int counter=0;
    	while(counter< size)
    	{
    		while(k >0 && !stack.isEmpty() && stack.peek() > num.charAt(counter))
    		{
    			//If the previous digit is larger, remove it
    			stack.pop();
    			k--;
    		}
    		stack.push(num.charAt(counter));
    		counter++;
    	}
    	//If the digits are in increasing order
    	while(k>0)
    	{
    		stack.pop();
    		k--;
    	}
    	//Pop all the remaining elements and add to the stringbuilder
    	StringBuilder str= new StringBuilder();
    	while(!stack.isEmpty())
    		str.append(stack.pop());
    	str.reverse();
    	
    	while(str.length()>1 && str.charAt(0)=='0')
    		str.deleteCharAt(0);
    	return str.toString();
    }
}
