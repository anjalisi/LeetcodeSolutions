package com.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestFibonacciSubseq 
{
    public int lenLongestFibSubseq(int[] A) {
    	Set<Integer> s=new HashSet<Integer>();
    	for(int i=0; i<A.length; i++)
    		s.add(A[i]);
    	int ans=0; 
    	for(int i=0; i<A.length; i++)
    	{
    		for(int j=i+1; j<A.length; j++)
    		{
    			int x= A[j];
    			int y= A[i]+A[j];
    			int len=2;
    			while(s.contains(y))
    			{
    				int temp=y;
    				y+=x;
    				x=temp;
    				ans= Math.max(ans, ++len);
    			}
    		}
    	}
    	return ans>=3 ? ans:0;
    }
}
