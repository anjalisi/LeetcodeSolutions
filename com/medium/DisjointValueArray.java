package com.medium;

public class DisjointValueArray 
{
    public int partitionDisjoint(int[] A) 
    {
    	int leftMax=A[0];
    	int rightMax= Integer.MIN_VALUE;
    	int res=0;
    	for(int i=1; i<A.length; i++)
    	{
    		if(leftMax<=A[i])
    		{
    			if(rightMax<A[i])
    				rightMax=A[i];
    		}
    		else
    		{
    			if(leftMax<rightMax)
    			{
    				leftMax= rightMax;
    			}
    			rightMax= Integer.MIN_VALUE;
    			res=i;
    		}
    	}
    	return res+1;
    }
}
