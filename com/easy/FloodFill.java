package com.easy;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
    	if(image[sr][sc]==newColor) return image;
    	fill(image, newColor,image[sr][sc], sr,sc);
    	return image;
    }

	private void fill(int[][] image, int newColor, int color, int i, int j) 
	{
		if(i<0 || i>= image.length || j<0 || j>=image[0].length || image[i][j]!=color)
			return;
		image[i][j]=newColor;
		fill(image, newColor, color, i+1,j);
		fill(image, newColor, color, i-1,j);
		fill(image, newColor, color, i,j+1);
		fill(image, newColor, color, i,j-1);
	}
}
