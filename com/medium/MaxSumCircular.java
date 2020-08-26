package com.medium;

public class MaxSumCircular 
{
	public int maxSubarraySumCircular(int[] A) 
	{
		int n=A.length;
		int max_kadane= kadane(A);
		int max_circular=0;
		for(int i=0; i<A.length; i++)
		{
			max_circular+=A[i];
			A[i]=-A[i];
		}
		max_circular+=kadane(A);
		return (max_circular>max_kadane)?max_circular:max_kadane;
    }

	private int kadane(int[] a) 
	{
		int max_here=0, max_end=0;
		for(int i=0; i<a.length; i++)
		{
			max_end+=a[i];
			if(max_end<0)
				max_end=0;
			if(max_end>max_here) 
				max_here=max_end;
		}
		return max_here;
	}
}
