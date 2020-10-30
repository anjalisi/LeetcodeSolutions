package com.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis 
{
	public boolean isValid(String str) 
    {
		/*
		ANOTHER METHOD
		if(s.length()==0 || s==null) return true;
        Stack<Character> st= new Stack<>();   
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='['|| s.charAt(i)=='{')
                st.push(s.charAt(i));
            else if(s.charAt(i)==')' && !st.isEmpty() && st.peek()=='(')
                st.pop();
            else if(s.charAt(i)==']' && !st.isEmpty() && st.peek()=='[')
                st.pop();
            else if(s.charAt(i)=='}' && !st.isEmpty() && st.peek()=='{')
                st.pop();
            else return false;
        }
        return st.isEmpty();
		*/

		Map<Character, Character> parenthesesMapping = new HashMap<>();
	    parenthesesMapping.put('(', ')');
	    parenthesesMapping.put('{', '}');
	    parenthesesMapping.put('[', ']');

	    Stack<Character> parentheses = new Stack<>();
	    for(int i = 0; i < str.length(); i++) {
	        char c = str.charAt(i);
	        if(parenthesesMapping.containsKey(c)) {
	            parentheses.push(c);    
	        } else {
	            if(parentheses.isEmpty()) {
	                return false;
	            }
	            char target = parentheses.pop();
	            if(!parenthesesMapping.containsKey(target) || parenthesesMapping.get(target) != c) {
	                return false;
	            }
	        }
	    }
	    if(!parentheses.isEmpty()) {
	        return false;
	    }
	    return true;
    }
}
