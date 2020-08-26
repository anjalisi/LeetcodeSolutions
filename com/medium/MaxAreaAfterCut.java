package com.medium;

import java.util.Arrays;

public class MaxAreaAfterCut 
{
	public static int maxArea(int h, int w, int[] hCuts, int[] vCuts) {
	    Arrays.sort(hCuts);
	    Arrays.sort(vCuts);
	    int max_h = Math.max(hCuts[0], h - hCuts[hCuts.length - 1]);
	    int max_v = Math.max(vCuts[0], w - vCuts[vCuts.length - 1]);  
	    for (int i = 0; i < hCuts.length - 1; ++i)
	        max_h = Math.max(max_h, hCuts[i + 1] - hCuts[i]);
	    for (int i = 0; i < vCuts.length - 1; ++i)
	        max_v = Math.max(max_v, vCuts[i + 1] - vCuts[i]);        
	    return (int)((long)max_h * max_v % 1000000007);        
    }
	public static void main(String[] args) {
		int arr[]=new int[] {3,1};
		int arr1[]=new int[] {1};
		System.out.println(maxArea(5,4,arr,arr1));
	}
}
