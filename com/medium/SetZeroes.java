package com.medium;

public class SetZeroes {
	public void setZeroes(int[][] matrix) {
	    
	    int r=matrix.length;
	    int c=matrix[0].length;
	     String[][] marked=new String[matrix.length][matrix[0].length];
	    for(int i=0;i<matrix.length;i++)
	    {
	        for(int j=0;j<matrix[0].length;j++)
	        {
	            if(matrix[i][j]==0 && marked[i][j]!="#")
	            {
	                convert(i,j,matrix,marked);
	            }
	        }
	    }
	    
	    for(int i=0;i<matrix.length;i++)
	    {
	        for(int j=0;j<matrix[0].length;j++)
	        {
	            if(marked[i][j]=="#")
	            {
	                matrix[i][j]=0;
	            }
	        }
	    }

	    
	}

	public void convert(int r,int c,int [][] matrix,String[][]marked)
	{
	  
	    int row=r;
	    int col=c;
	    
	    for(int i=0;i<matrix[0].length;i++)
	    {
	        
	        marked[row][i]="#";
	        if(matrix[row][i]==0)
	        {
	            marked[row][i]=null;
	            continue;
	        }
	        
		}
	   	for(int j=0;j<matrix.length;j++)
	    {
	       
	       marked[j][col]="#";
	       if(matrix[j][col]==0)
	       {
	           marked[j][col]=null;
	           continue;
	       }
	                
	    }
	    return;

	}
	
}
