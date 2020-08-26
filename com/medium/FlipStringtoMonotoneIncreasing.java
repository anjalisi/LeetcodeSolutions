package com.medium;

public class FlipStringtoMonotoneIncreasing {
    public int minFlipsMonoIncr(String S) 
    {
    	int zeroOnRight=0;
    	int oneOnLeft=0;
    	int ans=0;
    	for(int i=0;i<S.length(); i++)
    		if(S.charAt(i)=='0')
    			zeroOnRight++;
    	ans=zeroOnRight;
    	for(int i=0; i<S.length(); i++)
    	{
    		if(S.charAt(i)=='0')
    			zeroOnRight--;
    		else 
    			oneOnLeft++;
    		ans=Math.min(ans, oneOnLeft+zeroOnRight);
    	}
    	return Math.min(ans, oneOnLeft);
    }
}
