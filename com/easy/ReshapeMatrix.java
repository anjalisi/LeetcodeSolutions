package com.easy;

public class ReshapeMatrix
{
	public int[][] matrixReshape(int[][] nums, int r, int c) 
	{
		int rows=nums.length;
		int cols=nums[0].length;
		if(rows*cols!=r*c)
			return nums;
		int a=0,b=0;
		int[][] arr=new int[r][c];
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				arr[a][b]=nums[i][j];
				b++;
				if(b==c)
				{
					b=0;
					a++;
				}
			}
		}
		return arr;
    }
}
