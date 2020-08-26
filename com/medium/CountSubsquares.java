package com.medium;

public class CountSubsquares {
    public int countSquares(int[][] matrix)
    {
    	if(matrix==null ||  matrix.length==0)
    		return 0;
    	int ans=0;
    	int[][] dp=new int[matrix.length+1][matrix[0].length+1];
    	for(int i=1; i<=matrix.length; i++)
    	{
    		for(int j=1; j<=matrix[0].length; j++)
    		{
    			if(matrix[i-1][j-1]==1)
    			{
    				dp[i][j]=Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1]))+1;
    				ans+=dp[i][j];
    			}
    		}
    	}
    	return ans;
    }
}
