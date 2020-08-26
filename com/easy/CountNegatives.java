package com.easy;

public class CountNegatives 
{
	public int countNegatives(int[][] grid) {
		int count=0; 
		for(int i=0; i<grid.length; i++)
			count += countLess(grid[i]);
		return count;
	}

	private int countLess(int[] arr)
	{
		int ind= arr.length-1;
		int count=0;
		while(ind>=0 && arr[ind]<0)
		{
			count++;
			ind--;
		}
		return count;
	}
}
