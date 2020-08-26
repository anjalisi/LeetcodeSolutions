package com.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Candies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    	int max= Arrays.stream(candies).max().getAsInt();
    	List<Boolean> l=new ArrayList<Boolean>();
    	for(int i=0; i<candies.length;i++)
    	{
    		if(candies[i]+extraCandies >=max)
    			l.add(true);
    		else
    			l.add(false);
    	}
    	return l;
    }
}
