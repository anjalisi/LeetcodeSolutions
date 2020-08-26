package com.medium;

public class Uniquepaths {
public int uniquePaths(int m, int n) {
//        int[] dp=new int[n];
//        dp[0]=1;
//        for(int i=0; i<m; i++)
//        	for(int j=1; j<n; j++)
//        		dp[j] += dp[j-1];
//        return dp[n-1];
	
		int[][] dp= new int[m][n];
		for(int i=0; i<dp.length; i++)
			dp[i][0]=1;
		for(int i=0; i<dp[0].length; i++)
			dp[0][i]=1;
		
		for(int i=1; i<dp.length; i++)
		{
			for(int j=1;j<dp[0].length ;j++)
			{
				dp[i][j]= dp[i-1][j]+dp[i][j-1];
			}
		}
		return dp[m-1][n-1];
	}
}
