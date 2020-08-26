package com.easy;

public class RangeAdditionII {
	public int maxCount(int m, int n, int[][] ops) 
	{
		if(ops.length == 0) return m*n;
        int row = ops[0][0], col = ops[0][1];
        for(int i = 1 ; i < ops.length ; i++)
        {
            row = Math.min(ops[i][0],row);
            col = Math.min(ops[i][1],col);
        }
        return row*col;
	}
}
