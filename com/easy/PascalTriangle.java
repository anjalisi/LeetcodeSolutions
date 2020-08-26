package com.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> res= new ArrayList<List<Integer>>();
    	
    	if(numRows==0) return res;
    	
    	List<Integer> arr= new ArrayList<Integer>();
    	arr.add(1);
    	res.add(arr);
    	
    	for(int i=1; i<numRows; i++)
    	{
    		//Grabbing the previous row
    		List<Integer> prevrow= res.get(i-1);
    		List<Integer> currRow= new ArrayList<Integer>();
    		
    		currRow.add(1);
    		for(int j=1; j<i ;j++)
    		{
    			currRow.add(prevrow.get(j-1)+prevrow.get(j));
    		}
    		currRow.add(1);
    		res.add(currRow);
    	}
    	return res;
    }
}
