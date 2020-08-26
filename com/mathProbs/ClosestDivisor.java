package com.mathProbs;

public class ClosestDivisor {
    public int[] closestDivisors(int num) 
    {
    	int res[]= new int[2];
    	for(int i= (int) Math.floor(Math.sqrt(num+2)) ; i>=1 ; i--)
    	{
    		if( (num+1)%i ==0)
    		{
    			res[0]= (num+1)/i;
    			res[i]= i;
    			return res;
    		}
    		if( (num+1)%i ==0)
    		{
    			res[0]= (num+1)/i;
    			res[i]= i;
    			return res;
    		}
    	}
    	return res;
    }
}
