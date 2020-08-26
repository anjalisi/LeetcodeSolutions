package com.medium;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
    public List<Integer> partitionLabels(String S) {
    	if(S.length()<=0 || S==null)
    		return new ArrayList<Integer>();
    	List<Integer> res= new ArrayList<Integer>();
    	int max=0;
    	int start=0;	
    	for(int i=0; i<S.length(); i++)
    	{
    		max=Math.max(max, S.lastIndexOf(S.charAt(i)));
    		if(i==max)
    		{
    			res.add(i-start+1);
    			start=i+1;
    		}
    	}
    	return res;
    }
}
