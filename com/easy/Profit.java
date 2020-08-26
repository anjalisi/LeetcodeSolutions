package com.easy;

public class Profit {
    public int[] finalPrices(int[] prices) 
    {
    	
    	for (int i = 0; i < prices.length; i++) 
    	{
			int j = i + 1;
			for (; j < prices.length; j++) {
				if (prices[i] >= prices[j]) {
					break;
				}
			}
			if (j < prices.length) {
				prices[i] -= prices[j];
			}
		}
		
		return prices;
    }
}
