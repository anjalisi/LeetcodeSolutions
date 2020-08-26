package com.medium;

public class BuySellCoolDown {
    public int maxProfit(int[] prices) {
    	
    	/* MAIN IDEA
    	 * 
    	 * 1. We already have a stock on day i : stored in dp[i][1] (we will select max of the 2)
    	 * 	a. We already have it from previous day: dp[i-1][1]
    	 * 	b. We bought it today: dp[i-2][0]-prices[i] 
    	 * 			We do dp[i-2] because, one day is left for cooldown 
    	 * 2. We have no stock on day i : stored in dp[i][0] (we will select max of the 2)
    	 *  a. We sell it today : dp[i-1][1] + prices[i]
    	 * 	b. We did not have a stock earlier too : dp[i-1][0]
    	 * 
    	 * */
    	if(prices.length<=0) return 0;
    	//As you saw in the idea, we need to first compute the values for first 2 days
    	if(prices.length==2)
    		return prices[0]>prices[1] ? 0: prices[1]-prices[0];
    		
    	int[][] dp= new int[prices.length][2];
    	//Evaluating the values for the first 2 days
    	dp[0][0]=0;
    	dp[0][1]=-prices[0];	//If we buy on first day, we need to pay the prices
    	dp[1][0]=Math.max(dp[0][1]+prices[1], dp[0][0]);
    	dp[1][1] = Math.max(dp[0][0]-prices[1], dp[0][1]);
    	
    	
    	for(int i=0; i<prices.length; i++)
    	{
    		dp[i][0]=Math.max(dp[i-1][1]+prices[i], dp[i-1][0]);
        	dp[i][1] = Math.max(dp[i-2][0]-prices[i], dp[i-1][1]);
    	}
    	return dp[prices.length-1][0];
    }
}
