package com.easy;

public class ArithmeticSlices {
    public int numberOfArithmeticSlices(int[] A)
    {
    	int res=0;
    	int[] dp= new int[A.length];
    	for(int i=2; i<A.length; i++)
    	{
    		if(A[i-2]-A[i-1]==A[i-1]-A[i])
    			dp[i]=dp[i-1]+1;
    		res+=dp[i];
    	}
    	return res;
    }
}
