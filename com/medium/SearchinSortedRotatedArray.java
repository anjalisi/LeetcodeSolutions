package com.medium;

public class SearchinSortedRotatedArray {
    public int findBestValue(int[] arr, int target) {
    	if(arr.length<=0 || arr==null)
    		return -1;
    	//Now we need to find the pivot point
    	//pivot would be the smallest number  in the array
    	int left=0, right=arr.length-1;
    	
    	//the loop will break when left has the value of the pivot
    	while(left<right)
    	{
    		int mid= left+(right-left)/2;
    		if(arr[mid] > arr[right])
    			left= mid+1;
    		else
    			right= mid;
    	}
    	
    	//left has the pivot value
    	int start= left;
    	//Now we have to perform normal binary search to find the element in the array
    	
    	left= 0; right=arr.length-1;
    	//Setting the boundaries for the Binary Search
    	if(target >= arr[start] && target <= arr[right])
    		left= start;
    	else
    		right= start;
    	
    	//Performing the binary search
    	while(left<=right)
    	{
    		int mid= left+(right-left)/2;
    		if(target== arr[mid])
    			return mid;
    		else if(target < arr[mid])
    			right= mid-1;
    		else
    			left= mid+1;
    	}
    	return -1;
    }
}
