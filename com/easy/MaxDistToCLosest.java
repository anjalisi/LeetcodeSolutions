package com.easy;

public class MaxDistToCLosest {
	public static int maxDistToClosest(int[] s)
	{
		 int max = -1;
	        int prev = -1;
	        for (int i = 0; i < s.length; i++) {
	            if (s[i] == 1) {
	                // for case of first found seat
	                if (max == -1) { 
	                    max = i; 
	                } else { // all other found seats
	                    max = Math.max(max, (i - prev) / 2);
	                }
	                prev = i;
	            }
	        }
	        // compare max already found distance with distance between last seat and end 
	        return Math.max(max, s.length - prev - 1);
    }
	public static void main(String[] args) {
		int[] arr= new int[] {1,0,0,0};
		
		System.out.println(maxDistToClosest(arr));
	}
}
