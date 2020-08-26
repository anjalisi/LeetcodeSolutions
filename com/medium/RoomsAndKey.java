package com.medium;

import java.util.List;
import java.util.Stack;

public class RoomsAndKey {
    public boolean canVisitAllRooms(List<List<Integer>> rooms)
    {
    	//We will make a boolean array to check if all the rooms are visited or not
    	boolean[] seen= new boolean[rooms.size()];
    	seen[0]=true;
    	
    	Stack<Integer> stack= new Stack<Integer>();
    	stack.push(0);
    	
    	while(!stack.isEmpty())
    	{
    		int currRoom= stack.pop();
    		for(int key:rooms.get(currRoom))
    		{
    			if(!seen[key])
    			{
    				seen[key]= true;
    				stack.push(key);
    			}
    		}
    	}
    	
    	for(int i=0; i<seen.length; i++)
    	{
    		if(!seen[i]) return false;
    	}
    	return true;
    }
}
