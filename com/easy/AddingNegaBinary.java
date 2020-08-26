package com.easy;

import java.util.ArrayList;

public class AddingNegaBinary {
    public static int[] addNegabinary(int[] arr1, int[] arr2) 
    {
    	ArrayList<Integer> res= new ArrayList<Integer>();
    	
    	int i=arr1.length-1;
    	int j=arr2.length-1;
    	int carry=0;
    	while(i>=0 && j>=0)
    	{
    		if(arr1[i]+arr2[j]+carry>=2)
    		{
    			carry=1;
    			res.add(0);
    		}
    		else
    		{
    			res.add(arr1[i]+arr2[j]+carry);
    			carry=0;
    		}
    		i--; j--;
    	}
    	int[] result= new int[res.size()];
    	for(int k=0; k<res.size(); k++)
    	{
    		System.out.println(res.get(k));
    		result[k]=res.get(k);
    	}
    	return result;
    }
    public static void main(String[] args) {
		int[] arr1 = {1,1,1,1,1}, arr2 = {1,0,1};
		System.out.println(addNegabinary(arr1, arr2));
		String str="0110";
		
	}
}
