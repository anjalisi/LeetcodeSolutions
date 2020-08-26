package com.easy;

public class SumOfEven {
	public int[] sumEvenAfterQueries(int[] A, int[][] queries) 
	{
		int[] res=new int[A.length];
		int total = 0;
		for(int i=0; i<A.length; i++)
		{
			if(A[i]%2==0)
				total+=A[i];
		}
		for(int i=0; i<queries.length; i++)
		{
			int index=queries[i][1];
			int val=queries[i][0];
			int prev=A[index];
			A[index]+=val;
			if(A[index]%2==0)
				total+=A[index];
			if(prev%2==0)
				total-=prev;
			res[i]=total;
		}
		return res;
    }
}
