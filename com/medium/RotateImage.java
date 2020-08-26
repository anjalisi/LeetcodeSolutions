package com.medium;

public class RotateImage {
	public void rotate(int[][] matrix) 
	{
		/* MAIN IDEA
		 * 
		 * 1. Take the transpose of the matrix first
		 * 2. Flip the matrix horizontally
		 * */
		int n= matrix.length;
		for(int i=0; i<n; i++)
		{
			for(int j=i; j<n; j++)
			{
				//Swapping along the diagonal
				int temp = matrix[i][j];
				matrix[i][j]= matrix[j][i];
				 matrix[j][i]= temp; 
			}
		}
		//Now we will flip horizontally
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n/2 ;j++)
			{
				//We need to swap the first and the last elements
				int temp= matrix[i][j];
				 matrix[i][j]= matrix[i][n-j-1];
				 matrix[i][n-j-1]=temp;
			}
		}
	}
}
