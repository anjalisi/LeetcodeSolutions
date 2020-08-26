package com.medium;

public class Chunks {
    public static int maxChunksToSorted(int[] arr) 
    {
	    	int count = 0;
	    	int deadline = arr[0];
	    	for (int i = 0; i < arr.length; i++)
	    	{
		        if (arr[i] > deadline) {
		            deadline = arr[i];
		        }
		        if (i == deadline) {
		            count++;
		            deadline = 0;
		        }
		    }
		    
	    return count; 
    }
    public static void main(String[] args) {
		int arr[]= {1,0,2,3,4};
		System.out.println(maxChunksToSorted(arr));
	}
}
