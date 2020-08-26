package com.easy;

public class FindJudge {
    public int findJudge(int N, int[][] trust)
    {
    	for(int i=0; i<trust.length-1; i++)
    	{
    		if(trust[i][1]!= trust[i+1][1])
    			return -1;
    	}
    	return trust[0][1];
    }
}
