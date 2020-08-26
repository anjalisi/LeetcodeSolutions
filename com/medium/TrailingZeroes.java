package com.medium;

public class TrailingZeroes {
    public int trailingZeroes(int n) 
    {
    	int numOfFives=0;
    	while(n>=5)
    	{
    		numOfFives += Math.floor(n/5);
    		n= (int) Math.floor(n/5);
    	}
    	return numOfFives;
    }
}
