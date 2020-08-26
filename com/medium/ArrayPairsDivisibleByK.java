package com.medium;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPairsDivisibleByK {
    public static boolean canArrange(int[] arr, int k) {
    	//Arrays.sort(arr);
    	ArrayList<Integer> res= new ArrayList<Integer>();
    	for(int i:arr)
    		res.add(i);
    	for(int i=0; i<arr.length; i++)
    	{
    		for(int j=arr.length-1; j>i ; j--)
    		{
    			if((arr[i]+arr[j])%k == 0)
        		{
        			res.set(i,00);
        			res.set(j,00);
        		}
    		}
    	}
    	for(int i=0; i<res.size(); i++)
    		if(res.get(i) != 00)
    			return false;
    	return true;
    	
    }
    public static void main(String[] args) {
		int[] arr= {9606,4830,4037,-1054,3308,6966,6528,3953,473,-388,9878,-3797,2598,-3283,5813,-6446,-3625,-107,-8756,-3053,-2131,6609,4192,7408,1115,7456,-5674,1219,-8548,540,-9630,-4858,-2453,-726,9902,6192,-7996,1459,-1980,4285,-2659,4156,-2303,-855};
			
		int k=10;
		System.out.println(canArrange(arr, k));
	}
}
