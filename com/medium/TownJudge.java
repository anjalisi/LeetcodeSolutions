package com.medium;

public class TownJudge {
    public int findJudge(int N, int[][] trust) {
        //if someone trusts you, we will increment count
    	//else decrement 
    	int[] count= new int[N+1];
    	//Since everyone trusts judge, his count should be N-1
    	
    	for(int[] t:trust)
    	{
    		count[t[0]]--;
    		count[t[1]]++;
    	}
    	for(int i=1; i<=N; i++)
    		if(count[i]==N-1)
    			return i;
    	return -1;
    }	
}
