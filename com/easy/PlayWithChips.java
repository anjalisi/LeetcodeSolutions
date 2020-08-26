package com.easy;

public class PlayWithChips {
	public int minCostToMoveChips(int[] chips) {
		int oddPos=0, evenPos=0;
		for(int i=0; i<chips.length; i++)
		{
			if(chips[i]%2!=0)
				oddPos++;
			else
				evenPos++;
		}
		return Math.min(oddPos, evenPos);
	}
}
