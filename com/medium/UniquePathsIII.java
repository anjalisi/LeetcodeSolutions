package com.medium;

public class UniquePathsIII {
    public int uniquePathsIII(int[][] grid) {
        /*
        METHOD
        1. Count the total number of zeroes in the grid
        2. Find the coordinates of the starting index and store it.
        3. Call dfs in all 4 directions, and if the path has all zeroes covered, increment result.
        
        */
        
        int rows= grid.length;
        int cols= grid[0].length;
        int numZero=0, sx=0, sy=0;

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(grid[i][j]==1){
                    sx=i; sy=j;
                }
                else if(grid[i][j]==0)
                    numZero++;
            }
        }
        
        return dfs(grid, sx, sy, numZero);
    }

    private int dfs(int[][] grid, int sx, int sy, int numZero) {
        //Boundary checks
        if(sx<0 || sy<0 ||sx>=grid.length || sy>=grid[0].length || grid[sx][sy]==-1)
            return 0;
        //If the destination is reached
        if(grid[sx][sy]==2)
            return numZero==-1? 1:0;

        //Marking the cell
        grid[sx][sy]=-1;
        numZero--;
        int totalPath= dfs(grid, sx+1, sy, numZero)+
                        dfs(grid, sx-1, sy, numZero)+
                        dfs(grid, sx, sy+1, numZero)+
                        dfs(grid, sx, sy-1, numZero);
        //Backtracking
        grid[sx][sy]=0;
        numZero++;
        return totalPath;
    }
}
