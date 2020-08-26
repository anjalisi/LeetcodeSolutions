package com.easy;

import java.util.Stack;

public class BackSpaceString {
    public static boolean backspaceCompare(String S, String T) 
    {
	    return checkHelp(S).equals(checkHelp(T));
    }
    private static String checkHelp(String t) {
		Stack<Character> stack= new Stack<Character>();
		for(int i=0; i<t.length(); i++)
		{
			if(t.charAt(i)=='#')
			{	if(!stack.isEmpty())
					stack.pop();
			}
			else
				stack.push(t.charAt(i));
		}
		return String.valueOf(stack);
	}
	public static void main(String[] args) {
		String S= "ab##";
		String T= "c#d#";
		System.out.println(backspaceCompare(S, T));
	}
}
