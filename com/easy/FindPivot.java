package com.easy;

public class FindPivot {
    public static int pivotIndex(int[] ar) {
    	int left[] = new int[ar.length];
	    int right[] = new int[ar.length];
	    
	    int s = 0;
	    
	    for(int i = 0; i < ar.length; i++){
	        
	        s += ar[i];
	        
	        left[i] = s;
	    }
	    s = 0;
	    for(int i = ar.length - 1; i >= 0; i--){
	        
	        s += ar[i];
	        
	        right[i] = s;
	    }
	    for(int i = 0; i < ar.length; i++){
	        if(left[i] - ar[i] == right[i] - ar[i])
	            return i;
	    }
	    return -1;
    }
    public static void main(String[] args) {
		int[] nums= {1,2,3};
		System.out.println(pivotIndex(nums));
	}
}
