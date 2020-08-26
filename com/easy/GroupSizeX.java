package com.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupSizeX {
	   public boolean hasGroupsSizeX(int[] deck) {
	        if(deck == null || deck.length == 0)
	            return false;
	        
	        HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();
	        
	        for(int x : deck){
	            counts.put(x, 1 + counts.getOrDefault(x, 0));
	        }
	        
	        int gcd = counts.get(deck[0]);
	        
	        for(int key : counts.keySet()){
	            gcd = GCD(gcd, counts.get(key));
	        }
	        
	        return (gcd >= 2);   
	    }
	    
	    private int GCD(int x, int y){
	        if(x % y == 0)
	            return y;
	        else if(y % x == 0)
	            return x;
	        else if(x > y)
	            return GCD(y, x % y);
	        else
	            return GCD(x, y % x);
	    }}
