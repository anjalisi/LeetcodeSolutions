package com.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {
    public List<Integer> getRow(int rowIndex)
    {
    	List<Integer> res= new ArrayList<Integer>();
    	res.add(1);
    	
    	for(int i=1; i<rowIndex; i++)
    	{
    		for(int j=i-1; j>=0; j--)
    		{
				if(j>1)
    			res.set(j,res.get(j)+res.get(j-1));
    		}
    		res.add(1);
    	}
    	return res;
    }
}
