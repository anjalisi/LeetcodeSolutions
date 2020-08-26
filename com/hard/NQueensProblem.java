package com.hard;

import java.util.ArrayList;
import java.util.List;

public class NQueensProblem {
    public static List<List<Integer>> solveNQueens(int n) 
    {
    	List<List<Integer>> result= new ArrayList<List<Integer>>();
    	solveNQueens(result, n, 0, new ArrayList<Integer>());
    	return result;
    }

	private static void solveNQueens(List<List<Integer>> result, int n, int row, ArrayList<Integer> colPlacement)
	{
		if(row==n)
			result.add(new ArrayList<Integer>(colPlacement));
		else
		{
			for(int col=0; col<n; col++)
			{
				colPlacement.add(col);
				if(placementIsValid(colPlacement))
					solveNQueens(result, n, row+1, colPlacement);
				colPlacement.remove(colPlacement.size()-1);
			}
		}
	}

	private static boolean placementIsValid(ArrayList<Integer> colPlacement) 
	{
		int row= colPlacement.size()-1;
		for(int i=0; i<row; i++)
		{
			int diff= Math.abs(colPlacement.get(i)-colPlacement.get(row));
			if(diff==0 || diff==(row-i))
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int n=4;
		System.out.println(solveNQueens(n));
	}
}
