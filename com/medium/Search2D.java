package com.medium;

public class Search2D 
{
	public boolean searchMatrix(int[][] matrix, int target) 
	{	
		if(matrix==null || matrix.length==0 || matrix[0].length==0) 
            return false;
        int rows= matrix.length;
        int cols= matrix[0].length;
        int left=0,r=0,c=0, mid=0; 
        int last= rows*cols -1;
        
        while(left<=last)
        {
        	mid=left+(last-left)/2;
        	r=mid/cols;
        	c=mid%cols;
        	 if(matrix[r][c] == target)
                 return true;
             if(matrix[r][c] > target){
                 last = mid - 1;
             }else if(matrix[r][c]<target){
                 left = mid + 1;
             }
        }
        return false;
    }
}
