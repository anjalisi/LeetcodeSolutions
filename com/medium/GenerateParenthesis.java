package com.medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
    	List<String> result= new ArrayList<String>();
    	
    	generateAll(result,"",0,0,n);
    	return result;
    }

	private void generateAll(List<String> result, String curr, int open, int close, int max)
	{
		//For n pairs, we will have n*2 length of result
		if(curr.length() == max*2)
		{
			result.add(curr);
			return;
		}
		//Making the decisions now
		//We will first add the opening brackets
		if(open < max)
			generateAll(result, curr+"(", open+1, close, max);
		if(close < open)
			generateAll(result, curr+")", open, close+1, max);
	}
}
