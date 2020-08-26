package com.challenge;

import java.util.Arrays;

public class PrisonAfterNDays {
    public static int[] prisonAfterNDays(int[] cells, int N) {
    	N= N%14 == 0?14:N%14;
    	
    	int[] res= new int[cells.length];
    	while(N > 0)
    	{

    		Arrays.fill(res, 0);
    		for(int i=1; i<cells.length-1; i++)
    		{
    			if(cells[i-1]==cells[i+1])
    				res[i]=1;
    			else
    				res[i]=0;
    		}
    		N--;
    		cells=res.clone();
    	}
//    	for(int i=0; i<res.length; i++)
//    		System.out.print(res[i]+",");
    	return res;
    }
    public static void main(String[] args) {
		int[] cells= {0,1,0,1,1,0,0,1};
		System.out.println(prisonAfterNDays(cells, 7));
	}
}
