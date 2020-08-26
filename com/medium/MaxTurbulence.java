package com.medium;

public class MaxTurbulence {
	public int maxTurbulenceSize(int[] A) 
	{
		if(A==null || A.length==0)
			return 0;
		int count=1, max=1, j=1;
		while(j<A.length)
		{
			if(j== A.length-1 && A[j]!=A[j-1] ||(A[j-1]>A[j] && A[j]<A[j+1]) 
					||(A[j-1]<A[j] && A[j]>A[j+1]))
			{
				count++;
				j++;
				max=Math.max(count, max);
			}
			else
			{
				count+= (A[j]!=A[j-1])?1:0;
				max=Math.max(count, max);
				count=1;
				j++;
			}
		}
		return max;
    }
}
