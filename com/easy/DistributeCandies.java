package com.easy;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
    public int distributeCandies(int[] candies)
    {
    	int limit = candies.length/2;
        Set<Integer> diffCandy = new HashSet<>();
        
        for(int candy : candies){
            if(diffCandy.size()<limit) diffCandy.add(candy);
            else break;
        }
        return diffCandy.size();
    }
}
