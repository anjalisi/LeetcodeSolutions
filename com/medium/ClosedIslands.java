package com.medium;

public class ClosedIslands {
    public int closedIsland(int[][] grid) {
        /*
        METHOD:
        1. We will not traverse the perimeter, as they can never be closed
        2. Every zero inside the perimeter, not connected to the perimeter zeroes is an island.
        3. Perform DFS in all 4 directions
        */
        if(grid==null|| grid.length==0) return 0;
        int islands=0;
        for(int i=1; i< grid.length-1; i++){
            for(int j=1; j<grid[i].length; j++){
                if(grid[i][j]==0){
                    if(countIslands(grid, i ,j))
                        islands++;
                }
                    
            }
        }
        return islands;
    }

    private boolean countIslands(int[][] grid, int i, int j) {
        //-1: visited node
        if(grid[i][j]==1 || grid[i][j]==-1) return true;
        if(i<=0 || j<=0 || j>= grid[i].length-1 || i>= grid.length-1) return false;

        //mark the node visited
        grid[i][j]=-1;
        boolean up= countIslands(grid, i+1 ,j);
        boolean down= countIslands(grid, i-1 ,j);
        boolean l= countIslands(grid, i ,j+1) ;
        boolean r= countIslands(grid, i ,j-1);
        return up && down && l && r;
    }

}
