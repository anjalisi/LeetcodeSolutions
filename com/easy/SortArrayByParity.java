package com.easy;

public class SortArrayByParity {
	public int[] sortArrayByParity(int[] A) 
	{
		int l=0; 
		int r=A.length-1;
		while(l<=r)
		{
			while(l<A.length && A[l]%2==0)
			{
				l++;
			}
			while(r>=0 && A[r]%2!=0)
			{
				r--;
			}
			if(l<r)
			{
				int temp=A[l];
				A[l]=A[r];
				A[r]=temp;
			}
			
		}
		return A;
    }
}
