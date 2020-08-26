package com.easy;

import java.util.ArrayList;

public class DuplicateZero {
    public void duplicateZeros(int[] arr) {
    	ArrayList<Integer> ar=new ArrayList<Integer>();
    	int count=0;
    	for(int i=0; i<arr.length; i++)
    	{
    		if(arr[i]!=0)
    		{
    			count++;
    			ar.add(arr[i]);
    		}
    		else
    		{
    			ar.add(arr[i]);
    			ar.add(arr[i]);
    		}
    	}
    	for(int i=0; i<arr.length; i++)
    	{
    		arr[i]=ar.get(i);
    	}
    }
}
