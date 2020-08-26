package com.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class BuddyStrings {
    public boolean buddyStrings(String A, String B)
    {
    	if(A.length()!=B.length())
    		return false;
    	if(A.equals(B))
    	{
    		HashSet<Character> h= new HashSet<Character>();
    		for(char c: A.toCharArray())
    			h.add(c);
    		if(h.size() < A.length())
    			return true;
    		else
    			return false;
    	}
    	List<Integer> res= new ArrayList<Integer>();
    	for(int i=0; i<A.length(); i++)
    	{
    		if(A.charAt(i)!= B.charAt(i))
    			res.add(i);
    	}
    	if(res.size()==2 && A.charAt(res.get(0))==B.charAt(res.get(1)) &&
    			B.charAt(res.get(0))==A.charAt(res.get(1)))
    		return true;
    	else
    		return false;
    }
}
