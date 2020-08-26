package com.medium;

import java.util.Arrays;

public class KStrongest 
{
    public int[] getStrongest(int[] arr, int k) 
    {
    	  
        int i = 0, j = arr.length - 1, l = 0;
        if (j == -1) return new int[0];
        Arrays.sort(arr);
        int median = arr[j / 2];
        int[] res = new int[k];
        while (l < k){
            if (median - arr[i] > arr[j] - median)
                res[l++] = arr[i++];
            else
                res[l++] = arr[j--];
        }
        return res;
       }
}
