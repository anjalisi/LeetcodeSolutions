package com.medium;

public class BestTimeTOSellandBuyStock 
{
    public int maxProfit(int[] prices, int fee) 
    {
    	if(prices.length <=1)
    		return 0;
    	int dp_zero=0;				//did not buy anything
    	int dp_one=-prices[0]-fee;	//bought stock that day
    	
    	for(int i=1; i<prices.length; i++)
    	{
    		dp_zero= Math.max(dp_zero,dp_one+prices[i]);
    		dp_one= Math.max(dp_one,dp_zero-prices[i]-fee);
    	}
    	return dp_zero;
    }
}
