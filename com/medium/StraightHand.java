package com.medium;

import java.util.Arrays;
import java.util.TreeMap;

public class StraightHand {
    public boolean isNStraightHand(int[] hand, int W) 
    {
    	if(hand.length%W !=0 || W>hand.length || W*W != hand.length)
    		return false;
    	//Now we need to store the hand, in order with their occurences
    	//The best way to store that is by using a TreeMap
    	TreeMap<Integer, Integer> treemap= new TreeMap<Integer, Integer>();
    	
    	for(int i=0; i<hand.length; i++)
    	{
    		if(!treemap.containsKey(hand[i]))
    			treemap.put(hand[i],1);
    		else
    			treemap.replace(hand[i], treemap.get(hand[i])+1);
    	}
    	
    	//The first key in the treemap, will always have the minimum value
    	while(treemap.size() >0)
    	{
    		int curr=treemap.firstKey();
    		//We will check to see if we can make the consecutive hands or not
    		for(int i=curr; i<curr+W; i++)
    		{
    			if(!treemap.containsKey(i)) return false;
    			int count =treemap.get(i);
    			if(count==1) treemap.remove(i);
    			else treemap.replace(i, count-1);
    		}
    	}
    	return true;
    }
}
