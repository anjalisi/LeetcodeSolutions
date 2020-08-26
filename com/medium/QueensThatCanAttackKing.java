package com.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueensThatCanAttackKing {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) 
    {
    	List<List<Integer>> res= new ArrayList<List<Integer>>();
    	//This array will store all the possible positions of the queen
    	boolean[][] seen= new boolean[8][8]; 
    	for(int[] q:queens)
    		seen[q[0]][q[1]]=true;
    	
    	//Now we make a direction array
    	int[] direction= {-1,0,1};
    	
    	for(int dx:direction)
    	{
    		for(int dy:direction)
    		{
    			//These 2 loops ensure that all the possible directions are covered
    			if(dx==00 && dy==0) continue;
    			//Now, we will take the coords of the king and do sort of a BFS
    			
    			int x=king[0];
    			int y=king[1];
    			
    			while(x+dx >=0 && x+dx<=7 && y+dy >=0 && y+dy<=7)
    			{
    				x+=dx; y+=dy;
    				//Now we will check if the updated coordinates have the queen or not
    				if(seen[x][y])
    				{
    					res.add(Arrays.asList(x,y));
    					break;
    				}
    			}
    		}
    	}
    	return res;
    }
}
