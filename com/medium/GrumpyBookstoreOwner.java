package com.medium;

public class GrumpyBookstoreOwner {
    public int maxSatisfied(int[] customers, int[] grumpy, int X)
    {
    	int satisfy=0;
    	for(int i=0; i<customers.length; i++)
    		if(grumpy[i]==0)
    			satisfy+=customers[i];
    	
    	int currSum=0; 
    	int max=0;
    	int start=0;
    	for(int i=0; i<customers.length; i++)
    	{
    		if(grumpy[i]==1)
    			currSum+=customers[i];
    		if(i-start+1 >= X)
    		{
    			max=Math.max(currSum, max);
    			if(grumpy[start]==1)
    			{
    				currSum-=customers[start];
    			}
    			start++;
    		}
    	}
    	return satisfy+max;
    }
}
