package com.easy;

public class FlippingImage {
	public int[][] flipAndInvertImage(int[][] A) {
        if(A==null || A.length==0)
    		return A;
    	for(int i=0; i<A.length; i++)
    	{
    		reverseRow(A[i]);
    		invertRow(A[i]);
    	}
    	return A;
    }

	public void invertRow(int[] arr) 
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==0) arr[i]=1;
			else arr[i]=0;
		}
	}

	public void reverseRow(int[] arr)
	{
		int i=0, j=arr.length-1;
		while(i<j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j--;
			i++;
		}
	}
}
