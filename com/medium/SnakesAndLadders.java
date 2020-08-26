package com.medium;

import java.util.LinkedList;
import java.util.Queue;

public class SnakesAndLadders {
    public int snakesAndLadders(int[][] board) 
    {
    	if(board==null ||board.length==0) return 0;
    	int n= board.length; 
    	boolean[] visited= new boolean[n*n+1];
    	
    	Queue<Integer> queue= new LinkedList<Integer>();
    	queue.offer(1);
    	
    	int moves=0;
    	int min= n*n;
    	
    	while(!queue.isEmpty())
    	{
    		int size= queue.size();
    		for(int i=0; i<size; i++)
    		{
    			int current= queue.poll();
    			//We have reached the end
    			if(current==n*n)
    				min= Math.min(min, moves);
    			//Now we will check for all the moves from 1-6
    			
    			for(int j=1; j<=6; j++)
    			{
    				int num = current+j;
    				if(num> n*n)	//Exceeds the limits
    					break;
    				if(!visited[num])
    				{
    					visited[num]=true;
    					//Finding the coords of the point
    					int row = n-(num-1)/n-1;
    					int col = (n-row)%2 == 0 ? n-(num-1) % n-1 : (num-1) %n;
    					//-1 means it has no snakes or ladders
    					if(board[row][col] == -1)
    						queue.offer(num);
    					else
    						queue.offer(board[row][col]);
    					
    				}
    			}
    		}
    		moves++;
    	}
    	return min== n*n ? -1:min;
    }
}
